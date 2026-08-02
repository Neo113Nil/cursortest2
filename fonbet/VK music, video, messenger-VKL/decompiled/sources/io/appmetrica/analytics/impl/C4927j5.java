package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4217a2;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C4927j5 implements InterfaceC4727bb, Qa, InterfaceC5198th {
    public final Context a;
    public final C4747c5 b;
    public final C4860gf c;
    public final C4937jf d;
    public final X6 e;
    public final Di f;
    public final C4931j9 g;
    public final C4922j0 h;
    public final C4948k0 i;
    public final C4737bl j;
    public final C4707ah k;
    public final Y8 l;
    public final PublicLogger m;
    public final C5266w9 n;
    public final C4798e5 o;
    public final C9 p;
    public final C5310y3 q;
    public final TimePassedChecker r;
    public final Df s;
    public final Ho t;
    public final Tk u;
    public final B2 v;

    public C4927j5(@NonNull Context context, @NonNull C5100pm c5100pm, @NonNull C4747c5 c4747c5, @NonNull A4 a4, @NonNull InterfaceC5146rh interfaceC5146rh, @NonNull AbstractC4876h5 abstractC4876h5) {
        this(context, c4747c5, new C4948k0(), new TimePassedChecker(), new C5057o5(context, c4747c5, a4, abstractC4876h5, c5100pm, interfaceC5146rh, C5342za.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), C5342za.k().l(), new C4721b5()), a4);
    }

    public final boolean A() {
        C5224uh c5224uh = (C5224uh) this.k.a();
        return c5224uh.n && this.r.didTimePassSeconds(this.n.k, c5224uh.t, "should force send permissions");
    }

    public final boolean B() {
        C5100pm c5100pm;
        Df df = this.s;
        df.h.a(df.a);
        boolean z = ((Af) df.c()).d;
        C4707ah c4707ah = this.k;
        synchronized (c4707ah) {
            c5100pm = c4707ah.c.a;
        }
        return !(z && c5100pm.q);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4727bb, io.appmetrica.analytics.impl.InterfaceC4712am
    public final void a(@NonNull Tl tl, @Nullable C5100pm c5100pm) {
    }

    @Override // io.appmetrica.analytics.impl.Qa
    @NonNull
    public final C4747c5 b() {
        return this.b;
    }

    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C4922j0 c4922j0 = this.h;
        synchronized (c4922j0) {
            c4922j0.a = new Rc();
        }
        this.i.a(this.h.a(), this.c);
    }

    public final synchronized void e() {
        ((C5262w5) this.p).d();
    }

    @NonNull
    public final B2 f() {
        return this.v;
    }

    @NonNull
    public final C5310y3 g() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    @NonNull
    public final C4860gf h() {
        return this.c;
    }

    @NonNull
    public final X6 i() {
        return this.e;
    }

    @NonNull
    public final Y8 j() {
        return this.l;
    }

    @NonNull
    public final C4931j9 k() {
        return this.g;
    }

    @NonNull
    public final C5266w9 l() {
        return this.n;
    }

    @NonNull
    public final C9 m() {
        return this.p;
    }

    @NonNull
    public final C5224uh n() {
        return (C5224uh) this.k.a();
    }

    @Nullable
    public final String o() {
        return this.c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.m;
    }

    @NonNull
    public final C4937jf q() {
        return this.d;
    }

    @NonNull
    public final Tk r() {
        return this.u;
    }

    @NonNull
    public final C4737bl s() {
        return this.j;
    }

    @NonNull
    public final C5100pm t() {
        C5100pm c5100pm;
        C4707ah c4707ah = this.k;
        synchronized (c4707ah) {
            c5100pm = c4707ah.c.a;
        }
        return c5100pm;
    }

    @NonNull
    public final Ho u() {
        return this.t;
    }

    public final void v() {
        C5266w9 c5266w9 = this.n;
        int i = c5266w9.j;
        c5266w9.l = i;
        c5266w9.a.a(i).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        Ho ho = this.t;
        synchronized (ho) {
            optInt = ho.a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = Collections.singletonList(new C4850g5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC4824f5) it.next()).a(optInt);
            }
            this.t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C5224uh c5224uh = (C5224uh) this.k.a();
        return c5224uh.n && c5224uh.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.k, c5224uh.s, "need to check permissions");
    }

    public final boolean y() {
        C5266w9 c5266w9 = this.n;
        return c5266w9.l < c5266w9.j && ((C5224uh) this.k.a()).o && ((C5224uh) this.k.a()).isIdentifiersValid();
    }

    public final void z() {
        C4707ah c4707ah = this.k;
        synchronized (c4707ah) {
            c4707ah.a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4727bb
    public final void a(@NonNull C4722b6 c4722b6) {
        String a = AbstractC4706ag.a("Event received on service", EnumC5037nb.a(c4722b6.d), c4722b6.getName(), c4722b6.getValue());
        if (a != null) {
            this.m.info(a, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || C4217a2.f.equals(str)) {
            return;
        }
        this.f.a(c4722b6, new Ci());
    }

    public final void b(C4722b6 c4722b6) {
        this.h.a(c4722b6.f);
        C4897i0 a = this.h.a();
        C4948k0 c4948k0 = this.i;
        C4860gf c4860gf = this.c;
        synchronized (c4948k0) {
            if (a.b > c4860gf.d().b) {
                c4860gf.a(a).b();
                this.m.info("Save new app environment for %s. Value: %s", this.b, a.a);
            }
        }
    }

    public C4927j5(Context context, C4747c5 c4747c5, C4948k0 c4948k0, TimePassedChecker timePassedChecker, C5057o5 c5057o5, A4 a4) {
        this.a = context.getApplicationContext();
        this.b = c4747c5;
        this.i = c4948k0;
        this.r = timePassedChecker;
        Ho f = c5057o5.f();
        this.t = f;
        this.s = C5342za.k().t();
        C4860gf a = c5057o5.e().a();
        this.c = a;
        this.v = c5057o5.a(a);
        C4707ah a2 = c5057o5.a(this);
        this.k = a2;
        PublicLogger a3 = c5057o5.d().a();
        this.m = a3;
        this.d = C5342za.k().y();
        C4922j0 a5 = c4948k0.a(c4747c5, a3, a);
        this.h = a5;
        this.l = c5057o5.a();
        X6 b = c5057o5.b(this);
        this.e = b;
        Fi d = c5057o5.d(this);
        this.o = C5057o5.b();
        w();
        C4737bl a6 = C5057o5.a(this, f, new C4902i5(this));
        this.j = a6;
        a3.info("Read app environment for component %s. Value: %s", c4747c5.toString(), a5.a().a);
        Tk c = c5057o5.c();
        this.u = c;
        this.n = c5057o5.a(a, f, a6, b, a5, c, d);
        C4931j9 c2 = C5057o5.c(this);
        this.g = c2;
        this.f = C5057o5.a(this, c2);
        this.q = c5057o5.b(a);
        this.p = c5057o5.a(d, b, a2, a4, c4747c5, a);
        b.d();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4727bb, io.appmetrica.analytics.impl.Qa
    public synchronized void a(@NonNull A4 a4) {
        long j;
        try {
            this.k.a(a4);
            boolean z = false;
            if (Boolean.TRUE.equals(a4.h)) {
                this.m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(a4.h)) {
                    this.m.setEnabled(false);
                }
            }
            B2 b2 = this.v;
            Set<String> set = a4.o;
            long currentTimeMillis = b2.d.currentTimeMillis();
            boolean z2 = false;
            for (String str : set) {
                Long l = (Long) b2.e.get(str);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                    z2 = true;
                }
                if (currentTimeMillis - j > b2.b) {
                    b2.e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                b2.a(b2.e);
                b2.a.a(b2.e);
            }
            if (z2) {
                this.k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4727bb, io.appmetrica.analytics.impl.InterfaceC4712am
    public final synchronized void a(@NonNull C5100pm c5100pm) {
        this.k.a(c5100pm);
        ((C5262w5) this.p).e();
    }

    public final void a(@Nullable String str) {
        this.c.j(str).b();
    }
}
