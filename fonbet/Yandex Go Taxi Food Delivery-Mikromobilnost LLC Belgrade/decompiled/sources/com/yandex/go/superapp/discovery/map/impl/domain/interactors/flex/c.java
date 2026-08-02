package com.yandex.go.superapp.discovery.map.impl.domain.interactors.flex;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;
import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.SuperAppDiscoveryMapFlexGeoPoint;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.SuperAppDiscoveryMapMainScreenDataRequestParams;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.SuperAppDiscoveryMapMainScreenRequestParams;
import com.yandex.go.superapp.discovery.map.impl.domain.entities.flex.SuperAppDiscoveryMapMainScreenStateRequestParams;
import defpackage.dvv0;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.g2t;
import defpackage.k8c0;
import defpackage.ksw;
import defpackage.ktv0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.zzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes14.dex */
public final class c implements k8c0 {
    public final wnt a;
    public final e2t b;
    public final ktv0 c;

    public c(wnt wntVar, e2t e2tVar, ktv0 ktv0Var) {
        this.a = wntVar;
        this.b = e2tVar;
        this.c = ktv0Var;
    }

    @Override // defpackage.k8c0
    public final Object a() {
        return kotlin.collections.b.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
    
        if (r11 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.k8c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperAppMainScreenFlexRequestParametersInteractor$createBodyParams$1 superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object y;
        ksw kswVar;
        String str;
        int i2;
        SuperAppDiscoveryMapLayerDto superAppDiscoveryMapLayerDto;
        if (continuationImpl instanceof SuperAppMainScreenFlexRequestParametersInteractor$createBodyParams$1) {
            superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1 = (SuperAppMainScreenFlexRequestParametersInteractor$createBodyParams$1) continuationImpl;
            int i3 = superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label = i3 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label;
                e2t e2tVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) e2tVar).h;
                    superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label = 1;
                    obj = e.y(mthVar, superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kswVar = (ksw) superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.L$0;
                        kotlin.b.b(obj);
                        zzs zzsVar = ((g2t) obj).b.a;
                        if (kswVar != null || (str = kswVar.g) == null) {
                            str = kswVar == null ? kswVar.f : null;
                        }
                        SuperAppDiscoveryMapLayer f = this.c.f();
                        SuperAppDiscoveryMapMainScreenDataRequestParams superAppDiscoveryMapMainScreenDataRequestParams = new SuperAppDiscoveryMapMainScreenDataRequestParams(str);
                        i2 = dvv0.a[f.ordinal()];
                        if (i2 != 1) {
                            superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.PLACES;
                        } else if (i2 == 2) {
                            superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.TRANSPORT;
                        } else if (i2 == 3) {
                            superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.SCOOTERS;
                        } else if (i2 == 4) {
                            superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.TAXI;
                        } else {
                            if (i2 != 5) {
                                w511.b();
                                return null;
                            }
                            superAppDiscoveryMapLayerDto = SuperAppDiscoveryMapLayerDto.CHARGERS;
                        }
                        SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams = new SuperAppDiscoveryMapMainScreenStateRequestParams(zzsVar, superAppDiscoveryMapLayerDto);
                        double d = zzsVar.b;
                        double d2 = zzsVar.a;
                        return ((xnt) this.a).f(new SuperAppDiscoveryMapMainScreenRequestParams(superAppDiscoveryMapMainScreenDataRequestParams, superAppDiscoveryMapMainScreenStateRequestParams, new SuperAppDiscoveryMapFlexGeoPoint(Double.valueOf(d), Double.valueOf(d2)), new SuperAppDiscoveryMapFlexGeoPoint(Double.valueOf(zzsVar.b), Double.valueOf(d2))), SuperAppDiscoveryMapMainScreenRequestParams.Companion.serializer());
                    }
                    kotlin.b.b(obj);
                }
                List list = ((g2t) obj).a.a.c;
                ksw kswVar2 = list == null ? (ksw) kotlin.collections.a.R(list) : null;
                mth mthVar2 = ((f2t) e2tVar).h;
                superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.L$0 = kswVar2;
                superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label = 2;
                y = e.y(mthVar2, superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1);
                if (y != coroutineSingletons) {
                    kswVar = kswVar2;
                    obj = y;
                    zzs zzsVar2 = ((g2t) obj).b.a;
                    if (kswVar != null) {
                    }
                    if (kswVar == null) {
                    }
                    SuperAppDiscoveryMapLayer f2 = this.c.f();
                    SuperAppDiscoveryMapMainScreenDataRequestParams superAppDiscoveryMapMainScreenDataRequestParams2 = new SuperAppDiscoveryMapMainScreenDataRequestParams(str);
                    i2 = dvv0.a[f2.ordinal()];
                    if (i2 != 1) {
                    }
                    SuperAppDiscoveryMapMainScreenStateRequestParams superAppDiscoveryMapMainScreenStateRequestParams2 = new SuperAppDiscoveryMapMainScreenStateRequestParams(zzsVar2, superAppDiscoveryMapLayerDto);
                    double d3 = zzsVar2.b;
                    double d22 = zzsVar2.a;
                    return ((xnt) this.a).f(new SuperAppDiscoveryMapMainScreenRequestParams(superAppDiscoveryMapMainScreenDataRequestParams2, superAppDiscoveryMapMainScreenStateRequestParams2, new SuperAppDiscoveryMapFlexGeoPoint(Double.valueOf(d3), Double.valueOf(d22)), new SuperAppDiscoveryMapFlexGeoPoint(Double.valueOf(zzsVar2.b), Double.valueOf(d22))), SuperAppDiscoveryMapMainScreenRequestParams.Companion.serializer());
                }
                return coroutineSingletons;
            }
        }
        superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1 = new SuperAppMainScreenFlexRequestParametersInteractor$createBodyParams$1(this, continuationImpl);
        Object obj2 = superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label;
        e2t e2tVar2 = this.b;
        if (i != 0) {
        }
        List list2 = ((g2t) obj2).a.a.c;
        if (list2 == null) {
        }
        mth mthVar22 = ((f2t) e2tVar2).h;
        superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.L$0 = kswVar2;
        superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1.label = 2;
        y = e.y(mthVar22, superAppMainScreenFlexRequestParametersInteractor$createBodyParams$1);
        if (y != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
