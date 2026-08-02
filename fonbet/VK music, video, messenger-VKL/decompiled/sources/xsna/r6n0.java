package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SuggestsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class r6n0 implements q6n0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: SuggestsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            dxm dxmVar = (dxm) obj;
            Gson gson = psj.a;
            List<String> list = dxmVar.a;
            Gson gson2 = psj.a;
            qyg0Var.D3(1, gson2.toJson(list));
            qyg0Var.D3(2, gson2.toJson(dxmVar.b));
            qyg0Var.bindLong(3, dxmVar.c ? 1L : 0L);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `stickers_suggests` (`words`,`stickers`,`is_special`) VALUES (?,?,?)";
        }
    }

    public r6n0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.q6n0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new q7a0(6, this, arrayList));
    }

    @Override // xsna.q6n0
    public final void b() {
        u370.f(this.a, false, true, new kl60(18));
    }

    @Override // xsna.q6n0
    public final List<dxm> c() {
        return (List) u370.f(this.a, true, false, new x620(26));
    }
}
