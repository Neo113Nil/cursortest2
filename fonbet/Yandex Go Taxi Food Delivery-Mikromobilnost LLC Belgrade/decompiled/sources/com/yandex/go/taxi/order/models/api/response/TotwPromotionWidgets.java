package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.nhz0;
import defpackage.qos0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/TotwPromotionWidgets;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/v8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TotwPromotionWidgets {
    public static final v8 Companion = new v8();
    public static final i3y[] d;
    public final List a;
    public final qos0 b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new nhz0(12)), null, kotlin.a.b(lazyThreadSafetyMode, new nhz0(13))};
    }

    public /* synthetic */ TotwPromotionWidgets(int i, List list, qos0 qos0Var, List list2) {
        this.a = (i & 1) == 0 ? EmptyList.a : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qos0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotwPromotionWidgets)) {
            return false;
        }
        TotwPromotionWidgets totwPromotionWidgets = (TotwPromotionWidgets) obj;
        return jl40.l(this.a, totwPromotionWidgets.a) && jl40.l(this.b, totwPromotionWidgets.b) && jl40.l(this.c, totwPromotionWidgets.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qos0 qos0Var = this.b;
        int hashCode2 = (hashCode + (qos0Var == null ? 0 : qos0Var.hashCode())) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotwPromotionWidgets(actionButtons=");
        sb.append(this.a);
        sb.append(", slider=");
        sb.append(this.b);
        sb.append(", stickyActionButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public TotwPromotionWidgets(int i) {
        this.a = EmptyList.a;
        this.b = null;
        this.c = null;
    }

    public TotwPromotionWidgets() {
        this(0);
    }
}
