package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import java.util.concurrent.TimeUnit;
import xsna.r7v;

/* compiled from: ContentInfoBottomNavigationHintDelegate.kt */
/* loaded from: classes.dex */
public final class pgj implements r7v.a {
    public static final long b = TimeUnit.DAYS.toMillis(90);
    public long a;

    @Override // xsna.r7v.a
    public final void a(final NavigationDelegateActivity navigationDelegateActivity, final FragmentImpl fragmentImpl, td5 td5Var) {
        if (SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h()) {
            BuildInfo.Client client = BuildInfo.a;
            VKApplication vKApplication = com.vk.core.apps.a.a;
            final View view = (View) td5Var.invoke(Integer.valueOf(R.id.tab_discover));
            if (view == null) {
                return;
            }
            long j = this.a;
            if (j < 0) {
                asu0.a.getClass();
                asu0.h().submit(new Runnable() { // from class: xsna.ngj
                    @Override // java.lang.Runnable
                    public final void run() {
                        pgj pgjVar = this;
                        Activity activity = navigationDelegateActivity;
                        FragmentImpl fragmentImpl2 = fragmentImpl;
                        View view2 = view;
                        synchronized (pgjVar) {
                            long m = Preference.m(0L, "content_info_hint", "content_info_hint_show_time");
                            pgjVar.a = m;
                            if (m + pgj.b < System.currentTimeMillis()) {
                                view2.post(new ogj(activity, view2, fragmentImpl2, pgjVar));
                            }
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                });
            } else if (j + b < System.currentTimeMillis()) {
                view.post(new ogj(navigationDelegateActivity, view, fragmentImpl, this));
            }
        }
    }

    @Override // xsna.r7v.a
    public final boolean b(FragmentImpl fragmentImpl) {
        return SakFeatures.Type.CORE_CONTENT_INFO_BOTTOM_SHEET.h() && (fragmentImpl != null && !(fragmentImpl instanceof ies)) && (((this.a + b) > System.currentTimeMillis() ? 1 : ((this.a + b) == System.currentTimeMillis() ? 0 : -1)) < 0);
    }
}
