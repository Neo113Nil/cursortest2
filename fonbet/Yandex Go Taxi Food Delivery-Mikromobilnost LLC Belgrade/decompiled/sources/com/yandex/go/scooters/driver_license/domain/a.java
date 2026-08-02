package com.yandex.go.scooters.driver_license.domain;

import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import defpackage.ab60;
import defpackage.io60;
import defpackage.ny61;
import defpackage.pne;
import defpackage.u5o;
import defpackage.ua41;
import defpackage.w511;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes13.dex */
public final class a {
    public final q a;
    public final o b;
    public final com.yandex.go.scooters.driver_license.data.a c;

    public a(q qVar, o oVar, com.yandex.go.scooters.driver_license.data.a aVar) {
        this.a = qVar;
        this.b = oVar;
        this.c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersDriverLicenseInteractor$getWrappedAuthUrl$1 scootersDriverLicenseInteractor$getWrappedAuthUrl$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof ScootersDriverLicenseInteractor$getWrappedAuthUrl$1) {
            scootersDriverLicenseInteractor$getWrappedAuthUrl$1 = (ScootersDriverLicenseInteractor$getWrappedAuthUrl$1) continuationImpl;
            int i2 = scootersDriverLicenseInteractor$getWrappedAuthUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDriverLicenseInteractor$getWrappedAuthUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDriverLicenseInteractor$getWrappedAuthUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDriverLicenseInteractor$getWrappedAuthUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    scootersDriverLicenseInteractor$getWrappedAuthUrl$1.L$0 = str;
                    scootersDriverLicenseInteractor$getWrappedAuthUrl$1.label = 1;
                    obj = this.b.b(str, authType, scootersDriverLicenseInteractor$getWrappedAuthUrl$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) scootersDriverLicenseInteractor$getWrappedAuthUrl$1.L$0;
                    b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!(ua41Var instanceof pne)) {
                    return ((pne) ua41Var).a;
                }
                if ((ua41Var instanceof io60) || (ua41Var instanceof u5o) || (ua41Var instanceof ab60)) {
                    return str;
                }
                w511.b();
                return null;
            }
        }
        scootersDriverLicenseInteractor$getWrappedAuthUrl$1 = new ScootersDriverLicenseInteractor$getWrappedAuthUrl$1(this, continuationImpl);
        Object obj2 = scootersDriverLicenseInteractor$getWrappedAuthUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseInteractor$getWrappedAuthUrl$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj2;
        if (!(ua41Var instanceof pne)) {
        }
    }

    public final void b(ScootersDriverLicenseVerificationStatus scootersDriverLicenseVerificationStatus) {
        this.c.c.l(scootersDriverLicenseVerificationStatus);
    }
}
