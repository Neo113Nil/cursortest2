package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.models.OfferType;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j660;
import defpackage.jl40;
import defpackage.llw0;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/OfferSupportedFeature;", "Lllw0;", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OfferSupportedFeature implements llw0 {
    public static final f Companion = new f();
    public static final i3y[] d;
    public final OfferType a;
    public final List b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new j660(25)), kotlin.a.b(lazyThreadSafetyMode, new j660(26)), kotlin.a.b(lazyThreadSafetyMode, new j660(27))};
    }

    public /* synthetic */ OfferSupportedFeature(int i, OfferType offerType, List list, List list2) {
        this.a = (i & 1) == 0 ? OfferType.UNSUPPORTED : offerType;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
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
        if (!(obj instanceof OfferSupportedFeature)) {
            return false;
        }
        OfferSupportedFeature offerSupportedFeature = (OfferSupportedFeature) obj;
        return this.a == offerSupportedFeature.a && jl40.l(this.b, offerSupportedFeature.b) && jl40.l(this.c, offerSupportedFeature.c);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return c + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferSupportedFeature(type=");
        sb.append(this.a);
        sb.append(", prefetchStrategies=");
        sb.append(this.b);
        sb.append(", services=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public OfferSupportedFeature() {
        this(null, null, 7);
    }

    public OfferSupportedFeature(OfferType offerType, List list, int i) {
        offerType = (i & 1) != 0 ? OfferType.UNSUPPORTED : offerType;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        list = i2 != 0 ? emptyList : list;
        emptyList = (i & 4) != 0 ? null : emptyList;
        this.a = offerType;
        this.b = list;
        this.c = emptyList;
    }
}
