package xsna;

import xsna.mjf;
import xsna.pvj;
import xsna.ugf;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes17.dex */
public final class mgf extends kotlin.coroutines.a implements pvj {
    public final /* synthetic */ ogf b;
    public final /* synthetic */ mjf.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgf(ogf ogfVar, mjf.d dVar) {
        super(pvj.a.b);
        this.b = ogfVar;
        this.c = dVar;
    }

    @Override // xsna.pvj
    public final void handleException(kotlin.coroutines.d dVar, Throwable th) {
        mjf.d dVar2 = this.c;
        this.b.e(new ugf.f.b(dVar2.b, dVar2.c));
        com.vk.metrics.eventtracking.b.a.a(th);
    }
}
