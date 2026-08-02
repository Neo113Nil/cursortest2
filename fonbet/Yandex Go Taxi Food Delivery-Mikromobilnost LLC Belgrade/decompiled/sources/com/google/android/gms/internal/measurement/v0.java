package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.RemoteException;
import android.os.UserManager;
import android.util.Log;
import defpackage.eja1;
import defpackage.nha1;
import defpackage.ny61;
import defpackage.th91;
import defpackage.uha1;
import defpackage.xia1;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class v0 {
    public static v0 d;
    public final Context a;
    public final ContentObserver b;
    public boolean c;

    public v0(Context context) {
        this.c = false;
        this.a = context;
        this.b = new zzjw(this, null);
    }

    public static v0 a(Context context) {
        v0 v0Var;
        synchronized (v0.class) {
            try {
                if (d == null) {
                    d = th91.e(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new v0(context) : new v0();
                }
                v0 v0Var2 = d;
                if (v0Var2 != null && v0Var2.b != null && !v0Var2.c) {
                    try {
                        context.getContentResolver().registerContentObserver(uha1.a, true, d.b);
                        v0 v0Var3 = d;
                        v0Var3.getClass();
                        v0Var3.c = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                v0Var = d;
                v0Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return v0Var;
    }

    public static synchronized void c() {
        Context context;
        synchronized (v0.class) {
            try {
                v0 v0Var = d;
                if (v0Var != null && (context = v0Var.a) != null && v0Var.b != null && v0Var.c) {
                    context.getContentResolver().unregisterContentObserver(d.b);
                }
                d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0040, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.measurement.u0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String b(final String str) {
        Object a;
        int i;
        boolean z;
        Context context = this.a;
        if (context != null) {
            boolean z2 = true;
            if (!eja1.b) {
                synchronized (eja1.class) {
                    try {
                        if (!eja1.b) {
                            i = 1;
                            while (true) {
                                z = false;
                                if (i <= 2) {
                                    if (eja1.a == null) {
                                        eja1.a = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager = eja1.a;
                                    if (userManager != null) {
                                        if (userManager.isUserUnlocked()) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z) {
                                eja1.a = null;
                            }
                            if (z) {
                                eja1.b = true;
                            }
                            z2 = z;
                        }
                    } catch (NullPointerException unused) {
                        eja1.a = null;
                        i++;
                    } finally {
                    }
                }
            }
            if (z2) {
                try {
                    ?? r0 = new Object() { // from class: com.google.android.gms.internal.measurement.u0
                        public final Object a() {
                            Uri uri;
                            ContentProviderClient acquireUnstableContentProviderClient;
                            String str2;
                            v0 v0Var = v0.this;
                            String str3 = str;
                            Context context2 = v0Var.a;
                            context2.getClass();
                            ContentResolver contentResolver = context2.getContentResolver();
                            xia1 xia1Var = nha1.a;
                            String str4 = null;
                            if (contentResolver == null) {
                                xia1Var.getClass();
                                ny61.r("ContentResolver needed with GservicesDelegateSupplier.init()");
                                return null;
                            }
                            synchronized (xia1Var) {
                                try {
                                    HashMap hashMap = xia1Var.b;
                                    AtomicBoolean atomicBoolean = xia1Var.a;
                                    if (hashMap == null) {
                                        atomicBoolean.set(false);
                                        xia1Var.b = new HashMap(16, 1.0f);
                                        xia1Var.g = new Object();
                                        contentResolver.registerContentObserver(uha1.a, true, new zzjj(xia1Var, null));
                                    } else if (atomicBoolean.getAndSet(false)) {
                                        xia1Var.b.clear();
                                        xia1Var.c.clear();
                                        xia1Var.d.clear();
                                        xia1Var.e.clear();
                                        xia1Var.f.clear();
                                        xia1Var.g = new Object();
                                    }
                                    Object obj = xia1Var.g;
                                    if (xia1Var.b.containsKey(str3)) {
                                        String str5 = (String) xia1Var.b.get(str3);
                                        if (str5 != null) {
                                            str4 = str5;
                                        }
                                        return str4;
                                    }
                                    try {
                                        uri = uha1.a;
                                        acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                        try {
                                        } catch (Throwable th) {
                                            acquireUnstableContentProviderClient.release();
                                            throw th;
                                        }
                                    } catch (zzjk unused2) {
                                    }
                                    if (acquireUnstableContentProviderClient == null) {
                                        throw new zzjk("Unable to acquire ContentProviderClient");
                                    }
                                    try {
                                        Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str3}, null);
                                        try {
                                            if (query == null) {
                                                throw new zzjk("ContentProvider query returned null cursor");
                                            }
                                            if (query.moveToFirst()) {
                                                str2 = query.getString(1);
                                                query.close();
                                                acquireUnstableContentProviderClient.release();
                                            } else {
                                                query.close();
                                                acquireUnstableContentProviderClient.release();
                                                str2 = null;
                                            }
                                            if (str2 != null && str2.equals(null)) {
                                                str2 = null;
                                            }
                                            synchronized (xia1Var) {
                                                try {
                                                    if (obj == xia1Var.g) {
                                                        xia1Var.b.put(str3, str2);
                                                    }
                                                } finally {
                                                }
                                            }
                                            if (str2 != null) {
                                                return str2;
                                            }
                                            return null;
                                        } finally {
                                        }
                                    } catch (RemoteException e) {
                                        throw new zzjk("ContentProvider query failed", e);
                                    }
                                } finally {
                                }
                            }
                        }
                    };
                    try {
                        a = r0.a();
                    } catch (SecurityException unused2) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            a = r0.a();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    return (String) a;
                } catch (IllegalStateException | NullPointerException | SecurityException e) {
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            }
        }
        return null;
    }

    public v0() {
        this.c = false;
        this.a = null;
        this.b = null;
    }
}
