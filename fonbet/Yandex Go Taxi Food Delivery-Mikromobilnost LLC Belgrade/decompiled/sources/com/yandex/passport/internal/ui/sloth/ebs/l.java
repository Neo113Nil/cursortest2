package com.yandex.passport.internal.ui.sloth.ebs;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.i50;
import defpackage.kla1;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.pey;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wls;
import defpackage.x40;
import defpackage.yd00;
import defpackage.zpn;
import defpackage.zy11;

/* loaded from: classes2.dex */
public abstract class l {
    public static final void a(final d dVar, final sls slsVar, final wls wlsVar, fid fidVar, final int i) {
        Object obj;
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1887177817);
        int i3 = i | (btsVar2.k(dVar) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.e(wlsVar) ? 256 : 128);
        if ((i3 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            m0 viewModelFactory = dVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final b1 b1Var = (b1) ooc.G(qoi0.a(b1.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
            oz40 b = androidx.compose.runtime.f.b(b1Var.x, btsVar2);
            Object obj2 = (pey) btsVar2.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Context context = (Context) btsVar2.m(AndroidCompositionLocals_androidKt.b);
            x40 b2 = dVar.getBiometricApi().b();
            btsVar2.e0(-438542016);
            boolean e = btsVar2.e(b1Var);
            Object Q = btsVar2.Q();
            Object obj3 = did.a;
            final int i4 = 0;
            if (e || Q == obj3) {
                Q = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        b1 b1Var2 = b1Var;
                        switch (i5) {
                            case 0:
                                com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                    if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                        if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                        }
                                    } else {
                                        Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                        b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                    }
                                } else {
                                    b1Var2.W(p0.a);
                                }
                                break;
                            case 1:
                                if (!((Boolean) obj4).booleanValue()) {
                                    b1Var2.W(v0.a);
                                    break;
                                } else {
                                    b1Var2.W(y0.a);
                                    break;
                                }
                            case 2:
                                com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                    if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                            if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                }
                                            } else {
                                                b1Var2.W(new q0("cancelled"));
                                            }
                                        } else {
                                            Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                            b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(n0.a);
                                    }
                                } else {
                                    b1Var2.W(r0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                    if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                        w511.b();
                                        break;
                                    } else {
                                        b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                    }
                                } else {
                                    b1Var2.W(t0.a);
                                }
                                break;
                            case 4:
                                b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                break;
                            default:
                                b1Var2.W(new x0((SlothUiWish) obj4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q);
            }
            btsVar2.t(false);
            yd00 e2 = kla1.e(b2, (tls) Q, btsVar2, 0);
            i50 i50Var = new i50();
            btsVar2.e0(-438521846);
            boolean e3 = btsVar2.e(b1Var);
            Object Q2 = btsVar2.Q();
            final int i5 = 1;
            if (e3 || Q2 == obj3) {
                Q2 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i52 = i5;
                        zy11 zy11Var = zy11.a;
                        b1 b1Var2 = b1Var;
                        switch (i52) {
                            case 0:
                                com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                    if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                        if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                        }
                                    } else {
                                        Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                        b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                    }
                                } else {
                                    b1Var2.W(p0.a);
                                }
                                break;
                            case 1:
                                if (!((Boolean) obj4).booleanValue()) {
                                    b1Var2.W(v0.a);
                                    break;
                                } else {
                                    b1Var2.W(y0.a);
                                    break;
                                }
                            case 2:
                                com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                    if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                            if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                }
                                            } else {
                                                b1Var2.W(new q0("cancelled"));
                                            }
                                        } else {
                                            Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                            b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(n0.a);
                                    }
                                } else {
                                    b1Var2.W(r0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                    if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                        w511.b();
                                        break;
                                    } else {
                                        b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                    }
                                } else {
                                    b1Var2.W(t0.a);
                                }
                                break;
                            case 4:
                                b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                break;
                            default:
                                b1Var2.W(new x0((SlothUiWish) obj4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q2);
            }
            btsVar2.t(false);
            yd00 e4 = kla1.e(i50Var, (tls) Q2, btsVar2, 0);
            x40 c = dVar.getBiometricApi().c();
            btsVar2.e0(-438510313);
            boolean e5 = btsVar2.e(b1Var);
            Object Q3 = btsVar2.Q();
            if (e5 || Q3 == obj3) {
                final int i6 = 2;
                Q3 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i52 = i6;
                        zy11 zy11Var = zy11.a;
                        b1 b1Var2 = b1Var;
                        switch (i52) {
                            case 0:
                                com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                    if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                        if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                        }
                                    } else {
                                        Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                        b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                    }
                                } else {
                                    b1Var2.W(p0.a);
                                }
                                break;
                            case 1:
                                if (!((Boolean) obj4).booleanValue()) {
                                    b1Var2.W(v0.a);
                                    break;
                                } else {
                                    b1Var2.W(y0.a);
                                    break;
                                }
                            case 2:
                                com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                    if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                            if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                }
                                            } else {
                                                b1Var2.W(new q0("cancelled"));
                                            }
                                        } else {
                                            Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                            b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(n0.a);
                                    }
                                } else {
                                    b1Var2.W(r0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                    if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                        w511.b();
                                        break;
                                    } else {
                                        b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                    }
                                } else {
                                    b1Var2.W(t0.a);
                                }
                                break;
                            case 4:
                                b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                break;
                            default:
                                b1Var2.W(new x0((SlothUiWish) obj4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q3);
            }
            btsVar2.t(false);
            yd00 e6 = kla1.e(c, (tls) Q3, btsVar2, 0);
            com.yandex.passport.internal.impl.t tVar = new com.yandex.passport.internal.impl.t();
            btsVar2.e0(-438481461);
            boolean e7 = btsVar2.e(b1Var);
            Object Q4 = btsVar2.Q();
            if (e7 || Q4 == obj3) {
                final int i7 = 3;
                Q4 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                    @Override // defpackage.tls
                    public final Object invoke(Object obj4) {
                        int i52 = i7;
                        zy11 zy11Var = zy11.a;
                        b1 b1Var2 = b1Var;
                        switch (i52) {
                            case 0:
                                com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                    if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                        if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                        }
                                    } else {
                                        Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                        b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                    }
                                } else {
                                    b1Var2.W(p0.a);
                                }
                                break;
                            case 1:
                                if (!((Boolean) obj4).booleanValue()) {
                                    b1Var2.W(v0.a);
                                    break;
                                } else {
                                    b1Var2.W(y0.a);
                                    break;
                                }
                            case 2:
                                com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                    if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                            if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                    w511.b();
                                                    break;
                                                } else {
                                                    b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                }
                                            } else {
                                                b1Var2.W(new q0("cancelled"));
                                            }
                                        } else {
                                            Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                            b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(n0.a);
                                    }
                                } else {
                                    b1Var2.W(r0.a);
                                }
                                break;
                            case 3:
                                com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                    if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                        w511.b();
                                        break;
                                    } else {
                                        b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                    }
                                } else {
                                    b1Var2.W(t0.a);
                                }
                                break;
                            case 4:
                                b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                break;
                            default:
                                b1Var2.W(new x0((SlothUiWish) obj4));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q4);
            }
            btsVar2.t(false);
            yd00 e8 = kla1.e(tVar, (tls) Q4, btsVar2, 0);
            btsVar2.e0(-438469841);
            boolean k = btsVar2.k(b) | btsVar2.e(b1Var) | btsVar2.e(obj2);
            Object Q5 = btsVar2.Q();
            if (k || Q5 == obj3) {
                Q5 = new com.yandex.passport.internal.flags.presentation.v0(4, obj2, b1Var, b);
                btsVar2.o0(Q5);
            }
            btsVar2.t(false);
            zpn.a(obj2, (tls) Q5, btsVar2);
            kotlinx.coroutines.flow.b bVar = b1Var.y;
            btsVar2.e0(-438450258);
            boolean e9 = ((i3 & 112) == 32) | btsVar2.e(e8) | btsVar2.e(e4) | btsVar2.e(e2) | btsVar2.e(e6) | btsVar2.e(context);
            Object Q6 = btsVar2.Q();
            if (e9 || Q6 == obj3) {
                obj = obj3;
                i2 = 256;
                Object biometricVerificationScreenKt$BiometricVerificationScreen$2$1 = new BiometricVerificationScreenKt$BiometricVerificationScreen$2$1(e8, e4, e2, e6, context, slsVar, null);
                btsVar2.o0(biometricVerificationScreenKt$BiometricVerificationScreen$2$1);
                Q6 = biometricVerificationScreenKt$BiometricVerificationScreen$2$1;
            } else {
                obj = obj3;
                i2 = 256;
            }
            btsVar2.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar, (wls) Q6, btsVar2, 0);
            Integer resultCode = ((BiometricVerificationViewModel$State) b.getValue()).getResultCode();
            btsVar2.e0(-438405675);
            if (resultCode != null) {
                int intValue = resultCode.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                btsVar2.e0(1850976588);
                boolean c2 = ((i3 & 896) == i2) | btsVar2.c(intValue) | btsVar2.k(b);
                Object Q7 = btsVar2.Q();
                if (c2 || Q7 == obj) {
                    Q7 = new BiometricVerificationScreenKt$BiometricVerificationScreen$3$1$1(wlsVar, intValue, b, null);
                    btsVar2.o0(Q7);
                }
                btsVar2.t(false);
                zpn.e(btsVar2, (wls) Q7, valueOf);
                btsVar2.t(false);
                aii0 v = btsVar2.v();
                if (v != null) {
                    final int i8 = 2;
                    v.d = new wls(dVar, slsVar, wlsVar, i, i8) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ d b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ wls w;

                        {
                            this.a = i8;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            int i9 = this.a;
                            zy11 zy11Var = zy11.a;
                            wls wlsVar2 = this.w;
                            sls slsVar2 = this.c;
                            d dVar2 = this.b;
                            fid fidVar2 = (fid) obj4;
                            ((Integer) obj5).getClass();
                            switch (i9) {
                                case 0:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                case 1:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar2.t(false);
            SlothParams slothParams = ((BiometricVerificationViewModel$State) b.getValue()).getSlothParams();
            btsVar2.e0(-438399251);
            if (slothParams != null) {
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = dVar.getSlothScreenComponentBuilder();
                btsVar2.e0(1850986675);
                Object Q8 = btsVar2.Q();
                if (Q8 == obj) {
                    Q8 = new com.yandex.passport.internal.core.announcing.f(19);
                    btsVar2.o0(Q8);
                }
                tls tlsVar = (tls) Q8;
                btsVar2.t(false);
                btsVar2.e0(1850988996);
                boolean e10 = btsVar2.e(b1Var);
                Object Q9 = btsVar2.Q();
                if (e10 || Q9 == obj) {
                    final int i9 = 4;
                    Q9 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            int i52 = i9;
                            zy11 zy11Var = zy11.a;
                            b1 b1Var2 = b1Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                    if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                        if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                            if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                                w511.b();
                                                break;
                                            } else {
                                                b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                            }
                                        } else {
                                            Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                            b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(p0.a);
                                    }
                                    break;
                                case 1:
                                    if (!((Boolean) obj4).booleanValue()) {
                                        b1Var2.W(v0.a);
                                        break;
                                    } else {
                                        b1Var2.W(y0.a);
                                        break;
                                    }
                                case 2:
                                    com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                    if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                            if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                    if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                        w511.b();
                                                        break;
                                                    } else {
                                                        b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                    }
                                                } else {
                                                    b1Var2.W(new q0("cancelled"));
                                                }
                                            } else {
                                                Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                                b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                            }
                                        } else {
                                            b1Var2.W(n0.a);
                                        }
                                    } else {
                                        b1Var2.W(r0.a);
                                    }
                                    break;
                                case 3:
                                    com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                    if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                        if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                        }
                                    } else {
                                        b1Var2.W(t0.a);
                                    }
                                    break;
                                case 4:
                                    b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                    break;
                                default:
                                    b1Var2.W(new x0((SlothUiWish) obj4));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(Q9);
                }
                tls tlsVar2 = (tls) Q9;
                btsVar2.t(false);
                btsVar2.e0(1850991711);
                boolean e11 = btsVar2.e(b1Var);
                Object Q10 = btsVar2.Q();
                if (e11 || Q10 == obj) {
                    final int i10 = 5;
                    Q10 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.ebs.g
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            int i52 = i10;
                            zy11 zy11Var = zy11.a;
                            b1 b1Var2 = b1Var;
                            switch (i52) {
                                case 0:
                                    com.yandex.passport.common.ebs.s sVar = (com.yandex.passport.common.ebs.s) obj4;
                                    if (!sVar.equals(com.yandex.passport.common.ebs.q.a)) {
                                        if (!(sVar instanceof com.yandex.passport.common.ebs.p)) {
                                            if (!sVar.equals(com.yandex.passport.common.ebs.r.a)) {
                                                w511.b();
                                                break;
                                            } else {
                                                b1Var2.W(new o0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                            }
                                        } else {
                                            Throwable th = ((com.yandex.passport.common.ebs.p) sVar).a;
                                            b1Var2.W(new o0(th != null ? th.getMessage() : null));
                                        }
                                    } else {
                                        b1Var2.W(p0.a);
                                    }
                                    break;
                                case 1:
                                    if (!((Boolean) obj4).booleanValue()) {
                                        b1Var2.W(v0.a);
                                        break;
                                    } else {
                                        b1Var2.W(y0.a);
                                        break;
                                    }
                                case 2:
                                    com.yandex.passport.common.ebs.g gVar = (com.yandex.passport.common.ebs.g) obj4;
                                    if (!gVar.equals(com.yandex.passport.common.ebs.e.a)) {
                                        if (!(gVar instanceof com.yandex.passport.common.ebs.d)) {
                                            if (!(gVar instanceof com.yandex.passport.common.ebs.c)) {
                                                if (!gVar.equals(com.yandex.passport.common.ebs.b.a)) {
                                                    if (!gVar.equals(com.yandex.passport.common.ebs.f.a)) {
                                                        w511.b();
                                                        break;
                                                    } else {
                                                        b1Var2.W(new q0(BiometricVerificationActivity.BIOMETRIC_MODULE_CONNECTION_ERROR));
                                                    }
                                                } else {
                                                    b1Var2.W(new q0("cancelled"));
                                                }
                                            } else {
                                                Throwable th2 = ((com.yandex.passport.common.ebs.c) gVar).a;
                                                b1Var2.W(new q0(th2 != null ? th2.getMessage() : null));
                                            }
                                        } else {
                                            b1Var2.W(n0.a);
                                        }
                                    } else {
                                        b1Var2.W(r0.a);
                                    }
                                    break;
                                case 3:
                                    com.yandex.passport.api.x0 x0Var = (com.yandex.passport.api.x0) obj4;
                                    if (!(x0Var instanceof com.yandex.passport.api.w0)) {
                                        if (!(x0Var instanceof com.yandex.passport.api.v0)) {
                                            w511.b();
                                            break;
                                        } else {
                                            b1Var2.W(new s0(((com.yandex.passport.api.v0) x0Var).a));
                                        }
                                    } else {
                                        b1Var2.W(t0.a);
                                    }
                                    break;
                                case 4:
                                    b1Var2.W(new w0((com.yandex.passport.sloth.i0) obj4));
                                    break;
                                default:
                                    b1Var2.W(new x0((SlothUiWish) obj4));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(Q10);
                }
                btsVar2.t(false);
                com.yandex.passport.internal.ui.sloth.screen.g.a(slothParams, slothScreenComponentBuilder, tlsVar, tlsVar2, (tls) Q10, null, btsVar2, 384, 32);
                btsVar2.t(false);
                aii0 v2 = btsVar2.v();
                if (v2 != null) {
                    final int i11 = 0;
                    v2.d = new wls(dVar, slsVar, wlsVar, i, i11) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                        public final /* synthetic */ int a;
                        public final /* synthetic */ d b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ wls w;

                        {
                            this.a = i11;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj4, Object obj5) {
                            int i92 = this.a;
                            zy11 zy11Var = zy11.a;
                            wls wlsVar2 = this.w;
                            sls slsVar2 = this.c;
                            d dVar2 = this.b;
                            fid fidVar2 = (fid) obj4;
                            ((Integer) obj5).getClass();
                            switch (i92) {
                                case 0:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                case 1:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            btsVar2.t(false);
            com.yandex.passport.common.ui.progress.g progressProperties = dVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.common.ui.progress.p.d(null, progressProperties, true, btsVar2, 384, 1);
            btsVar = btsVar2;
        }
        aii0 v3 = btsVar.v();
        if (v3 != null) {
            final int i12 = 1;
            v3.d = new wls(dVar, slsVar, wlsVar, i, i12) { // from class: com.yandex.passport.internal.ui.sloth.ebs.h
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ wls w;

                {
                    this.a = i12;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj4, Object obj5) {
                    int i92 = this.a;
                    zy11 zy11Var = zy11.a;
                    wls wlsVar2 = this.w;
                    sls slsVar2 = this.c;
                    d dVar2 = this.b;
                    fid fidVar2 = (fid) obj4;
                    ((Integer) obj5).getClass();
                    switch (i92) {
                        case 0:
                            l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                        case 1:
                            l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            l.a(dVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
