package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.alq0;
import xsna.fl5;
import xsna.gl5;
import xsna.j5k;
import xsna.q5g0.a;
import xsna.sl5;
import xsna.uk5;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes.dex */
public final class tui0 {
    public final k5k a;
    public final t5k b;
    public final wvk c;
    public final g000 d;
    public final alq0 e;
    public final isv f;
    public final g6k g;

    public tui0(k5k k5kVar, t5k t5kVar, wvk wvkVar, g000 g000Var, alq0 alq0Var, isv isvVar, g6k g6kVar) {
        this.a = k5kVar;
        this.b = t5kVar;
        this.c = wvkVar;
        this.d = g000Var;
        this.e = alq0Var;
        this.f = isvVar;
        this.g = g6kVar;
    }

    public static fl5 a(fl5 fl5Var, g000 g000Var, alq0 alq0Var, Map map) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        Map unmodifiableMap3;
        j5k.e.d.a.b bVar;
        fl5.a g = fl5Var.g();
        String d = g000Var.b.d();
        if (d != null) {
            g.e = new pl5(d);
        }
        alq0.a aVar = alq0Var.d;
        if (map.isEmpty()) {
            zhy reference = aVar.a.getReference();
            synchronized (reference) {
                unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference.a));
            }
        } else {
            zhy reference2 = aVar.a.getReference();
            synchronized (reference2) {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference2.a));
            }
            HashMap hashMap = new HashMap(unmodifiableMap);
            for (Map.Entry entry : map.entrySet()) {
                String a = zhy.a(1024, (String) entry.getKey());
                if (hashMap.size() < 64 || hashMap.containsKey(a)) {
                    hashMap.put(a, zhy.a(1024, (String) entry.getValue()));
                }
            }
            unmodifiableMap2 = Collections.unmodifiableMap(hashMap);
        }
        List<j5k.c> e = e(unmodifiableMap2);
        zhy reference3 = alq0Var.e.a.getReference();
        synchronized (reference3) {
            unmodifiableMap3 = Collections.unmodifiableMap(new HashMap(reference3.a));
        }
        List<j5k.c> e2 = e(unmodifiableMap3);
        if (!e.isEmpty() || !e2.isEmpty()) {
            gl5.a h = fl5Var.c.h();
            h.b = e;
            h.c = e2;
            if (h.h != 1 || (bVar = h.a) == null) {
                StringBuilder sb = new StringBuilder();
                if (h.a == null) {
                    sb.append(" execution");
                }
                if ((h.h & 1) == 0) {
                    sb.append(" uiOrientation");
                }
                throw new IllegalStateException(t9c.b("Missing required properties:", sb));
            }
            g.c = new gl5(bVar, e, e2, h.d, h.e, h.f, h.g);
        }
        return g.a();
    }

    public static j5k.e.d b(fl5 fl5Var, alq0 alq0Var) {
        List unmodifiableList;
        slg0 slg0Var = alq0Var.f;
        synchronized (slg0Var) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(slg0Var.a));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            arrayList.add(((rlg0) unmodifiableList.get(i)).g());
        }
        if (arrayList.isEmpty()) {
            return fl5Var;
        }
        fl5.a g = fl5Var.g();
        sl5.a aVar = new sl5.a();
        aVar.b(arrayList);
        g.f = aVar.a();
        return g.a();
    }

    public static String c(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read == -1) {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static tui0 d(Context context, isv isvVar, sar sarVar, g43 g43Var, g000 g000Var, alq0 alq0Var, yl20 yl20Var, k1j0 k1j0Var, y380 y380Var, n4k n4kVar, g6k g6kVar) {
        k5k k5kVar = new k5k(context, isvVar, g43Var, yl20Var, k1j0Var);
        t5k t5kVar = new t5k(sarVar, k1j0Var, n4kVar);
        o5k o5kVar = wvk.b;
        zop0.b(context);
        return new tui0(k5kVar, t5kVar, new wvk(new q5g0(zop0.a().c(new vu8(wvk.c, wvk.d)).a("FIREBASE_CRASHLYTICS_REPORT", new ijp("json"), wvk.e), k1j0Var.b(), y380Var)), g000Var, alq0Var, isvVar, g6kVar);
    }

    @NonNull
    public static List<j5k.c> e(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new NullPointerException("Null key");
            }
            String value = entry.getValue();
            if (value == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new yk5(key, value));
        }
        Collections.sort(arrayList, new sui0(0));
        return Collections.unmodifiableList(arrayList);
    }

    public final void f(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull final i0q i0qVar, boolean z) {
        yl20 yl20Var;
        byte b;
        final boolean equals = str.equals(CrashHianalyticsData.EVENT_ID_CRASH);
        long c = i0qVar.c();
        k5k k5kVar = this.a;
        Context context = k5kVar.a;
        int i = context.getResources().getConfiguration().orientation;
        yl20 yl20Var2 = k5kVar.d;
        hrp0 a = hrp0.a(th, yl20Var2);
        fl5.a aVar = new fl5.a();
        aVar.b = str;
        aVar.a = c;
        aVar.g = (byte) (aVar.g | 1);
        j5k.e.d.a.c b2 = qgd0.a.b(context);
        Boolean valueOf = b2.a() > 0 ? Boolean.valueOf(b2.a() != 100) : null;
        ArrayList a2 = qgd0.a(context);
        byte b3 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = a.c;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b4 = (byte) 1;
        List d = k5k.d(stackTraceElementArr, 4);
        if (d == null) {
            throw new NullPointerException("Null frames");
        }
        if (b4 != 1) {
            StringBuilder sb = new StringBuilder();
            if (b4 == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
        arrayList.add(new ll5(name, 4, d));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (key.equals(thread)) {
                    yl20Var = yl20Var2;
                    b = b4;
                } else {
                    StackTraceElement[] a3 = yl20Var2.a(entry.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    yl20Var = yl20Var2;
                    List d2 = k5k.d(a3, 0);
                    if (d2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b4 != 1) {
                        byte b5 = b4;
                        StringBuilder sb2 = new StringBuilder();
                        if (b5 == 0) {
                            sb2.append(" importance");
                        }
                        throw new IllegalStateException(t9c.b("Missing required properties:", sb2));
                    }
                    b = b4;
                    arrayList.add(new ll5(name2, 0, d2));
                }
                yl20Var2 = yl20Var;
                b4 = b;
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        jl5 c2 = k5k.c(a, 0);
        kl5 e = k5k.e();
        List<j5k.e.d.a.b.AbstractC3098a> a4 = k5kVar.a();
        if (a4 == null) {
            throw new NullPointerException("Null binaries");
        }
        hl5 hl5Var = new hl5(unmodifiableList, c2, null, e, a4);
        if (b3 != 1) {
            StringBuilder sb3 = new StringBuilder();
            if (b3 == 0) {
                sb3.append(" uiOrientation");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb3));
        }
        aVar.c = new gl5(hl5Var, null, null, valueOf, b2, a2, i);
        aVar.d = k5kVar.b(i);
        fl5 a5 = aVar.a();
        Map<String, String> a6 = i0qVar.a();
        g000 g000Var = this.d;
        alq0 alq0Var = this.e;
        final j5k.e.d b6 = b(a(a5, g000Var, alq0Var, a6), alq0Var);
        if (z) {
            this.b.d(b6, i0qVar.b(), equals);
        } else {
            this.g.b.a(new Runnable() { // from class: xsna.rui0
                @Override // java.lang.Runnable
                public final void run() {
                    tui0.this.b.d(b6, i0qVar.b(), equals);
                }
            });
        }
    }

    public final Task<Void> g(@NonNull Executor executor, @Nullable String str) {
        TaskCompletionSource<u5k> taskCompletionSource;
        ArrayList b = this.b.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                o5k o5kVar = t5k.g;
                String e = t5k.e(file);
                o5kVar.getClass();
                arrayList.add(u5k.a(o5k.i(e), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u5k u5kVar = (u5k) it2.next();
            if (str == null || str.equals(u5kVar.d())) {
                wvk wvkVar = this.c;
                if (u5kVar.b().f() == null || u5kVar.b().e() == null) {
                    qir b2 = this.f.b(true);
                    j5k b3 = u5kVar.b();
                    String str2 = b2.a;
                    uk5.a m = b3.m();
                    m.e = str2;
                    uk5 a = m.a();
                    String str3 = b2.b;
                    uk5.a m2 = a.m();
                    m2.f = str3;
                    u5kVar = u5k.a(m2.a(), u5kVar.d(), u5kVar.c());
                }
                boolean z = str != null;
                q5g0 q5g0Var = wvkVar.a;
                synchronized (q5g0Var.f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource<>();
                        if (z) {
                            ((AtomicInteger) q5g0Var.i.a).getAndIncrement();
                            if (q5g0Var.f.size() < q5g0Var.e) {
                                q5g0Var.f.size();
                                q5g0Var.g.execute(q5g0Var.new a(u5kVar, taskCompletionSource));
                                taskCompletionSource.trySetResult(u5kVar);
                            } else {
                                q5g0Var.a();
                                ((AtomicInteger) q5g0Var.i.b).getAndIncrement();
                                taskCompletionSource.trySetResult(u5kVar);
                            }
                        } else {
                            q5g0Var.b(u5kVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new zy60(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
