package com.yandex.go.zone.dto.objects;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/DefaultOrderPopup;", "Lcom/yandex/go/zone/dto/objects/u2;", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/l0", "go-client-android.internal_libs:taxi_shared_dto"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DefaultOrderPopup extends u2 {
    public static final l0 Companion = new l0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final OrderButton f;

    public DefaultOrderPopup(int i, String str, String str2, String str3, String str4, String str5, OrderButton orderButton) {
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
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) != 0) {
            this.f = orderButton;
        } else {
            OrderButton.Companion.getClass();
            this.f = OrderButton.c;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultOrderPopup)) {
            return false;
        }
        DefaultOrderPopup defaultOrderPopup = (DefaultOrderPopup) obj;
        return jl40.l(this.a, defaultOrderPopup.a) && jl40.l(this.b, defaultOrderPopup.b) && jl40.l(this.c, defaultOrderPopup.c) && jl40.l(this.d, defaultOrderPopup.d) && jl40.l(this.e, defaultOrderPopup.e) && jl40.l(this.f, defaultOrderPopup.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("DefaultOrderPopup(title=", this.a, ", comment=", this.b, ", description=");
        g8e.D(v, this.c, ", reason=", this.d, ", buttonText=");
        v.append(this.e);
        v.append(", orderButton=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public DefaultOrderPopup() {
        OrderButton.Companion.getClass();
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = OrderButton.c;
    }
}
