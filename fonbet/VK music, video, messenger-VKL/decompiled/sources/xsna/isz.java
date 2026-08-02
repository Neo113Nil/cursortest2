package xsna;

import xsna.ksz;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes6.dex */
public final class isz extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ jsz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isz(jsz jszVar) {
        super(pvj.a.b);
        this.b = jszVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        par0.a.getClass();
        par0.d(th);
        this.b.T(new ksz.b(th));
    }
}
