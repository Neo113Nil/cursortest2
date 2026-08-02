package xsna;

import com.coremedia.iso.boxes.MetaBox;

/* compiled from: FeatureDatabase.kt */
/* loaded from: classes11.dex */
public final class buq {
    public static final a a = new a(1, 2);

    /* compiled from: FeatureDatabase.kt */
    public static final class a extends hm20 {
        public static void c(sin0 sin0Var, String str) {
            sin0Var.execSQL("DROP TABLE IF EXISTS " + str + "_old");
            sin0Var.execSQL(h5s.d(new StringBuilder("ALTER TABLE `"), str, "` RENAME TO ", str, "_old "));
            sin0Var.execSQL("CREATE TABLE IF NOT EXISTS `" + str + "` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `value` TEXT NOT NULL, `storage_name` TEXT NOT NULL)");
            sin0Var.execSQL(ss9.a("CREATE UNIQUE INDEX IF NOT EXISTS `index_", str, "_name_storage_name` ON `", str, "` (`name`, `storage_name`)"));
            sin0Var.execSQL("INSERT OR IGNORE INTO `" + str + "` SELECT * FROM " + str + "_old");
            StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ");
            sb.append(str);
            sb.append("_old");
            sin0Var.execSQL(sb.toString());
        }

        @Override // xsna.hm20
        public final void b(sin0 sin0Var) {
            c(sin0Var, MetaBox.TYPE);
            c(sin0Var, "app_values");
            c(sin0Var, "user_values");
        }
    }
}
