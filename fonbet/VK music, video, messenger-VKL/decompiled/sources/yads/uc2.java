package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes10.dex */
public final class uc2 implements vb3 {
    public final ir1 a;
    public final gm0 b = new gm0();

    public uc2(ir1 ir1Var) {
        this.a = ir1Var;
    }

    @Override // yads.vb3
    public final String a(Context context, d4 d4Var, sy2 sy2Var) {
        Map map = this.a.c;
        vu0 a = wu0.a(context, d4Var, sy2Var);
        if (map != null) {
            a.i.putAll(map);
        }
        return this.b.a(context, new zu0(a).toString());
    }

    @Override // yads.vb3
    public final String a(d4 d4Var) {
        String str = d4Var.b.a.e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // yads.vb3
    public final ub3 a() {
        return ub3.c;
    }
}
