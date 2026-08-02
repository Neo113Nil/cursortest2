package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;

/* compiled from: VmojiPromoInSuggestsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class jaw0 implements iaw0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: VmojiPromoInSuggestsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            kaw0 kaw0Var = (kaw0) obj;
            Gson gson = psj.a;
            qyg0Var.D3(1, psj.a.toJson(kaw0Var.a));
            qyg0Var.D3(2, psj.h(kaw0Var.b));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `vmoji_promo_in_suggests` (`vmoji_promo_dictionary`,`vmoji_promo_stickers`) VALUES (?,?)";
        }
    }

    public jaw0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.iaw0
    public final void a(kaw0 kaw0Var) {
        u370.f(this.a, false, true, new l1k0(10, this, kaw0Var));
    }

    @Override // xsna.iaw0
    public final void b() {
        u370.f(this.a, false, true, new zzs0(4));
    }

    @Override // xsna.iaw0
    public final kaw0 c() {
        return (kaw0) u370.f(this.a, true, false, new cd10(29));
    }
}
