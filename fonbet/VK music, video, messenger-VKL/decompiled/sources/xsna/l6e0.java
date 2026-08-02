package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PromotedStickersDao_Impl.kt */
/* loaded from: classes5.dex */
public final class l6e0 implements i6e0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: PromotedStickersDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            h6e0 h6e0Var = (h6e0) obj;
            qyg0Var.bindLong(1, h6e0Var.a);
            Gson gson = psj.a;
            qyg0Var.D3(2, psj.a.toJson(en00.j(h6e0Var.b)));
            qyg0Var.bindLong(3, h6e0Var.c);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `promoted_stickers` (`id`,`sticker`,`lastUsedTime`) VALUES (?,?,?)";
        }
    }

    public l6e0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.i6e0
    public final List<StickerItem> a(List<Integer> list) {
        StringBuilder e = fw3.e("SELECT sticker FROM promoted_stickers WHERE id IN (");
        e370.c(list.size(), e);
        e.append(") LIMIT 0,1000");
        return (List) u370.f(this.a, true, false, new ut6(26, e.toString(), list));
    }

    @Override // xsna.i6e0
    public final void b(List<Integer> list) {
        StringBuilder e = fw3.e("DELETE FROM promoted_stickers WHERE id IN (");
        e370.c(list.size(), e);
        e.append(")");
        u370.f(this.a, false, true, new np5(20, e.toString(), list));
    }

    @Override // xsna.i6e0
    public final void c(ArrayList arrayList) {
        u370.f(this.a, false, true, new g84(26, this, arrayList));
    }

    @Override // xsna.i6e0
    public final int count() {
        return ((Number) u370.f(this.a, true, false, new gky(21))).intValue();
    }

    @Override // xsna.i6e0
    public final List<Integer> d(final int i) {
        return (List) u370.f(this.a, true, false, new izs() { // from class: xsna.k6e0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i2 = i;
                qyg0 V0 = ((hyg0) obj).V0("SELECT id FROM promoted_stickers ORDER BY lastUsedTime ASC LIMIT ?");
                try {
                    V0.bindLong(1, i2);
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        arrayList.add(Integer.valueOf((int) V0.getLong(0)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            }
        });
    }

    @Override // xsna.i6e0
    public final void e(long j, List<Integer> list) {
        StringBuilder e = fw3.e("UPDATE promoted_stickers SET lastUsedTime = ? WHERE id IN (");
        e370.c(list.size(), e);
        e.append(")");
        u370.f(this.a, false, true, new lkx(e.toString(), j, list));
    }

    @Override // xsna.i6e0
    public final List<Integer> getIds() {
        return (List) u370.f(this.a, true, false, new j6e0(0));
    }
}
