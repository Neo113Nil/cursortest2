package xsna;

import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import xsna.p7z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class faz0 {
    public final p7z0.b a;
    public lxd d;
    public long c = 0;
    public int e = 0;
    public boolean f = false;
    public a g = null;
    public boolean h = true;
    public boolean i = false;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final int b = IronSourceError.ERROR_CAPPING_VALIDATION_FAILED;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final daz0 b;
        public ou4 f;
        public final saz0 a = saz0.b(100);
        public int c = 0;
        public int d = 0;
        public boolean e = false;

        public a(daz0 daz0Var) {
            this.b = daz0Var;
        }

        public final void a() {
            this.c = 0;
            this.d = 0;
            ou4 ou4Var = this.f;
            if (ou4Var != null) {
                this.a.h(ou4Var);
            }
            this.f = null;
            this.b.c.e();
        }
    }

    public faz0(p7z0.b bVar) {
        this.a = bVar;
    }

    public static void a(WeakReference weakReference) {
        d6z0 d6z0Var = (d6z0) weakReference.get();
        if (d6z0Var == null) {
            return;
        }
        d6z0Var.setStateChangedListener(null);
        ViewGroup viewGroup = (ViewGroup) d6z0Var.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(d6z0Var);
        }
        gu8.c("InstreamAdPostViewCtrl", "ViewabilityView is removed");
    }

    public final void b(boolean z) {
        lxd lxdVar;
        lxd lxdVar2;
        if (this.h == z) {
            return;
        }
        this.h = z;
        boolean z2 = this.f;
        if (!z2) {
            if (this.i && z) {
                e();
                return;
            }
            return;
        }
        if (!z) {
            if (this.e != 1 || !z2 || this.g == null || (lxdVar = this.d) == null) {
                return;
            }
            n9c0 n9c0Var = (n9c0) lxdVar.b;
            if (n9c0Var != null) {
                n9c0Var.pause();
            }
            this.e = 2;
            gu8.c("InstreamAdPostViewCtrl", "Player is paused");
            return;
        }
        if (this.i) {
            e();
            return;
        }
        if (this.e != 2 || this.g == null || (lxdVar2 = this.d) == null) {
            return;
        }
        n9c0 n9c0Var2 = (n9c0) lxdVar2.b;
        if (n9c0Var2 != null) {
            n9c0Var2.resume();
        }
        this.e = 1;
        gu8.c("InstreamAdPostViewCtrl", "Player is resumed");
    }

    public final void c() {
        if (this.g != null && d()) {
            a aVar = this.g;
            aVar.e = true;
            aVar.b.c.j = true;
            aVar.a();
            this.g = null;
            gu8.c("InstreamAdPostViewCtrl", "Player is cancelled");
        }
    }

    public final boolean d() {
        int i = this.e;
        return i == 1 || i == 2;
    }

    public final void e() {
        if (!this.h) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((WeakReference) obj).get() != null) {
                    this.i = true;
                    return;
                }
            }
        }
        if (this.d == null) {
            gu8.c("InstreamAdPostViewCtrl", "PostView couldn't complete because player is null");
        } else {
            o8z0.d(new b3m(this, 11));
        }
    }
}
