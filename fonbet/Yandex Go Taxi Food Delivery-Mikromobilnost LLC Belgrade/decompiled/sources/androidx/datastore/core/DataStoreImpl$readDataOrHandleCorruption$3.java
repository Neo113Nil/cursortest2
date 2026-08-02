package androidx.datastore.core;

import defpackage.f8w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {403, 404, 406}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DataStoreImpl$readDataOrHandleCorruption$3 extends SuspendLambda implements tls {
    final /* synthetic */ Ref$ObjectRef<Object> $newData;
    final /* synthetic */ Ref$IntRef $version;
    Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(Ref$ObjectRef ref$ObjectRef, f fVar, Ref$IntRef ref$IntRef, Continuation continuation) {
        super(1, continuation);
        this.$newData = ref$ObjectRef;
        this.this$0 = fVar;
        this.$version = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.$newData, this.this$0, this.$version, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ref$IntRef ref$IntRef;
        Ref$ObjectRef<Object> ref$ObjectRef;
        T t;
        Ref$IntRef ref$IntRef2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CorruptionException unused) {
            Ref$IntRef ref$IntRef3 = this.$version;
            f fVar = this.this$0;
            Object obj4 = this.$newData.element;
            this.L$0 = ref$IntRef3;
            this.label = 3;
            Object j = fVar.j(obj4, true, this);
            if (j != coroutineSingletons) {
                obj2 = j;
                ref$IntRef = ref$IntRef3;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            ref$ObjectRef = this.$newData;
            f fVar2 = this.this$0;
            this.L$0 = ref$ObjectRef;
            this.label = 1;
            Object i2 = fVar2.i(this);
            t = i2;
            if (i2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    ref$IntRef2 = (Ref$IntRef) this.L$0;
                    kotlin.b.b(obj);
                    obj3 = obj;
                    ref$IntRef2.element = ((Number) obj3).intValue();
                    return zy11.a;
                }
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$IntRef = (Ref$IntRef) this.L$0;
                kotlin.b.b(obj);
                obj2 = obj;
                ref$IntRef.element = ((Number) obj2).intValue();
                return zy11.a;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.b.b(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        ref$IntRef2 = this.$version;
        f8w h = this.this$0.h();
        this.L$0 = ref$IntRef2;
        this.label = 2;
        Object b = h.b(this);
        obj3 = b;
        if (b == coroutineSingletons) {
            return coroutineSingletons;
        }
        ref$IntRef2.element = ((Number) obj3).intValue();
        return zy11.a;
    }
}
