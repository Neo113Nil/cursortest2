package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.zzw;
import defpackage.dab1;
import defpackage.e8b1;
import defpackage.gan;
import defpackage.hxj;
import defpackage.kpr0;
import defpackage.kz;
import defpackage.kza1;
import defpackage.w6b1;
import defpackage.wcy;
import defpackage.xqc;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class n {
    public static zzbn k;
    public static final zzbp l;
    public final String a;
    public final String b;
    public final w6b1 c;
    public final kpr0 d;
    public final zzw e;
    public final zzw f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new zzch(objArr);
    }

    public n(Context context, kpr0 kpr0Var, w6b1 w6b1Var, String str) {
        this.a = context.getPackageName();
        this.b = xqc.a(context);
        this.d = kpr0Var;
        this.c = w6b1Var;
        dab1.t();
        this.g = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(6, this);
        a.getClass();
        this.e = com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        kpr0Var.getClass();
        kza1 kza1Var = new kza1(kpr0Var, 1);
        a2.getClass();
        this.f = com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzbp zzbpVar = l;
        this.h = zzbpVar.containsKey(str) ? gan.d(context, (String) zzbpVar.get(str), false) : -1;
    }

    public static long a(double d, ArrayList arrayList) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(e8b1 e8b1Var, zzkt zzktVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(zzktVar, elapsedRealtime)) {
            this.i.put(zzktVar, Long.valueOf(elapsedRealtime));
            com.google.mlkit.common.sdkinternal.a.c().execute(new kz(this, e8b1Var.zza(), zzktVar, c(), 14));
        }
    }

    public final String c() {
        zzw zzwVar = this.e;
        return zzwVar.o() ? (String) zzwVar.k() : wcy.c.a(this.g);
    }

    public final boolean d(zzkt zzktVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(zzktVar) == null || j - ((Long) hashMap.get(zzktVar)).longValue() > 30000;
    }
}
