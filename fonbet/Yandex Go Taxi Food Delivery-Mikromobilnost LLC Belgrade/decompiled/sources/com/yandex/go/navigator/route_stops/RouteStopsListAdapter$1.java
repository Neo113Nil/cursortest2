package com.yandex.go.navigator.route_stops;

import defpackage.jdl0;
import defpackage.pe50;
import defpackage.tls;
import defpackage.xcl0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class RouteStopsListAdapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        jdl0 jdl0Var;
        Object value;
        pe50 pe50Var;
        ArrayList arrayList;
        int intValue = ((Number) obj).intValue();
        jdl0Var = ((xcl0) this.receiver).a.presenter;
        r0 r0Var = jdl0Var.y.b;
        do {
            value = r0Var.getValue();
            pe50Var = (pe50) value;
            if (pe50Var == null) {
                break;
            }
            arrayList = new ArrayList(pe50Var.b);
            arrayList.remove(intValue);
        } while (!r0Var.k(value, pe50.a(pe50Var, null, arrayList, 1)));
        return zy11.a;
    }
}
