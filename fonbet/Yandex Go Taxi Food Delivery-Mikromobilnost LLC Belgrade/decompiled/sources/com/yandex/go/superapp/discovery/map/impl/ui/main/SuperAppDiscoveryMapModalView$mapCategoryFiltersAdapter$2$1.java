package com.yandex.go.superapp.discovery.map.impl.ui.main;

import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.data.SuperAppMapCategoryFiltersStateRepository;
import com.yandex.go.superapp.discovery.map.impl.ui.main.filters.domain.entities.SuperAppDiscoveryMapFilter;
import defpackage.co40;
import defpackage.dwv0;
import defpackage.fwv0;
import defpackage.gtv0;
import defpackage.jl40;
import defpackage.p4w0;
import defpackage.q4w0;
import defpackage.stv0;
import defpackage.t6c0;
import defpackage.tls;
import defpackage.tuv0;
import defpackage.vib1;
import defpackage.w511;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperAppDiscoveryMapModalView$mapCategoryFiltersAdapter$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        gtv0 gtv0Var = (gtv0) obj;
        fwv0 fwv0Var = (fwv0) this.receiver;
        fwv0Var.getClass();
        tuv0 tuv0Var = fwv0Var.C;
        if (gtv0Var.h && gtv0Var.i) {
            tuv0Var.l(t6c0.a);
        } else {
            vib1 vib1Var = gtv0Var.f;
            if (vib1Var instanceof p4w0) {
                SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter = SuperAppDiscoveryMapFilter.PLACES;
                p4w0 p4w0Var = (p4w0) vib1Var;
                tuv0Var.e(p4w0Var.a, p4w0Var.c, p4w0Var.b);
            } else {
                if (!(vib1Var instanceof q4w0)) {
                    w511.b();
                    return null;
                }
                switch (dwv0.c[((q4w0) vib1Var).a.ordinal()]) {
                    case 1:
                        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter2 = SuperAppDiscoveryMapFilter.PLACES;
                        tuv0Var.g();
                        break;
                    case 2:
                        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter3 = SuperAppDiscoveryMapFilter.PLACES;
                        tuv0Var.j();
                        break;
                    case 3:
                        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter4 = SuperAppDiscoveryMapFilter.PLACES;
                        tuv0Var.f();
                        break;
                    case 4:
                        SuperAppDiscoveryMapFilter superAppDiscoveryMapFilter5 = SuperAppDiscoveryMapFilter.PLACES;
                        tuv0Var.h();
                        break;
                    case 5:
                    case 6:
                        break;
                    default:
                        w511.b();
                        return null;
                }
            }
        }
        stv0 stv0Var = fwv0Var.J;
        String str = gtv0Var.e;
        co40 co40Var = stv0Var.b;
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        co40Var.a.a("SuperMap.Suggest.Tapped", hashMap, 1, new HashMap());
        SuperAppMapCategoryFiltersStateRepository superAppMapCategoryFiltersStateRepository = fwv0Var.G.a;
        r0 r0Var = superAppMapCategoryFiltersStateRepository.a;
        gtv0 gtv0Var2 = (gtv0) r0Var.getValue();
        if (jl40.l(gtv0Var2 != null ? gtv0Var2.a : null, gtv0Var.a)) {
            superAppMapCategoryFiltersStateRepository.a.l(null);
        } else {
            r0Var.m(null, gtv0Var);
        }
        return zy11.a;
    }
}
