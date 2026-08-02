package com.google.android.gms.internal.play_billing;

import defpackage.cvb1;
import defpackage.nqb1;
import defpackage.vsb1;
import defpackage.zfb1;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class l0 {
    public Serializable a;
    public vsb1 b;
    public cvb1 c;
    public boolean d;

    public final void finalize() {
        cvb1 cvb1Var;
        vsb1 vsb1Var = this.b;
        if (vsb1Var != null) {
            nqb1 nqb1Var = vsb1Var.b;
            if (!nqb1Var.isDone()) {
                if (zfb1.y.g(nqb1Var, null, new q(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)))))) {
                    zfb1.b(nqb1Var);
                }
            }
        }
        if (this.d || (cvb1Var = this.c) == null) {
            return;
        }
        cvb1Var.i(null);
    }
}
