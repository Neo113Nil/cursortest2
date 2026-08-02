package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1", f = "ButtonSectionStateFactory.kt", l = {199}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ PlusAcquisitionSmartOffer.Texts $texts;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1(a aVar, PlusAcquisitionSmartOffer.Texts texts, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$texts = texts;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1(this.this$0, this.$texts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ButtonSectionStateFactory$createButtonSectionOfferForComposite$2$1$tariffIconDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        String str = this.$texts.getCompositeTariffTexts().d;
        this.label = 1;
        Object a = a.a(aVar, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
