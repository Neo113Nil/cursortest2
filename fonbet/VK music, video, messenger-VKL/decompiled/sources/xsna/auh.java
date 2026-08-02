package xsna;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import java.util.HashSet;

/* compiled from: CommunityProfileStatusBarViewDelegate.kt */
/* loaded from: classes5.dex */
public final class auh {
    public final FragmentImpl a;
    public final View b;

    public auh(FragmentImpl fragmentImpl, View view) {
        this.a = fragmentImpl;
        this.b = view;
    }

    public final void a(float f, boolean z) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Window window3;
        View decorView3;
        Window window4;
        View decorView4;
        this.b.setAlpha(f);
        FragmentImpl fragmentImpl = this.a;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(mo2getContext)) {
                return;
            }
            boolean M = dhr0.M();
            boolean z2 = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z && M) {
                FragmentActivity activity = fragmentImpl.getActivity();
                if (activity != null) {
                    p90.b(activity, activity.getColor(R.color.transparent), false);
                }
                FragmentActivity activity2 = fragmentImpl.getActivity();
                if (activity2 == null || (window4 = activity2.getWindow()) == null || (decorView4 = window4.getDecorView()) == null) {
                    return;
                }
                awt0.e(8192, decorView4);
                return;
            }
            if (z && !M) {
                FragmentActivity activity3 = fragmentImpl.getActivity();
                if (activity3 != null) {
                    p90.b(activity3, activity3.getColor(R.color.transparent), false);
                }
                FragmentActivity activity4 = fragmentImpl.getActivity();
                if (activity4 == null || (window3 = activity4.getWindow()) == null || (decorView3 = window3.getDecorView()) == null) {
                    return;
                }
                awt0.c(8192, decorView3);
                return;
            }
            if (M || z2) {
                FragmentActivity activity5 = fragmentImpl.getActivity();
                if (activity5 != null) {
                    p90.b(activity5, activity5.getColor(R.color.transparent), false);
                }
                FragmentActivity activity6 = fragmentImpl.getActivity();
                if (activity6 == null || (window = activity6.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                    return;
                }
                awt0.e(8192, decorView);
                return;
            }
            FragmentActivity activity7 = fragmentImpl.getActivity();
            if (activity7 != null) {
                p90.b(activity7, activity7.getColor(R.color.transparent), false);
            }
            FragmentActivity activity8 = fragmentImpl.getActivity();
            if (activity8 == null || (window2 = activity8.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
                return;
            }
            awt0.c(8192, decorView2);
        }
    }
}
