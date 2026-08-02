package com.yandex.go.payments.paymentdomain.data;

import defpackage.cmt;
import defpackage.drg;
import defpackage.evu0;
import defpackage.fmt;
import defpackage.fz90;
import defpackage.i3y;
import defpackage.iz90;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.on2;
import defpackage.scc;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final drg a = new drg();
    public final i3y b;

    public d(on2 on2Var) {
        this.b = kotlin.a.a(new lr40(on2Var, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iz90 iz90Var, ContinuationImpl continuationImpl) {
        PaymentDomainRepository$fetchDomain$1 paymentDomainRepository$fetchDomain$1;
        int i;
        if (continuationImpl instanceof PaymentDomainRepository$fetchDomain$1) {
            paymentDomainRepository$fetchDomain$1 = (PaymentDomainRepository$fetchDomain$1) continuationImpl;
            int i2 = paymentDomainRepository$fetchDomain$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentDomainRepository$fetchDomain$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentDomainRepository$fetchDomain$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentDomainRepository$fetchDomain$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PaymentDomainApi paymentDomainApi = (PaymentDomainApi) this.b.getValue();
                    List g = scc.g(new Double(iz90Var.a), new Double(iz90Var.b));
                    String str = iz90Var.c;
                    if (str == null || evu0.J(str)) {
                        str = null;
                    }
                    cmt<PaymentDomainResponseDto> a = paymentDomainApi.a(new PaymentDomainRequestDto(g, str));
                    paymentDomainRepository$fetchDomain$1.L$0 = null;
                    paymentDomainRepository$fetchDomain$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, null, paymentDomainRepository$fetchDomain$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                return new fz90((PaymentDomainResponseDto) fmtVar.a, this.a.c(fmtVar.e.a("Date")));
            }
        }
        paymentDomainRepository$fetchDomain$1 = new PaymentDomainRepository$fetchDomain$1(this, continuationImpl);
        Object obj2 = paymentDomainRepository$fetchDomain$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentDomainRepository$fetchDomain$1.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        return new fz90((PaymentDomainResponseDto) fmtVar2.a, this.a.c(fmtVar2.e.a("Date")));
    }
}
