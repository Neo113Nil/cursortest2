package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui;

import defpackage.jl40;
import defpackage.o7r0;
import defpackage.sxu;
import defpackage.tls;
import defpackage.txu;
import defpackage.uxu;
import defpackage.w511;
import defpackage.yxu;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class VerticalHubV1ModalView$footerView$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        yxu yxuVar = (yxu) obj;
        c cVar = (c) this.receiver;
        cVar.getClass();
        uxu uxuVar = yxuVar.g;
        String str = yxuVar.a;
        if (jl40.l(uxuVar, sxu.INSTANCE)) {
            if (cVar.E.a(str, false)) {
                o7r0 o7r0Var = cVar.D;
                List list = yxuVar.h;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("selected_filter_id", str);
                hashMap.put("available_filters", list);
                o7r0Var.a.a("TransitRoutesHub.Filter.Tapped", hashMap, 1, new HashMap());
            }
        } else if (!jl40.l(uxuVar, txu.INSTANCE) && uxuVar != null) {
            w511.b();
            return null;
        }
        cVar.Og();
        return zy11.a;
    }
}
