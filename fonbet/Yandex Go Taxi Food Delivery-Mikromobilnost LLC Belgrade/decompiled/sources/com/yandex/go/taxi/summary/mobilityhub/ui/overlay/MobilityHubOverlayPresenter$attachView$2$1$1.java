package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sv20;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "it", "Ltv20;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)Ltv20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.ui.overlay.MobilityHubOverlayPresenter$attachView$2$1$1", f = "MobilityHubOverlayPresenter.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubOverlayPresenter$attachView$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0l0 $route;
    int label;
    final /* synthetic */ sv20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubOverlayPresenter$attachView$2$1$1(sv20 sv20Var, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sv20Var;
        this.$route = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobilityHubOverlayPresenter$attachView$2$1$1(this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobilityHubOverlayPresenter$attachView$2$1$1) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.taxi.summary.mobilityhub.mapper.a aVar = this.this$0.C;
        Address h = this.$route.h();
        zzs B = h != null ? h.B() : null;
        Address b = this.$route.b();
        zzs B2 = b != null ? b.B() : null;
        this.label = 1;
        Object d = aVar.d(B, B2, this);
        return d == coroutineSingletons ? coroutineSingletons : d;
    }
}
