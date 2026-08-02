package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.common.zzah;
import defpackage.cvw;
import defpackage.fwt;
import defpackage.n491;
import defpackage.u491;
import defpackage.wvb1;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class c {
    public static c c;
    public final Context a;
    public volatile String b;

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    public static c a(Context context) {
        cvw.l(context);
        synchronized (c.class) {
            if (c == null) {
                zzh zzhVar = f.a;
                synchronized (f.class) {
                    try {
                        if (f.e == null) {
                            f.e = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                c = new c(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: IllegalArgumentException -> 0x00a5, TryCatch #0 {IllegalArgumentException -> 0x00a5, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x0050, B:29:0x005c, B:30:0x006b, B:32:0x0071, B:34:0x007c, B:35:0x0086, B:37:0x008e, B:47:0x009d, B:48:0x00a4, B:49:0x0067, B:50:0x002e), top: B:15:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d A[Catch: IllegalArgumentException -> 0x00a5, TryCatch #0 {IllegalArgumentException -> 0x00a5, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0034, B:22:0x003a, B:25:0x0041, B:27:0x0050, B:29:0x005c, B:30:0x006b, B:32:0x0071, B:34:0x007c, B:35:0x0086, B:37:0x008e, B:47:0x009d, B:48:0x00a4, B:49:0x0067, B:50:0x002e), top: B:15:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean d(PackageInfo packageInfo, boolean z) {
        zzah zzahVar;
        SigningInfo signingInfo;
        zzah j;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & HProv.PP_SECURITY_LEVEL) == 0) ? false : true;
            }
            try {
                zzahVar = z ? e.c : e.b;
                signingInfo = packageInfo.signingInfo;
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? e(packageInfo, e.a) : e(packageInfo, e.a[0])) != null) {
                }
            }
            if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                u491 u491Var = zzah.b;
                n491 n491Var = new n491();
                for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                    n491Var.a(signature.toByteArray());
                }
                n491Var.c = true;
                j = zzah.k(n491Var.b, n491Var.a);
                if (!j.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah h = j.h();
                int size = h.size();
                int i = 0;
                while (i < size) {
                    byte[] bArr = (byte[]) h.get(i);
                    u491 listIterator = zzahVar.listIterator(0);
                    do {
                        int i2 = i + 1;
                        if (listIterator.hasNext()) {
                        }
                    } while (!Arrays.equals(bArr, (byte[]) listIterator.next()));
                    return true;
                }
            }
            j = zzah.j();
            if (!j.isEmpty()) {
            }
        }
        return false;
    }

    public static zzj e(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzjVarArr.length; i++) {
            if (zzjVarArr[i].equals(zzkVar)) {
                return zzjVarArr[i];
            }
        }
        return null;
    }

    public final boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (d(packageInfo, false)) {
            return true;
        }
        return d(packageInfo, true) && fwt.a(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x016a  */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        wvb1 m;
        int length;
        boolean z;
        ApplicationInfo applicationInfo;
        boolean zzg;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            m = wvb1.m("no pkgs");
        } else {
            m = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    cvw.l(m);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    m = wvb1.m("null pkg");
                } else if (str.equals(this.b)) {
                    m = wvb1.c;
                } else {
                    zzh zzhVar = f.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        f.a();
                        zzg = f.c.zzg();
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (RemoteException | DynamiteModule$LoadingException e) {
                        z = true;
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    } finally {
                    }
                    if (zzg) {
                        boolean a = fwt.a(this.a);
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            cvw.l(f.e);
                            try {
                                f.a();
                                cvw.l(f.e);
                                try {
                                    zzr zzf = f.c.zzf(new zzp(str, a, false, ObjectWrapper.wrap(f.e), false, true, false));
                                    if (zzf.zza()) {
                                        zzf.zze();
                                        zzf.zzc();
                                        m = new wvb1(null, null, true);
                                    } else {
                                        String zzb = zzf.zzb();
                                        PackageManager.NameNotFoundException nameNotFoundException = zzf.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (zzb == null) {
                                            zzb = "error checking package certificate";
                                        }
                                        zzf.zze();
                                        zzf.zzd();
                                        m = new wvb1(nameNotFoundException, zzb, false);
                                    }
                                } catch (RemoteException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    m = wvb1.n(e2, "module call");
                                }
                            } catch (DynamiteModule$LoadingException e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                m = wvb1.n(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
                            }
                            if (m.a) {
                                this.b = str;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        z = true;
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 134217792);
                            boolean a2 = fwt.a(this.a);
                            if (packageInfo == null) {
                                m = wvb1.m("null pkg");
                                if (m.a) {
                                }
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != z) {
                                    m = wvb1.m("single cert required");
                                } else {
                                    zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                                    String str2 = packageInfo.packageName;
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        wvb1 b = f.b(str2, zzkVar, a2, false);
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        if (b.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                            try {
                                                wvb1 b2 = f.b(str2, zzkVar, false, z);
                                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                                if (b2.a) {
                                                    m = wvb1.m("debuggable release cert app rejected");
                                                }
                                            } finally {
                                            }
                                        }
                                        m = b;
                                    } finally {
                                    }
                                }
                                if (m.a) {
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            m = wvb1.n(e4, "no pkg ".concat(str));
                        }
                    }
                }
                if (m.a) {
                    break;
                }
                i2++;
            }
        }
        if (!m.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (((Throwable) m.b) != null) {
                m.l();
            } else {
                m.l();
            }
        }
        return m.a;
    }
}
