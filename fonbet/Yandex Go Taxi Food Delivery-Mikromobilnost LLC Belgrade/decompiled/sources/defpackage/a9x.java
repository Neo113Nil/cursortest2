package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class a9x extends j18 {
    public final c D;

    public a9x(Continuation continuation, c cVar) {
        super(1, continuation);
        this.D = cVar;
    }

    @Override // defpackage.j18
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // defpackage.j18
    public final Throwable p(c cVar) {
        Throwable d;
        Object N = this.D.N();
        return (!(N instanceof c9x) || (d = ((c9x) N).d()) == null) ? N instanceof tzc ? ((tzc) N).a : cVar.I() : d;
    }
}
