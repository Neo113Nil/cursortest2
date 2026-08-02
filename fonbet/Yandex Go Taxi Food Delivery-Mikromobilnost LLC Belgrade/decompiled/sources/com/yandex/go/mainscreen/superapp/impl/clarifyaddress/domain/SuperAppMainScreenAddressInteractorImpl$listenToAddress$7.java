package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.tje;
import defpackage.u0w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class SuperAppMainScreenAddressInteractorImpl$listenToAddress$7 extends AdaptedFunctionReference implements wls {
    public final Object b(String str) {
        u0w0 u0w0Var = (u0w0) this.receiver;
        tje.N(u0w0Var.b.a, null, null, new SuperAppMainFetchZoneInteractor$fetchNonCancelableZone$1(u0w0Var, str, null), 3);
        return zy11.a;
    }

    @Override // defpackage.wls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        b((String) obj);
        return zy11.a;
    }
}
