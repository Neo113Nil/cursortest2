package com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images;

import android.view.View;
import defpackage.fug0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.recycler.viewholders.images.BaseImagesSliderViewHolder$1", f = "BaseImagesSliderViewHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BaseImagesSliderViewHolder$1 extends SuspendLambda implements wls {
    final /* synthetic */ zo31 $binding;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImagesSliderViewHolder$1(a aVar, zo31 zo31Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$binding = zo31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseImagesSliderViewHolder$1(this.this$0, this.$binding, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseImagesSliderViewHolder$1 baseImagesSliderViewHolder$1 = (BaseImagesSliderViewHolder$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseImagesSliderViewHolder$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!this.this$0.T.a) {
            View root = this.$binding.getRoot();
            root.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(ru.yandex.taxi.design.utils.c.d(fug0.discovery_organizations_card_image_slider_corner_round_size, this.this$0.a)));
            root.setClipToOutline(true);
        }
        return zy11.a;
    }
}
