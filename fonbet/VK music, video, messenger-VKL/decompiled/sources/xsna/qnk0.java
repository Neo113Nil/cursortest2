package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.o;

/* compiled from: SseEventSourceBuilderImpl.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class qnk0 extends FunctionReferenceImpl implements gzs<okhttp3.o> {
    @Override // xsna.gzs
    public final okhttp3.o invoke() {
        rnk0 rnk0Var = (rnk0) this.receiver;
        o.a aVar = (o.a) rnk0Var.a.invoke();
        aVar.c.add((sqo) rnk0Var.d.getValue());
        return new okhttp3.o(aVar);
    }
}
