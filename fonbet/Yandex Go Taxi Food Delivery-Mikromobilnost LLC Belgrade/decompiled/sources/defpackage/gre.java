package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.layout.k;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class gre implements z910 {
    public final /* synthetic */ oay a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ hoy0 c;
    public final /* synthetic */ iv60 d;
    public final /* synthetic */ fwi e;
    public final /* synthetic */ int f;

    public gre(oay oayVar, tls tlsVar, hoy0 hoy0Var, iv60 iv60Var, fwi fwiVar, int i) {
        this.a = oayVar;
        this.b = tlsVar;
        this.c = hoy0Var;
        this.d = iv60Var;
        this.e = fwiVar;
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [rzx] */
    /* JADX WARN: Type inference failed for: r14v6 */
    @Override // defpackage.z910
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final aa10 b(k kVar, List list, long j) {
        long j2;
        dry0 dry0Var;
        LayoutDirection layoutDirection;
        aa10 aa10Var;
        dry0 dry0Var2;
        dry0 dry0Var3;
        int i;
        gre greVar;
        oay oayVar = this.a;
        i2t0 D = tje.D();
        tls e = D != null ? D.e() : null;
        i2t0 O = tje.O(D);
        try {
            ery0 d = oayVar.d();
            dry0 dry0Var4 = d != null ? d.a : null;
            tly0 tly0Var = oayVar.a;
            LayoutDirection layoutDirection2 = kVar.getLayoutDirection();
            int i2 = tly0Var.f;
            boolean z = tly0Var.e;
            int i3 = tly0Var.c;
            if (dry0Var4 != null) {
                hm40 hm40Var = dry0Var4.b;
                cry0 cry0Var = dry0Var4.a;
                kk2 kk2Var = tly0Var.a;
                ety0 ety0Var = tly0Var.b;
                List list2 = tly0Var.i;
                aa10Var = null;
                fwi fwiVar = tly0Var.g;
                dyr dyrVar = tly0Var.h;
                dry0 dry0Var5 = dry0Var4;
                if (hm40Var.a.a()) {
                    j2 = j;
                    layoutDirection = layoutDirection2;
                } else {
                    kk2 kk2Var2 = cry0Var.a;
                    long j3 = cry0Var.j;
                    if (jl40.l(kk2Var2, kk2Var) && cry0Var.b.c(ety0Var) && jl40.l(cry0Var.c, list2) && cry0Var.d == i3 && cry0Var.e == z && cry0Var.f == i2 && jl40.l(cry0Var.g, fwiVar)) {
                        layoutDirection = layoutDirection2;
                        if (cry0Var.h == layoutDirection && jl40.l(cry0Var.i, dyrVar) && n8e.k(j) == n8e.k(j3) && ((!z && i2 != 2) || (n8e.i(j) == n8e.i(j3) && n8e.h(j) == n8e.h(j3)))) {
                            dry0Var = dry0Var5;
                            dry0Var2 = new dry0(new cry0(cry0Var.a, tly0Var.b, cry0Var.c, cry0Var.d, cry0Var.e, cry0Var.f, cry0Var.g, cry0Var.h, cry0Var.i, j), hm40Var, p8e.d(j, (jlb1.a(hm40Var.e) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (jlb1.a(hm40Var.d) << 32)));
                            long j4 = dry0Var2.c;
                            Triple triple = new Triple(Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), dry0Var2);
                            int intValue = ((Number) triple.getFirst()).intValue();
                            int intValue2 = ((Number) triple.getSecond()).intValue();
                            dry0Var3 = (dry0) triple.getThird();
                            if (jl40.l(dry0Var, dry0Var3)) {
                                oayVar.i.setValue(new ery0(dry0Var3, d != null ? d.c : aa10Var));
                                i = 0;
                                oayVar.p = false;
                                greVar = this;
                                greVar.b.invoke(dry0Var3);
                                c.g(oayVar, greVar.c, greVar.d);
                            } else {
                                i = 0;
                                greVar = this;
                            }
                            oayVar.g.setValue(new y7m(greVar.e.H(greVar.f != 1 ? jlb1.a(dry0Var3.b.b(i)) : i)));
                            return kVar.w(intValue, intValue2, b.i(new Pair(a.a, Integer.valueOf(Math.round(dry0Var3.d))), new Pair(a.b, Integer.valueOf(Math.round(dry0Var3.e)))), new p0u(5));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        dry0Var = dry0Var5;
                        layoutDirection = layoutDirection2;
                    }
                }
                dry0Var = dry0Var5;
            } else {
                j2 = j;
                dry0Var = dry0Var4;
                layoutDirection = layoutDirection2;
                aa10Var = null;
            }
            tly0Var.a(layoutDirection);
            int k = n8e.k(j2);
            int i4 = ((z || i2 == 2) && n8e.e(j2)) ? n8e.i(j2) : Integer.MAX_VALUE;
            int i5 = (z || i2 != 2) ? i3 : 1;
            if (k != i4) {
                xv10 xv10Var = tly0Var.j;
                if (xv10Var == null) {
                    ny61.r("layoutIntrinsics must be called first");
                    return aa10Var;
                }
                i4 = y6i0.d(jlb1.a(xv10Var.d()), k, i4);
            }
            xv10 xv10Var2 = tly0Var.j;
            if (xv10Var2 == null) {
                ny61.r("layoutIntrinsics must be called first");
                return aa10Var;
            }
            dry0Var2 = new dry0(new cry0(tly0Var.a, tly0Var.b, tly0Var.i, tly0Var.c, tly0Var.e, tly0Var.f, tly0Var.g, layoutDirection, tly0Var.h, j2), new hm40(xv10Var2, qje.m(0, i4, 0, n8e.h(j2)), i5, tly0Var.f), p8e.d(j2, (jlb1.a(r25.d) << 32) | (jlb1.a(r25.e) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            long j42 = dry0Var2.c;
            Triple triple2 = new Triple(Integer.valueOf((int) (j42 >> 32)), Integer.valueOf((int) (j42 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), dry0Var2);
            int intValue3 = ((Number) triple2.getFirst()).intValue();
            int intValue22 = ((Number) triple2.getSecond()).intValue();
            dry0Var3 = (dry0) triple2.getThird();
            if (jl40.l(dry0Var, dry0Var3)) {
            }
            oayVar.g.setValue(new y7m(greVar.e.H(greVar.f != 1 ? jlb1.a(dry0Var3.b.b(i)) : i)));
            return kVar.w(intValue3, intValue22, b.i(new Pair(a.a, Integer.valueOf(Math.round(dry0Var3.d))), new Pair(a.b, Integer.valueOf(Math.round(dry0Var3.e)))), new p0u(5));
        } finally {
            tje.W(D, O, e);
        }
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        oay oayVar = this.a;
        oayVar.a.a(yuwVar.getLayoutDirection());
        xv10 xv10Var = oayVar.a.j;
        if (xv10Var != null) {
            return jlb1.a(xv10Var.d());
        }
        ny61.r("layoutIntrinsics must be called first");
        return 0;
    }
}
