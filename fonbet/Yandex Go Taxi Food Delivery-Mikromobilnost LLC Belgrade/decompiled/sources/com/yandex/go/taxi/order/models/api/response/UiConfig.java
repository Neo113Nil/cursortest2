package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/UiConfig;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y8", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class UiConfig {
    public static final y8 Companion = new y8();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(11)), null};
    public final CheckInAction a;
    public final CardType b;
    public final DetailsAction c;

    public /* synthetic */ UiConfig(int i, CheckInAction checkInAction, CardType cardType, DetailsAction detailsAction) {
        this.a = (i & 1) == 0 ? new CheckInAction(0) : checkInAction;
        if ((i & 2) == 0) {
            this.b = CardType.TWO_BUTTON;
        } else {
            this.b = cardType;
        }
        if ((i & 4) == 0) {
            this.c = new DetailsAction(0);
        } else {
            this.c = detailsAction;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) obj;
        return jl40.l(this.a, uiConfig.a) && this.b == uiConfig.b && jl40.l(this.c, uiConfig.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UiConfig(checkInAction=" + this.a + ", cardType=" + this.b + ", detailsAction=" + this.c + Extension.C_BRAKE;
    }

    public UiConfig() {
        this(0);
    }

    public UiConfig(int i) {
        CheckInAction checkInAction = new CheckInAction(0);
        CardType cardType = CardType.TWO_BUTTON;
        DetailsAction detailsAction = new DetailsAction(0);
        this.a = checkInAction;
        this.b = cardType;
        this.c = detailsAction;
    }
}
