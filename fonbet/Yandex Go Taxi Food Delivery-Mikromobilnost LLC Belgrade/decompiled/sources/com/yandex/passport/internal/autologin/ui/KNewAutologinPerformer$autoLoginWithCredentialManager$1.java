package com.yandex.passport.internal.autologin.ui;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.internal.autologin.ui.KNewAutologinPerformer", f = "KNewAutologinPerformer.kt", l = {BuildConfig.API_LEVEL, 120, HProv.PP_SAME_MEDIA, HProv.PP_FAST_CODE}, m = "autoLoginWithCredentialManager")
/* loaded from: classes15.dex */
final class KNewAutologinPerformer$autoLoginWithCredentialManager$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KNewAutologinPerformer$autoLoginWithCredentialManager$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return j.a(this.this$0, null, this);
    }
}
