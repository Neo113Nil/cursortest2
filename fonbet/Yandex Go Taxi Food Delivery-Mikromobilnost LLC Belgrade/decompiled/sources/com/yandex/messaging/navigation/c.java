package com.yandex.messaging.navigation;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import defpackage.asb1;
import defpackage.eja1;
import defpackage.fse;
import defpackage.hjt;
import defpackage.ike;
import defpackage.kse;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.vse;
import defpackage.zq60;

/* loaded from: classes15.dex */
public final class c implements tse {
    public final Fragment a;
    public final vse b;
    public final kse c;
    public final zq60 w = new zq60();
    public final ike x;

    public c(Fragment fragment, vse vseVar, kse kseVar) {
        this.a = fragment;
        this.b = vseVar;
        this.c = kseVar;
        this.x = asb1.d(eja1.s(fragment));
        fragment.getLifecycle().a(new b(this));
    }

    public final void a(tls tlsVar) {
        if (this.a.getLifecycle().b() != Lifecycle.State.DESTROYED) {
            this.w.b(tlsVar);
            return;
        }
        this.b.getClass();
        tje.N(hjt.a, this.c.b, null, new MessengerFragmentScope$onDestroy$1(tlsVar, null), 2);
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.x.a;
    }
}
