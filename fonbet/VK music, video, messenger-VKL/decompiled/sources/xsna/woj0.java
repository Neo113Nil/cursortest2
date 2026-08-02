package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.jvm.internal.Lambda;

/* compiled from: SimpleActor.kt */
/* loaded from: classes.dex */
public final class woj0 extends Lambda implements izs<Throwable, s3q0> {
    final /* synthetic */ izs<Throwable, s3q0> $onComplete;
    final /* synthetic */ wzs<Object, Throwable, s3q0> $onUndeliveredElement;
    final /* synthetic */ yoj0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woj0(DataStoreImpl.e eVar, yoj0 yoj0Var, wzs wzsVar) {
        super(1);
        this.$onComplete = eVar;
        this.this$0 = yoj0Var;
        this.$onUndeliveredElement = wzsVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        s3q0 s3q0Var;
        Throwable th2 = th;
        this.$onComplete.invoke(th2);
        this.this$0.c.m(th2, false);
        do {
            Object b = kbb.b(this.this$0.c.l());
            if (b != null) {
                this.$onUndeliveredElement.invoke(b, th2);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
        } while (s3q0Var != null);
        return s3q0.a;
    }
}
