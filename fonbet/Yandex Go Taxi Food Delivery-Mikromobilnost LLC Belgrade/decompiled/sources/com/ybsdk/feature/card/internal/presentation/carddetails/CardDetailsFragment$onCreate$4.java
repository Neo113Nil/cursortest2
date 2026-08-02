package com.ybsdk.feature.card.internal.presentation.carddetails;

import defpackage.bq8;
import defpackage.ds31;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uc5;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zqj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class CardDetailsFragment$onCreate$4 extends FunctionReferenceImpl implements tls {
    public CardDetailsFragment$onCreate$4(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onRequisites2faSuccess", "onRequisites2faSuccess(Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        zqj0 zqj0Var = ((bq8) bVar.X()).k;
        if (zqj0Var == null) {
            x4c.g("Failed to process requisites 2fa requisites2faData null", null, null, null, 14);
        } else {
            String str2 = zqj0Var.b;
            Integer num = zqj0Var.c;
            String str3 = zqj0Var.a;
            wls wlsVar = zqj0Var.d;
            pzt0 pzt0Var = bVar.T;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            bVar.T = tje.N(ds31.a(bVar), null, null, new CardDetailsViewModel$requestRequisitesIfRequired$2(bVar, str2, wlsVar, str, str3, num, null), 3);
        }
        return zy11.a;
    }
}
