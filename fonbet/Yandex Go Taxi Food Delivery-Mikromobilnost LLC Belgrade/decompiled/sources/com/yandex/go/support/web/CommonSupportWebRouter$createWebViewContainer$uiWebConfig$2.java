package com.yandex.go.support.web;

import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CommonSupportWebRouter$createWebViewContainer$uiWebConfig$2 extends FunctionReferenceImpl implements tls {
    public final void i(String str) {
        e eVar = (e) this.receiver;
        tje.N(eVar.o(), null, null, new CommonSupportWebRouter$onAnalyticsEvent$1(eVar, str, null), 3);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((String) obj);
        return zy11.a;
    }
}
