package xsna;

import xsna.pvj;
import xsna.qef;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes17.dex */
public final class rcf extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ wcf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcf(wcf wcfVar) {
        super(pvj.a.b);
        this.b = wcfVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        this.b.c(qef.c0.a);
    }
}
