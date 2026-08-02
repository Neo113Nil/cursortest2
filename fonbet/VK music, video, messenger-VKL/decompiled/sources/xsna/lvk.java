package xsna;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: DataStoreImpl.kt */
@b6l(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class lvk extends SuspendLambda implements izs<spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<Object> $newData;
    final /* synthetic */ Ref$IntRef $version;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvk(Ref$ObjectRef<Object> ref$ObjectRef, DataStoreImpl<Object> dataStoreImpl, Ref$IntRef ref$IntRef, spj<? super lvk> spjVar) {
        super(1, spjVar);
        this.$newData = ref$ObjectRef;
        this.this$0 = dataStoreImpl;
        this.$version = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new lvk(this.$newData, this.this$0, this.$version, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super s3q0> spjVar) {
        return ((lvk) create(spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$IntRef ref$IntRef;
        Object obj2;
        Ref$ObjectRef<Object> ref$ObjectRef;
        T t;
        Ref$IntRef ref$IntRef2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CorruptionException unused) {
            Ref$IntRef ref$IntRef3 = this.$version;
            DataStoreImpl<Object> dataStoreImpl = this.this$0;
            Object obj4 = this.$newData.element;
            this.L$0 = ref$IntRef3;
            this.label = 3;
            Object j = dataStoreImpl.j(obj4, true, this);
            if (j != coroutineSingletons) {
                ref$IntRef = ref$IntRef3;
                obj2 = j;
            }
        }
        if (i == 0) {
            kotlin.a.a(obj);
            ref$ObjectRef = this.$newData;
            DataStoreImpl<Object> dataStoreImpl2 = this.this$0;
            this.L$0 = ref$ObjectRef;
            this.label = 1;
            Object i2 = dataStoreImpl2.i(this);
            t = i2;
            if (i2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ref$IntRef2 = (Ref$IntRef) this.L$0;
                    kotlin.a.a(obj);
                    obj3 = obj;
                    ref$IntRef2.element = ((Number) obj3).intValue();
                    return s3q0.a;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$IntRef = (Ref$IntRef) this.L$0;
                kotlin.a.a(obj);
                obj2 = obj;
                ref$IntRef.element = ((Number) obj2).intValue();
                return s3q0.a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.a.a(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        ref$IntRef2 = this.$version;
        uax g = this.this$0.g();
        this.L$0 = ref$IntRef2;
        this.label = 2;
        Integer version = g.getVersion();
        obj3 = version;
        if (version == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$IntRef2.element = ((Number) obj3).intValue();
        return s3q0.a;
    }
}
