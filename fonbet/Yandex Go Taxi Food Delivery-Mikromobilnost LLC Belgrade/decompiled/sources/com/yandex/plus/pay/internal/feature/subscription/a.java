package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.SubscriptionInfoDto;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.b64;
import defpackage.b9h;
import defpackage.bt90;
import defpackage.g8e;
import defpackage.gt90;
import defpackage.i3y;
import defpackage.jse;
import defpackage.lfd0;
import defpackage.m1v0;
import defpackage.mdd0;
import defpackage.mfd0;
import defpackage.mwj0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.w511;
import defpackage.y1v0;
import defpackage.z0v0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class a implements m1v0 {
    public final mdd0 a;
    public final ExternalMediaBillingApi b;
    public final y1v0 c;
    public final jse d;
    public final i3y e = kotlin.a.a(new b9h(7));

    public a(mdd0 mdd0Var, ExternalMediaBillingApi externalMediaBillingApi, y1v0 y1v0Var, jse jseVar) {
        this.a = mdd0Var;
        this.b = externalMediaBillingApi;
        this.c = y1v0Var;
        this.d = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        DefaultSubscriptionRepository$fetchSubscriptionInfo$1 defaultSubscriptionRepository$fetchSubscriptionInfo$1;
        int i;
        SubscriptionInfoDto.SubscriptionStatusDto subscriptionStatusDto;
        String str3;
        String str4;
        SubscriptionInfoDto subscriptionInfoDto;
        PlusPaySubscriptionInfo.SubscriptionStatus subscriptionStatus;
        if (continuationImpl instanceof DefaultSubscriptionRepository$fetchSubscriptionInfo$1) {
            defaultSubscriptionRepository$fetchSubscriptionInfo$1 = (DefaultSubscriptionRepository$fetchSubscriptionInfo$1) continuationImpl;
            int i2 = defaultSubscriptionRepository$fetchSubscriptionInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultSubscriptionRepository$fetchSubscriptionInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultSubscriptionRepository$fetchSubscriptionInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultSubscriptionRepository$fetchSubscriptionInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mdd0.c(this.a, gt90.a, b64.l("Get subscription info. invoiceId = ", str, ", synchronizationTypes = ", str2));
                    DefaultSubscriptionRepository$fetchSubscriptionInfo$response$1 defaultSubscriptionRepository$fetchSubscriptionInfo$response$1 = new DefaultSubscriptionRepository$fetchSubscriptionInfo$response$1(this, str, str2, null);
                    defaultSubscriptionRepository$fetchSubscriptionInfo$1.L$0 = str;
                    defaultSubscriptionRepository$fetchSubscriptionInfo$1.L$1 = null;
                    defaultSubscriptionRepository$fetchSubscriptionInfo$1.label = 1;
                    obj = tje.k0(this.d, defaultSubscriptionRepository$fetchSubscriptionInfo$response$1, defaultSubscriptionRepository$fetchSubscriptionInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) defaultSubscriptionRepository$fetchSubscriptionInfo$1.L$0;
                    kotlin.b.b(obj);
                }
                mwj0 mwj0Var = (mwj0) obj;
                Object obj2 = mwj0Var.a;
                subscriptionStatusDto = ((SubscriptionInfoDto) obj2).a;
                if (subscriptionStatusDto != SubscriptionInfoDto.SubscriptionStatusDto.FAIL_3DS || subscriptionStatusDto == SubscriptionInfoDto.SubscriptionStatusDto.PAYMENT_FAILED || subscriptionStatusDto == SubscriptionInfoDto.SubscriptionStatusDto.UNKNOWN) {
                    str3 = mwj0Var.b;
                    String lowerCase = subscriptionStatusDto.name().toLowerCase(Locale.ROOT);
                    z0v0 z0v0Var = ((SubscriptionInfoDto) obj2).d;
                    str4 = z0v0Var == null ? z0v0Var.c : null;
                    bt90 bt90Var = this.c.a;
                    if (str3 == null) {
                        str3 = "no_value";
                    }
                    if (str4 == null) {
                        str4 = "no_value";
                    }
                    LinkedHashMap y = g8e.y("requestId", str3, "additionalData", "no_value");
                    y.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
                    y.put(ACSPConstants.STATUS, lowerCase);
                    y.put("trust3dsUrl", str4);
                    y.put("_meta", bt90.b(new HashMap()));
                    bt90Var.c("Error.Api.SubscriptionStatus.InvalidStatus", y);
                }
                subscriptionInfoDto = (SubscriptionInfoDto) obj2;
                ((mfd0) this.e.getValue()).getClass();
                switch (lfd0.a[subscriptionInfoDto.a.ordinal()]) {
                    case 1:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.FAIL_3DS;
                        break;
                    case 2:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.HOLD;
                        break;
                    case 3:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.PAYMENT_FAILED;
                        break;
                    case 4:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.REFUND;
                        break;
                    case 5:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.WAIT_FOR_PAYMENT;
                        break;
                    case 6:
                        subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.UNKNOWN;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                String str5 = subscriptionInfoDto.b;
                SubscriptionInfoDto.a aVar = subscriptionInfoDto.c;
                PlusPaySubscriptionInfo.SynchronizationState synchronizationState = aVar == null ? new PlusPaySubscriptionInfo.SynchronizationState(aVar.a, aVar.b, aVar.c, aVar.d) : null;
                z0v0 z0v0Var2 = subscriptionInfoDto.d;
                return new PlusPaySubscriptionInfo(subscriptionStatus, str5, synchronizationState, z0v0Var2 != null ? new PlusPaySubscriptionInfo.Trust3dsInfo(z0v0Var2.a, z0v0Var2.b, z0v0Var2.c) : null);
            }
        }
        defaultSubscriptionRepository$fetchSubscriptionInfo$1 = new DefaultSubscriptionRepository$fetchSubscriptionInfo$1(this, continuationImpl);
        Object obj3 = defaultSubscriptionRepository$fetchSubscriptionInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultSubscriptionRepository$fetchSubscriptionInfo$1.label;
        if (i != 0) {
        }
        mwj0 mwj0Var2 = (mwj0) obj3;
        Object obj22 = mwj0Var2.a;
        subscriptionStatusDto = ((SubscriptionInfoDto) obj22).a;
        if (subscriptionStatusDto != SubscriptionInfoDto.SubscriptionStatusDto.FAIL_3DS) {
        }
        str3 = mwj0Var2.b;
        String lowerCase2 = subscriptionStatusDto.name().toLowerCase(Locale.ROOT);
        z0v0 z0v0Var3 = ((SubscriptionInfoDto) obj22).d;
        if (z0v0Var3 == null) {
        }
        bt90 bt90Var2 = this.c.a;
        if (str3 == null) {
        }
        if (str4 == null) {
        }
        LinkedHashMap y2 = g8e.y("requestId", str3, "additionalData", "no_value");
        y2.put(FinishFlowStatus.ORDER_ID_FIELD_NAME, str);
        y2.put(ACSPConstants.STATUS, lowerCase2);
        y2.put("trust3dsUrl", str4);
        y2.put("_meta", bt90.b(new HashMap()));
        bt90Var2.c("Error.Api.SubscriptionStatus.InvalidStatus", y2);
        subscriptionInfoDto = (SubscriptionInfoDto) obj22;
        ((mfd0) this.e.getValue()).getClass();
        switch (lfd0.a[subscriptionInfoDto.a.ordinal()]) {
        }
        String str52 = subscriptionInfoDto.b;
        SubscriptionInfoDto.a aVar2 = subscriptionInfoDto.c;
        if (aVar2 == null) {
        }
        z0v0 z0v0Var22 = subscriptionInfoDto.d;
        return new PlusPaySubscriptionInfo(subscriptionStatus, str52, synchronizationState, z0v0Var22 != null ? new PlusPaySubscriptionInfo.Trust3dsInfo(z0v0Var22.a, z0v0Var22.b, z0v0Var22.c) : null);
    }
}
