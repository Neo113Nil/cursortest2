package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.w410;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitTicketDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class MasstransitTicketDto {
    public static final l Companion = new l();
    public static final i3y[] j = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w410(9)), null, null, null, null};
    public final String a;
    public final HeaderDto b;
    public final x c;
    public final FormattedText d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final Boolean i;

    public /* synthetic */ MasstransitTicketDto(int i, String str, HeaderDto headerDto, x xVar, FormattedText formattedText, List list, String str2, String str3, String str4, Boolean bool) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new HeaderDto(0);
        } else {
            this.b = headerDto;
        }
        if ((i & 4) == 0) {
            this.c = w.INSTANCE;
        } else {
            this.c = xVar;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
    }

    /* renamed from: a, reason: from getter */
    public final List getE() {
        return this.e;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final x getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasstransitTicketDto)) {
            return false;
        }
        MasstransitTicketDto masstransitTicketDto = (MasstransitTicketDto) obj;
        return jl40.l(this.a, masstransitTicketDto.a) && jl40.l(this.b, masstransitTicketDto.b) && jl40.l(this.c, masstransitTicketDto.c) && jl40.l(this.d, masstransitTicketDto.d) && jl40.l(this.e, masstransitTicketDto.e) && jl40.l(this.f, masstransitTicketDto.f) && jl40.l(this.g, masstransitTicketDto.g) && jl40.l(this.h, masstransitTicketDto.h) && jl40.l(this.i, masstransitTicketDto.i);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a), 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.i;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasstransitTicketDto(id=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", transportPass=");
        sb.append(this.c);
        sb.append(", additionalInfoTitle=");
        sb.append(this.d);
        sb.append(", additionalInfo=");
        oyr.D(", expirationDate=", this.f, ", expirationTitle=", sb, this.e);
        g8e.D(sb, this.g, ", title=", this.h, ", isValid=");
        return nzs.d(sb, this.i, Extension.C_BRAKE);
    }

    public MasstransitTicketDto() {
        HeaderDto headerDto = new HeaderDto(0);
        w wVar = w.INSTANCE;
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = headerDto;
        this.c = wVar;
        this.d = formattedText;
        this.e = EmptyList.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
