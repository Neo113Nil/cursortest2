package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.kla1;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ohb1;
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
import defpackage.yd00;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class g {
    public static final void a(final b bVar, final tls tlsVar, fid fidVar, final int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1750593111);
        final int i2 = 4;
        int i3 = (btsVar.k(bVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if ((i3 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            t viewModelFactory = bVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final e0 e0Var = (e0) ooc.G(qoi0.a(e0.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            oz40 b = androidx.compose.runtime.f.b(e0Var.c, btsVar);
            BouncerActivity.a aVar = new BouncerActivity.a();
            btsVar.e0(1912393976);
            boolean e = btsVar.e(e0Var);
            Object Q = btsVar.Q();
            Object obj = did.a;
            final int i4 = 0;
            if (e || Q == obj) {
                Q = new tls() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        e0 e0Var2 = e0Var;
                        switch (i5) {
                            case 0:
                                com.yandex.passport.api.w wVar = (com.yandex.passport.api.w) obj2;
                                if (!(wVar instanceof com.yandex.passport.api.u)) {
                                    if (!(wVar instanceof com.yandex.passport.api.q)) {
                                        if (!(wVar instanceof com.yandex.passport.api.s)) {
                                            if (!(wVar instanceof com.yandex.passport.api.t)) {
                                                e0Var2.W(new z(new IllegalStateException("Unsupported bouncer answer: " + wVar)));
                                                break;
                                            } else {
                                                e0Var2.W(w.a);
                                                break;
                                            }
                                        } else {
                                            e0Var2.W(new z(((com.yandex.passport.api.s) wVar).a));
                                            break;
                                        }
                                    } else {
                                        e0Var2.W(v.a);
                                        break;
                                    }
                                } else {
                                    e0Var2.W(x.a);
                                    break;
                                }
                            case 1:
                                e0Var2.W(new b0((com.yandex.passport.sloth.a1) obj2));
                                break;
                            case 2:
                                e0Var2.W(new a0((com.yandex.passport.sloth.i0) obj2));
                                break;
                            case 3:
                                e0Var2.W(new c0((SlothUiWish) obj2));
                                break;
                            default:
                                e0Var2.W((d0) obj2);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            btsVar.t(false);
            yd00 e2 = kla1.e(aVar, (tls) Q, btsVar, 0);
            kotlinx.coroutines.flow.b bVar2 = e0Var.w;
            btsVar.e0(1912417872);
            boolean e3 = btsVar.e(e2) | ((i3 & 14) == 4);
            Object Q2 = btsVar.Q();
            if (e3 || Q2 == obj) {
                Q2 = new DeleteAccountScreenKt$DeleteAccountScreen$1$1(e2, bVar, null);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar2, (wls) Q2, btsVar, 0);
            k1 k1Var = ((u) b.getValue()).b;
            btsVar.e0(1912430670);
            if (k1Var != null) {
                k1 k1Var2 = ((u) b.getValue()).b;
                btsVar.e0(1221247026);
                boolean e4 = ((i3 & 112) == 32) | btsVar.e(k1Var);
                Object Q3 = btsVar.Q();
                if (e4 || Q3 == obj) {
                    Q3 = new DeleteAccountScreenKt$DeleteAccountScreen$2$1$1(tlsVar, k1Var, null);
                    btsVar.o0(Q3);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q3, k1Var2);
            }
            btsVar.t(false);
            r rVar = ((u) b.getValue()).a;
            q qVar = rVar instanceof q ? (q) rVar : null;
            btsVar.e0(1912436472);
            if (qVar != null) {
                SlothParams slothParams = qVar.a;
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = bVar.getSlothScreenComponentBuilder();
                btsVar.e0(1221256408);
                boolean e5 = btsVar.e(e0Var);
                Object Q4 = btsVar.Q();
                if (e5 || Q4 == obj) {
                    final int i5 = 1;
                    Q4 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i52 = i5;
                            zy11 zy11Var = zy11.a;
                            e0 e0Var2 = e0Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.api.w wVar = (com.yandex.passport.api.w) obj2;
                                    if (!(wVar instanceof com.yandex.passport.api.u)) {
                                        if (!(wVar instanceof com.yandex.passport.api.q)) {
                                            if (!(wVar instanceof com.yandex.passport.api.s)) {
                                                if (!(wVar instanceof com.yandex.passport.api.t)) {
                                                    e0Var2.W(new z(new IllegalStateException("Unsupported bouncer answer: " + wVar)));
                                                    break;
                                                } else {
                                                    e0Var2.W(w.a);
                                                    break;
                                                }
                                            } else {
                                                e0Var2.W(new z(((com.yandex.passport.api.s) wVar).a));
                                                break;
                                            }
                                        } else {
                                            e0Var2.W(v.a);
                                            break;
                                        }
                                    } else {
                                        e0Var2.W(x.a);
                                        break;
                                    }
                                case 1:
                                    e0Var2.W(new b0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 2:
                                    e0Var2.W(new a0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                case 3:
                                    e0Var2.W(new c0((SlothUiWish) obj2));
                                    break;
                                default:
                                    e0Var2.W((d0) obj2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q4);
                }
                tls tlsVar2 = (tls) Q4;
                btsVar.t(false);
                btsVar.e0(1221258977);
                boolean e6 = btsVar.e(e0Var);
                Object Q5 = btsVar.Q();
                if (e6 || Q5 == obj) {
                    final int i6 = 2;
                    Q5 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i52 = i6;
                            zy11 zy11Var = zy11.a;
                            e0 e0Var2 = e0Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.api.w wVar = (com.yandex.passport.api.w) obj2;
                                    if (!(wVar instanceof com.yandex.passport.api.u)) {
                                        if (!(wVar instanceof com.yandex.passport.api.q)) {
                                            if (!(wVar instanceof com.yandex.passport.api.s)) {
                                                if (!(wVar instanceof com.yandex.passport.api.t)) {
                                                    e0Var2.W(new z(new IllegalStateException("Unsupported bouncer answer: " + wVar)));
                                                    break;
                                                } else {
                                                    e0Var2.W(w.a);
                                                    break;
                                                }
                                            } else {
                                                e0Var2.W(new z(((com.yandex.passport.api.s) wVar).a));
                                                break;
                                            }
                                        } else {
                                            e0Var2.W(v.a);
                                            break;
                                        }
                                    } else {
                                        e0Var2.W(x.a);
                                        break;
                                    }
                                case 1:
                                    e0Var2.W(new b0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 2:
                                    e0Var2.W(new a0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                case 3:
                                    e0Var2.W(new c0((SlothUiWish) obj2));
                                    break;
                                default:
                                    e0Var2.W((d0) obj2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q5);
                }
                tls tlsVar3 = (tls) Q5;
                btsVar.t(false);
                btsVar.e0(1221261684);
                boolean e7 = btsVar.e(e0Var);
                Object Q6 = btsVar.Q();
                if (e7 || Q6 == obj) {
                    final int i7 = 3;
                    Q6 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i52 = i7;
                            zy11 zy11Var = zy11.a;
                            e0 e0Var2 = e0Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.api.w wVar = (com.yandex.passport.api.w) obj2;
                                    if (!(wVar instanceof com.yandex.passport.api.u)) {
                                        if (!(wVar instanceof com.yandex.passport.api.q)) {
                                            if (!(wVar instanceof com.yandex.passport.api.s)) {
                                                if (!(wVar instanceof com.yandex.passport.api.t)) {
                                                    e0Var2.W(new z(new IllegalStateException("Unsupported bouncer answer: " + wVar)));
                                                    break;
                                                } else {
                                                    e0Var2.W(w.a);
                                                    break;
                                                }
                                            } else {
                                                e0Var2.W(new z(((com.yandex.passport.api.s) wVar).a));
                                                break;
                                            }
                                        } else {
                                            e0Var2.W(v.a);
                                            break;
                                        }
                                    } else {
                                        e0Var2.W(x.a);
                                        break;
                                    }
                                case 1:
                                    e0Var2.W(new b0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 2:
                                    e0Var2.W(new a0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                case 3:
                                    e0Var2.W(new c0((SlothUiWish) obj2));
                                    break;
                                default:
                                    e0Var2.W((d0) obj2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q6);
                }
                btsVar.t(false);
                com.yandex.passport.internal.ui.sloth.screen.g.a(slothParams, slothScreenComponentBuilder, tlsVar2, tlsVar3, (tls) Q6, bVar.getProperties().d, btsVar, 0, 0);
                btsVar.t(false);
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wls(bVar, tlsVar, i, i4) { // from class: com.yandex.passport.internal.ui.challenge.delete.f
                        public final /* synthetic */ int a;
                        public final /* synthetic */ b b;
                        public final /* synthetic */ tls c;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i8 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar4 = this.c;
                            b bVar3 = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i8) {
                                case 0:
                                    g.a(bVar3, tlsVar4, fidVar2, vng.O(1));
                                    break;
                                default:
                                    g.a(bVar3, tlsVar4, fidVar2, vng.O(1));
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
            r rVar2 = ((u) b.getValue()).a;
            p pVar = rVar2 instanceof p ? (p) rVar2 : null;
            btsVar.e0(1912454355);
            if (pVar != null) {
                btsVar.e0(1221271042);
                boolean e8 = btsVar.e(e0Var);
                Object Q7 = btsVar.Q();
                if (e8 || Q7 == obj) {
                    Q7 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.delete.e
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i52 = i2;
                            zy11 zy11Var = zy11.a;
                            e0 e0Var2 = e0Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.api.w wVar = (com.yandex.passport.api.w) obj2;
                                    if (!(wVar instanceof com.yandex.passport.api.u)) {
                                        if (!(wVar instanceof com.yandex.passport.api.q)) {
                                            if (!(wVar instanceof com.yandex.passport.api.s)) {
                                                if (!(wVar instanceof com.yandex.passport.api.t)) {
                                                    e0Var2.W(new z(new IllegalStateException("Unsupported bouncer answer: " + wVar)));
                                                    break;
                                                } else {
                                                    e0Var2.W(w.a);
                                                    break;
                                                }
                                            } else {
                                                e0Var2.W(new z(((com.yandex.passport.api.s) wVar).a));
                                                break;
                                            }
                                        } else {
                                            e0Var2.W(v.a);
                                            break;
                                        }
                                    } else {
                                        e0Var2.W(x.a);
                                        break;
                                    }
                                case 1:
                                    e0Var2.W(new b0((com.yandex.passport.sloth.a1) obj2));
                                    break;
                                case 2:
                                    e0Var2.W(new a0((com.yandex.passport.sloth.i0) obj2));
                                    break;
                                case 3:
                                    e0Var2.W(new c0((SlothUiWish) obj2));
                                    break;
                                default:
                                    e0Var2.W((d0) obj2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q7);
                }
                btsVar.t(false);
                b((tls) Q7, btsVar, 0);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.progress.g gVar = bVar.getProperties().b;
            com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
            btsVar = btsVar;
            com.yandex.passport.common.ui.progress.p.d(null, gVar, false, btsVar, 0, 5);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i8 = 1;
            v2.d = new wls(bVar, tlsVar, i, i8) { // from class: com.yandex.passport.internal.ui.challenge.delete.f
                public final /* synthetic */ int a;
                public final /* synthetic */ b b;
                public final /* synthetic */ tls c;

                {
                    this.a = i8;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i82 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar4 = this.c;
                    b bVar3 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    switch (i82) {
                        case 0:
                            g.a(bVar3, tlsVar4, fidVar2, vng.O(1));
                            break;
                        default:
                            g.a(bVar3, tlsVar4, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void b(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(368269440);
        int i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && btsVar.E()) {
            btsVar.Y();
        } else {
            String e = ohb1.e(btsVar, R.string.passport_phonish_permanent_deletion_alert_text);
            String e2 = ohb1.e(btsVar, R.string.passport_native_to_browser_prompt_confirmation_title);
            String e3 = ohb1.e(btsVar, R.string.passport_native_to_browser_prompt_refusal_title);
            btsVar.e0(666560275);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new com.yandex.passport.internal.flags.presentation.x(9, tlsVar);
                btsVar.o0(Q);
            }
            sls slsVar = (sls) Q;
            btsVar.t(false);
            btsVar.e0(666566060);
            boolean z2 = i3 == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new com.yandex.passport.internal.flags.presentation.x(10, tlsVar);
                btsVar.o0(Q2);
            }
            sls slsVar2 = (sls) Q2;
            btsVar.t(false);
            btsVar.e0(666568108);
            boolean z3 = i3 == 4;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new com.yandex.passport.internal.flags.presentation.x(11, tlsVar);
                btsVar.o0(Q3);
            }
            btsVar.t(false);
            com.yandex.passport.internal.properties.u.b(e, e2, e3, false, false, slsVar, slsVar2, (sls) Q3, btsVar, 0);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new com.yandex.passport.internal.ui.bouncer.error.n(tlsVar, i, 1);
        }
    }
}
