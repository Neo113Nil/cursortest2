package com.yandex.go.taxi.order.models.api.ride_support;

import com.yandex.go.taxi.order.models.api.cancel.m;
import com.yandex.go.taxi.order.models.api.cancel.n;
import defpackage.b64;
import defpackage.fs70;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.wh60;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/ride_support/OrderRideSupportNotification;", "Lwh60;", "Companion", "SupportItemDto", "SupportArrowActionButtonDto", "$serializer", "com/yandex/go/taxi/order/models/api/ride_support/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderRideSupportNotification implements wh60 {
    public static final a Companion = new a();
    public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(27))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public /* synthetic */ OrderRideSupportNotification(int i, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderRideSupportNotification)) {
            return false;
        }
        OrderRideSupportNotification orderRideSupportNotification = (OrderRideSupportNotification) obj;
        return jl40.l(this.a, orderRideSupportNotification.a) && jl40.l(this.b, orderRideSupportNotification.b) && jl40.l(this.c, orderRideSupportNotification.c) && jl40.l(this.d, orderRideSupportNotification.d) && jl40.l(this.e, orderRideSupportNotification.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OrderRideSupportNotification(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", icon=", this.d, ", items=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/ride_support/OrderRideSupportNotification$SupportArrowActionButtonDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/ride_support/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SupportArrowActionButtonDto {
        public static final b Companion = new b();
        public final n a;

        public /* synthetic */ SupportArrowActionButtonDto(int i, n nVar) {
            if ((i & 1) == 0) {
                this.a = m.INSTANCE;
            } else {
                this.a = nVar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SupportArrowActionButtonDto) && jl40.l(this.a, ((SupportArrowActionButtonDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SupportArrowActionButtonDto(action=" + this.a + Extension.C_BRAKE;
        }

        public SupportArrowActionButtonDto() {
            this(0);
        }

        public SupportArrowActionButtonDto(int i) {
            this.a = m.INSTANCE;
        }
    }

    public OrderRideSupportNotification() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = null;
        this.e = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/ride_support/OrderRideSupportNotification$SupportItemDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/ride_support/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class SupportItemDto {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final SupportArrowActionButtonDto e;

        public /* synthetic */ SupportItemDto(int i, String str, String str2, String str3, String str4, SupportArrowActionButtonDto supportArrowActionButtonDto) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
            if ((i & 16) == 0) {
                this.e = new SupportArrowActionButtonDto(0);
            } else {
                this.e = supportArrowActionButtonDto;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportItemDto)) {
                return false;
            }
            SupportItemDto supportItemDto = (SupportItemDto) obj;
            return jl40.l(this.a, supportItemDto.a) && jl40.l(this.b, supportItemDto.b) && jl40.l(this.c, supportItemDto.c) && jl40.l(this.d, supportItemDto.d) && jl40.l(this.e, supportItemDto.e);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return this.e.a.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder v = b64.v("SupportItemDto(id=", this.a, ", title=", this.b, ", subtitle=");
            g8e.D(v, this.c, ", icon=", this.d, ", arrowActionButton=");
            v.append(this.e);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public SupportItemDto() {
            SupportArrowActionButtonDto supportArrowActionButtonDto = new SupportArrowActionButtonDto(0);
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
            this.e = supportArrowActionButtonDto;
        }
    }
}
