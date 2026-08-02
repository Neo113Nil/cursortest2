package xsna;

import android.os.SystemClock;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class daz0 {
    public final /* synthetic */ y5z0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ faz0 c;

    public daz0(faz0 faz0Var, y5z0 y5z0Var, int i) {
        this.c = faz0Var;
        this.a = y5z0Var;
        this.b = i;
    }

    public final boolean a(int i) {
        com.vk.movika.sdk.android.defaultplayer.utils.c cVar;
        lxd lxdVar;
        faz0 faz0Var = this.c;
        int i2 = faz0Var.b;
        ArrayList arrayList = faz0Var.k;
        boolean z = true;
        boolean z2 = faz0Var.e == 1;
        if (faz0Var.d != null) {
            int size = arrayList.size();
            int i3 = 0;
            boolean z3 = false;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                d6z0 d6z0Var = (d6z0) ((WeakReference) obj).get();
                if (d6z0Var != null) {
                    z3 = d6z0Var.getParent() == faz0Var.d.c();
                    if (z3) {
                        break;
                    }
                }
            }
            if (!z3 && (lxdVar = faz0Var.d) != null) {
                ViewGroup c = lxdVar.c();
                if (c.isAttachedToWindow()) {
                    d6z0 d6z0Var2 = new d6z0(c.getContext());
                    c1z0.n(d6z0Var2, "viewability_view");
                    d6z0Var2.setStateChangedListener(new h8e0(faz0Var, 9));
                    c.addView(d6z0Var2);
                    WeakReference weakReference = new WeakReference(d6z0Var2);
                    arrayList.add(weakReference);
                    c.addOnAttachStateChangeListener(new eaz0(faz0Var, c, weakReference));
                    gu8.c("InstreamAdPostViewCtrl", "ViewabilityView is added");
                }
            }
            ArrayList arrayList2 = faz0Var.k;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                Object obj2 = arrayList2.get(i4);
                i4++;
                if (((WeakReference) obj2).get() != null) {
                    z = false;
                    break;
                }
            }
            if (z && SystemClock.elapsedRealtime() - faz0Var.c > i2 && faz0Var.g != null) {
                gu8.c("InstreamAdPostViewCtrl", "Container wasn't provided in " + i2 + "ms. PostView is completed.");
                faz0Var.g.a();
            }
            if (z2) {
                lxd lxdVar2 = faz0Var.d;
                lxdVar2.getClass();
                int i5 = (i * 100) / this.b;
                n9c0 n9c0Var = (n9c0) lxdVar2.b;
                if (n9c0Var != null) {
                    if (n9c0Var.getView().getVisibility() == 8 && (cVar = (com.vk.movika.sdk.android.defaultplayer.utils.c) lxdVar2.c) != null) {
                        n9c0Var.n4((sc0) lxdVar2.a, cVar);
                        n9c0Var.h0(false);
                    }
                    n9c0Var.N2(i5);
                }
            }
        }
        return z2;
    }
}
