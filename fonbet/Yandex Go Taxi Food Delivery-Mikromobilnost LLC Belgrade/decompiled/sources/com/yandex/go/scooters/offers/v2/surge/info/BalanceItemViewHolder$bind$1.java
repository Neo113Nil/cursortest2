package com.yandex.go.scooters.offers.v2.surge.info;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.z2p0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.BalanceItemViewHolder$bind$1", f = "ScootersSurgeInfoAdapter.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BalanceItemViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ z2p0 $data;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceItemViewHolder$bind$1(a aVar, z2p0 z2p0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = z2p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BalanceItemViewHolder$bind$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BalanceItemViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.U;
            ListItemComponent listItemComponent2 = (ListItemComponent) ((View) aVar.R);
            ru.yandex.taxi.widget.utils.e eVar = aVar.S;
            String str = this.$data.e;
            this.L$0 = listItemComponent2;
            this.label = 1;
            obj = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            listItemComponent = listItemComponent2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            listItemComponent = (ListItemComponent) this.L$0;
            kotlin.b.b(obj);
        }
        listItemComponent.setLeadImage((Drawable) obj);
        return zy11.a;
    }
}
