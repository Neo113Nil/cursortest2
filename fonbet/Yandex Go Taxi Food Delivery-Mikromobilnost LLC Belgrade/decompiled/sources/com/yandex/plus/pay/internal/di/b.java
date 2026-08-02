package com.yandex.plus.pay.internal.di;

import android.content.Context;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.asd;
import defpackage.e5o;
import defpackage.hl21;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jcd0;
import defpackage.ju90;
import defpackage.ku2;
import defpackage.lzs;
import defpackage.mlc0;
import defpackage.p5z;
import defpackage.sbx;
import defpackage.sls;
import defpackage.t9a0;
import defpackage.tls;
import defpackage.tyq0;
import defpackage.w490;
import defpackage.x75;
import defpackage.xyj;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class b {
    public final ju90 A;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final PlusSdkBrandType e;
    public final String f;
    public final Context g;
    public final e5o h;
    public final ike i;
    public final p5z j;
    public final lzs k;
    public final OkHttpClient.a l;
    public final tls m;
    public final xyj n;
    public final com.yandex.plus.metrica.api.a o;
    public final x75 p;
    public final hl21 q;
    public final tyq0 r;
    public final asd s;
    public final com.yandex.plus.domain.auth.impl.a t;
    public final ku2 u;
    public final sls v;
    public final com.yandex.plus.core.benchmark.a w;
    public final long x;
    public final i3y y = kotlin.a.a(new t9a0(22, this));
    public final i3y z = kotlin.a.a(new mlc0(5));
    public final i3y B = kotlin.a.a(PlusPayCommonDependencies$networkExceptionAdapter$2.b);
    public final i3y C = kotlin.a.a(new mlc0(this));

    public b(String str, String str2, String str3, String str4, PlusSdkBrandType plusSdkBrandType, String str5, Context context, e5o e5oVar, ike ikeVar, p5z p5zVar, lzs lzsVar, OkHttpClient.a aVar, tls tlsVar, xyj xyjVar, com.yandex.plus.metrica.api.a aVar2, x75 x75Var, hl21 hl21Var, tyq0 tyq0Var, asd asdVar, com.yandex.plus.domain.auth.impl.a aVar3, ku2 ku2Var, sls slsVar, com.yandex.plus.core.benchmark.a aVar4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = plusSdkBrandType;
        this.f = str5;
        this.g = context;
        this.h = e5oVar;
        this.i = ikeVar;
        this.j = p5zVar;
        this.k = lzsVar;
        this.l = aVar;
        this.m = tlsVar;
        this.n = xyjVar;
        this.o = aVar2;
        this.p = x75Var;
        this.q = hl21Var;
        this.r = tyq0Var;
        this.s = asdVar;
        this.t = aVar3;
        this.u = ku2Var;
        this.v = slsVar;
        this.w = aVar4;
        this.x = j;
        this.A = new ju90(new jcd0(e5oVar.getEnvironment(), plusSdkBrandType));
    }

    public final sbx a() {
        return (sbx) this.z.getValue();
    }

    public final p5z b() {
        return (p5z) this.y.getValue();
    }

    public final String c() {
        w490.a.getClass();
        return this.g.getPackageName();
    }
}
