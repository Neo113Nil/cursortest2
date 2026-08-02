package xsna;

import com.vk.uxpolls.api.models.BaseRequestParam;
import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import com.vk.uxpolls.presentation.view.PollsWebView;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ltt;

/* compiled from: PollsControllerImpl.kt */
/* loaded from: classes6.dex */
public final class ytb0 implements wtb0 {
    public final PollsWebView a;
    public final bpn0 b = new bpn0(new iz3(23));
    public final bpn0 c = new bpn0(new wv0(26));

    /* compiled from: PollsControllerImpl.kt */
    @b6l(c = "com.vk.uxpolls.presentation.controller.PollsControllerImpl$retrievePollsByTriggers$1", f = "PollsControllerImpl.kt", l = {44, 48}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $allowRequest;
        final /* synthetic */ String $notifier;
        final /* synthetic */ String $projectId;
        final /* synthetic */ izs<com.vk.uxpolls.presentation.js.model.a, s3q0> $result;
        final /* synthetic */ List<String> $triggers;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: PollsControllerImpl.kt */
        @b6l(c = "com.vk.uxpolls.presentation.controller.PollsControllerImpl$retrievePollsByTriggers$1$1", f = "PollsControllerImpl.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.ytb0$a$a, reason: collision with other inner class name */
        public static final class C4137a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ UxPollsPoll $polls;
            final /* synthetic */ izs<com.vk.uxpolls.presentation.js.model.a, s3q0> $result;
            final /* synthetic */ List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> $translations;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4137a(izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar, UxPollsPoll uxPollsPoll, List<VKWebAppEventData.VKWebAppUXPollsConfig.Translation> list, spj<? super C4137a> spjVar) {
                super(2, spjVar);
                this.$result = izsVar;
                this.$polls = uxPollsPoll;
                this.$translations = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C4137a(this.$result, this.$polls, this.$translations, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4137a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
        public a(String str, boolean z, List<String> list, String str2, izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$projectId = str;
            this.$allowRequest = z;
            this.$triggers = list;
            this.$notifier = str2;
            this.$result = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = ytb0.this.new a(this.$projectId, this.$allowRequest, this.$triggers, this.$notifier, this.$result, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
                ltt lttVar = (ltt) ytb0.this.b.getValue();
                kotlin.coroutines.d coroutineContext = yvjVar.getCoroutineContext();
                blq0 blq0Var = l4r0.a;
                asl b = lttVar.b(coroutineContext, new ltt.a.b(blq0Var != null ? blq0Var : null, this.$projectId, this.$allowRequest, this.$triggers, this.$notifier));
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
            Iterable<BaseRequestParam> iterable = (Iterable) ((gqt) ytb0.this.c.getValue()).a();
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            for (BaseRequestParam baseRequestParam : iterable) {
                arrayList.add(new VKWebAppEventData.VKWebAppUXPollsConfig.Translation(baseRequestParam.d(), baseRequestParam.e()));
            }
            bdn bdnVar = bdn.a;
            ge00 ge00Var = ie00.a;
            C4137a c4137a = new C4137a(this.$result, uxPollsPoll, arrayList, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
    }

    public ytb0(PollsWebView pollsWebView) {
        this.a = pollsWebView;
    }

    @Override // xsna.wtb0
    public final void a(List<String> list, boolean z, izs<? super com.vk.uxpolls.presentation.js.model.a, s3q0> izsVar) {
        String a2;
        d4e0 d4e0Var = l4r0.b;
        if (d4e0Var == null || (a2 = d4e0Var.a()) == null) {
            return;
        }
        myc0.h(vwt0.a(this.a), l4r0.c, null, new a(a2, z, list, null, izsVar, null), 2);
    }

    @Override // xsna.wtb0
    public final void c(List list, w910 w910Var) {
        String a2;
        d4e0 d4e0Var = l4r0.b;
        if (d4e0Var == null || (a2 = d4e0Var.a()) == null) {
            return;
        }
        myc0.h(vwt0.a(this.a), l4r0.c, null, new xtb0(this, a2, true, list, null, w910Var, null), 2);
    }
}
