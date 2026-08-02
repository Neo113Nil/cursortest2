package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class ot00 extends swc0 {
    public final eu00 a;
    public final e40 b;

    public ot00(eu00 eu00Var, e40 e40Var) {
        super(vzt0.a);
        this.a = eu00Var;
        this.b = e40Var;
    }

    @Override // defpackage.swc0
    public final qwc0 create(Context context, int i, Object obj) {
        if (context == null) {
            ny61.r("Required value was null.");
            return null;
        }
        ut00 ut00Var = new ut00(context, this.b);
        this.a.a = ut00Var;
        return ut00Var;
    }
}
