package xsna;

import androidx.room.l;
import com.ironsource.X3;
import com.vk.vmoji.storage.impl.database.VmojiStorageDatabase_Impl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: VmojiStorageDatabase_Impl.kt */
/* loaded from: classes7.dex */
public final class ibw0 extends androidx.room.l {
    public final /* synthetic */ VmojiStorageDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibw0(VmojiStorageDatabase_Impl vmojiStorageDatabase_Impl) {
        super(1, "8ba9f739f3f0f36f42023c7530e33e94", "2f0d2209257a9ab7b0fa145b4d1d8199");
        this.d = vmojiStorageDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `user_vmoji_files` (`user` INTEGER NOT NULL, `file` TEXT NOT NULL, `last_access` INTEGER NOT NULL, PRIMARY KEY(`user`))");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_user_vmoji_files_user` ON `user_vmoji_files` (`user`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8ba9f739f3f0f36f42023c7530e33e94')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `user_vmoji_files`");
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
        linkedHashMap.put("user", new nxn0.a(1, "user", "INTEGER", null, true, 1));
        linkedHashMap.put(X3.i.b, new nxn0.a(0, X3.i.b, "TEXT", null, true, 1));
        LinkedHashSet a = b690.a(linkedHashMap, "last_access", new nxn0.a(0, "last_access", "INTEGER", null, true, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new nxn0.d("index_user_vmoji_files_user", Collections.singletonList("user"), Collections.singletonList("ASC"), true));
        nxn0 nxn0Var = new nxn0("user_vmoji_files", linkedHashMap, a, linkedHashSet);
        nxn0 a2 = nxn0.b.a(hyg0Var, "user_vmoji_files");
        return !nxn0Var.equals(a2) ? new l.a(false, t3j0.a("user_vmoji_files(com.vk.vmoji.storage.impl.database.VmojiEntityStorage).\n Expected:\n", nxn0Var, "\n Found:\n", a2)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
