package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$attr;
import com.yandex.mobile.ads.R$string;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.drm0;
import xsna.epx;

/* loaded from: classes10.dex */
public final class x70 {
    public final Context a;
    public final fr1 b;
    public final gs1 c;

    public x70(Context context, fr1 fr1Var, gs1 gs1Var) {
        this.a = context;
        this.b = fr1Var;
        this.c = gs1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list, b50 b50Var) {
        x80 x80Var;
        x80 x80Var2;
        if (b50Var.a() instanceof z40) {
            x80Var2 = new x80(this.a.getString(R$string.debug_panel_not_integrated), 0, null, 0, 14);
        } else {
            String f = b50Var.f();
            if (f == null || drm0.N(f)) {
                x80Var = new x80(this.a.getString(R$string.debug_panel_sdk_undefined), 0, null, 0, 14);
                a50 a = b50Var.a();
                es1 es1Var = (!(a instanceof y40) ? (y40) a : null) != null ? es1.b : null;
                StringBuilder sb = new StringBuilder();
                if (b50Var.b() != null) {
                    sb.append("Adapter " + b50Var.b() + "  ");
                }
                if (b50Var.c() != null) {
                    sb.append("Latest " + b50Var.c());
                }
                String sb2 = sb.toString();
                String b = b50Var.b();
                list.add(new y90(b50Var.e(), b50Var.d(), x80Var, new q50(sb2, (b != null || drm0.N(b) || this.b.a(b50Var.b(), b50Var.c())) ? R$attr.debug_panel_label_secondary : R$attr.debug_panel_color_orange), this.c.a(es1Var), null, null, null, null, null, b50Var.f(), 992));
            }
            x80Var2 = new x80("SDK ".concat(b50Var.f().toLowerCase(Locale.ROOT)), 0, null, 0, 14);
        }
        x80Var = x80Var2;
        a50 a2 = b50Var.a();
        if ((!(a2 instanceof y40) ? (y40) a2 : null) != null) {
        }
        StringBuilder sb3 = new StringBuilder();
        if (b50Var.b() != null) {
        }
        if (b50Var.c() != null) {
        }
        String sb22 = sb3.toString();
        String b2 = b50Var.b();
        list.add(new y90(b50Var.e(), b50Var.d(), x80Var, new q50(sb22, (b2 != null || drm0.N(b2) || this.b.a(b50Var.b(), b50Var.c())) ? R$attr.debug_panel_label_secondary : R$attr.debug_panel_color_orange), this.c.a(es1Var), null, null, null, null, null, b50Var.f(), 992));
    }

    public final x80 a(Boolean bool) {
        if (epx.f(bool, Boolean.TRUE)) {
            return new x80(this.a.getString(R$string.debug_panel_yes), 0, null, 0, 14);
        }
        if (epx.f(bool, Boolean.FALSE)) {
            return new x80(this.a.getString(R$string.debug_panel_no), 0, null, 0, 14);
        }
        if (bool == null) {
            return new x80(this.a.getString(R$string.debug_panel_no_value_set), 0, null, 0, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
