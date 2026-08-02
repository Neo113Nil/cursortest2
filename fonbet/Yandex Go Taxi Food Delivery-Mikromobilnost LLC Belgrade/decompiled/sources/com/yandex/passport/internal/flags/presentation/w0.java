package com.yandex.passport.internal.flags.presentation;

import defpackage.bms;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.fid;
import defpackage.jrv;
import defpackage.lrv;
import defpackage.ly3;
import defpackage.o430;
import defpackage.q791;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes15.dex */
public final class w0 implements bms {
    public final /* synthetic */ List a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ yx40 c;

    public w0(List list, tls tlsVar, yx40 yx40Var) {
        this.a = list;
        this.b = tlsVar;
        this.c = yx40Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 48) == 0) {
            intValue2 |= fidVar.c(intValue) ? 32 : 16;
        }
        if ((intValue2 & 145) == 144) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        y0 y0Var = (y0) this.a.get(intValue);
        if (y0Var instanceof v) {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(-950870880);
            jrv jrvVar = (jrv) btsVar2.m(lrv.a);
            btsVar2.e0(246424112);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar2.t(false);
            v vVar = (v) y0Var;
            btsVar2.e0(246430171);
            tls tlsVar = this.b;
            boolean e = btsVar2.e(y0Var) | btsVar2.k(tlsVar);
            Object Q2 = btsVar2.Q();
            if (e || Q2 == o430Var) {
                Q2 = new l(2, tlsVar, vVar);
                btsVar2.o0(Q2);
            }
            btsVar2.t(false);
            c1.d(vVar, q791.b(c530.a, zx40Var, jrvVar, false, null, null, (sls) Q2, 28), btsVar2, 0);
            yx40 yx40Var = this.c;
            Integer valueOf = Integer.valueOf(yx40Var.getIntValue());
            btsVar2.e0(246438438);
            boolean z = (intValue2 & 112) == 32;
            Object Q3 = btsVar2.Q();
            if (z || Q3 == o430Var) {
                Q3 = new ExperimentsListContentKt$ExperimentsListContent$3$1$1$1$2$1(intValue, zx40Var, yx40Var, null);
                btsVar2.o0(Q3);
            }
            btsVar2.t(false);
            zpn.e(btsVar2, (wls) Q3, valueOf);
            btsVar2.t(false);
        } else {
            if (!(y0Var instanceof w)) {
                throw unr0.y(246418941, (bts) fidVar, false);
            }
            bts btsVar3 = (bts) fidVar;
            btsVar3.e0(-949843788);
            c1.f((w) y0Var, null, btsVar3, 0);
            btsVar3.t(false);
        }
        return zy11.a;
    }
}
