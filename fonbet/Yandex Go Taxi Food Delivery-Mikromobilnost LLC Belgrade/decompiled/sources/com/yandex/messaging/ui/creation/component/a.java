package com.yandex.messaging.ui.creation.component;

import defpackage.bab;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.o430;
import defpackage.tls;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;

/* loaded from: classes15.dex */
public final class a implements wls {
    public final /* synthetic */ TelemessengerCreationDialogFragment a;

    public a(TelemessengerCreationDialogFragment telemessengerCreationDialogFragment) {
        this.a = telemessengerCreationDialogFragment;
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
        btsVar2.e0(2059210053);
        TelemessengerCreationDialogFragment telemessengerCreationDialogFragment = this.a;
        boolean e = btsVar2.e(telemessengerCreationDialogFragment);
        Object Q = btsVar2.Q();
        o430 o430Var = did.a;
        if (e || Q == o430Var) {
            Q = new TelemessengerCreationDialogFragment$onCreateView$2$1$1$1(telemessengerCreationDialogFragment, null);
            btsVar2.o0(Q);
        }
        tls tlsVar = (tls) Q;
        btsVar2.t(false);
        btsVar2.e0(2059212462);
        boolean e2 = btsVar2.e(telemessengerCreationDialogFragment);
        Object Q2 = btsVar2.Q();
        if (e2 || Q2 == o430Var) {
            Q2 = new TelemessengerCreationDialogFragment$onCreateView$2$1$2$1(telemessengerCreationDialogFragment, null);
            btsVar2.o0(Q2);
        }
        btsVar2.t(false);
        com.yandex.messaging.ui.di.a.a(tlsVar, (tls) Q2, wwg.S(-619128001, true, new bab(15, telemessengerCreationDialogFragment), btsVar2), btsVar2, 384);
        return zy11.a;
    }
}
