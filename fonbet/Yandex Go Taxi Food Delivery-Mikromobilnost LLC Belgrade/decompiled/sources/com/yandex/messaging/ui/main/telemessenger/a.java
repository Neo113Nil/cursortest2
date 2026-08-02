package com.yandex.messaging.ui.main.telemessenger;

import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.ged;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ TeleMessengerMainFragment a;

    public a(TeleMessengerMainFragment teleMessengerMainFragment) {
        this.a = teleMessengerMainFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        fid fidVar = (fid) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1905976896);
        TeleMessengerMainFragment teleMessengerMainFragment = this.a;
        boolean e = btsVar2.e(teleMessengerMainFragment);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$1$1(teleMessengerMainFragment, null);
            btsVar2.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar2.t(false);
        btsVar2.e0(-1905973991);
        boolean e2 = btsVar2.e(teleMessengerMainFragment);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == o430Var) {
            Q2 = new TeleMessengerMainFragment$setupConnectionStatusOverlay$1$1$2$1(teleMessengerMainFragment, null);
            btsVar2.o0(Q2);
        }
        btsVar2.t(false);
        ged.a.getClass();
        com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q2, ged.c, btsVar2, 384);
        return zy11.a;
    }
}
