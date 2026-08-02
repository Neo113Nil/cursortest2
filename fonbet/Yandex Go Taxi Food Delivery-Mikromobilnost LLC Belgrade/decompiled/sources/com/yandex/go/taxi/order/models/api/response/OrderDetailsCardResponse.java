package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jl70;
import defpackage.jxi;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@jxi
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/c2", "CardIcon", "com/yandex/go/taxi/order/models/api/response/i1", "com/yandex/go/taxi/order/models/api/response/e2", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OrderDetailsCardResponse {
    public static final e2 Companion = new e2();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jl70(25))};
    public final List a;

    public /* synthetic */ OrderDetailsCardResponse(int i, List list) {
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
        return (obj instanceof OrderDetailsCardResponse) && jl40.l(this.a, ((OrderDetailsCardResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("OrderDetailsCardResponse(items=", Extension.C_BRAKE, this.a);
    }

    public OrderDetailsCardResponse() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderDetailsCardResponse$CardIcon;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/d2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CardIcon {
        public static final d2 Companion = new d2();
        public final String a;
        public final String b;

        public /* synthetic */ CardIcon(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardIcon)) {
                return false;
            }
            CardIcon cardIcon = (CardIcon) obj;
            return jl40.l(this.a, cardIcon.a) && jl40.l(this.b, cardIcon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("CardIcon(type=", this.a, ", tag=", this.b, Extension.C_BRAKE);
        }

        public CardIcon() {
            this.a = "";
            this.b = "";
        }
    }
}
