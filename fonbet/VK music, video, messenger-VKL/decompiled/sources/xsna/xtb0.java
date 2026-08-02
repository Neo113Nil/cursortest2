package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ltt;

/* compiled from: PollsControllerImpl.kt */
@b6l(c = "com.vk.uxpolls.presentation.controller.PollsControllerImpl$retrievePollsByIds$1", f = "PollsControllerImpl.kt", l = {71, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xtb0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $allowRequest;
    final /* synthetic */ List<Long> $ids;
    final /* synthetic */ String $notifier;
    final /* synthetic */ String $projectId;
    final /* synthetic */ izs<com.vk.uxpolls.presentation.js.model.a, s3q0> $result;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ytb0 this$0;

    /* compiled from: PollsControllerImpl.kt */
    @b6l(c = "com.vk.uxpolls.presentation.controller.PollsControllerImpl$retrievePollsByIds$1$1", f = "PollsControllerImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ UxPollsPoll $polls;
        final /* synthetic */ izs<com.vk.uxpolls.presentation.js.model.a, s3q0> $result;
        final /* synthetic */ List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> $translations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar, UxPollsPoll uxPollsPoll, List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> list, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$result = izsVar;
            this.$polls = uxPollsPoll;
            this.$translations = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$result, this.$polls, this.$translations, spjVar);
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
            this.$result.invoke(new com.vk.uxpolls.presentation.js.model.a(this.$polls, this.$translations));
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xtb0(ytb0 ytb0Var, String str, boolean z, List<Long> list, String str2, izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar, spj<? super xtb0> spjVar) {
        super(2, spjVar);
        this.this$0 = ytb0Var;
        this.$projectId = str;
        this.$allowRequest = z;
        this.$ids = list;
        this.$notifier = str2;
        this.$result = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xtb0 xtb0Var = new xtb0(this.this$0, this.$projectId, this.$allowRequest, this.$ids, this.$notifier, this.$result, spjVar);
        xtb0Var.L$0 = obj;
        return xtb0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xtb0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00be, code lost:
    
        if (xsna.myc0.k(r0, r4, r12) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r13 == r1) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ltt lttVar = (ltt) this.this$0.b.getValue();
            kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
            blq0 blq0Var = l4r0.a;
            asl b = lttVar.b(coroutineContext, new ltt.a.C3298a(blq0Var != null ? blq0Var : null, this.$projectId, this.$allowRequest, this.$ids, this.$notifier));
            this.L$0 = null;
            this.label = 1;
            obj = b.J(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        UxPollsPoll uxPollsPoll = (UxPollsPoll) j5g.a0((List) obj);
        if (uxPollsPoll == null) {
            return s3q0.a;
        }
        Iterable<BaseRequestParam> iterable = (Iterable) ((gqt) this.this$0.c.getValue()).a();
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (BaseRequestParam baseRequestParam : iterable) {
            arrayList.add(new VKWebAppEventData.VKWebAppUXPollsConfig.Translation(baseRequestParam.d(), baseRequestParam.e()));
        }
        bdn bdnVar = bdn.a;
        ge00 ge00Var = ie00.a;
        a aVar = new a(this.$result, uxPollsPoll, arrayList, null);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
