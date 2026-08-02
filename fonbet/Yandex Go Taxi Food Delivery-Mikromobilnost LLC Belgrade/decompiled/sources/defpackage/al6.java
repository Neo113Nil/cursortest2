package defpackage;

import defpackage.cc4;
import kotlin.Result;

/* loaded from: classes.dex */
public final class al6 extends cc4.a {
    public j18 a;
    public tls b;

    @Override // cc4.a
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // cc4.a
    public final void b(Throwable th) {
        j18 j18Var = this.a;
        if (j18Var != null) {
            j18Var.resumeWith(new Result.Failure(th));
        }
    }
}
