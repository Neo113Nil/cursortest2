package com.yandex.go.taxi.order.queue.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.zone.dto.objects.QueueScreen;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.an91;
import defpackage.kgx;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class d {
    public static final /* synthetic */ int b = 0;
    public final com.yandex.go.taxi.order.queue.repository.a a;

    static {
        kgx[] kgxVarArr = com.yandex.go.taxi.order.queue.repository.a.d;
    }

    public d(com.yandex.go.taxi.order.queue.repository.a aVar) {
        this.a = aVar;
    }

    public static SearchInfoResponse$QueueSearch.QueueInfo a(TaxiOrder taxiOrder) {
        QueueScreen queueScreen;
        ServiceLevel.QueueOnSearchDisplayInfo queueOnSearchDisplayInfo = taxiOrder.b.E;
        if (queueOnSearchDisplayInfo != null && (queueScreen = queueOnSearchDisplayInfo.a) != null) {
            if (!an91.i(taxiOrder.h.b) || queueScreen.equals(QueueScreen.g)) {
                queueScreen = null;
            }
            if (queueScreen != null) {
                return new SearchInfoResponse$QueueSearch.QueueInfo(HProv.PP_DELETE_SAVED_PASSWD, queueScreen);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, ContinuationImpl continuationImpl) {
        QueueBaseInteractor$isQueueValid$1 queueBaseInteractor$isQueueValid$1;
        int i2;
        if (continuationImpl instanceof QueueBaseInteractor$isQueueValid$1) {
            queueBaseInteractor$isQueueValid$1 = (QueueBaseInteractor$isQueueValid$1) continuationImpl;
            int i3 = queueBaseInteractor$isQueueValid$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                queueBaseInteractor$isQueueValid$1.label = i3 - Integer.MIN_VALUE;
                Object obj = queueBaseInteractor$isQueueValid$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = queueBaseInteractor$isQueueValid$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    queueBaseInteractor$isQueueValid$1.L$0 = null;
                    queueBaseInteractor$isQueueValid$1.I$0 = i;
                    queueBaseInteractor$isQueueValid$1.label = 1;
                    obj = this.a.a(str, queueBaseInteractor$isQueueValid$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = queueBaseInteractor$isQueueValid$1.I$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((Number) obj).intValue() <= i);
            }
        }
        queueBaseInteractor$isQueueValid$1 = new QueueBaseInteractor$isQueueValid$1(this, continuationImpl);
        Object obj2 = queueBaseInteractor$isQueueValid$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = queueBaseInteractor$isQueueValid$1.label;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() <= i);
    }
}
