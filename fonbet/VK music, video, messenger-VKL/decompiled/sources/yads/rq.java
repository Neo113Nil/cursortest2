package yads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes10.dex */
public final class rq {
    public final ov2 a;
    public final jp2 b;
    public final qq c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ rq(ov2 ov2Var) {
        this(ov2Var, r0.a(), new qq(r0.c()));
        mv3 mv3Var = (mv3) ov2Var;
    }

    public final boolean a(Context context, v9 v9Var, z9 z9Var, d4 d4Var, String str) {
        z1 a = y1.a();
        long a2 = a31.a();
        Intent a3 = this.c.a(context, str, a2);
        a.a(a2, new x1(v9Var, d4Var, z9Var, this.a, null, 0, null, 112));
        try {
            context.startActivity(a3);
            return true;
        } catch (Exception e) {
            a.a(a2);
            e.toString();
            this.b.reportError("Failed to show Browser", e);
            return false;
        }
    }

    public rq(ov2 ov2Var, jp2 jp2Var, qq qqVar) {
        this.a = ov2Var;
        this.b = jp2Var;
        this.c = qqVar;
    }
}
