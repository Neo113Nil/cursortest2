package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.l301;
import defpackage.nhz0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardButtonDto;", "", "Companion", "l301", "$serializer", "com/yandex/go/superapp/tracking/models/dto/g", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardButtonDto {
    public static final g Companion = new g();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nhz0(18))};
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final l301 d;

    public /* synthetic */ TrackingCardButtonDto(int i, FormattedText formattedText, FormattedText formattedText2, String str, l301 l301Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l301Var;
        }
    }

    /* renamed from: a, reason: from getter */
    public final l301 getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: c, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackingCardButtonDto)) {
            return false;
        }
        TrackingCardButtonDto trackingCardButtonDto = (TrackingCardButtonDto) obj;
        return jl40.l(this.a, trackingCardButtonDto.a) && jl40.l(this.b, trackingCardButtonDto.b) && jl40.l(this.c, trackingCardButtonDto.c) && jl40.l(this.d, trackingCardButtonDto.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        l301 l301Var = this.d;
        return hashCode3 + (l301Var != null ? l301Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = defpackage.n.r("TrackingCardButtonDto(title=", this.a, ", subtitle=", this.b, ", backgroundColor=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    public TrackingCardButtonDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
