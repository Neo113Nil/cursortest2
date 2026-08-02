package defpackage;

import android.graphics.drawable.LayerDrawable;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.DefaultOrderPopup;
import com.yandex.go.zone.dto.objects.PaidOptions;
import com.yandex.go.zone.dto.objects.SummaryStyle;
import com.yandex.go.zone.dto.objects.u2;
import java.util.HashMap;
import ru.yandex.taxi.styling.ButtonType;
import ru.yandex.taxi.styling.c;

/* loaded from: classes6.dex */
public final class lox0 implements y880 {
    public final wiq0 a;
    public final dqe0 b;
    public final ynm0 c;
    public final ddf d;
    public final v920 e;
    public final ad f;
    public final oep0 g;
    public final o61 h;
    public final t380 i;
    public double j;

    public lox0(wiq0 wiq0Var, dqe0 dqe0Var, ynm0 ynm0Var, ddf ddfVar, v920 v920Var, ad adVar, oep0 oep0Var, o61 o61Var, t380 t380Var) {
        this.a = wiq0Var;
        this.b = dqe0Var;
        this.c = ynm0Var;
        this.d = ddfVar;
        this.e = v920Var;
        this.f = adVar;
        this.g = oep0Var;
        this.h = o61Var;
        this.i = t380Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r1.c.contains(r2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
    
        if (defpackage.evu0.J(r7.f) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    @Override // defpackage.y880
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(x880 x880Var) {
        xc xcVar;
        bj70 b;
        pex0 m = ((k) this.a).m();
        if (m != null && m.h()) {
            this.b.a.F = -1.0d;
            x880Var.n();
            return;
        }
        if (m != null) {
            ynm0 ynm0Var = this.c;
            if (!ynm0Var.c(((k) ynm0Var.a).m()) && !m.h()) {
                if (this.b.a.F == m.e0.a) {
                    ddf ddfVar = this.d;
                    String str = m.b;
                    p02 p02Var = (p02) ddfVar.b;
                    if (p02Var.b) {
                    }
                }
                this.j = !m.h() ? m.e0.a : 1.0d;
                v920 v920Var = this.e;
                fnx0 n = ((k) ((wiq0) v920Var.a)).n();
                if (n != null) {
                    pex0 pex0Var = n.c;
                    PaidOptions paidOptions = pex0Var.e0;
                    if (paidOptions.e) {
                        u2 u2Var = paidOptions.f;
                        if (u2Var instanceof DefaultOrderPopup) {
                            LayerDrawable b2 = ((ppw0) v920Var.y).b(pex0Var);
                            m37 m37Var = ((c) v920Var.w).c(pex0Var, n.d, ((dqe0) v920Var.x).c()).a;
                            if (pex0Var.e0.c) {
                                yow0 yow0Var = (yow0) v920Var.c;
                                SummaryStyle summaryStyle = pex0Var.v0;
                                b = yow0Var.a(summaryStyle != null ? summaryStyle.b : null, m37Var);
                            } else {
                                j37 a = m37Var.a(ButtonType.DEFAULT);
                                b = a != null ? xcb1.b(a) : bj70.d;
                            }
                            xcVar = new xc(b2, b, (DefaultOrderPopup) u2Var, (xdf) v920Var.b, pex0Var.c());
                            if (evu0.J(xcVar.c)) {
                                if (evu0.J(xcVar.d)) {
                                    if (evu0.J(xcVar.e)) {
                                    }
                                }
                            }
                            o61 o61Var = this.h;
                            double d = this.j;
                            if (xcVar != null) {
                                String valueOf = String.valueOf(d);
                                o61Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("value", valueOf);
                                o61Var.a.a("surge_was_accepted", hashMap, 1, new HashMap());
                                this.b.a.F = this.j;
                                x880Var.n();
                                return;
                            }
                            String valueOf2 = String.valueOf(d);
                            o61Var.getClass();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("value", valueOf2);
                            o61Var.a.a("surge_was_shown", hashMap2, 1, new HashMap());
                            String str2 = m.b;
                            ((pep0) this.g).f(new c2n0(5, (zc) this.f.get(), new jox0(this, x880Var, 0), new jox0(this, x880Var, 1)), xcVar, hxx.a);
                            mx70.b(this.i.b, null, "summary_screen", str2, 1);
                            return;
                        }
                    }
                }
                xcVar = null;
                o61 o61Var2 = this.h;
                double d2 = this.j;
                if (xcVar != null) {
                }
            }
        }
        x880Var.n();
    }
}
