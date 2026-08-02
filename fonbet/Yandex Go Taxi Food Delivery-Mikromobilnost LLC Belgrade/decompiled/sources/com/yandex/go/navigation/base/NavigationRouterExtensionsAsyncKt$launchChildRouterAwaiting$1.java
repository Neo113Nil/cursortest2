package com.yandex.go.navigation.base;

import defpackage.mvg;
import defpackage.sy60;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.navigation.base.NavigationRouterExtensionsAsyncKt", f = "NavigationRouterExtensionsAsync.kt", l = {HProv.PP_HASHOID}, m = "launchChildRouterAwaiting", v = 2)
/* loaded from: classes12.dex */
final class NavigationRouterExtensionsAsyncKt$launchChildRouterAwaiting$1<CP, CI extends sy60> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(null, null, null, null, null, this);
    }
}
