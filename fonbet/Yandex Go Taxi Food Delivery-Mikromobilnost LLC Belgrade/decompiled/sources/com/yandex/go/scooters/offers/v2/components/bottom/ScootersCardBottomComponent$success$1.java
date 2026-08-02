package com.yandex.go.scooters.offers.v2.components.bottom;

import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsDisplayContext;
import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.h7n0;
import defpackage.m950;
import defpackage.orr0;
import defpackage.s4n0;
import defpackage.sls;
import defpackage.sy60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersCardBottomComponent$success$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        g gVar = ((h7n0) ((s4n0) this.receiver).x).b;
        m950 m950Var = (m950) gVar.c0.get();
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = SharingPersonalGoalsServiceName.SCOOTERS;
        SharingPersonalGoalsDisplayContext sharingPersonalGoalsDisplayContext = SharingPersonalGoalsDisplayContext.OFFER_CARD;
        gVar.A(m950Var, new orr0(sharingPersonalGoalsServiceName), sy60.Q2);
        return zy11.a;
    }
}
