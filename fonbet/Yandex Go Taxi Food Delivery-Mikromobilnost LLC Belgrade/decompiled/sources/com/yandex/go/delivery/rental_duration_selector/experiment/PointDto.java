package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/PointDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/g", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PointDto {
    public static final g Companion = new g();
    public final String a;
    public final String b;

    public /* synthetic */ PointDto(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointDto)) {
            return false;
        }
        PointDto pointDto = (PointDto) obj;
        return jl40.l(this.a, pointDto.a) && jl40.l(this.b, pointDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("PointDto(titleKey=", this.a, ", subtitleKey=", this.b, Extension.C_BRAKE);
    }

    public PointDto() {
        this.a = "";
        this.b = null;
    }
}
