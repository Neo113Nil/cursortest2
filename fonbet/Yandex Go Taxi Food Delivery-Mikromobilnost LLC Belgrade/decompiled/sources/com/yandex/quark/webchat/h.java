package com.yandex.quark.webchat;

import androidx.lifecycle.DefaultLifecycleObserver;
import defpackage.br41;
import defpackage.cr41;
import defpackage.ep41;
import defpackage.hg41;
import defpackage.ne41;
import defpackage.pey;
import defpackage.sls;
import defpackage.tls;
import defpackage.vd41;
import defpackage.xo41;
import defpackage.y3x0;
import defpackage.yo41;
import defpackage.zq6;
import defpackage.zwf0;

/* loaded from: classes8.dex */
public final class h implements DefaultLifecycleObserver {
    public final ne41 A;
    public final hg41 a;
    public final zwf0 b;
    public final zq6 c;
    public final ep41 w;
    public final tls x;
    public final sls y;
    public final vd41 z;

    public h(hg41 hg41Var, zwf0 zwf0Var, zq6 zq6Var, ep41 ep41Var, tls tlsVar, sls slsVar, vd41 vd41Var, ne41 ne41Var) {
        this.a = hg41Var;
        this.b = zwf0Var;
        this.c = zq6Var;
        this.w = ep41Var;
        this.x = tlsVar;
        this.y = slsVar;
        this.z = vd41Var;
        this.A = ne41Var;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        ((y3x0) this.a).e.onPause();
        this.w.c(xo41.a);
        this.b.e("WebChatViewController", "WebContent paused");
        this.c.b(br41.d);
        ((WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$2) this.y).invoke();
        this.z.stop();
        this.A.getClass();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        hg41 hg41Var = this.a;
        ((y3x0) hg41Var).e.onResume();
        this.w.c(new yo41(hg41Var));
        this.b.e("WebChatViewController", "WebContent resumed");
        this.c.b(cr41.d);
        ((WebChatViewControllerImpl$observeLifecycle$1$lifecycleObserver$1) this.x).invoke(peyVar);
        this.z.start();
        this.A.getClass();
    }
}
