package com.yandex.go.places.organization.card.impl.domain.interactors.map.common;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.u55;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ u55 b;

    public b(g gVar, u55 u55Var) {
        this.a = gVar;
        this.b = u55Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1 baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1) {
            baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1 = (BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1) continuation;
            int i2 = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.L$0 = null;
                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.L$1 = null;
                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.L$2 = null;
                    baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1 = new BaseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseOrganizationCardMapInteractor$mapToSelectedMapObjectInfo$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
