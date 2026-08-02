package yads;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes10.dex */
public final class sb implements vb3 {
    public final gm0 a = new gm0();

    @Override // yads.vb3
    public final String a(Context context, d4 d4Var, sy2 sy2Var) {
        return this.a.a(context, new zu0(wu0.a(context, d4Var, sy2Var)).toString());
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
        return ub3.b;
    }
}
