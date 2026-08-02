package xsna;

import androidx.appcompat.app.AppCompatActivity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.n6q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g6q0 implements ny20 {
    @Override // xsna.ny20
    public final void a(nhp0 nhp0Var, AppCompatActivity appCompatActivity, n6q0.a aVar) {
        LinkedHashSet a = ol40.a();
        if (a == null || !a.isEmpty()) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                if (com.vk.stat.scheme.t0.a((MobileOfficialAppsCoreNavStat$EventScreen) it.next()).equals(nhp0Var != null ? nhp0Var.a() : null)) {
                    aVar.e(appCompatActivity.getString(R.string.music_unstable_network_alert_title));
                    int i = 11;
                    aVar.c(appCompatActivity.getString(R.string.music_unstable_network_primary_button), new wrl0(appCompatActivity, i));
                    aVar.d(appCompatActivity.getString(R.string.music_unstable_network_secondary_button), new pvh0(appCompatActivity, i));
                    Set b = ol40.b();
                    if ((b instanceof Collection) && b.isEmpty()) {
                        return;
                    }
                    Iterator it2 = b.iterator();
                    while (it2.hasNext()) {
                        if (com.vk.stat.scheme.t0.a((MobileOfficialAppsCoreNavStat$EventScreen) it2.next()).equals(nhp0Var != null ? nhp0Var.a() : null)) {
                            aVar.b();
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }
}
