package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ur7;

/* compiled from: BookingMastersScreen.kt */
/* loaded from: classes18.dex */
public final class mr7 {
    public static final void a(final or7 or7Var, final Object obj, final yw90 yw90Var, final View view, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1809074375);
        int i2 = (M.J(or7Var) ? 4 : 2) | i | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(view) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1809074375, i2, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen (BookingMastersScreen.kt:53)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new h5(or7Var, 10);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            boolean z2 = (i2 & 57344) == 16384;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new kr7(izsVar, null);
                M.R(x2);
            }
            r37.a(izsVar2, (yzs) x2, kai.c(171245948, new zzs() { // from class: xsna.hr7
                @Override // xsna.zzs
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    final z37 z37Var = (z37) obj2;
                    final ur7 ur7Var = (ur7) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 6) == 0) {
                        i3 = (aVar2.J(z37Var) ? 4 : 2) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i3 |= aVar2.J(ur7Var) ? 32 : 16;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(171245948, i3, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen.<anonymous> (BookingMastersScreen.kt:64)");
                        }
                        emi emiVar = emi.e;
                        final Object obj6 = obj;
                        final yw90 yw90Var2 = yw90Var;
                        final View view2 = view;
                        emiVar.g(6, aVar2, kai.c(34918554, new wzs() { // from class: xsna.jr7
                            @Override // xsna.wzs
                            public final Object invoke(Object obj7, Object obj8) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(34918554, intValue2, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen.<anonymous>.<anonymous> (BookingMastersScreen.kt:65)");
                                    }
                                    z37 z37Var2 = z37Var;
                                    boolean J = aVar3.J(z37Var2);
                                    Object x3 = aVar3.x();
                                    if (J || x3 == a.C0011a.a) {
                                        x3 = new tb(z37Var2, 15);
                                        aVar3.R(x3);
                                    }
                                    mr7.b(ur7.this, obj6, yw90Var2, view2, (izs) x3, aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(obj, yw90Var, view, izsVar, i) { // from class: xsna.ir7
                public final /* synthetic */ Object c;
                public final /* synthetic */ yw90 d;
                public final /* synthetic */ View e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    mr7.a(or7.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final ur7 ur7Var, final Object obj, final yw90 yw90Var, final View view, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1797256210);
        int i2 = i | (M.J(ur7Var) ? 4 : 2) | (M.J(obj) ? 32 : 16) | (M.J(yw90Var) ? 256 : 128) | (M.y(view) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1797256210, i2, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen (BookingMastersScreen.kt:86)");
            }
            jai c = kai.c(2004448985, new com.vk.movika.sdk.android.defaultplayer.control.n(izsVar, 2), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(null, c, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-1075099282, new yzs() { // from class: xsna.er7
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1075099282, intValue, -1, "com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreen.<anonymous> (BookingMastersScreen.kt:113)");
                        }
                        ur7 ur7Var2 = ur7.this;
                        boolean z = ur7Var2 instanceof ur7.d;
                        q630.a aVar3 = q630.a.a;
                        izs izsVar2 = izsVar;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (z) {
                            aVar2.K(-711494415);
                            q630 D = p490.D(aVar3, p490.x(aVar2), 14);
                            a.m mVar = androidx.compose.foundation.layout.a.c;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                            int hashCode = Long.hashCode(n34.n(aVar2));
                            sy90 D2 = aVar2.D();
                            q630 c2 = qri.c(aVar2, D);
                            cri.h7.getClass();
                            LayoutNode.a aVar4 = cri.a.b;
                            if (aVar2.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar2.H();
                            if (aVar2.L()) {
                                aVar2.I(aVar4);
                            } else {
                                aVar2.f();
                            }
                            k9q0.w(aVar2, a, cri.a.f);
                            k9q0.w(aVar2, D2, cri.a.e);
                            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar2, cri.a.h);
                            k9q0.w(aVar2, c2, cri.a.d);
                            q630 E = ahn.E(aVar3, "any_master_cell");
                            com.vk.core.compose.component.cell.content.u0 a2 = o.b.a.a(null, null, 0L, false, aVar2, 196608, 31);
                            boolean J = aVar2.J(izsVar2);
                            Object x = aVar2.x();
                            if (J || x == c0012a) {
                                x = new gr7(izsVar2, 0);
                                aVar2.R(x);
                            }
                            androidx.compose.runtime.a aVar5 = aVar2;
                            pm7.a(E, a2, (gzs) x, aVar5, 6, 0);
                            float f = 4;
                            int i3 = 6;
                            f9t.e(txj0.h(aVar3, f), aVar5, 6);
                            aVar5.K(-374069499);
                            for (BookingMaster bookingMaster : ((ur7.d) ur7Var2).b) {
                                boolean J2 = aVar5.J(izsVar2) | aVar5.J(bookingMaster);
                                Object x2 = aVar5.x();
                                if (J2 || x2 == c0012a) {
                                    x2 = new yq1(1, izsVar2, bookingMaster);
                                    aVar5.R(x2);
                                }
                                q630.a aVar6 = aVar3;
                                q630 c3 = ojc.c(aVar6, false, null, null, (gzs) x2, 15);
                                int i4 = i3;
                                androidx.compose.runtime.a aVar7 = aVar5;
                                aVar5 = aVar7;
                                vq7.a(bookingMaster, c3, o.b.a.a(null, null, 0L, false, aVar7, 196608, 31), aVar5, 0, 0);
                                f9t.e(txj0.h(aVar6, f), aVar5, i4);
                                aVar3 = aVar6;
                                i3 = i4;
                            }
                            int i5 = i3;
                            androidx.compose.runtime.a aVar8 = aVar5;
                            aVar8.j();
                            aVar8.G();
                            s3q0 s3q0Var = s3q0.a;
                            Object obj5 = obj;
                            boolean J3 = aVar8.J(obj5);
                            View view2 = view;
                            boolean y = J3 | aVar8.y(view2);
                            yw90 yw90Var2 = yw90Var;
                            boolean J4 = y | aVar8.J(yw90Var2);
                            Object x3 = aVar8.x();
                            if (J4 || x3 == c0012a) {
                                x3 = new lr7(obj5, view2, yw90Var2, null);
                                aVar8.R(x3);
                            }
                            bap.g(s3q0Var, (wzs) x3, aVar8, i5);
                            aVar8.j();
                        } else if (ur7Var2 instanceof ur7.b) {
                            aVar2.K(-710467261);
                            com.vk.ecomm.onlinebooking.impl.common.a aVar9 = ((ur7.b) ur7Var2).b.a;
                            boolean J5 = aVar2.J(izsVar2) | aVar2.J(ur7Var2);
                            Object x4 = aVar2.x();
                            if (J5 || x4 == c0012a) {
                                x4 = new ss3(3, izsVar2, ur7Var2);
                                aVar2.R(x4);
                            }
                            iq7.a(aVar9, (gzs) x4, aVar2, 0);
                            aVar2.j();
                        } else if (epx.f(ur7Var2, ur7.c.b)) {
                            aVar2.K(-710289073);
                            zfr0.f(SpinnerState.Loading, txj0.d(aVar3, 1.0f), null, 0L, SpinnerSize.Size56, null, aVar2, 24630, 44);
                            aVar2.j();
                        } else {
                            if (!epx.f(ur7Var2, ur7.a.b)) {
                                throw alb0.c(1916710125, aVar2);
                            }
                            aVar2.K(1916755282);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805306416, 381);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(obj, yw90Var, view, izsVar, i) { // from class: xsna.fr7
                public final /* synthetic */ Object c;
                public final /* synthetic */ yw90 d;
                public final /* synthetic */ View e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    mr7.b(ur7.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
