package com.yandex.go.platform.payments;

import com.yandex.go.platform.payments.domain.c;
import com.yandex.go.platform.payments.domain.d;
import defpackage.fk;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.sls;
import defpackage.sma0;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements sma0 {
    public final i3y a;
    public final i3y b = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.YandexPaymentsDelegate$bindCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return (com.yandex.go.platform.payments.domain.a) ((com.yandex.go.platform.payments.di.a) a.this.a.getValue()).c.getValue();
        }
    });
    public final i3y c = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.YandexPaymentsDelegate$unbindCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return (c) ((com.yandex.go.platform.payments.di.a) a.this.a.getValue()).d.getValue();
        }
    });
    public final i3y d = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.YandexPaymentsDelegate$verifyCardInteractor$2
        {
            super(0);
        }

        @Override // defpackage.sls
        public final Object invoke() {
            return (d) ((com.yandex.go.platform.payments.di.a) a.this.a.getValue()).e.getValue();
        }
    });

    public a(final com.yandex.taxi.go_platform.delegates.a aVar) {
        this.a = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.payments.YandexPaymentsDelegate$paymentsComponent$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new com.yandex.go.platform.payments.di.a(fk.this);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        YandexPaymentsDelegate$bindCard$1 yandexPaymentsDelegate$bindCard$1;
        int i;
        if (continuationImpl instanceof YandexPaymentsDelegate$bindCard$1) {
            yandexPaymentsDelegate$bindCard$1 = (YandexPaymentsDelegate$bindCard$1) continuationImpl;
            int i2 = yandexPaymentsDelegate$bindCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yandexPaymentsDelegate$bindCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yandexPaymentsDelegate$bindCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yandexPaymentsDelegate$bindCard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                com.yandex.go.platform.payments.domain.a aVar = (com.yandex.go.platform.payments.domain.a) this.b.getValue();
                yandexPaymentsDelegate$bindCard$1.label = 1;
                Object a = aVar.a(str, str2, str3, yandexPaymentsDelegate$bindCard$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        yandexPaymentsDelegate$bindCard$1 = new YandexPaymentsDelegate$bindCard$1(this, continuationImpl);
        Object obj2 = yandexPaymentsDelegate$bindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yandexPaymentsDelegate$bindCard$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        YandexPaymentsDelegate$unbindCard$1 yandexPaymentsDelegate$unbindCard$1;
        int i;
        if (continuationImpl instanceof YandexPaymentsDelegate$unbindCard$1) {
            yandexPaymentsDelegate$unbindCard$1 = (YandexPaymentsDelegate$unbindCard$1) continuationImpl;
            int i2 = yandexPaymentsDelegate$unbindCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yandexPaymentsDelegate$unbindCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yandexPaymentsDelegate$unbindCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yandexPaymentsDelegate$unbindCard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                c cVar = (c) this.c.getValue();
                yandexPaymentsDelegate$unbindCard$1.label = 1;
                Object a = cVar.a(str, str2, str3, yandexPaymentsDelegate$unbindCard$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        yandexPaymentsDelegate$unbindCard$1 = new YandexPaymentsDelegate$unbindCard$1(this, continuationImpl);
        Object obj2 = yandexPaymentsDelegate$unbindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yandexPaymentsDelegate$unbindCard$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        YandexPaymentsDelegate$verifyCard$1 yandexPaymentsDelegate$verifyCard$1;
        int i;
        if (continuationImpl instanceof YandexPaymentsDelegate$verifyCard$1) {
            yandexPaymentsDelegate$verifyCard$1 = (YandexPaymentsDelegate$verifyCard$1) continuationImpl;
            int i2 = yandexPaymentsDelegate$verifyCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yandexPaymentsDelegate$verifyCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yandexPaymentsDelegate$verifyCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yandexPaymentsDelegate$verifyCard$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                d dVar = (d) this.d.getValue();
                yandexPaymentsDelegate$verifyCard$1.label = 1;
                Object a = dVar.a(str, str2, str3, yandexPaymentsDelegate$verifyCard$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        yandexPaymentsDelegate$verifyCard$1 = new YandexPaymentsDelegate$verifyCard$1(this, continuationImpl);
        Object obj2 = yandexPaymentsDelegate$verifyCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yandexPaymentsDelegate$verifyCard$1.label;
        if (i == 0) {
        }
    }
}
