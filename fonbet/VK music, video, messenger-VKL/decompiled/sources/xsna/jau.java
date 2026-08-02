package xsna;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzad;
import com.google.android.gms.internal.common.zzah;
import com.google.android.gms.internal.common.zzal;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class jau {
    public static jau c;
    public final Context a;
    public volatile String b;

    public jau(@NonNull Context context) {
        this.a = context.getApplicationContext();
    }

    @NonNull
    public static jau a(@NonNull Context context) {
        exc0.i(context);
        synchronized (jau.class) {
            if (c == null) {
                ee01 ee01Var = sm01.a;
                synchronized (sm01.class) {
                    try {
                        if (sm01.e == null) {
                            sm01.e = context.getApplicationContext();
                        }
                    } finally {
                    }
                }
                c = new jau(context);
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: IllegalArgumentException -> 0x00a2, TryCatch #0 {IllegalArgumentException -> 0x00a2, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0037, B:22:0x003d, B:25:0x0044, B:27:0x0053, B:29:0x005f, B:30:0x0068, B:32:0x006e, B:34:0x0079, B:35:0x0083, B:37:0x008b, B:47:0x009a, B:48:0x00a1, B:49:0x0064, B:50:0x002e), top: B:15:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a A[Catch: IllegalArgumentException -> 0x00a2, TryCatch #0 {IllegalArgumentException -> 0x00a2, blocks: (B:17:0x002b, B:18:0x0030, B:20:0x0037, B:22:0x003d, B:25:0x0044, B:27:0x0053, B:29:0x005f, B:30:0x0068, B:32:0x006e, B:34:0x0079, B:35:0x0083, B:37:0x008b, B:47:0x009a, B:48:0x00a1, B:49:0x0064, B:50:0x002e), top: B:15:0x0029 }] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c(PackageInfo packageInfo, boolean z) {
        zzah zzahVar;
        SigningInfo signingInfo;
        zzah zzj;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                zzahVar = z ? em01.c : em01.b;
                com.google.android.gms.internal.common.zzr.zza(true);
                signingInfo = packageInfo.signingInfo;
            } catch (IllegalArgumentException unused) {
                if ((z ? d(packageInfo, em01.a) : d(packageInfo, em01.a[0])) != null) {
                }
            }
            if (signingInfo != null && !signingInfo.hasMultipleSigners() && signingInfo.getSigningCertificateHistory() != null) {
                int i = zzah.zzd;
                zzad zzadVar = new zzad();
                for (Signature signature : signingInfo.getSigningCertificateHistory()) {
                    zzadVar.zzb(signature.toByteArray());
                }
                zzj = zzadVar.zzd();
                if (!zzj.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                zzah zzh = zzj.zzh();
                int size = zzh.size();
                int i2 = 0;
                while (i2 < size) {
                    byte[] bArr = (byte[]) zzh.get(i2);
                    zzal listIterator = zzahVar.listIterator(0);
                    do {
                        int i3 = i2 + 1;
                        if (listIterator.hasNext()) {
                        }
                    } while (!Arrays.equals(bArr, (byte[]) listIterator.next()));
                    return true;
                }
            }
            zzj = zzah.zzj();
            if (!zzj.isEmpty()) {
            }
        }
        return false;
    }

    public static hh01 d(PackageInfo packageInfo, hh01... hh01VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        yi01 yi01Var = new yi01(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < hh01VarArr.length; i++) {
            if (hh01VarArr[i].equals(yi01Var)) {
                return hh01VarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i) {
        os01 b;
        int length;
        os01 b2;
        ApplicationInfo applicationInfo;
        boolean zzg;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            b = os01.b("no pkgs");
        } else {
            b = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    exc0.i(b);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    b = os01.b("null pkg");
                } else if (str.equals(this.b)) {
                    b = os01.c;
                } else {
                    ee01 ee01Var = sm01.a;
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            sm01.a();
                            zzg = sm01.c.zzg();
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        } finally {
                        }
                    } catch (RemoteException | DynamiteModule.LoadingException e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    }
                    try {
                        if (zzg) {
                            er01 er01Var = new er01();
                            er01Var.a(str);
                            er01Var.b(fau.a(this.a));
                            er01Var.c();
                            or01 d = er01Var.d();
                            allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                exc0.i(sm01.e);
                                try {
                                    sm01.a();
                                    exc0.i(sm01.e);
                                    com.google.android.gms.common.zzp b3 = d.b(sm01.e);
                                    try {
                                        com.google.android.gms.common.zzr M = d.a() ? sm01.c.M(b3) : sm01.c.P(b3);
                                        if (M.zza()) {
                                            M.zze();
                                            b2 = os01.e();
                                        } else {
                                            String zzb = M.zzb();
                                            PackageManager.NameNotFoundException nameNotFoundException = M.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                                            if (zzb == null) {
                                                zzb = "error checking package certificate";
                                            }
                                            M.zze();
                                            M.zzd();
                                            b2 = os01.f(zzb, nameNotFoundException);
                                        }
                                    } catch (RemoteException e2) {
                                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                        b2 = os01.c(e2, "module call");
                                    }
                                } catch (DynamiteModule.LoadingException e3) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                    b2 = os01.c(e3, "module init: ".concat(String.valueOf(e3.getMessage())));
                                }
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                                if (b2.a) {
                                    this.b = str;
                                }
                                b = b2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 134217792);
                        boolean a = fau.a(this.a);
                        if (packageInfo == null) {
                            b2 = os01.b("null pkg");
                        } else {
                            Signature[] signatureArr = packageInfo.signatures;
                            if (signatureArr == null || signatureArr.length != 1) {
                                b2 = os01.b("single cert required");
                            } else {
                                yi01 yi01Var = new yi01(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    os01 b4 = sm01.b(str2, yi01Var, a, false);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    if (b4.a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            os01 b5 = sm01.b(str2, yi01Var, false, true);
                                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                                            if (b5.a) {
                                                b2 = os01.b("debuggable release cert app rejected");
                                            }
                                        } finally {
                                        }
                                    }
                                    b2 = b4;
                                } finally {
                                }
                            }
                        }
                        if (b2.a) {
                        }
                        b = b2;
                    } catch (PackageManager.NameNotFoundException e4) {
                        b = os01.c(e4, "no pkg ".concat(str));
                    }
                }
                if (b.a) {
                    break;
                }
                i2++;
            }
        }
        b.d();
        return b.a;
    }
}
