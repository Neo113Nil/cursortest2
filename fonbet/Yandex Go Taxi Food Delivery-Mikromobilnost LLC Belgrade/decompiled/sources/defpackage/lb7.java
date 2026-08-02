package defpackage;

import android.R;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.media3.database.DatabaseIOException;
import coil3.graphics.EnumC0136DataSource;
import com.yandex.go.network_metrics.Status;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TechEvents$TechDeviceIdSaveBackupResult;
import com.ybsdk.core.common.utils.preferences.LazySharedPreferences;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCP.JCP;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.layers.source.requesttrigger.CameraChangeSource$listenToCameraChange$$inlined$simpleCallbackApiToFlow$1;
import ru.yandex.taxi.logistics.sdk.network.b;

/* loaded from: classes.dex */
public final class lb7 implements ag7, jk7, yf90, ey31, ctq0, pd90, eev, rzl, zme {
    public static final String[] w = {"name", "length", "last_touch_timestamp"};
    public static final rms x = new rms(4);
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public lb7(Context context, int i) {
        Set<String> stringSet;
        this.a = i;
        lne lneVar = null;
        switch (i) {
            case 10:
                SharedPreferences sharedPreferences = context.getSharedPreferences("authorization_cookie_store", 0);
                this.b = sharedPreferences;
                String string = sharedPreferences.getString("cookies_uri", null);
                if (string != null && (stringSet = sharedPreferences.getStringSet("cookies_names", null)) != null) {
                    lneVar = new lne(string, stringSet);
                }
                this.c = bvf0.c(lneVar);
                break;
            case 28:
                this.b = context;
                this.c = null;
                break;
            default:
                this.b = context;
                this.c = new LazySharedPreferences(new d9(15, this));
                break;
        }
    }

    public static lb7 j(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e) {
                e = e;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e2) {
            e = e2;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new lb7(23, fileChannel, fileLock);
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        }
    }

    public void A(long j, long j2, String str) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((lqg) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void B(lne lneVar) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (lneVar != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.putString("cookies_uri", lneVar.b());
            edit.putStringSet("cookies_names", lneVar.a());
            edit.apply();
        } else {
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.clear();
            edit2.apply();
        }
        ((r0) this.c).l(lneVar);
    }

    @Override // defpackage.yf90
    public eg90 a() {
        return (dg90) this.c;
    }

    @Override // defpackage.yf90
    public ofy0 b() {
        return (rms) this.b;
    }

    @Override // defpackage.eev
    public void d(m9o m9oVar) {
        ((f16) this.b).onError(m9oVar.c);
    }

    @Override // defpackage.jk7
    public void e(yf7 yf7Var) {
        w2j0 w2j0Var = (w2j0) ((on2) this.c).d.get();
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.Enqueue, new qda0(25));
    }

    @Override // defpackage.pd90
    public Object f(lfx lfxVar, ArrayList arrayList) {
        Object obj;
        ConcurrentHashMap concurrentHashMap;
        Object failure;
        obj = ((j0c) this.c).get(((zzb) lfxVar).a());
        nz40 nz40Var = (nz40) obj;
        Object obj2 = nz40Var.a.get();
        if (obj2 == null) {
            i0c i0cVar = new i0c();
            synchronized (nz40Var) {
                Object obj3 = nz40Var.a.get();
                if (obj3 != null) {
                    obj2 = obj3;
                } else {
                    obj2 = i0cVar.invoke();
                    nz40Var.a = new SoftReference(obj2);
                }
            }
        }
        od90 od90Var = (od90) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new pgx((mgx) it.next()));
        }
        concurrentHashMap = od90Var.a;
        Object obj4 = concurrentHashMap.get(arrayList2);
        if (obj4 == null) {
            try {
                failure = (KSerializer) ((wls) this.b).invoke(lfxVar, arrayList);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Result result = new Result(failure);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, result);
            obj4 = putIfAbsent == null ? result : putIfAbsent;
        }
        return ((Result) obj4).getValue();
    }

    @Override // defpackage.jk7
    public void g(yf7 yf7Var, kvj0 kvj0Var, long j) {
        ((ConcurrentHashMap) this.b).put(Long.valueOf(kvj0Var.E), new nn2((on2) this.c, yf7Var, kvj0Var));
    }

    @Override // defpackage.ctq0
    public KSerializer h(lfx lfxVar) {
        Object obj;
        obj = ((j0c) this.c).get(((zzb) lfxVar).a());
        nz40 nz40Var = (nz40) obj;
        Object obj2 = nz40Var.a.get();
        if (obj2 == null) {
            synchronized (nz40Var) {
                obj2 = nz40Var.a.get();
                if (obj2 == null) {
                    obj2 = new gb7((KSerializer) ((tls) this.b).invoke(lfxVar));
                    nz40Var.a = new SoftReference(obj2);
                }
            }
        }
        return ((gb7) obj2).a;
    }

    @Override // defpackage.eev
    public void k(t3v0 t3v0Var) {
        f16 f16Var = (f16) this.c;
        q7v q7vVar = t3v0Var.a;
        EnumC0136DataSource enumC0136DataSource = t3v0Var.c;
        if (q7vVar instanceof sac) {
            sac sacVar = (sac) q7vVar;
            f16Var.b(sacVar.a.a, sacVar.b, vac.b(enumC0136DataSource));
        } else if (q7vVar instanceof w06) {
            f16Var.b(((w06) q7vVar).a, null, vac.b(enumC0136DataSource));
        } else {
            f16Var.onError(new IllegalStateException("Loaded image is not Bitmap!"));
        }
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        switch (this.a) {
            case 26:
                return ((sbx) this.c).b((myi) this.b, ((rvj0) obj).string());
            default:
                yo40 yo40Var = (yo40) this.c;
                myi myiVar = (myi) this.b;
                yo40Var.getClass();
                return ((sbx) ((itu0) yo40Var.a)).b(myiVar, ((rvj0) obj).string());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00bb, code lost:
    
        r11 = defpackage.ruu0.a(defpackage.wpf.p(r11.a).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x00cd, code lost:
    
        if (r11.startsWith("http://") != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d5, code lost:
    
        if (r11.startsWith("https://") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00da, code lost:
    
        r6.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00e0, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00e1, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00e9, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e5, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e6, code lost:
    
        r7.addSuppressed(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00d8, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00ea, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00f2, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ee, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ef, code lost:
    
        r7.addSuppressed(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f3, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        r6 = new java.util.ArrayList();
        r7 = r2.getExtensionValue("1.3.6.1.5.5.7.1.1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (r7 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0077, code lost:
    
        r8 = new defpackage.i2(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x007c, code lost:
    
        r9 = new defpackage.i2(((defpackage.v2) r8.k()).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0089, code lost:
    
        r7 = defpackage.om3.h(r9.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0091, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0094, code lost:
    
        if (r7 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0096, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009a, code lost:
    
        r7 = r7.a;
        r9 = r7.length;
        r10 = new defpackage.xf[r9];
        java.lang.System.arraycopy(r7, 0, r10, 0, r7.length);
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a4, code lost:
    
        if (r7 >= r9) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a6, code lost:
    
        r11 = r10[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b0, code lost:
    
        if (defpackage.xf.c.l(r11.a) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00dd, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b3, code lost:
    
        r11 = r11.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00b8, code lost:
    
        if (r11.b == 6) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b2 A[LOOP:1: B:10:0x0028->B:54:0x01b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9 A[EDGE_INSN: B:55:0x01b9->B:23:0x01b9 BREAK  A[LOOP:1: B:10:0x0028->B:54:0x01b2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X509Certificate[] m(X509Certificate[] x509CertificateArr) {
        ArrayList arrayList;
        long nanoTime;
        int i;
        X509Certificate x509Certificate;
        ArrayList arrayList2;
        X509Certificate x509Certificate2;
        String str;
        List<X509Certificate> list;
        tgz tgzVar = (tgz) this.c;
        if (x509CertificateArr.length == 0) {
            return x509CertificateArr;
        }
        arrayList = new ArrayList(x509CertificateArr.length + 2);
        for (X509Certificate x509Certificate3 : x509CertificateArr) {
            arrayList.add(x509Certificate3);
        }
        nanoTime = System.nanoTime() + 30000000000L;
        i = 0;
        loop1: while (true) {
            if (i >= 5) {
                break;
            }
            x509Certificate = (X509Certificate) unr0.k(1, arrayList);
            if (x509Certificate.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                X509Certificate x509Certificate4 = (X509Certificate) it.next();
                if (x509Certificate4.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                    try {
                        x509Certificate.verify(x509Certificate4.getPublicKey());
                        break loop1;
                    } catch (GeneralSecurityException unused) {
                        continue;
                    }
                }
            }
            arrayList.add(x509Certificate2);
            i++;
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        for (X509Certificate x509Certificate5 : list) {
            if (x509Certificate5.getSubjectX500Principal().equals(x509Certificate.getIssuerX500Principal())) {
                try {
                    x509Certificate.verify(x509Certificate5.getPublicKey());
                    x509Certificate2 = x509Certificate5;
                    if (x509Certificate2 != null) {
                        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
                    }
                    arrayList.add(x509Certificate2);
                    i++;
                } catch (GeneralSecurityException unused2) {
                    continue;
                }
            }
        }
        StringBuilder sb = new StringBuilder("No certificate from ");
        sb.append(str);
        sb.append(" issues the current top certificate");
        tgzVar.getClass();
        if (arrayList2.isEmpty()) {
            tgzVar.getClass();
            break;
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            x509Certificate2 = null;
            if (!it2.hasNext()) {
                break;
            }
            str = (String) it2.next();
            if (System.nanoTime() >= nanoTime) {
                tgzVar.getClass();
                break;
            }
            vit vitVar = (vit) this.b;
            vitVar.getClass();
            try {
                byte[] l = vitVar.l(nanoTime, 3, str);
                if (l == null) {
                    list = Collections.EMPTY_LIST;
                } else {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
                    ArrayList arrayList3 = new ArrayList();
                    for (Certificate certificate : certificateFactory.generateCertificates(new ByteArrayInputStream(l))) {
                        if (certificate instanceof X509Certificate) {
                            arrayList3.add((X509Certificate) certificate);
                        }
                    }
                    list = arrayList3;
                }
            } catch (IOException | RuntimeException | CertificateException unused3) {
                tgz tgzVar2 = (tgz) vitVar.b;
                new StringBuilder("Failed to download issuer certificate from ").append(str);
                tgzVar2.getClass();
                list = Collections.EMPTY_LIST;
            }
            while (r8.hasNext()) {
            }
            StringBuilder sb2 = new StringBuilder("No certificate from ");
            sb2.append(str);
            sb2.append(" issues the current top certificate");
            tgzVar.getClass();
        }
        if (x509Certificate2 != null) {
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        while (r8.hasNext()) {
        }
        StringBuilder sb22 = new StringBuilder("No certificate from ");
        sb22.append(str);
        sb22.append(" issues the current top certificate");
        tgzVar.getClass();
    }

    @Override // defpackage.ag7
    public Type n() {
        return (Type) this.b;
    }

    public void o() {
        String str = (String) this.c;
        try {
            q1r q1rVar = (q1r) this.b;
            q1rVar.getClass();
            new File(q1rVar.c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // defpackage.eev
    public void onCancel() {
    }

    @Override // defpackage.eev
    public void onStart() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    public ArrayList p() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        cot cotVar = (cot) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) cotVar.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Objects.toString(cls);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new c1d(0, (String) it.next()));
        }
        return arrayList2;
    }

    public HashMap q() {
        try {
            ((String) this.c).getClass();
            Cursor query = ((lqg) this.b).getReadableDatabase().query((String) this.c, w, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    string.getClass();
                    hashMap.put(string, new kb7(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ag7
    public Object r(yv60 yv60Var) {
        return new b(yv60Var, (tls) this.c);
    }

    public caj s() {
        if (((caj) this.c) == null) {
            this.c = new caj(this);
        }
        return (caj) this.c;
    }

    public void t(long j) {
        lqg lqgVar = (lqg) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (ia31.a(lqgVar.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = lqgVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    ia31.b(writableDatabase, 2, hexString);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public tpr u(long j) {
        tpr f = e.f(e.g(new CameraChangeSource$listenToCameraChange$$inlined$simpleCallbackApiToFlow$1(new d8(9, this), null)), 0, BufferOverflow.DROP_OLDEST, 1);
        if (j == 0) {
            j = 200;
        }
        ru.yandex.taxi.layers.source.requesttrigger.b bVar = new ru.yandex.taxi.layers.source.requesttrigger.b(e.p(f, j), this);
        ((tt2) this.b).getClass();
        sjh sjhVar = uyj.a;
        return e.F(bVar, o400.a);
    }

    public void v(Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            x32 x32Var = "clx".equals(bundle2.getString("_o")) ? (am2) this.b : (uj6) this.c;
            if (x32Var == null) {
                return;
            }
            x32Var.onEvent(string, bundle2);
        }
    }

    public void w() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void x(Set set) {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((lqg) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void y(long j, String str) {
        TechEvents$TechDeviceIdSaveBackupResult techEvents$TechDeviceIdSaveBackupResult;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        if (jl40.l(sharedPreferences.getString(String.format("device_id_backup_v1:%s", Arrays.copyOf(new Object[]{String.valueOf(j)}, 1)), null), str)) {
            techEvents$TechDeviceIdSaveBackupResult = TechEvents$TechDeviceIdSaveBackupResult.ALREADY_EXISTS;
        } else {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(String.format("device_id_backup_v1:%s", Arrays.copyOf(new Object[]{String.valueOf(j)}, 1)), str);
            edit.apply();
            techEvents$TechDeviceIdSaveBackupResult = TechEvents$TechDeviceIdSaveBackupResult.OK;
        }
        fcy0 fcy0Var = ((AppAnalyticsReporter) this.c).m0;
        LinkedHashMap w2 = g8e.w(2, Constants.KEY_DATA, str);
        w2.put(TarifficatorScenarioActivity.RESULT_KEY, techEvents$TechDeviceIdSaveBackupResult.getOriginalValue());
        fcy0Var.a.a("tech.device_id_save_backup", w2);
    }

    public void z(neo neoVar) {
        Iterator it = new ArrayList((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((szl) it.next()).a(neoVar, ((vxl) this.b).b.Q);
        }
    }

    public lb7(int i) {
        this.a = i;
        switch (i) {
            case 21:
                break;
            default:
                this.b = new rms(11);
                this.c = eg90.a;
                break;
        }
    }

    public lb7(vxl vxlVar, List list) {
        this.a = 20;
        this.b = vxlVar;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        this.c = arrayList;
    }

    public /* synthetic */ lb7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public lb7(final MainActivity mainActivity) {
        this.a = 19;
        ComposeView composeView = new ComposeView(mainActivity, null, 0, 6, null);
        this.b = composeView;
        composeView.setContent(new a(2008575907, new vgd(this, 0), true));
        final ViewGroup viewGroup = (ViewGroup) mainActivity.findViewById(R.id.content);
        viewGroup.post(new Runnable() { // from class: com.yandex.go.design.compose.activity.a
            @Override // java.lang.Runnable
            public final void run() {
                NoDrawContainerView noDrawContainerView = new NoDrawContainerView(mainActivity);
                noDrawContainerView.addView((ComposeView) this.b);
                viewGroup.addView(noDrawContainerView);
            }
        });
    }

    public lb7(q1r q1rVar) {
        this.a = 1;
        this.b = q1rVar;
        this.c = x;
    }

    public lb7(String str, q1r q1rVar) {
        this.a = 22;
        this.c = str;
        this.b = q1rVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lb7(q1r q1rVar, String str) {
        this(q1rVar);
        this.a = 1;
        rms rmsVar = x;
        rmsVar.f();
        this.c = rmsVar;
        if (str == null) {
            return;
        }
        this.c = new bkg0(q1rVar.c(str, "userlog"));
    }

    public lb7(tls tlsVar) {
        this.a = 15;
        this.b = tlsVar;
        this.c = new j0c();
    }

    public lb7(tgz tgzVar) {
        this.a = 3;
        this.b = new vit(22, tgzVar);
        this.c = tgzVar;
    }

    public lb7(lqg lqgVar) {
        this.a = 0;
        this.b = lqgVar;
    }

    public lb7(wls wlsVar) {
        this.a = 16;
        this.b = wlsVar;
        this.c = new j0c();
    }

    public lb7(on2 on2Var) {
        this.a = 6;
        this.c = on2Var;
        this.b = new ConcurrentHashMap();
    }
}
