package com.yandex.go.taxi.order.models.api.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ly1;
import defpackage.tse0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/AltpinCardItemDto$ActionButtons", "Lcom/yandex/go/taxi/order/models/api/objects/e;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AltpinCardItemDto$ActionButtons extends e {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ly1(6))};
    public final List a;

    public AltpinCardItemDto$ActionButtons(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AltpinCardItemDto$ActionButtons) && jl40.l(this.a, ((AltpinCardItemDto$ActionButtons) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ActionButtons(buttons=", Extension.C_BRAKE, this.a);
    }

    public AltpinCardItemDto$ActionButtons() {
        this.a = EmptyList.a;
    }
}
