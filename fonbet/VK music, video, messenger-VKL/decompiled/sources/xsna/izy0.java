package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xsna.h8z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class izy0 implements ziy0 {
    public final ArrayList a;
    public final saz0 b;
    public final float c;
    public final boolean d;
    public WeakReference j;
    public WeakReference k;
    public a l;
    public final hzy0 f = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.hzy0
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            izy0.this.e();
        }
    };
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public final o4 e = new o4(this, 25);

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.hzy0] */
    public izy0(ery0 ery0Var, e5z0 e5z0Var, boolean z, boolean z2, h8z0.b bVar, b2z0 b2z0Var) {
        b6z0 b;
        float f = ery0Var.a;
        if (f == 1.0f) {
            this.b = saz0.f;
        } else {
            this.b = saz0.b((int) (f * 1000.0f));
        }
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        long j = (long) (ery0Var.c * 1000.0f);
        b6z0 j2 = e5z0Var.j("viewabilityDuration");
        StringBuilder sb = new StringBuilder("ViewabilityDuration stats count = ");
        List list = j2.c;
        sb.append(list.size());
        gu8.c("ViewabilityTracker", sb.toString());
        if (!list.isEmpty()) {
            arrayList.add(new owy0(this, j2, j, bVar));
        }
        b6z0 j3 = e5z0Var.j("show");
        gu8.c("ViewabilityTracker", "Show stats count = " + j3.c.size());
        arrayList.add(new d7z0(this, j3, j, e5z0Var, bVar));
        b6z0 j4 = e5z0Var.j("viewin");
        gu8.c("ViewabilityTracker", "View In stats count = " + j4.c.size());
        arrayList.add(new bmy0(this, j4));
        b6z0 j5 = e5z0Var.j("render");
        gu8.c("ViewabilityTracker", "Render stats count = " + j5.c.size());
        b6z0 j6 = e5z0Var.j("viewabilityMeasurable");
        gu8.c("ViewabilityTracker", "ViewabilityMeasurable stats count = " + j6.c.size());
        arrayList.add(new f9z0(this, j5, j6, bVar));
        if (z2) {
            b6z0 i = e5z0Var.i(1);
            gu8.c("ViewabilityTracker", "OvvStats stats count = " + i.c.size());
            if (b2z0Var == null) {
                b = e5z0Var.c(1);
                gu8.c("ViewabilityTracker", "MrcStats stats count = " + b.c.size());
            } else {
                b = b6z0.b(e5z0Var, new ArrayList());
                gu8.c("ViewabilityTracker", "MrcStats stats ignored (viewabilityTrackerV2FeatureFlag)");
            }
            arrayList.add(new xqy0(this, i, b, bVar));
        }
        this.c = ery0Var.b * 100.0f;
        this.d = z;
    }

    public static izy0 b(ery0 ery0Var, e5z0 e5z0Var, h8z0.b bVar) {
        return new izy0(ery0Var, e5z0Var, true, false, bVar, null);
    }

    @Override // xsna.ziy0
    public final a a() {
        return this.l;
    }

    public final void c(View view, float f, boolean z) {
        boolean z2 = this.h;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((rgz0) arrayList.get(size)).c(z, f, view.getContext());
        }
        if (z2 == z) {
            return;
        }
        this.h = this.g && z;
        a aVar = this.l;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    public final void d(ViewGroup viewGroup) {
        g();
        try {
            d6z0 d6z0Var = new d6z0(viewGroup.getContext());
            c1z0.n(d6z0Var, "viewability_view");
            viewGroup.addView(d6z0Var);
            gu8.c("ViewabilityTracker", "help view added");
            d6z0Var.setStateChangedListener(new cmc0(this, 9));
            this.k = new WeakReference(d6z0Var);
        } catch (Throwable th) {
            gu8.e("ViewabilityTracker", "Unable to add Viewability View - " + th.getMessage());
            this.k = null;
        }
    }

    public final void e() {
        WeakReference weakReference = this.j;
        View view = weakReference == null ? null : (View) weakReference.get();
        if (view == null) {
            gu8.c("ViewabilityTracker", "Tracking view disappeared");
            h();
            return;
        }
        float a2 = c1z0.a(view);
        boolean z = b920.b(a2, this.c) != -1;
        gu8.c("ViewabilityTracker", "View visibility " + a2 + "% (isVisible = " + z + ")");
        if (z) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.f);
            this.i = true;
        }
        c(view, a2, z);
    }

    public final void f(View view) {
        if (this.g) {
            return;
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() && this.d) {
            return;
        }
        gu8.c("ViewabilityTracker", "start tracking");
        this.g = true;
        this.j = new WeakReference(view);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((rgz0) arrayList.get(size)).b();
        }
        e();
        if (this.g) {
            this.b.c(this.e);
            if (view instanceof ViewGroup) {
                d((ViewGroup) view);
            }
        }
        if (this.i) {
            return;
        }
        view.getViewTreeObserver().addOnScrollChangedListener(this.f);
    }

    public final void g() {
        WeakReference weakReference = this.k;
        d6z0 d6z0Var = weakReference == null ? null : (d6z0) weakReference.get();
        this.k = null;
        if (d6z0Var == null) {
            return;
        }
        d6z0Var.setStateChangedListener(null);
        ViewParent parent = d6z0Var.getParent();
        if (parent == null) {
            return;
        }
        ((ViewGroup) parent).removeView(d6z0Var);
        gu8.c("ViewabilityTracker", "help view removed");
    }

    public final void h() {
        View view;
        if (this.g) {
            this.g = false;
            gu8.c("ViewabilityTracker", "stop tracking");
            g();
            this.b.h(this.e);
            this.h = false;
            WeakReference weakReference = this.j;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.f);
            }
            this.j = null;
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((rgz0) arrayList.get(size)).e();
            }
        }
    }

    @Override // xsna.ziy0
    public final void a(rgz0 rgz0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            if (arrayList.get(size) == rgz0Var) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        if (arrayList.isEmpty() && this.d) {
            gu8.c("ViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            h();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static abstract class a {
        public abstract void c();

        public void a() {
        }

        public void b(boolean z) {
        }
    }
}
