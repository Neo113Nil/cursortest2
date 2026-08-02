package com.yandex.go.chargers.discounts.data.models;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountNotificationDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersDiscountNotificationDto {
    public static final b Companion = new b();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;

    public /* synthetic */ ChargersDiscountNotificationDto(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        this.c = (i & 4) == 0 ? null : str;
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersDiscountNotificationDto)) {
            return false;
        }
        ChargersDiscountNotificationDto chargersDiscountNotificationDto = (ChargersDiscountNotificationDto) obj;
        return jl40.l(this.a, chargersDiscountNotificationDto.a) && jl40.l(this.b, chargersDiscountNotificationDto.b) && jl40.l(this.c, chargersDiscountNotificationDto.c) && jl40.l(this.d, chargersDiscountNotificationDto.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return g8e.r(defpackage.n.r("ChargersDiscountNotificationDto(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, ", backgroundColor=", this.d, Extension.C_BRAKE);
    }

    public ChargersDiscountNotificationDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = "";
    }
}
