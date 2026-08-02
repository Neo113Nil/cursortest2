package com.yandex.go.yb.domain;

import android.net.Uri;
import defpackage.hbp0;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.v770;

/* loaded from: classes15.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ y a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ v770 c;

    public /* synthetic */ u(y yVar, Uri uri, v770 v770Var) {
        this.a = yVar;
        this.b = uri;
        this.c = v770Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.a;
        hbp0 hbp0Var = yVar.e.a;
        yVar.f.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(hbp0Var, mdh.b, null, new YbSdkDeeplinkHandlerImpl$handleDeeplinkAuthorized$1(yVar, this.b, this.c, null), 2);
    }
}
