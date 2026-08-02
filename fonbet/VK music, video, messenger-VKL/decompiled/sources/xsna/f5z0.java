package xsna;

import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class f5z0 {
    public final b6z0 a;
    public final b6z0 b;
    public final h8z0.b c;
    public WeakReference d;

    public f5z0(b6z0 b6z0Var, b6z0 b6z0Var2, h8z0.b bVar) {
        this.b = b6z0Var2;
        this.a = b6z0Var;
        this.c = bVar;
    }

    public static f5z0 a(e5z0 e5z0Var, h8z0.b bVar) {
        return new f5z0(e5z0Var.i(2), e5z0Var.c(2), bVar);
    }

    public final void b() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b.c.clear();
        this.a.c.clear();
        this.d = null;
    }

    public final void c(float f, float f2) {
        Context context;
        double d;
        float f3;
        char c;
        View view;
        WeakReference weakReference = this.d;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            context = null;
            d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        } else {
            d = c1z0.a(view);
            context = view.getContext();
        }
        List list = this.b.c;
        b6z0 b6z0Var = this.a;
        List list2 = b6z0Var.c;
        if (list2.isEmpty() && list.isEmpty()) {
            return;
        }
        if (context == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((oiz0) it.next()).j = -1.0f;
            }
            return;
        }
        b6z0 a = b6z0Var.a();
        List list3 = a.c;
        Iterator it2 = list2.iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (!hasNext) {
                break;
            }
            ghy0 ghy0Var = (ghy0) it2.next();
            if (ghy0Var.i == -1.0f) {
                float f4 = ghy0Var.j;
                if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    ghy0Var.i = (f4 * f2) / 100.0f;
                    ghy0Var.j = -1.0f;
                }
            }
            if (b920.b(ghy0Var.i, f) != 1) {
                it2.remove();
                int i = ghy0Var.f;
                boolean z = ghy0Var.h;
                boolean z2 = ((double) i) <= d;
                if ((z2 && z) || (!z2 && !z)) {
                    list3.add(ghy0Var);
                }
            }
        }
        float f5 = f2 - f;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            oiz0 oiz0Var = (oiz0) it3.next();
            int i2 = oiz0Var.f;
            boolean z3 = oiz0Var.i;
            float f6 = oiz0Var.h;
            float f7 = f3;
            float f8 = oiz0Var.j;
            boolean z4 = d < ((double) i2);
            boolean z5 = f8 < f7;
            if (b920.b(f5, f6) == -1 && (z4 || z5)) {
                if (!z3) {
                    list3.add(oiz0Var);
                }
                it3.remove();
                f3 = f7;
            } else {
                if (z4) {
                    c = 0;
                    oiz0Var.j = -1.0f;
                } else {
                    c = 0;
                    if (z5) {
                        oiz0Var.j = f;
                    } else if (b920.b(f - f8, f6) != -1) {
                        if (z3) {
                            list3.add(oiz0Var);
                        }
                        it3.remove();
                    }
                }
                f3 = f7;
            }
        }
        h8z0.h(a, this.c);
    }

    public final void d(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.d) == null) {
            this.d = new WeakReference(view);
        } else {
            weakReference.clear();
        }
    }
}
