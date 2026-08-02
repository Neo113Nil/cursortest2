package defpackage;

import android.content.Context;
import android.net.Uri;
import yads.s83;

/* loaded from: classes7.dex */
public final class cp71 implements re81 {
    public final c291 a = new c291();

    @Override // defpackage.re81
    public final s83 a() {
        return s83.b;
    }

    @Override // defpackage.re81
    public final String h(fe81 fe81Var) {
        String str = ((c171) fe81Var.b.b).d;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return Uri.parse(str).buildUpon().appendEncodedPath("v4/ad").build().toString();
    }

    @Override // defpackage.re81
    public final String s(Context context, fe81 fe81Var, fw81 fw81Var) {
        return this.a.a(context, new v771(oy61.a(context, fe81Var, fw81Var)).toString());
    }
}
