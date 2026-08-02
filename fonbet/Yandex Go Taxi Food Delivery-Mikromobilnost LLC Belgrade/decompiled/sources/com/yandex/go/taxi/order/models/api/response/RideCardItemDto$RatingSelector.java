package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.n7v;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$RatingSelector", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lcom/yandex/go/taxi/order/models/api/response/n5;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/l5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$RatingSelector extends a7 implements n5 {
    public static final l5 Companion = new l5();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final com.yandex.go.slot.dto.b2 d;
    public final n7v e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(24)), null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(25))};
    }

    public RideCardItemDto$RatingSelector(int i, String str, String str2, List list, com.yandex.go.slot.dto.b2 b2Var, n7v n7vVar, List list2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = com.yandex.go.slot.dto.m0.INSTANCE;
        } else {
            this.d = b2Var;
        }
        if ((i & 16) == 0) {
            this.e = n7v.f;
        } else {
            this.e = n7vVar;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list2;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: c, reason: from getter */
    public final n7v getE() {
        return this.e;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: e, reason: from getter */
    public final List getF() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$RatingSelector)) {
            return false;
        }
        RideCardItemDto$RatingSelector rideCardItemDto$RatingSelector = (RideCardItemDto$RatingSelector) obj;
        return jl40.l(this.a, rideCardItemDto$RatingSelector.a) && jl40.l(this.b, rideCardItemDto$RatingSelector.b) && jl40.l(this.c, rideCardItemDto$RatingSelector.c) && jl40.l(this.d, rideCardItemDto$RatingSelector.d) && jl40.l(this.e, rideCardItemDto$RatingSelector.e) && jl40.l(this.f, rideCardItemDto$RatingSelector.f);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: getAction, reason: from getter */
    public final com.yandex.go.slot.dto.b2 getD() {
        return this.d;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RatingSelector(id=", this.a, ", analyticsId=", this.b, ", hints=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(", backgroundGlowImage=");
        v.append(this.e);
        v.append(", ratingItemsDecorationStates=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public RideCardItemDto$RatingSelector() {
        com.yandex.go.slot.dto.m0 m0Var = com.yandex.go.slot.dto.m0.INSTANCE;
        n7v n7vVar = n7v.f;
        this.a = "";
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = m0Var;
        this.e = n7vVar;
        this.f = emptyList;
    }
}
