package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/BadgeDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/a", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BadgeDto {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ BadgeDto(int i, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? "" : str;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeDto)) {
            return false;
        }
        BadgeDto badgeDto = (BadgeDto) obj;
        return jl40.l(this.a, badgeDto.a) && jl40.l(this.b, badgeDto.b) && jl40.l(this.c, badgeDto.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("BadgeDto(textKey=", this.a, ", textColor=", this.b, ", backgroundColor="), this.c, Extension.C_BRAKE);
    }

    public BadgeDto() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
