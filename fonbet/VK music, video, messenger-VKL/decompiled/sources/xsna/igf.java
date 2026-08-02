package xsna;

import xsna.mjf;
import xsna.pvj;
import xsna.ugf;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes17.dex */
public final class igf extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ lgf b;
    public final /* synthetic */ mjf.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igf(lgf lgfVar, mjf.c cVar) {
        super(pvj.a.b);
        this.b = lgfVar;
        this.c = cVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        mjf.c cVar = this.c;
        this.b.e(new ugf.f.a(cVar.b, cVar.c));
        com.vk.metrics.eventtracking.b.a.a(th);
    }
}
