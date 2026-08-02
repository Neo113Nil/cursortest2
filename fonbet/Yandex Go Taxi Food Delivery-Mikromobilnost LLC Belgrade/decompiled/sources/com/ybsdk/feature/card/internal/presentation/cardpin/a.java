package com.ybsdk.feature.card.internal.presentation.cardpin;

import com.ybsdk.feature.card.internal.interactors.h;
import defpackage.ds31;
import defpackage.gvu0;
import defpackage.nl8;
import defpackage.ol8;
import defpackage.pl8;
import defpackage.pz40;
import defpackage.ql8;
import defpackage.qn8;
import defpackage.rl8;
import defpackage.sl8;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tl8;
import defpackage.uc5;
import defpackage.vk11;
import defpackage.vm7;
import defpackage.we8;
import defpackage.x4c;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final h B;
    public final tfl0 C;
    public final qn8 D;
    public final CardPinScreenParams E;

    public a(h hVar, tfl0 tfl0Var, qn8 qn8Var, CardPinScreenParams cardPinScreenParams) {
        super(new we8(7), new vm7(15));
        this.B = hVar;
        this.C = tfl0Var;
        this.D = qn8Var;
        this.E = cardPinScreenParams;
    }

    public final void b0(int i) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        nl8 nl8Var = nl8.c;
        Object X = X();
        sl8 sl8Var = (sl8) X;
        if (!(sl8Var instanceof ol8) && !(sl8Var instanceof rl8)) {
            X = null;
        }
        sl8 sl8Var2 = (sl8) X;
        if (sl8Var2 == null) {
            return;
        }
        if (sl8Var2 instanceof ol8) {
            String str = ((ol8) sl8Var2).b + i;
            pz40 Y = Y();
            do {
                r0Var3 = (r0) Y;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, str.length() == 4 ? new pl8(str) : new ol8(str)));
            return;
        }
        if (sl8Var2 instanceof rl8) {
            rl8 rl8Var = (rl8) sl8Var2;
            String str2 = rl8Var.b;
            String str3 = rl8Var.c + i;
            if (str3.length() != 4) {
                pz40 Y2 = Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, new rl8(str2, str3)));
                return;
            }
            if (str2.equals(str3)) {
                h0(str3, null, null);
                return;
            }
            pz40 Y3 = Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, nl8Var));
        }
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        sl8 sl8Var;
        Object X = X();
        sl8 sl8Var2 = (sl8) X;
        if (!(sl8Var2 instanceof ol8) && !(sl8Var2 instanceof rl8)) {
            X = null;
        }
        sl8 sl8Var3 = (sl8) X;
        if (sl8Var3 != null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                if (sl8Var3 instanceof ol8) {
                    sl8Var = new ol8(gvu0.t0(1, ((ol8) sl8Var3).b));
                } else if (sl8Var3 instanceof rl8) {
                    rl8 rl8Var = (rl8) sl8Var3;
                    sl8Var = new rl8(rl8Var.b, gvu0.t0(1, rl8Var.c));
                } else {
                    sl8Var = sl8Var3;
                }
            } while (!r0Var.k(value, sl8Var));
        }
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        nl8 nl8Var = nl8.b;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nl8Var));
    }

    public final void e0(String str) {
        vk11 vk11Var;
        Object X = X();
        ql8 ql8Var = X instanceof ql8 ? (ql8) X : null;
        if (ql8Var == null || (vk11Var = ql8Var.b) == null) {
            x4c.g("Set pin 2fa failed: 2fadata null", null, null, null, 14);
        } else {
            h0(vk11Var.a, vk11Var.b, str);
        }
    }

    public final void f0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new ol8("")));
    }

    public final void g0() {
        r0 r0Var;
        Object value;
        Object X = X();
        pl8 pl8Var = X instanceof pl8 ? (pl8) X : null;
        if (pl8Var != null) {
            Z(tl8.a);
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new rl8(pl8Var.b, "")));
        }
    }

    public final void h0(String str, String str2, String str3) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new ql8(null)));
        tje.N(ds31.a(this), null, null, new CardPinCodeViewModel$tryUpload$2(this, str, str3, str2, null), 3);
    }
}
