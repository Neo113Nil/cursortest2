package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes10.dex */
public abstract class kbm {
    public static final i3y a = a.b(LazyThreadSafetyMode.NONE, new jbm(0));

    public static final pa90 a(Drawable drawable, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(1756822313);
        btsVar.e0(289266787);
        boolean k = btsVar.k(drawable);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            if (drawable == null) {
                Q = xwn.y;
            } else {
                Q = drawable instanceof ColorDrawable ? new rfc(rzo.d(((ColorDrawable) drawable).getColor())) : new ibm(drawable.mutate());
            }
            btsVar.o0(Q);
        }
        pa90 pa90Var = (pa90) Q;
        btsVar.t(false);
        btsVar.t(false);
        return pa90Var;
    }
}
