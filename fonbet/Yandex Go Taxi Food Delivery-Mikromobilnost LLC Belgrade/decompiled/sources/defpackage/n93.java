package defpackage;

import android.graphics.Bitmap;
import coil3.c;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class n93 implements nwq {
    @Override // defpackage.nwq
    public final pwq a(Object obj, lg70 lg70Var, c cVar) {
        cg21 cg21Var = (cg21) obj;
        Bitmap.Config[] configArr = zx21.a;
        if (jl40.l(cg21Var.c, "file") && jl40.l(a.R(yri0.e(cg21Var)), "android_asset")) {
            return new p93(cg21Var, lg70Var, 0);
        }
        return null;
    }
}
