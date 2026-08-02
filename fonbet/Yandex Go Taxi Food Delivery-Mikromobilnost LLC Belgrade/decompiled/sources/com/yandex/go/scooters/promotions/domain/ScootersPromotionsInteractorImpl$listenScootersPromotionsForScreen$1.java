package com.yandex.go.scooters.promotions.domain;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import defpackage.boo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.yno0;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "batteryStatePercent", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lyno0;", "<anonymous>", "(ILru/yandex/taxi/theme/ThemeType;)Lyno0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promotions.domain.ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1", f = "ScootersPromotionsInteractorImpl.kt", l = {31, 35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1 extends SuspendLambda implements zls {
    final /* synthetic */ ScootersPromotionsScreen $screen;
    /* synthetic */ int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1(a aVar, ScootersPromotionsScreen scootersPromotionsScreen, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
        this.$screen = scootersPromotionsScreen;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1 scootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1 = new ScootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1(this.this$0, this.$screen, (Continuation) obj3);
        scootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1.I$0 = intValue;
        return scootersPromotionsInteractorImpl$listenScootersPromotionsForScreen$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object a;
        ScootersPromoblockResponse.ScootersPromo scootersPromo;
        a aVar2;
        ScootersPromoblockResponse.PromotionsCommunication promotionsCommunication;
        String str;
        ScootersPromoblockResponse.PromotionsCommunication promotionsCommunication2;
        FormattedText formattedText;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                b.b(obj);
                aVar = this.this$0;
                ScootersPromotionsScreen scootersPromotionsScreen = this.$screen;
                com.yandex.go.scooters.promotions.data.a aVar3 = aVar.e;
                Integer num = new Integer(i);
                this.L$0 = aVar;
                this.I$0 = i;
                this.label = 1;
                a = aVar3.a(scootersPromotionsScreen, num, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar2 = (a) this.L$0;
                    b.b(obj);
                    ((boo0) aVar2.d).c((yno0) obj);
                    return (yno0) obj;
                }
                a aVar4 = (a) this.L$0;
                b.b(obj);
                a = obj;
                aVar = aVar4;
            }
            ScootersPromoblockResponse scootersPromoblockResponse = (ScootersPromoblockResponse) a;
            ScootersPromoblockResponse.ScootersPromo scootersPromo2 = scootersPromoblockResponse.a;
            if ((scootersPromo2 == null || (promotionsCommunication2 = scootersPromo2.a) == null || (formattedText = promotionsCommunication2.b) == null || !formattedText.a.isEmpty()) && ((scootersPromo = scootersPromoblockResponse.a) == null || (promotionsCommunication = scootersPromo.a) == null || (str = promotionsCommunication.a) == null || str.length() != 0)) {
                com.yandex.go.scooters.promotions.data.mapper.a aVar5 = aVar.c;
                this.L$0 = aVar;
                this.L$1 = null;
                this.I$0 = i;
                this.label = 2;
                Object b = aVar5.b(scootersPromoblockResponse, this);
                if (b != coroutineSingletons) {
                    a aVar6 = aVar;
                    obj = b;
                    aVar2 = aVar6;
                    ((boo0) aVar2.d).c((yno0) obj);
                    return (yno0) obj;
                }
                return coroutineSingletons;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return null;
    }
}
