package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes15.dex */
public final class gt10 implements xs21 {
    public final String a;
    public final Handler b;
    public zf0 c;
    public final /* synthetic */ ht10 w;

    public gt10(ht10 ht10Var, String str, zf0 zf0Var) {
        this.w = ht10Var;
        tje.e();
        this.a = str;
        this.c = zf0Var;
        this.b = new Handler();
    }

    @Override // defpackage.xs21
    public final void close() {
        this.c = null;
    }

    @Override // defpackage.xs21
    public final e1k e(cl21 cl21Var) {
        et10 et10Var = (et10) ((d9g) cl21Var).D0.get();
        z83.g(null, et10Var.c, Looper.myLooper());
        return new dt10(et10Var, this.a, this);
    }
}
