package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.loy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class a2z0 implements Runnable {
    public loy0 b;
    public loy0.a c;

    public a2z0(qfy0 qfy0Var) {
        this.b = qfy0Var;
    }

    public final void a(loy0.a aVar) {
        this.c = aVar;
    }

    public final void b() {
        this.b = null;
        this.c = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        loy0.a aVar;
        if (this.b == null) {
            return;
        }
        try {
            float position = r0.getPosition() / 1000.0f;
            if (this.b.getDuration() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (aVar = this.c) == null) {
                return;
            }
            aVar.b(position);
        } catch (Throwable th) {
            String str = this.b.getClass() + ": Error - " + th.getMessage();
            gu8.c(null, str);
            loy0.a aVar2 = this.c;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }
}
