package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.yandex.go.dto.response.d2;
import com.yandex.go.zone.dto.objects.SuffixSpanType;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class ow11 implements xi70 {
    public final zuj0 a;
    public final cj70 b;
    public final bpx0 c;
    public final ore d;
    public final j7h e;

    public ow11(zuj0 zuj0Var, cj70 cj70Var, bpx0 bpx0Var, ore oreVar, j7h j7hVar) {
        this.a = zuj0Var;
        this.b = cj70Var;
        this.c = bpx0Var;
        this.d = oreVar;
        this.e = j7hVar;
    }

    @Override // defpackage.xi70
    public final Object a(vi70 vi70Var, Continuation continuation) {
        return c(vi70Var.a.a);
    }

    @Override // defpackage.xi70
    public final String b() {
        return "UnavailableOrderButtonInteractor";
    }

    public final wi70 c(pex0 pex0Var) {
        wi70 g;
        bpx0 bpx0Var = this.c;
        bpx0Var.getClass();
        boolean z = pex0Var.u || bpx0Var.a.a(pex0Var) || pex0Var.o0 < bpx0Var.b.b().size();
        String str = pex0Var.D;
        String str2 = pex0Var.p;
        TariffSource tariffSource = pex0Var.a;
        if (!z) {
            return null;
        }
        CharSequence charSequence = "";
        if (jl40.l(pex0Var.G, "invalid_payment")) {
            g = hay.g(str2 == null ? "" : str2, str == null ? "" : str, bj70.e, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
        } else {
            g = null;
        }
        if (g == null) {
            d2 d2Var = pex0Var.H;
            zuj0 zuj0Var = this.a;
            if (d2Var != null) {
                if (str == null || evu0.J(str)) {
                    str = str2 == null ? "" : str2;
                }
                String str3 = pex0Var.E;
                SuffixSpanType suffixSpanType = pex0Var.F;
                if (str3 != null && str3.length() != 0) {
                    if (suffixSpanType == null) {
                        charSequence = str3;
                    } else {
                        if (nw11.a[suffixSpanType.ordinal()] != 1) {
                            w511.b();
                            return null;
                        }
                        Drawable t = vng.t(dzg0.chevron_next, ((avj0) zuj0Var).a);
                        ContextThemeWrapper contextThemeWrapper = ((avj0) zuj0Var).a;
                        Rect rect = new Rect(0, 0, (int) tje.x(contextThemeWrapper, 5.0f), (int) tje.x(contextThemeWrapper, 8.0f));
                        rect.offset(0, (int) tje.x(contextThemeWrapper, 0.5f));
                        t.setBounds(rect);
                        charSequence = qeb1.g(str3, t, 1);
                    }
                }
                SummaryStyle summaryStyle = pex0Var.v0;
                bj70 a = this.b.a(summaryStyle != null ? summaryStyle.b : null);
                if (a == null) {
                    a = bj70.e;
                }
                g = hay.g(str, charSequence, a, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS, 8);
            } else {
                g = null;
            }
            if (g == null) {
                int b = this.d.b(pex0Var);
                Integer valueOf = Integer.valueOf(b);
                if (b <= 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    String h = intValue == 1 ? ((avj0) zuj0Var).h(kyh0.summary_unavailable_requirements_one) : ((avj0) zuj0Var).g(dwh0.summary_unavailable_requirements, kyh0.summary_error_requirements_not_supported, intValue);
                    g = new wi70(h, "", h, bj70.e, false, false, tariffSource == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS);
                } else {
                    g = null;
                }
                if (g == null) {
                    g = this.e.b(pex0Var);
                }
            }
        }
        ofa0 ofa0Var = pex0Var.I;
        bj70 bj70Var = ofa0Var != null ? new bj70(new oi70((kdc) ofa0Var.b, (wp2) ofa0Var.w), (kdc) ofa0Var.a, (wp2) ofa0Var.c) : null;
        return bj70Var != null ? wi70.a(g, bj70Var, 119) : g;
    }
}
