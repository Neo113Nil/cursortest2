package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/BadgeDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/t", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeDto {
    public static final t Companion = new t();
    public final FormattedText a;
    public final String b;

    public /* synthetic */ BadgeDto(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeDto)) {
            return false;
        }
        BadgeDto badgeDto = (BadgeDto) obj;
        return jl40.l(this.a, badgeDto.a) && jl40.l(this.b, badgeDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "BadgeDto(title=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }

    public BadgeDto() {
        this(0);
    }

    public BadgeDto(int i) {
        this.a = FormattedText.c;
        this.b = "";
    }
}
