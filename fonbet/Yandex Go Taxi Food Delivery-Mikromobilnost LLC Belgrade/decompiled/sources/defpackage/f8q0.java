package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class f8q0 extends skl0 {
    public final /* synthetic */ eb7 a;
    public final /* synthetic */ npg b;
    public final /* synthetic */ j8q0 c;

    public f8q0(j8q0 j8q0Var, eb7 eb7Var, npg npgVar) {
        this.c = j8q0Var;
        this.a = eb7Var;
        this.b = npgVar;
    }

    @Override // defpackage.skl0
    public final Object doWork() {
        gg90 gg90Var = this.c.b;
        eb7 eb7Var = this.a;
        x7u0 x7u0Var = new x7u0(eb7Var);
        uwy.f.getAndIncrement();
        x7u0Var.b = 0L;
        lpg lpgVar = new lpg(x7u0Var, this.b);
        try {
            lpgVar.a();
            Uri uri = eb7Var.B;
            uri.getClass();
            Object parse = gg90Var.parse(uri, lpgVar);
            tw21.g(lpgVar);
            parse.getClass();
            return (o5r) parse;
        } catch (Throwable th) {
            tw21.g(lpgVar);
            throw th;
        }
    }
}
