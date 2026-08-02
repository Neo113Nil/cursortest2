package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Locale;
import xsna.h8z0;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class owy0 extends gbz0 {
    public final h8z0.b f;
    public boolean g;
    public float h;

    public owy0(ziy0 ziy0Var, b6z0 b6z0Var, long j, h8z0.b bVar) {
        super(ziy0Var, b6z0Var, j);
        this.g = false;
        this.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f = bVar;
    }

    @Override // xsna.rgz0
    public final void c(boolean z, float f, Context context) {
        if (!this.g) {
            if (f(z)) {
                this.g = true;
                this.h = f;
                gu8.c("ViewabilityTracker: ViewabilityDurationStatTracker", "Start tracking viewability");
                return;
            }
            return;
        }
        this.h = Math.max(this.h, f);
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        if (!z || currentTimeMillis >= 60000) {
            g(this.h, currentTimeMillis);
            return;
        }
        gu8.c("ViewabilityTracker: ViewabilityDurationStatTracker", "No need to send ViewabilityDurationStat (isVisible = true, currentDurationMillis = " + currentTimeMillis + ")");
    }

    @Override // xsna.rgz0
    public final void e() {
        if (!this.g) {
            this.e = 0L;
            return;
        }
        g(this.h, System.currentTimeMillis() - this.e);
    }

    public final void g(float f, long j) {
        izy0.a a;
        String valueOf = String.valueOf((int) f);
        String format = String.format(Locale.getDefault(), "%.1f", Float.valueOf(Math.min(j, 60000L) / 1000.0f));
        HashMap a2 = hq.a("viewability_percent", valueOf, "viewability_duration", format);
        gu8.c("ViewabilityTracker: ViewabilityDurationStatTracker", ss9.a("Sending ViewabilityDuration stat (max visible percent = ", valueOf, ", duration = ", format, " sec)"));
        h8z0.a aVar = h8z0.a;
        b6z0 b6z0Var = this.a;
        if (aVar != null) {
            aVar.a(b6z0Var, a2, 1, this.f);
        }
        if (e5z0.n(b6z0Var.c) && (a = a()) != null) {
            a.a();
        }
        gu8.c("ViewabilityTracker: ViewabilityDurationStatTracker", "ViewabilityDuration tracked, kill self");
        d();
    }

    @Override // xsna.rgz0
    public final void b() {
    }
}
