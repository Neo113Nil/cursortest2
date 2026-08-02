package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import xsna.e43;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4737bl {
    public final C4927j5 a;
    public final C4711al b;
    public final C4902i5 c;
    public final AbstractC4844g d;
    public final AbstractC4844g e;
    public Nk f;
    public int g = 0;

    public C4737bl(C4927j5 c4927j5, C4711al c4711al, C4902i5 c4902i5, C5191ta c5191ta, L2 l2) {
        this.a = c4927j5;
        this.c = c4902i5;
        this.d = c5191ta;
        this.e = l2;
        this.b = c4711al;
    }

    public final synchronized long a() {
        Nk nk;
        nk = this.f;
        return nk == null ? 10000000000L : nk.d - 1;
    }

    public final void b(Nk nk, C4722b6 c4722b6) {
        if (nk.g && nk.d > 0) {
            C4902i5 c4902i5 = this.c;
            C4722b6 a = C4722b6.a(c4722b6, EnumC5037nb.EVENT_TYPE_ALIVE);
            C4789dl c4789dl = new C4789dl();
            c4789dl.a = nk.d;
            c4789dl.d = nk.c.a;
            long andIncrement = nk.f.getAndIncrement();
            C4814el c4814el = nk.b;
            c4814el.a(C4814el.g, Long.valueOf(nk.f.get()));
            c4814el.b();
            c4789dl.b = andIncrement;
            c4789dl.c = TimeUnit.MILLISECONDS.toSeconds(Math.max(nk.i - nk.e, nk.j));
            c4902i5.a.n.a(a, c4789dl);
            if (nk.g) {
                nk.g = false;
                C4814el c4814el2 = nk.b;
                c4814el2.a(C4814el.i, Boolean.FALSE);
                c4814el2.b();
            }
        }
        PublicLogger publicLogger = this.a.m;
        int ordinal = nk.c.a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (nk) {
            C4814el c4814el3 = nk.b;
            c4814el3.getClass();
            c4814el3.c = new C5140rb();
            c4814el3.b();
            nk.h = null;
        }
    }

    public final synchronized void c(C4722b6 c4722b6) {
        try {
            if (this.g == 0) {
                Nk b = this.d.b();
                if (a(b, c4722b6)) {
                    this.f = b;
                    this.g = 3;
                } else {
                    Nk b2 = this.e.b();
                    if (a(b2, c4722b6)) {
                        this.f = b2;
                        this.g = 2;
                    } else {
                        this.f = null;
                        this.g = 1;
                    }
                }
            }
            int a = W7.a(this.g);
            if (a == 0) {
                this.f = a(c4722b6);
            } else if (a == 1) {
                b(this.f, c4722b6);
                this.f = a(c4722b6);
            } else if (a == 2) {
                if (a(this.f, c4722b6)) {
                    Nk nk = this.f;
                    long j = c4722b6.i;
                    nk.i = j;
                    C4814el c4814el = nk.b;
                    c4814el.a(C4814el.d, Long.valueOf(j));
                    c4814el.b();
                } else {
                    this.f = a(c4722b6);
                }
            }
        } finally {
        }
    }

    public final Nk a(C4722b6 c4722b6) {
        this.a.m.info("Start foreground session", new Object[0]);
        long j = c4722b6.i;
        AbstractC4844g abstractC4844g = this.d;
        Ok ok = new Ok(j, c4722b6.j);
        abstractC4844g.getClass();
        Nk a = abstractC4844g.a(ok);
        this.g = 3;
        ((C5262w5) this.a.p).e();
        C4902i5 c4902i5 = this.c;
        c4902i5.a.n.a(C4722b6.a(c4722b6, C5342za.I.i()), a(a, j));
        return a;
    }

    public static C4789dl a(Nk nk, long j) {
        C4789dl c4789dl = new C4789dl();
        c4789dl.a = nk.d;
        long andIncrement = nk.f.getAndIncrement();
        C4814el c4814el = nk.b;
        c4814el.a(C4814el.g, Long.valueOf(nk.f.get()));
        c4814el.b();
        c4789dl.b = andIncrement;
        C4814el c4814el2 = nk.b;
        long j2 = j - nk.e;
        nk.j = j2;
        c4814el2.a(C4814el.e, Long.valueOf(j2));
        c4789dl.c = TimeUnit.MILLISECONDS.toSeconds(nk.j);
        c4789dl.d = nk.c.a;
        return c4789dl;
    }

    public final synchronized Nk b(C4722b6 c4722b6) {
        try {
            if (this.g == 0) {
                Nk b = this.d.b();
                if (a(b, c4722b6)) {
                    this.f = b;
                    this.g = 3;
                } else {
                    Nk b2 = this.e.b();
                    if (a(b2, c4722b6)) {
                        this.f = b2;
                        this.g = 2;
                    } else {
                        this.f = null;
                        this.g = 1;
                    }
                }
            }
            if (this.g != 1 && !a(this.f, c4722b6)) {
                this.g = 1;
                this.f = null;
            }
            int a = W7.a(this.g);
            if (a == 1) {
                Nk nk = this.f;
                long j = c4722b6.i;
                nk.i = j;
                C4814el c4814el = nk.b;
                c4814el.a(C4814el.d, Long.valueOf(j));
                c4814el.b();
                return this.f;
            }
            if (a != 2) {
                this.a.m.info("Start background session", new Object[0]);
                this.g = 2;
                long j2 = c4722b6.i;
                AbstractC4844g abstractC4844g = this.e;
                Ok ok = new Ok(j2, c4722b6.j);
                abstractC4844g.getClass();
                Nk a2 = abstractC4844g.a(ok);
                if (this.a.t.c()) {
                    C4902i5 c4902i5 = this.c;
                    c4902i5.a.n.a(C4722b6.a(c4722b6, C5342za.I.i()), a(a2, c4722b6.i));
                } else {
                    int i = c4722b6.d;
                    EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
                    if (i == 6145) {
                        C4902i5 c4902i52 = this.c;
                        c4902i52.a.n.a(c4722b6, a(a2, j2));
                        C4902i5 c4902i53 = this.c;
                        c4902i53.a.n.a(C4722b6.a(c4722b6, C5342za.I.i()), a(a2, j2));
                    }
                }
                this.f = a2;
                return a2;
            }
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Nk nk, C4722b6 c4722b6) {
        boolean z;
        boolean z2;
        boolean z3;
        if (nk == null) {
            return false;
        }
        long j = c4722b6.i;
        boolean z4 = nk.d >= 0;
        if (nk.h == null) {
            synchronized (nk) {
                if (nk.h == null) {
                    try {
                        String asString = nk.a.e.a(nk.d, nk.c.a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            nk.h = new C4763cl(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        C4763cl c4763cl = nk.h;
        if (c4763cl != null) {
            C5224uh c5224uh = (C5224uh) nk.a.k.a();
            List l = e43.l(Boolean.valueOf(TextUtils.equals(c5224uh.getAnalyticsSdkVersionName(), c4763cl.a)), Boolean.valueOf(TextUtils.equals(c5224uh.getAnalyticsSdkBuildNumber(), c4763cl.b)), Boolean.valueOf(TextUtils.equals(c5224uh.getAppVersion(), c4763cl.c)), Boolean.valueOf(TextUtils.equals(c5224uh.getAppBuildNumber(), c4763cl.d)), Boolean.valueOf(TextUtils.equals(c5224uh.getOsVersion(), c4763cl.e)), Boolean.valueOf(c4763cl.f == c5224uh.getOsApiLevel()), Boolean.valueOf(c4763cl.g == c5224uh.r));
            if (!(l instanceof Collection) || !l.isEmpty()) {
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = nk.k.elapsedRealtime();
            long j2 = nk.i;
            z2 = elapsedRealtime >= j2;
            long j3 = j - j2;
            long j4 = j - nk.e;
            if (!z2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Qk qk = nk.c;
                int i = ((C5224uh) nk.a.k.a()).f;
                Integer num = qk.d;
                if (num != null) {
                    i = num.intValue();
                }
                if (j3 < timeUnit.toMillis(i) && j4 < timeUnit.toMillis(Rk.a)) {
                    z3 = false;
                    if (!z4 && z && !z3) {
                        return true;
                    }
                    b(nk, c4722b6);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(nk, c4722b6);
            return false;
        }
        z = false;
        long elapsedRealtime2 = nk.k.elapsedRealtime();
        long j22 = nk.i;
        if (elapsedRealtime2 >= j22) {
        }
        long j32 = j - j22;
        long j42 = j - nk.e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(nk, c4722b6);
        return false;
    }
}
