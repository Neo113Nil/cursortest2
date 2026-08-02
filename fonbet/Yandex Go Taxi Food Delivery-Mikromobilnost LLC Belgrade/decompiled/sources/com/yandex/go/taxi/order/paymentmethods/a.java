package com.yandex.go.taxi.order.paymentmethods;

import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.go.taxi.order.domain.repositories.e;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import com.yandex.go.taxi.order.models.api.response.z0;
import com.yandex.go.taxi.order.y;
import defpackage.a3y0;
import defpackage.ae9;
import defpackage.cmt;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.p2y0;
import defpackage.r;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xc8;
import defpackage.yc9;
import defpackage.ysg;
import defpackage.zd9;
import defpackage.zy11;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final class a implements ae9 {
    public final y a;
    public final e b;
    public final h3y c;
    public final ysg d;
    public final p2y0 e;
    public final tt2 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "ChangePaymentProcessor");

    public a(y yVar, e eVar, h3y h3yVar, ysg ysgVar, p2y0 p2y0Var, tt2 tt2Var) {
        this.a = yVar;
        this.b = eVar;
        this.c = h3yVar;
        this.d = ysgVar;
        this.e = p2y0Var;
        this.f = tt2Var;
    }

    public static final Object a(a aVar, yc9 yc9Var, Continuation continuation) {
        ChangeOrderApi changeOrderApi = (ChangeOrderApi) aVar.c.get();
        String str = yc9Var.a;
        String str2 = yc9Var.b;
        Calendar calendar = yc9Var.c;
        PaymentMethod$Type paymentMethod$Type = yc9Var.d;
        String str3 = yc9Var.e;
        String str4 = yc9Var.f;
        return ru.yandex.taxi.network.api.a.a(changeOrderApi.b(new zd9(str, str2, calendar, paymentMethod$Type, str3, str4.length() > 0 ? new Tips(str4) : null)), null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum b(a aVar, String str, String str2, OrderChangesDto.PendingChangeDto pendingChangeDto, ContinuationImpl continuationImpl) {
        ChangePaymentProcessorImpl$resolveStatusFromChangedData$1 changePaymentProcessorImpl$resolveStatusFromChangedData$1;
        int i;
        String str3;
        OrderChangesDto.ChangesPayload a;
        OrderChangesDto.PendingChangeDto pendingChangeDto2;
        aVar.getClass();
        if (continuationImpl instanceof ChangePaymentProcessorImpl$resolveStatusFromChangedData$1) {
            changePaymentProcessorImpl$resolveStatusFromChangedData$1 = (ChangePaymentProcessorImpl$resolveStatusFromChangedData$1) continuationImpl;
            int i2 = changePaymentProcessorImpl$resolveStatusFromChangedData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePaymentProcessorImpl$resolveStatusFromChangedData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePaymentProcessorImpl$resolveStatusFromChangedData$1.label;
                if (i != 0) {
                    b.b(obj);
                    OrderChangesDto.Status status = pendingChangeDto.b;
                    if (status == OrderChangesDto.Status.SUCCESS) {
                        return status;
                    }
                    String str4 = pendingChangeDto.a;
                    z0 z0Var = OrderChangesDto.Companion;
                    r rVar = new r(str2, str4, 4);
                    z0Var.getClass();
                    cmt<OrderChangesDto> a2 = ((ChangeOrderApi) aVar.c.get()).a(z0.a(rVar, str));
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$0 = null;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$1 = str2;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$2 = null;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$3 = null;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$4 = str4;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$5 = null;
                    changePaymentProcessorImpl$resolveStatusFromChangedData$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a2, null, changePaymentProcessorImpl$resolveStatusFromChangedData$1);
                    if (obj != coroutineSingletons) {
                        str3 = str4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pendingChangeDto2 = (OrderChangesDto.PendingChangeDto) changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$8;
                    b.b(obj);
                    return pendingChangeDto2.b;
                }
                str3 = (String) changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$4;
                str2 = (String) changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$1;
                b.b(obj);
                a = ((OrderChangesDto) obj).a(str2);
                if (a != null) {
                    throw aVar.c(String.format("Not found order with id %s", Arrays.copyOf(new Object[]{str2}, 1)), str3);
                }
                OrderChangesDto.PendingChangeDto a3 = a.a(str3);
                if (a3 == null) {
                    throw aVar.c(String.format("Not found change with id %s", Arrays.copyOf(new Object[]{str3}, 1)), str3);
                }
                e eVar = aVar.b;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$0 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$1 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$2 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$3 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$4 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$5 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$6 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$7 = null;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.L$8 = a3;
                changePaymentProcessorImpl$resolveStatusFromChangedData$1.label = 2;
                if (eVar.c(str2, str3, changePaymentProcessorImpl$resolveStatusFromChangedData$1) != coroutineSingletons) {
                    pendingChangeDto2 = a3;
                    return pendingChangeDto2.b;
                }
                return coroutineSingletons;
            }
        }
        changePaymentProcessorImpl$resolveStatusFromChangedData$1 = new ChangePaymentProcessorImpl$resolveStatusFromChangedData$1(aVar, continuationImpl);
        Object obj2 = changePaymentProcessorImpl$resolveStatusFromChangedData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePaymentProcessorImpl$resolveStatusFromChangedData$1.label;
        if (i != 0) {
        }
        a = ((OrderChangesDto) obj2).a(str2);
        if (a != null) {
        }
    }

    public final Exception c(String str, String str2) {
        Exception exc = new Exception(str);
        this.g.b("bakeErrorException", exc, new xc8(str2, 4));
        return exc;
    }

    public final Object d(yc9 yc9Var, ContinuationImpl continuationImpl) {
        this.f.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ChangePaymentProcessorImpl$changePaymentMethod$2(this, yc9Var, null), continuationImpl);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
