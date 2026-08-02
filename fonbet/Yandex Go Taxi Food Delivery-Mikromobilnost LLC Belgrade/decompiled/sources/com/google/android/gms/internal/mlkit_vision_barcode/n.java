package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.os.SystemClock;
import defpackage.gan;
import defpackage.hxj;
import defpackage.kpr0;
import defpackage.kz;
import defpackage.kza1;
import defpackage.mvb1;
import defpackage.nvb1;
import defpackage.vvb1;
import defpackage.wcy;
import defpackage.xqc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class n {
    public static zzcs k;
    public static final zzcu l;
    public final String a;
    public final String b;
    public final mvb1 c;
    public final kpr0 d;
    public final com.google.android.gms.tasks.zzw e;
    public final com.google.android.gms.tasks.zzw f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new zzdp(objArr);
    }

    public n(Context context, kpr0 kpr0Var, mvb1 mvb1Var, String str) {
        this.a = context.getPackageName();
        this.b = xqc.a(context);
        this.d = kpr0Var;
        this.c = mvb1Var;
        vvb1.z();
        this.g = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(10, this);
        a.getClass();
        this.e = com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        Objects.requireNonNull(kpr0Var);
        kza1 kza1Var = new kza1(kpr0Var, 5);
        a2.getClass();
        this.f = com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzcu zzcuVar = l;
        this.h = zzcuVar.containsKey(str) ? gan.d(context, (String) zzcuVar.get(str), false) : -1;
    }

    public static long a(double d, ArrayList arrayList) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(nvb1 nvb1Var, zzrc zzrcVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(zzrcVar, elapsedRealtime)) {
            this.i.put(zzrcVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.a.c().execute(new kz(this, nvb1Var.t(), zzrcVar, c(), 18));
        }
    }

    public final String c() {
        com.google.android.gms.tasks.zzw zzwVar = this.e;
        if (zzwVar.o()) {
            return (String) zzwVar.k();
        }
        return wcy.c.a(this.g);
    }

    public final boolean d(zzrc zzrcVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(zzrcVar) == null || j - ((Long) hashMap.get(zzrcVar)).longValue() > 30000;
    }
}
