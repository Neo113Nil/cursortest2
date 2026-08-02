package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Process;
import com.google.android.play.integrity.internal.o;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.atx0;
import defpackage.gj61;
import defpackage.ji61;
import defpackage.sa81;

/* loaded from: classes11.dex */
final class ai extends o {
    final /* synthetic */ ji61 a;
    private final sa81 b = new sa81("OnRequestIntegrityTokenCallback");
    private final atx0 c;

    public ai(ji61 ji61Var, atx0 atx0Var) {
        this.a = ji61Var;
        this.c = atx0Var;
    }

    @Override // com.google.android.play.integrity.internal.o, com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.a.d.c(this.c);
        this.b.a("onRequestIntegrityToken", new Object[0]);
        this.a.c.getClass();
        int i = bundle.getInt("error");
        IntegrityServiceException integrityServiceException = i == 0 ? null : new IntegrityServiceException(i, null);
        if (integrityServiceException != null) {
            this.c.b(integrityServiceException);
            return;
        }
        String string = bundle.getString(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
        if (string == null) {
            this.c.b(new IntegrityServiceException(-100, null));
            return;
        }
        bundle.getLong("request.token.sid");
        String str = this.a.b;
        Process.myUid();
        Process.myPid();
        this.c.c(new gj61(string));
    }
}
