package com.yandex.go.overdraft.data.model;

import defpackage.b64;
import defpackage.c680;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/overdraft/data/model/OrderStatus;", "", "Companion", "PayableService", "AddressName", "$serializer", "com/yandex/go/overdraft/data/model/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderStatus {
    public static final x Companion = new x();
    public static final i3y[] i;
    public final String a;
    public final List b;
    public final PaymentInfo c;
    public final boolean d;
    public final ief e;
    public final String f;
    public final List g;
    public final String h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c680(5)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new c680(6)), null};
    }

    public OrderStatus(int i2, String str, List list, PaymentInfo paymentInfo, boolean z, ief iefVar, String str2, List list2, String str3) {
        this.a = (i2 & 1) == 0 ? "" : str;
        int i3 = i2 & 2;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.b = emptyList;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            PaymentInfo.Companion.getClass();
            this.c = PaymentInfo.k;
        } else {
            this.c = paymentInfo;
        }
        if ((i2 & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = iefVar;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i2 & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderStatus)) {
            return false;
        }
        OrderStatus orderStatus = (OrderStatus) obj;
        return jl40.l(this.a, orderStatus.a) && jl40.l(this.b, orderStatus.b) && jl40.l(this.c, orderStatus.c) && this.d == orderStatus.d && jl40.l(this.e, orderStatus.e) && jl40.l(this.f, orderStatus.f) && jl40.l(this.g, orderStatus.g) && jl40.l(this.h, orderStatus.h);
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        ief iefVar = this.e;
        int hashCode = (e + (iefVar == null ? 0 : iefVar.hashCode())) * 31;
        String str = this.f;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("OrderStatus(orderId=", this.a, ", services=", this.b, ", paymentInfo=");
        r.append(this.c);
        r.append(", canBePaidByCard=");
        r.append(this.d);
        r.append(", currencyRulesDto=");
        r.append(this.e);
        r.append(", createdAt=");
        r.append(this.f);
        r.append(", route=");
        return defpackage.n.l(", created=", this.h, Extension.C_BRAKE, r, this.g);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/OrderStatus$AddressName;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class AddressName {
        public static final w Companion = new w();
        public final String a;

        public /* synthetic */ AddressName(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddressName) && jl40.l(this.a, ((AddressName) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("AddressName(fullName=", this.a, Extension.C_BRAKE);
        }

        public AddressName() {
            this.a = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/overdraft/data/model/OrderStatus$PayableService;", "", "Companion", "$serializer", "com/yandex/go/overdraft/data/model/y", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class PayableService {
        public static final y Companion = new y();
        public final String a;
        public final int b;
        public final String c;

        public /* synthetic */ PayableService(int i, int i2, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            this.b = (i & 2) == 0 ? 0 : i2;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayableService)) {
                return false;
            }
            PayableService payableService = (PayableService) obj;
            return jl40.l(this.a, payableService.a) && this.b == payableService.b && jl40.l(this.c, payableService.c);
        }

        public final int hashCode() {
            String str = this.a;
            int b = oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.c;
            return b + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return oyr.t(b64.u(this.b, "PayableService(type=", this.a, ", cost=", ", costAsStr="), this.c, Extension.C_BRAKE);
        }

        public PayableService() {
            this.a = null;
            this.b = 0;
            this.c = null;
        }
    }

    public OrderStatus() {
        PaymentInfo.Companion.getClass();
        PaymentInfo paymentInfo = PaymentInfo.k;
        this.a = "";
        EmptyList emptyList = EmptyList.a;
        this.b = emptyList;
        this.c = paymentInfo;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = emptyList;
        this.h = null;
    }
}
