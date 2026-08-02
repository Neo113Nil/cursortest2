package com.yandex.go.taxi.order.details.v2.state.elements.slider;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import defpackage.g92;
import defpackage.ibk0;
import defpackage.ijk0;
import defpackage.ink0;
import defpackage.jnk0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yjk0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ltpr;", "Lzjk0;", "<anonymous>", "(Ltse;)Ltpr;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.slider.RideCardSliderItemDataSource$stateFlow$2", f = "RideCardSliderItemDataSource.kt", l = {37, 38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardSliderItemDataSource$stateFlow$2 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$Slider $item;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardSliderItemDataSource$stateFlow$2(a aVar, RideCardItemDto$Slider rideCardItemDto$Slider, Continuation continuation) {
        super(2, continuation);
        this.$item = rideCardItemDto$Slider;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardSliderItemDataSource$stateFlow$2 rideCardSliderItemDataSource$stateFlow$2 = new RideCardSliderItemDataSource$stateFlow$2(this.this$0, this.$item, continuation);
        rideCardSliderItemDataSource$stateFlow$2.L$0 = obj;
        return rideCardSliderItemDataSource$stateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardSliderItemDataSource$stateFlow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ibk0 ibk0Var;
        String str;
        Object s;
        noh nohVar;
        String str2;
        ibk0 ibk0Var2;
        String str3;
        ink0 ink0Var;
        String str4;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (!ijk0.b(this.$item)) {
                return new g92(2, new yjk0(this.$item.a));
            }
            ibk0Var = (ibk0) this.this$0.d.a(this.$item.d);
            qoh h = tje.h(tseVar, null, null, new RideCardSliderItemDataSource$stateFlow$2$idleState$1(this.this$0, this.$item, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new RideCardSliderItemDataSource$stateFlow$2$progressState$1(this.this$0, this.$item, null), 3);
            RideCardItemDto$Slider rideCardItemDto$Slider = this.$item;
            str = rideCardItemDto$Slider.a;
            String str5 = rideCardItemDto$Slider.b;
            this.L$0 = null;
            this.L$1 = ibk0Var;
            this.L$2 = null;
            this.L$3 = h2;
            this.L$4 = str;
            this.L$5 = str5;
            this.label = 1;
            s = h.s(this);
            if (s != coroutineSingletons) {
                nohVar = h2;
                str2 = str5;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ink0 ink0Var2 = (ink0) this.L$6;
            String str6 = (String) this.L$5;
            String str7 = (String) this.L$4;
            ibk0 ibk0Var3 = (ibk0) this.L$1;
            b.b(obj);
            ibk0Var2 = ibk0Var3;
            ink0Var = ink0Var2;
            str3 = str6;
            str4 = str7;
            return new g92(2, new jnk0(str4, str3, ink0Var, (ink0) obj, ibk0Var2));
        }
        str2 = (String) this.L$5;
        String str8 = (String) this.L$4;
        nohVar = (noh) this.L$3;
        ibk0 ibk0Var4 = (ibk0) this.L$1;
        b.b(obj);
        str = str8;
        s = obj;
        ibk0Var = ibk0Var4;
        ink0 ink0Var3 = (ink0) s;
        this.L$0 = null;
        this.L$1 = ibk0Var;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = str;
        this.L$5 = str2;
        this.L$6 = ink0Var3;
        this.label = 2;
        Object k = nohVar.k(this);
        if (k != coroutineSingletons) {
            ibk0Var2 = ibk0Var;
            str3 = str2;
            ink0Var = ink0Var3;
            str4 = str;
            obj = k;
            return new g92(2, new jnk0(str4, str3, ink0Var, (ink0) obj, ibk0Var2));
        }
        return coroutineSingletons;
    }
}
