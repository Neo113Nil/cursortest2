package com.yandex.passport.internal.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.impl.KPassportUiApiImpl", f = "KPassportUiApiImpl.kt", l = {583, 594}, m = "showVpnBlockerIfNeeded")
/* loaded from: classes8.dex */
final class KPassportUiApiImpl$showVpnBlockerIfNeeded$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPassportUiApiImpl$showVpnBlockerIfNeeded$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(false, this);
    }
}
