package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/CompressionResistantAttributedTextDto;", "", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/w", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CompressionResistantAttributedTextDto {
    public static final w Companion = new w();
    public final FormattedText a;
    public final Integer b;

    public /* synthetic */ CompressionResistantAttributedTextDto(int i, FormattedText formattedText, Integer num) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompressionResistantAttributedTextDto)) {
            return false;
        }
        CompressionResistantAttributedTextDto compressionResistantAttributedTextDto = (CompressionResistantAttributedTextDto) obj;
        return jl40.l(this.a, compressionResistantAttributedTextDto.a) && jl40.l(this.b, compressionResistantAttributedTextDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CompressionResistantAttributedTextDto(text=" + this.a + ", priority=" + this.b + Extension.C_BRAKE;
    }

    public CompressionResistantAttributedTextDto() {
        this.a = FormattedText.c;
        this.b = null;
    }
}
