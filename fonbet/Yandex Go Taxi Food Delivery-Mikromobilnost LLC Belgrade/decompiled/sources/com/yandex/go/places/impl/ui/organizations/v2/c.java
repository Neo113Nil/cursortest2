package com.yandex.go.places.impl.ui.organizations.v2;

import defpackage.fyc;
import defpackage.k8c0;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c implements k8c0 {
    public final /* synthetic */ f a;

    public c(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.k8c0
    public final Object a() {
        return kotlin.collections.b.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.k8c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1 organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1;
        int i;
        if (continuationImpl instanceof OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1) {
            organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1 = (OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1) continuationImpl;
            int i2 = organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label;
                f fVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fyc fycVar = fVar.l0;
                    organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label = 1;
                    obj = fycVar.s(organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                long longValue = ((Number) obj).longValue();
                com.yandex.go.places.impl.domain.interactors.organizations.b bVar = fVar.E;
                Long l = new Long(longValue);
                organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.J$0 = longValue;
                organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label = 2;
                Object a = bVar.a(l, organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1 = new OrganizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1(this, continuationImpl);
        Object obj2 = organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label;
        f fVar2 = this.a;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        com.yandex.go.places.impl.domain.interactors.organizations.b bVar2 = fVar2.E;
        Long l2 = new Long(longValue2);
        organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.J$0 = longValue2;
        organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1.label = 2;
        Object a2 = bVar2.a(l2, organizationsListV2Presenter$requestParametersBuilder$1$createBodyParams$1);
        if (a2 != coroutineSingletons2) {
        }
    }
}
