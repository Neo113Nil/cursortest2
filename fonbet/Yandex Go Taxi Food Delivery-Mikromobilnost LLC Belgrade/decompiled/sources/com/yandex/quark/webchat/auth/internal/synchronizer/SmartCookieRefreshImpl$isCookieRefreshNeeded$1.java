package com.yandex.quark.webchat.auth.internal.synchronizer;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.quark.webchat.auth.internal.synchronizer.SmartCookieRefreshImpl", f = "SmartCookieRefresh.kt", l = {HProv.ALG_SID_SHA3_224}, m = "isCookieRefreshNeeded-qnf1wEk")
/* loaded from: classes11.dex */
final class SmartCookieRefreshImpl$isCookieRefreshNeeded$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartCookieRefreshImpl$isCookieRefreshNeeded$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
