package com.yandex.go.navigator.gas_stations.repositories;

import com.yandex.go.navigator.gas_stations.models.GasStationSearchType;
import defpackage.ny61;
import defpackage.ows;
import defpackage.pws;
import defpackage.qws;
import defpackage.rws;
import defpackage.t6v;
import defpackage.u6v;
import defpackage.v6v;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w6v;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ows b;

    public d(vpr vprVar, ows owsVar) {
        this.a = vprVar;
        this.b = owsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1 gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1;
        int i;
        GasStationsSearchResult gasStationsSearchResult;
        if (continuation instanceof GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1) {
            gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1 = (GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rws rwsVar = (rws) obj;
                    if (rwsVar instanceof qws) {
                        gasStationsSearchResult = GasStationsSearchResult.LOADING;
                    } else {
                        if (!(rwsVar instanceof pws)) {
                            w511.b();
                            return null;
                        }
                        w6v w6vVar = ((pws) rwsVar).a;
                        if (w6vVar instanceof v6v) {
                            gasStationsSearchResult = GasStationsSearchResult.SUCCESS;
                        } else if (w6vVar instanceof u6v) {
                            if (((u6v) w6vVar).a == GasStationSearchType.ON_ROUTE) {
                                this.b.a.l(Boolean.TRUE);
                            }
                            gasStationsSearchResult = GasStationsSearchResult.FAIL;
                        } else {
                            if (!w6vVar.equals(t6v.a)) {
                                w511.b();
                                return null;
                            }
                            gasStationsSearchResult = null;
                        }
                    }
                    if (gasStationsSearchResult != null) {
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.L$0 = null;
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.L$1 = null;
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.L$2 = null;
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.L$3 = null;
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.L$4 = null;
                        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(gasStationsSearchResult, gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1 = new GasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsSearchResultRepository$special$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
