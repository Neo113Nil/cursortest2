package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/PopupModalImage$DriverAvatar", "Lcom/yandex/go/taxi/order/models/api/response/q3;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/p3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PopupModalImage$DriverAvatar extends q3 {
    public static final p3 Companion = new p3();
    public final String a;
    public final String b;
    public final String c;

    public PopupModalImage$DriverAvatar(int i, String str, String str2, String str3) {
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
            this.c = str3;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.q3
    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.q3
    /* renamed from: c, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupModalImage$DriverAvatar)) {
            return false;
        }
        PopupModalImage$DriverAvatar popupModalImage$DriverAvatar = (PopupModalImage$DriverAvatar) obj;
        return jl40.l(this.a, popupModalImage$DriverAvatar.a) && jl40.l(this.b, popupModalImage$DriverAvatar.b) && jl40.l(this.c, popupModalImage$DriverAvatar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("DriverAvatar(imageTag=", this.a, ", imageUrl=", this.b, ", badgeImageTag="), this.c, Extension.C_BRAKE);
    }

    public PopupModalImage$DriverAvatar() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
