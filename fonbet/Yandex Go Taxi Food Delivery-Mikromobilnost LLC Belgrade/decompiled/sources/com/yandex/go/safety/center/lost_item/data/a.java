package com.yandex.go.safety.center.lost_item.data;

import com.yandex.go.safety.center.lost_item.network.LostItemsApi;
import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import com.yandex.go.safety.center.lost_item.network.LostItemsRequestParams;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.ny61;
import defpackage.on2;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public final class a {
    public final LostItemsApi a;
    public final cne0 b;

    public a(on2 on2Var, dne0 dne0Var) {
        on2Var.getClass();
        this.a = (LostItemsApi) on2Var.a(GoApiName.TaxiV4, LostItemsApi.class);
        this.b = dne0Var.a("lost_items");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        LostItemsRepository$getLostItemsResponse$1 lostItemsRepository$getLostItemsResponse$1;
        int i;
        try {
            if (continuationImpl instanceof LostItemsRepository$getLostItemsResponse$1) {
                lostItemsRepository$getLostItemsResponse$1 = (LostItemsRepository$getLostItemsResponse$1) continuationImpl;
                int i2 = lostItemsRepository$getLostItemsResponse$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lostItemsRepository$getLostItemsResponse$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lostItemsRepository$getLostItemsResponse$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lostItemsRepository$getLostItemsResponse$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<LostItemsApiResponse> a = this.a.a(new LostItemsRequestParams(str));
                        lostItemsRepository$getLostItemsResponse$1.L$0 = null;
                        lostItemsRepository$getLostItemsResponse$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, lostItemsRepository$getLostItemsResponse$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (LostItemsApiResponse) obj;
                }
            }
            if (i != 0) {
            }
            return (LostItemsApiResponse) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        lostItemsRepository$getLostItemsResponse$1 = new LostItemsRepository$getLostItemsResponse$1(this, continuationImpl);
        Object obj2 = lostItemsRepository$getLostItemsResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsRepository$getLostItemsResponse$1.label;
    }
}
