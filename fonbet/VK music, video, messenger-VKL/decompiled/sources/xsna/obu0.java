package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Trace;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import ru.ok.android.sdk.SharedKt;
import xsna.v6u0;

/* compiled from: VkAuth.kt */
/* loaded from: classes15.dex */
public final class obu0 {
    public static volatile v6u0 a;
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    public static v6u0 a(Context context) {
        int i;
        Trace.beginSection(ndp0.f("VkAuth.getCurrentToken"));
        try {
            v6u0 v6u0Var = a;
            if (v6u0Var != null && (((i = v6u0Var.e) <= 0 || v6u0Var.f + (i * 1000) > System.currentTimeMillis()) && v6u0Var.i > pvo0.a() && v6u0Var.j > pvo0.a())) {
                return v6u0Var;
            }
            ReentrantReadWriteLock.ReadLock readLock = b.readLock();
            readLock.lock();
            try {
                Trace.beginSection(ndp0.f("VkAuth.getPreferences"));
                try {
                    SharedPreferences f = Preference.f("vk_auth");
                    Trace.endSection();
                    HashMap hashMap = new HashMap();
                    for (String str : f.getAll().keySet()) {
                        hashMap.put(str, f.getString(str, ""));
                    }
                    v6u0 v6u0Var2 = (hashMap.containsKey(SharedKt.PARAM_ACCESS_TOKEN) && hashMap.containsKey("user_id") && hashMap.containsKey("secret")) ? new v6u0(hashMap) : null;
                    if (v6u0Var2 != null) {
                        a = v6u0Var2;
                        L.p("Found vkAuthToken in legacy storage, attempting migration");
                        ReentrantReadWriteLock reentrantReadWriteLock = b;
                        ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                        int i2 = 0;
                        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                        for (int i3 = 0; i3 < readHoldCount; i3++) {
                            readLock2.unlock();
                        }
                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                        writeLock.lock();
                        try {
                            b(context);
                            hzg0 hzg0Var = pjp.a;
                            pjp.c("vk_auth_token", v6u0Var2.c());
                            Trace.beginSection(ndp0.f("VkAuth.getPreferences"));
                            try {
                                SharedPreferences f2 = Preference.f("vk_auth");
                                Trace.endSection();
                                f2.edit().clear().apply();
                                s3q0 s3q0Var = s3q0.a;
                            } finally {
                            }
                        } finally {
                            while (i2 < readHoldCount) {
                                readLock2.lock();
                                i2++;
                            }
                            writeLock.unlock();
                        }
                    } else {
                        b(context);
                        hzg0 hzg0Var2 = pjp.a;
                        a = v6u0.a.a(pjp.a("vk_auth_token"));
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    readLock.unlock();
                    return a;
                } finally {
                }
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        } finally {
        }
    }

    public static void b(Context context) {
        Trace.beginSection(ndp0.f("VkAuth.getEncryptedPreferences"));
        try {
            hzg0 hzg0Var = pjp.a;
            if (!pjp.b) {
                pjp.b(context.getApplicationContext(), Executors.newSingleThreadExecutor(), true);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static final void c(Context context) {
        Trace.beginSection(ndp0.f("VkAuth.logout"));
        try {
            a = null;
            ReentrantReadWriteLock reentrantReadWriteLock = b;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Trace.beginSection(ndp0.f("VkAuth.getPreferences"));
                try {
                    SharedPreferences f = Preference.f("vk_auth");
                    Trace.endSection();
                    f.edit().clear().apply();
                    b(context);
                    hzg0 hzg0Var = pjp.a;
                    pjp.c("vk_auth_token", null);
                    s3q0 s3q0Var = s3q0.a;
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    s3q0 s3q0Var2 = s3q0.a;
                } finally {
                }
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    public static void d(Context context, v6u0 v6u0Var) {
        Trace.beginSection(ndp0.f("VkAuth.saveAuthData"));
        try {
            a = v6u0Var;
            ReentrantReadWriteLock reentrantReadWriteLock = b;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                String c = v6u0Var.c();
                b(context);
                hzg0 hzg0Var = pjp.a;
                pjp.c("vk_auth_token", c);
                s3q0 s3q0Var = s3q0.a;
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                s3q0 s3q0Var2 = s3q0.a;
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } finally {
            Trace.endSection();
        }
    }

    public static void e(Context context, h7r0 h7r0Var) {
        Trace.beginSection(ndp0.f("VkAuth.updateAccessToken"));
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = b;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                v6u0 a2 = a(context);
                if (a2 == null) {
                    while (i < readHoldCount) {
                        readLock.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return;
                }
                String str = h7r0Var.a;
                String str2 = h7r0Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                v6u0 a3 = v6u0.a(v6u0.a(a2, 0L, str, str2, h7r0Var.c, h7r0Var.d, h7r0Var.f, 4041), h7r0Var.e.b, null, null, 0, 0L, null, 8190);
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                d(context2, a3);
                s3q0 s3q0Var = s3q0.a;
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                s3q0 s3q0Var2 = s3q0.a;
            } finally {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            Trace.endSection();
        }
    }
}
