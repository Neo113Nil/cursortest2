package com.yandex.go.multimodal_route.network.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.s780;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/OrdersResponseDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrdersResponseDto {
    public static final n Companion = new n();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new s780(24))};
    public final List a;

    public /* synthetic */ OrdersResponseDto(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, OrdersResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrdersResponseDto) && jl40.l(this.a, ((OrdersResponseDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("OrdersResponseDto(offers=", Extension.C_BRAKE, this.a);
    }
}
