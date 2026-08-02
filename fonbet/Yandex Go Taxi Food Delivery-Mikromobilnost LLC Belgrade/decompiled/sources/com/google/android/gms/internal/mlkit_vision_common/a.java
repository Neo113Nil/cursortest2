package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.os.SystemClock;
import defpackage.aza1;
import defpackage.ffa1;
import defpackage.gan;
import defpackage.h2b1;
import defpackage.hda1;
import defpackage.hxj;
import defpackage.kpr0;
import defpackage.kz;
import defpackage.kza1;
import defpackage.t1b1;
import defpackage.wcy;
import defpackage.wl91;
import defpackage.xda1;
import defpackage.xqc;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class a {
    public static zzp j;
    public static final zzr k;
    public final String a;
    public final String b;
    public final aza1 c;
    public final kpr0 d;
    public final com.google.android.gms.tasks.zzw e;
    public final com.google.android.gms.tasks.zzw f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new zzz(objArr);
    }

    public a(Context context, kpr0 kpr0Var, aza1 aza1Var, String str) {
        new HashMap();
        this.a = context.getPackageName();
        this.b = xqc.a(context);
        this.d = kpr0Var;
        this.c = aza1Var;
        h2b1.k();
        this.g = str;
        com.google.mlkit.common.sdkinternal.a a = com.google.mlkit.common.sdkinternal.a.a();
        hxj hxjVar = new hxj(5, this);
        a.getClass();
        this.e = com.google.mlkit.common.sdkinternal.a.b(hxjVar);
        com.google.mlkit.common.sdkinternal.a a2 = com.google.mlkit.common.sdkinternal.a.a();
        kpr0Var.getClass();
        kza1 kza1Var = new kza1(kpr0Var, 0);
        a2.getClass();
        this.f = com.google.mlkit.common.sdkinternal.a.b(kza1Var);
        zzr zzrVar = k;
        this.h = zzrVar.containsKey(str) ? gan.d(context, (String) zzrVar.get(str), false) : -1;
    }

    public final void a(t1b1 t1b1Var, zziv zzivVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.i;
        if (hashMap.get(zzivVar) != null && elapsedRealtime - ((Long) hashMap.get(zzivVar)).longValue() <= 30000) {
            return;
        }
        hashMap.put(zzivVar, Long.valueOf(elapsedRealtime));
        int i = t1b1Var.a;
        int i2 = t1b1Var.b;
        int i3 = t1b1Var.c;
        int i4 = t1b1Var.d;
        int i5 = t1b1Var.e;
        long j2 = t1b1Var.f;
        int i6 = t1b1Var.g;
        hda1 hda1Var = new hda1();
        hda1Var.c = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzii.UNKNOWN_FORMAT : zzii.NV21 : zzii.NV16 : zzii.YV12 : zzii.YUV_420_888 : zzii.BITMAP;
        hda1Var.b = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? zzio.ANDROID_MEDIA_IMAGE : zzio.FILEPATH : zzio.BYTEBUFFER : zzio.BYTEARRAY : zzio.BITMAP;
        hda1Var.d = Integer.valueOf(i3 & Integer.MAX_VALUE);
        hda1Var.f = Integer.valueOf(i4 & Integer.MAX_VALUE);
        hda1Var.e = Integer.valueOf(i5 & Integer.MAX_VALUE);
        hda1Var.a = Long.valueOf(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED & j2);
        hda1Var.g = Integer.valueOf(i6 & Integer.MAX_VALUE);
        xda1 xda1Var = new xda1(hda1Var);
        ffa1 ffa1Var = new ffa1();
        ffa1Var.c = xda1Var;
        wl91 wl91Var = new wl91(ffa1Var);
        com.google.android.gms.tasks.zzw zzwVar = this.e;
        com.google.mlkit.common.sdkinternal.a.c().execute(new kz(this, wl91Var, zzivVar, zzwVar.o() ? (String) zzwVar.k() : wcy.c.a(this.g), 12));
    }
}
