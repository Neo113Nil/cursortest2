package com.ybsdk.di.modules.features.nfc;

import defpackage.egz;
import defpackage.j1;
import defpackage.nbp0;
import defpackage.pzt0;
import defpackage.q960;
import defpackage.tje;

/* loaded from: classes3.dex */
public final class a {
    public final q960 a;
    public final nbp0 b;
    public volatile pzt0 c;

    public a(q960 q960Var, egz egzVar, nbp0 nbp0Var) {
        this.a = q960Var;
        this.b = nbp0Var;
    }

    public final void a(j1 j1Var) {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c = tje.N(this.b.a, null, null, new NfcShortcutInteractorImpl$createShortcut$1(this, j1Var, null), 3);
    }
}
