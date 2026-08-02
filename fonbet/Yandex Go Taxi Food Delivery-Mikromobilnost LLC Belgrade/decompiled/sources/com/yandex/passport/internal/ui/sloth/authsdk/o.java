package com.yandex.passport.internal.ui.sloth.authsdk;

import androidx.activity.result.ActivityResult;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.a1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.ui.SlothUiWish;
import defpackage.aii0;
import defpackage.bts;
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
import defpackage.w511;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zpn;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void a(final k kVar, final tls tlsVar, fid fidVar, final int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-3579543);
        final int i2 = 2;
        int i3 = (btsVar2.k(kVar) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        final int i4 = 1;
        if ((i3 & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            v viewModelFactory = kVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar2);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final c0 c0Var = (c0) ooc.G(qoi0.a(c0.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar2);
            oz40 b = androidx.compose.runtime.f.b(c0Var.c, btsVar2);
            g gVar = ((w) b.getValue()).a;
            btsVar2.e0(-1923743730);
            Object obj = did.a;
            final int i5 = 0;
            if (gVar != null) {
                btsVar2.e0(1142474296);
                boolean e = ((i3 & 112) == 32) | btsVar2.e(gVar);
                Object Q = btsVar2.Q();
                if (e || Q == obj) {
                    Q = new AuthSdkSlothComposeScreenKt$AuthSdkSlothComposeScreen$1$1$1(tlsVar, gVar, null);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                zpn.e(btsVar2, (wls) Q, gVar);
            }
            btsVar2.t(false);
            Throwable th = ((w) b.getValue()).b;
            btsVar2.e0(-1923740026);
            if (th != null) {
                btsVar2.e0(1142480304);
                boolean e2 = btsVar2.e(c0Var);
                Object Q2 = btsVar2.Q();
                if (e2 || Q2 == obj) {
                    Q2 = new com.yandex.passport.internal.flags.experiments.h(22, c0Var);
                    btsVar2.o0(Q2);
                }
                btsVar2.t(false);
                com.yandex.passport.internal.ui.common.screen.f.a(th, true, false, (sls) Q2, btsVar2, 48, 4);
                btsVar2.t(false);
                aii0 v = btsVar2.v();
                if (v != null) {
                    v.d = new wls(kVar, tlsVar, i, i5) { // from class: com.yandex.passport.internal.ui.sloth.authsdk.m
                        public final /* synthetic */ int a;
                        public final /* synthetic */ k b;
                        public final /* synthetic */ tls c;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i6 = this.a;
                            zy11 zy11Var = zy11.a;
                            tls tlsVar2 = this.c;
                            k kVar2 = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i6) {
                                case 0:
                                    o.a(kVar2, tlsVar2, fidVar2, vng.O(1));
                                    break;
                                default:
                                    o.a(kVar2, tlsVar2, fidVar2, vng.O(1));
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
            SlothParams slothParams = kVar.getSlothParams();
            com.yandex.passport.internal.ui.sloth.screen.e slothScreenComponentBuilder = kVar.getSlothScreenComponentBuilder();
            btsVar2.e0(-1923728481);
            boolean e3 = btsVar2.e(c0Var);
            Object Q3 = btsVar2.Q();
            if (e3 || Q3 == obj) {
                Q3 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.n
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        c0 c0Var2 = c0Var;
                        switch (i6) {
                            case 0:
                                c0Var2.W(new a0((a1) obj2));
                                break;
                            case 1:
                                c0Var2.W(new y((com.yandex.passport.sloth.i0) obj2));
                                break;
                            default:
                                c0Var2.W(new z((SlothUiWish) obj2));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q3);
            }
            tls tlsVar2 = (tls) Q3;
            btsVar2.t(false);
            btsVar2.e0(-1923726040);
            boolean e4 = btsVar2.e(c0Var);
            Object Q4 = btsVar2.Q();
            if (e4 || Q4 == obj) {
                Q4 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.n
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i6 = i4;
                        zy11 zy11Var = zy11.a;
                        c0 c0Var2 = c0Var;
                        switch (i6) {
                            case 0:
                                c0Var2.W(new a0((a1) obj2));
                                break;
                            case 1:
                                c0Var2.W(new y((com.yandex.passport.sloth.i0) obj2));
                                break;
                            default:
                                c0Var2.W(new z((SlothUiWish) obj2));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q4);
            }
            tls tlsVar3 = (tls) Q4;
            btsVar2.t(false);
            btsVar2.e0(-1923723453);
            boolean e5 = btsVar2.e(c0Var);
            Object Q5 = btsVar2.Q();
            if (e5 || Q5 == obj) {
                Q5 = new tls() { // from class: com.yandex.passport.internal.ui.sloth.authsdk.n
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i6 = i2;
                        zy11 zy11Var = zy11.a;
                        c0 c0Var2 = c0Var;
                        switch (i6) {
                            case 0:
                                c0Var2.W(new a0((a1) obj2));
                                break;
                            case 1:
                                c0Var2.W(new y((com.yandex.passport.sloth.i0) obj2));
                                break;
                            default:
                                c0Var2.W(new z((SlothUiWish) obj2));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q5);
            }
            btsVar2.t(false);
            com.yandex.passport.internal.ui.sloth.screen.g.a(slothParams, slothScreenComponentBuilder, tlsVar2, tlsVar3, (tls) Q5, null, btsVar2, 0, 32);
            btsVar = btsVar2;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls(kVar, tlsVar, i, i4) { // from class: com.yandex.passport.internal.ui.sloth.authsdk.m
                public final /* synthetic */ int a;
                public final /* synthetic */ k b;
                public final /* synthetic */ tls c;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i6 = this.a;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar22 = this.c;
                    k kVar2 = this.b;
                    fid fidVar2 = (fid) obj2;
                    ((Integer) obj3).getClass();
                    switch (i6) {
                        case 0:
                            o.a(kVar2, tlsVar22, fidVar2, vng.O(1));
                            break;
                        default:
                            o.a(kVar2, tlsVar22, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final ActivityResult b(g gVar) {
        if (gVar instanceof b) {
            return com.yandex.passport.internal.ui.c.b(0);
        }
        if (gVar instanceof a) {
            Uid uid = ((a) gVar).a;
            return com.yandex.passport.internal.ui.c.a(666, wwg.g(new Pair("passport-result-environment", Integer.valueOf(uid.getEnvironment().getInteger())), new Pair("passport-result-uid", Long.valueOf(uid.getValue()))));
        }
        if (gVar instanceof f) {
            f fVar = (f) gVar;
            return com.yandex.passport.internal.ui.c.a(-1, wwg.g(new Pair("passport-result-token", fVar.a), new Pair("passport-result-token-type", fVar.b), new Pair("passport-result-expires-in", Long.valueOf(fVar.c))));
        }
        if (gVar instanceof d) {
            return com.yandex.passport.internal.ui.c.a(13, wwg.g(new Pair(Constants.KEY_EXCEPTION, ((d) gVar).a)));
        }
        if (gVar instanceof e) {
            Uid uid2 = ((e) gVar).a;
            return com.yandex.passport.internal.ui.c.a(392, wwg.g(new Pair("passport-result-environment", Integer.valueOf(uid2.getEnvironment().getInteger())), new Pair("passport-result-uid", Long.valueOf(uid2.getValue()))));
        }
        w511.b();
        return null;
    }
}
