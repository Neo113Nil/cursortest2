package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;
import defpackage.ny61;
import defpackage.quv0;
import defpackage.yvf0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final Map a;

    public b(Map map) {
        this.a = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapDefaultLayerResolver$resolve$1 superAppDiscoveryMapDefaultLayerResolver$resolve$1;
        Object obj;
        int i;
        boolean z;
        quv0 quv0Var;
        if (continuationImpl instanceof SuperAppDiscoveryMapDefaultLayerResolver$resolve$1) {
            superAppDiscoveryMapDefaultLayerResolver$resolve$1 = (SuperAppDiscoveryMapDefaultLayerResolver$resolve$1) continuationImpl;
            int i2 = superAppDiscoveryMapDefaultLayerResolver$resolve$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapDefaultLayerResolver$resolve$1.label = i2 - Integer.MIN_VALUE;
                obj = superAppDiscoveryMapDefaultLayerResolver$resolve$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapDefaultLayerResolver$resolve$1.label;
                z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    yvf0 yvf0Var = (yvf0) this.a.get(superAppDiscoveryMapLayer);
                    if (yvf0Var != null && (quv0Var = (quv0) yvf0Var.get()) != null) {
                        superAppDiscoveryMapDefaultLayerResolver$resolve$1.L$0 = superAppDiscoveryMapLayer;
                        superAppDiscoveryMapDefaultLayerResolver$resolve$1.label = 1;
                        obj = quv0Var.d(superAppDiscoveryMapDefaultLayerResolver$resolve$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    SuperAppDiscoveryMapLayer superAppDiscoveryMapLayer2 = z ? superAppDiscoveryMapLayer : null;
                    return superAppDiscoveryMapLayer2 == null ? SuperAppDiscoveryMapLayer.PLACES : superAppDiscoveryMapLayer2;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                superAppDiscoveryMapLayer = (SuperAppDiscoveryMapLayer) superAppDiscoveryMapDefaultLayerResolver$resolve$1.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                }
                if (z) {
                }
                if (superAppDiscoveryMapLayer2 == null) {
                }
            }
        }
        superAppDiscoveryMapDefaultLayerResolver$resolve$1 = new SuperAppDiscoveryMapDefaultLayerResolver$resolve$1(this, continuationImpl);
        obj = superAppDiscoveryMapDefaultLayerResolver$resolve$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapDefaultLayerResolver$resolve$1.label;
        z = false;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        if (z) {
        }
        if (superAppDiscoveryMapLayer2 == null) {
        }
    }
}
