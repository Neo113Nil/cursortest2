package xsna;

import android.content.Context;
import java.util.HashMap;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vyy0 extends z8y0.a {
    public final int a;

    public vyy0(int i) {
        this.a = i;
    }

    @Override // xsna.z8y0.a
    public final HashMap c(u6z0 u6z0Var, s3z0 s3z0Var, Context context) {
        HashMap c = super.c(u6z0Var, s3z0Var, context);
        c.put("duration", Integer.toString(this.a));
        return c;
    }
}
