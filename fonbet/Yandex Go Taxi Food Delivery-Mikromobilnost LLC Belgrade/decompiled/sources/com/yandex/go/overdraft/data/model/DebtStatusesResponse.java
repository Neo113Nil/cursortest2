package com.yandex.go.overdraft.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.qv10;
import defpackage.rsf;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/DebtStatusesResponse;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DebtStatusesResponse {
    public static final t Companion = new t();
    public static final i3y[] j;
    public final List a;
    public final List b;
    public final kotlinx.serialization.json.a c;
    public final boolean d;
    public final DebtFlow e;
    public final ief f;
    public final List g;
    public final List h;
    public final PaymentState i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new rsf(22)), kotlin.a.b(lazyThreadSafetyMode, new rsf(23)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new rsf(24)), kotlin.a.b(lazyThreadSafetyMode, new rsf(25)), kotlin.a.b(lazyThreadSafetyMode, new rsf(26))};
    }

    public /* synthetic */ DebtStatusesResponse(int i, List list, List list2, kotlinx.serialization.json.a aVar, boolean z, DebtFlow debtFlow, ief iefVar, List list3, List list4, PaymentState paymentState) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = new kotlinx.serialization.json.a(emptyList);
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = debtFlow;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = list4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = paymentState;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getG() {
        return this.g;
    }

    /* renamed from: b, reason: from getter */
    public final ief getF() {
        return this.f;
    }

    /* renamed from: c, reason: from getter */
    public final DebtFlow getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final List getB() {
        return this.b;
    }

    public final ArrayList e() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ("debt".equals(((OrderStatus) obj).c.b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebtStatusesResponse)) {
            return false;
        }
        DebtStatusesResponse debtStatusesResponse = (DebtStatusesResponse) obj;
        return jl40.l(this.a, debtStatusesResponse.a) && jl40.l(this.b, debtStatusesResponse.b) && jl40.l(this.c, debtStatusesResponse.c) && this.d == debtStatusesResponse.d && jl40.l(this.e, debtStatusesResponse.e) && jl40.l(this.f, debtStatusesResponse.f) && jl40.l(this.g, debtStatusesResponse.g) && jl40.l(this.h, debtStatusesResponse.h) && this.i == debtStatusesResponse.i;
    }

    /* renamed from: f, reason: from getter */
    public final List getH() {
        return this.h;
    }

    public final PaymentState g() {
        PaymentState paymentState = this.i;
        return paymentState == null ? PaymentState.UNKNOWN : paymentState;
    }

    public final ArrayList h() {
        List list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if ("processing".equals(((OrderStatus) obj).c.b)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c.a), 31, this.d);
        DebtFlow debtFlow = this.e;
        int hashCode = (e + (debtFlow == null ? 0 : debtFlow.hashCode())) * 31;
        ief iefVar = this.f;
        int c = unr0.c((hashCode + (iefVar == null ? 0 : iefVar.hashCode())) * 31, 31, this.g);
        List list = this.h;
        int hashCode2 = (c + (list == null ? 0 : list.hashCode())) * 31;
        PaymentState paymentState = this.i;
        return hashCode2 + (paymentState != null ? paymentState.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = qv10.v("DebtStatusesResponse(orders=", this.a, ", debtOrderIds=", this.b, ", cards=");
        v.append(this.c);
        v.append(", overdraftAvailable=");
        v.append(this.d);
        v.append(", debtFlow=");
        v.append(this.e);
        v.append(", currencyRulesDto=");
        v.append(this.f);
        v.append(", availablePaymentMethods=");
        nnm.w(v, this.g, ", orderPaymentMethodSettings=", this.h, ", paymentStateRaw=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public DebtStatusesResponse() {
        EmptyList emptyList = EmptyList.a;
        kotlinx.serialization.json.a aVar = new kotlinx.serialization.json.a(emptyList);
        this.a = emptyList;
        this.b = emptyList;
        this.c = aVar;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = emptyList;
        this.h = null;
        this.i = null;
    }
}
