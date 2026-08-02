package xsna;

import com.vk.games.model.GamesCatalogScreenTab;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogFeature.kt */
@b6l(c = "com.vk.games.presentation.catalog.mvi.GamesCatalogFeature$refreshTabInBackground$1", f = "GamesCatalogFeature.kt", l = {Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class wbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ GamesCatalogScreenTab $tab;
    int label;
    final /* synthetic */ xbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbt(xbt xbtVar, GamesCatalogScreenTab gamesCatalogScreenTab, spj<? super wbt> spjVar) {
        super(2, spjVar);
        this.this$0 = xbtVar;
        this.$tab = gamesCatalogScreenTab;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wbt(this.this$0, this.$tab, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            xbt xbtVar = this.this$0;
            ddt ddtVar = xbtVar.f;
            GamesCatalogScreenTab gamesCatalogScreenTab = this.$tab;
            boolean booleanValue = ((Boolean) xbtVar.n.getValue()).booleanValue();
            this.label = 1;
            if (ddtVar.a(gamesCatalogScreenTab, 0, booleanValue, this) == coroutineSingletons) {
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
