package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.f5z;
import defpackage.fid;
import defpackage.he7;
import defpackage.iqy0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.oz40;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.tls;
import defpackage.vng;
import defpackage.w8f;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes8.dex */
public abstract class n {
    public static final void a(final g gVar, final tls tlsVar, final tls tlsVar2, final tls tlsVar3, fid fidVar, final int i) {
        int i2;
        g gVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1637078103);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(gVar) : btsVar.e(gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar3) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && btsVar.E()) {
            btsVar.Y();
            gVar2 = gVar;
        } else {
            btsVar.e0(109416844);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = com.yandex.passport.internal.di.a.a().createSetCurrentComposeComponentBuilder().setProperties(gVar).build();
                btsVar.o0(Q);
            }
            l lVar = (l) Q;
            btsVar.t(false);
            p viewModelFactory = lVar.getViewModelFactory();
            rs31 a = f5z.a(btsVar);
            if (a == null) {
                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            s sVar = (s) ooc.G(qoi0.a(s.class), a, null, viewModelFactory, a instanceof q7u ? ((q7u) a).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            oz40 b = androidx.compose.runtime.f.b(sVar.c, btsVar);
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            btsVar.e0(109429526);
            if (((q) b.getValue()).d != null) {
                Boolean bool = ((q) b.getValue()).d;
                btsVar.e0(109432217);
                boolean k = ((i2 & 112) == 32) | btsVar.k(b);
                Object Q2 = btsVar.Q();
                if (k || Q2 == obj) {
                    Q2 = new SetCurrentComposeScreenKt$SetCurrentComposeScreen$1$1(tlsVar, b, null);
                    btsVar.o0(Q2);
                }
                btsVar.t(false);
                zpn.e(btsVar, (wls) Q2, bool);
            }
            btsVar.t(false);
            Throwable th = ((q) b.getValue()).b;
            if (th != null) {
                if (th instanceof Exception) {
                    tlsVar3.invoke(th);
                } else {
                    tlsVar3.invoke(new RuntimeException(th));
                }
                aii0 v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    v.d = new wls() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.m
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i4 = i3;
                            zy11 zy11Var = zy11.a;
                            int i5 = i;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int O = vng.O(i5 | 1);
                                    n.a(gVar, tlsVar, tlsVar2, tlsVar3, (fid) obj2, O);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int O2 = vng.O(i5 | 1);
                                    n.a(gVar, tlsVar, tlsVar2, tlsVar3, (fid) obj2, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            gVar2 = gVar;
            com.yandex.passport.internal.ui.challenge.webview.k kVar = ((q) b.getValue()).e;
            com.yandex.passport.internal.analytics.c0 eventReporter = lVar.getEventReporter();
            com.yandex.passport.internal.ui.common.web.d urlChecker = lVar.getUrlChecker();
            com.yandex.passport.common.ui.progress.g gVar3 = gVar2.b;
            btsVar.e0(109449295);
            boolean z = (i2 & 896) == 256;
            Object Q3 = btsVar.Q();
            if (z || Q3 == obj) {
                Q3 = new he7(4, tlsVar2);
                btsVar.o0(Q3);
            }
            tls tlsVar4 = (tls) Q3;
            btsVar.t(false);
            btsVar.e0(109455301);
            boolean e = btsVar.e(sVar);
            Object Q4 = btsVar.Q();
            if (e || Q4 == obj) {
                Q4 = new com.yandex.passport.common.util.d(1, sVar);
                btsVar.o0(Q4);
            }
            tls tlsVar5 = (tls) Q4;
            btsVar.t(false);
            btsVar.e0(109451552);
            boolean e2 = btsVar.e(context);
            Object Q5 = btsVar.Q();
            if (e2 || Q5 == obj) {
                Q5 = new iqy0(context, 1);
                btsVar.o0(Q5);
            }
            btsVar.t(false);
            com.yandex.passport.common.ui.progress.g gVar4 = com.yandex.passport.common.ui.progress.g.e;
            com.yandex.passport.internal.util.p.a(kVar, eventReporter, urlChecker, gVar3, tlsVar4, tlsVar5, (tls) Q5, true, btsVar, 12582912, 0);
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            final int i4 = 1;
            final g gVar5 = gVar2;
            v2.d = new wls() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.m
                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    int i42 = i4;
                    zy11 zy11Var = zy11.a;
                    int i5 = i;
                    switch (i42) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int O = vng.O(i5 | 1);
                            n.a(gVar5, tlsVar, tlsVar2, tlsVar3, (fid) obj2, O);
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            int O2 = vng.O(i5 | 1);
                            n.a(gVar5, tlsVar, tlsVar2, tlsVar3, (fid) obj2, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }
}
