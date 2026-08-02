package yads;

import android.content.Context;
import java.util.List;

/* loaded from: classes10.dex */
public final class jq3 {
    public final d4 a;
    public final ov2 b;
    public final vd3 c;
    public final jh3 d;
    public final Context e;
    public int f;

    public jq3(Context context, d4 d4Var, ov2 ov2Var, vd3 vd3Var, jh3 jh3Var) {
        this.a = d4Var;
        this.b = ov2Var;
        this.c = vd3Var;
        this.d = jh3Var;
        this.e = context.getApplicationContext();
    }

    public final void a(Context context, List list, up2 up2Var, Object obj) {
        int i = this.f + 1;
        this.f = i;
        if (i > 5) {
            up2Var.a(new ff3("Maximum count of VAST wrapper requests exceeded."));
            return;
        }
        new lq3(new gq3(this.e, this.a, this.b, this.c, this.d)).a(context, list, up2Var, obj);
    }
}
