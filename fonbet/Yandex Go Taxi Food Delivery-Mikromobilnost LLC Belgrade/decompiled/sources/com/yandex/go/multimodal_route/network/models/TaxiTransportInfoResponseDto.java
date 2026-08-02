package com.yandex.go.multimodal_route.network.models;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.y6y0;
import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "", "Companion", "$serializer", "com/yandex/go/multimodal_route/network/models/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TaxiTransportInfoResponseDto {
    public static final s Companion = new s();
    public static final i3y[] i = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y6y0(11)), null, null, null};
    public final String a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final Calendar g;
    public final TaxiFeedbackDto h;

    public /* synthetic */ TaxiTransportInfoResponseDto(int i2, String str, FormattedText formattedText, String str2, String str3, List list, String str4, Calendar calendar, TaxiFeedbackDto taxiFeedbackDto) {
        if (17 != (i2 & 17)) {
            qje.Z(i2, 17, TaxiTransportInfoResponseDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = list;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = calendar;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = taxiFeedbackDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiTransportInfoResponseDto)) {
            return false;
        }
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto = (TaxiTransportInfoResponseDto) obj;
        return jl40.l(this.a, taxiTransportInfoResponseDto.a) && jl40.l(this.b, taxiTransportInfoResponseDto.b) && jl40.l(this.c, taxiTransportInfoResponseDto.c) && jl40.l(this.d, taxiTransportInfoResponseDto.d) && jl40.l(this.e, taxiTransportInfoResponseDto.e) && jl40.l(this.f, taxiTransportInfoResponseDto.f) && jl40.l(this.g, taxiTransportInfoResponseDto.g) && jl40.l(this.h, taxiTransportInfoResponseDto.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int c = unr0.c((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode4 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        Calendar calendar = this.g;
        int hashCode5 = (hashCode4 + (calendar == null ? 0 : calendar.hashCode())) * 31;
        TaxiFeedbackDto taxiFeedbackDto = this.h;
        return hashCode5 + (taxiFeedbackDto != null ? taxiFeedbackDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("TaxiTransportInfoResponseDto(offerId=", this.a, ", title=", ", taxiOrderId=", this.b);
        g8e.D(q, this.c, ", tariffClass=", this.d, ", routeUris=");
        oyr.D(", masstransitRouteUri=", this.f, ", taxiCompleteTime=", q, this.e);
        q.append(this.g);
        q.append(", taxiFeedback=");
        q.append(this.h);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
