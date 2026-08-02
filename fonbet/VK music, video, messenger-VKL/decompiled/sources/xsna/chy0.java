package xsna;

import android.view.ViewGroup;
import com.my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import xsna.izy0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class chy0 extends izy0.a {
    public final /* synthetic */ dhy0 a;

    public chy0(dhy0 dhy0Var) {
        this.a = dhy0Var;
    }

    @Override // xsna.izy0.a
    public final void b(boolean z) {
        dhy0 dhy0Var = this.a;
        ubz0 ubz0Var = dhy0Var.t;
        if (ubz0Var == null || ubz0Var.g() == null) {
            dhy0Var.g();
        } else if (dhy0Var.l == 1) {
            dhy0Var.e(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @Override // xsna.izy0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        cjy0 f;
        int[] visibleCardNumbers;
        zu50.c cVar;
        dhy0 dhy0Var = this.a;
        ubz0 ubz0Var = dhy0Var.t;
        ViewGroup g = ubz0Var != null ? ubz0Var.g() : null;
        if (g == null) {
            return;
        }
        c9z0 c9z0Var = dhy0Var.i.b;
        zu50 zu50Var = c9z0Var.a;
        thz0 thz0Var = c9z0Var.h;
        if (thz0Var != null) {
            thz0Var.h();
        }
        if (c9z0Var.l) {
            return;
        }
        c9z0Var.l = true;
        dhy0 dhy0Var2 = c9z0Var.f;
        ubz0 ubz0Var2 = dhy0Var2.t;
        if (ubz0Var2 != null) {
            int i = dhy0Var2.l;
            if (i == 2) {
                WeakReference weakReference = ubz0Var2.g;
                if (weakReference != null) {
                    f = (cjy0) weakReference.get();
                    if (f != null) {
                        visibleCardNumbers = f.getVisibleCardNumbers();
                        if (visibleCardNumbers != null) {
                            c9z0Var.e(visibleCardNumbers, g.getContext());
                        }
                        cVar = zu50Var.i;
                        qjk0.a(new StringBuilder("NativeAdEngine: Ad shown, banner id = "), c9z0Var.d.F, null);
                        if (cVar == null) {
                            cVar.b(zu50Var);
                            return;
                        }
                        return;
                    }
                }
                f = null;
                if (f != null) {
                }
            } else {
                if (i == 3) {
                    MediaAdView e = ubz0Var2.e();
                    if (e != null) {
                        f = dhy0Var2.f(e);
                        if (f != null) {
                        }
                    }
                }
                f = null;
                if (f != null) {
                }
            }
        }
        visibleCardNumbers = null;
        if (visibleCardNumbers != null) {
        }
        cVar = zu50Var.i;
        qjk0.a(new StringBuilder("NativeAdEngine: Ad shown, banner id = "), c9z0Var.d.F, null);
        if (cVar == null) {
        }
    }
}
