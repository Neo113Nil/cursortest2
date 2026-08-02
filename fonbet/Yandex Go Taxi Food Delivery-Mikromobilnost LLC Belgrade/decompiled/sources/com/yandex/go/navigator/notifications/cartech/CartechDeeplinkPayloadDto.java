package com.yandex.go.navigator.notifications.cartech;

import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.we8;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/notifications/cartech/CartechDeeplinkPayloadDto;", "", "Companion", "$serializer", "com/yandex/go/navigator/notifications/cartech/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartechDeeplinkPayloadDto {
    public static final a Companion = new a();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new we8(11))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final StationType f;

    public /* synthetic */ CartechDeeplinkPayloadDto(int i, String str, String str2, String str3, String str4, String str5, StationType stationType) {
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = stationType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartechDeeplinkPayloadDto)) {
            return false;
        }
        CartechDeeplinkPayloadDto cartechDeeplinkPayloadDto = (CartechDeeplinkPayloadDto) obj;
        return jl40.l(this.a, cartechDeeplinkPayloadDto.a) && jl40.l(this.b, cartechDeeplinkPayloadDto.b) && jl40.l(this.c, cartechDeeplinkPayloadDto.c) && jl40.l(this.d, cartechDeeplinkPayloadDto.d) && jl40.l(this.e, cartechDeeplinkPayloadDto.e) && this.f == cartechDeeplinkPayloadDto.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        StationType stationType = this.f;
        return b + (stationType == null ? 0 : stationType.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("CartechDeeplinkPayloadDto(title=", this.a, ", subtitle=", this.b, ", buttonName=");
        g8e.D(v, this.c, ", imageUrl=", this.d, ", redirectDeeplink=");
        v.append(this.e);
        v.append(", stationType=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public CartechDeeplinkPayloadDto() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = null;
    }
}
