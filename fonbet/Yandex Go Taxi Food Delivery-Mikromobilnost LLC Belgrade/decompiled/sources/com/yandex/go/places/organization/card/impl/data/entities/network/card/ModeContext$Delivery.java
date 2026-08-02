package com.yandex.go.places.organization.card.impl.data.entities.network.card;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/organization/card/impl/data/entities/network/card/ModeContext$Delivery", "Lcom/yandex/go/places/organization/card/impl/data/entities/network/card/c;", "Companion", "$serializer", "com/yandex/go/places/organization/card/impl/data/entities/network/card/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModeContext$Delivery extends c {
    public static final a Companion = new a();
    public final Integer a;

    public ModeContext$Delivery(int i, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModeContext$Delivery) && jl40.l(this.a, ((ModeContext$Delivery) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Delivery(pointIndex=" + this.a + Extension.C_BRAKE;
    }

    public ModeContext$Delivery(Integer num) {
        this.a = num;
    }

    public ModeContext$Delivery() {
        this(null);
    }
}
