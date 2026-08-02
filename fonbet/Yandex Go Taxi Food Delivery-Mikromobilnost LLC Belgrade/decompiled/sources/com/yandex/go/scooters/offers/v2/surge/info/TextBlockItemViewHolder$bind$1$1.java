package com.yandex.go.scooters.offers.v2.surge.info;

import android.graphics.drawable.Drawable;
import defpackage.d3p0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.TextBlockItemViewHolder$bind$1$1", f = "ScootersSurgeInfoAdapter.kt", l = {254}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class TextBlockItemViewHolder$bind$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d3p0 $data;
    final /* synthetic */ ListItemComponent $this_with;
    Object L$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextBlockItemViewHolder$bind$1$1(ListItemComponent listItemComponent, j jVar, d3p0 d3p0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_with = listItemComponent;
        this.this$0 = jVar;
        this.$data = d3p0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextBlockItemViewHolder$bind$1$1(this.$this_with, this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TextBlockItemViewHolder$bind$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ListItemComponent listItemComponent2 = this.$this_with;
            ru.yandex.taxi.widget.utils.e eVar = this.this$0.S;
            String str = this.$data.a;
            this.L$0 = listItemComponent2;
            this.label = 1;
            Object k = ru.yandex.taxi.widget.utils.e.k(eVar, str, null, this, 14);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = k;
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
