package com.yandex.go.flex.common.facade.modules;

import defpackage.bgy;
import defpackage.cxi;
import defpackage.dtg;
import defpackage.ea1;
import defpackage.g0c;
import defpackage.g0p;
import defpackage.g8e;
import defpackage.gir;
import defpackage.i3y;
import defpackage.ike;
import defpackage.mu;
import defpackage.nu;
import defpackage.o400;
import defpackage.pyy0;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.ueo;
import defpackage.uph;
import defpackage.uyj;
import defpackage.xn5;
import defpackage.xzy0;
import flex.feature.timed.action.a;
import flex.feature.timed.action.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements gir {
    public final /* synthetic */ Set a;
    public final /* synthetic */ com.yandex.go.flex.common.descriptors.action.a b;
    public final /* synthetic */ tt2 c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ Set f;
    public final /* synthetic */ Set g;

    public /* synthetic */ a(Set set, com.yandex.go.flex.common.descriptors.action.a aVar, tt2 tt2Var, Set set2, Set set3, Set set4, Set set5) {
        this.a = set;
        this.b = aVar;
        this.c = tt2Var;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = set5;
    }

    @Override // defpackage.gir
    public final g0p a() {
        Set set = this.a;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((nu) it.next()).create());
        }
        com.yandex.go.flex.common.descriptors.action.a aVar = this.b;
        ArrayList m0 = kotlin.collections.a.m0(aVar.c(), kotlin.collections.a.m0(aVar.a(), arrayList));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        final ike f = g8e.f(o400.a);
        FlexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2 flexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2 = FlexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2.b;
        pyy0 pyy0Var = new pyy0(9);
        final int i = 0;
        sls slsVar = new sls() { // from class: u8z0
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ike ikeVar = f;
                switch (i2) {
                    case 0:
                        return new b(ikeVar);
                    default:
                        return new a(ikeVar);
                }
            }
        };
        g0c a = qoi0.a(uph.class);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        i3y b = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        EmptyList emptyList = EmptyList.a;
        mu muVar = new mu("DelayedAction", a, pyy0Var, b, emptyList, false);
        final int i2 = 1;
        ArrayList m02 = kotlin.collections.a.m0(scc.g(muVar, new mu("DebounceAction", qoi0.a(dtg.class), new pyy0(10), kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: u8z0
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ike ikeVar = f;
                switch (i22) {
                    case 0:
                        return new b(ikeVar);
                    default:
                        return new a(ikeVar);
                }
            }
        }), emptyList, false), new mu("ThrottleAction", qoi0.a(xzy0.class), new pyy0(11), kotlin.a.b(lazyThreadSafetyMode, new ueo(5, flexDescriptorsModule$provideMainScreenDescriptorsRepository$1$2)), emptyList, false), new mu("LimiterAction", qoi0.a(bgy.class), new pyy0(12), kotlin.a.b(lazyThreadSafetyMode, new pyy0(13)), emptyList, false)), m0);
        Set set2 = this.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ea1) it2.next()).a());
        }
        Set set3 = this.e;
        ArrayList arrayList3 = new ArrayList(tcc.n(set3, 10));
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((xn5) it3.next()).a());
        }
        List J0 = kotlin.collections.a.J0(this.f);
        Set set4 = this.g;
        ArrayList arrayList4 = new ArrayList(tcc.n(set4, 10));
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((cxi) it4.next()).create());
        }
        return new g0p(arrayList3, null, m02, arrayList2, J0, null, arrayList4, null, 710);
    }
}
