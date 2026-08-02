package xsna;

import android.util.Log;
import xsna.y5j;

/* compiled from: ConstraintScopeCommon.kt */
/* loaded from: classes11.dex */
public abstract class ee6 implements jcv {
    public final bv8 a;
    public final String b;

    public ee6(bv8 bv8Var, int i) {
        this.a = bv8Var;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        this.b = str;
    }

    @Override // xsna.jcv
    public final void a(y5j.a aVar, float f, float f2) {
        int i = aVar.b;
        String str = "top";
        if (i != 0) {
            if (i != 1) {
                Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
            } else {
                str = "bottom";
            }
        }
        wu8 wu8Var = new wu8(new char[0]);
        wu8Var.n(dv8.n(aVar.a.toString()));
        wu8Var.n(dv8.n(str));
        wu8Var.n(new av8(f));
        wu8Var.n(new av8(f2));
        this.a.z(this.b, wu8Var);
    }
}
