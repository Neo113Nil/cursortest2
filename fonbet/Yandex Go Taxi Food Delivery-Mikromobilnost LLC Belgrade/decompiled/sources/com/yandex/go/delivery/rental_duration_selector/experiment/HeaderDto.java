package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/HeaderDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/f", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HeaderDto {
    public static final f Companion = new f();
    public final String a;
    public final String b;
    public final String c;
    public final HeaderButtonDto d;

    public /* synthetic */ HeaderDto(int i, String str, String str2, String str3, HeaderButtonDto headerButtonDto) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = headerButtonDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderDto)) {
            return false;
        }
        HeaderDto headerDto = (HeaderDto) obj;
        return jl40.l(this.a, headerDto.a) && jl40.l(this.b, headerDto.b) && jl40.l(this.c, headerDto.c) && jl40.l(this.d, headerDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HeaderButtonDto headerButtonDto = this.d;
        return hashCode3 + (headerButtonDto != null ? headerButtonDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("HeaderDto(titleKey=", this.a, ", subtitleKey=", this.b, ", leadImageTag=");
        v.append(this.c);
        v.append(", trailButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public HeaderDto() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
