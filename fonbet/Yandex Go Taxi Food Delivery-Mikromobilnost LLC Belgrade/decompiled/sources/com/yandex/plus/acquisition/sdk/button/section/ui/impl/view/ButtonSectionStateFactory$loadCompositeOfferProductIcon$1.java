package com.yandex.plus.acquisition.sdk.button.section.ui.impl.view;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.ButtonSectionStateFactory", f = "ButtonSectionStateFactory.kt", l = {220}, m = "loadCompositeOfferProductIcon")
/* loaded from: classes2.dex */
final class ButtonSectionStateFactory$loadCompositeOfferProductIcon$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonSectionStateFactory$loadCompositeOfferProductIcon$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, this);
    }
}
