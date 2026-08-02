package xsna;

import com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$1$invokeSuspend$$inlined$filter$1$2;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.dto.common.VideoFile;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InitDelegate.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.video.largelist.actor.delegate.InitDelegateKt$registerLegacyForceUpdates$1", f = "InitDelegate.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class iyw extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ars0 $this_registerLegacyForceUpdates;
    int label;

    /* compiled from: InitDelegate.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ ars0 b;

        public a(ars0 ars0Var) {
            this.b = ars0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            VideoFile A;
            VideoFile A2;
            bwr0 bwr0Var = (bwr0) obj;
            boolean z = bwr0Var instanceof wxr0;
            ars0 ars0Var = this.b;
            if (z) {
                yg5 yg5Var = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).r;
                if (yg5Var != null && (A2 = yg5Var.A()) != null) {
                    A2.Xa(false);
                }
                ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).t.a.Xa(false);
            } else if (bwr0Var instanceof cwr0) {
                yg5 yg5Var2 = ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).r;
                if (yg5Var2 != null && (A = yg5Var2.A()) != null) {
                    A.Xa(true);
                }
                ((VideoLargeListState) ((b2a) ars0Var.b.b).getCurrentState()).t.a.Xa(true);
            }
            ars0Var.m(new byo(6));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyw(ars0 ars0Var, spj<? super iyw> spjVar) {
        super(2, spjVar);
        this.$this_registerLegacyForceUpdates = ars0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new iyw(this.$this_registerLegacyForceUpdates, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((iyw) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nb9 a2 = cdn.a(wjs0.b);
            ars0 ars0Var = this.$this_registerLegacyForceUpdates;
            a aVar = new a(ars0Var);
            this.label = 1;
            Object collect = a2.collect(new InitDelegateKt$registerLegacyForceUpdates$1$invokeSuspend$$inlined$filter$1$2(aVar, ars0Var), this);
            if (collect != coroutineSingletons) {
                collect = s3q0.a;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
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
