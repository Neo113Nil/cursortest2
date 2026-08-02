package com.yx360.design.compose.atoms;

import androidx.compose.runtime.f;
import defpackage.a6t0;
import defpackage.bts;
import defpackage.did;
import defpackage.ety0;
import defpackage.f530;
import defpackage.f89;
import defpackage.fid;
import defpackage.hoy0;
import defpackage.iqm;
import defpackage.jqm;
import defpackage.ljs0;
import defpackage.lkx;
import defpackage.ly3;
import defpackage.ne5;
import defpackage.oz40;
import defpackage.qnm;
import defpackage.tls;
import defpackage.uo5;
import defpackage.w511;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xjx;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zx40;
import defpackage.zy11;

/* loaded from: classes11.dex */
public final class d implements zls {
    public final /* synthetic */ tls A;
    public final /* synthetic */ lkx B;
    public final /* synthetic */ xjx C;
    public final /* synthetic */ String D;
    public final /* synthetic */ int E;
    public final /* synthetic */ DsInputInline$Align a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DsInputInline$FocusPosition c;
    public final /* synthetic */ ety0 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ f530 y;
    public final /* synthetic */ int z;

    public d(DsInputInline$Align dsInputInline$Align, String str, DsInputInline$FocusPosition dsInputInline$FocusPosition, ety0 ety0Var, boolean z, f530 f530Var, int i, tls tlsVar, lkx lkxVar, xjx xjxVar, String str2, int i2) {
        this.a = dsInputInline$Align;
        this.b = str;
        this.c = dsInputInline$FocusPosition;
        this.w = ety0Var;
        this.x = z;
        this.y = f530Var;
        this.z = i;
        this.A = tlsVar;
        this.B = lkxVar;
        this.C = xjxVar;
        this.D = str2;
        this.E = i2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        oz40 oz40Var;
        String str;
        oz40 oz40Var2;
        long k0;
        uo5 uo5Var;
        oz40 oz40Var3;
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        int[] iArr = jqm.a;
        DsInputInline$Align dsInputInline$Align = this.a;
        int i2 = iArr[dsInputInline$Align.ordinal()];
        if (i2 == 1) {
            i = 5;
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            i = 3;
        }
        int i3 = i;
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(1849434622);
        Object Q = btsVar2.Q();
        Object obj4 = did.a;
        if (Q == obj4) {
            Q = ly3.i(btsVar2);
        }
        zx40 zx40Var = (zx40) Q;
        btsVar2.t(false);
        oz40 b = androidx.compose.foundation.interaction.a.b(zx40Var, btsVar2, 6);
        btsVar2.e0(1849434622);
        Object Q2 = btsVar2.Q();
        String str2 = this.b;
        if (Q2 == obj4) {
            Q2 = f.j(new hoy0(str2, 0L, 6));
            btsVar2.o0(Q2);
        }
        oz40 oz40Var4 = (oz40) Q2;
        btsVar2.t(false);
        btsVar2.e0(-1633490746);
        boolean k = btsVar2.k(str2);
        Object Q3 = btsVar2.Q();
        if (k || Q3 == obj4) {
            Q3 = new DsInputInlineKt$DsInputInline$1$1$1(oz40Var4, str2, null);
            btsVar2.o0(Q3);
        }
        btsVar2.t(false);
        zpn.e(btsVar2, (wls) Q3, str2);
        Boolean bool = (Boolean) b.getValue();
        bool.getClass();
        btsVar2.e0(-1224400529);
        boolean k2 = btsVar2.k(b) | btsVar2.c(this.c.ordinal()) | btsVar2.a(false);
        Object Q4 = btsVar2.Q();
        if (k2 || Q4 == obj4) {
            oz40Var = oz40Var4;
            str = str2;
            Object dsInputInlineKt$DsInputInline$1$2$1 = new DsInputInlineKt$DsInputInline$1$2$1(this.c, false, b, oz40Var, null);
            oz40Var2 = b;
            btsVar2.o0(dsInputInlineKt$DsInputInline$1$2$1);
            Q4 = dsInputInlineKt$DsInputInline$1$2$1;
        } else {
            oz40Var = oz40Var4;
            str = str2;
            oz40Var2 = b;
        }
        btsVar2.t(false);
        zpn.e(btsVar2, (wls) Q4, bool);
        if (this.x) {
            btsVar2.e0(2106747013);
            qnm qnmVar = qnm.a;
            k0 = qnm.c(btsVar2).g0();
        } else {
            btsVar2.e0(2106747846);
            qnm qnmVar2 = qnm.a;
            k0 = qnm.c(btsVar2).k0();
        }
        btsVar2.t(false);
        oz40 oz40Var5 = oz40Var;
        ety0 a = ety0.a(this.w, k0, 0L, null, null, null, 0L, null, null, null, i3, 0L, null, null, 16744446);
        int i4 = iArr[dsInputInline$Align.ordinal()];
        if (i4 == 1) {
            uo5Var = x4c.x;
        } else {
            if (i4 != 2) {
                w511.b();
                return null;
            }
            uo5Var = x4c.y;
        }
        uo5 uo5Var2 = uo5Var;
        f530 c = ljs0.c(this.y, 1.0f);
        hoy0 hoy0Var = (hoy0) oz40Var5.getValue();
        boolean z = this.z == 1;
        qnm qnmVar3 = qnm.a;
        a6t0 a6t0Var = new a6t0(qnm.c(btsVar2).g0());
        btsVar2.e0(-1746271574);
        boolean k3 = btsVar2.k(str);
        Object obj5 = this.A;
        boolean k4 = k3 | btsVar2.k(obj5);
        Object Q5 = btsVar2.Q();
        if (k4 || Q5 == obj4) {
            oz40Var3 = oz40Var5;
            Q5 = new f89(27, obj5, (Object) oz40Var3, str);
            btsVar2.o0(Q5);
        } else {
            oz40Var3 = oz40Var5;
        }
        btsVar2.t(false);
        String str3 = this.D;
        int i5 = this.E;
        int i6 = this.z;
        ne5.a(hoy0Var, (tls) Q5, c, this.x, false, a, this.B, this.C, z, i6, 0, null, null, zx40Var, a6t0Var, wwg.S(-1206438179, true, new iqm(uo5Var2, a, str3, i5, i6, oz40Var3, oz40Var2), btsVar2), btsVar2, 0, 199680, 7184);
        return zy11.a;
    }
}
