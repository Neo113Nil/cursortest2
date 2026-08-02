package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.zzw;
import defpackage.gan;
import defpackage.hxj;
import defpackage.isb1;
import defpackage.kpr0;
import defpackage.kz;
import defpackage.kza1;
import defpackage.qtb1;
import defpackage.wcy;
import defpackage.xqc;
import defpackage.xsb1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class o {
    public static zzbk k;
    public static final zzbm l;
    public final String a;
    public final String b;
    public final isb1 c;
    public final kpr0 d;
    public final zzw e;
    public final zzw f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        l = new zzcj(objArr);
    }

    public o(Context context, kpr0 kpr0Var, isb1 isb1Var, String str) {
        this.a = context.getPackageName();
        this.b = xqc.a(context);
        this.d = kpr0Var;
        this.c = isb1Var;
        qtb1.s();
        this.g = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(9, this);
        a.getClass();
        this.e = com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        Objects.requireNonNull(kpr0Var);
        kza1 kza1Var = new kza1(kpr0Var, 4);
        a2.getClass();
        this.f = com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzbm zzbmVar = l;
        this.h = zzbmVar.containsKey(str) ? gan.d(context, (String) zzbmVar.get(str), false) : -1;
    }

    public static long a(double d, ArrayList arrayList) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(xsb1 xsb1Var, zzov zzovVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(zzovVar, elapsedRealtime)) {
            this.i.put(zzovVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.a.c().execute(new kz(this, xsb1Var.b(), zzovVar, c(), 17));
        }
    }

    public final String c() {
        zzw zzwVar = this.e;
        if (zzwVar.o()) {
            return (String) zzwVar.k();
        }
        return wcy.c.a(this.g);
    }

    public final boolean d(zzov zzovVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(zzovVar) == null || j - ((Long) hashMap.get(zzovVar)).longValue() > 30000;
    }
}
