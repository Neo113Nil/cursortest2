package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.x1z0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TimelineAdditionalOrderOptionsInfo;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/p8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TimelineAdditionalOrderOptionsInfo {
    public static final p8 Companion = new p8();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(21)), null};
    public final List a;
    public final o8 b;

    public /* synthetic */ TimelineAdditionalOrderOptionsInfo(int i, List list, o8 o8Var) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = o8Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineAdditionalOrderOptionsInfo)) {
            return false;
        }
        TimelineAdditionalOrderOptionsInfo timelineAdditionalOrderOptionsInfo = (TimelineAdditionalOrderOptionsInfo) obj;
        return jl40.l(this.a, timelineAdditionalOrderOptionsInfo.a) && jl40.l(this.b, timelineAdditionalOrderOptionsInfo.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o8 o8Var = this.b;
        return hashCode + (o8Var == null ? 0 : o8Var.hashCode());
    }

    public final String toString() {
        return "TimelineAdditionalOrderOptionsInfo(orderOptions=" + this.a + ", buttons=" + this.b + Extension.C_BRAKE;
    }

    public TimelineAdditionalOrderOptionsInfo() {
        this.a = EmptyList.a;
        this.b = null;
    }
}
