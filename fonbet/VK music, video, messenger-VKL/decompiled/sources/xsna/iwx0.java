package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class iwx0 extends hm20 {
    public final Context c;

    public iwx0(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        sin0Var.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.c;
        SharedPreferences h = Preference.h(context, 0, "androidx.work.util.preferences");
        if (h.contains("reschedule_needed") || h.contains("last_cancel_all_time_ms")) {
            long j = h.getLong("last_cancel_all_time_ms", 0L);
            long j2 = h.getBoolean("reschedule_needed", false) ? 1L : 0L;
            sin0Var.beginTransaction();
            try {
                sin0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                sin0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                h.edit().clear().apply();
                sin0Var.setTransactionSuccessful();
            } finally {
            }
        }
        SharedPreferences h2 = Preference.h(context, 0, "androidx.work.util.id");
        if (h2.contains("next_job_scheduler_id") || h2.contains("next_job_scheduler_id")) {
            int i = h2.getInt("next_job_scheduler_id", 0);
            int i2 = h2.getInt("next_alarm_manager_id", 0);
            sin0Var.beginTransaction();
            try {
                sin0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                sin0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                h2.edit().clear().apply();
                sin0Var.setTransactionSuccessful();
            } finally {
            }
        }
    }
}
