package com.yandex.passport.internal.ui.challenge.logout;

import android.content.Intent;
import android.net.Uri;
import com.yandex.passport.internal.flags.presentation.s0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class i implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v b;
    public final /* synthetic */ k c;
    public final /* synthetic */ LogoutComposeActivity w;

    public i(k kVar, v vVar, LogoutComposeActivity logoutComposeActivity) {
        this.c = kVar;
        this.b = vVar;
        this.w = logoutComposeActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        final LogoutComposeActivity logoutComposeActivity = this.w;
        final int i2 = 1;
        v vVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar = (bts) fidVar;
                    if (btsVar.E()) {
                        btsVar.Y();
                        break;
                    }
                }
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(1694700125);
                boolean e = btsVar2.e(vVar) | btsVar2.k(logoutComposeActivity);
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new s0(16, vVar, logoutComposeActivity);
                    btsVar2.o0(Q);
                }
                tls tlsVar = (tls) Q;
                final int i3 = 0;
                btsVar2.t(false);
                btsVar2.e0(1694695109);
                boolean k = btsVar2.k(logoutComposeActivity);
                Object Q2 = btsVar2.Q();
                if (k || Q2 == o430Var) {
                    Q2 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.h
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            int i4 = i3;
                            zy11 zy11Var2 = zy11.a;
                            LogoutComposeActivity logoutComposeActivity2 = logoutComposeActivity;
                            switch (i4) {
                                case 0:
                                    com.yandex.passport.internal.util.a.a(logoutComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse((String) obj3)));
                                    break;
                                default:
                                    com.yandex.passport.internal.util.p.c(logoutComposeActivity2, (Exception) obj3);
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar2.o0(Q2);
                }
                tls tlsVar2 = (tls) Q2;
                btsVar2.t(false);
                btsVar2.e0(1694717400);
                boolean k2 = btsVar2.k(logoutComposeActivity);
                Object Q3 = btsVar2.Q();
                if (k2 || Q3 == o430Var) {
                    Q3 = new tls() { // from class: com.yandex.passport.internal.ui.challenge.logout.h
                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            int i4 = i2;
                            zy11 zy11Var2 = zy11.a;
                            LogoutComposeActivity logoutComposeActivity2 = logoutComposeActivity;
                            switch (i4) {
                                case 0:
                                    com.yandex.passport.internal.util.a.a(logoutComposeActivity2, new Intent("android.intent.action.VIEW", Uri.parse((String) obj3)));
                                    break;
                                default:
                                    com.yandex.passport.internal.util.p.c(logoutComposeActivity2, (Exception) obj3);
                                    break;
                            }
                            return zy11Var2;
                        }
                    };
                    btsVar2.o0(Q3);
                }
                btsVar2.t(false);
                m.a(this.c, tlsVar, tlsVar2, (tls) Q3, btsVar2, 0);
                break;
            default:
                fid fidVar2 = (fid) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.E()) {
                        btsVar3.Y();
                        break;
                    }
                }
                boolean c = com.yandex.passport.common.ui.compose.d.c(vVar.b, fidVar2);
                k kVar = this.c;
                com.yandex.passport.common.ui.compose.theme.e.a(c, kVar.isWhiteLabel(), wwg.S(-1749428788, true, new i(kVar, vVar, logoutComposeActivity), fidVar2), fidVar2, 384, 0);
                break;
        }
        return zy11Var;
    }

    public i(v vVar, k kVar, LogoutComposeActivity logoutComposeActivity) {
        this.b = vVar;
        this.c = kVar;
        this.w = logoutComposeActivity;
    }
}
