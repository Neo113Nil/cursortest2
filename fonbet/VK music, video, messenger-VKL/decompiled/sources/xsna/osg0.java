package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.analytics.MaxMessengerAnalytics;

/* compiled from: RustoreSeamlessInstallService.kt */
/* loaded from: classes15.dex */
public final class osg0 {
    public final a66 a;
    public final MaxMessengerAnalytics b;
    public nsg0 c;
    public FragmentActivity d;

    public osg0(a66 a66Var, MaxMessengerAnalytics maxMessengerAnalytics) {
        this.a = a66Var;
        this.b = maxMessengerAnalytics;
    }

    public final void a() {
        FragmentActivity fragmentActivity;
        nsg0 nsg0Var = this.c;
        if (nsg0Var != null && (fragmentActivity = this.d) != null) {
            fragmentActivity.unbindService(nsg0Var);
        }
        this.c = null;
    }
}
