package xsna;

import xsna.h1c;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes6.dex */
public final class f1c extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ g1c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1c(g1c g1cVar) {
        super(pvj.a.b);
        this.b = g1cVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        par0.a.getClass();
        par0.d(th);
        this.b.T(new h1c.a(th));
    }
}
