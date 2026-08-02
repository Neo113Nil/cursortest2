package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.h8z0;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xqy0 extends rgz0 {
    public long d;
    public long e;
    public final b6z0 f;
    public final b6z0 g;
    public final h8z0.b h;

    public xqy0(ziy0 ziy0Var, b6z0 b6z0Var, b6z0 b6z0Var2, h8z0.b bVar) {
        super(ziy0Var, b6z0Var.a());
        this.d = 0L;
        this.e = 0L;
        this.g = b6z0Var2;
        this.f = b6z0Var;
        this.h = bVar;
    }

    @Override // xsna.rgz0
    public final void b() {
        gu8.c("ViewabilityTracker: PlayHeadViewabilityStatTracker", "startTracking");
        if (this.d == 0) {
            this.d = SystemClock.elapsedRealtime();
            return;
        }
        Iterator it = this.g.c.iterator();
        while (it.hasNext()) {
            ((oiz0) it.next()).j = -1.0f;
        }
        this.d = (SystemClock.elapsedRealtime() - this.e) + this.d;
    }

    @Override // xsna.rgz0
    public final void c(boolean z, float f, Context context) {
        izy0.a a;
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.d) / 1000.0f;
        double d = f;
        b6z0 b6z0Var = this.f;
        List list = b6z0Var.c;
        boolean isEmpty = list.isEmpty();
        b6z0 b6z0Var2 = this.g;
        if (isEmpty && b6z0Var2.c.isEmpty()) {
            gu8.c("ViewabilityTracker: PlayHeadViewabilityStatTracker", "killSelf");
            d();
            return;
        }
        b6z0 a2 = b6z0Var.a();
        List list2 = a2.c;
        while (true) {
            if (list.isEmpty()) {
                break;
            }
            int size = list.size() - 1;
            if (b920.b(((ghy0) list.get(size)).i, elapsedRealtime) == 1) {
                break;
            }
            ghy0 ghy0Var = (ghy0) list.remove(size);
            int i = ghy0Var.f;
            boolean z2 = ghy0Var.h;
            boolean z3 = ((double) i) <= d;
            if ((z3 && z2) || (!z3 && !z2)) {
                list2.add(ghy0Var);
            }
        }
        Iterator it = b6z0Var2.c.iterator();
        while (it.hasNext()) {
            oiz0 oiz0Var = (oiz0) it.next();
            int i2 = oiz0Var.f;
            boolean z4 = oiz0Var.i;
            float f2 = oiz0Var.h;
            float f3 = oiz0Var.j;
            boolean z5 = d < ((double) i2);
            boolean z6 = f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z5) {
                oiz0Var.j = -1.0f;
            } else if (b920.b(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 0 && z4) {
                list2.add(oiz0Var);
                it.remove();
            } else if (z6) {
                oiz0Var.j = elapsedRealtime;
            } else if (b920.b(elapsedRealtime - f3, f2) != -1) {
                if (z4) {
                    list2.add(oiz0Var);
                }
                it.remove();
            }
        }
        h8z0.h(a2, this.h);
        if (!e5z0.n(list2) || (a = a()) == null) {
            return;
        }
        a.a();
    }

    @Override // xsna.rgz0
    public final void e() {
        gu8.c("ViewabilityTracker: PlayHeadViewabilityStatTracker", "stopTracking");
        this.e = SystemClock.elapsedRealtime();
    }
}
