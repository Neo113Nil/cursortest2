package com.yandex.go.chargers.offer.ui.compose.ui.component;

import android.content.Context;
import androidx.compose.animation.core.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.i9a;
import defpackage.ljs0;
import defpackage.n8a;
import defpackage.nc3;
import defpackage.o430;
import defpackage.oz40;
import defpackage.pm9;
import defpackage.q791;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.vr60;
import defpackage.wls;
import defpackage.y7m;
import defpackage.zpn;

/* loaded from: classes12.dex */
public abstract class a {
    public static final SlotSize a = SlotSize.M;

    public static final void a(vr60 vr60Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1029852047);
        int i2 = 2;
        int i3 = (btsVar.k(vr60Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 256 : 128);
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            long d = rzo.d(s8o.m(vr60Var.b, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)));
            CharSequence charSequence = vr60Var.a;
            String str = vr60Var.d;
            String str2 = vr60Var.g;
            f530 c = ljs0.c(c530.a, 1.0f);
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new n8a(i2, tlsVar, vr60Var);
                btsVar.o0(Q);
            }
            pm9.a(q791.d(c, false, null, null, (sls) Q, 15), charSequence, str, d, str2, a, btsVar, 14155776);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i9a(vr60Var, tlsVar, i, i4);
        }
    }

    public static final nc3 b(vr60 vr60Var, bts btsVar) {
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = f.j(null);
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = f.j(Boolean.FALSE);
            btsVar.o0(Q2);
        }
        oz40 oz40Var2 = (oz40) Q2;
        boolean e = btsVar.e(vr60Var);
        Object Q3 = btsVar.Q();
        if (e || Q3 == o430Var) {
            Q3 = new ChargersOfferScreenAttentionKt$rememberAttentionHeaderState$1$1(vr60Var, oz40Var2, oz40Var, null);
            btsVar.o0(Q3);
        }
        zpn.e(btsVar, (wls) Q3, vr60Var);
        return new nc3((vr60) oz40Var.getValue(), ((y7m) b.a(((Boolean) oz40Var2.getValue()).booleanValue() ? a.getSize() : 0.0f, sb2.K(600, 0, null, 6), "attentionContentTopPadding", null, btsVar, 432, 8).getValue()).a);
    }
}
