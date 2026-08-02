package xsna;

import com.vk.im.sync.impl.ImEngineInvalidateSyncHandler$startEventsObserving$1$invokeSuspend$$inlined$filterIsInstance$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ImEngineInvalidateSyncHandler.kt */
@b6l(c = "com.vk.im.sync.impl.ImEngineInvalidateSyncHandler$startEventsObserving$1", f = "ImEngineInvalidateSyncHandler.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o1w extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ p1w this$0;

    /* compiled from: ImEngineInvalidateSyncHandler.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ p1w b;

        public a(p1w p1wVar) {
            this.b = p1wVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            this.b.b.invoke(Boolean.valueOf(((p680) obj).c));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1w(p1w p1wVar, spj<? super o1w> spjVar) {
        super(2, spjVar);
        this.this$0 = p1wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new o1w(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((o1w) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ksr<sxp> a2 = this.this$0.a.a();
            a aVar = new a(this.this$0);
            this.label = 1;
            Object collect = a2.collect(new ImEngineInvalidateSyncHandler$startEventsObserving$1$invokeSuspend$$inlined$filterIsInstance$1$2(aVar), this);
            if (collect != obj2) {
                collect = s3q0.a;
            }
            if (collect == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
