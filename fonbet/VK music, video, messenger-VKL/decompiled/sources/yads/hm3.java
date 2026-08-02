package yads;

import android.content.Context;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes10.dex */
public final class hm3 {
    public final n9 a;
    public final jp2 b;
    public final yb2 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ hm3(Context context, ov2 ov2Var) {
        this(r0, cf.a(context, r4.b()), new yb2());
        n9 n9Var = new n9();
        mv3 mv3Var = (mv3) ov2Var;
        mv3Var.d();
        tv3 tv3Var = tv3.a;
    }

    public final void a(fm3 fm3Var, d4 d4Var) {
        d13 b;
        g9 g9Var = d4Var.e;
        gp2 a = g9Var != null ? this.a.a(g9Var) : new gp2((Map) null, 3);
        g9 g9Var2 = d4Var.e;
        if (g9Var2 != null) {
            hp2.a(a, this.a.a(g9Var2));
        }
        a.b(d4Var.c.a, "ad_unit_id");
        yb2 yb2Var = this.c;
        int i = d4Var.n;
        yb2Var.getClass();
        a.b(i != 1 ? i != 2 ? StringUtils.UNDEFINED : X3.i.C : X3.i.D, X3.i.n);
        e13 e13Var = d4Var.d.a;
        a.a((e13Var == null || (b = e13Var.b()) == null) ? null : b.b, "size_type");
        e13 e13Var2 = d4Var.d.a;
        a.a(e13Var2 != null ? Integer.valueOf(e13Var2.getWidth()) : null, "size_info_width");
        e13 e13Var3 = d4Var.d.a;
        a.a(e13Var3 != null ? Integer.valueOf(e13Var3.getHeight()) : null, "size_info_height");
        a.b(Integer.valueOf(fm3Var.a.a), "view_width");
        a.b(Integer.valueOf(fm3Var.a.b), "view_height");
        a.a(fm3Var.b.a, "layout_width");
        a.a(fm3Var.b.b, "layout_height");
        a.b(Integer.valueOf(fm3Var.c.a.a), "measured_width");
        String name = fm3Var.c.a.b.name();
        Locale locale = Locale.ROOT;
        a.b(name.toLowerCase(locale), "measured_width_mode");
        a.b(Integer.valueOf(fm3Var.c.b.a), "measured_height");
        a.b(fm3Var.c.b.b.name().toLowerCase(locale), "measured_height_mode");
        dp2 dp2Var = dp2.c;
        this.b.a(new fp2("ad_view_size_info", new LinkedHashMap(a.a), a.b));
    }

    public hm3(n9 n9Var, jp2 jp2Var, yb2 yb2Var) {
        this.a = n9Var;
        this.b = jp2Var;
        this.c = yb2Var;
    }
}
