package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import xsna.dak0;
import xsna.o6j;
import xsna.us2;
import xsna.v4s;

/* compiled from: CoreTextField.kt */
/* loaded from: classes11.dex */
public final class guj implements cp10 {
    public final /* synthetic */ j1z a;
    public final /* synthetic */ izs<ljo0, s3q0> b;
    public final /* synthetic */ tho0 c;
    public final /* synthetic */ uv70 d;
    public final /* synthetic */ azl e;
    public final /* synthetic */ int f;

    /* JADX WARN: Multi-variable type inference failed */
    public guj(j1z j1zVar, izs<? super ljo0, s3q0> izsVar, tho0 tho0Var, uv70 uv70Var, azl azlVar, int i) {
        this.a = j1zVar;
        this.b = izsVar;
        this.c = tho0Var;
        this.d = uv70Var;
        this.e = azlVar;
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    @Override // xsna.cp10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        long j2;
        j1z j1zVar;
        ljo0 ljo0Var;
        mjo0 mjo0Var;
        ljo0 ljo0Var2;
        ljo0 ljo0Var3;
        ljo0 ljo0Var4;
        guj gujVar;
        j1z j1zVar2;
        int i;
        j1z j1zVar3 = this.a;
        dak0 a = dak0.a.a();
        izs<Object, s3q0> e = a != null ? a.e() : null;
        dak0 b = dak0.a.b(a);
        try {
            mjo0 d = j1zVar3.d();
            ljo0 ljo0Var5 = d != null ? d.a : null;
            sdo0 sdo0Var = j1zVar3.a;
            LayoutDirection layoutDirection = ep10Var.getLayoutDirection();
            int i2 = sdo0Var.f;
            boolean z = sdo0Var.e;
            int i3 = sdo0Var.c;
            if (ljo0Var5 != null) {
                m540 m540Var = ljo0Var5.b;
                kjo0 kjo0Var = ljo0Var5.a;
                us2 us2Var = sdo0Var.a;
                nmo0 nmo0Var = sdo0Var.b;
                List<us2.d<esa0>> list2 = sdo0Var.i;
                azl azlVar = sdo0Var.g;
                v4s.a aVar = sdo0Var.h;
                ljo0 ljo0Var6 = ljo0Var5;
                if (m540Var.a.b()) {
                    j2 = j;
                    j1zVar = j1zVar3;
                } else {
                    us2 us2Var2 = kjo0Var.a;
                    j1zVar = j1zVar3;
                    long j3 = kjo0Var.j;
                    if (epx.f(us2Var2, us2Var) && kjo0Var.b.c(nmo0Var) && epx.f(kjo0Var.c, list2) && kjo0Var.d == i3 && kjo0Var.e == z && kjo0Var.f == i2 && epx.f(kjo0Var.g, azlVar) && kjo0Var.h == layoutDirection && epx.f(kjo0Var.i, aVar) && o6j.k(j) == o6j.k(j3) && ((!z && i2 != 2) || (o6j.i(j) == o6j.i(j3) && o6j.h(j) == o6j.h(j3)))) {
                        ljo0Var3 = new ljo0(new kjo0(kjo0Var.a, sdo0Var.b, kjo0Var.c, kjo0Var.d, kjo0Var.e, kjo0Var.f, kjo0Var.g, kjo0Var.h, kjo0Var.i, j), m540Var, s6j.d(j, (tdo0.a(m540Var.e) & 4294967295L) | (tdo0.a(m540Var.d) << 32)));
                        ljo0Var2 = ljo0Var6;
                        mjo0Var = d;
                        long j4 = ljo0Var3.c;
                        Triple triple = new Triple(Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) (j4 & 4294967295L)), ljo0Var3);
                        int intValue = ((Number) triple.d()).intValue();
                        int intValue2 = ((Number) triple.g()).intValue();
                        ljo0Var4 = (ljo0) triple.h();
                        if (epx.f(ljo0Var2, ljo0Var4)) {
                            j1zVar2 = j1zVar;
                            ((zak0) j1zVar2.i).setValue(new mjo0(ljo0Var4, mjo0Var != null ? mjo0Var.c : null));
                            i = 0;
                            j1zVar2.p = false;
                            gujVar = this;
                            gujVar.b.invoke(ljo0Var4);
                            kuj.f(j1zVar2, gujVar.c, gujVar.d);
                        } else {
                            gujVar = this;
                            j1zVar2 = j1zVar;
                            i = 0;
                        }
                        ((zak0) j1zVar2.g).setValue(new pco(gujVar.e.j1(gujVar.f != 1 ? tdo0.a(ljo0Var4.b.b(i)) : i)));
                        return ep10Var.Q(intValue, intValue2, pn00.k(new Pair(ht1.a, Integer.valueOf(Math.round(ljo0Var4.d))), new Pair(ht1.b, Integer.valueOf(Math.round(ljo0Var4.e)))), new x4(24));
                    }
                    j2 = j;
                }
                ljo0Var = ljo0Var6;
            } else {
                j2 = j;
                j1zVar = j1zVar3;
                ljo0Var = ljo0Var5;
            }
            sdo0Var.a(layoutDirection);
            int k = o6j.k(j2);
            int i4 = ((z || i2 == 2) && o6j.e(j2)) ? o6j.i(j2) : Integer.MAX_VALUE;
            int i5 = (z || i2 != 2) ? i3 : 1;
            if (k != i4) {
                n540 n540Var = sdo0Var.j;
                if (n540Var == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                i4 = swe0.g(tdo0.a(n540Var.a()), k, i4);
            }
            n540 n540Var2 = sdo0Var.j;
            if (n540Var2 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            m540 m540Var2 = new m540(n540Var2, o6j.a.b(0, i4, 0, o6j.h(j2)), i5, sdo0Var.f);
            long d2 = s6j.d(j2, (tdo0.a(m540Var2.d) << 32) | (tdo0.a(m540Var2.e) & 4294967295L));
            ljo0Var2 = ljo0Var;
            mjo0Var = d;
            ljo0Var3 = new ljo0(new kjo0(sdo0Var.a, sdo0Var.b, sdo0Var.i, sdo0Var.c, sdo0Var.e, sdo0Var.f, sdo0Var.g, layoutDirection, sdo0Var.h, j2), m540Var2, d2);
            long j42 = ljo0Var3.c;
            Triple triple2 = new Triple(Integer.valueOf((int) (j42 >> 32)), Integer.valueOf((int) (j42 & 4294967295L)), ljo0Var3);
            int intValue3 = ((Number) triple2.d()).intValue();
            int intValue22 = ((Number) triple2.g()).intValue();
            ljo0Var4 = (ljo0) triple2.h();
            if (epx.f(ljo0Var2, ljo0Var4)) {
            }
            ((zak0) j1zVar2.g).setValue(new pco(gujVar.e.j1(gujVar.f != 1 ? tdo0.a(ljo0Var4.b.b(i)) : i)));
            return ep10Var.Q(intValue3, intValue22, pn00.k(new Pair(ht1.a, Integer.valueOf(Math.round(ljo0Var4.d))), new Pair(ht1.b, Integer.valueOf(Math.round(ljo0Var4.e)))), new x4(24));
        } finally {
            dak0.a.d(a, b, e);
        }
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        j1z j1zVar = this.a;
        j1zVar.a.a(apxVar.getLayoutDirection());
        n540 n540Var = j1zVar.a.j;
        if (n540Var != null) {
            return tdo0.a(n540Var.a());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
