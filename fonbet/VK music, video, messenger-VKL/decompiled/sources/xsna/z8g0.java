package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;

/* compiled from: WorkDatabaseMigrations.kt */
/* loaded from: classes.dex */
public final class z8g0 extends hm20 {
    public final Context c;

    public z8g0(Context context, int i, int i2) {
        super(i, i2);
        this.c = context;
    }

    @Override // xsna.hm20
    public final void b(sin0 sin0Var) {
        if (this.b >= 10) {
            sin0Var.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            Preference.h(this.c, 0, "androidx.work.util.preferences").edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
