package com.yandex.plus.home.feature.webviews.internal.simple;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayoutPresenter", f = "SimpleWebViewLayoutPresenter.kt", l = {249}, m = "loadUriInternal")
/* loaded from: classes2.dex */
final class SimpleWebViewLayoutPresenter$loadUriInternal$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleWebViewLayoutPresenter$loadUriInternal$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.k(this.this$0, null, this);
    }
}
