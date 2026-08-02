package xsna;

import android.content.res.Resources;
import com.vk.core.ui.themes.ThemableActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CompatAppThemeApplier.kt */
/* loaded from: classes.dex */
public final class f7i {
    public final ThemableActivity a;
    public Integer c;
    public boolean e;
    public final ArrayList b = new ArrayList();
    public boolean d = true;

    public f7i(ThemableActivity themableActivity) {
        this.a = themableActivity;
    }

    public final void a() {
        if (!this.d) {
            Integer num = this.c;
            int i = dhr0.C().c;
            if (num != null && num.intValue() == i) {
                return;
            }
        }
        this.e = true;
        boolean a = gz80.a(34);
        ThemableActivity themableActivity = this.a;
        if (a) {
            themableActivity.setTheme((Resources.Theme) null);
            themableActivity.setTheme(-1);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                themableActivity.setTheme(((Number) it.next()).intValue());
            }
        }
        themableActivity.setTheme(dhr0.C().c);
        this.c = Integer.valueOf(dhr0.C().c);
        this.d = false;
        this.e = false;
    }
}
