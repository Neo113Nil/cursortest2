package com.yandex.go.platform.navigation.impl;

import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class NavigationPresenter$observeBarVisibility$1 extends AdaptedFunctionReference implements wls {
    public final Object b(boolean z, Continuation continuation) {
        d dVar = (d) this.receiver;
        tje.N(dVar.l, null, null, new NavigatorViewHolderImpl$setBarVisibility$1(dVar, z, null), 3);
        return zy11.a;
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b(((Boolean) obj).booleanValue(), (Continuation) obj2);
        return zy11.a;
    }
}
