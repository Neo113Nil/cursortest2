package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

import android.content.Context;
import android.os.SystemClock;
import defpackage.gan;
import defpackage.hxj;
import defpackage.kpr0;
import defpackage.kz;
import defpackage.kza1;
import defpackage.mrb1;
import defpackage.msb1;
import defpackage.wcy;
import defpackage.xqc;
import defpackage.zqb1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class k {
    public static zzav k;
    public static final zzax l;
    public final String a;
    public final String b;
    public final zqb1 c;
    public final kpr0 d;
    public final com.google.android.gms.tasks.zzw e;
    public final com.google.android.gms.tasks.zzw f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new zzbq(objArr);
    }

    public k(Context context, kpr0 kpr0Var, zqb1 zqb1Var, String str) {
        this.a = context.getPackageName();
        this.b = xqc.a(context);
        this.d = kpr0Var;
        this.c = zqb1Var;
        msb1.l();
        this.g = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(8, this);
        a.getClass();
        this.e = com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        kpr0Var.getClass();
        kza1 kza1Var = new kza1(kpr0Var, 3);
        a2.getClass();
        this.f = com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzax zzaxVar = l;
        this.h = zzaxVar.containsKey(str) ? gan.d(context, (String) zzaxVar.get(str), false) : -1;
    }

    public static long a(double d, ArrayList arrayList) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(mrb1 mrb1Var, zzob zzobVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(zzobVar, elapsedRealtime)) {
            this.i.put(zzobVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.a.c().execute(new kz(this, mrb1Var.c(), zzobVar, c(), 16));
        }
    }

    public final String c() {
        com.google.android.gms.tasks.zzw zzwVar = this.e;
        if (zzwVar.o()) {
            return (String) zzwVar.k();
        }
        return wcy.c.a(this.g);
    }

    public final boolean d(zzob zzobVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(zzobVar) == null || j - ((Long) hashMap.get(zzobVar)).longValue() > 30000;
    }
}
