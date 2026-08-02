package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.ironsource.O6;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;

/* loaded from: classes10.dex */
public abstract class ry0 extends y83 {
    public final d4 e;
    public final cy0 f;
    public final m5 g;
    public final w5 h;
    public final r53 i;
    public final d9 j;
    public final c1 k;
    public jy0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ry0(Context context, v9 v9Var, d4 d4Var, ov2 ov2Var, cy0 cy0Var, m5 m5Var) {
        this(context, v9Var, d4Var, ov2Var, cy0Var, m5Var, r4, r8, new d9(context, v9Var, d4Var, r4, r5, r7.a()), new c1(r7.a(), d4Var, v9Var));
        w5 w5Var = new w5();
        r53 a = q53.a();
        j22 j22Var = new j22(d4Var);
        j22Var.a(v9Var);
        mv3 mv3Var = (mv3) ov2Var;
    }

    @Override // yads.b61
    public final void a(j5 j5Var) {
        jy0 jy0Var = this.l;
        if (jy0Var != null) {
            jy0Var.a(j5Var);
        }
    }

    public final c00 d() {
        List b = this.f.b();
        m5 m5Var = this.g;
        Context context = this.a;
        v9 v9Var = this.b;
        d4 d4Var = this.e;
        String adInfo = this.f.getAdInfo();
        m5Var.getClass();
        String str = v9Var.e;
        if (str == null && (str = d4Var.c.a) == null) {
            str = "";
        }
        ov0 c = v9Var.c();
        if (c.c == 0 || c.d == 0) {
            c = null;
        }
        return new c00(str, c != null ? new la(c.c(context), c.a(context)) : null, adInfo, b);
    }

    public final List e() {
        return this.f.a();
    }

    public abstract ry0 f();

    public final void g() {
        jy0 jy0Var = this.l;
        if (jy0Var != null) {
            jy0Var.onAdClicked();
        }
    }

    @Override // yads.y83, yads.f4
    public void a(int i, Bundle bundle) {
        getClass().toString();
        if (i == 0) {
            this.h.a(v5.f);
            d9 d9Var = this.j;
            gp2 a = d9Var.c.a();
            a.b(cp2.a, O6.G1);
            a.a.putAll(d9Var.e.a());
            e13 e13Var = d9Var.b.d.a;
            if (e13Var != null) {
                a.b(e13Var.b().b, "size_type");
                a.b(Integer.valueOf(e13Var.getWidth()), "width");
                a.b(Integer.valueOf(e13Var.getHeight()), "height");
            }
            qu2 qu2Var = d9Var.f;
            if (qu2Var != null) {
                a.b(qu2Var.R, "banner_size_calculation_type");
            }
            c cVar = d9Var.a.i;
            a.b = cVar;
            d9Var.d.a(new fp2(dp2.d.a(), new LinkedHashMap(a.a), cVar));
            jy0 jy0Var = this.l;
            if (jy0Var != null) {
                jy0Var.onAdShown();
                return;
            }
            return;
        }
        if (i == 16) {
            if (bundle == null) {
                a((j5) null);
                return;
            } else {
                Parcelable parcelable = bundle.getParcelable("impression_data_key");
                a(parcelable instanceof j5 ? (j5) parcelable : null);
                return;
            }
        }
        if (i == 17) {
            jy0 jy0Var2 = this.l;
            if (jy0Var2 != null) {
                jy0Var2.onAdClicked();
                return;
            }
            return;
        }
        if (i == 2) {
            this.k.b();
            return;
        }
        if (i == 3) {
            this.k.a();
            return;
        }
        if (i != 4) {
            if (i != 5) {
                super.a(i, bundle);
            }
        } else {
            this.i.a(le1.c, this);
            jy0 jy0Var3 = this.l;
            if (jy0Var3 != null) {
                jy0Var3.onAdDismissed();
            }
        }
    }

    public ry0(Context context, v9 v9Var, d4 d4Var, ov2 ov2Var, cy0 cy0Var, m5 m5Var, w5 w5Var, r53 r53Var, d9 d9Var, c1 c1Var) {
        super(context, v9Var, ov2Var, d4Var);
        this.e = d4Var;
        this.f = cy0Var;
        this.g = m5Var;
        this.h = w5Var;
        this.i = r53Var;
        this.j = d9Var;
        this.k = c1Var;
        k2.b.a().a("window_type_fullscreen", new d2(ov2Var));
    }

    public final void a(jy0 jy0Var) {
        this.l = jy0Var;
    }

    public final Object a(Activity activity) {
        n7 n7Var = o7.a;
        synchronized (this) {
        }
        w5 w5Var = this.h;
        v5 v5Var = v5.f;
        w5Var.a(v5Var, null);
        r53 r53Var = this.i;
        le1 le1Var = le1.c;
        r53Var.b(le1Var, this);
        Object a = this.f.a(f(), activity);
        if (Result.a(a) != null) {
            this.h.a(v5Var);
            if (!tb.a((mu) this)) {
                this.i.a(le1Var, this);
                this.f.a(this.a);
                super.c();
            }
        }
        return a;
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
    }
}
