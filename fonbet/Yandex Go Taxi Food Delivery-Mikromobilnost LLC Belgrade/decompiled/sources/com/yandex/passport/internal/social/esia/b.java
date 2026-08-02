package com.yandex.passport.internal.social.esia;

import android.net.Uri;
import defpackage.mx60;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ EsiaBindActivity b;

    public /* synthetic */ b(EsiaBindActivity esiaBindActivity, int i) {
        this.a = i;
        this.b = esiaBindActivity;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onCreate$lambda$5;
        int i = this.a;
        EsiaBindActivity esiaBindActivity = this.b;
        switch (i) {
            case 0:
                onCreate$lambda$5 = EsiaBindActivity.onCreate$lambda$5(esiaBindActivity, (mx60) obj);
                return onCreate$lambda$5;
            default:
                esiaBindActivity.launchEsiaDeepLink((Uri) obj);
                return zy11.a;
        }
    }
}
