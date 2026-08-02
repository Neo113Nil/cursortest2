package com.yandex.passport.internal.ui.sloth.plusdevices;

import androidx.core.app.a1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.aii0;
import defpackage.bts;
import defpackage.cvw;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.w8f;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class r {
    public static final void a(final b bVar, final sls slsVar, final tls tlsVar, fid fidVar, final int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-825957899);
        int i2 = i | (btsVar2.k(bVar) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        if ((i2 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            j0 viewModelFactory = bVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            btsVar = btsVar2;
            final q0 q0Var = (q0) ooc.G(qoi0.a(q0.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            oz40 b = androidx.compose.runtime.f.b(q0Var.c, btsVar);
            final int i3 = 0;
            Object[] objArr = new Object[0];
            btsVar.e0(-346409598);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = new a1(22);
                btsVar.o0(Q);
            }
            btsVar.t(false);
            oz40 oz40Var = (oz40) cvw.V(objArr, (sls) Q, btsVar, 48);
            kotlinx.coroutines.flow.b bVar2 = q0Var.w;
            btsVar.e0(-346407424);
            final int i4 = 1;
            boolean z = (i2 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z || Q2 == obj) {
                Q2 = new ManagingPlusDevicesScreenKt$ManagingPlusDevicesScreen$1$1(slsVar, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar2, (wls) Q2, btsVar, 0);
            btsVar.e0(-346402793);
            boolean k = btsVar.k(oz40Var);
            Object Q3 = btsVar.Q();
            if (k || Q3 == obj) {
                Q3 = new ManagingPlusDevicesScreenKt$ManagingPlusDevicesScreen$2$1(oz40Var, null);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            zpn.e(btsVar, (wls) Q3, zy11.a);
            Integer num = ((k0) b.getValue()).a;
            btsVar.e0(-346399498);
            if (num != null) {
                int intValue = num.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                btsVar.e0(312193048);
                boolean c = ((i2 & 896) == 256) | btsVar.c(intValue);
                Object Q4 = btsVar.Q();
                if (c || Q4 == obj) {
                    Q4 = new ManagingPlusDevicesScreenKt$ManagingPlusDevicesScreen$3$1$1(tlsVar, intValue, null);
                    btsVar.o0(Q4);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q4, valueOf);
            }
            btsVar.t(false);
            ((k0) b.getValue()).getClass();
            btsVar.e0(-346395298);
            btsVar.t(false);
            SlothParams slothParams = ((k0) b.getValue()).b;
            btsVar.e0(-346387443);
            if (slothParams != null) {
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                btsVar.e0(312208726);
                boolean e = btsVar.e(q0Var);
                Object Q5 = btsVar.Q();
                if (e || Q5 == obj) {
                    Q5 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.p
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            q0 q0Var2 = q0Var;
                            switch (i5) {
                                case 0:
                                    q0Var2.W(new o0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 1:
                                    q0Var2.W(new m0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                default:
                                    q0Var2.W(new n0((SlothUiWish) obj2));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q5);
                }
                tls tlsVar2 = (tls) Q5;
                btsVar.t(false);
                btsVar.e0(312211295);
                boolean e2 = btsVar.e(q0Var);
                Object Q6 = btsVar.Q();
                if (e2 || Q6 == obj) {
                    Q6 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.p
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            q0 q0Var2 = q0Var;
                            switch (i5) {
                                case 0:
                                    q0Var2.W(new o0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 1:
                                    q0Var2.W(new m0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                default:
                                    q0Var2.W(new n0((SlothUiWish) obj2));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q6);
                }
                tls tlsVar3 = (tls) Q6;
                btsVar.t(false);
                btsVar.e0(312214010);
                boolean e3 = btsVar.e(q0Var);
                Object Q7 = btsVar.Q();
                if (e3 || Q7 == obj) {
                    final int i5 = 2;
                    Q7 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.p
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i52 = i5;
                            zy11 zy11Var = zy11.a;
                            q0 q0Var2 = q0Var;
                            switch (i52) {
                                case 0:
                                    q0Var2.W(new o0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 1:
                                    q0Var2.W(new m0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                default:
                                    q0Var2.W(new n0((SlothUiWish) obj2));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q7);
                }
                btsVar.t(false);
                com.yandex.passport.internal.ui.sloth.screen.g.a(slothParams, slothScreenComponentBuilder, tlsVar2, tlsVar3, (tls) Q7, null, btsVar, 0, 32);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i6 = 0;
                    v.d = new wls(bVar, slsVar, tlsVar, i, i6) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.q
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ tls w;

                        {
                            this.a = i6;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i7 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar4 = this.w;
                            sls slsVar2 = this.c;
                            b bVar3 = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i7) {
                                case 0:
                                    r.a(bVar3, slsVar2, tlsVar4, fidVar2, vng.O(1));
                                    break;
                                default:
                                    r.a(bVar3, slsVar2, tlsVar4, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar.t(false);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                com.yandex.passport.common.ui.progress.g progressProperties = bVar.getProgressProperties();
                com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
                com.yandex.passport.common.ui.progress.p.d(null, progressProperties, false, btsVar, 384, 1);
                btsVar = btsVar;
            }
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i7 = 1;
            v2.d = new wls(bVar, slsVar, tlsVar, i, i7) { // from class: com.yandex.passport.internal.ui.sloth.plusdevices.q
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ tls w;

                {
                    this.a = i7;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i72 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar4 = this.w;
                    sls slsVar2 = this.c;
                    b bVar3 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    switch (i72) {
                        case 0:
                            r.a(bVar3, slsVar2, tlsVar4, fidVar2, vng.O(1));
                            break;
                        default:
                            r.a(bVar3, slsVar2, tlsVar4, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
