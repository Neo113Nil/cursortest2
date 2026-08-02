package com.yandex.messaging.ui.main.telemessenger;

import android.view.View;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.z9b;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class b implements wls {
    public final /* synthetic */ TeleMessengerMainFragment a;
    public final /* synthetic */ View b;

    public b(TeleMessengerMainFragment teleMessengerMainFragment, View view) {
        this.a = teleMessengerMainFragment;
        this.b = view;
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
        btsVar2.e0(-1017880849);
        TeleMessengerMainFragment teleMessengerMainFragment = this.a;
        boolean e = btsVar2.e(teleMessengerMainFragment);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new TeleMessengerMainFragment$setupNavigationBar$1$1$1$1(teleMessengerMainFragment, null);
            btsVar2.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar2.t(false);
        btsVar2.e0(-1017878440);
        boolean e2 = btsVar2.e(teleMessengerMainFragment);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == o430Var) {
            Q2 = new TeleMessengerMainFragment$setupNavigationBar$1$1$2$1(teleMessengerMainFragment, null);
            btsVar2.o0(Q2);
        }
        btsVar2.t(false);
        com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q2, wwg.S(770273708, true, new z9b(19, teleMessengerMainFragment, this.b), btsVar2), btsVar2, 384);
        return zy11.a;
    }
}
