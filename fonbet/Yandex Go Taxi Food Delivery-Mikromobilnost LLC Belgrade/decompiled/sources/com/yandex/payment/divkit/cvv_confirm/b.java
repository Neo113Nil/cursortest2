package com.yandex.payment.divkit.cvv_confirm;

import com.yandex.payment.divkit.usecases.f;
import defpackage.abe;
import defpackage.dy40;
import defpackage.fof;
import defpackage.nx;
import defpackage.oy90;
import defpackage.pwl;
import defpackage.qwl;
import defpackage.smk;
import defpackage.tls;
import defpackage.vv90;
import defpackage.yr31;
import defpackage.zry0;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b extends yr31 implements pwl {
    public final dy40 A;
    public final dy40 B;
    public final dy40 C;
    public final dy40 D;
    public final dy40 E;
    public CvvScreenArguments F;
    public zry0 G;
    public tls H;
    public qwl I;
    public final f b;
    public final oy90 c;
    public final vv90 w;
    public final nx x;
    public final abe y;
    public final dy40 z;

    public b(f fVar, oy90 oy90Var, vv90 vv90Var, nx nxVar, abe abeVar) {
        this.b = fVar;
        this.c = oy90Var;
        this.w = vv90Var;
        this.x = nxVar;
        this.y = abeVar;
        dy40 dy40Var = new dy40();
        this.z = dy40Var;
        dy40 dy40Var2 = new dy40();
        this.A = dy40Var2;
        this.B = dy40Var;
        this.C = dy40Var2;
        dy40 dy40Var3 = new dy40();
        this.D = dy40Var3;
        this.E = dy40Var3;
    }

    public static final void W(b bVar, JSONObject jSONObject) {
        bVar.getClass();
        bVar.z.m(new fof(new smk(jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"), EmptyList.a)));
    }
}
