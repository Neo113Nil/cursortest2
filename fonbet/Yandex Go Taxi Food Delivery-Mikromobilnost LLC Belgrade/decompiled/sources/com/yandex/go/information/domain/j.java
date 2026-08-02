package com.yandex.go.information.domain;

import com.yandex.go.information.data.InformationApi;
import com.yandex.go.information.data.dto.ServicesRequest;
import com.yandex.go.information.data.dto.ServicesResponse;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.o3h;
import defpackage.tt2;
import defpackage.xl51;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class j {
    public final InformationApi a;
    public final tt2 b;
    public final h3y c;
    public final ru.yandex.taxi.deeplinks.f d;
    public final o3h e;
    public final xl51 f;

    public j(InformationApi informationApi, tt2 tt2Var, h3y h3yVar, ru.yandex.taxi.deeplinks.f fVar, o3h o3hVar, xl51 xl51Var) {
        this.a = informationApi;
        this.b = tt2Var;
        this.c = h3yVar;
        this.d = fVar;
        this.e = o3hVar;
        this.f = xl51Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, zzs zzsVar, ContinuationImpl continuationImpl) {
        ServiceInfoRepository$serviceResponse$1 serviceInfoRepository$serviceResponse$1;
        int i;
        jVar.getClass();
        if (continuationImpl instanceof ServiceInfoRepository$serviceResponse$1) {
            serviceInfoRepository$serviceResponse$1 = (ServiceInfoRepository$serviceResponse$1) continuationImpl;
            int i2 = serviceInfoRepository$serviceResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceInfoRepository$serviceResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serviceInfoRepository$serviceResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceInfoRepository$serviceResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ServicesResponse> a = jVar.a.a(new ServicesRequest(1, zzsVar));
                    serviceInfoRepository$serviceResponse$1.L$0 = null;
                    serviceInfoRepository$serviceResponse$1.L$1 = null;
                    serviceInfoRepository$serviceResponse$1.label = 1;
                    obj = a.a(serviceInfoRepository$serviceResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((fmt) obj).a;
            }
        }
        serviceInfoRepository$serviceResponse$1 = new ServiceInfoRepository$serviceResponse$1(jVar, continuationImpl);
        Object obj2 = serviceInfoRepository$serviceResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceInfoRepository$serviceResponse$1.label;
        if (i != 0) {
        }
        return ((fmt) obj2).a;
    }
}
