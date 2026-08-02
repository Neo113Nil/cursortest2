package xsna;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzbt;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfx;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zznt;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzox;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.mbridge.msdk.foundation.download.Command;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.chromium.base.TimeUtils;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class qj01 implements ed01 {
    public static volatile qj01 G;
    public final HashMap B;
    public final HashMap C;
    public dg01 D;
    public String E;
    public final fb01 b;
    public final p901 c;
    public ayz0 d;
    public r901 e;
    public ij01 f;
    public fuz0 g;
    public final sj01 h;
    public cg01 i;
    public ai01 j;
    public z901 l;
    public final mb01 m;
    public boolean o;

    @VisibleForTesting
    public long p;
    public ArrayList q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public FileLock w;
    public FileChannel x;
    public ArrayList y;
    public ArrayList z;
    public boolean n = false;
    public final rob F = new rob(this);
    public long A = -1;
    public final lj01 k = new lj01(this);

    public qj01(rj01 rj01Var) {
        this.m = mb01.r((Context) rj01Var.b, null, null);
        sj01 sj01Var = new sj01(this);
        sj01Var.m();
        this.h = sj01Var;
        p901 p901Var = new p901(this);
        p901Var.m();
        this.c = p901Var;
        fb01 fb01Var = new fb01(this);
        fb01Var.m();
        this.b = fb01Var;
        this.B = new HashMap();
        this.C = new HashMap();
        d().s(new mj01(this, rj01Var));
    }

    public static final boolean H(com.google.android.gms.measurement.internal.zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.c) && TextUtils.isEmpty(zzqVar.r)) ? false : true;
    }

    public static final void I(kj01 kj01Var) {
        if (kj01Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!kj01Var.f) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(kj01Var.getClass())));
        }
    }

    public static qj01 O(Context context) {
        exc0.i(context);
        exc0.i(context.getApplicationContext());
        if (G == null) {
            synchronized (qj01.class) {
                try {
                    if (G == null) {
                        rj01 rj01Var = new rj01();
                        exc0.i(context);
                        Context applicationContext = context.getApplicationContext();
                        exc0.i(applicationContext);
                        rj01Var.b = applicationContext;
                        G = new qj01(rj01Var);
                    }
                } finally {
                }
            }
        }
        return G;
    }

    @VisibleForTesting
    public static final void x(zzfs zzfsVar, int i, String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((zzfx) zzp.get(i2)).zzg())) {
                return;
            }
        }
        zzfw zze = zzfx.zze();
        zze.zzj("_err");
        zze.zzi(i);
        zzfx zzfxVar = (zzfx) zze.zzaC();
        zzfw zze2 = zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfx zzfxVar2 = (zzfx) zze2.zzaC();
        zzfsVar.zzf(zzfxVar);
        zzfsVar.zzf(zzfxVar2);
    }

    @VisibleForTesting
    public static final void y(zzfs zzfsVar, @NonNull String str) {
        List zzp = zzfsVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((zzfx) zzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    public final Boolean A(qd01 qd01Var) {
        try {
            long B = qd01Var.B();
            mb01 mb01Var = this.m;
            if (B != -2147483648L) {
                if (qd01Var.B() == xzx0.a(mb01Var.b).b(qd01Var.F(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = xzx0.a(mb01Var.b).b(qd01Var.F(), 0).versionName;
                String H = qd01Var.H();
                if (H != null && H.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final void B() {
        d().k();
        if (this.t || this.u || this.v) {
            e().q.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v));
            return;
        }
        e().q.a("Stopping uploading service(s)");
        ArrayList arrayList = this.q;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.q;
        exc0.i(arrayList2);
        arrayList2.clear();
    }

    @VisibleForTesting
    public final void C(zzgc zzgcVar, long j, boolean z) {
        uj01 uj01Var;
        Object obj;
        String str = true != z ? "_lte" : "_se";
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        uj01 H = ayz0Var.H(zzgcVar.zzap(), str);
        if (H == null || (obj = H.e) == null) {
            String zzap = zzgcVar.zzap();
            ((jcl) f()).getClass();
            uj01Var = new uj01(zzap, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String zzap2 = zzgcVar.zzap();
            ((jcl) f()).getClass();
            uj01Var = new uj01(zzap2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        zzgl zzd = zzgm.zzd();
        zzd.zzf(str);
        ((jcl) f()).getClass();
        zzd.zzg(System.currentTimeMillis());
        Object obj2 = uj01Var.e;
        zzd.zze(((Long) obj2).longValue());
        zzgm zzgmVar = (zzgm) zzd.zzaC();
        int x = sj01.x(zzgcVar, str);
        if (x >= 0) {
            zzgcVar.zzam(x, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            ayz0 ayz0Var2 = this.d;
            I(ayz0Var2);
            ayz0Var2.u(uj01Var);
            e().q.c("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0277, code lost:
    
        if (r9.enabled != false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D() {
        boolean z;
        long max;
        long max2;
        long j;
        sj01 sj01Var = this.h;
        d().k();
        b();
        if (this.p > 0) {
            ((jcl) f()).getClass();
            long abs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.p);
            if (abs > 0) {
                e().q.b(Long.valueOf(abs), "Upload has been suspended. Will update scheduling later in approximately ms");
                N().a();
                ij01 ij01Var = this.f;
                I(ij01Var);
                ij01Var.o();
                return;
            }
            this.p = 0L;
        }
        if (!this.m.h() || !F()) {
            e().q.a("Nothing to upload or uploading impossible");
            N().a();
            ij01 ij01Var2 = this.f;
            I(ij01Var2);
            ij01Var2.o();
            return;
        }
        ((jcl) f()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        K();
        long max3 = Math.max(0L, ((Long) s701.A.a(null)).longValue());
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        if (ayz0Var.x("select count(1) > 0 from raw_events where realtime = 1", null) == 0) {
            ayz0 ayz0Var2 = this.d;
            I(ayz0Var2);
            if (ayz0Var2.x("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
                z = false;
                if (z) {
                    K();
                    max = Math.max(0L, ((Long) s701.t.a(null)).longValue());
                } else {
                    String l = K().l("debug.firebase.analytics.app");
                    if (TextUtils.isEmpty(l) || ".none.".equals(l)) {
                        K();
                        max = Math.max(0L, ((Long) s701.u.a(null)).longValue());
                    } else {
                        K();
                        max = Math.max(0L, ((Long) s701.v.a(null)).longValue());
                    }
                }
                long a = this.j.j.a();
                long a2 = this.j.k.a();
                ayz0 ayz0Var3 = this.d;
                I(ayz0Var3);
                long z2 = ayz0Var3.z("select max(bundle_end_timestamp) from queue", null, 0L);
                ayz0 ayz0Var4 = this.d;
                I(ayz0Var4);
                max2 = Math.max(z2, ayz0Var4.z("select max(timestamp) from raw_events", null, 0L));
                if (max2 != 0) {
                    long abs2 = currentTimeMillis - Math.abs(max2 - currentTimeMillis);
                    long abs3 = Math.abs(a - currentTimeMillis);
                    long abs4 = currentTimeMillis - Math.abs(a2 - currentTimeMillis);
                    long max4 = Math.max(currentTimeMillis - abs3, abs4);
                    long j2 = max3 + abs2;
                    if (z && max4 > 0) {
                        j2 = Math.min(abs2, max4) + max;
                    }
                    I(sj01Var);
                    j = !sj01Var.M(max4, max) ? max4 + max : j2;
                    if (abs4 != 0 && abs4 >= abs2) {
                        int i = 0;
                        while (true) {
                            K();
                            if (i >= Math.min(20, Math.max(0, ((Integer) s701.C.a(null)).intValue()))) {
                                break;
                            }
                            K();
                            j += Math.max(0L, ((Long) s701.B.a(null)).longValue()) * (1 << i);
                            if (j > abs4) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (j == 0) {
                        e().q.a("Next upload time is 0");
                        N().a();
                        ij01 ij01Var3 = this.f;
                        I(ij01Var3);
                        ij01Var3.o();
                        return;
                    }
                    p901 p901Var = this.c;
                    I(p901Var);
                    if (!p901Var.o()) {
                        e().q.a("No network");
                        r901 N = N();
                        qj01 qj01Var = N.a;
                        qj01Var.b();
                        qj01Var.d().k();
                        if (!N.b) {
                            qj01Var.m.b.registerReceiver(N, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            p901 p901Var2 = qj01Var.c;
                            I(p901Var2);
                            N.c = p901Var2.o();
                            qj01Var.e().q.b(Boolean.valueOf(N.c), "Registering connectivity change receiver. Network connected");
                            N.b = true;
                        }
                        ij01 ij01Var4 = this.f;
                        I(ij01Var4);
                        ij01Var4.o();
                        return;
                    }
                    long a3 = this.j.i.a();
                    K();
                    long max5 = Math.max(0L, ((Long) s701.s.a(null)).longValue());
                    I(sj01Var);
                    if (!sj01Var.M(a3, max5)) {
                        j = Math.max(j, a3 + max5);
                    }
                    N().a();
                    ((jcl) f()).getClass();
                    long currentTimeMillis2 = j - System.currentTimeMillis();
                    if (currentTimeMillis2 <= 0) {
                        K();
                        currentTimeMillis2 = Math.max(0L, ((Long) s701.w.a(null)).longValue());
                        u901 u901Var = this.j.j;
                        ((jcl) f()).getClass();
                        u901Var.b(System.currentTimeMillis());
                    }
                    e().q.b(Long.valueOf(currentTimeMillis2), "Upload scheduled in approximately ms");
                    ij01 ij01Var5 = this.f;
                    I(ij01Var5);
                    ij01Var5.l();
                    mb01 mb01Var = (mb01) ij01Var5.b;
                    mb01Var.getClass();
                    Context context = mb01Var.b;
                    k901 k901Var = mb01Var.j;
                    if (!sk01.V(context)) {
                        mb01.k(k901Var);
                        k901Var.p.a("Receiver not registered/enabled");
                    }
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager != null && (r9 = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    mb01.k(k901Var);
                    k901Var.p.a("Service not registered/enabled");
                    ij01Var5.o();
                    mb01.k(k901Var);
                    k901Var.q.b(Long.valueOf(currentTimeMillis2), "Scheduling upload, millis");
                    mb01Var.o.getClass();
                    SystemClock.elapsedRealtime();
                    if (currentTimeMillis2 < Math.max(0L, ((Long) s701.x.a(null)).longValue()) && ij01Var5.q().c == 0) {
                        ij01Var5.q().c(currentTimeMillis2);
                    }
                    ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
                    int p = ij01Var5.p();
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                    zzbt.zza(context, new JobInfo.Builder(p, componentName).setMinimumLatency(currentTimeMillis2).setOverrideDeadline(currentTimeMillis2 + currentTimeMillis2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
                    return;
                }
                j = 0;
                if (j == 0) {
                }
            }
        }
        z = true;
        if (z) {
        }
        long a4 = this.j.j.a();
        long a22 = this.j.k.a();
        ayz0 ayz0Var32 = this.d;
        I(ayz0Var32);
        long z22 = ayz0Var32.z("select max(bundle_end_timestamp) from queue", null, 0L);
        ayz0 ayz0Var42 = this.d;
        I(ayz0Var42);
        max2 = Math.max(z22, ayz0Var42.z("select max(timestamp) from raw_events", null, 0L));
        if (max2 != 0) {
        }
        j = 0;
        if (j == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:390:0x0bc1, code lost:
    
        if (r9 > (((java.lang.Long) r0.a(null)).longValue() + r7)) goto L382;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04cf A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0824 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0868 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x088d A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x090f A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0939 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0ba8 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0c3c A[Catch: all -> 0x00fd, TRY_LEAVE, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0c58 A[Catch: all -> 0x00fd, SQLiteException -> 0x0c72, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0c72, blocks: (B:398:0x0c49, B:400:0x0c58), top: B:397:0x0c49, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c7 A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x048e A[Catch: all -> 0x00fd, TryCatch #4 {all -> 0x00fd, blocks: (B:3:0x0016, B:5:0x002b, B:8:0x0033, B:9:0x0047, B:12:0x0063, B:15:0x0088, B:17:0x00c2, B:20:0x00d8, B:22:0x00e2, B:25:0x053a, B:26:0x010d, B:28:0x011d, B:31:0x013d, B:33:0x0143, B:35:0x0155, B:37:0x0163, B:39:0x0173, B:41:0x017e, B:46:0x0183, B:49:0x019a, B:65:0x03c7, B:66:0x03d3, B:69:0x03df, B:73:0x0402, B:74:0x03f1, B:83:0x0482, B:85:0x048e, B:88:0x049f, B:90:0x04b0, B:92:0x04bc, B:94:0x0528, B:100:0x04cf, B:102:0x04db, B:105:0x04ec, B:107:0x04fd, B:109:0x0509, B:113:0x040c, B:115:0x0418, B:117:0x0424, B:122:0x0468, B:123:0x0440, B:126:0x0452, B:128:0x0458, B:130:0x0462, B:135:0x01f2, B:138:0x01fc, B:140:0x020a, B:142:0x0258, B:143:0x0228, B:145:0x0238, B:153:0x0261, B:155:0x0290, B:156:0x02b8, B:158:0x02f2, B:159:0x02f8, B:162:0x0304, B:164:0x033c, B:165:0x0357, B:167:0x035d, B:169:0x036d, B:171:0x0385, B:172:0x0375, B:182:0x038e, B:185:0x0396, B:186:0x03ae, B:200:0x0550, B:202:0x055e, B:204:0x0567, B:206:0x059a, B:207:0x0571, B:209:0x057a, B:211:0x0580, B:213:0x058c, B:215:0x0594, B:218:0x059d, B:219:0x05a9, B:222:0x05b1, B:225:0x05c3, B:226:0x05cf, B:228:0x05d7, B:229:0x05fc, B:231:0x0623, B:233:0x0632, B:235:0x0638, B:237:0x0642, B:238:0x066b, B:240:0x0671, B:244:0x067f, B:242:0x0683, B:246:0x0686, B:247:0x0689, B:248:0x0697, B:250:0x069d, B:252:0x06ad, B:253:0x06b4, B:255:0x06c0, B:257:0x06c7, B:260:0x06ca, B:262:0x070a, B:263:0x071d, B:265:0x0723, B:268:0x073e, B:270:0x0757, B:272:0x076d, B:274:0x0775, B:276:0x0779, B:278:0x077d, B:280:0x0787, B:281:0x0792, B:283:0x0796, B:285:0x079c, B:286:0x07a7, B:287:0x07b5, B:290:0x0a25, B:295:0x07c0, B:362:0x07db, B:299:0x0802, B:301:0x0824, B:302:0x082c, B:304:0x0832, B:307:0x0844, B:312:0x0868, B:313:0x088d, B:315:0x0899, B:317:0x08b0, B:318:0x08f5, B:323:0x090f, B:325:0x091a, B:327:0x091e, B:329:0x0922, B:331:0x0926, B:332:0x0932, B:334:0x0939, B:336:0x093f, B:338:0x0956, B:339:0x095b, B:340:0x0a22, B:342:0x0999, B:344:0x099e, B:347:0x09b2, B:349:0x09ce, B:350:0x09d5, B:353:0x0a16, B:354:0x09a3, B:360:0x0855, B:366:0x07e3, B:368:0x0a2f, B:370:0x0a3d, B:371:0x0a43, B:372:0x0a4b, B:374:0x0a51, B:376:0x0a6a, B:378:0x0a7b, B:379:0x0b04, B:381:0x0b0a, B:383:0x0b20, B:386:0x0b27, B:387:0x0b56, B:389:0x0ba8, B:391:0x0be8, B:393:0x0bec, B:394:0x0bf7, B:396:0x0c3c, B:398:0x0c49, B:400:0x0c58, B:403:0x0c73, B:406:0x0c8e, B:407:0x0bc3, B:408:0x0b2f, B:410:0x0b3b, B:411:0x0b3f, B:412:0x0ca7, B:413:0x0cbf, B:416:0x0cc7, B:418:0x0ccc, B:421:0x0cdc, B:423:0x0cf6, B:424:0x0d13, B:426:0x0d1c, B:427:0x0d3c, B:433:0x0d27, B:434:0x0a94, B:436:0x0a9a, B:438:0x0aaa, B:439:0x0ab1, B:444:0x0ac7, B:445:0x0ace, B:447:0x0af5, B:448:0x0afc, B:449:0x0af9, B:450:0x0acb, B:452:0x0aae, B:454:0x05dc, B:456:0x05e2, B:459:0x0d4f), top: B:2:0x0016, inners: #0, #1, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(long j) {
        int i;
        mb01 mb01Var;
        fb01 fb01Var;
        sj01 sj01Var;
        Long l;
        long j2;
        fb01 fb01Var2;
        ayz0 ayz0Var;
        zzgd zzgdVar;
        long currentTimeMillis;
        long zzk;
        r701 r701Var;
        ContentValues contentValues;
        long j3;
        sj01 sj01Var2;
        long parseLong;
        int t;
        long j4;
        fb01 fb01Var3;
        long zzb;
        Long l2;
        String str;
        boolean z;
        String str2;
        boolean z2;
        int i2;
        oj01 oj01Var;
        int i3;
        int i4;
        char c;
        String str3 = "1";
        String str4 = "_ai";
        Long l3 = 1L;
        ayz0 ayz0Var2 = this.d;
        I(ayz0Var2);
        ayz0Var2.O();
        try {
            oj01 oj01Var2 = new oj01(this);
            ayz0 ayz0Var3 = this.d;
            I(ayz0Var3);
            ayz0Var3.v(j, this.A, oj01Var2);
            ArrayList arrayList = oj01Var2.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                zzgc zzgcVar = (zzgc) oj01Var2.a.zzby();
                zzgcVar.zzr();
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                zzfs zzfsVar = null;
                int i8 = -1;
                zzfs zzfsVar2 = null;
                int i9 = 0;
                while (true) {
                    int size = oj01Var2.c.size();
                    i = i7;
                    mb01Var = this.m;
                    fb01Var = this.b;
                    zzfs zzfsVar3 = zzfsVar;
                    sj01Var = this.h;
                    l = l3;
                    if (i6 >= size) {
                        break;
                    }
                    zzfs zzfsVar4 = (zzfs) ((zzft) oj01Var2.c.get(i6)).zzby();
                    I(fb01Var);
                    if (fb01Var.y(oj01Var2.a.zzx(), zzfsVar4.zzo())) {
                        int i10 = i6;
                        e().q().c("Dropping blocked raw event. appId", k901.r(oj01Var2.a.zzx()), mb01Var.q().d(zzfsVar4.zzo()));
                        I(fb01Var);
                        if (!str3.equals(fb01Var.b(oj01Var2.a.zzx(), "measurement.upload.blacklist_internal"))) {
                            I(fb01Var);
                            if (!str3.equals(fb01Var.b(oj01Var2.a.zzx(), "measurement.upload.blacklist_public")) && !"_err".equals(zzfsVar4.zzo())) {
                                Q();
                                sk01.z(this.F, oj01Var2.a.zzx(), 11, "_ev", zzfsVar4.zzo(), 0);
                            }
                        }
                        str = str3;
                        str2 = str4;
                        i7 = i;
                        zzfsVar = zzfsVar3;
                        i4 = i10;
                    } else {
                        int i11 = i6;
                        if (zzfsVar4.zzo().equals(yiz.r(str4))) {
                            zzfsVar4.zzi(str4);
                            e().p().a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(e().u(), 5)) {
                                int i12 = 0;
                                while (i12 < zzfsVar4.zza()) {
                                    String str5 = str3;
                                    if ("ad_platform".equals(zzfsVar4.zzn(i12).zzg()) && !zzfsVar4.zzn(i12).zzh().isEmpty() && InneractiveMediationNameConsts.ADMOB.equalsIgnoreCase(zzfsVar4.zzn(i12).zzh())) {
                                        e().n.a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i12++;
                                    str3 = str5;
                                }
                            }
                        }
                        str = str3;
                        I(fb01Var);
                        boolean x = fb01Var.x(oj01Var2.a.zzx(), zzfsVar4.zzo());
                        if (x) {
                            z = x;
                            str2 = str4;
                        } else {
                            I(sj01Var);
                            String zzo = zzfsVar4.zzo();
                            exc0.f(zzo);
                            int hashCode = zzo.hashCode();
                            z = x;
                            str2 = str4;
                            if (hashCode == 94660) {
                                if (zzo.equals("_in")) {
                                    c = 0;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            } else if (hashCode != 95025) {
                                if (hashCode == 95027 && zzo.equals("_ui")) {
                                    c = 1;
                                    if (c != 0 && c != 1 && c != 2) {
                                        i2 = i8;
                                        z = false;
                                        if (z) {
                                            ArrayList arrayList2 = new ArrayList(zzfsVar4.zzp());
                                            int i13 = 0;
                                            int i14 = -1;
                                            int i15 = -1;
                                            while (true) {
                                                oj01Var = oj01Var2;
                                                if (i13 >= arrayList2.size()) {
                                                    break;
                                                }
                                                if ("value".equals(((zzfx) arrayList2.get(i13)).zzg())) {
                                                    i14 = i13;
                                                } else if (InAppPurchaseMetaData.KEY_CURRENCY.equals(((zzfx) arrayList2.get(i13)).zzg())) {
                                                    i15 = i13;
                                                }
                                                i13++;
                                                oj01Var2 = oj01Var;
                                            }
                                            if (i14 != -1) {
                                                if (((zzfx) arrayList2.get(i14)).zzw() || ((zzfx) arrayList2.get(i14)).zzu()) {
                                                    if (i15 != -1) {
                                                        String zzh = ((zzfx) arrayList2.get(i15)).zzh();
                                                        if (zzh.length() == 3) {
                                                            int i16 = 0;
                                                            while (i16 < zzh.length()) {
                                                                int codePointAt = zzh.codePointAt(i16);
                                                                if (Character.isLetter(codePointAt)) {
                                                                    i16 += Character.charCount(codePointAt);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    e().n.a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                    zzfsVar4.zzh(i14);
                                                    y(zzfsVar4, "_c");
                                                    x(zzfsVar4, 19, InAppPurchaseMetaData.KEY_CURRENCY);
                                                    break;
                                                }
                                                e().n.a("Value must be specified with a numeric type.");
                                                zzfsVar4.zzh(i14);
                                                y(zzfsVar4, "_c");
                                                x(zzfsVar4, 18, "value");
                                            }
                                            if ("_e".equals(zzfsVar4.zzo())) {
                                                if ("_vs".equals(zzfsVar4.zzo())) {
                                                    I(sj01Var);
                                                    if (sj01.o((zzft) zzfsVar4.zzaC(), "_et") == null) {
                                                        if (zzfsVar3 == null || Math.abs(zzfsVar3.zzc() - zzfsVar4.zzc()) > 1000) {
                                                            zzfsVar2 = zzfsVar4;
                                                            i8 = i2;
                                                            i5 = i;
                                                            zzfsVar = zzfsVar3;
                                                        } else {
                                                            zzfs zzfsVar5 = (zzfs) zzfsVar3.clone();
                                                            if (G(zzfsVar5, zzfsVar4)) {
                                                                i3 = i2;
                                                                zzgcVar.zzS(i3, zzfsVar5);
                                                                zzfsVar = null;
                                                                zzfsVar2 = null;
                                                            } else {
                                                                i3 = i2;
                                                                zzfsVar2 = zzfsVar4;
                                                                i5 = i;
                                                                zzfsVar = zzfsVar3;
                                                            }
                                                            i8 = i3;
                                                        }
                                                    }
                                                }
                                                i8 = i2;
                                                zzfsVar = zzfsVar3;
                                            } else {
                                                I(sj01Var);
                                                if (sj01.o((zzft) zzfsVar4.zzaC(), "_fr") == null) {
                                                    if (zzfsVar2 != null && Math.abs(zzfsVar2.zzc() - zzfsVar4.zzc()) <= 1000) {
                                                        zzfs zzfsVar6 = (zzfs) zzfsVar2.clone();
                                                        if (G(zzfsVar4, zzfsVar6)) {
                                                            zzgcVar.zzS(i5, zzfsVar6);
                                                            i8 = i2;
                                                            zzfsVar = null;
                                                            zzfsVar2 = null;
                                                        }
                                                    }
                                                    zzfsVar = zzfsVar4;
                                                    i8 = i;
                                                }
                                                i8 = i2;
                                                zzfsVar = zzfsVar3;
                                            }
                                            oj01Var2 = oj01Var;
                                            i4 = i11;
                                            oj01Var2.c.set(i4, (zzft) zzfsVar4.zzaC());
                                            i7 = i + 1;
                                            zzgcVar.zzk(zzfsVar4);
                                        } else {
                                            oj01Var = oj01Var2;
                                        }
                                        if ("_e".equals(zzfsVar4.zzo())) {
                                        }
                                        oj01Var2 = oj01Var;
                                        i4 = i11;
                                        oj01Var2.c.set(i4, (zzft) zzfsVar4.zzaC());
                                        i7 = i + 1;
                                        zzgcVar.zzk(zzfsVar4);
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                    i2 = i8;
                                    z = false;
                                    if (z) {
                                    }
                                    if ("_e".equals(zzfsVar4.zzo())) {
                                    }
                                    oj01Var2 = oj01Var;
                                    i4 = i11;
                                    oj01Var2.c.set(i4, (zzft) zzfsVar4.zzaC());
                                    i7 = i + 1;
                                    zzgcVar.zzk(zzfsVar4);
                                }
                            } else {
                                if (zzo.equals("_ug")) {
                                    c = 2;
                                    if (c != 0) {
                                    }
                                }
                                c = 65535;
                                if (c != 0) {
                                }
                            }
                        }
                        int i17 = 0;
                        boolean z3 = false;
                        boolean z4 = false;
                        while (true) {
                            z2 = z3;
                            if (i17 >= zzfsVar4.zza()) {
                                break;
                            }
                            if ("_c".equals(zzfsVar4.zzn(i17).zzg())) {
                                zzfw zzfwVar = (zzfw) zzfsVar4.zzn(i17).zzby();
                                zzfwVar.zzi(1L);
                                zzfsVar4.zzk(i17, (zzfx) zzfwVar.zzaC());
                                z4 = z4;
                                z3 = true;
                            } else {
                                boolean z5 = z4;
                                if ("_r".equals(zzfsVar4.zzn(i17).zzg())) {
                                    zzfw zzfwVar2 = (zzfw) zzfsVar4.zzn(i17).zzby();
                                    zzfwVar2.zzi(1L);
                                    zzfsVar4.zzk(i17, (zzfx) zzfwVar2.zzaC());
                                    z3 = z2;
                                    z4 = true;
                                } else {
                                    z3 = z2;
                                    z4 = z5;
                                }
                            }
                            i17++;
                        }
                        boolean z6 = z4;
                        if (z2 || !z) {
                            i2 = i8;
                        } else {
                            i2 = i8;
                            e().p().b(mb01Var.q().d(zzfsVar4.zzo()), "Marking event as conversion");
                            zzfw zze = zzfx.zze();
                            zze.zzj("_c");
                            zze.zzi(1L);
                            zzfsVar4.zze(zze);
                        }
                        if (!z6) {
                            e().p().b(mb01Var.q().d(zzfsVar4.zzo()), "Marking event as real-time");
                            zzfw zze2 = zzfx.zze();
                            zze2.zzj("_r");
                            zze2.zzi(1L);
                            zzfsVar4.zze(zze2);
                        }
                        ayz0 ayz0Var4 = this.d;
                        I(ayz0Var4);
                        if (ayz0Var4.F(w(), oj01Var2.a.zzx(), 1L, false, false, false, false, true).e > K().o(oj01Var2.a.zzx(), s701.p)) {
                            y(zzfsVar4, "_r");
                        } else {
                            i9 = 1;
                        }
                        if (sk01.U(zzfsVar4.zzo()) && z) {
                            ayz0 ayz0Var5 = this.d;
                            I(ayz0Var5);
                            if (ayz0Var5.F(w(), oj01Var2.a.zzx(), 1L, false, false, true, false, false).c > K().o(oj01Var2.a.zzx(), s701.o)) {
                                e().q().b(k901.r(oj01Var2.a.zzx()), "Too many conversions. Not logging as conversion. appId");
                                zzfw zzfwVar3 = null;
                                boolean z7 = false;
                                int i18 = -1;
                                for (int i19 = 0; i19 < zzfsVar4.zza(); i19++) {
                                    zzfx zzn = zzfsVar4.zzn(i19);
                                    zzfw zzfwVar4 = zzfwVar3;
                                    if ("_c".equals(zzn.zzg())) {
                                        zzfwVar3 = (zzfw) zzn.zzby();
                                        i18 = i19;
                                    } else if ("_err".equals(zzn.zzg())) {
                                        zzfwVar3 = zzfwVar4;
                                        z7 = true;
                                    } else {
                                        zzfwVar3 = zzfwVar4;
                                    }
                                }
                                zzfw zzfwVar5 = zzfwVar3;
                                if (z7) {
                                    if (zzfwVar5 != null) {
                                        zzfsVar4.zzh(i18);
                                    } else {
                                        zzfwVar5 = null;
                                    }
                                }
                                if (zzfwVar5 != null) {
                                    zzfw zzfwVar6 = (zzfw) zzfwVar5.clone();
                                    zzfwVar6.zzj("_err");
                                    zzfwVar6.zzi(10L);
                                    zzfsVar4.zzk(i18, (zzfx) zzfwVar6.zzaC());
                                } else {
                                    e().o().b(k901.r(oj01Var2.a.zzx()), "Did not find conversion parameter. appId");
                                }
                            }
                        }
                        if (z) {
                        }
                        if ("_e".equals(zzfsVar4.zzo())) {
                        }
                        oj01Var2 = oj01Var;
                        i4 = i11;
                        oj01Var2.c.set(i4, (zzft) zzfsVar4.zzaC());
                        i7 = i + 1;
                        zzgcVar.zzk(zzfsVar4);
                    }
                    i6 = i4 + 1;
                    l3 = l;
                    str3 = str;
                    str4 = str2;
                }
                long j5 = 0;
                long j6 = 0;
                int i20 = i;
                int i21 = 0;
                while (i21 < i20) {
                    zzft zze3 = zzgcVar.zze(i21);
                    if ("_e".equals(zze3.zzh())) {
                        I(sj01Var);
                        if (sj01.o(zze3, "_fr") != null) {
                            zzgcVar.zzA(i21);
                            i20--;
                            i21--;
                            i21++;
                        }
                    }
                    I(sj01Var);
                    zzfx o = sj01.o(zze3, "_et");
                    if (o != null) {
                        Long valueOf = o.zzw() ? Long.valueOf(o.zzd()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j6 += valueOf.longValue();
                        }
                    }
                    i21++;
                }
                C(zzgcVar, j6, false);
                Iterator it = zzgcVar.zzas().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("_s".equals(((zzft) it.next()).zzh())) {
                        ayz0 ayz0Var6 = this.d;
                        I(ayz0Var6);
                        ayz0Var6.o(zzgcVar.zzap(), "_se");
                        break;
                    }
                }
                if (sj01.x(zzgcVar, "_sid") >= 0) {
                    C(zzgcVar, j6, true);
                } else {
                    int x2 = sj01.x(zzgcVar, "_se");
                    if (x2 >= 0) {
                        zzgcVar.zzB(x2);
                        e().o().b(k901.r(oj01Var2.a.zzx()), "Session engagement user property is in the bundle without session ID. appId");
                    }
                }
                I(sj01Var);
                sj01 sj01Var3 = sj01Var;
                qj01 qj01Var = sj01Var3.e;
                mb01 mb01Var2 = (mb01) sj01Var3.b;
                mb01Var2.e().p().a("Checking account type status for ad personalization signals");
                fb01 fb01Var4 = qj01Var.b;
                I(fb01Var4);
                if (fb01Var4.w(zzgcVar.zzap())) {
                    ayz0 ayz0Var7 = qj01Var.d;
                    I(ayz0Var7);
                    qd01 D = ayz0Var7.D(zzgcVar.zzap());
                    if (D != null && D.A() && mb01Var2.n().r()) {
                        mb01Var2.e().p.a("Turning off ad personalization due to account type");
                        zzgl zzd = zzgm.zzd();
                        zzd.zzf("_npa");
                        zzd.zzg(mb01Var2.n().o());
                        zzd.zze(1L);
                        zzgm zzgmVar = (zzgm) zzd.zzaC();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= zzgcVar.zzb()) {
                                zzgcVar.zzm(zzgmVar);
                                break;
                            }
                            if ("_npa".equals(zzgcVar.zzao(i22).zzf())) {
                                zzgcVar.zzam(i22, zzgmVar);
                                break;
                            }
                            i22++;
                        }
                    }
                }
                zzgcVar.zzai(Long.MAX_VALUE);
                zzgcVar.zzQ(Long.MIN_VALUE);
                for (int i23 = 0; i23 < zzgcVar.zza(); i23++) {
                    zzft zze4 = zzgcVar.zze(i23);
                    if (zze4.zzd() < zzgcVar.zzd()) {
                        zzgcVar.zzai(zze4.zzd());
                    }
                    if (zze4.zzd() > zzgcVar.zzc()) {
                        zzgcVar.zzQ(zze4.zzd());
                    }
                }
                zzgcVar.zzz();
                zzgcVar.zzo();
                fuz0 fuz0Var = this.g;
                I(fuz0Var);
                zzgcVar.zzf(fuz0Var.o(zzgcVar.zzap(), zzgcVar.zzas(), zzgcVar.zzat(), Long.valueOf(zzgcVar.zzd()), Long.valueOf(zzgcVar.zzc())));
                if (K().x(oj01Var2.a.zzx())) {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    SecureRandom s = Q().s();
                    int i24 = 0;
                    while (i24 < zzgcVar.zza()) {
                        zzfs zzfsVar7 = (zzfs) zzgcVar.zze(i24).zzby();
                        if (zzfsVar7.zzo().equals("_ep")) {
                            I(sj01Var3);
                            String str6 = (String) sj01.p((zzft) zzfsVar7.zzaC(), "_en");
                            kzz0 kzz0Var = (kzz0) hashMap.get(str6);
                            if (kzz0Var == null) {
                                ayz0 ayz0Var8 = this.d;
                                I(ayz0Var8);
                                j3 = j5;
                                String zzx = oj01Var2.a.zzx();
                                exc0.i(str6);
                                kzz0Var = ayz0Var8.G(zzx, str6);
                                if (kzz0Var != null) {
                                    hashMap.put(str6, kzz0Var);
                                }
                            } else {
                                j3 = j5;
                            }
                            if (kzz0Var == null || kzz0Var.i != null) {
                                l2 = l;
                            } else {
                                Long l4 = kzz0Var.j;
                                if (l4 != null && l4.longValue() > 1) {
                                    I(sj01Var3);
                                    sj01.P(zzfsVar7, "_sr", kzz0Var.j);
                                }
                                Boolean bool = kzz0Var.k;
                                if (bool == null || !bool.booleanValue()) {
                                    l2 = l;
                                } else {
                                    I(sj01Var3);
                                    l2 = l;
                                    sj01.P(zzfsVar7, "_efs", l2);
                                }
                                arrayList3.add((zzft) zzfsVar7.zzaC());
                            }
                            zzgcVar.zzS(i24, zzfsVar7);
                            l = l2;
                            sj01Var2 = sj01Var3;
                        } else {
                            j3 = j5;
                            Long l5 = l;
                            I(fb01Var);
                            String zzx2 = oj01Var2.a.zzx();
                            String b = fb01Var.b(zzx2, "measurement.account.time_zone_offset_minutes");
                            if (TextUtils.isEmpty(b)) {
                                sj01Var2 = sj01Var3;
                            } else {
                                try {
                                    parseLong = Long.parseLong(b);
                                    sj01Var2 = sj01Var3;
                                } catch (NumberFormatException e) {
                                    sj01Var2 = sj01Var3;
                                    ((mb01) fb01Var.b).e().q().c("Unable to parse timezone offset. appId", k901.r(zzx2), e);
                                }
                                Q();
                                long j7 = parseLong * 60000;
                                long zzc = (zzfsVar7.zzc() + j7) / TimeUtils.MILLISECONDS_PER_DAY;
                                zzft zzftVar = (zzft) zzfsVar7.zzaC();
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = zzftVar.zzi().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        zzfx zzfxVar = (zzfx) it2.next();
                                        if ("_dbg".equals(zzfxVar.zzg())) {
                                            if (l5.equals(Long.valueOf(zzfxVar.zzd()))) {
                                                t = 1;
                                            }
                                        }
                                    }
                                }
                                I(fb01Var);
                                t = fb01Var.t(oj01Var2.a.zzx(), zzfsVar7.zzo());
                                if (t > 0) {
                                    e().q().c("Sample rate must be positive. event, rate", zzfsVar7.zzo(), Integer.valueOf(t));
                                    arrayList3.add((zzft) zzfsVar7.zzaC());
                                    zzgcVar.zzS(i24, zzfsVar7);
                                    l = l5;
                                } else {
                                    kzz0 kzz0Var2 = (kzz0) hashMap.get(zzfsVar7.zzo());
                                    if (kzz0Var2 == null) {
                                        ayz0 ayz0Var9 = this.d;
                                        I(ayz0Var9);
                                        j4 = j7;
                                        kzz0Var2 = ayz0Var9.G(oj01Var2.a.zzx(), zzfsVar7.zzo());
                                        if (kzz0Var2 == null) {
                                            fb01Var3 = fb01Var;
                                            e().q().c("Event being bundled has no eventAggregate. appId, eventName", oj01Var2.a.zzx(), zzfsVar7.zzo());
                                            kzz0Var2 = new kzz0(oj01Var2.a.zzx(), zzfsVar7.zzo(), 1L, 1L, 1L, zzfsVar7.zzc(), 0L, null, null, null, null);
                                            I(sj01Var2);
                                            Long l6 = (Long) sj01.p((zzft) zzfsVar7.zzaC(), "_eid");
                                            boolean z8 = l6 == null;
                                            if (t != 1) {
                                                arrayList3.add((zzft) zzfsVar7.zzaC());
                                                if (z8 && (kzz0Var2.i != null || kzz0Var2.j != null || kzz0Var2.k != null)) {
                                                    hashMap.put(zzfsVar7.zzo(), kzz0Var2.a(null, null, null));
                                                }
                                                zzgcVar.zzS(i24, zzfsVar7);
                                                l = l5;
                                            } else {
                                                if (s.nextInt(t) == 0) {
                                                    I(sj01Var2);
                                                    boolean z9 = z8;
                                                    Long valueOf2 = Long.valueOf(t);
                                                    sj01.P(zzfsVar7, "_sr", valueOf2);
                                                    arrayList3.add((zzft) zzfsVar7.zzaC());
                                                    if (z9) {
                                                        kzz0Var2 = kzz0Var2.a(null, valueOf2, null);
                                                    }
                                                    hashMap.put(zzfsVar7.zzo(), new kzz0(kzz0Var2.a, kzz0Var2.b, kzz0Var2.c, kzz0Var2.d, kzz0Var2.e, kzz0Var2.f, zzfsVar7.zzc(), Long.valueOf(zzc), kzz0Var2.i, kzz0Var2.j, kzz0Var2.k));
                                                    l = l5;
                                                } else {
                                                    boolean z10 = z8;
                                                    Long l7 = kzz0Var2.h;
                                                    if (l7 != null) {
                                                        zzb = l7.longValue();
                                                    } else {
                                                        Q();
                                                        zzb = (j4 + zzfsVar7.zzb()) / TimeUtils.MILLISECONDS_PER_DAY;
                                                    }
                                                    if (zzb != zzc) {
                                                        I(sj01Var2);
                                                        sj01.P(zzfsVar7, "_efs", l5);
                                                        I(sj01Var2);
                                                        Long valueOf3 = Long.valueOf(t);
                                                        sj01.P(zzfsVar7, "_sr", valueOf3);
                                                        arrayList3.add((zzft) zzfsVar7.zzaC());
                                                        if (z10) {
                                                            kzz0Var2 = kzz0Var2.a(null, valueOf3, Boolean.TRUE);
                                                        }
                                                        l = l5;
                                                        hashMap.put(zzfsVar7.zzo(), new kzz0(kzz0Var2.a, kzz0Var2.b, kzz0Var2.c, kzz0Var2.d, kzz0Var2.e, kzz0Var2.f, zzfsVar7.zzc(), Long.valueOf(zzc), kzz0Var2.i, kzz0Var2.j, kzz0Var2.k));
                                                    } else {
                                                        l = l5;
                                                        if (z10) {
                                                            hashMap.put(zzfsVar7.zzo(), kzz0Var2.a(l6, null, null));
                                                        }
                                                    }
                                                }
                                                zzgcVar.zzS(i24, zzfsVar7);
                                            }
                                            i24++;
                                            fb01Var = fb01Var3;
                                            sj01Var3 = sj01Var2;
                                            j5 = j3;
                                        }
                                    } else {
                                        j4 = j7;
                                    }
                                    fb01Var3 = fb01Var;
                                    I(sj01Var2);
                                    Long l62 = (Long) sj01.p((zzft) zzfsVar7.zzaC(), "_eid");
                                    if (l62 == null) {
                                    }
                                    if (t != 1) {
                                    }
                                    i24++;
                                    fb01Var = fb01Var3;
                                    sj01Var3 = sj01Var2;
                                    j5 = j3;
                                }
                            }
                            parseLong = j3;
                            Q();
                            long j72 = parseLong * 60000;
                            long zzc2 = (zzfsVar7.zzc() + j72) / TimeUtils.MILLISECONDS_PER_DAY;
                            zzft zzftVar2 = (zzft) zzfsVar7.zzaC();
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            I(fb01Var);
                            t = fb01Var.t(oj01Var2.a.zzx(), zzfsVar7.zzo());
                            if (t > 0) {
                            }
                        }
                        fb01Var3 = fb01Var;
                        i24++;
                        fb01Var = fb01Var3;
                        sj01Var3 = sj01Var2;
                        j5 = j3;
                    }
                    j2 = j5;
                    fb01Var2 = fb01Var;
                    if (arrayList3.size() < zzgcVar.zza()) {
                        zzgcVar.zzr();
                        zzgcVar.zzg(arrayList3);
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        ayz0 ayz0Var10 = this.d;
                        I(ayz0Var10);
                        ayz0Var10.r((kzz0) entry.getValue());
                    }
                } else {
                    j2 = 0;
                    fb01Var2 = fb01Var;
                }
                String zzx3 = oj01Var2.a.zzx();
                ayz0 ayz0Var11 = this.d;
                I(ayz0Var11);
                qd01 D2 = ayz0Var11.D(zzx3);
                if (D2 == null) {
                    e().o().b(k901.r(oj01Var2.a.zzx()), "Bundling raw events w/o app info. appId");
                } else if (zzgcVar.zza() > 0) {
                    kb01 kb01Var = D2.a.k;
                    mb01.k(kb01Var);
                    kb01Var.k();
                    long j8 = D2.i;
                    if (j8 != j2) {
                        zzgcVar.zzab(j8);
                    } else {
                        zzgcVar.zzv();
                    }
                    kb01 kb01Var2 = D2.a.k;
                    mb01.k(kb01Var2);
                    kb01Var2.k();
                    long j9 = D2.h;
                    if (j9 != j2) {
                        j8 = j9;
                    }
                    if (j8 != j2) {
                        zzgcVar.zzac(j8);
                    } else {
                        zzgcVar.zzw();
                    }
                    D2.a();
                    kb01 kb01Var3 = D2.a.k;
                    mb01.k(kb01Var3);
                    kb01Var3.k();
                    zzgcVar.zzI((int) D2.g);
                    D2.w(zzgcVar.zzd());
                    D2.u(zzgcVar.zzc());
                    String E = D2.E();
                    if (E != null) {
                        zzgcVar.zzW(E);
                    } else {
                        zzgcVar.zzs();
                    }
                    ayz0 ayz0Var12 = this.d;
                    I(ayz0Var12);
                    ayz0Var12.q(D2);
                }
                if (zzgcVar.zza() > 0) {
                    mb01Var.getClass();
                    I(fb01Var2);
                    zzff u = fb01Var2.u(oj01Var2.a.zzx());
                    try {
                        try {
                            if (u != null && u.zzs()) {
                                zzgcVar.zzK(u.zzc());
                                ayz0Var = this.d;
                                I(ayz0Var);
                                zzgdVar = (zzgd) zzgcVar.zzaC();
                                ayz0Var.k();
                                ayz0Var.l();
                                exc0.i(zzgdVar);
                                exc0.f(zzgdVar.zzx());
                                exc0.l(zzgdVar.zzbe());
                                ayz0Var.R();
                                currentTimeMillis = ((jcl) ((mb01) ayz0Var.b).f()).currentTimeMillis();
                                zzk = zzgdVar.zzk();
                                ((mb01) ayz0Var.b).getClass();
                                r701Var = s701.D;
                                if (zzk >= currentTimeMillis - ((Long) r701Var.a(null)).longValue()) {
                                    long zzk2 = zzgdVar.zzk();
                                    ((mb01) ayz0Var.b).getClass();
                                }
                                ((mb01) ayz0Var.b).e().q().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", k901.r(zzgdVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                                byte[] zzbu = zzgdVar.zzbu();
                                sj01 sj01Var4 = ayz0Var.e.h;
                                I(sj01Var4);
                                byte[] O = sj01Var4.O(zzbu);
                                ((mb01) ayz0Var.b).e().p().b(Integer.valueOf(O.length), "Saving bundle, size");
                                contentValues = new ContentValues();
                                contentValues.put("app_id", zzgdVar.zzx());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                                contentValues.put("data", O);
                                contentValues.put("has_realtime", Integer.valueOf(i9));
                                if (zzgdVar.zzbk()) {
                                    contentValues.put("retry_count", Integer.valueOf(zzgdVar.zze()));
                                }
                                if (ayz0Var.C().insert("queue", null, contentValues) == -1) {
                                    ((mb01) ayz0Var.b).e().o().b(k901.r(zzgdVar.zzx()), "Failed to insert bundle (got -1). appId");
                                }
                            }
                            if (ayz0Var.C().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            ((mb01) ayz0Var.b).e().o().c("Error storing bundle. appId", k901.r(zzgdVar.zzx()), e2);
                        }
                        sj01 sj01Var42 = ayz0Var.e.h;
                        I(sj01Var42);
                        byte[] O2 = sj01Var42.O(zzbu);
                        ((mb01) ayz0Var.b).e().p().b(Integer.valueOf(O2.length), "Saving bundle, size");
                        contentValues = new ContentValues();
                        contentValues.put("app_id", zzgdVar.zzx());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(zzgdVar.zzk()));
                        contentValues.put("data", O2);
                        contentValues.put("has_realtime", Integer.valueOf(i9));
                        if (zzgdVar.zzbk()) {
                        }
                    } catch (IOException e3) {
                        ((mb01) ayz0Var.b).e().o().c("Data loss. Failed to serialize bundle. appId", k901.r(zzgdVar.zzx()), e3);
                    }
                    if (oj01Var2.a.zzF().isEmpty()) {
                        zzgcVar.zzK(-1L);
                    } else {
                        e().q().b(k901.r(oj01Var2.a.zzx()), "Did not find measurement config or missing version info. appId");
                    }
                    ayz0Var = this.d;
                    I(ayz0Var);
                    zzgdVar = (zzgd) zzgcVar.zzaC();
                    ayz0Var.k();
                    ayz0Var.l();
                    exc0.i(zzgdVar);
                    exc0.f(zzgdVar.zzx());
                    exc0.l(zzgdVar.zzbe());
                    ayz0Var.R();
                    currentTimeMillis = ((jcl) ((mb01) ayz0Var.b).f()).currentTimeMillis();
                    zzk = zzgdVar.zzk();
                    ((mb01) ayz0Var.b).getClass();
                    r701Var = s701.D;
                    if (zzk >= currentTimeMillis - ((Long) r701Var.a(null)).longValue()) {
                    }
                    ((mb01) ayz0Var.b).e().q().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", k901.r(zzgdVar.zzx()), Long.valueOf(currentTimeMillis), Long.valueOf(zzgdVar.zzk()));
                    byte[] zzbu2 = zzgdVar.zzbu();
                }
                ayz0 ayz0Var13 = this.d;
                I(ayz0Var13);
                ArrayList arrayList4 = oj01Var2.b;
                exc0.i(arrayList4);
                ayz0Var13.k();
                ayz0Var13.l();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                    if (i25 != 0) {
                        sb.append(StringUtils.COMMA);
                    }
                    sb.append(((Long) arrayList4.get(i25)).longValue());
                }
                sb.append(")");
                int delete = ayz0Var13.C().delete("raw_events", sb.toString(), null);
                if (delete != arrayList4.size()) {
                    ((mb01) ayz0Var13.b).e().o().c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(arrayList4.size()));
                }
                ayz0 ayz0Var14 = this.d;
                I(ayz0Var14);
                try {
                    ayz0Var14.C().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{zzx3, zzx3});
                } catch (SQLiteException e4) {
                    ((mb01) ayz0Var14.b).e().o().c("Failed to remove unused event metadata. appId", k901.r(zzx3), e4);
                }
                ayz0 ayz0Var15 = this.d;
                I(ayz0Var15);
                ayz0Var15.p();
                ayz0 ayz0Var16 = this.d;
                I(ayz0Var16);
                ayz0Var16.P();
                return true;
            }
            ayz0 ayz0Var17 = this.d;
            I(ayz0Var17);
            ayz0Var17.p();
            ayz0 ayz0Var18 = this.d;
            I(ayz0Var18);
            ayz0Var18.P();
            return false;
        } catch (Throwable th) {
            ayz0 ayz0Var19 = this.d;
            I(ayz0Var19);
            ayz0Var19.P();
            throw th;
        }
    }

    public final boolean F() {
        d().k();
        b();
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        if (ayz0Var.x("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        ayz0 ayz0Var2 = this.d;
        I(ayz0Var2);
        return !TextUtils.isEmpty(ayz0Var2.J());
    }

    public final boolean G(zzfs zzfsVar, zzfs zzfsVar2) {
        exc0.b("_e".equals(zzfsVar.zzo()));
        sj01 sj01Var = this.h;
        I(sj01Var);
        zzfx o = sj01.o((zzft) zzfsVar.zzaC(), "_sc");
        String zzh = o == null ? null : o.zzh();
        I(sj01Var);
        zzfx o2 = sj01.o((zzft) zzfsVar2.zzaC(), "_pc");
        String zzh2 = o2 != null ? o2.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        exc0.b("_e".equals(zzfsVar.zzo()));
        I(sj01Var);
        zzfx o3 = sj01.o((zzft) zzfsVar.zzaC(), "_et");
        if (o3 == null || !o3.zzw() || o3.zzd() <= 0) {
            return true;
        }
        long zzd = o3.zzd();
        I(sj01Var);
        zzfx o4 = sj01.o((zzft) zzfsVar2.zzaC(), "_et");
        if (o4 != null && o4.zzd() > 0) {
            zzd += o4.zzd();
        }
        I(sj01Var);
        sj01.P(zzfsVar2, "_et", Long.valueOf(zzd));
        I(sj01Var);
        sj01.P(zzfsVar, "_fr", 1L);
        return true;
    }

    public final qd01 J(com.google.android.gms.measurement.internal.zzq zzqVar) {
        d().k();
        b();
        exc0.i(zzqVar);
        String str = zzqVar.h;
        String str2 = zzqVar.d;
        String str3 = zzqVar.l;
        boolean z = zzqVar.p;
        String str4 = zzqVar.b;
        exc0.f(str4);
        String str5 = zzqVar.x;
        if (!str5.isEmpty()) {
            this.C.put(str4, new pj01(this, str5));
        }
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        qd01 D = ayz0Var.D(str4);
        xwz0 c = L(str4).c(xwz0.b(zzqVar.w));
        zzah zzahVar = zzah.AD_STORAGE;
        String p = c.f(zzahVar) ? this.j.p(str4, z) : "";
        if (D == null) {
            D = new qd01(this.m, str4);
            if (c.f(zzah.ANALYTICS_STORAGE)) {
                D.c(R(c));
            }
            if (c.f(zzahVar)) {
                D.y(p);
            }
        } else {
            if (c.f(zzahVar) && p != null) {
                kb01 kb01Var = D.a.k;
                mb01.k(kb01Var);
                kb01Var.k();
                if (!p.equals(D.e)) {
                    D.y(p);
                    if (z) {
                        ai01 ai01Var = this.j;
                        ai01Var.getClass();
                        if (!DeviceIdUtils.NULL_UUID.equals((c.f(zzahVar) ? ai01Var.o(str4) : new Pair("", Boolean.FALSE)).first)) {
                            D.c(R(c));
                            ayz0 ayz0Var2 = this.d;
                            I(ayz0Var2);
                            if (ayz0Var2.H(str4, "_id") != null) {
                                ayz0 ayz0Var3 = this.d;
                                I(ayz0Var3);
                                if (ayz0Var3.H(str4, "_lair") == null) {
                                    ((jcl) f()).getClass();
                                    uj01 uj01Var = new uj01(zzqVar.b, "auto", "_lair", System.currentTimeMillis(), 1L);
                                    ayz0 ayz0Var4 = this.d;
                                    I(ayz0Var4);
                                    ayz0Var4.u(uj01Var);
                                }
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(D.G()) && c.f(zzah.ANALYTICS_STORAGE)) {
                D.c(R(c));
            }
        }
        mb01 mb01Var = D.a;
        D.r(zzqVar.c);
        D.b(zzqVar.r);
        if (!TextUtils.isEmpty(str3)) {
            D.q(str3);
        }
        long j = zzqVar.f;
        if (j != 0) {
            D.s(j);
        }
        if (!TextUtils.isEmpty(str2)) {
            D.e(str2);
        }
        D.f(zzqVar.k);
        String str6 = zzqVar.e;
        if (str6 != null) {
            D.d(str6);
        }
        D.n(zzqVar.g);
        D.x(zzqVar.i);
        if (!TextUtils.isEmpty(str)) {
            D.t(str);
        }
        kb01 kb01Var2 = mb01Var.k;
        mb01.k(kb01Var2);
        kb01Var2.k();
        D.C |= D.p != z;
        D.p = z;
        Boolean bool = zzqVar.s;
        kb01 kb01Var3 = mb01Var.k;
        mb01.k(kb01Var3);
        kb01Var3.k();
        D.C |= !c4g0.G(D.r, bool);
        D.r = bool;
        D.o(zzqVar.t);
        zzpd.zzc();
        if (K().t(null, s701.h0) && K().t(str4, s701.j0)) {
            String str7 = zzqVar.y;
            kb01 kb01Var4 = mb01Var.k;
            mb01.k(kb01Var4);
            kb01Var4.k();
            D.C |= true ^ c4g0.G(D.u, str7);
            D.u = str7;
        }
        zznt.zzc();
        if (K().t(null, s701.g0)) {
            D.z(zzqVar.u);
        } else {
            zznt.zzc();
            if (K().t(null, s701.f0)) {
                D.z(null);
            }
        }
        kb01 kb01Var5 = mb01Var.k;
        mb01.k(kb01Var5);
        kb01Var5.k();
        if (D.C) {
            ayz0 ayz0Var5 = this.d;
            I(ayz0Var5);
            ayz0Var5.q(D);
        }
        return D;
    }

    public final kwz0 K() {
        mb01 mb01Var = this.m;
        exc0.i(mb01Var);
        return mb01Var.h;
    }

    public final xwz0 L(String str) {
        String str2;
        xwz0 xwz0Var = xwz0.b;
        d().k();
        b();
        xwz0 xwz0Var2 = (xwz0) this.B.get(str);
        if (xwz0Var2 != null) {
            return xwz0Var2;
        }
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        exc0.i(str);
        ayz0Var.k();
        ayz0Var.l();
        Cursor cursor = null;
        try {
            try {
                cursor = ayz0Var.C().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                    cursor.close();
                } else {
                    cursor.close();
                    str2 = "G1";
                }
                xwz0 b = xwz0.b(str2);
                s(str, b);
                return b;
            } catch (SQLiteException e) {
                k901 k901Var = ((mb01) ayz0Var.b).j;
                mb01.k(k901Var);
                k901Var.i.c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final ayz0 M() {
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        return ayz0Var;
    }

    public final r901 N() {
        r901 r901Var = this.e;
        if (r901Var != null) {
            return r901Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final sj01 P() {
        sj01 sj01Var = this.h;
        I(sj01Var);
        return sj01Var;
    }

    public final sk01 Q() {
        mb01 mb01Var = this.m;
        exc0.i(mb01Var);
        sk01 sk01Var = mb01Var.m;
        mb01.i(sk01Var);
        return sk01Var;
    }

    public final String R(xwz0 xwz0Var) {
        if (!xwz0Var.f(zzah.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        Q().s().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @VisibleForTesting
    public final void a() {
        d().k();
        b();
        if (this.o) {
            return;
        }
        this.o = true;
        d().k();
        FileLock fileLock = this.w;
        mb01 mb01Var = this.m;
        if (fileLock == null || !fileLock.isValid()) {
            ((mb01) this.d.b).getClass();
            try {
                FileChannel channel = new RandomAccessFile(new File(mb01Var.b.getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.x = channel;
                FileLock tryLock = channel.tryLock();
                this.w = tryLock;
                if (tryLock == null) {
                    e().i.a("Storage concurrent data access panic");
                    return;
                }
                e().q.a("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                e().i.b(e, "Failed to acquire storage lock");
                return;
            } catch (IOException e2) {
                e().i.b(e2, "Failed to access storage lock file");
                return;
            } catch (OverlappingFileLockException e3) {
                e().l.b(e3, "Storage lock already acquired");
                return;
            }
        } else {
            e().q.a("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.x;
        d().k();
        int i = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            e().i.a("Bad channel to read from");
        } else {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int read = fileChannel.read(allocate);
                if (read == 4) {
                    allocate.flip();
                    i = allocate.getInt();
                } else if (read != -1) {
                    e().l.b(Integer.valueOf(read), "Unexpected data length. Bytes read");
                }
            } catch (IOException e4) {
                e().i.b(e4, "Failed to read from channel");
            }
        }
        w701 o = mb01Var.o();
        o.l();
        int i2 = o.h;
        d().k();
        if (i > i2) {
            e().i.c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
            return;
        }
        if (i < i2) {
            FileChannel fileChannel2 = this.x;
            d().k();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                e().i.a("Bad channel to read from");
            } else {
                ByteBuffer allocate2 = ByteBuffer.allocate(4);
                allocate2.putInt(i2);
                allocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(allocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        e().i.b(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                    }
                    e().q.c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
                    return;
                } catch (IOException e5) {
                    e().i.b(e5, "Failed to write to channel");
                }
            }
            e().i.c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void b() {
        if (!this.n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @Override // xsna.ed01
    public final Context c() {
        return this.m.b;
    }

    @Override // xsna.ed01
    public final kb01 d() {
        mb01 mb01Var = this.m;
        exc0.i(mb01Var);
        kb01 kb01Var = mb01Var.k;
        mb01.k(kb01Var);
        return kb01Var;
    }

    @Override // xsna.ed01
    public final k901 e() {
        mb01 mb01Var = this.m;
        exc0.i(mb01Var);
        k901 k901Var = mb01Var.j;
        mb01.k(k901Var);
        return k901Var;
    }

    @Override // xsna.ed01
    public final avf f() {
        mb01 mb01Var = this.m;
        exc0.i(mb01Var);
        return mb01Var.o;
    }

    @Override // xsna.ed01
    public final fai g() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x012a, code lost:
    
        if (r6 < android.os.SystemClock.elapsedRealtime()) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(zzgc zzgcVar, String str) {
        int x;
        int indexOf;
        fb01 fb01Var = this.b;
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        zk3 zk3Var = fb01Var.h;
        Set set = (Set) zk3Var.get(str);
        if (set != null) {
            zzgcVar.zzi(set);
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) != 0 && (((Set) zk3Var.get(str)).contains(AnalyticsBaseParamsConstantsKt.DEVICE_MODEL) || ((Set) zk3Var.get(str)).contains("device_info"))) {
            zzgcVar.zzp();
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) != 0 && (((Set) zk3Var.get(str)).contains("os_version") || ((Set) zk3Var.get(str)).contains("device_info"))) {
            if (K().t(str, s701.m0)) {
                String zzar = zzgcVar.zzar();
                if (!TextUtils.isEmpty(zzar) && (indexOf = zzar.indexOf(".")) != -1) {
                    zzgcVar.zzY(zzar.substring(0, indexOf));
                }
            } else {
                zzgcVar.zzu();
            }
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) != 0 && ((Set) zk3Var.get(str)).contains("user_id") && (x = sj01.x(zzgcVar, "_id")) != -1) {
            zzgcVar.zzB(x);
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) != 0 && ((Set) zk3Var.get(str)).contains("google_signals")) {
            zzgcVar.zzq();
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) != 0 && ((Set) zk3Var.get(str)).contains("app_instance_id")) {
            zzgcVar.zzn();
            HashMap hashMap = this.C;
            pj01 pj01Var = (pj01) hashMap.get(str);
            if (pj01Var != null) {
                long q = K().q(str, s701.S) + pj01Var.b;
                ((jcl) f()).getClass();
            }
            byte[] bArr = new byte[16];
            Q().s().nextBytes(bArr);
            pj01Var = new pj01(this, String.format(Locale.US, "%032x", new BigInteger(1, bArr)));
            hashMap.put(str, pj01Var);
            zzgcVar.zzR(pj01Var.a);
        }
        I(fb01Var);
        fb01Var.k();
        fb01Var.q(str);
        if (zk3Var.get(str) == 0 || !((Set) zk3Var.get(str)).contains("enhanced_user_id")) {
            return;
        }
        zzgcVar.zzy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(qd01 qd01Var) {
        zk3 zk3Var;
        zk3 zk3Var2;
        fb01 fb01Var = this.b;
        d().k();
        if (TextUtils.isEmpty(qd01Var.J()) && TextUtils.isEmpty(qd01Var.D())) {
            String F = qd01Var.F();
            exc0.i(F);
            m(F, 204, null, null, null);
            return;
        }
        Uri.Builder builder = new Uri.Builder();
        String J = qd01Var.J();
        if (TextUtils.isEmpty(J)) {
            J = qd01Var.D();
        }
        zk3 zk3Var3 = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) s701.f.a(null)).encodedAuthority((String) s701.g.a(null)).path("config/app/".concat(String.valueOf(J))).appendQueryParameter("platform", "android");
        ((mb01) this.k.b).h.p();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(74029L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String F2 = qd01Var.F();
            exc0.i(F2);
            URL url = new URL(uri);
            e().q.b(F2, "Fetching remote configuration");
            I(fb01Var);
            zzff u = fb01Var.u(F2);
            I(fb01Var);
            fb01Var.k();
            String str = (String) fb01Var.p.get(F2);
            if (u != null) {
                if (TextUtils.isEmpty(str)) {
                    zk3Var2 = null;
                } else {
                    zk3Var2 = new zk3();
                    zk3Var2.put("If-Modified-Since", str);
                }
                zzox.zzc();
                if (K().t(null, s701.k0)) {
                    I(fb01Var);
                    fb01Var.k();
                    String str2 = (String) fb01Var.q.get(F2);
                    if (!TextUtils.isEmpty(str2)) {
                        if (zk3Var2 == null) {
                            zk3Var2 = new zk3();
                        }
                        zk3Var3 = zk3Var2;
                        zk3Var3.put("If-None-Match", str2);
                    }
                }
                zk3Var = zk3Var2;
                this.t = true;
                p901 p901Var = this.c;
                I(p901Var);
                lec lecVar = new lec(this);
                p901Var.k();
                p901Var.l();
                kb01 kb01Var = ((mb01) p901Var.b).k;
                mb01.k(kb01Var);
                kb01Var.r(new o901(p901Var, F2, url, null, zk3Var, lecVar));
            }
            zk3Var = zk3Var3;
            this.t = true;
            p901 p901Var2 = this.c;
            I(p901Var2);
            lec lecVar2 = new lec(this);
            p901Var2.k();
            p901Var2.l();
            kb01 kb01Var2 = ((mb01) p901Var2.b).k;
            mb01.k(kb01Var2);
            kb01Var2.r(new o901(p901Var2, F2, url, null, zk3Var, lecVar2));
        } catch (MalformedURLException unused) {
            e().i.c("Failed to parse config URL. Not fetching. appId", k901.r(qd01Var.F()), uri);
        }
    }

    public final void j(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        zzaw zzawVar2;
        List L;
        mb01 mb01Var;
        List<zzac> L2;
        List<zzac> L3;
        String str;
        exc0.i(zzqVar);
        String str2 = zzqVar.b;
        exc0.f(str2);
        d().k();
        b();
        long j = zzawVar.e;
        l901 b = l901.b(zzawVar);
        d().k();
        dg01 dg01Var = null;
        if (this.D != null && (str = this.E) != null && str.equals(str2)) {
            dg01Var = this.D;
        }
        sk01.w(dg01Var, b.d, false);
        zzaw a = b.a();
        String str3 = a.b;
        I(this.h);
        if (TextUtils.isEmpty(zzqVar.c) && TextUtils.isEmpty(zzqVar.r)) {
            return;
        }
        if (!zzqVar.i) {
            J(zzqVar);
            return;
        }
        List list = zzqVar.u;
        if (list == null) {
            zzawVar2 = a;
        } else if (!list.contains(str3)) {
            e().p.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, a.d);
            return;
        } else {
            Bundle i = a.c.i();
            i.putLong("ga_safelisted", 1L);
            zzawVar2 = new zzaw(a.b, new zzau(i), a.d, a.e);
        }
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        ayz0Var.O();
        try {
            ayz0 ayz0Var2 = this.d;
            I(ayz0Var2);
            exc0.f(str2);
            ayz0Var2.k();
            ayz0Var2.l();
            if (j < 0) {
                k901 k901Var = ((mb01) ayz0Var2.b).j;
                mb01.k(k901Var);
                k901Var.l.c("Invalid time querying timed out conditional properties", k901.r(str2), Long.valueOf(j));
                L = Collections.EMPTY_LIST;
            } else {
                L = ayz0Var2.L("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = L.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                mb01Var = this.m;
                if (!hasNext) {
                    break;
                }
                zzac zzacVar = (zzac) it.next();
                if (zzacVar != null) {
                    e().q.d("User property timed out", zzacVar.b, mb01Var.n.f(zzacVar.d.c), zzacVar.d.zza());
                    zzaw zzawVar3 = zzacVar.h;
                    if (zzawVar3 != null) {
                        v(new zzaw(zzawVar3, j), zzqVar);
                    }
                    ayz0 ayz0Var3 = this.d;
                    I(ayz0Var3);
                    ayz0Var3.y(str2, zzacVar.d.c);
                }
            }
            ayz0 ayz0Var4 = this.d;
            I(ayz0Var4);
            exc0.f(str2);
            ayz0Var4.k();
            ayz0Var4.l();
            if (j < 0) {
                k901 k901Var2 = ((mb01) ayz0Var4.b).j;
                mb01.k(k901Var2);
                k901Var2.l.c("Invalid time querying expired conditional properties", k901.r(str2), Long.valueOf(j));
                L2 = Collections.EMPTY_LIST;
            } else {
                L2 = ayz0Var4.L("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(L2.size());
            for (zzac zzacVar2 : L2) {
                if (zzacVar2 != null) {
                    e().q.d("User property expired", zzacVar2.b, mb01Var.n.f(zzacVar2.d.c), zzacVar2.d.zza());
                    ayz0 ayz0Var5 = this.d;
                    I(ayz0Var5);
                    ayz0Var5.o(str2, zzacVar2.d.c);
                    zzaw zzawVar4 = zzacVar2.l;
                    if (zzawVar4 != null) {
                        arrayList.add(zzawVar4);
                    }
                    ayz0 ayz0Var6 = this.d;
                    I(ayz0Var6);
                    ayz0Var6.y(str2, zzacVar2.d.c);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                v(new zzaw((zzaw) it2.next(), j), zzqVar);
            }
            ayz0 ayz0Var7 = this.d;
            I(ayz0Var7);
            mb01 mb01Var2 = (mb01) ayz0Var7.b;
            String str4 = zzawVar2.b;
            exc0.f(str2);
            exc0.f(str4);
            ayz0Var7.k();
            ayz0Var7.l();
            if (j < 0) {
                k901 k901Var3 = mb01Var2.j;
                mb01.k(k901Var3);
                k901Var3.l.d("Invalid time querying triggered conditional properties", k901.r(str2), mb01Var2.n.d(str4), Long.valueOf(j));
                L3 = Collections.EMPTY_LIST;
            } else {
                L3 = ayz0Var7.L("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(L3.size());
            for (zzac zzacVar3 : L3) {
                if (zzacVar3 != null) {
                    zzkw zzkwVar = zzacVar3.d;
                    String str5 = zzacVar3.b;
                    exc0.i(str5);
                    String str6 = zzacVar3.c;
                    String str7 = zzkwVar.c;
                    Object zza = zzkwVar.zza();
                    exc0.i(zza);
                    uj01 uj01Var = new uj01(str5, str6, str7, j, zza);
                    Object obj = uj01Var.e;
                    String str8 = uj01Var.c;
                    ayz0 ayz0Var8 = this.d;
                    I(ayz0Var8);
                    if (ayz0Var8.u(uj01Var)) {
                        e().q.d("User property triggered", zzacVar3.b, mb01Var.n.f(str8), obj);
                    } else {
                        e().i.d("Too many active user properties, ignoring", k901.r(zzacVar3.b), mb01Var.n.f(str8), obj);
                    }
                    zzaw zzawVar5 = zzacVar3.j;
                    if (zzawVar5 != null) {
                        arrayList2.add(zzawVar5);
                    }
                    zzacVar3.d = new zzkw(uj01Var);
                    zzacVar3.f = true;
                    ayz0 ayz0Var9 = this.d;
                    I(ayz0Var9);
                    ayz0Var9.t(zzacVar3);
                }
            }
            v(zzawVar2, zzqVar);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                v(new zzaw((zzaw) it3.next(), j), zzqVar);
            }
            ayz0 ayz0Var10 = this.d;
            I(ayz0Var10);
            ayz0Var10.p();
            ayz0 ayz0Var11 = this.d;
            I(ayz0Var11);
            ayz0Var11.P();
        } catch (Throwable th) {
            ayz0 ayz0Var12 = this.d;
            I(ayz0Var12);
            ayz0Var12.P();
            throw th;
        }
    }

    public final void k(zzaw zzawVar, String str) {
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        qd01 D = ayz0Var.D(str);
        if (D != null) {
            mb01 mb01Var = D.a;
            if (!TextUtils.isEmpty(D.H())) {
                Boolean A = A(D);
                if (A == null) {
                    if (!"_ui".equals(zzawVar.b)) {
                        e().l.b(k901.r(str), "Could not find package. appId");
                    }
                } else if (!A.booleanValue()) {
                    e().i.b(k901.r(str), "App version does not match; dropping event. appId");
                    return;
                }
                String J = D.J();
                String H = D.H();
                long B = D.B();
                kb01 kb01Var = mb01Var.k;
                mb01.k(kb01Var);
                kb01Var.k();
                String str2 = D.l;
                kb01 kb01Var2 = mb01Var.k;
                mb01.k(kb01Var2);
                kb01Var2.k();
                long j = D.m;
                kb01 kb01Var3 = mb01Var.k;
                mb01.k(kb01Var3);
                kb01Var3.k();
                long j2 = D.n;
                kb01 kb01Var4 = mb01Var.k;
                mb01.k(kb01Var4);
                kb01Var4.k();
                boolean z = D.o;
                String I = D.I();
                kb01 kb01Var5 = mb01Var.k;
                mb01.k(kb01Var5);
                kb01Var5.k();
                boolean A2 = D.A();
                String D2 = D.D();
                kb01 kb01Var6 = mb01Var.k;
                mb01.k(kb01Var6);
                kb01Var6.k();
                Boolean bool = D.r;
                long C = D.C();
                kb01 kb01Var7 = mb01Var.k;
                mb01.k(kb01Var7);
                kb01Var7.k();
                l(zzawVar, new com.google.android.gms.measurement.internal.zzq(str, J, H, B, str2, j, j2, null, z, false, I, 0L, 0, A2, false, D2, bool, C, D.t, L(str).e(), "", null));
                return;
            }
        }
        e().p.b(str, "No app data available; dropping event");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d4: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:213), block:B:62:0x00d4 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        zzaw a;
        zzau zzauVar;
        String string;
        exc0.f(zzqVar.b);
        l901 b = l901.b(zzawVar);
        sk01 Q = Q();
        Bundle bundle = b.d;
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        String str = zzqVar.b;
        mb01 mb01Var = (mb01) ayz0Var.b;
        ayz0Var.k();
        ayz0Var.l();
        Cursor cursor3 = null;
        r5 = null;
        Bundle bundle2 = null;
        try {
            try {
                cursor = ayz0Var.C().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                } catch (SQLiteException e) {
                    e = e;
                    k901 k901Var = mb01Var.j;
                    mb01.k(k901Var);
                    k901Var.i.b(e, "Error selecting default event parameters");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            try {
                zzft zzftVar = (zzft) ((zzfs) sj01.D(zzft.zze(), cursor.getBlob(0))).zzaC();
                ayz0Var.e.P();
                List<zzfx> zzi = zzftVar.zzi();
                Bundle bundle3 = new Bundle();
                for (zzfx zzfxVar : zzi) {
                    String zzg = zzfxVar.zzg();
                    if (zzfxVar.zzu()) {
                        bundle3.putDouble(zzg, zzfxVar.zza());
                    } else if (zzfxVar.zzv()) {
                        bundle3.putFloat(zzg, zzfxVar.zzb());
                    } else if (zzfxVar.zzy()) {
                        bundle3.putString(zzg, zzfxVar.zzh());
                    } else if (zzfxVar.zzw()) {
                        bundle3.putLong(zzg, zzfxVar.zzd());
                    }
                }
                cursor.close();
                bundle2 = bundle3;
            } catch (IOException e3) {
                k901 k901Var2 = mb01Var.j;
                mb01.k(k901Var2);
                k901Var2.i.c("Failed to retrieve default event parameters. appId", k901.r(str), e3);
            }
            Q.x(bundle, bundle2);
            sk01 Q2 = Q();
            kwz0 K = K();
            K.getClass();
            Q2.y(b, Math.max(Math.min(K.o(str, s701.I), 100), 25));
            a = b.a();
            zzauVar = a.c;
            if ("_cmp".equals(a.b) && "referrer API v2".equals(zzauVar.b.getString("_cis"))) {
                string = zzauVar.b.getString("gclid");
                if (!TextUtils.isEmpty(string)) {
                    t(new zzkw(a.e, string, "_lgclid", "auto"), zzqVar);
                }
            }
            j(a, zzqVar);
        }
        k901 k901Var3 = mb01Var.j;
        mb01.k(k901Var3);
        k901Var3.q.a("Default event parameters not found");
        cursor.close();
        Q.x(bundle, bundle2);
        sk01 Q22 = Q();
        kwz0 K2 = K();
        K2.getClass();
        Q22.y(b, Math.max(Math.min(K2.o(str, s701.I), 100), 25));
        a = b.a();
        zzauVar = a.c;
        if ("_cmp".equals(a.b)) {
            string = zzauVar.b.getString("gclid");
            if (!TextUtils.isEmpty(string)) {
            }
        }
        j(a, zzqVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0180, B:23:0x006a, B:27:0x00cc, B:28:0x00b8, B:30:0x00d3, B:32:0x00df, B:34:0x00e5, B:35:0x00ed, B:38:0x00fe, B:40:0x010a, B:42:0x0110, B:46:0x011d, B:47:0x0133, B:49:0x014d, B:50:0x0168, B:52:0x0173, B:54:0x0179, B:55:0x017d, B:56:0x0159, B:57:0x0124, B:59:0x012d), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014d A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0180, B:23:0x006a, B:27:0x00cc, B:28:0x00b8, B:30:0x00d3, B:32:0x00df, B:34:0x00e5, B:35:0x00ed, B:38:0x00fe, B:40:0x010a, B:42:0x0110, B:46:0x011d, B:47:0x0133, B:49:0x014d, B:50:0x0168, B:52:0x0173, B:54:0x0179, B:55:0x017d, B:56:0x0159, B:57:0x0124, B:59:0x012d), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0180, B:23:0x006a, B:27:0x00cc, B:28:0x00b8, B:30:0x00d3, B:32:0x00df, B:34:0x00e5, B:35:0x00ed, B:38:0x00fe, B:40:0x010a, B:42:0x0110, B:46:0x011d, B:47:0x0133, B:49:0x014d, B:50:0x0168, B:52:0x0173, B:54:0x0179, B:55:0x017d, B:56:0x0159, B:57:0x0124, B:59:0x012d), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0180, B:23:0x006a, B:27:0x00cc, B:28:0x00b8, B:30:0x00d3, B:32:0x00df, B:34:0x00e5, B:35:0x00ed, B:38:0x00fe, B:40:0x010a, B:42:0x0110, B:46:0x011d, B:47:0x0133, B:49:0x014d, B:50:0x0168, B:52:0x0173, B:54:0x0179, B:55:0x017d, B:56:0x0159, B:57:0x0124, B:59:0x012d), top: B:4:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:5:0x002e, B:13:0x004c, B:14:0x0180, B:23:0x006a, B:27:0x00cc, B:28:0x00b8, B:30:0x00d3, B:32:0x00df, B:34:0x00e5, B:35:0x00ed, B:38:0x00fe, B:40:0x010a, B:42:0x0110, B:46:0x011d, B:47:0x0133, B:49:0x014d, B:50:0x0168, B:52:0x0173, B:54:0x0179, B:55:0x017d, B:56:0x0159, B:57:0x0124, B:59:0x012d), top: B:4:0x002e, outer: #0 }] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        String str2;
        p901 p901Var;
        d().k();
        b();
        exc0.f(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.t = false;
                B();
                throw th2;
            }
        }
        i901 i901Var = e().q;
        Integer valueOf = Integer.valueOf(bArr.length);
        i901Var.b(valueOf, "onConfigFetched. Response size");
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        ayz0Var.O();
        try {
            ayz0 ayz0Var2 = this.d;
            I(ayz0Var2);
            qd01 D = ayz0Var2.D(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (D == null) {
                    e().l.b(k901.r(str), "App does not exist in onConfigFetched. appId");
                } else {
                    fb01 fb01Var = this.b;
                    if (z || i == 404) {
                        List list = map != null ? (List) map.get("Last-Modified") : null;
                        String str3 = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                        zzox.zzc();
                        if (K().t(null, s701.k0)) {
                            List list2 = map != null ? (List) map.get(Command.HTTP_HEADER_ETAG) : null;
                            if (list2 != null && !list2.isEmpty()) {
                                str2 = (String) list2.get(0);
                                if (i != 404 && i != 304) {
                                    I(fb01Var);
                                    fb01Var.z(str, str3, str2, bArr);
                                    ((jcl) f()).getClass();
                                    D.g(System.currentTimeMillis());
                                    ayz0 ayz0Var3 = this.d;
                                    I(ayz0Var3);
                                    ayz0Var3.q(D);
                                    if (i != 404) {
                                        e().n.b(str, "Config not found. Using empty config. appId");
                                    } else {
                                        e().q.c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                                    }
                                    p901Var = this.c;
                                    I(p901Var);
                                    if (p901Var.o() || !F()) {
                                        D();
                                    } else {
                                        u();
                                    }
                                }
                                I(fb01Var);
                                if (fb01Var.u(str) == null) {
                                    I(fb01Var);
                                    fb01Var.z(str, null, null, null);
                                }
                                ((jcl) f()).getClass();
                                D.g(System.currentTimeMillis());
                                ayz0 ayz0Var32 = this.d;
                                I(ayz0Var32);
                                ayz0Var32.q(D);
                                if (i != 404) {
                                }
                                p901Var = this.c;
                                I(p901Var);
                                if (p901Var.o()) {
                                }
                                D();
                            }
                        }
                        str2 = null;
                        if (i != 404) {
                            I(fb01Var);
                            fb01Var.z(str, str3, str2, bArr);
                            ((jcl) f()).getClass();
                            D.g(System.currentTimeMillis());
                            ayz0 ayz0Var322 = this.d;
                            I(ayz0Var322);
                            ayz0Var322.q(D);
                            if (i != 404) {
                            }
                            p901Var = this.c;
                            I(p901Var);
                            if (p901Var.o()) {
                            }
                            D();
                        }
                        I(fb01Var);
                        if (fb01Var.u(str) == null) {
                        }
                        ((jcl) f()).getClass();
                        D.g(System.currentTimeMillis());
                        ayz0 ayz0Var3222 = this.d;
                        I(ayz0Var3222);
                        ayz0Var3222.q(D);
                        if (i != 404) {
                        }
                        p901Var = this.c;
                        I(p901Var);
                        if (p901Var.o()) {
                        }
                        D();
                    } else {
                        ((jcl) f()).getClass();
                        D.p(System.currentTimeMillis());
                        ayz0 ayz0Var4 = this.d;
                        I(ayz0Var4);
                        ayz0Var4.q(D);
                        e().q.c("Fetching config failed. code, error", Integer.valueOf(i), th);
                        I(fb01Var);
                        fb01Var.k();
                        fb01Var.p.put(str, null);
                        u901 u901Var = this.j.k;
                        ((jcl) f()).getClass();
                        u901Var.b(System.currentTimeMillis());
                        if (i == 503 || i == 429) {
                            u901 u901Var2 = this.j.i;
                            ((jcl) f()).getClass();
                            u901Var2.b(System.currentTimeMillis());
                        }
                        D();
                    }
                }
                ayz0 ayz0Var5 = this.d;
                I(ayz0Var5);
                ayz0Var5.p();
                this.t = false;
                B();
            }
            if (th == null) {
                z = true;
                if (D == null) {
                }
                ayz0 ayz0Var52 = this.d;
                I(ayz0Var52);
                ayz0Var52.p();
                this.t = false;
                B();
            }
            z = false;
            if (D == null) {
            }
            ayz0 ayz0Var522 = this.d;
            I(ayz0Var522);
            ayz0Var522.p();
            this.t = false;
            B();
        } finally {
            ayz0 ayz0Var6 = this.d;
            I(ayz0Var6);
            ayz0Var6.P();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:107|108|(2:110|(8:112|(3:114|(2:116|(1:118))(1:138)|137)(1:139)|119|(1:121)(1:136)|122|123|124|(4:126|(1:128)(1:132)|129|(1:131))))|140|123|124|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04a2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04a3, code lost:
    
        e().i.c("Application info is null, first open report might be inaccurate. appId", xsna.k901.r(r10), r0);
        r15 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04b5 A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0538 A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029b A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120 A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022e A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0266 A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028e A[Catch: all -> 0x00cc, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a9 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #6 {all -> 0x00cc, blocks: (B:24:0x00b1, B:26:0x00bf, B:29:0x00d1, B:31:0x00d5, B:34:0x00e5, B:36:0x00f2, B:38:0x00fc, B:41:0x0102, B:42:0x0112, B:44:0x0120, B:46:0x0135, B:48:0x015e, B:51:0x0168, B:54:0x01d1, B:57:0x01d6, B:59:0x01dc, B:61:0x01eb, B:65:0x022e, B:67:0x0239, B:70:0x024a, B:73:0x0258, B:76:0x0263, B:78:0x0266, B:82:0x0289, B:84:0x028e, B:86:0x02a9, B:89:0x02bb, B:91:0x02df, B:92:0x03d1, B:94:0x03fd, B:95:0x0400, B:97:0x0418, B:101:0x04d4, B:102:0x04d7, B:103:0x0558, B:108:0x042b, B:110:0x0448, B:112:0x0450, B:114:0x0456, B:118:0x0469, B:119:0x047c, B:122:0x0488, B:124:0x0498, B:126:0x04b5, B:128:0x04bd, B:129:0x04c5, B:131:0x04cb, B:135:0x04a3, B:138:0x0474, B:143:0x0436, B:144:0x02ef, B:146:0x02ff, B:147:0x030f, B:149:0x0339, B:150:0x0349, B:152:0x0350, B:154:0x0356, B:156:0x0360, B:158:0x0366, B:160:0x036c, B:162:0x0372, B:164:0x0377, B:169:0x039c, B:173:0x03a1, B:174:0x03b4, B:175:0x03c3, B:176:0x04ef, B:178:0x051d, B:179:0x0520, B:180:0x0538, B:182:0x053c, B:183:0x029b, B:187:0x020d), top: B:23:0x00b1, inners: #1, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(com.google.android.gms.measurement.internal.zzq zzqVar) {
        long j;
        qd01 D;
        boolean z;
        String str;
        Context context;
        int i;
        kzz0 G2;
        boolean z2;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        long j2;
        boolean z3;
        long j3;
        boolean z4;
        String H;
        SQLiteDatabase C;
        String[] strArr;
        d().k();
        b();
        exc0.i(zzqVar);
        boolean z5 = zzqVar.q;
        String str2 = zzqVar.c;
        String str3 = zzqVar.b;
        exc0.f(str3);
        if (H(zzqVar)) {
            ayz0 ayz0Var = this.d;
            I(ayz0Var);
            qd01 D2 = ayz0Var.D(str3);
            if (D2 != null && TextUtils.isEmpty(D2.J()) && !TextUtils.isEmpty(str2)) {
                D2.g(0L);
                ayz0 ayz0Var2 = this.d;
                I(ayz0Var2);
                ayz0Var2.q(D2);
                fb01 fb01Var = this.b;
                I(fb01Var);
                fb01Var.k();
                fb01Var.k.remove(str3);
            }
            if (!zzqVar.i) {
                J(zzqVar);
                return;
            }
            long j4 = zzqVar.n;
            if (j4 == 0) {
                ((jcl) f()).getClass();
                j4 = System.currentTimeMillis();
            }
            long j5 = j4;
            mb01 mb01Var = this.m;
            vyz0 n = mb01Var.n();
            Context context2 = mb01Var.b;
            n.k();
            n.i = null;
            n.j = 0L;
            int i2 = zzqVar.o;
            if (i2 != 0 && i2 != 1) {
                e().l.c("Incorrect app type, assuming installed app. appId, appType", k901.r(str3), Integer.valueOf(i2));
                i2 = 0;
            }
            ayz0 ayz0Var3 = this.d;
            I(ayz0Var3);
            ayz0Var3.O();
            try {
                ayz0 ayz0Var4 = this.d;
                I(ayz0Var4);
                uj01 H2 = ayz0Var4.H(str3, "_npa");
                int i3 = i2;
                if (H2 != null) {
                    j = 1;
                    if ("auto".equals(H2.b)) {
                    }
                    ayz0 ayz0Var5 = this.d;
                    I(ayz0Var5);
                    exc0.i(str3);
                    D = ayz0Var5.D(str3);
                    if (D == null) {
                        Q();
                        z = z5;
                        if (sk01.W(str2, D.J(), zzqVar.r, D.D())) {
                            e().l.b(k901.r(D.F()), "New GMP App Id passed in. Removing cached database data. appId");
                            ayz0 ayz0Var6 = this.d;
                            I(ayz0Var6);
                            mb01 mb01Var2 = (mb01) ayz0Var6.b;
                            String F = D.F();
                            ayz0Var6.l();
                            ayz0Var6.k();
                            exc0.f(F);
                            try {
                                C = ayz0Var6.C();
                                strArr = new String[]{F};
                                context = context2;
                            } catch (SQLiteException e) {
                                e = e;
                                str = "_sysu";
                                context = context2;
                            }
                            try {
                                int delete = C.delete("events", "app_id=?", strArr) + C.delete("user_attributes", "app_id=?", strArr) + C.delete("conditional_properties", "app_id=?", strArr) + C.delete("apps", "app_id=?", strArr) + C.delete("raw_events", "app_id=?", strArr) + C.delete("raw_events_metadata", "app_id=?", strArr) + C.delete("event_filters", "app_id=?", strArr) + C.delete("property_filters", "app_id=?", strArr) + C.delete("audience_filter_values", "app_id=?", strArr) + C.delete("consent_settings", "app_id=?", strArr);
                                zzoi.zzc();
                                i = i3;
                                try {
                                    str = "_sysu";
                                    try {
                                        int delete2 = mb01Var2.h.t(null, s701.o0) ? delete + C.delete("default_event_params", "app_id=?", strArr) : delete;
                                        if (delete2 > 0) {
                                            k901 k901Var = mb01Var2.j;
                                            mb01.k(k901Var);
                                            k901Var.q.c("Deleted application data. app, records", F, Integer.valueOf(delete2));
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        k901 k901Var2 = ((mb01) ayz0Var6.b).j;
                                        mb01.k(k901Var2);
                                        k901Var2.i.c("Error deleting application data. appId, error", k901.r(F), e);
                                        D = null;
                                        if (D != null) {
                                        }
                                        J(zzqVar);
                                        if (i == 0) {
                                        }
                                        if (G2 == null) {
                                        }
                                        ayz0 ayz0Var7 = this.d;
                                        I(ayz0Var7);
                                        ayz0Var7.p();
                                        ayz0 ayz0Var8 = this.d;
                                        I(ayz0Var8);
                                        ayz0Var8.P();
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    str = "_sysu";
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                str = "_sysu";
                                i = i3;
                                k901 k901Var22 = ((mb01) ayz0Var6.b).j;
                                mb01.k(k901Var22);
                                k901Var22.i.c("Error deleting application data. appId, error", k901.r(F), e);
                                D = null;
                                if (D != null) {
                                }
                                J(zzqVar);
                                if (i == 0) {
                                }
                                if (G2 == null) {
                                }
                                ayz0 ayz0Var72 = this.d;
                                I(ayz0Var72);
                                ayz0Var72.p();
                                ayz0 ayz0Var82 = this.d;
                                I(ayz0Var82);
                                ayz0Var82.P();
                            }
                            D = null;
                            if (D != null) {
                                if (D.B() != -2147483648L) {
                                    j3 = -2147483648L;
                                    if (D.B() != zzqVar.k) {
                                        z4 = true;
                                        H = D.H();
                                        if (z4 | ((D.B() == j3 || H == null || H.equals(zzqVar.d)) ? false : true)) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("_pv", H);
                                            zzaw zzawVar = new zzaw("_au", new zzau(bundle), "auto", j5);
                                            j5 = j5;
                                            j(zzawVar, zzqVar);
                                        }
                                    }
                                } else {
                                    j3 = -2147483648L;
                                }
                                z4 = false;
                                H = D.H();
                                if (z4 | ((D.B() == j3 || H == null || H.equals(zzqVar.d)) ? false : true)) {
                                }
                            }
                            J(zzqVar);
                            if (i == 0) {
                                ayz0 ayz0Var9 = this.d;
                                I(ayz0Var9);
                                G2 = ayz0Var9.G(str3, "_f");
                                z2 = false;
                            } else {
                                ayz0 ayz0Var10 = this.d;
                                I(ayz0Var10);
                                G2 = ayz0Var10.G(str3, "_v");
                                z2 = true;
                            }
                            if (G2 == null) {
                                long j6 = ((j5 / 3600000) + j) * 3600000;
                                if (z2) {
                                    t(new zzkw(j5, Long.valueOf(j6), "_fvt", "auto"), zzqVar);
                                    d().k();
                                    b();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("_c", 1L);
                                    bundle2.putLong("_r", 1L);
                                    bundle2.putLong("_et", 1L);
                                    if (z) {
                                        bundle2.putLong("_dac", 1L);
                                    }
                                    l(new zzaw("_v", new zzau(bundle2), "auto", j5), zzqVar);
                                } else {
                                    t(new zzkw(j5, Long.valueOf(j6), "_fot", "auto"), zzqVar);
                                    d().k();
                                    z901 z901Var = this.l;
                                    exc0.i(z901Var);
                                    if (str3.isEmpty()) {
                                        k901 k901Var3 = z901Var.a.j;
                                        mb01.k(k901Var3);
                                        k901Var3.m.a("Install Referrer Reporter was called with invalid app package name");
                                    } else {
                                        kb01 kb01Var = z901Var.a.k;
                                        mb01.k(kb01Var);
                                        kb01Var.k();
                                        if (z901Var.a()) {
                                            y901 y901Var = new y901(z901Var, str3);
                                            kb01 kb01Var2 = z901Var.a.k;
                                            mb01.k(kb01Var2);
                                            kb01Var2.k();
                                            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                            PackageManager packageManager = z901Var.a.b.getPackageManager();
                                            if (packageManager == null) {
                                                k901 k901Var4 = z901Var.a.j;
                                                mb01.k(k901Var4);
                                                k901Var4.m.a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                            } else {
                                                List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                                    k901 k901Var5 = z901Var.a.j;
                                                    mb01.k(k901Var5);
                                                    k901Var5.o.a("Play Service for fetching Install Referrer is unavailable on device");
                                                } else {
                                                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                                    if (serviceInfo != null) {
                                                        String str4 = serviceInfo.packageName;
                                                        if (serviceInfo.name != null && "com.android.vending".equals(str4) && z901Var.a()) {
                                                            try {
                                                                boolean a = o4j.b().a(z901Var.a.b, new Intent(intent), y901Var, 1);
                                                                k901 k901Var6 = z901Var.a.j;
                                                                mb01.k(k901Var6);
                                                                k901Var6.q.b(true != a ? "not available" : "available", "Install Referrer Service is");
                                                            } catch (RuntimeException e5) {
                                                                k901 k901Var7 = z901Var.a.j;
                                                                mb01.k(k901Var7);
                                                                k901Var7.i.b(e5.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                            }
                                                        } else {
                                                            k901 k901Var8 = z901Var.a.j;
                                                            mb01.k(k901Var8);
                                                            k901Var8.l.a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            k901 k901Var9 = z901Var.a.j;
                                            mb01.k(k901Var9);
                                            k901Var9.o.a("Install Referrer Reporter is not available");
                                        }
                                    }
                                    d().k();
                                    b();
                                    Bundle bundle3 = new Bundle();
                                    long j7 = j;
                                    bundle3.putLong("_c", j7);
                                    bundle3.putLong("_r", j7);
                                    bundle3.putLong("_uwa", 0L);
                                    bundle3.putLong("_pfo", 0L);
                                    bundle3.putLong("_sys", 0L);
                                    String str5 = str;
                                    bundle3.putLong(str5, 0L);
                                    bundle3.putLong("_et", j7);
                                    if (z) {
                                        bundle3.putLong("_dac", j7);
                                    }
                                    ayz0 ayz0Var11 = this.d;
                                    I(ayz0Var11);
                                    exc0.f(str3);
                                    ayz0Var11.k();
                                    ayz0Var11.l();
                                    long A = ayz0Var11.A(str3);
                                    if (context.getPackageManager() == null) {
                                        e().i.b(k901.r(str3), "PackageManager is null, first open report might be inaccurate. appId");
                                    } else {
                                        try {
                                            packageInfo = xzx0.a(context).b(str3, 0);
                                        } catch (PackageManager.NameNotFoundException e6) {
                                            e().i.c("Package info is null, first open report might be inaccurate. appId", k901.r(str3), e6);
                                            packageInfo = null;
                                        }
                                        if (packageInfo != null) {
                                            long j8 = packageInfo.firstInstallTime;
                                            if (j8 != 0) {
                                                if (j8 != packageInfo.lastUpdateTime) {
                                                    applicationInfo = null;
                                                    if (!K().t(null, s701.b0)) {
                                                        bundle3.putLong("_uwa", 1L);
                                                    } else if (A == 0) {
                                                        bundle3.putLong("_uwa", 1L);
                                                        z3 = false;
                                                        A = 0;
                                                    }
                                                    z3 = false;
                                                } else {
                                                    applicationInfo = null;
                                                    z3 = true;
                                                }
                                                t(new zzkw(j5, Long.valueOf(true != z3 ? 0L : 1L), "_fi", "auto"), zzqVar);
                                                applicationInfo2 = xzx0.a(context).a(0, str3);
                                                if (applicationInfo2 != null) {
                                                    if ((applicationInfo2.flags & 1) != 0) {
                                                        j2 = 1;
                                                        bundle3.putLong("_sys", 1L);
                                                    } else {
                                                        j2 = 1;
                                                    }
                                                    if ((applicationInfo2.flags & 128) != 0) {
                                                        bundle3.putLong(str5, j2);
                                                    }
                                                }
                                            }
                                        }
                                        applicationInfo = null;
                                        applicationInfo2 = xzx0.a(context).a(0, str3);
                                        if (applicationInfo2 != null) {
                                        }
                                    }
                                    if (A >= 0) {
                                        bundle3.putLong("_pfo", A);
                                    }
                                    l(new zzaw("_f", new zzau(bundle3), "auto", j5), zzqVar);
                                }
                            } else if (zzqVar.j) {
                                l(new zzaw("_cd", new zzau(new Bundle()), "auto", j5), zzqVar);
                            }
                            ayz0 ayz0Var722 = this.d;
                            I(ayz0Var722);
                            ayz0Var722.p();
                            ayz0 ayz0Var822 = this.d;
                            I(ayz0Var822);
                            ayz0Var822.P();
                        }
                    } else {
                        z = z5;
                    }
                    str = "_sysu";
                    context = context2;
                    i = i3;
                    if (D != null) {
                    }
                    J(zzqVar);
                    if (i == 0) {
                    }
                    if (G2 == null) {
                    }
                    ayz0 ayz0Var7222 = this.d;
                    I(ayz0Var7222);
                    ayz0Var7222.p();
                    ayz0 ayz0Var8222 = this.d;
                    I(ayz0Var8222);
                    ayz0Var8222.P();
                }
                j = 1;
                Boolean bool = zzqVar.s;
                if (bool != null) {
                    zzkw zzkwVar = new zzkw(j5, Long.valueOf(true != bool.booleanValue() ? 0L : j), "_npa", "auto");
                    if (H2 == null || !H2.e.equals(zzkwVar.e)) {
                        t(zzkwVar, zzqVar);
                    }
                } else if (H2 != null) {
                    p(new zzkw(j5, null, "_npa", "auto"), zzqVar);
                }
                ayz0 ayz0Var52 = this.d;
                I(ayz0Var52);
                exc0.i(str3);
                D = ayz0Var52.D(str3);
                if (D == null) {
                }
                str = "_sysu";
                context = context2;
                i = i3;
                if (D != null) {
                }
                J(zzqVar);
                if (i == 0) {
                }
                if (G2 == null) {
                }
                ayz0 ayz0Var72222 = this.d;
                I(ayz0Var72222);
                ayz0Var72222.p();
                ayz0 ayz0Var82222 = this.d;
                I(ayz0Var82222);
                ayz0Var82222.P();
            } catch (Throwable th) {
                ayz0 ayz0Var12 = this.d;
                I(ayz0Var12);
                ayz0Var12.P();
                throw th;
            }
        }
    }

    public final void o(zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        zzaw zzawVar = zzacVar.l;
        exc0.f(zzacVar.b);
        exc0.i(zzacVar.d);
        exc0.f(zzacVar.d.c);
        d().k();
        b();
        if (H(zzqVar)) {
            if (!zzqVar.i) {
                J(zzqVar);
                return;
            }
            ayz0 ayz0Var = this.d;
            I(ayz0Var);
            ayz0Var.O();
            try {
                J(zzqVar);
                String str = zzacVar.b;
                exc0.i(str);
                ayz0 ayz0Var2 = this.d;
                I(ayz0Var2);
                zzac E = ayz0Var2.E(str, zzacVar.d.c);
                mb01 mb01Var = this.m;
                if (E != null) {
                    e().p.c("Removing conditional user property", zzacVar.b, mb01Var.n.f(zzacVar.d.c));
                    ayz0 ayz0Var3 = this.d;
                    I(ayz0Var3);
                    ayz0Var3.y(str, zzacVar.d.c);
                    if (E.f) {
                        ayz0 ayz0Var4 = this.d;
                        I(ayz0Var4);
                        ayz0Var4.o(str, zzacVar.d.c);
                    }
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.c;
                        zzaw n0 = Q().n0(zzawVar.b, zzauVar != null ? zzauVar.i() : null, E.c, zzawVar.e, true);
                        exc0.i(n0);
                        v(n0, zzqVar);
                    }
                } else {
                    e().l.c("Conditional user property doesn't exist", k901.r(zzacVar.b), mb01Var.n.f(zzacVar.d.c));
                }
                ayz0 ayz0Var5 = this.d;
                I(ayz0Var5);
                ayz0Var5.p();
                ayz0 ayz0Var6 = this.d;
                I(ayz0Var6);
                ayz0Var6.P();
            } catch (Throwable th) {
                ayz0 ayz0Var7 = this.d;
                I(ayz0Var7);
                ayz0Var7.P();
                throw th;
            }
        }
    }

    public final void p(zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        d().k();
        b();
        boolean H = H(zzqVar);
        String str = zzqVar.b;
        Boolean bool = zzqVar.s;
        if (H) {
            if (!zzqVar.i) {
                J(zzqVar);
                return;
            }
            String str2 = zzkwVar.c;
            if ("_npa".equals(str2) && bool != null) {
                e().p.a("Falling back to manifest metadata value for ad personalization");
                ((jcl) f()).getClass();
                t(new zzkw(System.currentTimeMillis(), Long.valueOf(true != bool.booleanValue() ? 0L : 1L), "_npa", "auto"), zzqVar);
                return;
            }
            i901 i901Var = e().p;
            mb01 mb01Var = this.m;
            i901Var.b(mb01Var.n.f(str2), "Removing user property");
            ayz0 ayz0Var = this.d;
            I(ayz0Var);
            ayz0Var.O();
            try {
                J(zzqVar);
                if ("_id".equals(str2)) {
                    ayz0 ayz0Var2 = this.d;
                    I(ayz0Var2);
                    exc0.i(str);
                    ayz0Var2.o(str, "_lair");
                }
                ayz0 ayz0Var3 = this.d;
                I(ayz0Var3);
                exc0.i(str);
                ayz0Var3.o(str, str2);
                ayz0 ayz0Var4 = this.d;
                I(ayz0Var4);
                ayz0Var4.p();
                e().p.b(mb01Var.n.f(str2), "User property removed");
                ayz0 ayz0Var5 = this.d;
                I(ayz0Var5);
                ayz0Var5.P();
            } catch (Throwable th) {
                ayz0 ayz0Var6 = this.d;
                I(ayz0Var6);
                ayz0Var6.P();
                throw th;
            }
        }
    }

    @VisibleForTesting
    public final void q(com.google.android.gms.measurement.internal.zzq zzqVar) {
        if (this.y != null) {
            ArrayList arrayList = new ArrayList();
            this.z = arrayList;
            arrayList.addAll(this.y);
        }
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        mb01 mb01Var = (mb01) ayz0Var.b;
        String str = zzqVar.b;
        exc0.i(str);
        exc0.f(str);
        ayz0Var.k();
        ayz0Var.l();
        try {
            SQLiteDatabase C = ayz0Var.C();
            String[] strArr = {str};
            int delete = C.delete("apps", "app_id=?", strArr) + C.delete("events", "app_id=?", strArr) + C.delete("user_attributes", "app_id=?", strArr) + C.delete("conditional_properties", "app_id=?", strArr) + C.delete("raw_events", "app_id=?", strArr) + C.delete("raw_events_metadata", "app_id=?", strArr) + C.delete("queue", "app_id=?", strArr) + C.delete("audience_filter_values", "app_id=?", strArr) + C.delete("main_event_params", "app_id=?", strArr) + C.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.q.c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.c("Error resetting analytics data. appId, error", k901.r(str), e);
        }
        if (zzqVar.i) {
            n(zzqVar);
        }
    }

    public final void r(zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        zzaw zzawVar;
        exc0.f(zzacVar.b);
        exc0.i(zzacVar.c);
        exc0.i(zzacVar.d);
        exc0.f(zzacVar.d.c);
        d().k();
        b();
        if (H(zzqVar)) {
            if (!zzqVar.i) {
                J(zzqVar);
                return;
            }
            zzac zzacVar2 = new zzac(zzacVar);
            boolean z = false;
            zzacVar2.f = false;
            ayz0 ayz0Var = this.d;
            I(ayz0Var);
            ayz0Var.O();
            try {
                ayz0 ayz0Var2 = this.d;
                I(ayz0Var2);
                String str = zzacVar2.b;
                exc0.i(str);
                zzac E = ayz0Var2.E(str, zzacVar2.d.c);
                mb01 mb01Var = this.m;
                if (E != null && !E.c.equals(zzacVar2.c)) {
                    e().l.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", mb01Var.n.f(zzacVar2.d.c), zzacVar2.c, E.c);
                }
                if (E != null && E.f) {
                    zzacVar2.c = E.c;
                    zzacVar2.e = E.e;
                    zzacVar2.i = E.i;
                    zzacVar2.g = E.g;
                    zzacVar2.j = E.j;
                    zzacVar2.f = true;
                    zzkw zzkwVar = zzacVar2.d;
                    zzacVar2.d = new zzkw(E.d.d, zzkwVar.zza(), zzkwVar.c, E.d.g);
                } else if (TextUtils.isEmpty(zzacVar2.g)) {
                    zzkw zzkwVar2 = zzacVar2.d;
                    zzacVar2.d = new zzkw(zzacVar2.e, zzkwVar2.zza(), zzkwVar2.c, zzacVar2.d.g);
                    zzacVar2.f = true;
                    z = true;
                }
                if (zzacVar2.f) {
                    zzkw zzkwVar3 = zzacVar2.d;
                    String str2 = zzacVar2.b;
                    exc0.i(str2);
                    String str3 = zzacVar2.c;
                    String str4 = zzkwVar3.c;
                    long j = zzkwVar3.d;
                    Object zza = zzkwVar3.zza();
                    exc0.i(zza);
                    uj01 uj01Var = new uj01(str2, str3, str4, j, zza);
                    Object obj = uj01Var.e;
                    String str5 = uj01Var.c;
                    ayz0 ayz0Var3 = this.d;
                    I(ayz0Var3);
                    if (ayz0Var3.u(uj01Var)) {
                        e().p.d("User property updated immediately", zzacVar2.b, mb01Var.n.f(str5), obj);
                    } else {
                        e().i.d("(2)Too many active user properties, ignoring", k901.r(zzacVar2.b), mb01Var.n.f(str5), obj);
                    }
                    if (z && (zzawVar = zzacVar2.j) != null) {
                        v(new zzaw(zzawVar, zzacVar2.e), zzqVar);
                    }
                }
                ayz0 ayz0Var4 = this.d;
                I(ayz0Var4);
                if (ayz0Var4.t(zzacVar2)) {
                    e().p.d("Conditional property added", zzacVar2.b, mb01Var.n.f(zzacVar2.d.c), zzacVar2.d.zza());
                } else {
                    e().i.d("Too many conditional properties, ignoring", k901.r(zzacVar2.b), mb01Var.n.f(zzacVar2.d.c), zzacVar2.d.zza());
                }
                ayz0 ayz0Var5 = this.d;
                I(ayz0Var5);
                ayz0Var5.p();
                ayz0 ayz0Var6 = this.d;
                I(ayz0Var6);
                ayz0Var6.P();
            } catch (Throwable th) {
                ayz0 ayz0Var7 = this.d;
                I(ayz0Var7);
                ayz0Var7.P();
                throw th;
            }
        }
    }

    public final void s(String str, xwz0 xwz0Var) {
        d().k();
        b();
        this.B.put(str, xwz0Var);
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        mb01 mb01Var = (mb01) ayz0Var.b;
        exc0.i(str);
        ayz0Var.k();
        ayz0Var.l();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", xwz0Var.e());
        try {
            if (ayz0Var.C().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                k901 k901Var = mb01Var.j;
                mb01.k(k901Var);
                k901Var.i.b(k901.r(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e) {
            k901 k901Var2 = mb01Var.j;
            mb01.k(k901Var2);
            k901Var2.i.c("Error storing consent setting. appId, error", k901.r(str), e);
        }
    }

    public final void t(zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        long j;
        d().k();
        b();
        boolean H = H(zzqVar);
        String str = zzqVar.b;
        if (H) {
            if (!zzqVar.i) {
                J(zzqVar);
                return;
            }
            sk01 Q = Q();
            String str2 = zzkwVar.c;
            int g0 = Q.g0(str2);
            rob robVar = this.F;
            if (g0 != 0) {
                Q();
                K();
                String q = sk01.q(24, str2, true);
                int length = str2 != null ? str2.length() : 0;
                Q();
                sk01.z(robVar, zzqVar.b, g0, "_ev", q, length);
                return;
            }
            int c0 = Q().c0(zzkwVar.zza(), str2);
            if (c0 != 0) {
                Q();
                K();
                String q2 = sk01.q(24, str2, true);
                Object zza = zzkwVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r8 = zza.toString().length();
                }
                int i = r8;
                Q();
                sk01.z(robVar, zzqVar.b, c0, "_ev", q2, i);
                return;
            }
            Object p = Q().p(zzkwVar.zza(), str2);
            if (p == null) {
                return;
            }
            if ("_sid".equals(str2)) {
                long j2 = zzkwVar.d;
                String str3 = zzkwVar.g;
                exc0.i(str);
                ayz0 ayz0Var = this.d;
                I(ayz0Var);
                uj01 H2 = ayz0Var.H(str, "_sno");
                if (H2 != null) {
                    Object obj = H2.e;
                    if (obj instanceof Long) {
                        j = ((Long) obj).longValue();
                        t(new zzkw(j2, Long.valueOf(j + 1), "_sno", str3), zzqVar);
                    }
                }
                if (H2 != null) {
                    e().l.b(H2.e, "Retrieved last session number from database does not contain a valid (long) value");
                }
                ayz0 ayz0Var2 = this.d;
                I(ayz0Var2);
                kzz0 G2 = ayz0Var2.G(str, "_s");
                if (G2 != null) {
                    j = G2.c;
                    e().q.b(Long.valueOf(j), "Backfill the session number. Last used session number");
                } else {
                    j = 0;
                }
                t(new zzkw(j2, Long.valueOf(j + 1), "_sno", str3), zzqVar);
            }
            exc0.i(str);
            String str4 = zzkwVar.g;
            exc0.i(str4);
            uj01 uj01Var = new uj01(str, str4, zzkwVar.c, zzkwVar.d, p);
            i901 i901Var = e().q;
            mb01 mb01Var = this.m;
            f901 f901Var = mb01Var.n;
            String str5 = uj01Var.c;
            i901Var.c("Setting user property", f901Var.f(str5), p);
            ayz0 ayz0Var3 = this.d;
            I(ayz0Var3);
            ayz0Var3.O();
            try {
                boolean equals = "_id".equals(str5);
                Object obj2 = uj01Var.e;
                if (equals) {
                    ayz0 ayz0Var4 = this.d;
                    I(ayz0Var4);
                    uj01 H3 = ayz0Var4.H(str, "_id");
                    if (H3 != null && !obj2.equals(H3.e)) {
                        ayz0 ayz0Var5 = this.d;
                        I(ayz0Var5);
                        ayz0Var5.o(str, "_lair");
                    }
                }
                J(zzqVar);
                ayz0 ayz0Var6 = this.d;
                I(ayz0Var6);
                boolean u = ayz0Var6.u(uj01Var);
                ayz0 ayz0Var7 = this.d;
                I(ayz0Var7);
                ayz0Var7.p();
                if (!u) {
                    e().i.c("Too many unique user properties are set. Ignoring user property", mb01Var.n.f(str5), obj2);
                    Q();
                    sk01.z(robVar, zzqVar.b, 9, null, null, 0);
                }
                ayz0 ayz0Var8 = this.d;
                I(ayz0Var8);
                ayz0Var8.P();
            } catch (Throwable th) {
                ayz0 ayz0Var9 = this.d;
                I(ayz0Var9);
                ayz0Var9.P();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x059c, code lost:
    
        if (r3 == null) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        if (r12 == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x029c A[ADDED_TO_REGION, EDGE_INSN: B:202:0x029c->B:200:0x029c BREAK  A[LOOP:4: B:171:0x01bd->B:198:0x0294], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02cf A[Catch: all -> 0x02a1, TRY_ENTER, TryCatch #3 {all -> 0x02a1, blocks: (B:3:0x0014, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0093, B:35:0x00c5, B:39:0x00e6, B:41:0x00f7, B:67:0x0142, B:70:0x016a, B:73:0x0172, B:82:0x02d2, B:84:0x02d8, B:86:0x02e4, B:87:0x02e8, B:89:0x02ee, B:92:0x0302, B:95:0x030b, B:97:0x0311, B:101:0x0336, B:102:0x0326, B:105:0x0330, B:111:0x0339, B:113:0x0354, B:116:0x0364, B:118:0x0388, B:124:0x039d, B:126:0x03d7, B:128:0x03dc, B:130:0x03e4, B:131:0x03e7, B:133:0x03ec, B:134:0x03ef, B:136:0x03fb, B:138:0x040f, B:141:0x041b, B:143:0x042a, B:144:0x0439, B:146:0x0459, B:148:0x0497, B:150:0x04a9, B:151:0x04c0, B:153:0x04cb, B:154:0x04d4, B:157:0x0506, B:160:0x050f, B:162:0x04b9, B:164:0x048e, B:200:0x029c, B:214:0x0525, B:215:0x0528, B:209:0x02cf, B:261:0x0529, B:268:0x0570, B:270:0x059f, B:272:0x05a5, B:274:0x05b0, B:277:0x057e, B:287:0x05bb, B:288:0x05be), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0525 A[Catch: all -> 0x02a1, TryCatch #3 {all -> 0x02a1, blocks: (B:3:0x0014, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0093, B:35:0x00c5, B:39:0x00e6, B:41:0x00f7, B:67:0x0142, B:70:0x016a, B:73:0x0172, B:82:0x02d2, B:84:0x02d8, B:86:0x02e4, B:87:0x02e8, B:89:0x02ee, B:92:0x0302, B:95:0x030b, B:97:0x0311, B:101:0x0336, B:102:0x0326, B:105:0x0330, B:111:0x0339, B:113:0x0354, B:116:0x0364, B:118:0x0388, B:124:0x039d, B:126:0x03d7, B:128:0x03dc, B:130:0x03e4, B:131:0x03e7, B:133:0x03ec, B:134:0x03ef, B:136:0x03fb, B:138:0x040f, B:141:0x041b, B:143:0x042a, B:144:0x0439, B:146:0x0459, B:148:0x0497, B:150:0x04a9, B:151:0x04c0, B:153:0x04cb, B:154:0x04d4, B:157:0x0506, B:160:0x050f, B:162:0x04b9, B:164:0x048e, B:200:0x029c, B:214:0x0525, B:215:0x0528, B:209:0x02cf, B:261:0x0529, B:268:0x0570, B:270:0x059f, B:272:0x05a5, B:274:0x05b0, B:277:0x057e, B:287:0x05bb, B:288:0x05be), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05a5 A[Catch: all -> 0x02a1, TryCatch #3 {all -> 0x02a1, blocks: (B:3:0x0014, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0093, B:35:0x00c5, B:39:0x00e6, B:41:0x00f7, B:67:0x0142, B:70:0x016a, B:73:0x0172, B:82:0x02d2, B:84:0x02d8, B:86:0x02e4, B:87:0x02e8, B:89:0x02ee, B:92:0x0302, B:95:0x030b, B:97:0x0311, B:101:0x0336, B:102:0x0326, B:105:0x0330, B:111:0x0339, B:113:0x0354, B:116:0x0364, B:118:0x0388, B:124:0x039d, B:126:0x03d7, B:128:0x03dc, B:130:0x03e4, B:131:0x03e7, B:133:0x03ec, B:134:0x03ef, B:136:0x03fb, B:138:0x040f, B:141:0x041b, B:143:0x042a, B:144:0x0439, B:146:0x0459, B:148:0x0497, B:150:0x04a9, B:151:0x04c0, B:153:0x04cb, B:154:0x04d4, B:157:0x0506, B:160:0x050f, B:162:0x04b9, B:164:0x048e, B:200:0x029c, B:214:0x0525, B:215:0x0528, B:209:0x02cf, B:261:0x0529, B:268:0x0570, B:270:0x059f, B:272:0x05a5, B:274:0x05b0, B:277:0x057e, B:287:0x05bb, B:288:0x05be), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e A[Catch: all -> 0x0034, TryCatch #12 {all -> 0x0034, blocks: (B:6:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0080, B:31:0x00bc, B:38:0x00d1, B:44:0x00fd, B:50:0x0112, B:51:0x0139, B:61:0x013e, B:62:0x0141, B:80:0x01a4), top: B:4:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d8 A[Catch: all -> 0x02a1, TryCatch #3 {all -> 0x02a1, blocks: (B:3:0x0014, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0093, B:35:0x00c5, B:39:0x00e6, B:41:0x00f7, B:67:0x0142, B:70:0x016a, B:73:0x0172, B:82:0x02d2, B:84:0x02d8, B:86:0x02e4, B:87:0x02e8, B:89:0x02ee, B:92:0x0302, B:95:0x030b, B:97:0x0311, B:101:0x0336, B:102:0x0326, B:105:0x0330, B:111:0x0339, B:113:0x0354, B:116:0x0364, B:118:0x0388, B:124:0x039d, B:126:0x03d7, B:128:0x03dc, B:130:0x03e4, B:131:0x03e7, B:133:0x03ec, B:134:0x03ef, B:136:0x03fb, B:138:0x040f, B:141:0x041b, B:143:0x042a, B:144:0x0439, B:146:0x0459, B:148:0x0497, B:150:0x04a9, B:151:0x04c0, B:153:0x04cb, B:154:0x04d4, B:157:0x0506, B:160:0x050f, B:162:0x04b9, B:164:0x048e, B:200:0x029c, B:214:0x0525, B:215:0x0528, B:209:0x02cf, B:261:0x0529, B:268:0x0570, B:270:0x059f, B:272:0x05a5, B:274:0x05b0, B:277:0x057e, B:287:0x05bb, B:288:0x05be), top: B:2:0x0014 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u() {
        boolean z;
        Boolean x;
        ?? r10;
        ayz0 ayz0Var;
        long longValue;
        Cursor cursor;
        String str;
        Cursor cursor2;
        int i;
        Cursor cursor3;
        List list;
        sj01 sj01Var;
        String str2;
        String str3;
        String str4;
        String str5;
        Cursor cursor4;
        byte[] blob;
        sj01 sj01Var2;
        Cursor cursor5;
        p901 p901Var = this.c;
        mb01 mb01Var = this.m;
        d().k();
        b();
        int i2 = 1;
        this.v = true;
        int i3 = 0;
        try {
            mb01Var.getClass();
            x = mb01Var.s().x();
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            if (x == null) {
                e().q().a("Upload data called on the client side before use of service was decided");
                this.v = false;
            } else if (x.booleanValue()) {
                e().o().a("Upload called in the client side when service should be used");
                this.v = false;
            } else if (this.p > 0) {
                D();
                this.v = false;
            } else {
                d().k();
                if (this.y != null) {
                    e().p().a("Uploading requested multiple times");
                    this.v = false;
                } else {
                    I(p901Var);
                    if (p901Var.o()) {
                        long currentTimeMillis = ((jcl) f()).currentTimeMillis();
                        Cursor cursor6 = null;
                        int o = K().o(null, s701.Q);
                        K();
                        long longValue2 = currentTimeMillis - ((Long) s701.e.a(null)).longValue();
                        for (int i4 = 0; i4 < o && E(longValue2); i4++) {
                        }
                        long a = this.j.j.a();
                        if (a != 0) {
                            e().p.b(Long.valueOf(Math.abs(currentTimeMillis - a)), "Uploading events. Elapsed time since last upload attempt (ms)");
                        }
                        ayz0 ayz0Var2 = this.d;
                        I(ayz0Var2);
                        String J = ayz0Var2.J();
                        long j = -1;
                        if (TextUtils.isEmpty(J)) {
                            try {
                                this.A = -1L;
                                ayz0Var = this.d;
                                I(ayz0Var);
                                K();
                                longValue = currentTimeMillis - ((Long) s701.e.a(null)).longValue();
                                ayz0Var.k();
                                ayz0Var.l();
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = p901Var;
                            }
                            try {
                                cursor = ayz0Var.C().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(longValue)});
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    ((mb01) ayz0Var.b).e().o().b(e, "Error selecting expired configs");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                cursor = null;
                            } catch (Throwable th3) {
                                th = th3;
                                r10 = 0;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                throw th;
                            }
                            if (cursor.moveToFirst()) {
                                str = cursor.getString(0);
                                cursor.close();
                                if (!TextUtils.isEmpty(str)) {
                                }
                            } else {
                                ((mb01) ayz0Var.b).e().p().a("No expired configs for apps with pending events");
                                cursor.close();
                                str = null;
                                if (!TextUtils.isEmpty(str)) {
                                    ayz0 ayz0Var3 = this.d;
                                    I(ayz0Var3);
                                    qd01 D = ayz0Var3.D(str);
                                    if (D != null) {
                                        i(D);
                                    }
                                }
                            }
                        } else {
                            if (this.A == -1) {
                                ayz0 ayz0Var4 = this.d;
                                I(ayz0Var4);
                                try {
                                    cursor5 = ayz0Var4.C().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    try {
                                        try {
                                            if (cursor5.moveToFirst()) {
                                                j = cursor5.getLong(0);
                                            }
                                        } catch (SQLiteException e3) {
                                            e = e3;
                                            ((mb01) ayz0Var4.b).e().o().b(e, "Error querying raw events");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor6 = cursor5;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursor5 = null;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (cursor6 != null) {
                                    }
                                    throw th;
                                }
                                cursor5.close();
                                this.A = j;
                            }
                            int o2 = K().o(J, s701.h);
                            int max = Math.max(0, K().o(J, s701.i));
                            ayz0 ayz0Var5 = this.d;
                            I(ayz0Var5);
                            ayz0Var5.k();
                            ayz0Var5.l();
                            exc0.b(o2 > 0);
                            exc0.b(max > 0);
                            exc0.f(J);
                            try {
                                Cursor query = ayz0Var5.C().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{J}, null, null, "rowid", String.valueOf(o2));
                                try {
                                    try {
                                        if (query.moveToFirst()) {
                                            ArrayList arrayList = new ArrayList();
                                            int i5 = 0;
                                            while (true) {
                                                long j2 = query.getLong(i3);
                                                try {
                                                    blob = query.getBlob(i2);
                                                    i = i2;
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    i = i2;
                                                }
                                                try {
                                                    try {
                                                        sj01Var2 = ayz0Var5.e.h;
                                                        I(sj01Var2);
                                                    } catch (IOException e6) {
                                                        e = e6;
                                                        cursor4 = query;
                                                        ((mb01) ayz0Var5.b).e().o().c("Failed to unzip queued bundle. appId", k901.r(J), e);
                                                        if (!cursor4.moveToNext()) {
                                                            break;
                                                        }
                                                        i2 = i;
                                                        query = cursor4;
                                                        i3 = 0;
                                                        cursor4.close();
                                                        list = arrayList;
                                                        if (!list.isEmpty()) {
                                                        }
                                                        this.v = false;
                                                        B();
                                                    }
                                                    try {
                                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        byte[] bArr = new byte[1024];
                                                        while (true) {
                                                            int read = gZIPInputStream.read(bArr);
                                                            if (read <= 0) {
                                                                break;
                                                            }
                                                            cursor4 = query;
                                                            try {
                                                                try {
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                    query = cursor4;
                                                                } catch (IOException e7) {
                                                                    e = e7;
                                                                    try {
                                                                        ((mb01) sj01Var2.b).e().o().b(e, "Failed to ungzip content");
                                                                        throw e;
                                                                    } catch (IOException e8) {
                                                                        e = e8;
                                                                        ((mb01) ayz0Var5.b).e().o().c("Failed to unzip queued bundle. appId", k901.r(J), e);
                                                                        if (!cursor4.moveToNext()) {
                                                                        }
                                                                        cursor4.close();
                                                                        list = arrayList;
                                                                        if (!list.isEmpty()) {
                                                                        }
                                                                        this.v = false;
                                                                        B();
                                                                    }
                                                                }
                                                            } catch (SQLiteException e9) {
                                                                e = e9;
                                                                cursor3 = cursor4;
                                                                try {
                                                                    ((mb01) ayz0Var5.b).e().o().c("Error querying bundles. appId", k901.r(J), e);
                                                                    list = Collections.EMPTY_LIST;
                                                                    if (cursor3 != null) {
                                                                    }
                                                                    if (!list.isEmpty()) {
                                                                    }
                                                                    this.v = false;
                                                                    B();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    cursor2 = cursor3;
                                                                    if (cursor2 != null) {
                                                                        cursor2.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                cursor2 = cursor4;
                                                                if (cursor2 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                        gZIPInputStream.close();
                                                        byteArrayInputStream.close();
                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                        if (!arrayList.isEmpty() && byteArray.length + i5 > max) {
                                                            cursor4 = query;
                                                            break;
                                                        }
                                                        try {
                                                            zzgc zzgcVar = (zzgc) sj01.D(zzgd.zzt(), byteArray);
                                                            if (!query.isNull(2)) {
                                                                zzgcVar.zzaf(query.getInt(2));
                                                            }
                                                            i5 += byteArray.length;
                                                            arrayList.add(Pair.create((zzgd) zzgcVar.zzaC(), Long.valueOf(j2)));
                                                        } catch (IOException e10) {
                                                            ((mb01) ayz0Var5.b).e().o().c("Failed to merge queued bundle. appId", k901.r(J), e10);
                                                        }
                                                        cursor4 = query;
                                                        if (!cursor4.moveToNext() || i5 > max) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i2 = i;
                                                            query = cursor4;
                                                            i3 = 0;
                                                        }
                                                    } catch (IOException e11) {
                                                        e = e11;
                                                        cursor4 = query;
                                                    }
                                                } catch (SQLiteException e12) {
                                                    e = e12;
                                                    cursor4 = query;
                                                    cursor3 = cursor4;
                                                    ((mb01) ayz0Var5.b).e().o().c("Error querying bundles. appId", k901.r(J), e);
                                                    list = Collections.EMPTY_LIST;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    if (!list.isEmpty()) {
                                                    }
                                                    this.v = false;
                                                    B();
                                                }
                                            }
                                            cursor4.close();
                                            list = arrayList;
                                        } else {
                                            list = Collections.EMPTY_LIST;
                                            query.close();
                                            i = 1;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor4 = query;
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    i = 1;
                                }
                            } catch (SQLiteException e14) {
                                e = e14;
                                i = 1;
                                cursor3 = null;
                            } catch (Throwable th9) {
                                th = th9;
                                cursor2 = null;
                            }
                            if (!list.isEmpty()) {
                                if (L(J).f(zzah.AD_STORAGE)) {
                                    Iterator it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            str5 = null;
                                            break;
                                        }
                                        zzgd zzgdVar = (zzgd) ((Pair) it.next()).first;
                                        if (!zzgdVar.zzJ().isEmpty()) {
                                            str5 = zzgdVar.zzJ();
                                            break;
                                        }
                                    }
                                    if (str5 != null) {
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 >= list.size()) {
                                                break;
                                            }
                                            zzgd zzgdVar2 = (zzgd) ((Pair) list.get(i6)).first;
                                            if (!zzgdVar2.zzJ().isEmpty() && !zzgdVar2.zzJ().equals(str5)) {
                                                list = list.subList(0, i6);
                                                break;
                                            }
                                            i6++;
                                        }
                                    }
                                }
                                zzga zza = zzgb.zza();
                                int size = list.size();
                                ArrayList arrayList2 = new ArrayList(list.size());
                                int i7 = (K().u(J) && L(J).f(zzah.AD_STORAGE)) ? i : 0;
                                boolean f = L(J).f(zzah.AD_STORAGE);
                                boolean f2 = L(J).f(zzah.ANALYTICS_STORAGE);
                                zzpd.zzc();
                                int i8 = (K().t(null, s701.h0) && K().t(J, s701.j0)) ? i : 0;
                                int i9 = 0;
                                while (true) {
                                    sj01Var = this.h;
                                    if (i9 >= size) {
                                        break;
                                    }
                                    zzgc zzgcVar2 = (zzgc) ((zzgd) ((Pair) list.get(i9)).first).zzby();
                                    List list2 = list;
                                    arrayList2.add((Long) ((Pair) list.get(i9)).second);
                                    K().p();
                                    int i10 = i7;
                                    boolean z2 = f;
                                    zzgcVar2.zzal(74029L);
                                    zzgcVar2.zzak(currentTimeMillis);
                                    zzgcVar2.zzag(false);
                                    if (i10 == 0) {
                                        zzgcVar2.zzq();
                                    }
                                    if (!z2) {
                                        zzgcVar2.zzx();
                                        zzgcVar2.zzt();
                                    }
                                    if (!f2) {
                                        zzgcVar2.zzn();
                                    }
                                    h(zzgcVar2, J);
                                    if (i8 == 0) {
                                        zzgcVar2.zzy();
                                    }
                                    if (K().t(J, s701.T)) {
                                        byte[] zzbu = ((zzgd) zzgcVar2.zzaC()).zzbu();
                                        I(sj01Var);
                                        zzgcVar2.zzJ(sj01Var.y(zzbu));
                                    }
                                    zza.zza(zzgcVar2);
                                    i9++;
                                    i7 = i10;
                                    f = z2;
                                    list = list2;
                                }
                                if (Log.isLoggable(e().u(), 2)) {
                                    I(sj01Var);
                                    str2 = sj01Var.E((zzgb) zza.zzaC());
                                } else {
                                    str2 = null;
                                }
                                I(sj01Var);
                                byte[] zzbu2 = ((zzgb) zza.zzaC()).zzbu();
                                fb01 fb01Var = this.k.e.b;
                                I(fb01Var);
                                String v = fb01Var.v(J);
                                if (TextUtils.isEmpty(v)) {
                                    str3 = (String) s701.r.a(null);
                                } else {
                                    Uri parse = Uri.parse((String) s701.r.a(null));
                                    Uri.Builder buildUpon = parse.buildUpon();
                                    buildUpon.authority(v + "." + parse.getAuthority());
                                    str3 = buildUpon.build().toString();
                                }
                                try {
                                    URL url = new URL(str3);
                                    exc0.b(!arrayList2.isEmpty());
                                    if (this.y != null) {
                                        e().o().a("Set uploading progress before finishing the previous upload");
                                    } else {
                                        this.y = new ArrayList(arrayList2);
                                    }
                                    this.j.k.b(currentTimeMillis);
                                    e().p().d("Uploading data. app, uncompressed size, data", size > 0 ? zza.zzb(0).zzx() : "?", Integer.valueOf(zzbu2.length), str2);
                                    this.u = i;
                                    I(p901Var);
                                    pll pllVar = new pll(this, J);
                                    p901Var.k();
                                    p901Var.l();
                                    str4 = J;
                                    try {
                                        ((mb01) p901Var.b).d().r(new o901(p901Var, str4, url, zzbu2, null, pllVar));
                                    } catch (MalformedURLException unused) {
                                        e().o().c("Failed to parse upload URL. Not uploading. appId", k901.r(str4), str3);
                                        this.v = false;
                                        B();
                                    }
                                } catch (MalformedURLException unused2) {
                                    str4 = J;
                                }
                            }
                        }
                        this.v = false;
                    } else {
                        e().p().a("Network not connected, ignoring upload request");
                        D();
                        this.v = false;
                    }
                }
            }
            B();
        } catch (Throwable th10) {
            th = th10;
            z = false;
            this.v = z;
            B();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:298|(2:300|(10:302|303|304|(6:306|49|(0)(0)|52|53|(0)(0))|48|49|(0)(0)|52|53|(0)(0)))|307|308|309|310|311|303|304|(0)|48|49|(0)(0)|52|53|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(53:(2:62|(5:64|(1:66)|67|68|69))|70|(2:72|(5:74|(1:76)|77|78|79))(1:267)|80|(1:82)(1:266)|83|(1:85)|86|(2:88|(1:92))|93|(3:94|95|96)|(3:97|98|99)|100|(1:102)|103|(2:105|(2:111|112)(3:108|109|110))(1:259)|113|114|(1:116)|117|(1:119)(1:258)|120|(1:122)(1:257)|123|(1:129)|130|(1:132)(1:256)|133|134|(1:136)(1:255)|137|(1:141)|142|(1:144)(1:254)|145|146|(13:(1:253)(31:150|(2:151|(3:153|(3:155|156|(2:158|(2:160|162)(1:244))(1:246))(1:250)|245)(2:251|252))|163|(1:165)|(1:168)|169|(4:172|(1:174)(1:181)|175|(2:178|(1:180)))|182|(2:184|(1:186))|187|(3:189|(1:191)|192)|193|(1:197)|198|(1:200)|201|(3:204|205|202)|206|207|208|209|210|(2:211|(2:213|(1:216)(1:215))(3:231|232|(1:237)(1:236)))|217|218|219|220|(1:222)(2:227|228)|223|224|225)|208|209|210|(3:211|(0)(0)|215)|217|218|219|220|(0)(0)|223|224|225)|166|(0)|169|(4:172|(0)(0)|175|(2:178|(0)))|182|(0)|187|(0)|193|(2:195|197)|198|(0)|201|(1:202)|206|207) */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0a69, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0a86, code lost:
    
        e().o().c("Data loss. Failed to insert raw event metadata. appId", xsna.k901.r(r4.zzap()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x02ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x02bb, code lost:
    
        ((xsna.mb01) r2.b).e().o().c("Error pruning currencies. appId", xsna.k901.r(r8), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0535 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0574 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x064f A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0658 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0666 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x069c A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x06b1 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x06e8 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x07b4 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x07d8 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x07fd A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07dd A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x083b A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0853 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08b2 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x08d0 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08ea A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0983 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a32 A[Catch: all -> 0x01ad, SQLiteException -> 0x0a4a, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0a4a, blocks: (B:220:0x0a21, B:222:0x0a32), top: B:219:0x0a21, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0996 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x060f A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0336 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02f5 A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x039e A[Catch: all -> 0x01ad, TryCatch #7 {all -> 0x01ad, blocks: (B:34:0x018e, B:37:0x019b, B:39:0x01a3, B:42:0x01b0, B:49:0x0324, B:53:0x0361, B:55:0x039e, B:57:0x03a4, B:58:0x03bb, B:62:0x03ce, B:64:0x03e6, B:66:0x03ec, B:67:0x0403, B:72:0x042b, B:76:0x044e, B:77:0x0465, B:80:0x0477, B:85:0x04a6, B:86:0x04ba, B:88:0x04c2, B:90:0x04cd, B:92:0x04d3, B:93:0x04dc, B:95:0x04ea, B:98:0x0502, B:102:0x0535, B:103:0x054a, B:105:0x0574, B:108:0x059f, B:112:0x05ee, B:114:0x061c, B:116:0x064f, B:117:0x0652, B:119:0x0658, B:120:0x0660, B:122:0x0666, B:123:0x066e, B:125:0x067e, B:127:0x068a, B:129:0x0690, B:132:0x069c, B:134:0x06a8, B:136:0x06b1, B:137:0x06b9, B:139:0x06d9, B:141:0x06df, B:144:0x06e8, B:146:0x06fb, B:148:0x0713, B:150:0x0720, B:151:0x073c, B:153:0x0742, B:156:0x075c, B:158:0x0768, B:160:0x0775, B:163:0x07aa, B:168:0x07b4, B:169:0x07b7, B:172:0x07cd, B:174:0x07d8, B:175:0x07e6, B:178:0x07f2, B:180:0x07fd, B:181:0x07dd, B:182:0x0806, B:184:0x083b, B:186:0x0845, B:187:0x0848, B:189:0x0853, B:191:0x086f, B:192:0x087a, B:193:0x08aa, B:195:0x08b2, B:197:0x08bc, B:198:0x08c6, B:200:0x08d0, B:201:0x08da, B:202:0x08e4, B:204:0x08ea, B:207:0x0918, B:209:0x095f, B:210:0x096a, B:211:0x097d, B:213:0x0983, B:218:0x09d2, B:220:0x0a21, B:222:0x0a32, B:223:0x0a9b, B:228:0x0a4e, B:230:0x0a51, B:232:0x0996, B:234:0x09bd, B:240:0x0a6c, B:241:0x0a85, B:243:0x0a86, B:248:0x0796, B:259:0x060f, B:262:0x051a, B:266:0x0496, B:268:0x0336, B:269:0x0342, B:271:0x0348, B:278:0x0356, B:281:0x01c6, B:284:0x01d2, B:286:0x01e7, B:291:0x01ff, B:294:0x0237, B:296:0x023d, B:298:0x024b, B:300:0x025c, B:302:0x0265, B:304:0x02ea, B:306:0x02f5, B:308:0x028e, B:310:0x02a8, B:311:0x02d0, B:314:0x02bb, B:315:0x020b, B:320:0x0233), top: B:33:0x018e, inners: #0, #2, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) {
        String str;
        String str2;
        String str3;
        long j;
        uj01 uj01Var;
        String str4;
        uj01 uj01Var2;
        ayz0 ayz0Var;
        rob robVar;
        long j2;
        long intValue;
        rob robVar2;
        long j3;
        kzz0 G2;
        kzz0 b;
        dzz0 dzz0Var;
        zzgc zzt;
        String str5;
        String str6;
        long j4;
        long j5;
        String str7;
        String str8;
        long j6;
        Map b2;
        long j7;
        long j8;
        ArrayList arrayList;
        xwz0 c;
        zzah zzahVar;
        qd01 D;
        List M;
        int i;
        ayz0 ayz0Var2;
        zzgd zzgdVar;
        ayz0 ayz0Var3;
        Iterator<String> it;
        int i2;
        ContentValues contentValues;
        String str9;
        Pair o;
        Object obj;
        exc0.i(zzqVar);
        long j9 = zzqVar.t;
        long j10 = zzqVar.g;
        String str10 = zzqVar.w;
        long j11 = zzqVar.f;
        long j12 = zzqVar.k;
        String str11 = zzqVar.y;
        String str12 = zzqVar.r;
        boolean z = zzqVar.i;
        boolean z2 = zzqVar.p;
        String str13 = zzqVar.c;
        String str14 = zzqVar.d;
        String str15 = zzqVar.e;
        String str16 = zzqVar.b;
        exc0.f(str16);
        long nanoTime = System.nanoTime();
        d().k();
        b();
        String str17 = zzqVar.b;
        sj01 sj01Var = this.h;
        I(sj01Var);
        boolean z3 = (TextUtils.isEmpty(str13) && TextUtils.isEmpty(str12)) ? false : true;
        String str18 = zzawVar.b;
        if (!z3) {
            return;
        }
        if (!z) {
            J(zzqVar);
            return;
        }
        fb01 fb01Var = this.b;
        I(fb01Var);
        boolean y = fb01Var.y(str17, str18);
        rob robVar3 = this.F;
        mb01 mb01Var = this.m;
        if (y) {
            e().q().c("Dropping blocked event. appId", k901.r(str17), mb01Var.q().d(str18));
            I(fb01Var);
            if (!"1".equals(fb01Var.b(str17, "measurement.upload.blacklist_internal"))) {
                I(fb01Var);
                if (!"1".equals(fb01Var.b(str17, "measurement.upload.blacklist_public"))) {
                    if ("_err".equals(str18)) {
                        return;
                    }
                    Q();
                    sk01.z(robVar3, str17, 11, "_ev", zzawVar.b, 0);
                    return;
                }
            }
            ayz0 ayz0Var4 = this.d;
            I(ayz0Var4);
            qd01 D2 = ayz0Var4.D(str17);
            if (D2 != null) {
                mb01 mb01Var2 = D2.a;
                kb01 kb01Var = mb01Var2.k;
                mb01.k(kb01Var);
                kb01Var.k();
                long j13 = D2.E;
                kb01 kb01Var2 = mb01Var2.k;
                mb01.k(kb01Var2);
                kb01Var2.k();
                long abs = Math.abs(((jcl) f()).currentTimeMillis() - Math.max(j13, D2.D));
                K();
                if (abs > ((Long) s701.z.a(null)).longValue()) {
                    e().p.a("Fetching config for blocked app");
                    i(D2);
                    return;
                }
                return;
            }
            return;
        }
        l901 b3 = l901.b(zzawVar);
        sk01 Q = Q();
        kwz0 K = K();
        K.getClass();
        Q.y(b3, Math.max(Math.min(K.o(str17, s701.I), 100), 25));
        zzaw a = b3.a();
        zzau zzauVar = a.c;
        String str19 = a.b;
        if (Log.isLoggable(e().u(), 2)) {
            str = str11;
            e().p().b(mb01Var.q().c(a), "Logging event");
        } else {
            str = str11;
        }
        ayz0 ayz0Var5 = this.d;
        I(ayz0Var5);
        ayz0Var5.O();
        try {
            J(zzqVar);
            boolean z4 = "ecommerce_purchase".equals(str19) || "purchase".equals(str19) || "refund".equals(str19);
            if (!"_iap".equals(str19)) {
                if (z4) {
                    z4 = true;
                } else {
                    str2 = str14;
                    str3 = str15;
                    str4 = str17;
                    robVar = robVar3;
                    boolean U = sk01.U(str19);
                    boolean equals = "_err".equals(str19);
                    Q();
                    if (zzauVar == null) {
                        j2 = 0;
                    } else {
                        Iterator<String> it2 = zzauVar.b.keySet().iterator();
                        j2 = 0;
                        while (it2.hasNext()) {
                            if (zzauVar.k(it2.next()) instanceof Parcelable[]) {
                                j2 += ((Parcelable[]) r8).length;
                            }
                        }
                    }
                    ayz0 ayz0Var6 = this.d;
                    I(ayz0Var6);
                    String str20 = str4;
                    kxz0 F = ayz0Var6.F(w(), str20, j2 + 1, true, U, false, equals, false);
                    long j14 = F.b;
                    K();
                    intValue = j14 - ((Integer) s701.l.a(null)).intValue();
                    if (intValue > 0) {
                        if (intValue % 1000 == 1) {
                            e().o().c("Data loss. Too many events logged. appId, count", k901.r(str20), Long.valueOf(F.b));
                        }
                        ayz0 ayz0Var7 = this.d;
                        I(ayz0Var7);
                        ayz0Var7.p();
                        ayz0 ayz0Var8 = this.d;
                        I(ayz0Var8);
                        ayz0Var8.P();
                        return;
                    }
                    if (U) {
                        long j15 = F.a;
                        K();
                        long intValue2 = j15 - ((Integer) s701.n.a(null)).intValue();
                        if (intValue2 > 0) {
                            if (intValue2 % 1000 == 1) {
                                e().o().c("Data loss. Too many public events logged. appId, count", k901.r(str20), Long.valueOf(F.a));
                            }
                            Q();
                            sk01.z(robVar, str20, 16, "_ev", a.b, 0);
                            ayz0 ayz0Var9 = this.d;
                            I(ayz0Var9);
                            ayz0Var9.p();
                            ayz0 ayz0Var10 = this.d;
                            I(ayz0Var10);
                            ayz0Var10.P();
                            return;
                        }
                    }
                    rob robVar4 = robVar;
                    if (equals) {
                        robVar2 = robVar4;
                        long max = F.d - Math.max(0, Math.min(1000000, K().o(str16, s701.m)));
                        if (max > 0) {
                            if (max == 1) {
                                e().o().c("Too many error events logged. appId, count", k901.r(str20), Long.valueOf(F.d));
                            }
                            ayz0 ayz0Var11 = this.d;
                            I(ayz0Var11);
                            ayz0Var11.p();
                            ayz0 ayz0Var12 = this.d;
                            I(ayz0Var12);
                            ayz0Var12.P();
                            return;
                        }
                    } else {
                        robVar2 = robVar4;
                    }
                    Bundle i3 = zzauVar.i();
                    Q().A("_o", i3, a.d);
                    if (TextUtils.isEmpty(str20) ? false : ((mb01) Q().b).h.l("debug.firebase.analytics.app").equals(str20)) {
                        Q().A("_dbg", i3, 1L);
                        Q().A("_r", i3, 1L);
                    }
                    if ("_s".equals(str19)) {
                        ayz0 ayz0Var13 = this.d;
                        I(ayz0Var13);
                        uj01 H = ayz0Var13.H(str16, "_sno");
                        if (H != null && (H.e instanceof Long)) {
                            Q().A("_sno", i3, H.e);
                        }
                    }
                    ayz0 ayz0Var14 = this.d;
                    I(ayz0Var14);
                    exc0.f(str20);
                    ayz0Var14.k();
                    ayz0Var14.l();
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                    }
                    try {
                        j3 = ayz0Var14.C().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str20, String.valueOf(Math.max(0, Math.min(1000000, ((mb01) ayz0Var14.b).h.o(str20, s701.q))))});
                    } catch (SQLiteException e2) {
                        e = e2;
                        ((mb01) ayz0Var14.b).e().o().c("Error deleting over the limit events. appId", k901.r(str20), e);
                        j3 = 0;
                        if (j3 > 0) {
                        }
                        dzz0 dzz0Var2 = new dzz0(this.m, a.d, str20, a.b, a.e, i3);
                        String str21 = dzz0Var2.b;
                        ayz0 ayz0Var15 = this.d;
                        I(ayz0Var15);
                        G2 = ayz0Var15.G(str20, str21);
                        if (G2 != null) {
                        }
                        dzz0Var = dzz0Var2;
                        kzz0 kzz0Var = b;
                        ayz0 ayz0Var16 = this.d;
                        I(ayz0Var16);
                        ayz0Var16.r(kzz0Var);
                        d().k();
                        b();
                        exc0.f(dzz0Var.a);
                        exc0.b(dzz0Var.a.equals(str16));
                        zzt = zzgd.zzt();
                        zzt.zzad(1);
                        zzt.zzZ("android");
                        if (!TextUtils.isEmpty(str16)) {
                        }
                        if (TextUtils.isEmpty(str3)) {
                        }
                        if (TextUtils.isEmpty(str2)) {
                        }
                        zzpd.zzc();
                        if (K().t(null, s701.h0)) {
                            zzt.zzah(str);
                        }
                        if (j12 == -2147483648L) {
                        }
                        j5 = j11;
                        zzt.zzV(j5);
                        if (TextUtils.isEmpty(str13)) {
                        }
                        exc0.i(str16);
                        zzt.zzL(L(str16).c(xwz0.b(str10)).e());
                        if (zzt.zzaq().isEmpty()) {
                            zzt.zzC(str12);
                        }
                        if (j10 == 0) {
                        }
                        zzt.zzP(j9);
                        I(sj01Var);
                        b2 = s701.b(sj01Var.e.m.c());
                        if (b2 == null) {
                        }
                        j7 = j6;
                        j8 = j5;
                        arrayList = null;
                        if (arrayList != null) {
                        }
                        c = L(str16).c(xwz0.b(str10));
                        zzahVar = zzah.AD_STORAGE;
                        if (c.f(zzahVar)) {
                        }
                        mb01Var.n().m();
                        zzt.zzN(Build.MODEL);
                        mb01Var.n().m();
                        zzt.zzY(Build.VERSION.RELEASE);
                        zzt.zzaj((int) mb01Var.n().p());
                        zzt.zzan(mb01Var.n().q());
                        if (mb01Var.b()) {
                        }
                        ayz0 ayz0Var17 = this.d;
                        I(ayz0Var17);
                        D = ayz0Var17.D(str16);
                        if (D == null) {
                        }
                        if (c.f(zzah.ANALYTICS_STORAGE)) {
                        }
                        if (!TextUtils.isEmpty(D.I())) {
                        }
                        ayz0 ayz0Var18 = this.d;
                        I(ayz0Var18);
                        M = ayz0Var18.M(str16);
                        while (i < M.size()) {
                        }
                        ayz0Var2 = this.d;
                        I(ayz0Var2);
                        zzgdVar = (zzgd) zzt.zzaC();
                        ayz0Var2.k();
                        ayz0Var2.l();
                        exc0.i(zzgdVar);
                        exc0.f(zzgdVar.zzx());
                        byte[] zzbu = zzgdVar.zzbu();
                        sj01 sj01Var2 = ayz0Var2.e.h;
                        I(sj01Var2);
                        long y2 = sj01Var2.y(zzbu);
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", zzgdVar.zzx());
                        contentValues2.put("metadata_fingerprint", Long.valueOf(y2));
                        contentValues2.put("metadata", zzbu);
                        ayz0Var2.C().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                        ayz0Var3 = this.d;
                        I(ayz0Var3);
                        it = dzz0Var.f.b.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                            str8 = str9;
                        }
                        i2 = 1;
                        ayz0Var3.k();
                        ayz0Var3.l();
                        exc0.f(dzz0Var.a);
                        sj01 sj01Var3 = ayz0Var3.e.h;
                        I(sj01Var3);
                        byte[] zzbu2 = sj01Var3.C(dzz0Var).zzbu();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", dzz0Var.a);
                        contentValues.put("name", dzz0Var.b);
                        contentValues.put("timestamp", Long.valueOf(dzz0Var.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(y2));
                        contentValues.put("data", zzbu2);
                        contentValues.put("realtime", Integer.valueOf(i2));
                        try {
                            if (ayz0Var3.C().insert("raw_events", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e3) {
                            ((mb01) ayz0Var3.b).e().o().c("Error storing raw event. appId", k901.r(dzz0Var.a), e3);
                        }
                        ayz0 ayz0Var19 = this.d;
                        I(ayz0Var19);
                        ayz0Var19.p();
                        ayz0 ayz0Var20 = this.d;
                        I(ayz0Var20);
                        ayz0Var20.P();
                        D();
                        e().p().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    }
                    if (j3 > 0) {
                        e().q().c("Data lost. Too many events stored on disk, deleted. appId", k901.r(str20), Long.valueOf(j3));
                    }
                    dzz0 dzz0Var22 = new dzz0(this.m, a.d, str20, a.b, a.e, i3);
                    String str212 = dzz0Var22.b;
                    ayz0 ayz0Var152 = this.d;
                    I(ayz0Var152);
                    G2 = ayz0Var152.G(str20, str212);
                    if (G2 != null) {
                        ayz0 ayz0Var21 = this.d;
                        I(ayz0Var21);
                        long B = ayz0Var21.B(str20);
                        K().getClass();
                        r701 r701Var = s701.H;
                        if (B >= Math.max(Math.min(r5.o(str20, r701Var), 2000), 500) && U) {
                            i901 o2 = e().o();
                            j901 r = k901.r(str20);
                            String d = mb01Var.q().d(str212);
                            kwz0 K2 = K();
                            K2.getClass();
                            o2.d("Too many event names used, ignoring event. appId, name, supported count", r, d, Integer.valueOf(Math.max(Math.min(K2.o(str20, r701Var), 2000), 500)));
                            Q();
                            sk01.z(robVar2, str20, 8, null, null, 0);
                            ayz0 ayz0Var22 = this.d;
                            I(ayz0Var22);
                            ayz0Var22.P();
                            return;
                        }
                        b = new kzz0(str20, dzz0Var22.b, 0L, 0L, 0L, dzz0Var22.d, 0L, null, null, null, null);
                    } else {
                        dzz0Var22 = dzz0Var22.a(mb01Var, G2.f);
                        b = G2.b(dzz0Var22.d);
                    }
                    dzz0Var = dzz0Var22;
                    kzz0 kzz0Var2 = b;
                    ayz0 ayz0Var162 = this.d;
                    I(ayz0Var162);
                    ayz0Var162.r(kzz0Var2);
                    d().k();
                    b();
                    exc0.f(dzz0Var.a);
                    exc0.b(dzz0Var.a.equals(str16));
                    zzt = zzgd.zzt();
                    zzt.zzad(1);
                    zzt.zzZ("android");
                    if (!TextUtils.isEmpty(str16)) {
                        zzt.zzD(str16);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str5 = str3;
                        zzt.zzF(str5);
                    } else {
                        str5 = str3;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str6 = str2;
                        zzt.zzG(str6);
                    } else {
                        str6 = str2;
                    }
                    zzpd.zzc();
                    if (K().t(null, s701.h0) && K().t(str16, s701.j0) && !TextUtils.isEmpty(str)) {
                        zzt.zzah(str);
                    }
                    if (j12 == -2147483648L) {
                        j4 = j12;
                        zzt.zzH((int) j4);
                    } else {
                        j4 = j12;
                    }
                    j5 = j11;
                    zzt.zzV(j5);
                    if (TextUtils.isEmpty(str13)) {
                        str7 = str13;
                        zzt.zzU(str7);
                    } else {
                        str7 = str13;
                    }
                    exc0.i(str16);
                    zzt.zzL(L(str16).c(xwz0.b(str10)).e());
                    if (zzt.zzaq().isEmpty() && !TextUtils.isEmpty(str12)) {
                        zzt.zzC(str12);
                    }
                    if (j10 == 0) {
                        str8 = "_r";
                        j6 = j10;
                        zzt.zzM(j6);
                    } else {
                        str8 = "_r";
                        j6 = j10;
                    }
                    zzt.zzP(j9);
                    I(sj01Var);
                    b2 = s701.b(sj01Var.e.m.c());
                    try {
                        if (b2 == null && !b2.isEmpty()) {
                            arrayList = new ArrayList();
                            j7 = j6;
                            int intValue3 = ((Integer) s701.P.a(null)).intValue();
                            Iterator it3 = b2.entrySet().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j8 = j5;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it3.next();
                                Iterator it4 = it3;
                                j8 = j5;
                                if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                    try {
                                        int parseInt = Integer.parseInt((String) entry.getValue());
                                        if (parseInt != 0) {
                                            arrayList.add(Integer.valueOf(parseInt));
                                            if (arrayList.size() >= intValue3) {
                                                ((mb01) sj01Var.b).e().q().b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                                                break;
                                            }
                                            continue;
                                        } else {
                                            continue;
                                        }
                                    } catch (NumberFormatException e4) {
                                        ((mb01) sj01Var.b).e().q().b(e4, "Experiment ID NumberFormatException");
                                    }
                                }
                                it3 = it4;
                                j5 = j8;
                            }
                            if (arrayList.isEmpty()) {
                            }
                            if (arrayList != null) {
                                zzt.zzh(arrayList);
                            }
                            c = L(str16).c(xwz0.b(str10));
                            zzahVar = zzah.AD_STORAGE;
                            if (c.f(zzahVar) && z2) {
                                ai01 ai01Var = this.j;
                                ai01Var.getClass();
                                o = !c.f(zzahVar) ? ai01Var.o(str16) : new Pair("", Boolean.FALSE);
                                if (!TextUtils.isEmpty((CharSequence) o.first) && z2) {
                                    zzt.zzae((String) o.first);
                                    obj = o.second;
                                    if (obj != null) {
                                        zzt.zzX(((Boolean) obj).booleanValue());
                                    }
                                }
                            }
                            mb01Var.n().m();
                            zzt.zzN(Build.MODEL);
                            mb01Var.n().m();
                            zzt.zzY(Build.VERSION.RELEASE);
                            zzt.zzaj((int) mb01Var.n().p());
                            zzt.zzan(mb01Var.n().q());
                            if (mb01Var.b()) {
                                zzt.zzap();
                                if (!TextUtils.isEmpty(null)) {
                                    zzt.zzO(null);
                                }
                            }
                            ayz0 ayz0Var172 = this.d;
                            I(ayz0Var172);
                            D = ayz0Var172.D(str16);
                            if (D == null) {
                                D = new qd01(mb01Var, str16);
                                D.c(R(c));
                                D.q(zzqVar.l);
                                D.r(str7);
                                if (c.f(zzahVar)) {
                                    D.y(this.j.p(str16, z2));
                                }
                                D.v(0L);
                                D.w(0L);
                                D.u(0L);
                                D.e(str6);
                                D.f(j4);
                                D.d(str5);
                                D.s(j8);
                                D.n(j7);
                                D.x(z);
                                D.o(j9);
                                ayz0 ayz0Var23 = this.d;
                                I(ayz0Var23);
                                ayz0Var23.q(D);
                            }
                            if (c.f(zzah.ANALYTICS_STORAGE) && !TextUtils.isEmpty(D.G())) {
                                String G3 = D.G();
                                exc0.i(G3);
                                zzt.zzE(G3);
                            }
                            if (!TextUtils.isEmpty(D.I())) {
                                String I = D.I();
                                exc0.i(I);
                                zzt.zzT(I);
                            }
                            ayz0 ayz0Var182 = this.d;
                            I(ayz0Var182);
                            M = ayz0Var182.M(str16);
                            for (i = 0; i < M.size(); i++) {
                                zzgl zzd = zzgm.zzd();
                                zzd.zzf(((uj01) M.get(i)).c);
                                zzd.zzg(((uj01) M.get(i)).d);
                                I(sj01Var);
                                sj01Var.K(zzd, ((uj01) M.get(i)).e);
                                zzt.zzl(zzd);
                            }
                            ayz0Var2 = this.d;
                            I(ayz0Var2);
                            zzgdVar = (zzgd) zzt.zzaC();
                            ayz0Var2.k();
                            ayz0Var2.l();
                            exc0.i(zzgdVar);
                            exc0.f(zzgdVar.zzx());
                            byte[] zzbu3 = zzgdVar.zzbu();
                            sj01 sj01Var22 = ayz0Var2.e.h;
                            I(sj01Var22);
                            long y22 = sj01Var22.y(zzbu3);
                            ContentValues contentValues22 = new ContentValues();
                            contentValues22.put("app_id", zzgdVar.zzx());
                            contentValues22.put("metadata_fingerprint", Long.valueOf(y22));
                            contentValues22.put("metadata", zzbu3);
                            ayz0Var2.C().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                            ayz0Var3 = this.d;
                            I(ayz0Var3);
                            it = dzz0Var.f.b.keySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    str9 = str8;
                                    if (str9.equals(it.next())) {
                                        break;
                                    } else {
                                        str8 = str9;
                                    }
                                } else {
                                    I(fb01Var);
                                    boolean x = fb01Var.x(dzz0Var.a, dzz0Var.b);
                                    ayz0 ayz0Var24 = this.d;
                                    I(ayz0Var24);
                                    kxz0 F2 = ayz0Var24.F(w(), dzz0Var.a, 1L, false, false, false, false, false);
                                    if (!x || F2.e >= K().o(dzz0Var.a, s701.p)) {
                                        i2 = 0;
                                    }
                                }
                            }
                            i2 = 1;
                            ayz0Var3.k();
                            ayz0Var3.l();
                            exc0.f(dzz0Var.a);
                            sj01 sj01Var32 = ayz0Var3.e.h;
                            I(sj01Var32);
                            byte[] zzbu22 = sj01Var32.C(dzz0Var).zzbu();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", dzz0Var.a);
                            contentValues.put("name", dzz0Var.b);
                            contentValues.put("timestamp", Long.valueOf(dzz0Var.d));
                            contentValues.put("metadata_fingerprint", Long.valueOf(y22));
                            contentValues.put("data", zzbu22);
                            contentValues.put("realtime", Integer.valueOf(i2));
                            if (ayz0Var3.C().insert("raw_events", null, contentValues) == -1) {
                                ((mb01) ayz0Var3.b).e().o().b(k901.r(dzz0Var.a), "Failed to insert raw event (got -1). appId");
                            } else {
                                this.p = 0L;
                            }
                            ayz0 ayz0Var192 = this.d;
                            I(ayz0Var192);
                            ayz0Var192.p();
                            ayz0 ayz0Var202 = this.d;
                            I(ayz0Var202);
                            ayz0Var202.P();
                            D();
                            e().p().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                            return;
                        }
                        j7 = j6;
                        j8 = j5;
                        ayz0Var2.C().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                        ayz0Var3 = this.d;
                        I(ayz0Var3);
                        it = dzz0Var.f.b.keySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                            str8 = str9;
                        }
                        i2 = 1;
                        ayz0Var3.k();
                        ayz0Var3.l();
                        exc0.f(dzz0Var.a);
                        sj01 sj01Var322 = ayz0Var3.e.h;
                        I(sj01Var322);
                        byte[] zzbu222 = sj01Var322.C(dzz0Var).zzbu();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", dzz0Var.a);
                        contentValues.put("name", dzz0Var.b);
                        contentValues.put("timestamp", Long.valueOf(dzz0Var.d));
                        contentValues.put("metadata_fingerprint", Long.valueOf(y22));
                        contentValues.put("data", zzbu222);
                        contentValues.put("realtime", Integer.valueOf(i2));
                        if (ayz0Var3.C().insert("raw_events", null, contentValues) == -1) {
                        }
                        ayz0 ayz0Var1922 = this.d;
                        I(ayz0Var1922);
                        ayz0Var1922.p();
                        ayz0 ayz0Var2022 = this.d;
                        I(ayz0Var2022);
                        ayz0Var2022.P();
                        D();
                        e().p().b(Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000), "Background event processing time, ms");
                        return;
                    } catch (SQLiteException e5) {
                        ((mb01) ayz0Var2.b).e().o().c("Error storing raw event metadata. appId", k901.r(zzgdVar.zzx()), e5);
                        throw e5;
                    }
                    arrayList = null;
                    if (arrayList != null) {
                    }
                    c = L(str16).c(xwz0.b(str10));
                    zzahVar = zzah.AD_STORAGE;
                    if (c.f(zzahVar)) {
                        ai01 ai01Var2 = this.j;
                        ai01Var2.getClass();
                        if (!c.f(zzahVar)) {
                        }
                        if (!TextUtils.isEmpty((CharSequence) o.first)) {
                            zzt.zzae((String) o.first);
                            obj = o.second;
                            if (obj != null) {
                            }
                        }
                    }
                    mb01Var.n().m();
                    zzt.zzN(Build.MODEL);
                    mb01Var.n().m();
                    zzt.zzY(Build.VERSION.RELEASE);
                    zzt.zzaj((int) mb01Var.n().p());
                    zzt.zzan(mb01Var.n().q());
                    if (mb01Var.b()) {
                    }
                    ayz0 ayz0Var1722 = this.d;
                    I(ayz0Var1722);
                    D = ayz0Var1722.D(str16);
                    if (D == null) {
                    }
                    if (c.f(zzah.ANALYTICS_STORAGE)) {
                        String G32 = D.G();
                        exc0.i(G32);
                        zzt.zzE(G32);
                    }
                    if (!TextUtils.isEmpty(D.I())) {
                    }
                    ayz0 ayz0Var1822 = this.d;
                    I(ayz0Var1822);
                    M = ayz0Var1822.M(str16);
                    while (i < M.size()) {
                    }
                    ayz0Var2 = this.d;
                    I(ayz0Var2);
                    zzgdVar = (zzgd) zzt.zzaC();
                    ayz0Var2.k();
                    ayz0Var2.l();
                    exc0.i(zzgdVar);
                    exc0.f(zzgdVar.zzx());
                    byte[] zzbu32 = zzgdVar.zzbu();
                    sj01 sj01Var222 = ayz0Var2.e.h;
                    I(sj01Var222);
                    long y222 = sj01Var222.y(zzbu32);
                    ContentValues contentValues222 = new ContentValues();
                    contentValues222.put("app_id", zzgdVar.zzx());
                    contentValues222.put("metadata_fingerprint", Long.valueOf(y222));
                    contentValues222.put("metadata", zzbu32);
                }
            }
            String l = zzauVar.l();
            Bundle bundle = zzauVar.b;
            str2 = str14;
            if (z4) {
                double doubleValue = zzauVar.j().doubleValue() * 1000000.0d;
                if (doubleValue == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                    str3 = str15;
                    doubleValue = bundle.getLong("value") * 1000000.0d;
                } else {
                    str3 = str15;
                }
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                    e().q().c("Data lost. Currency value is too big. appId", k901.r(str17), Double.valueOf(doubleValue));
                    ayz0 ayz0Var25 = this.d;
                    I(ayz0Var25);
                    ayz0Var25.p();
                    ayz0 ayz0Var26 = this.d;
                    I(ayz0Var26);
                    ayz0Var26.P();
                    return;
                }
                j = Math.round(doubleValue);
                if ("refund".equals(str19)) {
                    j = -j;
                }
            } else {
                str3 = str15;
                j = bundle.getLong("value");
            }
            if (!TextUtils.isEmpty(l)) {
                String upperCase = l.toUpperCase(Locale.US);
                if (upperCase.matches("[A-Z]{3}")) {
                    String concat = "_ltv_".concat(upperCase);
                    ayz0 ayz0Var27 = this.d;
                    I(ayz0Var27);
                    uj01 H2 = ayz0Var27.H(str17, concat);
                    if (H2 != null) {
                        Object obj2 = H2.e;
                        if (obj2 instanceof Long) {
                            uj01Var = new uj01(str17, a.d, concat, ((jcl) f()).currentTimeMillis(), Long.valueOf(((Long) obj2).longValue() + j));
                            str4 = str17;
                            uj01Var2 = uj01Var;
                            ayz0Var = this.d;
                            I(ayz0Var);
                            if (!ayz0Var.u(uj01Var2)) {
                                e().o().d("Too many unique user properties are set. Ignoring user property. appId", k901.r(str4), mb01Var.q().f(uj01Var2.c), uj01Var2.e);
                                Q();
                                sk01.z(robVar3, str4, 9, null, null, 0);
                                robVar = robVar3;
                                boolean U2 = sk01.U(str19);
                                boolean equals2 = "_err".equals(str19);
                                Q();
                                if (zzauVar == null) {
                                }
                                ayz0 ayz0Var62 = this.d;
                                I(ayz0Var62);
                                String str202 = str4;
                                kxz0 F3 = ayz0Var62.F(w(), str202, j2 + 1, true, U2, false, equals2, false);
                                long j142 = F3.b;
                                K();
                                intValue = j142 - ((Integer) s701.l.a(null)).intValue();
                                if (intValue > 0) {
                                }
                            }
                            robVar = robVar3;
                            boolean U22 = sk01.U(str19);
                            boolean equals22 = "_err".equals(str19);
                            Q();
                            if (zzauVar == null) {
                            }
                            ayz0 ayz0Var622 = this.d;
                            I(ayz0Var622);
                            String str2022 = str4;
                            kxz0 F32 = ayz0Var622.F(w(), str2022, j2 + 1, true, U22, false, equals22, false);
                            long j1422 = F32.b;
                            K();
                            intValue = j1422 - ((Integer) s701.l.a(null)).intValue();
                            if (intValue > 0) {
                            }
                        }
                    }
                    ayz0 ayz0Var28 = this.d;
                    I(ayz0Var28);
                    int o3 = K().o(str17, s701.E) - 1;
                    exc0.f(str17);
                    ayz0Var28.k();
                    ayz0Var28.l();
                    ayz0Var28.C().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str17, str17, String.valueOf(o3)});
                    str4 = str17;
                    uj01Var = new uj01(str4, a.d, concat, ((jcl) f()).currentTimeMillis(), Long.valueOf(j));
                    uj01Var2 = uj01Var;
                    ayz0Var = this.d;
                    I(ayz0Var);
                    if (!ayz0Var.u(uj01Var2)) {
                    }
                    robVar = robVar3;
                    boolean U222 = sk01.U(str19);
                    boolean equals222 = "_err".equals(str19);
                    Q();
                    if (zzauVar == null) {
                    }
                    ayz0 ayz0Var6222 = this.d;
                    I(ayz0Var6222);
                    String str20222 = str4;
                    kxz0 F322 = ayz0Var6222.F(w(), str20222, j2 + 1, true, U222, false, equals222, false);
                    long j14222 = F322.b;
                    K();
                    intValue = j14222 - ((Integer) s701.l.a(null)).intValue();
                    if (intValue > 0) {
                    }
                }
            }
            str4 = str17;
            robVar = robVar3;
            boolean U2222 = sk01.U(str19);
            boolean equals2222 = "_err".equals(str19);
            Q();
            if (zzauVar == null) {
            }
            ayz0 ayz0Var62222 = this.d;
            I(ayz0Var62222);
            String str202222 = str4;
            kxz0 F3222 = ayz0Var62222.F(w(), str202222, j2 + 1, true, U2222, false, equals2222, false);
            long j142222 = F3222.b;
            K();
            intValue = j142222 - ((Integer) s701.l.a(null)).intValue();
            if (intValue > 0) {
            }
        } catch (Throwable th) {
            ayz0 ayz0Var29 = this.d;
            I(ayz0Var29);
            ayz0Var29.P();
            throw th;
        }
    }

    public final long w() {
        ((jcl) f()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ai01 ai01Var = this.j;
        ai01Var.l();
        ai01Var.k();
        u901 u901Var = ai01Var.l;
        long a = u901Var.a();
        if (a == 0) {
            mb01.i(((mb01) ai01Var.b).m);
            a = r2.s().nextInt(86400000) + 1;
            u901Var.b(a);
        }
        return ((((currentTimeMillis + a) / 1000) / 60) / 60) / 24;
    }

    public final com.google.android.gms.measurement.internal.zzq z(String str) {
        ayz0 ayz0Var = this.d;
        I(ayz0Var);
        qd01 D = ayz0Var.D(str);
        if (D != null) {
            mb01 mb01Var = D.a;
            if (!TextUtils.isEmpty(D.H())) {
                Boolean A = A(D);
                if (A != null && !A.booleanValue()) {
                    e().i.b(k901.r(str), "App version does not match; dropping. appId");
                    return null;
                }
                String J = D.J();
                String H = D.H();
                long B = D.B();
                kb01 kb01Var = mb01Var.k;
                mb01.k(kb01Var);
                kb01Var.k();
                String str2 = D.l;
                kb01 kb01Var2 = mb01Var.k;
                mb01.k(kb01Var2);
                kb01Var2.k();
                long j = D.m;
                kb01 kb01Var3 = mb01Var.k;
                mb01.k(kb01Var3);
                kb01Var3.k();
                long j2 = D.n;
                kb01 kb01Var4 = mb01Var.k;
                mb01.k(kb01Var4);
                kb01Var4.k();
                boolean z = D.o;
                String I = D.I();
                kb01 kb01Var5 = mb01Var.k;
                mb01.k(kb01Var5);
                kb01Var5.k();
                boolean A2 = D.A();
                String D2 = D.D();
                kb01 kb01Var6 = mb01Var.k;
                mb01.k(kb01Var6);
                kb01Var6.k();
                Boolean bool = D.r;
                long C = D.C();
                kb01 kb01Var7 = mb01Var.k;
                mb01.k(kb01Var7);
                kb01Var7.k();
                return new com.google.android.gms.measurement.internal.zzq(str, J, H, B, str2, j, j2, null, z, false, I, 0L, 0, A2, false, D2, bool, C, D.t, L(str).e(), "", null);
            }
        }
        e().p.b(str, "No app data available; dropping");
        return null;
    }
}
