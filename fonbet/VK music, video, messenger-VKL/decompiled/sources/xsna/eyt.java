package xsna;

import androidx.room.l;
import com.vk.gif.data.local.GifDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: GifDatabase_Impl.kt */
/* loaded from: classes2.dex */
public final class eyt extends androidx.room.l {
    public final /* synthetic */ GifDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyt(GifDatabase_Impl gifDatabase_Impl) {
        super(2, "d84800a42194657b2f6a560e0cb15132", "b50a902991c6aee5a9798471f78aa9a1");
        this.d = gifDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `recent_gif` (`id` TEXT NOT NULL, `image` TEXT NOT NULL, `preview` TEXT, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd84800a42194657b2f6a560e0cb15132')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `recent_gif`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new nxn0.a(1, "id", "TEXT", null, true, 1));
        linkedHashMap.put("image", new nxn0.a(0, "image", "TEXT", null, true, 1));
        nxn0 nxn0Var = new nxn0("recent_gif", linkedHashMap, b690.a(linkedHashMap, "preview", new nxn0.a(0, "preview", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "recent_gif");
        return !nxn0Var.equals(a) ? new l.a(false, t3j0.a("recent_gif(com.vk.gif.data.local.RecentGifEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
