package com.yandex.go.superapp.discovery.map.impl.ui.search;

import defpackage.avj0;
import defpackage.ny61;
import defpackage.sug0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ f b;

    public d(vpr vprVar, f fVar) {
        this.a = vprVar;
        this.b = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1 superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof SuperAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1) {
            superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1 = (SuperAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    f fVar = this.b;
                    ru.yandex.taxi.design.utils.b bVar = fVar.z;
                    int c = ((avj0) fVar.A).c(sug0.super_app_discovery_map_organizations_search_header_radius);
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$4 = vprVar;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
                    superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.a(c, true, superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
                superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label = 2;
            }
        }
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1 = new SuperAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
        superAppDiscoveryMapSearchPresenter$attachView$$inlined$map$1$2$1.label = 2;
    }
}
