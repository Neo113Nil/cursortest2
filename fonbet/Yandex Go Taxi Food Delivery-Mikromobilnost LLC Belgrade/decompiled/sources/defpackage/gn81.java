package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import yads.f1;
import yads.f5;
import yads.kc1;
import yads.tp0;
import yads.w4;

/* loaded from: classes7.dex */
public abstract class gn81 implements j271, rk81, ln61 {
    public fx71 A;
    public final Context a;
    public final d881 b;
    public final hlx0 c;
    public final e971 w;
    public final m481 x;
    public final uio0 y;
    public final s421 z;

    public gn81(Context context, d881 d881Var, fe81 fe81Var, v981 v981Var, mb71 mb71Var, ju81 ju81Var) {
        e971 e971Var = new e971();
        if (m481.b == null) {
            synchronized (m481.c) {
                if (m481.b == null) {
                    m481.b = new m481();
                }
            }
        }
        m481 m481Var = m481.b;
        if (m481Var == null) {
            ny61.r("Required value was null.");
            throw null;
        }
        cr71 cr71Var = new cr71(fe81Var);
        cr71Var.x = d881Var;
        n291 n291Var = (n291) v981Var;
        Context context2 = n291Var.a;
        uio0 uio0Var = new uio0(context, d881Var, fe81Var, e971Var, cr71Var, wha1.c(context2, context2));
        Context context3 = n291Var.a;
        s421 s421Var = new s421(wha1.c(context3, context3), fe81Var, d881Var);
        cl81 cl81Var = new cl81();
        this.a = context;
        this.b = d881Var;
        r581 r581Var = cl81Var.a;
        kgx kgxVar = cl81.b[0];
        r581Var.getClass();
        r581Var.a = new WeakReference(this);
        this.c = new hlx0(context, fe81Var, v981Var, d881Var, this, (tp0) null);
        this.w = e971Var;
        this.x = m481Var;
        this.y = uio0Var;
        this.z = s421Var;
        s871.b.a().a("window_type_fullscreen", new mg61());
    }

    @Override // defpackage.rk81
    public void a(int i, Bundle bundle) {
        getClass().toString();
        if (i == 0) {
            f5 f5Var = f5.f;
            this.w.a(f5Var);
            uio0 uio0Var = this.y;
            hn71 f = ((cr71) uio0Var.b).f();
            Map map = (Map) f.b;
            f.r(g771.a, "adapter");
            map.putAll(((sk71) uio0Var.e).a.a(Collections.singleton(f5Var)));
            a271 a271Var = ((fe81) uio0Var.a).d.a;
            if (a271Var != null) {
                jd81 jd81Var = (jd81) a271Var;
                f.r(jd81Var.a.b, "size_type");
                f.r(Integer.valueOf(jd81Var.b), "width");
                f.r(Integer.valueOf(jd81Var.c), "height");
            }
            gg81 gg81Var = (gg81) uio0Var.f;
            if (gg81Var != null) {
                f.r(gg81Var.R, "banner_size_calculation_type");
            }
            no61 no61Var = ((d881) uio0Var.c).i;
            f.c = no61Var;
            ((ge71) uio0Var.d).c(new zj71("ad_rendering_result", new LinkedHashMap(map), no61Var));
            fx71 fx71Var = this.A;
            if (fx71Var != null) {
                fx71Var.f();
                return;
            }
            return;
        }
        if (i == 16) {
            if (bundle == null) {
                fx71 fx71Var2 = this.A;
                if (fx71Var2 != null) {
                    fx71Var2.c(null);
                    return;
                }
                return;
            }
            Parcelable parcelable = bundle.getParcelable("impression_data_key");
            w4 w4Var = parcelable instanceof w4 ? (w4) parcelable : null;
            fx71 fx71Var3 = this.A;
            if (fx71Var3 != null) {
                fx71Var3.c(w4Var);
                return;
            }
            return;
        }
        if (i == 17) {
            fx71 fx71Var4 = this.A;
            if (fx71Var4 != null) {
                fx71Var4.i();
                return;
            }
            return;
        }
        s421 s421Var = this.z;
        if (i == 2) {
            s421Var.j("on_resume");
            return;
        }
        if (i == 3) {
            s421Var.j("on_pause");
            return;
        }
        if (i == 4) {
            this.x.a(kc1.c, this);
            fx71 fx71Var5 = this.A;
            if (fx71Var5 != null) {
                fx71Var5.g();
                return;
            }
            return;
        }
        if (i != 5) {
            hlx0 hlx0Var = this.c;
            switch (i) {
                case 6:
                    fx71 fx71Var6 = this.A;
                    if (fx71Var6 != null) {
                        fx71Var6.i();
                    }
                    ((n871) hlx0Var.c).c(f1.d);
                    break;
                case 7:
                    fx71 fx71Var7 = this.A;
                    if (fx71Var7 != null) {
                        fx71Var7.i();
                    }
                    hlx0Var.n();
                    break;
                case 8:
                    ((n871) hlx0Var.c).b(f1.d);
                    break;
                case 9:
                    xq81 xq81Var = (xq81) hlx0Var.w;
                    Context context = (Context) hlx0Var.b;
                    qk61 qk61Var = (qk61) hlx0Var.y;
                    xq81Var.b(context, qk61Var);
                    xq81Var.a(context, qk61Var);
                    break;
            }
        }
    }

    @Override // defpackage.j271
    public final void b() {
    }

    @Override // defpackage.ln61
    public final synchronized boolean a() {
        return false;
    }
}
