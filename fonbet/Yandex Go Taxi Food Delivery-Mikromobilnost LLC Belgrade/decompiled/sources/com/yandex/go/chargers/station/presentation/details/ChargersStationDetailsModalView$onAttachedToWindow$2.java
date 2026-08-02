package com.yandex.go.chargers.station.presentation.details;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersLocationCardButtonNameV3;
import defpackage.hsa;
import defpackage.hwa;
import defpackage.io9;
import defpackage.jra;
import defpackage.qo9;
import defpackage.ro9;
import defpackage.so9;
import defpackage.sra;
import defpackage.sy60;
import defpackage.tls;
import defpackage.uj9;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersStationDetailsModalView$onAttachedToWindow$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        qo9 qo9Var = (qo9) obj;
        sra sraVar = (sra) this.receiver;
        jra jraVar = sraVar.z;
        uj9 uj9Var = qo9Var.e;
        String str = qo9Var.a;
        if (uj9Var instanceof so9) {
            jraVar.a.m(ChargersAnalytics$ChargersLocationCardButtonNameV3.Badge, jraVar.d, str, jraVar.c);
            sraVar.Lg(((so9) uj9Var).a, false);
        } else if (uj9Var instanceof ro9) {
            jraVar.a.m(ChargersAnalytics$ChargersLocationCardButtonNameV3.Badge, jraVar.d, str, jraVar.c);
            io9 io9Var = sraVar.H;
            hwa hwaVar = ((ro9) uj9Var).a;
            hsa hsaVar = (hsa) io9Var.a;
            hsaVar.A(hsaVar.L.a(hsaVar.F), hwaVar, sy60.Q2);
        }
        return zy11.a;
    }
}
