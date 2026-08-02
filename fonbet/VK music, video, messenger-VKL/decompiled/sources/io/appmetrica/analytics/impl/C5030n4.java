package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import xsna.drm0;

/* renamed from: io.appmetrica.analytics.impl.n4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5030n4 {
    public static volatile C5030n4 w;
    public final D6 a;
    public final P7 b;
    public final C4772d4 c;
    public final R1 d;
    public final C5051o e;
    public final C4866gl f;
    public final Q5 g;
    public final C4999m h;
    public final C5280wn i;
    public Gd j;
    public final C5129r0 k;
    public volatile C4952k4 l;
    public final C4781dd m;
    public volatile C4834ff n;
    public C4993lj o;
    public final C5332z0 p;
    public final W1 q;
    public final C5062oa r;
    public volatile C4716b0 s;
    public volatile Y9 t;
    public volatile S7 u;
    public volatile C5056o4 v;

    public C5030n4(D6 d6, C5051o c5051o, C4772d4 c4772d4) {
        this(d6, c5051o, c4772d4, new C4999m(c5051o));
    }

    public static C5030n4 l() {
        if (w == null) {
            synchronized (C5030n4.class) {
                try {
                    if (w == null) {
                        w = new C5030n4(new D6(), new C5051o(), new C4772d4());
                    }
                } finally {
                }
            }
        }
        return w;
    }

    public final C5051o a() {
        return this.e;
    }

    public final C4834ff b(Context context) {
        C4834ff c4834ff;
        C4834ff c4834ff2 = this.n;
        if (c4834ff2 != null) {
            return c4834ff2;
        }
        synchronized (this) {
            try {
                c4834ff = this.n;
                if (c4834ff == null) {
                    c4834ff = new C4834ff(c(context).a(context));
                    this.n = c4834ff;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4834ff;
    }

    public final C5129r0 c() {
        return this.k;
    }

    public final C5332z0 d() {
        return this.p;
    }

    public final R1 e() {
        return this.d;
    }

    public final W1 f() {
        return this.q;
    }

    public final C4772d4 g() {
        return this.c;
    }

    public final Q5 h() {
        return this.g;
    }

    public final D6 i() {
        return this.a;
    }

    public final P7 j() {
        return this.b;
    }

    public final C5062oa k() {
        return this.r;
    }

    public final C4952k4 m() {
        C4952k4 c4952k4;
        C4952k4 c4952k42 = this.l;
        if (c4952k42 != null) {
            return c4952k42;
        }
        synchronized (this) {
            try {
                c4952k4 = this.l;
                if (c4952k4 == null) {
                    c4952k4 = new C4952k4();
                    this.l = c4952k4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4952k4;
    }

    public final D6 n() {
        return this.a;
    }

    public final C4866gl o() {
        return this.f;
    }

    public C5030n4(D6 d6, C5051o c5051o, C4772d4 c4772d4, C4999m c4999m) {
        this(d6, new P7(), c4772d4, c4999m, new R1(), c5051o, new C4866gl(c5051o, c4999m), new Q5(c5051o), new C5280wn(), new C5129r0());
    }

    public final synchronized Gd a(Context context) {
        try {
            if (this.j == null) {
                this.j = new Gd(context, new wo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final C5056o4 c(Context context) {
        C5056o4 c5056o4;
        File file;
        C5056o4 c5056o42 = this.v;
        if (c5056o42 != null) {
            return c5056o42;
        }
        synchronized (this) {
            c5056o4 = this.v;
            if (c5056o4 == null) {
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
                    c5056o4 = new C5056o4(file);
                    this.v = c5056o4;
                }
                file = null;
                c5056o4 = new C5056o4(file);
                this.v = c5056o4;
            }
        }
        return c5056o4;
    }

    public C5030n4(D6 d6, P7 p7, C4772d4 c4772d4, C4999m c4999m, R1 r1, C5051o c5051o, C4866gl c4866gl, Q5 q5, C5280wn c5280wn, C5129r0 c5129r0) {
        this.m = new C4781dd();
        this.p = new C5332z0();
        this.q = new W1();
        this.r = new C5062oa();
        new O7();
        this.u = new S7();
        this.a = d6;
        this.b = p7;
        this.c = c4772d4;
        this.h = c4999m;
        this.d = r1;
        this.e = c5051o;
        this.f = c4866gl;
        this.g = q5;
        this.i = c5280wn;
        this.k = c5129r0;
    }

    public final C4716b0 b() {
        C4716b0 c4716b0;
        C4716b0 c4716b02 = this.s;
        if (c4716b02 != null) {
            return c4716b02;
        }
        synchronized (this) {
            try {
                c4716b0 = this.s;
                if (c4716b0 == null) {
                    c4716b0 = new C4716b0(this.p, this.f, this.c);
                    this.s = c4716b0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4716b0;
    }
}
