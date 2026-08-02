package com.ybsdk.feature.autotopup.internal.presentation.instruction;

import com.ybsdk.feature.autotopup.internal.data.b;
import defpackage.aw3;
import defpackage.ds31;
import defpackage.f02;
import defpackage.fw3;
import defpackage.iz3;
import defpackage.l04;
import defpackage.pz40;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tv3;
import defpackage.uc5;
import defpackage.uk11;
import defpackage.us3;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final AutoTopupInstructionParams B;
    public final tfl0 C;
    public final uk11 D;
    public final iz3 E;
    public final b F;
    public final us3 G;
    public final l04 H;
    public final tv3 I;

    public a(fw3 fw3Var, AutoTopupInstructionParams autoTopupInstructionParams, tfl0 tfl0Var, uk11 uk11Var, iz3 iz3Var, b bVar, us3 us3Var, l04 l04Var, tv3 tv3Var) {
        super(new f02(8, autoTopupInstructionParams), fw3Var);
        this.B = autoTopupInstructionParams;
        this.C = tfl0Var;
        this.D = uk11Var;
        this.E = iz3Var;
        this.F = bVar;
        this.G = us3Var;
        this.H = l04Var;
        this.I = tv3Var;
        us3Var.a.e.a.a("auto_topup.binding_payment.loaded", null);
    }

    public final void b0() {
        this.C.e();
    }

    public final void c0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, aw3.a((aw3) value, null, true, 767)));
        tje.N(ds31.a(this), null, null, new AutoTopupInstructionViewModel$saveTopup$2(this, str, null), 3);
    }
}
