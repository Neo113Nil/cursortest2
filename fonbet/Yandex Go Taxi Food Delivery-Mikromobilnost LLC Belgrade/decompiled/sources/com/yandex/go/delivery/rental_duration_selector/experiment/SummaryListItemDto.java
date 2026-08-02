package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/SummaryListItemDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/k", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SummaryListItemDto {
    public static final k Companion = new k();
    public final BadgeDto a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ SummaryListItemDto(int i, BadgeDto badgeDto, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = badgeDto;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryListItemDto)) {
            return false;
        }
        SummaryListItemDto summaryListItemDto = (SummaryListItemDto) obj;
        return jl40.l(this.a, summaryListItemDto.a) && jl40.l(this.b, summaryListItemDto.b) && jl40.l(this.c, summaryListItemDto.c) && jl40.l(this.d, summaryListItemDto.d) && jl40.l(this.e, summaryListItemDto.e);
    }

    public final int hashCode() {
        BadgeDto badgeDto = this.a;
        int b = unr0.b((badgeDto == null ? 0 : badgeDto.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryListItemDto(badgeDto=");
        sb.append(this.a);
        sb.append(", titleKey=");
        sb.append(this.b);
        sb.append(", subtitleKey=");
        g8e.D(sb, this.c, ", imageTag=", this.d, ", durationSelectedSubtitleKey=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public SummaryListItemDto(int i) {
        this.a = null;
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public SummaryListItemDto() {
        this(0);
    }
}
