package xsna;

import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class nvk extends SuspendLambda implements izs<spj<Object>, Object> {
    final /* synthetic */ kotlin.coroutines.d $callerContext;
    final /* synthetic */ wzs<Object, spj<Object>, Object> $transform;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* compiled from: DataStoreImpl.kt */
    @b6l(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {331}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
        final /* synthetic */ rtk<Object> $curData;
        final /* synthetic */ wzs<Object, spj<Object>, Object> $transform;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, rtk<Object> rtkVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$transform = wzsVar;
            this.$curData = rtkVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$transform, this.$curData, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            wzs<Object, spj<Object>, Object> wzsVar = this.$transform;
            Object obj2 = this.$curData.b;
            this.label = 1;
            Object invoke = wzsVar.invoke(obj2, this);
            return invoke == coroutineSingletons ? coroutineSingletons : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nvk(DataStoreImpl<Object> dataStoreImpl, kotlin.coroutines.d dVar, wzs<Object, ? super spj<Object>, ? extends Object> wzsVar, spj<? super nvk> spjVar) {
        super(1, spjVar);
        this.this$0 = dataStoreImpl;
        this.$callerContext = dVar;
        this.$transform = wzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new nvk(this.this$0, this.$callerContext, this.$transform, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<Object> spjVar) {
        return ((nvk) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rtk rtkVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            this.label = 1;
            obj = DataStoreImpl.f(dataStoreImpl, true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    kotlin.a.a(obj);
                    return obj2;
                }
                rtkVar = (rtk) this.L$0;
                kotlin.a.a(obj);
                T t = rtkVar.b;
                if ((t != 0 ? t.hashCode() : 0) != rtkVar.c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!epx.f(rtkVar.b, obj)) {
                    DataStoreImpl<Object> dataStoreImpl2 = this.this$0;
                    this.L$0 = obj;
                    this.label = 3;
                    if (dataStoreImpl2.j(obj, true, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
            kotlin.a.a(obj);
        }
        rtkVar = (rtk) obj;
        kotlin.coroutines.d dVar = this.$callerContext;
        a aVar = new a(this.$transform, rtkVar, null);
        this.L$0 = rtkVar;
        this.label = 2;
        obj = myc0.k(dVar, aVar, this);
    }
}
