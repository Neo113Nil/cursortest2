package defpackage;

import android.content.Context;
import com.yandex.go.taxi.tariffs.repository.g;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.b;

/* loaded from: classes6.dex */
public final class afx0 extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final yvf0 H;
    public final eqh I;
    public final l7s0 J;
    public final uex0 K;
    public final c2x0 L;
    public final mu5 M;

    public afx0(nfx0 nfx0Var, rfx0 rfx0Var, Context context, w030 w030Var, yvf0 yvf0Var, eqh eqhVar, l7s0 l7s0Var, uex0 uex0Var, c2x0 c2x0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = yvf0Var;
        this.I = eqhVar;
        this.J = l7s0Var;
        this.K = uex0Var;
        this.L = c2x0Var;
        this.M = new mu5(new lxo0(27, rfx0Var, this, nfx0Var));
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        tis0 U = U((gfx0) obj);
        uex0 uex0Var = this.K;
        uex0Var.getClass();
        uex0Var.a(false, (String) U.c, (Map) U.w, Boolean.valueOf(U.b));
        ((d2x0) this.L).b(qoi0.a(afx0.class));
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tis0 U = U((gfx0) obj);
        uex0 uex0Var = this.K;
        uex0Var.getClass();
        uex0Var.a(true, (String) U.c, (Map) U.w, Boolean.valueOf(U.b));
        ((d2x0) this.L).e(0, qoi0.a(afx0.class));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    public final tis0 U(gfx0 gfx0Var) {
        Map map;
        boolean z = gfx0Var instanceof efx0;
        int i = 21;
        l7s0 l7s0Var = this.J;
        if (!z) {
            if (!(gfx0Var instanceof ffx0)) {
                w511.b();
                return null;
            }
            ZoneTariffInfo zoneTariffInfo = ((ffx0) gfx0Var).b;
            l7s0Var.getClass();
            return new tis0(zoneTariffInfo.e, b.f(), r2, i);
        }
        pex0 pex0Var = ((efx0) gfx0Var).b;
        l7s0Var.getClass();
        String str = pex0Var.b;
        if (pex0Var.K0) {
            Iterable iterable = pex0Var.U;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            Iterable iterable2 = iterable;
            ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(((pex0) it.next()).b);
            }
            Set b = ((g) l7s0Var.a).b();
            int d = gw00.d(tcc.n(arrayList, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                linkedHashMap.put(next, Boolean.valueOf(b.contains((String) next)));
            }
            map = linkedHashMap;
        } else {
            map = b.f();
        }
        BrandingType brandingType = pex0Var.m0;
        return new tis0(str, map, brandingType == BrandingType.MASTERCARD || brandingType == BrandingType.YA_PLUS_MASTERCARD, i);
    }
}
