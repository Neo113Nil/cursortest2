package xsna;

import com.vk.video.ui.discovery.minimizable.c;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SubscriptionProposalHolder.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$startProgressTimer$1", f = "SubscriptionProposalHolder.kt", l = {Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class rzm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $advertDurationSec;
    float F$0;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ szm0 this$0;

    /* compiled from: SubscriptionProposalHolder.kt */
    @b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$startProgressTimer$1$1", f = "SubscriptionProposalHolder.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;
        final /* synthetic */ szm0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(szm0 szm0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = szm0Var;
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
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.this$0.g.invoke(c.u0.b);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzm0(long j, szm0 szm0Var, spj<? super rzm0> spjVar) {
        super(2, spjVar);
        this.$advertDurationSec = j;
        this.this$0 = szm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new rzm0(this.$advertDurationSec, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((rzm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (xsna.qsl.b(100, r14) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (xsna.myc0.k(r15, r1, r14) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r6 <= r8) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005e -> B:12:0x0061). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        long c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            j = this.$advertDurationSec * 1000;
            c = tyx.c(j, 0L, -100L);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            c = this.J$1;
            j = this.J$0;
            kotlin.a.a(obj);
            if (j != c) {
                j -= 100;
                float f = 100 - (((j / 1000) * 100.0f) / this.$advertDurationSec);
                this.this$0.g.invoke(new c.w0((int) f));
                this.J$0 = j;
                this.J$1 = c;
                this.F$0 = f;
                this.label = 1;
            }
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            a aVar = new a(this.this$0, null);
            this.label = 2;
        }
    }
}
