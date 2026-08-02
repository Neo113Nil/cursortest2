package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputViewController", f = "CardInputViewController.kt", l = {372}, m = "waitForBinInfoIfNeeded$features_bdui_release")
/* loaded from: classes12.dex */
final class CardInputViewController$waitForBinInfoIfNeeded$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardInputViewController$waitForBinInfoIfNeeded$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k(this);
    }
}
