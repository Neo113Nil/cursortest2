package xsna;

import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh$observeAiAssistantEvent$1$invokeSuspend$$inlined$filter$1$2;
import com.vk.dto.common.id.UserId;
import com.vk.video.assistant.api.domain.model.AiAssistantEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AiAssistantCardVh.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh$observeAiAssistantEvent$1", f = "AiAssistantCardVh.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class kc1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ AiAssistantCardVh this$0;

    /* compiled from: AiAssistantCardVh.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ AiAssistantCardVh b;

        public a(AiAssistantCardVh aiAssistantCardVh) {
            this.b = aiAssistantCardVh;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            AiAssistantEvent aiAssistantEvent = (AiAssistantEvent) obj;
            if (aiAssistantEvent instanceof AiAssistantEvent.a) {
                ((AiAssistantEvent.a) aiAssistantEvent).getClass();
                AiAssistantCardVh aiAssistantCardVh = this.b;
                oc1 oc1Var = aiAssistantCardVh.k;
                if (epx.f(null, null)) {
                    aiAssistantCardVh.d();
                    new UserId(0L);
                    aiAssistantCardVh.d();
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc1(AiAssistantCardVh aiAssistantCardVh, spj<? super kc1> spjVar) {
        super(2, spjVar);
        this.this$0 = aiAssistantCardVh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kc1(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kc1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            caj0 a2 = this.this$0.d.a();
            a aVar = new a(this.this$0);
            this.label = 1;
            Object k = caj0.k(a2, new AiAssistantCardVh$observeAiAssistantEvent$1$invokeSuspend$$inlined$filter$1$2(aVar), this);
            if (k != obj2) {
                k = s3q0.a;
            }
            if (k == obj2) {
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
