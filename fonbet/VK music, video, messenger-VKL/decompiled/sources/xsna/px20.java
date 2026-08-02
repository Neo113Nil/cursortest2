package xsna;

import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ModalBottomSheet.kt */
/* loaded from: classes11.dex */
public final class px20 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ gdj0 b;
    public final /* synthetic */ gzs<s3q0> c;
    public final /* synthetic */ yvj d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ jai i;

    /* compiled from: ModalBottomSheet.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Expanded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public px20(gdj0 gdj0Var, gzs gzsVar, yvj yvjVar, boolean z, String str, String str2, String str3, jai jaiVar) {
        this.b = gdj0Var;
        this.c = gzsVar;
        this.d = yvjVar;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2000500644, intValue, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:383)");
            }
            final gdj0 gdj0Var = this.b;
            boolean J = aVar2.J(gdj0Var);
            gzs<s3q0> gzsVar = this.c;
            boolean J2 = J | aVar2.J(gzsVar);
            yvj yvjVar = this.d;
            boolean y = J2 | aVar2.y(yvjVar);
            Object x = aVar2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new ywc(gdj0Var, gzsVar, yvjVar, 2);
                aVar2.R(x);
            }
            q630 a2 = qri.a(q630.a.a, a5x.a, new t26((gzs) x, 1));
            boolean J3 = aVar2.J(gzsVar) | aVar2.l(this.e) | aVar2.J(gdj0Var) | aVar2.J(this.f) | aVar2.J(this.g) | aVar2.y(yvjVar) | aVar2.J(this.h);
            Object x2 = aVar2.x();
            if (J3 || x2 == c0012a) {
                final boolean z = this.e;
                final String str = this.f;
                final String str2 = this.g;
                final String str3 = this.h;
                final gzs<s3q0> gzsVar2 = this.c;
                final yvj yvjVar2 = this.d;
                izs izsVar = new izs() { // from class: xsna.kx20
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        tgi0 tgi0Var = (tgi0) obj;
                        if (z) {
                            ef4 ef4Var = new ef4(2, gzsVar2);
                            qcy<Object>[] qcyVarArr = qgi0.a;
                            tgi0Var.a(wfi0.v, new ck(str, ef4Var));
                            gdj0 gdj0Var2 = gdj0Var;
                            SheetValue sheetValue = (SheetValue) ((zak0) gdj0Var2.d.g).getValue();
                            SheetValue sheetValue2 = SheetValue.PartiallyExpanded;
                            yvj yvjVar3 = yvjVar2;
                            if (sheetValue == sheetValue2) {
                                tgi0Var.a(wfi0.t, new ck(str2, new yb3(gdj0Var2, yvjVar3, gdj0Var2, 6)));
                            } else if (gdj0Var2.d.e().f(sheetValue2)) {
                                tgi0Var.a(wfi0.u, new ck(str3, new xk(19, gdj0Var2, yvjVar3)));
                            }
                        }
                        return s3q0.a;
                    }
                };
                aVar2.R(izsVar);
                x2 = izsVar;
            }
            q630 b = egi0.b(a2, true, (izs) x2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            if (er.f(0, aVar2, this.i)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
