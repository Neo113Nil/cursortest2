package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsViewModel", f = "SettingsViewModel.kt", l = {306, 325}, m = "callCommonSettingsUpdate-0E7RQCE")
/* loaded from: classes3.dex */
final class SettingsViewModel$callCommonSettingsUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$callCommonSettingsUpdate$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b0 = this.this$0.b0(null, null, this);
        return b0 == CoroutineSingletons.COROUTINE_SUSPENDED ? b0 : new Result(b0);
    }
}
