package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes10.dex */
public final class p5g0 implements q430 {
    public final Context a;
    public final q430 b;
    public final q430 c;
    public final Class d;

    public p5g0(Context context, q430 q430Var, q430 q430Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = q430Var;
        this.c = q430Var2;
        this.d = cls;
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        Uri uri = (Uri) obj;
        return new p430(new lp60(uri), new o5g0(this.a, this.b, this.c, uri, i, i2, mg70Var, this.d));
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        return pkb1.f((Uri) obj);
    }
}
