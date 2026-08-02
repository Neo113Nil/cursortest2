package com.yandex.go.navigation.base;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigation.base.NavigationRouterExtensionsAsyncKt", f = "NavigationRouterExtensionsAsync.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "waitForDismiss", v = 2)
/* loaded from: classes12.dex */
final class NavigationRouterExtensionsAsyncKt$waitForDismiss$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(null, this);
    }
}
