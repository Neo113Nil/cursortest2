package xsna;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FrameLayoutWithTouchInterceptor;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.libvideo.autoplay.b;
import com.vk.navigation.NavigationDelegateActivity;
import xsna.hfr;
import xsna.qy90;

/* compiled from: NavigationDelegateBottom.kt */
/* loaded from: classes.dex */
public final class px50 extends qy90.a {
    public boolean a;
    public final float b = 1.4f;
    public final /* synthetic */ nx50<AppCompatActivity> c;
    public final /* synthetic */ NavigationDelegateActivity d;

    public px50(NavigationDelegateActivity navigationDelegateActivity, nx50 nx50Var) {
        this.c = nx50Var;
        this.d = navigationDelegateActivity;
    }

    @Override // xsna.qy90.a, com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
    public final void a(View view, float f) {
        nx50<AppCompatActivity> nx50Var = this.c;
        float f2 = nx50Var.s * f * this.b;
        View view2 = nx50Var.y;
        if (view2 != null) {
            if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f2 = 0.0f;
            }
            view2.setY(f2);
        }
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor = nx50Var.w;
        if (frameLayoutWithTouchInterceptor != null) {
            frameLayoutWithTouchInterceptor.setDisableTouch(!nx50Var.o0.k);
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.coordinatorlayout.widget.CoordinatorLayout, xsna.pel0] */
    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior.b
    public final void b(int i, View view) {
        yg5 a;
        yg5 a2;
        yg5 a3;
        View view2;
        nx50<AppCompatActivity> nx50Var = this.c;
        hfl0 hfl0Var = nx50Var.o0;
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor = nx50Var.w;
        if (frameLayoutWithTouchInterceptor != null) {
            bwt0.p0(frameLayoutWithTouchInterceptor, (i == 3 || !nx50Var.K || nx50Var.M) ? false : true);
        }
        nx50Var.r0();
        r6m.a.getClass();
        if (r6m.l()) {
            if (i == 3) {
                c(4);
                ?? r7 = hfl0Var.c;
                if (r7 != 0 && (view2 = r7.getView()) != null) {
                    view2.sendAccessibilityEvent(8);
                }
            } else if (i == 4 || i == 5) {
                c(0);
                FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = nx50Var.u0;
                if (fitSystemWindowsFrameLayout != null) {
                    fitSystemWindowsFrameLayout.sendAccessibilityEvent(8);
                }
            }
        }
        if (i == 3) {
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            xh5 d = b.C1208b.a().d();
            if (d != null && (a = d.a()) != null && a.isPlaying()) {
                this.a = true;
                a.pause();
            }
            if (hfl0Var.l) {
                dhr0.u0(this.d.getWindow(), NavigationBarStyle.DARK);
            }
        } else if (i == 4) {
            nx50Var.a1(nx50Var.w0(), null);
            nx50Var.U0(nx50Var.w0());
            bpn0 bpn0Var2 = com.vk.libvideo.autoplay.b.B;
            xh5 d2 = b.C1208b.a().d();
            if (d2 != null && (a2 = d2.a()) != null && this.a) {
                this.a = false;
                a2.play();
            }
            if (hfl0Var.l) {
                nx50Var.c1(nx50Var.u());
            }
        } else {
            if (i != 5) {
                return;
            }
            bpn0 bpn0Var3 = com.vk.libvideo.autoplay.b.B;
            xh5 d3 = b.C1208b.a().d();
            if (d3 != null && (a3 = d3.a()) != null && this.a) {
                this.a = false;
                a3.play();
            }
            if (hfl0Var.l) {
                nx50Var.c1(nx50Var.u());
            }
        }
        FrameLayoutWithTouchInterceptor frameLayoutWithTouchInterceptor2 = nx50Var.w;
        if (frameLayoutWithTouchInterceptor2 != null) {
            frameLayoutWithTouchInterceptor2.setDisableTouch(false);
        }
        hfl0Var.k = false;
    }

    public final void c(int i) {
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = this.c.u0;
        if (fitSystemWindowsFrameLayout != null) {
            hfr.a aVar = new hfr.a(rli0.l(mxt0.b(fitSystemWindowsFrameLayout), new ulz(10)));
            while (aVar.hasNext()) {
                ((View) aVar.next()).setImportantForAccessibility(i);
            }
        }
    }
}
