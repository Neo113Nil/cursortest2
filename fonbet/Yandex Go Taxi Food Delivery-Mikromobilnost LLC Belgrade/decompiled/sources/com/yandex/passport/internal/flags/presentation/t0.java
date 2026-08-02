package com.yandex.passport.internal.flags.presentation;

import defpackage.an91;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g8e;
import defpackage.ljs0;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class t0 implements zls {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ androidx.compose.foundation.lazy.b b;
    public final /* synthetic */ yx40 c;

    public t0(ArrayList arrayList, androidx.compose.foundation.lazy.b bVar, yx40 yx40Var) {
        this.a = arrayList;
        this.b = bVar;
        this.c = yx40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-2020131464);
        Object Q = btsVar2.Q();
        Object obj4 = did.a;
        if (Q == obj4) {
            Q = androidx.compose.runtime.f.j(EmptyList.a);
            btsVar2.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar2.t(false);
        f530 c = ljs0.c(an91.m(ljs0.e(c530.a, 56.0f), 16.0f, 0.0f, 2), 1.0f);
        btsVar2.e0(-2020121183);
        Object obj5 = this.a;
        boolean e = btsVar2.e(obj5);
        Object Q2 = btsVar2.Q();
        if (e || Q2 == obj4) {
            Q2 = new s0(0, obj5, oz40Var);
            btsVar2.o0(Q2);
        }
        tls tlsVar = (tls) Q2;
        Object k = g8e.k(-2020113055, btsVar2, false);
        if (k == obj4) {
            k = new p0(2, oz40Var);
            btsVar2.o0(k);
        }
        btsVar2.t(false);
        c1.k(tlsVar, (sls) k, c, btsVar2, 432, 0);
        List list = (List) oz40Var.getValue();
        btsVar2.e0(-2020104874);
        androidx.compose.foundation.lazy.b bVar = this.b;
        boolean k2 = btsVar2.k(bVar);
        Object Q3 = btsVar2.Q();
        if (k2 || Q3 == obj4) {
            Q3 = new ExperimentsListContentKt$ExperimentsListContent$1$1$3$1(bVar, oz40Var, this.c, null);
            btsVar2.o0(Q3);
        }
        btsVar2.t(false);
        zpn.e(btsVar2, (wls) Q3, list);
        return zy11.a;
    }
}
