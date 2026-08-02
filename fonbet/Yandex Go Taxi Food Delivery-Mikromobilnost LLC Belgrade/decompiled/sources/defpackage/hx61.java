package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes11.dex */
public final class hx61 implements Runnable {
    public final /* synthetic */ int a;
    public final String b;
    public boolean c;
    public final Object w;
    public Object x;
    public Object y;
    public Object z;

    public hx61() {
        this.a = 0;
        this.c = false;
        this.w = new ByteArrayOutputStream();
        this.x = null;
        this.y = null;
        this.z = null;
        this.b = Platform.WIN_COMMAND;
    }

    public static byte[] b() {
        hx61 hx61Var = new hx61();
        Thread thread = new Thread(hx61Var);
        thread.setDaemon(true);
        long currentTimeMillis = System.currentTimeMillis() + 1000;
        thread.start();
        do {
            try {
                Thread.sleep(20L);
            } catch (InterruptedException unused) {
            }
            if (hx61Var.c) {
                break;
            }
        } while (currentTimeMillis > System.currentTimeMillis());
        Exception exc = (Exception) hx61Var.z;
        if (exc != null) {
            throw exc;
        }
        IOException iOException = (IOException) ((ju61) hx61Var.x).w;
        if (iOException != null) {
            throw iOException;
        }
        IOException iOException2 = (IOException) ((ju61) hx61Var.y).w;
        if (iOException2 != null) {
            throw iOException2;
        }
        if (hx61Var.c) {
            return ((ByteArrayOutputStream) hx61Var.w).toByteArray();
        }
        throw new InterruptedException("Timeout exhausted");
    }

    public void a(Process process) {
        InputStream inputStream = process.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.w;
        this.x = new ju61(inputStream, byteArrayOutputStream);
        this.y = new ju61(process.getErrorStream(), byteArrayOutputStream);
        Thread thread = new Thread((ju61) this.x);
        thread.setDaemon(true);
        Thread thread2 = new Thread((ju61) this.y);
        thread2.setDaemon(true);
        thread.start();
        thread2.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        ieb1 ieb1Var;
        zzgb zzgbVar;
        g gVar;
        AtomicReference atomicReference;
        j5b1 j5b1Var;
        zzgb zzgbVar2;
        switch (this.a) {
            case 0:
                try {
                    Process exec = Runtime.getRuntime().exec(this.b);
                    a(exec);
                    exec.waitFor();
                } catch (Exception e) {
                    this.z = e;
                }
                this.c = true;
                return;
            case 1:
                String str = (String) this.w;
                String str2 = this.b;
                zzcu zzcuVar = (zzcu) this.y;
                j5b1 j5b1Var2 = (j5b1) this.z;
                Bundle bundle = new Bundle();
                try {
                    try {
                        zzgbVar = j5b1Var2.x;
                        gVar = (g) j5b1Var2.b;
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                    if (zzgbVar == null) {
                        y1a1 y1a1Var = gVar.y;
                        g.g(y1a1Var);
                        y1a1Var.z.c("Failed to get user properties; not connected to service", str2, str);
                        ieb1Var = gVar.B;
                        g.e(ieb1Var);
                        ieb1Var.sh(zzcuVar, bundle);
                        return;
                    }
                    List<zzpl> zzp = zzgbVar.zzp(str2, str, this.c, (zzr) this.x);
                    Bundle bundle2 = new Bundle();
                    if (zzp != null) {
                        for (zzpl zzplVar : zzp) {
                            String str3 = zzplVar.zze;
                            if (str3 != null) {
                                bundle2.putString(zzplVar.zzb, str3);
                            } else {
                                Long l = zzplVar.zzd;
                                if (l != null) {
                                    bundle2.putLong(zzplVar.zzb, l.longValue());
                                } else {
                                    Double d = zzplVar.zzg;
                                    if (d != null) {
                                        bundle2.putDouble(zzplVar.zzb, d.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        j5b1Var2.Tg();
                        ieb1 ieb1Var2 = gVar.B;
                        g.e(ieb1Var2);
                        ieb1Var2.sh(zzcuVar, bundle2);
                        return;
                    } catch (RemoteException e3) {
                        e = e3;
                        bundle = bundle2;
                        y1a1 y1a1Var2 = ((g) j5b1Var2.b).y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.c("Failed to get user properties; remote exception", str2, e);
                        ieb1Var = ((g) j5b1Var2.b).B;
                        g.e(ieb1Var);
                        ieb1Var.sh(zzcuVar, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        ieb1 ieb1Var3 = ((g) j5b1Var2.b).B;
                        g.e(ieb1Var3);
                        ieb1Var3.sh(zzcuVar, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.w;
                synchronized (atomicReference2) {
                    try {
                        try {
                            j5b1Var = (j5b1) this.z;
                            zzgbVar2 = j5b1Var.x;
                        } catch (RemoteException e4) {
                            y1a1 y1a1Var3 = ((g) ((j5b1) this.z).b).y;
                            g.g(y1a1Var3);
                            y1a1Var3.z.d("(legacy) Failed to get user properties; remote exception", null, this.b, e4);
                            ((AtomicReference) this.w).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.w;
                        }
                        if (zzgbVar2 == null) {
                            y1a1 y1a1Var4 = ((g) j5b1Var.b).y;
                            g.g(y1a1Var4);
                            y1a1Var4.z.d("(legacy) Failed to get user properties; not connected to service", null, this.b, (String) this.x);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(zzgbVar2.zzp(this.b, (String) this.x, this.c, (zzr) this.y));
                        } else {
                            atomicReference2.set(zzgbVar2.zzq(null, this.b, (String) this.x, this.c));
                        }
                        j5b1Var.Tg();
                        atomicReference = (AtomicReference) this.w;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.w).notify();
                        throw th3;
                    }
                }
        }
    }

    public hx61(j5b1 j5b1Var, String str, String str2, zzr zzrVar, boolean z, zzcu zzcuVar) {
        this.a = 1;
        this.b = str;
        this.w = str2;
        this.x = zzrVar;
        this.c = z;
        this.y = zzcuVar;
        this.z = j5b1Var;
    }

    public hx61(j5b1 j5b1Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
        this.a = 2;
        this.w = atomicReference;
        this.b = str;
        this.x = str2;
        this.y = zzrVar;
        this.c = z;
        this.z = j5b1Var;
    }
}
