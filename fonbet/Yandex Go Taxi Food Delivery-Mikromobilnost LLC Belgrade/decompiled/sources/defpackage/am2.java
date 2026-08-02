package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.StartupException;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.firebase.encoders.EncodingException;
import flex.logger.FlexLogLevel;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class am2 implements x32, w32, uo11 {
    public static volatile am2 w;
    public static final Object x = new Object();
    public Object a;
    public Object b;
    public Object c;

    public am2(final Context context, int i) {
        switch (i) {
            case 17:
                this.a = a.a(new ku2(context, 8));
                final int i2 = 0;
                this.b = a.a(new sls(this) { // from class: xbr
                    public final /* synthetic */ am2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i3 = i2;
                        Context context2 = context;
                        am2 am2Var = this.b;
                        switch (i3) {
                            case 0:
                                ((Boolean) ((i3y) am2Var.a).getValue()).getClass();
                                kcr kcrVar = new kcr();
                                kcrVar.c("1:1087931301371:android:e59a18cd1f5e18bd429f5e");
                                kcrVar.b("AIzaSyCSKZr-iHfeClaMNXgApoP46XJQzBFy6qI");
                                kcrVar.d("1087931301371");
                                kcrVar.e("passportpushproduction");
                                com.google.firebase.a.h(kcrVar.a(), context2, "firebase_app_name_production");
                                return "firebase_app_name_production";
                            default:
                                ((Boolean) ((i3y) am2Var.a).getValue()).getClass();
                                kcr kcrVar2 = new kcr();
                                kcrVar2.c("1:410800666107:android:0553c36562588e27");
                                kcrVar2.b("AIzaSyARPFle8UJ-Q5teKfpC1VqtMKa3ezPpSss");
                                kcrVar2.d("410800666107");
                                kcrVar2.e("passporttestapplication");
                                com.google.firebase.a.h(kcrVar2.a(), context2, "firebase_app_name_testing");
                                return "firebase_app_name_testing";
                        }
                    }
                });
                final int i3 = 1;
                this.c = a.a(new sls(this) { // from class: xbr
                    public final /* synthetic */ am2 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i32 = i3;
                        Context context2 = context;
                        am2 am2Var = this.b;
                        switch (i32) {
                            case 0:
                                ((Boolean) ((i3y) am2Var.a).getValue()).getClass();
                                kcr kcrVar = new kcr();
                                kcrVar.c("1:1087931301371:android:e59a18cd1f5e18bd429f5e");
                                kcrVar.b("AIzaSyCSKZr-iHfeClaMNXgApoP46XJQzBFy6qI");
                                kcrVar.d("1087931301371");
                                kcrVar.e("passportpushproduction");
                                com.google.firebase.a.h(kcrVar.a(), context2, "firebase_app_name_production");
                                return "firebase_app_name_production";
                            default:
                                ((Boolean) ((i3y) am2Var.a).getValue()).getClass();
                                kcr kcrVar2 = new kcr();
                                kcrVar2.c("1:410800666107:android:0553c36562588e27");
                                kcrVar2.b("AIzaSyARPFle8UJ-Q5teKfpC1VqtMKa3ezPpSss");
                                kcrVar2.d("410800666107");
                                kcrVar2.e("passporttestapplication");
                                com.google.firebase.a.h(kcrVar2.a(), context2, "firebase_app_name_testing");
                                return "firebase_app_name_testing";
                        }
                    }
                });
                break;
            default:
                this.c = context.getApplicationContext();
                this.b = new HashSet();
                this.a = new HashMap();
                break;
        }
    }

    public static String d(String str, HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return g8e.p(str, "?", sb2);
        }
        if (!str.endsWith("&")) {
            sb2 = "&".concat(sb2);
        }
        return str.concat(sb2);
    }

    public static am2 j(Context context) {
        if (w == null) {
            synchronized (x) {
                try {
                    if (w == null) {
                        w = new am2(context, 1);
                    }
                } finally {
                }
            }
        }
        return w;
    }

    @Override // defpackage.uo11
    public void a(Map map) {
        jb7 jb7Var = (jb7) this.c;
        if (map == null) {
            ((jb7) jb7Var.b).c();
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sbx sbxVar = (sbx) this.b;
        k8u k8uVar = (k8u) this.a;
        qdx qdxVar = new qdx(byteArrayOutputStream);
        byte[] bArr = (byte[]) qdxVar.w;
        try {
            s8o.k(sbxVar, qdxVar, k8uVar, map);
            qdxVar.n();
            ui9.c.a((char[]) qdxVar.x);
            n67.c.a(bArr);
            jb7Var.w(byteArrayOutputStream.toByteArray());
        } catch (Throwable th) {
            qdxVar.n();
            ui9.c.a((char[]) qdxVar.x);
            n67.c.a(bArr);
            throw th;
        }
    }

    public ii1 b() {
        va90 va90Var;
        ni1 ni1Var = (ni1) this.a;
        if (ni1Var == null || (va90Var = (va90) this.b) == null) {
            ny61.g("Cannot build without parameters and/or key material");
            return null;
        }
        if (ni1Var.a != ((u77) va90Var.a).a.length) {
            kbs.v("Key size mismatch");
            return null;
        }
        mi1 mi1Var = ni1Var.b;
        mi1 mi1Var2 = mi1.d;
        if (mi1Var != mi1Var2 && ((Integer) this.c) == null) {
            kbs.v("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (mi1Var == mi1Var2 && ((Integer) this.c) != null) {
            kbs.v("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (mi1Var == mi1Var2) {
            u77.a(new byte[0]);
        } else if (mi1Var == mi1.c) {
            u77.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.c).intValue()).array());
        } else {
            if (mi1Var != mi1.b) {
                yci0.t(((ni1) this.a).b, "Unknown AesSivParameters.Variant: ");
                return null;
            }
            u77.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.c).intValue()).array());
        }
        return new ii1();
    }

    @Override // defpackage.w32
    public void c(Bundle bundle) {
        synchronized (this.b) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.c = new CountDownLatch(1);
            ((cot) this.a).c(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.c).await(500L, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.c = null;
        }
    }

    public void e(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(fxh0.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (xwv.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    f((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public Object f(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.a;
        if (jzz0.a()) {
            try {
                Trace.beginSection(ffx.f0(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                xwv xwvVar = (xwv) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> dependencies = xwvVar.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class cls2 : dependencies) {
                        if (!hashMap.containsKey(cls2)) {
                            f(cls2, hashSet);
                        }
                    }
                }
                obj = xwvVar.create((Context) this.c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return obj;
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.a;
        kvf0 kvf0Var = new kvf0(byteArrayOutputStream, hashMap, (HashMap) this.b, (ip60) this.c);
        if (obj == null) {
            return;
        }
        ip60 ip60Var = (ip60) hashMap.get(obj.getClass());
        if (ip60Var != null) {
            ip60Var.a(obj, kvf0Var);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public ms5 h() {
        HttpsURLConnection httpsURLConnection;
        com.google.firebase.crashlytics.internal.concurrency.a.b();
        InputStream inputStream = null;
        String sb = null;
        inputStream = null;
        try {
            String d = d((String) this.a, (HashMap) this.b);
            Log.isLoggable("FirebaseCrashlytics", 2);
            httpsURLConnection = (HttpsURLConnection) new URL(d).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.c).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int read = bufferedReader.read(cArr);
                            if (read == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, read);
                        }
                        sb = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                ms5 ms5Var = new ms5();
                ms5Var.a = responseCode;
                ms5Var.b = sb;
                return ms5Var;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public synchronized Object i(Object obj) {
        Map p;
        p = p();
        return p != null ? p.get(obj) : null;
    }

    public void k(String str, String str2) {
        ((HashMap) this.c).put(str, str2);
    }

    public Object l() {
        Object obj;
        synchronized (x) {
            try {
                obj = ((HashMap) this.a).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = f(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.uo11
    public Object load() {
        BufferedInputStream o = ((jb7) this.c).o();
        if (o == null) {
            return null;
        }
        return ffx.A((sbx) this.b, (k8u) this.a, o);
    }

    public boolean m(zzs zzsVar, String str) {
        boolean z = false;
        if (!jl40.l(str, (String) this.c)) {
            return false;
        }
        double d = srb1.d(zzsVar, (zzs) this.b);
        x1k c = ((xpo) this.a).getC();
        long j = c == null ? 0L : c.a;
        if (c != null && d < j) {
            z = true;
        }
        unr0.C(new Object[]{z ? "hit" : "miss", Double.valueOf(d), Long.valueOf(j)}, 3, "Cache %s: distance=%f, radius=%d", jst.e);
        return z;
    }

    public synchronized void n(Object obj, Object obj2) {
        try {
            Map p = p();
            if (p == null) {
                p = new LinkedHashMap();
            }
            if (obj2 != null) {
                p.put(obj, obj2);
            } else {
                p.remove(obj);
            }
            q(p);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void o(v111 v111Var, int i, boolean z) {
        SchedulerConfig schedulerConfig = (SchedulerConfig) this.c;
        Context context = (Context) this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(v111Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(i3f0.a(v111Var.d())).array());
        if (v111Var.c() != null) {
            adler32.update(v111Var.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        rzo.o("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", v111Var);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((b) ((ugo) this.b)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{v111Var.b(), String.valueOf(i3f0.a(v111Var.d()))});
        try {
            Cursor cursor = rawQuery;
            Long valueOf = cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            Priority d = v111Var.d();
            builder.setMinimumLatency(schedulerConfig.b(d, longValue, i));
            Set b = ((SchedulerConfig.b) schedulerConfig.c().get(d)).b();
            if (b.contains(SchedulerConfig.Flag.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (b.contains(SchedulerConfig.Flag.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (b.contains(SchedulerConfig.Flag.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", v111Var.b());
            persistableBundle.putInt("priority", i3f0.a(v111Var.d()));
            if (v111Var.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(v111Var.c(), 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {v111Var, Integer.valueOf(value), Long.valueOf(schedulerConfig.b(v111Var.d(), longValue, i)), valueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.x32
    public void onEvent(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public Map p() {
        StackTraceElement stackTraceElement;
        String str;
        uo11 uo11Var = (uo11) this.a;
        if (((Map) this.b) == null) {
            Map map = null;
            try {
                Map map2 = (Map) uo11Var.load();
                if (map2 != null) {
                    map = Collections.synchronizedMap(new LinkedHashMap(map2));
                }
            } catch (Throwable unused) {
                zjr zjrVar = (zjr) this.c;
                i3y a = xfz.a(new Pair("storageType", uo11Var.getClass().getSimpleName()));
                s7s0 s7s0Var = zjrVar.c.a;
                boolean booleanValue = Boolean.FALSE.booleanValue();
                tjr tjrVar = tjr.d;
                if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                    String fileName = stackTraceElement.getFileName();
                    if (fileName == null) {
                        fileName = "No file info";
                    }
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    Integer valueOf = Integer.valueOf(lineNumber);
                    if (lineNumber <= 0) {
                        valueOf = null;
                    }
                    if (valueOf == null || (str = valueOf.toString()) == null) {
                        str = "No line info";
                    }
                    tjrVar = new tjr(fileName, methodName, str);
                }
                zjrVar.d(FlexLogLevel.DEBUG, "An error occurred while loading content from storage", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
            }
            this.b = map;
        }
        return (Map) this.b;
    }

    public void q(Map map) {
        StackTraceElement stackTraceElement;
        String str;
        uo11 uo11Var = (uo11) this.a;
        try {
            uo11Var.a(map);
        } catch (Throwable unused) {
            zjr zjrVar = (zjr) this.c;
            i3y a = xfz.a(new Pair("storageType", uo11Var.getClass().getSimpleName()));
            s7s0 s7s0Var = zjrVar.c.a;
            boolean booleanValue = Boolean.FALSE.booleanValue();
            tjr tjrVar = tjr.d;
            if (booleanValue && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                String fileName = stackTraceElement.getFileName();
                if (fileName == null) {
                    fileName = "No file info";
                }
                String methodName = stackTraceElement.getMethodName();
                int lineNumber = stackTraceElement.getLineNumber();
                Integer valueOf = Integer.valueOf(lineNumber);
                if (lineNumber <= 0) {
                    valueOf = null;
                }
                if (valueOf == null || (str = valueOf.toString()) == null) {
                    str = "No line info";
                }
                tjrVar = new tjr(fileName, methodName, str);
            }
            zjrVar.d(FlexLogLevel.DEBUG, "An error occurred while saving to storage", a, EmptyList.a, tjrVar.a, tjrVar.b, tjrVar.c);
        }
    }

    public am2(uo11 uo11Var) {
        this.a = uo11Var;
        this.c = new zjr(xfz.b(am2.class.getSimpleName()));
    }

    public /* synthetic */ am2(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
