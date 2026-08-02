package com.ybsdk.feature.rebind.payment.internal.data;

import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.rebind.payment.api.RebindPaymentMethodStatusDto;
import com.ybsdk.feature.rebind.payment.internal.network.RebindPaymentMethodApi;
import com.ybsdk.feature.rebind.payment.internal.network.dto.StatusBindDto;
import defpackage.d6v;
import defpackage.ffi0;
import defpackage.n8u0;
import defpackage.ny61;
import defpackage.w511;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final RebindPaymentMethodApi a;

    public a(RebindPaymentMethodApi rebindPaymentMethodApi) {
        this.a = rebindPaymentMethodApi;
    }

    public static final n8u0 a(a aVar, StatusBindDto statusBindDto) {
        aVar.getClass();
        return new n8u0(d(statusBindDto.getStatus()), statusBindDto.getUrl3ds(), statusBindDto.getError() != null ? new Throwable(statusBindDto.getError()) : null);
    }

    public static RebindPaymentMethodStatusEntity d(RebindPaymentMethodStatusDto rebindPaymentMethodStatusDto) {
        int i = ffi0.a[rebindPaymentMethodStatusDto.ordinal()];
        if (i == 1) {
            return RebindPaymentMethodStatusEntity.PENDING;
        }
        if (i == 2) {
            return RebindPaymentMethodStatusEntity.REQUIRED_3DS;
        }
        if (i == 3) {
            return RebindPaymentMethodStatusEntity.FINISHED;
        }
        if (i == 4) {
            return RebindPaymentMethodStatusEntity.FAILED;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, ContinuationImpl continuationImpl) {
        RebindPaymentMethodRepository$bindStatus$1 rebindPaymentMethodRepository$bindStatus$1;
        int i2;
        if (continuationImpl instanceof RebindPaymentMethodRepository$bindStatus$1) {
            rebindPaymentMethodRepository$bindStatus$1 = (RebindPaymentMethodRepository$bindStatus$1) continuationImpl;
            int i3 = rebindPaymentMethodRepository$bindStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rebindPaymentMethodRepository$bindStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = rebindPaymentMethodRepository$bindStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = rebindPaymentMethodRepository$bindStatus$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                RebindPaymentMethodRepository$bindStatus$2 rebindPaymentMethodRepository$bindStatus$2 = new RebindPaymentMethodRepository$bindStatus$2(this, str, i, null);
                rebindPaymentMethodRepository$bindStatus$1.label = 1;
                Object c = c.c(rebindPaymentMethodRepository$bindStatus$2, rebindPaymentMethodRepository$bindStatus$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        rebindPaymentMethodRepository$bindStatus$1 = new RebindPaymentMethodRepository$bindStatus$1(this, continuationImpl);
        Object obj2 = rebindPaymentMethodRepository$bindStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = rebindPaymentMethodRepository$bindStatus$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d6v d6vVar, String str, ContinuationImpl continuationImpl) {
        RebindPaymentMethodRepository$createLinkedPayment$1 rebindPaymentMethodRepository$createLinkedPayment$1;
        int i;
        if (continuationImpl instanceof RebindPaymentMethodRepository$createLinkedPayment$1) {
            rebindPaymentMethodRepository$createLinkedPayment$1 = (RebindPaymentMethodRepository$createLinkedPayment$1) continuationImpl;
            int i2 = rebindPaymentMethodRepository$createLinkedPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rebindPaymentMethodRepository$createLinkedPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rebindPaymentMethodRepository$createLinkedPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rebindPaymentMethodRepository$createLinkedPayment$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                RebindPaymentMethodRepository$createLinkedPayment$2 rebindPaymentMethodRepository$createLinkedPayment$2 = new RebindPaymentMethodRepository$createLinkedPayment$2(this, str, null);
                rebindPaymentMethodRepository$createLinkedPayment$1.label = 1;
                Object a = d.a(d6vVar, rebindPaymentMethodRepository$createLinkedPayment$2, rebindPaymentMethodRepository$createLinkedPayment$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        rebindPaymentMethodRepository$createLinkedPayment$1 = new RebindPaymentMethodRepository$createLinkedPayment$1(this, continuationImpl);
        Object obj2 = rebindPaymentMethodRepository$createLinkedPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rebindPaymentMethodRepository$createLinkedPayment$1.label;
        if (i == 0) {
        }
    }
}
