package com.yandex.go.navigator.map_interactions.parkings;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/yandex/go/address/models/Address;", "it"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigator.map_interactions.parkings.CarParksUiStateInteractor$contentFlow$3", f = "CarParksUiStateInteractor.kt", l = {HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CarParksUiStateInteractor$contentFlow$3 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geoPoint;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarParksUiStateInteractor$contentFlow$3(h hVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$geoPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CarParksUiStateInteractor$contentFlow$3 carParksUiStateInteractor$contentFlow$3 = new CarParksUiStateInteractor$contentFlow$3(this.this$0, this.$geoPoint, continuation);
        carParksUiStateInteractor$contentFlow$3.L$0 = obj;
        return carParksUiStateInteractor$contentFlow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CarParksUiStateInteractor$contentFlow$3) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.deeplinks.e eVar = this.this$0.d;
            zzs zzsVar = this.$geoPoint;
            this.L$0 = null;
            this.L$1 = str;
            this.label = 1;
            obj = ru.yandex.taxi.deeplinks.e.b(eVar, zzsVar, this, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            kotlin.b.b(obj);
        }
        return new Pair(str, ((pv0) obj).a);
    }
}
