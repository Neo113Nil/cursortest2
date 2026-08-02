package com.yandex.go.taxi.order.details.v1.elements.destination;

import android.graphics.drawable.BitmapDrawable;
import defpackage.i5j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.destination.DetailsCardDestinationStyleMapper$loadLeadIcon$2", f = "DetailsCardDestinationStyleMapper.kt", l = {185}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardDestinationStyleMapper$loadLeadIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ i5j $addressModel;
    final /* synthetic */ String $tag;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardDestinationStyleMapper$loadLeadIcon$2(d dVar, String str, i5j i5jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$tag = str;
        this.$addressModel = i5jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardDestinationStyleMapper$loadLeadIcon$2(this.this$0, this.$tag, this.$addressModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardDestinationStyleMapper$loadLeadIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.e;
            String str = this.$tag;
            this.label = 1;
            obj = e.f(eVar, str, null, this, 6);
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
        return bitmapDrawable != null ? bitmapDrawable : this.this$0.a.b(this.$addressModel.d);
    }
}
