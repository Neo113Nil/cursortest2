package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/CompanionBody;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/y", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CompanionBody {
    public static final y Companion = new y();
    public final AttributedContent a;
    public final ArrowButton b;

    public /* synthetic */ CompanionBody(int i, AttributedContent attributedContent, ArrowButton arrowButton) {
        this.a = (i & 1) == 0 ? new AttributedContent(0) : attributedContent;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = arrowButton;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanionBody)) {
            return false;
        }
        CompanionBody companionBody = (CompanionBody) obj;
        return jl40.l(this.a, companionBody.a) && jl40.l(this.b, companionBody.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        ArrowButton arrowButton = this.b;
        return hashCode + (arrowButton == null ? 0 : arrowButton.hashCode());
    }

    public final String toString() {
        return "CompanionBody(text=" + this.a + ", arrowButton=" + this.b + Extension.C_BRAKE;
    }

    public CompanionBody() {
        this.a = new AttributedContent(0);
        this.b = null;
    }
}
