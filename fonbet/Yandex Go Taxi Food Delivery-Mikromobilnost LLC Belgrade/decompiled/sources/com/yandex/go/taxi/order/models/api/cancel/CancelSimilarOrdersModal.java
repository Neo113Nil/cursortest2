package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/CancelSimilarOrdersModal;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/cancel/y", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CancelSimilarOrdersModal {
    public static final y Companion = new y();
    public final String a;
    public final String b;
    public final Buttons c;
    public final String d;

    public /* synthetic */ CancelSimilarOrdersModal(int i, String str, String str2, Buttons buttons, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = buttons;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancelSimilarOrdersModal)) {
            return false;
        }
        CancelSimilarOrdersModal cancelSimilarOrdersModal = (CancelSimilarOrdersModal) obj;
        return jl40.l(this.a, cancelSimilarOrdersModal.a) && jl40.l(this.b, cancelSimilarOrdersModal.b) && jl40.l(this.c, cancelSimilarOrdersModal.c) && jl40.l(this.d, cancelSimilarOrdersModal.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Buttons buttons = this.c;
        int hashCode3 = (hashCode2 + (buttons == null ? 0 : buttons.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CancelSimilarOrdersModal(title=", this.a, ", text=", this.b, ", buttons=");
        v.append(this.c);
        v.append(", imageTag=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CancelSimilarOrdersModal() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
