package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.tkd0;
import xsna.yqu;

/* compiled from: ProductCardCommunityInfoTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoTaskExecutor$subscribeToGroup$1", f = "ProductCardCommunityInfoTaskExecutor.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class fkd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ hkd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkd0(hkd0 hkd0Var, spj<? super fkd0> spjVar) {
        super(2, spjVar);
        this.this$0 = hkd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fkd0 fkd0Var = new fkd0(this.this$0, spjVar);
        fkd0Var.L$0 = obj;
        return fkd0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fkd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                dkd0 dkd0Var = (dkd0) this.this$0.g.L.getValue();
                UserId a = fkq0.a(((nmd0) this.this$0.b.getCurrentState()).b);
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = ((nmd0) this.this$0.b.getCurrentState()).f;
                String name = commonMarketStat$TypeRefSource != null ? commonMarketStat$TypeRefSource.name() : null;
                GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = ((nmd0) this.this$0.b.getCurrentState()).e;
                String str = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
                this.L$0 = yvjVar;
                this.label = 1;
                obj = evj.p(yfb.A(yqu.a.c(dkd0Var.a, a, null, name, str, null, null, null, null, 498)), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            if (((BaseOkResponseDto) obj).i() == 1) {
                zvj.e(yvjVar);
                this.this$0.e(new yld0(true));
            }
        } catch (Exception e) {
            zvj.e(yvjVar);
            this.this$0.c(new tkd0.f(e));
        }
        return s3q0.a;
    }
}
