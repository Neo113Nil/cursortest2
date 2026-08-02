package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockAiAssistant;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAssistantShow;
import com.vk.video.assistant.api.domain.model.AiAssistantType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AiAssistantCardVh.kt */
@b6l(c = "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh$loadSearchPreview$1", f = "AiAssistantCardVh.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class jc1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $assistantTypeName;
    final /* synthetic */ String $query;
    final /* synthetic */ String $queryId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AiAssistantCardVh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(String str, AiAssistantCardVh aiAssistantCardVh, String str2, String str3, spj<? super jc1> spjVar) {
        super(2, spjVar);
        this.$assistantTypeName = str;
        this.this$0 = aiAssistantCardVh;
        this.$query = str2;
        this.$queryId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jc1(this.$assistantTypeName, this.this$0, this.$query, this.$queryId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jc1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AiAssistantType a;
        String str;
        Object obj2;
        UIBlockAiAssistant uIBlockAiAssistant;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            AiAssistantType.a aVar = AiAssistantType.Companion;
            String str2 = this.$assistantTypeName;
            aVar.getClass();
            a = AiAssistantType.a.a(str2);
            String valueOf = String.valueOf(System.currentTimeMillis());
            mc1 mc1Var = this.this$0.c;
            this.L$0 = a;
            this.L$1 = valueOf;
            this.label = 1;
            oc1 a2 = mc1Var.a();
            if (a2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = valueOf;
            obj2 = a2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            a = (AiAssistantType) this.L$0;
            kotlin.a.a(obj);
            obj2 = ((Result) obj).d();
        }
        AiAssistantCardVh aiAssistantCardVh = this.this$0;
        String str3 = this.$assistantTypeName;
        String str4 = this.$queryId;
        if (!(obj2 instanceof Result.Failure)) {
            oc1 oc1Var = (oc1) obj2;
            aiAssistantCardVh.k = oc1Var;
            vb1.b(new CommonVideoStat$TypeVideoAssistantShow(CommonVideoStat$TypeVideoAssistantShow.EventType.ASSISTANT_SHOW, vb1.a(str3), str4), str, String.valueOf(System.currentTimeMillis()));
            int i2 = AiAssistantCardVh.a.$EnumSwitchMapping$0[a.ordinal()];
            if (i2 == 1) {
                oc1Var.getClass();
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                oc1Var.getClass();
            }
            UIBlockAiAssistant uIBlockAiAssistant2 = aiAssistantCardVh.j;
            if (uIBlockAiAssistant2 != null) {
                aiAssistantCardVh.e.b(new xxf0(uIBlockAiAssistant2.Fb()), false);
            }
        }
        AiAssistantCardVh aiAssistantCardVh2 = this.this$0;
        if (Result.a(obj2) != null && (uIBlockAiAssistant = aiAssistantCardVh2.j) != null) {
            aiAssistantCardVh2.e.b(new xxf0(uIBlockAiAssistant.Fb()), false);
        }
        return s3q0.a;
    }
}
