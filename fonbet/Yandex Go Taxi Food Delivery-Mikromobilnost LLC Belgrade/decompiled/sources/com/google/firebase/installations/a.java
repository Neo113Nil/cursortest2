package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.concurrent.b;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.installations.remote.c;
import com.google.firebase.installations.remote.d;
import com.google.firebase.installations.remote.e;
import defpackage.a7v;
import defpackage.atx0;
import defpackage.bx21;
import defpackage.c1d;
import defpackage.cvw;
import defpackage.fcr;
import defpackage.gcr;
import defpackage.hcr;
import defpackage.j3y;
import defpackage.k6i0;
import defpackage.lb7;
import defpackage.t59;
import defpackage.t74;
import defpackage.u74;
import defpackage.udq0;
import defpackage.ums;
import defpackage.v0b0;
import defpackage.v7t;
import defpackage.w0b0;
import defpackage.w4u0;
import defpackage.z3t;
import defpackage.zvf0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements hcr {
    public static final Object m = new Object();
    public final com.google.firebase.a a;
    public final e b;
    public final v0b0 c;
    public final bx21 d;
    public final j3y e;
    public final k6i0 f;
    public final Object g;
    public final ExecutorService h;
    public final b i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public a(com.google.firebase.a aVar, zvf0 zvf0Var, ExecutorService executorService, b bVar) {
        aVar.a();
        e eVar = new e(aVar.a, zvf0Var);
        v0b0 v0b0Var = new v0b0(aVar);
        if (ums.b == null) {
            ums.b = new ums(10);
        }
        ums umsVar = ums.b;
        if (bx21.c == null) {
            bx21.c = new bx21(umsVar);
        }
        bx21 bx21Var = bx21.c;
        j3y j3yVar = new j3y(new c1d(2, aVar));
        k6i0 k6i0Var = new k6i0();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = aVar;
        this.b = eVar;
        this.c = v0b0Var;
        this.d = bx21Var;
        this.e = j3yVar;
        this.f = k6i0Var;
        this.h = executorService;
        this.i = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if ("[DEFAULT]".equals(r4.b) != false) goto L17;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: all -> 0x0087, TryCatch #0 {all -> 0x0087, blocks: (B:6:0x000e, B:8:0x001c, B:13:0x002a, B:15:0x003b, B:17:0x006b, B:18:0x0072, B:20:0x0048, B:22:0x0051, B:24:0x0063), top: B:5:0x000e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #1 {all -> 0x008f, blocks: (B:4:0x0003, B:26:0x008b, B:27:0x0091, B:34:0x00a3, B:35:0x00a6, B:6:0x000e, B:8:0x001c, B:13:0x002a, B:15:0x003b, B:17:0x006b, B:18:0x0072, B:20:0x0048, B:22:0x0051, B:24:0x0063), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        w0b0 c;
        boolean z;
        String a;
        synchronized (m) {
            try {
                com.google.firebase.a aVar = this.a;
                aVar.a();
                lb7 j = lb7.j(aVar.a);
                try {
                    c = this.c.c();
                    if (c.f() != PersistedInstallation$RegistrationStatus.NOT_GENERATED && c.f() != PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                        z = false;
                        if (z) {
                            k6i0 k6i0Var = this.f;
                            com.google.firebase.a aVar2 = this.a;
                            aVar2.a();
                            if (!aVar2.b.equals("CHIME_ANDROID_SDK")) {
                                aVar2.a();
                            }
                            if (((u74) c).c == PersistedInstallation$RegistrationStatus.ATTEMPT_MIGRATION) {
                                a = ((a7v) this.e.get()).a();
                                if (TextUtils.isEmpty(a)) {
                                    k6i0Var.getClass();
                                    a = k6i0.a();
                                }
                                v0b0 v0b0Var = this.c;
                                t74 h = c.h();
                                h.a = a;
                                h.c(PersistedInstallation$RegistrationStatus.UNREGISTERED);
                                c = h.a();
                                v0b0Var.b(c);
                            }
                            k6i0Var.getClass();
                            a = k6i0.a();
                            v0b0 v0b0Var2 = this.c;
                            t74 h2 = c.h();
                            h2.a = a;
                            h2.c(PersistedInstallation$RegistrationStatus.UNREGISTERED);
                            c = h2.a();
                            v0b0Var2.b(c);
                        }
                        if (j != null) {
                            j.w();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                    if (j != null) {
                    }
                } catch (Throwable th) {
                    if (j != null) {
                        j.w();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h(c);
        this.i.execute(new fcr(this, 2));
    }

    public final w0b0 b(w0b0 w0b0Var) {
        int responseCode;
        Object f;
        e eVar = this.b;
        com.google.firebase.a aVar = this.a;
        aVar.a();
        String str = aVar.c.a;
        String c = w0b0Var.c();
        com.google.firebase.a aVar2 = this.a;
        aVar2.a();
        String str2 = aVar2.c.g;
        String e = w0b0Var.e();
        t59 t59Var = eVar.c;
        if (!t59Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL a = e.a("projects/" + str2 + "/installations/" + c + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c2 = eVar.c(a, str);
            try {
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + e);
                    c2.setDoOutput(true);
                    e.h(c2);
                    responseCode = c2.getResponseCode();
                    t59Var.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    f = e.f(c2);
                } else {
                    e.b(c2, null);
                    if (responseCode == 401 || responseCode == 404) {
                        c cVar = new c();
                        cVar.b = 0L;
                        cVar.d = (byte) (cVar.d | 1);
                        cVar.c = TokenResult.ResponseCode.AUTH_ERROR;
                        f = cVar.a();
                    } else {
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            c cVar2 = new c();
                            cVar2.b = 0L;
                            cVar2.d = (byte) (cVar2.d | 1);
                            cVar2.c = TokenResult.ResponseCode.BAD_CONFIG;
                            f = cVar2.a();
                        }
                    }
                }
                d dVar = (d) f;
                int i2 = gcr.b[dVar.c.ordinal()];
                if (i2 == 1) {
                    String str3 = dVar.a;
                    long j = dVar.b;
                    this.d.a.getClass();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    t74 h = w0b0Var.h();
                    h.c = str3;
                    h.b(j);
                    h.d(currentTimeMillis);
                    return h.a();
                }
                if (i2 == 2) {
                    t74 h2 = w0b0Var.h();
                    h2.g = "BAD CONFIG";
                    h2.c(PersistedInstallation$RegistrationStatus.REGISTER_ERROR);
                    return h2.a();
                }
                if (i2 != 3) {
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                }
                synchronized (this) {
                    this.j = null;
                }
                t74 h3 = w0b0Var.h();
                h3.c(PersistedInstallation$RegistrationStatus.NOT_GENERATED);
                return h3.a();
            } finally {
                c2.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final zzw c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return udq0.p(str);
        }
        atx0 atx0Var = new atx0();
        v7t v7tVar = new v7t(atx0Var);
        synchronized (this.g) {
            this.l.add(v7tVar);
        }
        zzw zzwVar = atx0Var.a;
        this.h.execute(new fcr(this, 0));
        return zzwVar;
    }

    public final zzw d() {
        e();
        atx0 atx0Var = new atx0();
        z3t z3tVar = new z3t(this.d, atx0Var);
        synchronized (this.g) {
            this.l.add(z3tVar);
        }
        zzw zzwVar = atx0Var.a;
        this.h.execute(new fcr(this, 1));
        return zzwVar;
    }

    public final void e() {
        com.google.firebase.a aVar = this.a;
        aVar.a();
        cvw.j(aVar.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aVar.a();
        cvw.j(aVar.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aVar.a();
        cvw.j(aVar.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        aVar.a();
        String str = aVar.c.b;
        Pattern pattern = bx21.b;
        cvw.d("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        aVar.a();
        cvw.d("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", bx21.b.matcher(aVar.c.a).matches());
    }

    public final w0b0 f(w0b0 w0b0Var) {
        int responseCode;
        InstallationResponse e;
        String c = (w0b0Var.c() == null || w0b0Var.c().length() != 11) ? null : ((a7v) this.e.get()).c();
        com.google.firebase.a aVar = this.a;
        aVar.a();
        String str = aVar.c.a;
        String c2 = w0b0Var.c();
        aVar.a();
        String str2 = aVar.c.g;
        aVar.a();
        String str3 = aVar.c.b;
        e eVar = this.b;
        t59 t59Var = eVar.c;
        if (!t59Var.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL a = e.a("projects/" + str2 + "/installations");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c3 = eVar.c(a, str);
            try {
                try {
                    c3.setRequestMethod("POST");
                    c3.setDoOutput(true);
                    if (c != null) {
                        c3.addRequestProperty("x-goog-fis-android-iid-migration-auth", c);
                    }
                    e.g(c3, c2, str3);
                    responseCode = c3.getResponseCode();
                    t59Var.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e = e.e(c3);
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    e.b(c3, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.a aVar2 = new com.google.firebase.installations.remote.a();
                        com.google.firebase.installations.remote.b bVar = new com.google.firebase.installations.remote.b(aVar2.a, aVar2.b, aVar2.c, aVar2.d, InstallationResponse.ResponseCode.BAD_CONFIG);
                        c3.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e = bVar;
                    }
                    c3.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                int[] iArr = gcr.a;
                com.google.firebase.installations.remote.b bVar2 = (com.google.firebase.installations.remote.b) e;
                TokenResult tokenResult = bVar2.d;
                int i2 = iArr[bVar2.e.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
                    }
                    t74 h = w0b0Var.h();
                    h.g = "BAD CONFIG";
                    h.c(PersistedInstallation$RegistrationStatus.REGISTER_ERROR);
                    return h.a();
                }
                String str4 = bVar2.b;
                String str5 = bVar2.c;
                this.d.a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String b = tokenResult.b();
                long c4 = tokenResult.c();
                t74 h2 = w0b0Var.h();
                h2.a = str4;
                h2.c(PersistedInstallation$RegistrationStatus.REGISTERED);
                h2.c = b;
                h2.d = str5;
                h2.b(c4);
                h2.d(currentTimeMillis);
                return h2.a();
            } catch (Throwable th) {
                c3.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((w4u0) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(w0b0 w0b0Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((w4u0) it.next()).b(w0b0Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
