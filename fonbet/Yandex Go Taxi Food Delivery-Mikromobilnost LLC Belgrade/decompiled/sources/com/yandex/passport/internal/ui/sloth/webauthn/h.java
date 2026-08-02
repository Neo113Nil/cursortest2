package com.yandex.passport.internal.ui.sloth.webauthn;

import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.i0;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.ny61;
import defpackage.o430;
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
public abstract class h {
    public static final void a(final c cVar, final sls slsVar, final wls wlsVar, fid fidVar, final int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(174920605);
        final int i2 = 2;
        int i3 = i | (btsVar2.k(cVar) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.e(wlsVar) ? 256 : 128);
        if ((i3 & 147) == 146 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            r viewModelFactory = cVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final w wVar = (w) ooc.G(qoi0.a(w.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
            oz40 b = androidx.compose.runtime.f.b(wVar.c, btsVar2);
            kotlinx.coroutines.flow.b bVar = wVar.w;
            btsVar2.e0(-1054951749);
            final int i4 = 0;
            boolean z = (i3 & 112) == 32;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj = Q;
            if (z || Q == o430Var) {
                RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1 = new RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$1$1(slsVar, null);
                btsVar2.o0(registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1);
                obj = registerWebAuthNScreenKt$RegisterWebAuthNScreen$1$1;
            }
            btsVar2.t(false);
            com.yandex.passport.common.ui.compose.d.a(bVar, (wls) obj, btsVar2, 0);
            Integer resultCode = ((RegisterWebAuthNViewModel$State) b.getValue()).getResultCode();
            btsVar2.e0(-1054948117);
            if (resultCode != null) {
                int intValue = resultCode.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                btsVar2.e0(-2061035673);
                int i5 = (btsVar2.c(intValue) ? 1 : 0) | ((i3 & 896) != 256 ? 0 : 1) | (btsVar2.k(b) ? 1 : 0);
                Object Q2 = btsVar2.Q();
                Object obj2 = Q2;
                if (i5 != 0 || Q2 == o430Var) {
                    RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$2$1$1 registerWebAuthNScreenKt$RegisterWebAuthNScreen$2$1$1 = new RegisterWebAuthNScreenKt$RegisterWebAuthNScreen$2$1$1(wlsVar, intValue, b, null);
                    btsVar2.o0(registerWebAuthNScreenKt$RegisterWebAuthNScreen$2$1$1);
                    obj2 = registerWebAuthNScreenKt$RegisterWebAuthNScreen$2$1$1;
                }
                btsVar2.t(false);
                zpn.e(btsVar2, (wls) obj2, valueOf);
                btsVar2.t(false);
                aii0 v = btsVar2.v();
                if (v != null) {
                    final int i6 = 0;
                    v.d = new wls(cVar, slsVar, wlsVar, i, i6) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.f
                        public final /* synthetic */ int a;
                        public final /* synthetic */ c b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ wls w;

                        {
                            this.a = i6;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj3, Object obj4) {
                            int i7 = this.a;
                            zy11 zy11Var = zy11.a;
                            wls wlsVar2 = this.w;
                            sls slsVar2 = this.c;
                            c cVar2 = this.b;
                            fid fidVar2 = (fid) obj3;
                            ((Integer) obj4).getClass();
                            switch (i7) {
                                case 0:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                case 1:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
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
            SlothParams slothParams = ((RegisterWebAuthNViewModel$State) b.getValue()).getSlothParams();
            btsVar2.e0(-1054941690);
            if (slothParams != null) {
                com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = cVar.getSlothScreenComponentBuilder();
                btsVar2.e0(-2061025583);
                boolean e = btsVar2.e(wVar);
                Object Q3 = btsVar2.Q();
                Object obj3 = Q3;
                if (e || Q3 == o430Var) {
                    tls tlsVar = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                        @Override // defpackage.tls
                        public final Object invoke(Object obj4) {
                            int i7 = i4;
                            zy11 zy11Var = zy11.a;
                            w wVar2 = wVar;
                            switch (i7) {
                                case 0:
                                    wVar2.W(new u((a1) obj4));
                                    break;
                                case 1:
                                    wVar2.W(new s((i0) obj4));
                                    break;
                                default:
                                    wVar2.W(new t((SlothUiWish) obj4));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(tlsVar);
                    obj3 = tlsVar;
                }
                tls tlsVar2 = (tls) obj3;
                btsVar2.t(false);
                btsVar2.e0(-2061023014);
                boolean e2 = btsVar2.e(wVar);
                Object Q4 = btsVar2.Q();
                Object obj4 = Q4;
                if (e2 || Q4 == o430Var) {
                    tls tlsVar3 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                        @Override // defpackage.tls
                        public final Object invoke(Object obj42) {
                            int i7 = r2;
                            zy11 zy11Var = zy11.a;
                            w wVar2 = wVar;
                            switch (i7) {
                                case 0:
                                    wVar2.W(new u((a1) obj42));
                                    break;
                                case 1:
                                    wVar2.W(new s((i0) obj42));
                                    break;
                                default:
                                    wVar2.W(new t((SlothUiWish) obj42));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(tlsVar3);
                    obj4 = tlsVar3;
                }
                tls tlsVar4 = (tls) obj4;
                btsVar2.t(false);
                btsVar2.e0(-2061020299);
                boolean e3 = btsVar2.e(wVar);
                Object Q5 = btsVar2.Q();
                Object obj5 = Q5;
                if (e3 || Q5 == o430Var) {
                    tls tlsVar5 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.webauthn.g
                        @Override // defpackage.tls
                        public final Object invoke(Object obj42) {
                            int i7 = i2;
                            zy11 zy11Var = zy11.a;
                            w wVar2 = wVar;
                            switch (i7) {
                                case 0:
                                    wVar2.W(new u((a1) obj42));
                                    break;
                                case 1:
                                    wVar2.W(new s((i0) obj42));
                                    break;
                                default:
                                    wVar2.W(new t((SlothUiWish) obj42));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(tlsVar5);
                    obj5 = tlsVar5;
                }
                btsVar2.t(false);
                com.yandex.passport.internal.ui.sloth.screen.g.a(slothParams, slothScreenComponentBuilder, tlsVar2, tlsVar4, (tls) obj5, null, btsVar2, 0, 32);
                btsVar2.t(false);
                aii0 v2 = btsVar2.v();
                if (v2 != null) {
                    final int i7 = 1;
                    v2.d = new wls(cVar, slsVar, wlsVar, i, i7) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.f
                        public final /* synthetic */ int a;
                        public final /* synthetic */ c b;
                        public final /* synthetic */ sls c;
                        public final /* synthetic */ wls w;

                        {
                            this.a = i7;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj32, Object obj42) {
                            int i72 = this.a;
                            zy11 zy11Var = zy11.a;
                            wls wlsVar2 = this.w;
                            sls slsVar2 = this.c;
                            c cVar2 = this.b;
                            fid fidVar2 = (fid) obj32;
                            ((Integer) obj42).getClass();
                            switch (i72) {
                                case 0:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                case 1:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
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
            com.yandex.passport.common.ui.progress.g progressProperties = cVar.getProgressProperties();
            com.yandex.passport.common.ui.progress.g gVar = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.common.ui.progress.p.d(null, progressProperties, true, btsVar2, 384, 1);
            btsVar = btsVar2;
        }
        aii0 v3 = btsVar.v();
        if (v3 != null) {
            final int i8 = 2;
            v3.d = new wls(cVar, slsVar, wlsVar, i, i8) { // from class: com.yandex.passport.internal.ui.sloth.webauthn.f
                public final /* synthetic */ int a;
                public final /* synthetic */ c b;
                public final /* synthetic */ sls c;
                public final /* synthetic */ wls w;

                {
                    this.a = i8;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj32, Object obj42) {
                    int i72 = this.a;
                    zy11 zy11Var = zy11.a;
                    wls wlsVar2 = this.w;
                    sls slsVar2 = this.c;
                    c cVar2 = this.b;
                    fid fidVar2 = (fid) obj32;
                    ((Integer) obj42).getClass();
                    switch (i72) {
                        case 0:
                            h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                        case 1:
                            h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                        default:
                            h.a(cVar2, slsVar2, wlsVar2, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
