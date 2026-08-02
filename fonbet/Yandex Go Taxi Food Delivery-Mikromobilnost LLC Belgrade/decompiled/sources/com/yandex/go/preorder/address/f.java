package com.yandex.go.preorder.address;

import com.yandex.go.address.models.Address;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p931;
import defpackage.q0j;
import defpackage.q931;
import defpackage.r0j;
import defpackage.r931;
import defpackage.s0j;
import defpackage.w511;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes13.dex */
public final class f {
    public final com.yandex.go.route.interactor.c a;
    public final com.yandex.go.route.interactor.b b;
    public final com.yandex.go.address.search.common.domain.interactor.a c;

    public f(com.yandex.go.route.interactor.c cVar, com.yandex.go.route.interactor.b bVar, com.yandex.go.address.search.common.domain.interactor.a aVar) {
        this.a = cVar;
        this.b = bVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1 validateDestinationAddressInteractor$validateSelectedDestinationAddress$1;
        int i;
        Address address;
        boolean z2;
        if (continuationImpl instanceof ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1) {
            validateDestinationAddressInteractor$validateSelectedDestinationAddress$1 = (ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1) continuationImpl;
            int i2 = validateDestinationAddressInteractor$validateSelectedDestinationAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                validateDestinationAddressInteractor$validateSelectedDestinationAddress$1.label = i2 - Integer.MIN_VALUE;
                ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1 validateDestinationAddressInteractor$validateSelectedDestinationAddress$12 = validateDestinationAddressInteractor$validateSelectedDestinationAddress$1;
                Object obj = validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.label;
                q0j q0jVar = q0j.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Address d = this.a.d();
                    if (d == null) {
                        if (z) {
                            return q0jVar;
                        }
                        jst.e.s(new IllegalStateException("Destination address should not be null in validateSelectedFavoriteAddress"));
                        return s0j.a;
                    }
                    RoutePointType routePointType = RoutePointType.POINT_B;
                    validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.L$0 = d;
                    validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.Z$0 = z;
                    validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.label = 1;
                    obj = this.c.b(d, routePointType, null, false, validateDestinationAddressInteractor$validateSelectedDestinationAddress$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    address = d;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    address = (Address) validateDestinationAddressInteractor$validateSelectedDestinationAddress$12.L$0;
                    kotlin.b.b(obj);
                }
                r931 r931Var = (r931) obj;
                z2 = r931Var instanceof p931;
                com.yandex.go.route.interactor.b bVar = this.b;
                if (!z2) {
                    bVar.o(Collections.singletonList(r931Var.a.a));
                    return q0jVar;
                }
                if (r931Var instanceof q931) {
                    bVar.j();
                    return new r0j(r931Var.a, address);
                }
                w511.b();
                return null;
            }
        }
        validateDestinationAddressInteractor$validateSelectedDestinationAddress$1 = new ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1(this, continuationImpl);
        ValidateDestinationAddressInteractor$validateSelectedDestinationAddress$1 validateDestinationAddressInteractor$validateSelectedDestinationAddress$122 = validateDestinationAddressInteractor$validateSelectedDestinationAddress$1;
        Object obj2 = validateDestinationAddressInteractor$validateSelectedDestinationAddress$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validateDestinationAddressInteractor$validateSelectedDestinationAddress$122.label;
        q0j q0jVar2 = q0j.a;
        if (i != 0) {
        }
        r931 r931Var2 = (r931) obj2;
        z2 = r931Var2 instanceof p931;
        com.yandex.go.route.interactor.b bVar2 = this.b;
        if (!z2) {
        }
    }
}
