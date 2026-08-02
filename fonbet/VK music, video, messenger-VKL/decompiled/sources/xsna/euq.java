package xsna;

import androidx.room.l;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.toggle.internal.storage.database.FeatureDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: FeatureDatabase_Impl.kt */
/* loaded from: classes11.dex */
public final class euq extends androidx.room.l {
    public final /* synthetic */ FeatureDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euq(FeatureDatabase_Impl featureDatabase_Impl) {
        super(2, "d802ed725af3bd5fb4b1e0bce262a2ac", "32afc2c9906a3f09c72f6b6c91a9b79d");
        this.d = featureDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `meta` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `value` TEXT NOT NULL, `storage_name` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_meta_name_storage_name` ON `meta` (`name`, `storage_name`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `app_values` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `value` TEXT NOT NULL, `storage_name` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_app_values_name_storage_name` ON `app_values` (`name`, `storage_name`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `user_values` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `value` TEXT NOT NULL, `storage_name` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_user_values_name_storage_name` ON `user_values` (`name`, `storage_name`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd802ed725af3bd5fb4b1e0bce262a2ac')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `meta`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `app_values`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `user_values`");
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
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("name", new nxn0.a(0, "name", "TEXT", null, true, 1));
        linkedHashMap.put("value", new nxn0.a(0, "value", "TEXT", null, true, 1));
        LinkedHashSet a = b690.a(linkedHashMap, "storage_name", new nxn0.a(0, "storage_name", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new nxn0.d("index_meta_name_storage_name", e43.l("name", "storage_name"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var = new nxn0(MetaBox.TYPE, linkedHashMap, a, linkedHashSet);
        nxn0 a2 = nxn0.b.a(hyg0Var, MetaBox.TYPE);
        if (!nxn0Var.equals(a2)) {
            return new l.a(false, t3j0.a("meta(com.vk.toggle.internal.storage.database.toggle.meta.MetaToggleEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a2));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap2.put("name", new nxn0.a(0, "name", "TEXT", null, true, 1));
        linkedHashMap2.put("value", new nxn0.a(0, "value", "TEXT", null, true, 1));
        LinkedHashSet a3 = b690.a(linkedHashMap2, "storage_name", new nxn0.a(0, "storage_name", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new nxn0.d("index_app_values_name_storage_name", e43.l("name", "storage_name"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var2 = new nxn0("app_values", linkedHashMap2, a3, linkedHashSet2);
        nxn0 a4 = nxn0.b.a(hyg0Var, "app_values");
        if (!nxn0Var2.equals(a4)) {
            return new l.a(false, t3j0.a("app_values(com.vk.toggle.internal.storage.database.toggle.app.AppToggleValueEntity).\n Expected:\n", nxn0Var2, "\n Found:\n", a4));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap3.put("name", new nxn0.a(0, "name", "TEXT", null, true, 1));
        linkedHashMap3.put("value", new nxn0.a(0, "value", "TEXT", null, true, 1));
        LinkedHashSet a5 = b690.a(linkedHashMap3, "storage_name", new nxn0.a(0, "storage_name", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new nxn0.d("index_user_values_name_storage_name", e43.l("name", "storage_name"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var3 = new nxn0("user_values", linkedHashMap3, a5, linkedHashSet3);
        nxn0 a6 = nxn0.b.a(hyg0Var, "user_values");
        return !nxn0Var3.equals(a6) ? new l.a(false, t3j0.a("user_values(com.vk.toggle.internal.storage.database.toggle.user.UserToggleValueEntity).\n Expected:\n", nxn0Var3, "\n Found:\n", a6)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
