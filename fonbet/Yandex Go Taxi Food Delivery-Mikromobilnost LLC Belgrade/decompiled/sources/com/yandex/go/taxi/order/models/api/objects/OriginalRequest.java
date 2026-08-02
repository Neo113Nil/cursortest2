package com.yandex.go.taxi.order.models.api.objects;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterRideStatus;
import defpackage.evu0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.yi80;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/OriginalRequest;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/r0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OriginalRequest {
    public static final r0 Companion = new r0();
    public static final i3y[] h = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(14)), null, null, null};
    public final String a;
    public final Calendar b;
    public final Calendar c;
    public final List d;
    public final double e;
    public final int f;
    public final CostCenterRideStatus g;

    public /* synthetic */ OriginalRequest(int i, String str, Calendar calendar, Calendar calendar2, List list, double d, int i2, CostCenterRideStatus costCenterRideStatus) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = calendar2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = 0.0d;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = -1;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = costCenterRideStatus;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final CostCenterRideStatus getG() {
        return this.g;
    }

    /* renamed from: c, reason: from getter */
    public final Calendar getB() {
        return this.b;
    }

    public final List d() {
        List<Address> list = this.d;
        for (Address address : list) {
            String pickMethod = address.getPickMethod();
            if (pickMethod == null || evu0.J(pickMethod)) {
                address.P("taxiontheway");
            }
        }
        return list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginalRequest)) {
            return false;
        }
        OriginalRequest originalRequest = (OriginalRequest) obj;
        return jl40.l(this.a, originalRequest.a) && jl40.l(this.b, originalRequest.b) && jl40.l(this.c, originalRequest.c) && jl40.l(this.d, originalRequest.d) && Double.compare(this.e, originalRequest.e) == 0 && this.f == originalRequest.f && jl40.l(this.g, originalRequest.g);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Calendar calendar = this.b;
        int hashCode2 = (hashCode + (calendar == null ? 0 : calendar.hashCode())) * 31;
        Calendar calendar2 = this.c;
        int b = oyr.b(this.f, unr0.a(unr0.c((hashCode2 + (calendar2 == null ? 0 : calendar2.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        CostCenterRideStatus costCenterRideStatus = this.g;
        return b + (costCenterRideStatus != null ? costCenterRideStatus.hashCode() : 0);
    }

    public final String toString() {
        return "OriginalRequest(comment=" + this.a + ", due=" + this.b + ", endOfInterval=" + this.c + ", route=" + this.d + ", surgeValue=" + this.e + ", serviceLevel=" + this.f + ", costCenterRideStatus=" + this.g + Extension.C_BRAKE;
    }

    public OriginalRequest() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = EmptyList.a;
        this.e = 0.0d;
        this.f = -1;
        this.g = null;
    }
}
