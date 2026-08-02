package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class j8z0 implements ziy0 {
    public final ArrayList b;
    public final f9z0 c;
    public final float d;
    public final saz0 e;
    public final boolean g;
    public final ArrayList a = new ArrayList();
    public final xqc f = new xqc(this, 19);
    public boolean h = false;
    public boolean i = false;
    public ekz0 j = null;
    public ocz0 k = null;
    public float l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public String m = "";
    public boolean n = false;

    public j8z0(ery0 ery0Var, e5z0 e5z0Var, mrc0 mrc0Var, b2z0 b2z0Var) {
        mrc0 mrc0Var2;
        b6z0 b;
        this.c = null;
        this.d = 50.0f;
        float f = ery0Var.a;
        if (f == 1.0f) {
            this.e = saz0.f;
        } else {
            this.e = saz0.b((int) (f * 1000.0f));
        }
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        long j = (long) (ery0Var.c * 1000.0f);
        b6z0 j2 = e5z0Var.j("viewabilityDuration");
        StringBuilder sb = new StringBuilder("ViewabilityDuration stats count = ");
        List list = j2.c;
        sb.append(list.size());
        gu8.c("ViewsViewabilityTracker", sb.toString());
        if (list.isEmpty()) {
            mrc0Var2 = mrc0Var;
        } else {
            mrc0Var2 = mrc0Var;
            arrayList.add(new owy0(this, j2, j, mrc0Var2));
        }
        b6z0 j3 = e5z0Var.j("show");
        gu8.c("ViewsViewabilityTracker", "Show stats count = " + j3.c.size());
        mrc0 mrc0Var3 = mrc0Var2;
        arrayList.add(new d7z0(this, j3, j, e5z0Var, mrc0Var3));
        b6z0 j4 = e5z0Var.j("viewin");
        gu8.c("ViewsViewabilityTracker", "View In stats count = " + j4.c.size());
        arrayList.add(new bmy0(this, j4));
        b6z0 j5 = e5z0Var.j("render");
        gu8.c("ViewsViewabilityTracker", "Render stats count = " + j5.c.size());
        b6z0 j6 = e5z0Var.j("viewabilityMeasurable");
        gu8.c("ViewsViewabilityTracker", "ViewabilityMeasurable stats count = " + j6.c.size());
        this.c = new f9z0(this, j5, j6, mrc0Var3);
        b6z0 i = e5z0Var.i(1);
        gu8.c("ViewsViewabilityTracker", "OvvStats stats count = " + i.c.size());
        if (b2z0Var == null) {
            b = e5z0Var.c(1);
            gu8.c("ViewsViewabilityTracker", "MrcStats stats count = " + b.c.size());
        } else {
            b = b6z0.b(e5z0Var, new ArrayList());
            gu8.c("ViewsViewabilityTracker", "MrcStats stats ignored (viewabilityTrackerV2FeatureFlag)");
        }
        arrayList.add(new xqy0(this, i, b, mrc0Var3));
        this.d = ery0Var.b * 100.0f;
        this.g = true;
    }

    public static boolean c(View view) {
        return view.getParent() == null || view.getWindowVisibility() != 0 || view.getVisibility() != 0 || view.getAlpha() < 0.5f;
    }

    @Override // xsna.ziy0
    public final izy0.a a() {
        return this.j;
    }

    public final void b(boolean z, float f, Context context) {
        boolean z2 = this.i;
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((rgz0) arrayList.get(size)).c(z, f, context);
        }
        if (z2 == z) {
            return;
        }
        this.i = this.h && z;
        ekz0 ekz0Var = this.j;
        if (ekz0Var != null) {
            ekz0Var.b(z);
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            View view = (View) ((WeakReference) obj).get();
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (arrayList.isEmpty()) {
            gu8.c("ViewsViewabilityTracker", "Tracking view disappeared");
            e();
            return;
        }
        float f = this.l;
        int size2 = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            View view2 = (View) obj2;
            if (view2 != null && !c(view2)) {
                Rect rect = new Rect();
                if (view2.getGlobalVisibleRect(rect)) {
                    i3 += rect.height() * rect.width();
                }
            }
        }
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = i3 / (f / 100.0f);
        }
        boolean z = b920.b(f2, this.d) != -1;
        if (z != this.n || !this.k.F.equals(this.m)) {
            this.n = z;
            this.m = this.k.F;
            StringBuilder sb = new StringBuilder("View visibility ");
            sb.append(f2);
            sb.append("% (isVisible = ");
            sb.append(z);
            sb.append("). Id: ");
            qjk0.a(sb, this.k.F, "ViewsViewabilityTracker");
        }
        b(z, f2, ((View) arrayList.get(0)).getContext());
    }

    public final void e() {
        if (this.h) {
            this.h = false;
            this.i = false;
            this.a.clear();
            this.e.h(this.f);
            gu8.c("ViewsViewabilityTracker", "Stop tracking");
        }
    }

    @Override // xsna.ziy0
    public final void a(rgz0 rgz0Var) {
        ArrayList arrayList = this.b;
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
        if (arrayList.isEmpty() && this.g) {
            gu8.c("ViewsViewabilityTracker", "statTrackers are empty and shouldStopOnShow = true, stop tracking");
            e();
        }
    }
}
