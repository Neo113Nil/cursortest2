package com.yandex.go.chargers.passes.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassNotificationDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassNotificationDto {
    public static final v Companion = new v();
    public final String a;
    public final String b;
    public final FormattedText c;

    public /* synthetic */ ChargersPassNotificationDto(int i, String str, String str2, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassNotificationDto)) {
            return false;
        }
        ChargersPassNotificationDto chargersPassNotificationDto = (ChargersPassNotificationDto) obj;
        return jl40.l(this.a, chargersPassNotificationDto.a) && jl40.l(this.b, chargersPassNotificationDto.b) && jl40.l(this.c, chargersPassNotificationDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.a.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return tse0.m(b64.v("ChargersPassNotificationDto(id=", this.a, ", iconTag=", this.b, ", title="), this.c, Extension.C_BRAKE);
    }

    public ChargersPassNotificationDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = null;
        this.c = formattedText;
    }
}
