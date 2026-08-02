package com.yandex.go.scooters.offers.v2.surge.info;

import android.graphics.drawable.BitmapDrawable;
import defpackage.dv4;
import defpackage.mvg;
import defpackage.n4v;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.BalanceBarView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1", f = "ScootersSurgeInfoAdapter.kt", l = {197}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1 extends SuspendLambda implements wls {
    final /* synthetic */ double $balance;
    final /* synthetic */ Integer $color;
    final /* synthetic */ String $targetIconUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1(a aVar, String str, Integer num, double d, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$targetIconUrl = str;
        this.$color = num;
        this.$balance = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1(this.this$0, this.$targetIconUrl, this.$color, this.$balance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BalanceItemViewHolder$loadTargetIconAndUpdateBalanceBar$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.S;
            String str = this.$targetIconUrl;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        BalanceBarView balanceBarView = (BalanceBarView) this.this$0.T.b;
        Integer num = this.$color;
        balanceBarView.updateState(new dv4(num != null ? num.intValue() : qje.t(xng0.controlMinor, balanceBarView.getContext()), (float) ((this.$balance + 1.0d) / 2.0d), bitmapDrawable != null ? new n4v(bitmapDrawable, this.$targetIconUrl) : null, true), true);
        return zy11.a;
    }
}
