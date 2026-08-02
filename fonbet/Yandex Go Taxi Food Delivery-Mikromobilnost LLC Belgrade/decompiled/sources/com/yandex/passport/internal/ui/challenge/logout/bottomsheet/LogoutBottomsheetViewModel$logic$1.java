package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetViewModel", f = "LogoutBottomsheetViewModel.kt", l = {101, 104, BuildConfig.API_LEVEL}, m = "logic")
/* loaded from: classes2.dex */
final class LogoutBottomsheetViewModel$logic$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomsheetViewModel$logic$1(x0 x0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return x0.W(this.this$0, null, this);
    }
}
