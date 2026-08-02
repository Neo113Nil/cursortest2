package com.yandex.go.payments.menu.navigation;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.menu.navigation.MenuPaymentMethodsListRouter", f = "MenuPaymentMethodsListRouter.kt", l = {BuildConfig.API_LEVEL, HProv.PP_SAME_MEDIA}, m = "openPaymentsList", v = 2)
/* loaded from: classes8.dex */
final class MenuPaymentMethodsListRouter$openPaymentsList$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuPaymentMethodsListRouter$openPaymentsList$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.Q(this.this$0, null, this);
    }
}
