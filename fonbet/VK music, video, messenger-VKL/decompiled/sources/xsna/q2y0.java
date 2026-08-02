package xsna;

import com.vk.dto.common.Peer;
import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionActionController.kt */
@b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$onDurationSelected$1", f = "WriteRestrictionActionController.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q2y0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $durationSec;
    int label;
    final /* synthetic */ o2y0 this$0;

    /* compiled from: WriteRestrictionActionController.kt */
    @b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$onDurationSelected$1$1", f = "WriteRestrictionActionController.kt", l = {112}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ int $durationSec;
        int label;
        final /* synthetic */ o2y0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2y0 o2y0Var, int i, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = o2y0Var;
            this.$durationSec = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$durationSec, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    o2y0 o2y0Var = this.this$0;
                    v2y0 v2y0Var = o2y0Var.d;
                    int i2 = this.$durationSec;
                    long j = o2y0Var.a;
                    Peer peer = o2y0Var.b;
                    this.label = 1;
                    if (v2y0Var.a(i2, j, peer, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
            } catch (Exception e) {
                L.i(e);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2y0(o2y0 o2y0Var, int i, spj<? super q2y0> spjVar) {
        super(2, spjVar);
        this.this$0 = o2y0Var;
        this.$durationSec = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new q2y0(this.this$0, this.$durationSec, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((q2y0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ovj b = hqu0.b();
            a aVar = new a(this.this$0, this.$durationSec, null);
            this.label = 1;
            if (myc0.k(b, aVar, this) == coroutineSingletons) {
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
