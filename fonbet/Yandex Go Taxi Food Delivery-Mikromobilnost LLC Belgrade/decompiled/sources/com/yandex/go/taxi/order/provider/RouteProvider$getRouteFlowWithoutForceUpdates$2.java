package com.yandex.go.taxi.order.provider;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.jl40;
import defpackage.l8l0;
import defpackage.wls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RouteProvider$getRouteFlowWithoutForceUpdates$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        l8l0 l8l0Var = (l8l0) obj;
        l8l0 l8l0Var2 = (l8l0) obj2;
        ((w) this.receiver).getClass();
        boolean g = l8l0Var.a.g(l8l0Var2.a);
        boolean l = jl40.l(l8l0Var.c, l8l0Var2.c);
        boolean l2 = jl40.l(l8l0Var.b, l8l0Var2.b);
        if (g) {
            d0l0 d0l0Var = l8l0Var.a;
            d0l0 d0l0Var2 = l8l0Var2.a;
            List a = d0l0Var.a();
            List a2 = d0l0Var2.a();
            if (a.size() == a2.size()) {
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    if (((Address) a.get(i)).Z() == ((Address) a2.get(i)).Z()) {
                    }
                }
                z = true;
                return Boolean.valueOf(!g && l2 && l && z);
            }
        }
        z = false;
        return Boolean.valueOf(!g && l2 && l && z);
    }
}
