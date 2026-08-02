package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import defpackage.cvw;
import defpackage.eh91;
import defpackage.m891;
import defpackage.x4e;
import defpackage.yvi0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    private static final Object zzg = new Object();
    private static volatile AdvertisingIdClient zzh;
    BlockingServiceConnection zza;
    zzf zzb;
    boolean zzc;
    final Object zzd;
    m891 zze;
    final long zzf;
    private final Context zzi;

    /* loaded from: classes7.dex */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z) {
            this.zza = str;
            this.zzb = z;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            return "{" + this.zza + "}" + this.zzb;
        }
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.zzd = new Object();
        cvw.l(context);
        this.zzi = context.getApplicationContext();
        this.zzc = false;
        this.zzf = j;
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient;
        Info zzf;
        long elapsedRealtime;
        AdvertisingIdClient advertisingIdClient2 = zzh;
        if (advertisingIdClient2 == null) {
            synchronized (zzg) {
                try {
                    advertisingIdClient2 = zzh;
                    if (advertisingIdClient2 == null) {
                        advertisingIdClient2 = new AdvertisingIdClient(context);
                        zzh = advertisingIdClient2;
                    }
                } finally {
                }
            }
        }
        AdvertisingIdClient advertisingIdClient3 = advertisingIdClient2;
        if (eh91.c == null) {
            synchronized (eh91.d) {
                try {
                    if (eh91.c == null) {
                        eh91.c = new eh91(context);
                    }
                } finally {
                }
            }
        }
        eh91 eh91Var = eh91.c;
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int i = -1;
        try {
            zzf = advertisingIdClient3.zzf(-1);
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            advertisingIdClient3.zze(zzf, true, 0.0f, elapsedRealtime, "", null);
            advertisingIdClient = advertisingIdClient3;
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            advertisingIdClient = advertisingIdClient3;
        }
        try {
            eh91Var.a(0, (int) (SystemClock.elapsedRealtime() - elapsedRealtime2), elapsedRealtime2, System.currentTimeMillis());
            Log.i("AdvertisingIdClient", "GetInfoInternal elapse " + elapsedRealtime + "ms");
            return zzf;
        } catch (Throwable th3) {
            th = th3;
            elapsedRealtime2 = elapsedRealtime2;
            Throwable th4 = th;
            advertisingIdClient.zze(null, true, 0.0f, -1L, "", th4);
            if (th4 instanceof IOException) {
                i = 1;
            } else if (th4 instanceof GooglePlayServicesNotAvailableException) {
                i = 9;
            } else if (th4 instanceof GooglePlayServicesRepairableException) {
                i = 16;
            } else if (th4 instanceof IllegalStateException) {
                i = 8;
            }
            eh91Var.a(i, (int) (SystemClock.elapsedRealtime() - elapsedRealtime2), elapsedRealtime2, System.currentTimeMillis());
            throw th4;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzc(false);
            cvw.k("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                advertisingIdClient.zzd();
                cvw.l(advertisingIdClient.zza);
                cvw.l(advertisingIdClient.zzb);
                try {
                    zzd = advertisingIdClient.zzb.zzd();
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception", e);
                }
            }
            advertisingIdClient.zzb();
            advertisingIdClient.zza();
            return zzd;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final Info zzf(int i) throws IOException {
        Info info;
        cvw.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            zzd();
            cvw.l(this.zza);
            cvw.l(this.zzb);
            try {
                info = new Info(this.zzb.zzc(), this.zzb.zze(true));
            } catch (RemoteException e) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                throw new IOException("Remote exception", e);
            }
        }
        zzb();
        return info;
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzf(-1);
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzc(true);
    }

    public final void zza() {
        cvw.k("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzi == null || this.zza == null) {
                    return;
                }
                try {
                    if (this.zzc) {
                        yvi0.s().w(this.zzi, this.zza);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            m891 m891Var = this.zze;
            if (m891Var != null) {
                m891Var.c.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.zzf;
            if (j > 0) {
                this.zze = new m891(this, j);
            }
        }
    }

    public final void zzc(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        IOException iOException;
        cvw.k("Calling this from your main thread can lead to deadlock");
        if (z) {
            zzb();
        }
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                Context context = this.zzi;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int d = b.b.d(context, 12451000);
                    if (d != 0 && d != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    BlockingServiceConnection blockingServiceConnection = new BlockingServiceConnection();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!yvi0.s().o(context, intent, blockingServiceConnection, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.zza = blockingServiceConnection;
                        try {
                            try {
                                this.zzb = zze.zza(blockingServiceConnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS));
                                this.zzc = true;
                            } finally {
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        }
                    } finally {
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void zzd() throws IOException {
        try {
            if (!this.zzc) {
                try {
                    zzc(false);
                    if (!this.zzc) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
        } finally {
        }
    }

    public final boolean zze(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap p = x4e.p("app_context", "1");
        if (info != null) {
            p.put(CommonUrlParts.LIMIT_AD_TRACKING, true != info.isLimitAdTrackingEnabled() ? "0" : "1");
            String id = info.getId();
            if (id != null) {
                p.put("ad_id_size", Integer.toString(id.length()));
            }
        }
        if (th != null) {
            p.put("error", th.getClass().getName());
        }
        p.put("tag", "AdvertisingIdClient");
        p.put("time_spent", Long.toString(j));
        new a(p).start();
        return true;
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }
}
