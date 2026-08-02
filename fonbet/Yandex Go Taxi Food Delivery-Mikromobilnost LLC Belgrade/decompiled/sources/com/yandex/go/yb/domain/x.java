package com.yandex.go.yb.domain;

import android.net.Uri;
import defpackage.hbp0;
import defpackage.jpb;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mq4;
import defpackage.nk3;
import defpackage.qoi0;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.v770;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class x implements nk3 {
    public final /* synthetic */ y b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ v770 d;

    public x(y yVar, Uri uri, v770 v770Var) {
        this.b = yVar;
        this.c = uri;
        this.d = v770Var;
    }

    @Override // defpackage.nk3
    public final void b(Throwable th) {
        y yVar = this.b;
        yVar.getClass();
        jst.e.getClass();
        mq4 mq4Var = yVar.c;
        String d = th != null ? qoi0.a(th.getClass()).d() : null;
        String message = th != null ? th.getMessage() : null;
        mq4Var.getClass();
        HashMap hashMap = new HashMap();
        if (d != null) {
            hashMap.put("error", d);
        }
        if (message != null) {
            hashMap.put(Constants.KEY_MESSAGE, message);
        }
        mq4Var.a.a("BankSDKActivation.AuthFailed", hashMap, 1, new HashMap());
    }

    @Override // defpackage.nk3
    public final void onSuccess() {
        y yVar = this.b;
        boolean f = yVar.a.f();
        Uri uri = this.c;
        v770 v770Var = this.d;
        if (!f) {
            jst.e.getClass();
            yVar.j = new jpb(new u(yVar, uri, v770Var));
            return;
        }
        jst.e.getClass();
        hbp0 hbp0Var = yVar.e.a;
        yVar.f.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(hbp0Var, mdh.b, null, new YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1(yVar, uri, v770Var, null), 2);
    }
}
