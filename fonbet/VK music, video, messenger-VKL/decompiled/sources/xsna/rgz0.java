package xsna;

import android.content.Context;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class rgz0 {
    public final b6z0 a;
    public final ziy0 b;
    public boolean c = false;

    public rgz0(ziy0 ziy0Var, b6z0 b6z0Var) {
        this.b = ziy0Var;
        this.a = b6z0Var;
    }

    public final izy0.a a() {
        if (this.c) {
            return null;
        }
        return this.b.a();
    }

    public abstract void b();

    public abstract void c(boolean z, float f, Context context);

    public void d() {
        if (this.c) {
            return;
        }
        this.b.a(this);
        this.c = true;
        gu8.c("ViewabilityTracker: StatTracker", "i'm killed");
    }

    public abstract void e();
}
