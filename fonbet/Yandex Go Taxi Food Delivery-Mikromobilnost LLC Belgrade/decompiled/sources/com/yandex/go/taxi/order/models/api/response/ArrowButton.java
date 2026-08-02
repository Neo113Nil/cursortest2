package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.p73;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/ArrowButton;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ArrowButton {
    public static final g Companion = new g();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(1))};
    public final AttributedContent a;
    public final List b;

    public /* synthetic */ ArrowButton(int i, AttributedContent attributedContent, List list) {
        this.a = (i & 1) == 0 ? new AttributedContent(0) : attributedContent;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArrowButton)) {
            return false;
        }
        ArrowButton arrowButton = (ArrowButton) obj;
        return jl40.l(this.a, arrowButton.a) && jl40.l(this.b, arrowButton.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArrowButton(text=" + this.a + ", actions=" + this.b + Extension.C_BRAKE;
    }

    public ArrowButton() {
        this.a = new AttributedContent(0);
        this.b = EmptyList.a;
    }
}
