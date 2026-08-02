package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;
import xsna.drm0;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5342za {
    public static volatile C5342za I;
    public volatile Y9 C;
    public Ik H;
    public final Context a;
    public volatile C5248vg b;
    public volatile Q6 c;
    public volatile C4771d3 e;
    public volatile C5276wj f;
    public volatile U g;
    public volatile C5002m2 h;
    public volatile PlatformIdentifiers i;
    public volatile Df j;
    public volatile L3 k;
    public volatile C4937jf l;
    public volatile Ko m;
    public volatile C5071oj n;
    public volatile Rb o;
    public Kl p;
    public volatile Hk r;
    public volatile Wb w;
    public volatile C5330yn x;
    public volatile Dl y;
    public volatile Gd z;
    public final C5317ya q = new C5317ya();
    public final C4781dd s = new C4781dd();
    public final C4832fd t = new C4832fd();
    public final C5151rm u = new C5151rm();
    public final C5072ok v = new C5072ok();
    public final Zd A = new Zd();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C5277wk D = new C5277wk();
    public final ReferenceHolder E = new ReferenceHolder();
    public final Gk F = new Gk();
    public final C4921j G = new C4921j();
    public final C5227uk d = new C5227uk();

    public C5342za(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C5342za.class) {
                try {
                    if (I == null) {
                        I = new C5342za(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C5342za k() {
        return I;
    }

    public final C5151rm A() {
        return this.u;
    }

    public final Ik B() {
        Ik ik;
        File file;
        Ik ik2 = this.H;
        if (ik2 != null) {
            return ik2;
        }
        synchronized (this) {
            ik = this.H;
            if (ik == null) {
                Context context = this.a;
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (drm0.N(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!drm0.N(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    ik = new Ik(file);
                    this.H = ik;
                }
                file = null;
                ik = new Ik(file);
                this.H = ik;
            }
        }
        return ik;
    }

    public final C5330yn C() {
        C5330yn c5330yn;
        C5330yn c5330yn2 = this.x;
        if (c5330yn2 != null) {
            return c5330yn2;
        }
        synchronized (this) {
            try {
                c5330yn = this.x;
                if (c5330yn == null) {
                    c5330yn = new C5330yn(this.a);
                    this.x = c5330yn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5330yn;
    }

    public final synchronized Ko D() {
        try {
            if (this.m == null) {
                this.m = new Ko(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final void E() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        InterfaceC4713an a = Zm.a(C5041nf.class);
                        Context context = this.a;
                        AbstractC4739bn abstractC4739bn = (AbstractC4739bn) a;
                        ProtobufStateStorage<Object> a2 = abstractC4739bn.a(context, abstractC4739bn.a(context));
                        C5041nf c5041nf = (C5041nf) a2.read();
                        this.j = new Df(this.a, a2, new C5222uf(), new C4989lf(c5041nf), new Cf(), new C5196tf(this.a), new C5322yf(k().y()), new C5067of(), c5041nf, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C4921j b() {
        return this.G;
    }

    public final U c() {
        U u;
        U u2 = this.g;
        if (u2 != null) {
            return u2;
        }
        synchronized (this) {
            try {
                u = this.g;
                if (u == null) {
                    u = new U(this.a, this.d.a(), this.u.b());
                    this.u.a(u);
                    this.g = u;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return u;
    }

    public final C5002m2 d() {
        C5002m2 c5002m2;
        C5002m2 c5002m22 = this.h;
        if (c5002m22 != null) {
            return c5002m22;
        }
        synchronized (this) {
            try {
                c5002m2 = this.h;
                if (c5002m2 == null) {
                    c5002m2 = new C5002m2(this.a, AbstractC5028n2.a());
                    this.h = c5002m2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5002m2;
    }

    public final C5157s2 e() {
        return l().b;
    }

    public final L3 f() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        InterfaceC4713an a = Zm.a(E3.class);
                        Context context = this.a;
                        AbstractC4739bn abstractC4739bn = (AbstractC4739bn) a;
                        ProtobufStateStorage<Object> a2 = abstractC4739bn.a(context, abstractC4739bn.a(context));
                        this.k = new L3(this.a, a2, new M3(), new C5335z3(), new P3(), new C4787dj(this.a), new N3(y()), new A3(), (E3) a2.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final Context g() {
        return this.a;
    }

    public final Q6 h() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new Q6(new P6(y()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final Y9 i() {
        Y9 y9;
        Y9 y92 = this.C;
        if (y92 != null) {
            return y92;
        }
        synchronized (this) {
            try {
                y9 = this.C;
                if (y9 == null) {
                    y9 = new Y9(this.a);
                    this.C = y9;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y9;
    }

    public final PermissionExtractor j() {
        Dl dl = this.y;
        if (dl != null) {
            return dl;
        }
        synchronized (this) {
            try {
                Dl dl2 = this.y;
                if (dl2 != null) {
                    return dl2;
                }
                Dl dl3 = new Dl(p().c.getAskForPermissionStrategy());
                this.y = dl3;
                return dl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Rb l() {
        Rb rb;
        Rb rb2 = this.o;
        if (rb2 != null) {
            return rb2;
        }
        synchronized (this) {
            try {
                rb = this.o;
                if (rb == null) {
                    rb = new Rb(new C4693a3(this.a, this.d.a()), new C5157s2());
                    this.o = rb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rb;
    }

    public final Wb m() {
        Wb wb;
        Wb wb2 = this.w;
        if (wb2 != null) {
            return wb2;
        }
        synchronized (this) {
            try {
                wb = this.w;
                if (wb == null) {
                    Context context = this.a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    wb = locationClient == null ? new Yb() : new Xb(context, new C4805ec(), locationClient);
                    this.w = wb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wb;
    }

    public final Wb n() {
        return m();
    }

    public final C4832fd o() {
        return this.t;
    }

    public final Hk p() {
        Hk hk;
        Hk hk2 = this.r;
        if (hk2 != null) {
            return hk2;
        }
        synchronized (this) {
            try {
                hk = this.r;
                if (hk == null) {
                    hk = new Hk();
                    this.r = hk;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hk;
    }

    public final Gd q() {
        Gd gd;
        Gd gd2 = this.z;
        if (gd2 != null) {
            return gd2;
        }
        synchronized (this) {
            try {
                gd = this.z;
                if (gd == null) {
                    gd = new Gd(this.a, new xo());
                    this.z = gd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gd;
    }

    public final Zd r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final Df t() {
        E();
        return this.j;
    }

    public final C5248vg u() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = new C5248vg(this.a, I.D().c);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final C5071oj v() {
        C5071oj c5071oj;
        C5071oj c5071oj2 = this.n;
        if (c5071oj2 != null) {
            return c5071oj2;
        }
        synchronized (this) {
            try {
                c5071oj = this.n;
                if (c5071oj == null) {
                    c5071oj = new C5071oj(this.a);
                    this.n = c5071oj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5071oj;
    }

    public final C5227uk w() {
        return this.d;
    }

    public final Gk x() {
        return this.F;
    }

    public final C4937jf y() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new C4937jf(B().d(this.a));
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final synchronized W2 z() {
        try {
            if (this.p == null) {
                Kl kl = new Kl(this.a);
                this.p = kl;
                this.u.a(kl);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
