package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountGetHelpHintsResponseDto;
import com.vk.api.generated.account.dto.AccountHelpHintDto;
import com.vk.api.generated.account.dto.AccountHelpHintResourceItemDto;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoAdsSuspendManagerImpl.kt */
@b6l(c = "com.vk.video.growth.impl.adssuspend.VideoAdsSuspendManagerImpl$checkSaaUnusedHintAndAdsSuspend$1", f = "VideoAdsSuspendManagerImpl.kt", l = {451}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class h0s0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ l0s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0s0(l0s0 l0s0Var, Context context, spj<? super h0s0> spjVar) {
        super(2, spjVar);
        this.this$0 = l0s0Var;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new h0s0(this.this$0, this.$context, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((h0s0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        LinkedHashMap linkedHashMap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iz2 A = yfb.A(bs.c(new es(), null, 7));
            this.label = 1;
            obj = evj.p(A, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        Iterator<T> it = ((AccountGetHelpHintsResponseDto) obj).d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            AccountHelpHintDto accountHelpHintDto = (AccountHelpHintDto) obj2;
            if (epx.f(accountHelpHintDto.getId(), HintId.ADS_SUSPENDED_SAA_UNUSED.getId()) || epx.f(accountHelpHintDto.getId(), HintId.ADS_SUSPENDED_SAA_UNUSED_60.getId()) || epx.f(accountHelpHintDto.getId(), HintId.ADS_SUSPENDED_SAA_UNUSED_90.getId())) {
                break;
            }
        }
        AccountHelpHintDto accountHelpHintDto2 = (AccountHelpHintDto) obj2;
        if (accountHelpHintDto2 != null) {
            l0s0 l0s0Var = this.this$0;
            Context context = this.$context;
            List<AccountHelpHintResourceItemDto> d = accountHelpHintDto2.d();
            if (d != null) {
                List<AccountHelpHintResourceItemDto> list = d;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                linkedHashMap = new LinkedHashMap(e);
                for (AccountHelpHintResourceItemDto accountHelpHintResourceItemDto : list) {
                    Pair pair = new Pair(accountHelpHintResourceItemDto.d(), accountHelpHintResourceItemDto.e());
                    linkedHashMap.put(pair.i(), pair.j());
                }
            } else {
                linkedHashMap = null;
            }
            l0s0Var.j(context, new Hint(accountHelpHintDto2.getId(), accountHelpHintDto2.getTitle(), accountHelpHintDto2.getDescription(), linkedHashMap != null ? new HashMap(linkedHashMap) : null), ((o0s0) l0s0Var.g.getValue()).a);
        }
        return s3q0.a;
    }
}
