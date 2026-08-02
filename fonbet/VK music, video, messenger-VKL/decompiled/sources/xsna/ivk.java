package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, 300}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class ivk extends SuspendLambda implements izs<spj<? super Pair<? extends gtk0<Object>, ? extends Boolean>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivk(DataStoreImpl<Object> dataStoreImpl, spj<? super ivk> spjVar) {
        super(1, spjVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ivk(this.this$0, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Pair<? extends gtk0<Object>, ? extends Boolean>> spjVar) {
        return ((ivk) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        gtk0 gtk0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th2) {
            uax g = this.this$0.g();
            this.L$0 = th2;
            this.label = 2;
            Integer version = g.getVersion();
            if (version != coroutineSingletons) {
                th = th2;
                obj = version;
            }
        }
        if (i == 0) {
            kotlin.a.a(obj);
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            this.label = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) this.L$0;
                kotlin.a.a(obj);
                gtk0Var = new f7f0(th, ((Number) obj).intValue());
                return new Pair(gtk0Var, Boolean.TRUE);
            }
            kotlin.a.a(obj);
        }
        gtk0Var = (gtk0) obj;
        return new Pair(gtk0Var, Boolean.TRUE);
    }
}
