package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final class b implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ VpnChallengeActivity c;

    public /* synthetic */ b(String str, VpnChallengeActivity vpnChallengeActivity, int i) {
        this.a = i;
        this.b = str;
        this.c = vpnChallengeActivity;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = 0;
        VpnChallengeActivity vpnChallengeActivity = this.c;
        String str = this.b;
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
                btsVar2.e0(1751688155);
                boolean k = btsVar2.k(vpnChallengeActivity);
                Object Q = btsVar2.Q();
                if (k || Q == did.a) {
                    Q = new com.yandex.passport.internal.analytics.a0(15, vpnChallengeActivity);
                    btsVar2.o0(Q);
                }
                btsVar2.t(false);
                f.a(str, (tls) Q, btsVar2, 0);
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
                com.yandex.passport.common.ui.compose.theme.e.a(false, false, wwg.S(-480385266, true, new b(str, vpnChallengeActivity, i2), fidVar2), fidVar2, 390, 2);
                break;
        }
        return zy11Var;
    }
}
