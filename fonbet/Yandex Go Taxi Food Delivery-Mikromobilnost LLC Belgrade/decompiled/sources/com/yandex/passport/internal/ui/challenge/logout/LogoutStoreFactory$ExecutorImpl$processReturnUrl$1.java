package com.yandex.passport.internal.ui.challenge.logout;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.LogoutStoreFactory$ExecutorImpl", f = "LogoutStoreFactory.kt", l = {145, BlendingGradientView.BASE_ALPHA}, m = "processReturnUrl-OaxHe8w")
/* loaded from: classes2.dex */
final class LogoutStoreFactory$ExecutorImpl$processReturnUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutStoreFactory$ExecutorImpl$processReturnUrl$1(y yVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(null, this);
    }
}
