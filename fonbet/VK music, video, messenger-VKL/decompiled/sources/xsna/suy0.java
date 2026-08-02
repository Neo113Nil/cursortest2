package xsna;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class suy0 {
    public long b;
    public final b6z0 d;
    public final b6z0 e;
    public WeakReference g;
    public final h8z0.b h;
    public boolean a = false;
    public final saz0 c = saz0.f;
    public final po4 f = new po4(this, 9);

    public suy0(b6z0 b6z0Var, b6z0 b6z0Var2, h8z0.b bVar) {
        this.e = b6z0Var2;
        this.d = b6z0Var;
        this.h = bVar;
    }

    public static suy0 a(e5z0 e5z0Var, h8z0.b bVar) {
        return new suy0(e5z0Var.i(1), e5z0Var.c(1), bVar);
    }

    public final void b(View view) {
        WeakReference weakReference;
        if (view != null || (weakReference = this.g) == null) {
            this.g = new WeakReference(view);
        } else {
            weakReference.clear();
        }
    }

    public final void c() {
        if (this.a) {
            gu8.c("ViewabilityBannerTracker", "banner viewability already tracking");
            return;
        }
        this.a = true;
        this.b = SystemClock.elapsedRealtime();
        this.c.c(this.f);
    }

    public final void d() {
        this.c.h(this.f);
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e.c.clear();
        this.d.c.clear();
        this.g = null;
    }
}
