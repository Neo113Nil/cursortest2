package com.yandex.go.scooters.passes.details;

import android.graphics.Bitmap;
import android.view.View;
import defpackage.g16;
import defpackage.kdo0;
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
@mvg(c = "com.yandex.go.scooters.passes.details.ItemViewHolder$bindIcon$1", f = "ScootersPassesDetailsAdapter.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ItemViewHolder$bindIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ kdo0 $data;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemViewHolder$bindIcon$1(a aVar, kdo0 kdo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$data = kdo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ItemViewHolder$bindIcon$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ItemViewHolder$bindIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            int i2 = a.T;
            ListItemComponent listItemComponent2 = (ListItemComponent) ((View) aVar.R);
            g16 b = aVar.S.b().b(this.$data.b);
            this.L$0 = listItemComponent2;
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
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
        listItemComponent.setLeadImage((Bitmap) obj);
        return zy11.a;
    }
}
