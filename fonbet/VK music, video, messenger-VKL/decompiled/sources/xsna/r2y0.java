package xsna;

import com.vk.dto.common.Peer;
import com.vk.log.L;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: WriteRestrictionActionController.kt */
@b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$onEnableWriteSelected$1", f = "WriteRestrictionActionController.kt", l = {120}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r2y0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ o2y0 this$0;

    /* compiled from: WriteRestrictionActionController.kt */
    @b6l(c = "com.vk.im.chat.restriction.impl.ui.action.WriteRestrictionActionController$onEnableWriteSelected$1$1", f = "WriteRestrictionActionController.kt", l = {Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ o2y0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2y0 o2y0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = o2y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
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
                    long j = o2y0Var.a;
                    Peer peer = o2y0Var.b;
                    this.label = 1;
                    if (v2y0Var.b(j, peer, this) == coroutineSingletons) {
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
    public r2y0(o2y0 o2y0Var, spj<? super r2y0> spjVar) {
        super(2, spjVar);
        this.this$0 = o2y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r2y0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((r2y0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ovj b = hqu0.b();
            a aVar = new a(this.this$0, null);
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
