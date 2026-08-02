package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleViewModel", f = "PresaleViewModel.kt", l = {100, 101, 102, 103, 104, 105}, m = "createSuggestionContent")
/* loaded from: classes2.dex */
final class PresaleViewModel$createSuggestionContent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresaleViewModel$createSuggestionContent$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.W(this.this$0, null, this);
    }
}
