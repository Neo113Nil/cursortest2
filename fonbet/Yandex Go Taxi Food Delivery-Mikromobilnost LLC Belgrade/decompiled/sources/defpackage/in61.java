package defpackage;

import android.content.Context;
import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes7.dex */
public final class in61 {
    public Integer A;
    public Boolean A0;
    public Integer B;
    public String B0;
    public Float C;
    public Integer D;
    public String D0;
    public Integer E;
    public String E0;
    public String F;
    public String F0;
    public String G;
    public String G0;
    public Integer H;
    public String H0;
    public Integer I;
    public Boolean I0;
    public String J;
    public Boolean J0;
    public Boolean K;
    public Boolean K0;
    public Boolean L;
    public String M;
    public Boolean N;
    public String O;
    public Integer P;
    public Boolean Q;
    public String R;
    public String S;
    public String T;
    public String U;
    public Long V;
    public String W;
    public String X;
    public String Y;
    public String Z;
    public final boolean a;
    public String a0;
    public String b0;
    public String c0;
    public String d0;
    public String e0;
    public boolean f;
    public String f0;
    public boolean g;
    public String g0;
    public ListBuilder h0;
    public String i0;
    public Boolean j;
    public String j0;
    public String k;
    public String k0;
    public String l;
    public String l0;
    public Integer m;
    public int m0;
    public boolean n;
    public float n0;
    public String o;
    public float o0;
    public String p;
    public float p0;
    public String q;
    public float q0;
    public String r;
    public float r0;
    public String s;
    public float s0;
    public String t;
    public String t0;
    public String u;
    public String u0;
    public String v;
    public String v0;
    public Integer w;
    public String w0;
    public Integer x;
    public String x0;
    public String y;
    public String y0;
    public String z;
    public String z0;
    public final hg71 b = new hg71();
    public final p071 c = new p071();
    public final iq81 d = new iq81();
    public final v971 e = new v971();
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public Map C0 = b.f();

    public in61(boolean z) {
        this.a = z;
    }

    public final void a() {
        if (a081.g == null) {
            synchronized (a081.f) {
                if (a081.g == null) {
                    a081.g = new a081();
                }
            }
        }
        synchronized (a081.f) {
        }
    }

    public final void b(Context context) {
        String str;
        if (cl71.a == null) {
            synchronized (cl71.b) {
                if (cl71.a == null) {
                    cl71.a = vfa1.a(context);
                }
            }
        }
        zq71 zq71Var = cl71.a;
        if (zq71Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        synchronized (zq71.g) {
            str = zq71Var.f;
        }
        this.s = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r2 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Context context, String str) {
        boolean z;
        boolean z2;
        hg71 hg71Var = this.b;
        this.a0 = hg71Var.a.a(context).name().toLowerCase(Locale.ROOT);
        this.b0 = ConstantDeviceInfo.APP_PLATFORM;
        this.c0 = Build.VERSION.RELEASE;
        this.d0 = Build.MANUFACTURER;
        this.e0 = Build.MODEL;
        pl81 pl81Var = hg71Var.b;
        pl81Var.getClass();
        this.f0 = ef81.a(context.getResources().getConfiguration().locale);
        pl81Var.getClass();
        this.g0 = pl81.a(context);
        pl81Var.getClass();
        this.h0 = pl81.b(context);
        if (this.a) {
            str = null;
        }
        this.l0 = str;
        hg71Var.c.getClass();
        boolean z3 = false;
        try {
            z = new File("/system/app/Superuser/Superuser.apk").exists();
        } catch (Throwable unused) {
            z = false;
        }
        if (!z) {
            try {
                String[] strArr = s771.b;
                z2 = false;
                for (int i = 0; i < 8; i++) {
                    z2 = z2 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i]).exists());
                }
            } catch (Throwable unused2) {
                z2 = false;
            }
        }
        z3 = true;
        this.Q = Boolean.valueOf(z3);
    }

    public final void d() {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        this.j = a081Var2.c();
    }

    public final void e() {
        if (a081.g == null) {
            synchronized (a081.f) {
                if (a081.g == null) {
                    a081.g = new a081();
                }
            }
        }
        synchronized (a081.f) {
        }
    }

    public final void f(Context context) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        Map map = a != null ? a.f0 : null;
        if (map != null) {
            this.C0 = map;
        }
    }

    public final void g(Context context) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        if (a != null) {
            this.B0 = a.e0;
        }
    }

    public final void h(Context context) {
        String str;
        if (cl71.a == null) {
            synchronized (cl71.b) {
                if (cl71.a == null) {
                    cl71.a = vfa1.a(context);
                }
            }
        }
        zq71 zq71Var = cl71.a;
        if (zq71Var == null) {
            ny61.g("Required value was null.");
            return;
        }
        synchronized (zq71.g) {
            str = zq71Var.e;
        }
        this.r = str;
    }
}
