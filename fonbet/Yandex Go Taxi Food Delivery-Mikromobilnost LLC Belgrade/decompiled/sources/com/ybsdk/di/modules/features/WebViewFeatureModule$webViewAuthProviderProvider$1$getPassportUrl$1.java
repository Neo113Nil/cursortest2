package com.ybsdk.di.modules.features;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.di.modules.features.WebViewFeatureModule$webViewAuthProviderProvider$1", f = "WebViewFeatureModule.kt", l = {HProv.PP_INFO, Constants.VPN_TRAFFIC, 122}, m = "getPassportUrl-gIAlu-s")
/* loaded from: classes3.dex */
final class WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewFeatureModule$webViewAuthProviderProvider$1$getPassportUrl$1(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object a = this.this$0.a(null, this);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : new Result(a);
    }
}
