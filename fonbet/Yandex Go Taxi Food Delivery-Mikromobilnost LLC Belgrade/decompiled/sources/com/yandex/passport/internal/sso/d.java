package com.yandex.passport.internal.sso;

import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes15.dex */
public final /* synthetic */ class d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ IReporterYandex b;

    public /* synthetic */ d(IReporterYandex iReporterYandex, int i) {
        this.a = i;
        this.b = iReporterYandex;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        IReporterYandex iReporterYandex = this.b;
        Exception exc = (Exception) obj;
        switch (i) {
            case 0:
                iReporterYandex.reportError(com.yandex.passport.internal.analytics.l.d.a, exc);
                break;
            case 1:
                iReporterYandex.reportError(com.yandex.passport.internal.analytics.l.d.a, exc);
                break;
            default:
                iReporterYandex.reportError(com.yandex.passport.internal.analytics.l.d.a, exc);
                break;
        }
        return zy11Var;
    }
}
