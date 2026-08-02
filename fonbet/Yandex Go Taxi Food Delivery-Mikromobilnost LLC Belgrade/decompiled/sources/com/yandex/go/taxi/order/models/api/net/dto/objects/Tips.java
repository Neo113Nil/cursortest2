package com.yandex.go.taxi.order.models.api.net.dto.objects;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.x1z0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/net/dto/objects/Tips;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/net/dto/objects/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Tips {
    public static final a Companion = new a();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(27))};
    public final String a;
    public final TipsType b;

    public /* synthetic */ Tips(int i, String str, TipsType tipsType) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, Tips$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = TipsType.PERCENT;
        } else {
            this.b = tipsType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tips)) {
            return false;
        }
        Tips tips = (Tips) obj;
        return jl40.l(this.a, tips.a) && this.b == tips.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public Tips(String str, TipsType tipsType) {
        this.a = str;
        this.b = tipsType;
    }

    public /* synthetic */ Tips(String str) {
        this(str, TipsType.PERCENT);
    }
}
