package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$PlainComment", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "Properties", "$serializer", "com/yandex/go/taxi/order/models/api/response/h5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$PlainComment extends a7 {
    public static final h5 Companion = new h5();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final Properties c;
    public final com.yandex.go.slot.dto.b2 d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(22)), kotlin.a.b(lazyThreadSafetyMode, new jjk0(23))};
    }

    public RideCardItemDto$PlainComment(int i, String str, String str2, Properties properties, com.yandex.go.slot.dto.b2 b2Var, List list, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = properties;
        }
        if ((i & 8) == 0) {
            this.d = com.yandex.go.slot.dto.y0.INSTANCE;
        } else {
            this.d = b2Var;
        }
        int i2 = i & 16;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.e = emptyList;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$PlainComment)) {
            return false;
        }
        RideCardItemDto$PlainComment rideCardItemDto$PlainComment = (RideCardItemDto$PlainComment) obj;
        return jl40.l(this.a, rideCardItemDto$PlainComment.a) && jl40.l(this.b, rideCardItemDto$PlainComment.b) && jl40.l(this.c, rideCardItemDto$PlainComment.c) && jl40.l(this.d, rideCardItemDto$PlainComment.d) && jl40.l(this.e, rideCardItemDto$PlainComment.e) && jl40.l(this.f, rideCardItemDto$PlainComment.f);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Properties properties = this.c;
        return this.f.hashCode() + unr0.c((this.d.hashCode() + ((hashCode2 + (properties != null ? properties.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlainComment(id=", this.a, ", analyticsId=", this.b, ", properties=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(", visibleOnRatings=");
        return vfc.p(v, this.e, ", titles=", this.f, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$PlainComment$Properties;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/i5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Properties {
        public static final i5 Companion = new i5();
        public final String a;

        public /* synthetic */ Properties(int i, String str) {
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
            return (obj instanceof Properties) && jl40.l(this.a, ((Properties) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return oyr.p("Properties(backgroundColor=", this.a, Extension.C_BRAKE);
        }

        public Properties() {
            this.a = null;
        }
    }

    public RideCardItemDto$PlainComment() {
        com.yandex.go.slot.dto.y0 y0Var = com.yandex.go.slot.dto.y0.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = y0Var;
        EmptyList emptyList = EmptyList.a;
        this.e = emptyList;
        this.f = emptyList;
    }
}
