package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import defpackage.ds31;
import defpackage.fvv;
import defpackage.qv90;
import defpackage.rwo;
import defpackage.sv90;
import defpackage.tje;
import defpackage.tls;
import defpackage.y22;
import defpackage.zy11;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedPayment$1$5$1(hVar, (String) obj, null), 3);
                break;
            case 1:
                SbpChallengeInfo sbpChallengeInfo = (SbpChallengeInfo) obj;
                PaymentMethod.SbpToken sbpToken = hVar.L;
                if (sbpToken != null) {
                    tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$proceedPayment$1$8$1$1(hVar, sbpChallengeInfo, sbpToken, null), 3);
                    break;
                }
                break;
            default:
                rwo rwoVar = hVar.c;
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.e0().d(null));
                tje.N(ds31.a(hVar), null, null, new DKSelectViewModel$getCompletionCallback$1$onFailure$1$1(hVar, (fvv) obj, null), 3);
                break;
        }
        return zy11Var;
    }
}
