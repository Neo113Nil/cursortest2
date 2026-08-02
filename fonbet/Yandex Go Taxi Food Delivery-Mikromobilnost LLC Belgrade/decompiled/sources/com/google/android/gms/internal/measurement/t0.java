package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import com.google.android.gms.internal.measurement.t0;
import defpackage.sl81;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class t0 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public static final String[] j = {"key", "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public volatile Map g;
    public ContentObserver d = null;
    public volatile boolean e = true;
    public final Object f = new Object();
    public final ArrayList h = new ArrayList();

    public t0(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
    }

    public static t0 a(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        t0 t0Var = (t0) i.computeIfAbsent(uri, new Function() { // from class: gka1
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new t0(contentResolver, uri, runnable);
            }
        });
        try {
            if (!t0Var.e) {
                return t0Var;
            }
            synchronized (t0Var) {
                try {
                    if (t0Var.e) {
                        zzjo zzjoVar = new zzjo(t0Var, null);
                        t0Var.a.registerContentObserver(t0Var.b, false, zzjoVar);
                        t0Var.d = zzjoVar;
                        t0Var.e = false;
                    }
                } finally {
                }
            }
            return t0Var;
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static void c() {
        Iterator it = i.values().iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            synchronized (t0Var) {
                try {
                    if (t0Var.e) {
                        t0Var.e = false;
                    } else {
                        ContentObserver contentObserver = t0Var.d;
                        if (contentObserver != null) {
                            t0Var.a.unregisterContentObserver(contentObserver);
                            t0Var.d = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            it.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy] */
    public final Map b() {
        Map map;
        Map map2;
        Object q;
        Map map3 = this.g;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f) {
                StrictMode.ThreadPolicy threadPolicy = this.g;
                map2 = threadPolicy;
                if (threadPolicy == 0) {
                    try {
                        threadPolicy = StrictMode.allowThreadDiskReads();
                        try {
                            sl81 sl81Var = new sl81(this);
                            try {
                                q = sl81Var.q();
                            } catch (SecurityException unused) {
                                long clearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    q = sl81Var.q();
                                } finally {
                                    Binder.restoreCallingIdentity(clearCallingIdentity);
                                }
                            }
                            map = (Map) q;
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            map = Collections.EMPTY_MAP;
                        }
                        this.g = map;
                        map2 = map;
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicy);
                    }
                }
            }
            map4 = map2;
        }
        return map4 != null ? map4 : Collections.EMPTY_MAP;
    }
}
