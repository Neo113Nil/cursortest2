package com.yandex.go.places.organization.card.impl.data.repositories;

import com.yandex.go.places.organization.card.impl.data.api.OrganizationsDiscoveryInternalApi;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.UserReviewRequestParams;
import defpackage.al80;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.mk80;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final al80 a;

    public a(al80 al80Var) {
        this.a = al80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        OrganizationCardDeleteReviewRepository$deleteReview$1 organizationCardDeleteReviewRepository$deleteReview$1;
        int i;
        try {
            if (continuationImpl instanceof OrganizationCardDeleteReviewRepository$deleteReview$1) {
                organizationCardDeleteReviewRepository$deleteReview$1 = (OrganizationCardDeleteReviewRepository$deleteReview$1) continuationImpl;
                int i2 = organizationCardDeleteReviewRepository$deleteReview$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    organizationCardDeleteReviewRepository$deleteReview$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = organizationCardDeleteReviewRepository$deleteReview$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = organizationCardDeleteReviewRepository$deleteReview$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<zy11> a = ((OrganizationsDiscoveryInternalApi) this.a.a.getValue()).a(str, new UserReviewRequestParams(str2));
                        organizationCardDeleteReviewRepository$deleteReview$1.L$0 = null;
                        organizationCardDeleteReviewRepository$deleteReview$1.L$1 = null;
                        organizationCardDeleteReviewRepository$deleteReview$1.L$2 = null;
                        organizationCardDeleteReviewRepository$deleteReview$1.label = 1;
                        if (ru.yandex.taxi.network.api.a.a(a, null, organizationCardDeleteReviewRepository$deleteReview$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return new kk80(zy11.a);
                }
            }
            if (i != 0) {
            }
            return new kk80(zy11.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return new mk80(th);
        }
        organizationCardDeleteReviewRepository$deleteReview$1 = new OrganizationCardDeleteReviewRepository$deleteReview$1(this, continuationImpl);
        Object obj2 = organizationCardDeleteReviewRepository$deleteReview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardDeleteReviewRepository$deleteReview$1.label;
    }
}
