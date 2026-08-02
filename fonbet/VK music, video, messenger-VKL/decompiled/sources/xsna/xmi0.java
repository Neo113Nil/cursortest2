package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wmi0;

/* compiled from: SerializerCache.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class xmi0 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    public xmi0(wmi0.b bVar) {
        super(1, bVar, wmi0.b.class, "log", "log(Ljava/lang/Throwable;)V", 0);
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        ((wmi0.b) this.receiver).a(th);
        return s3q0.a;
    }
}
