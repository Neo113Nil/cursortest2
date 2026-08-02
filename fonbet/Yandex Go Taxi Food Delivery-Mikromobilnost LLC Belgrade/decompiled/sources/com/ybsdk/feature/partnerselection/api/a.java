package com.ybsdk.feature.partnerselection.api;

import android.os.Bundle;
import com.ybsdk.feature.partnerselection.api.PartnerSelectionResult;
import defpackage.bgc;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final class a implements wls {
    public final tls a;
    public final sls b;
    public final sls c;

    public /* synthetic */ a(tls tlsVar, sls slsVar, int i) {
        this((i & 2) != 0 ? new bgc(12) : slsVar, new bgc(12), tlsVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PartnerSelectionResult.Companion.getClass();
        PartnerSelectionResult partnerSelectionResult = (PartnerSelectionResult) ((Bundle) obj2).getParcelable("PartnerSelectionResult");
        if (jl40.l(partnerSelectionResult, PartnerSelectionResult.Close.INSTANCE)) {
            this.b.invoke();
        } else if (partnerSelectionResult instanceof PartnerSelectionResult.Success) {
            this.a.invoke(((PartnerSelectionResult.Success) partnerSelectionResult).getPartner());
        } else if (jl40.l(partnerSelectionResult, PartnerSelectionResult.BackPressed.INSTANCE)) {
            this.c.invoke();
        } else if (partnerSelectionResult != null) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    public a(sls slsVar, sls slsVar2, tls tlsVar) {
        this.a = tlsVar;
        this.b = slsVar;
        this.c = slsVar2;
    }
}
