package com.yandex.go.summary.requirements.list.requirementgroup.commentmodal;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.ahj0;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.dr5;
import defpackage.fid;
import defpackage.lt90;
import defpackage.o430;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.pw91;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(ahj0 ahj0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(95440873);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(ahj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                String str = ahj0Var.a.e;
                if (str == null) {
                    str = "";
                }
                Q = f.j(str);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            oip0 o = pw91.o(btsVar2);
            c.a(null, null, null, false, false, null, null, null, null, null, null, wwg.S(2120162441, true, new dr5(o, ahj0Var, tlsVar, oz40Var, 5), btsVar2), btsVar2, 0, 48, 2047);
            btsVar = btsVar2;
            String str2 = (String) oz40Var.getValue();
            boolean k = btsVar.k(o);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new RequirementGroupScreenCommentModalKt$RequirementGroupScreenCommentModal$2$1(o, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, str2);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(ahj0Var, tlsVar, i, 14);
        }
    }
}
