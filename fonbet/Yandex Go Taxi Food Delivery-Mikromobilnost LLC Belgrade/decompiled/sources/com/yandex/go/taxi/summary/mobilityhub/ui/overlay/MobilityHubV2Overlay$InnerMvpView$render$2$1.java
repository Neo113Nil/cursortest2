package com.yandex.go.taxi.summary.mobilityhub.ui.overlay;

import defpackage.btj0;
import defpackage.fw20;
import defpackage.khq0;
import defpackage.lhq0;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class MobilityHubV2Overlay$InnerMvpView$render$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        List list;
        btj0 btj0Var;
        btj0 btj0Var2;
        int intValue = ((Number) obj).intValue();
        lhq0 lhq0Var = ((fw20) this.receiver).E;
        khq0 khq0Var = (khq0) lhq0Var.b.getValue();
        if (khq0Var != null && (list = khq0Var.g) != null && (btj0Var = (btj0) kotlin.collections.a.S(intValue, list)) != null && (btj0Var2 = khq0Var.f) != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(intValue);
            arrayList.add(btj0Var2);
            lhq0Var.b(new khq0(khq0Var.a, khq0Var.b, khq0Var.c, btj0Var.b, btj0Var.a, btj0Var, arrayList, khq0Var.h, khq0Var.i, khq0Var.j, khq0Var.k, khq0Var.l, khq0Var.m, khq0Var.n, khq0Var.o));
        }
        return zy11.a;
    }
}
