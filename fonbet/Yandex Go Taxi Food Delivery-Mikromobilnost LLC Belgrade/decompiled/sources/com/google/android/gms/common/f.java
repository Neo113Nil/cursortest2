package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import defpackage.cvw;
import defpackage.gan;
import defpackage.rvb1;
import defpackage.wvb1;

/* loaded from: classes11.dex */
public abstract class f {
    public static final zzh a;
    public static final zzi b;
    public static volatile zzad c;
    public static final Object d;
    public static Context e;

    static {
        new zzd(zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"));
        new zze(zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"));
        new zzf(zzj.zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new zzg(zzj.zzf("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        a = new zzh(zzj.zzf("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        b = new zzi(zzj.zzf("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static void a() {
        if (c != null) {
            return;
        }
        cvw.l(e);
        synchronized (d) {
            try {
                if (c == null) {
                    c = zzac.zzb(gan.c(e, gan.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static wvb1 b(String str, zzk zzkVar, boolean z, boolean z2) {
        try {
            a();
            cvw.l(e);
            try {
                return c.zze(new zzt(str, (zzj) zzkVar, z, z2), ObjectWrapper.wrap(e.getPackageManager())) ? wvb1.c : new rvb1(new d(z, str, zzkVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return wvb1.n(e2, "module call");
            }
        } catch (DynamiteModule$LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return wvb1.n(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
