package com.yandex.passport.internal.ui.challenge.changecurrent;

import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.common.core.Uid;
import defpackage.agc;
import defpackage.bts;
import defpackage.did;
import defpackage.f810;
import defpackage.fgw0;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes8.dex */
public final class j implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                g gVar = (g) obj4;
                final SetCurrentComposeActivity setCurrentComposeActivity = (SetCurrentComposeActivity) obj3;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1515274028);
                boolean e = btsVar2.e(gVar) | btsVar2.k(setCurrentComposeActivity);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new fgw0(12, gVar, setCurrentComposeActivity);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                btsVar2.t(false);
                btsVar2.e0(1515269075);
                boolean k = btsVar2.k(setCurrentComposeActivity);
                Object Q2 = btsVar2.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.i
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            SetCurrentComposeActivity setCurrentComposeActivity2 = setCurrentComposeActivity;
                            switch (i4) {
                                case 0:
                                    com.yandex.passport.internal.util.a.a(setCurrentComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse((String) obj5)));
                                    break;
                                default:
                                    com.yandex.passport.internal.util.p.c(setCurrentComposeActivity2, (Exception) obj5);
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar2.o0(Q2);
                }
                tls tlsVar2 = (tls) Q2;
                btsVar2.t(false);
                btsVar2.e0(1515289350);
                boolean k2 = btsVar2.k(setCurrentComposeActivity);
                Object Q3 = btsVar2.Q();
                if (k2 || Q3 == o430Var) {
                    Q3 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.changecurrent.i
                        @Override // defpackage.tls
                        public final Object invoke(Object obj5) {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            SetCurrentComposeActivity setCurrentComposeActivity2 = setCurrentComposeActivity;
                            switch (i4) {
                                case 0:
                                    com.yandex.passport.internal.util.a.a(setCurrentComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse((String) obj5)));
                                    break;
                                default:
                                    com.yandex.passport.internal.util.p.c(setCurrentComposeActivity2, (Exception) obj5);
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar2.o0(Q3);
                }
                btsVar2.t(false);
                int i4 = Uid.$stable;
                com.yandex.passport.common.ui.progress.g gVar2 = com.yandex.passport.common.ui.progress.g.e;
                n.a(gVar, tlsVar, tlsVar2, (tls) Q3, btsVar2, i4);
                break;
            case 1:
                fid fidVar2 = (fid) obj;
                g gVar3 = (g) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                com.yandex.passport.common.ui.compose.theme.e.a(com.yandex.passport.common.ui.compose.d.c(gVar3.c, fidVar2), com.yandex.passport.internal.di.a.a().getProperties().w, wwg.S(-441762069, true, new j(i3, gVar3, (SetCurrentComposeActivity) obj3), fidVar2), fidVar2, 384, 0);
                break;
            default:
                fid fidVar3 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar4 = (bts) fidVar3;
                    if (btsVar4.E()) {
                        btsVar4.Y();
                        break;
                    }
                }
                f810.b((agc) obj4, com.yandex.passport.common.ui.compose.theme.e.c, com.yandex.passport.common.ui.compose.theme.c.a, (wls) obj3, fidVar3, 432, 0);
                break;
        }
        return zy11Var;
    }
}
