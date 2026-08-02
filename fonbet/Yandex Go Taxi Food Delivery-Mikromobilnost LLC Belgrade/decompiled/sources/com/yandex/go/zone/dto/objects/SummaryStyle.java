package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/dto/objects/SummaryStyle;", "", "Companion", "$serializer", "com/yandex/go/zone/dto/objects/o5", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SummaryStyle {
    public static final o5 Companion = new o5();
    public final SurgeIconStyle a;
    public final OrderButtonStyleDto b;

    public /* synthetic */ SummaryStyle(int i, SurgeIconStyle surgeIconStyle, OrderButtonStyleDto orderButtonStyleDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = surgeIconStyle;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = orderButtonStyleDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryStyle)) {
            return false;
        }
        SummaryStyle summaryStyle = (SummaryStyle) obj;
        return jl40.l(this.a, summaryStyle.a) && jl40.l(this.b, summaryStyle.b);
    }

    public final int hashCode() {
        SurgeIconStyle surgeIconStyle = this.a;
        int hashCode = (surgeIconStyle == null ? 0 : surgeIconStyle.hashCode()) * 31;
        OrderButtonStyleDto orderButtonStyleDto = this.b;
        return hashCode + (orderButtonStyleDto != null ? orderButtonStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "SummaryStyle(surgeIcon=" + this.a + ", orderButton=" + this.b + Extension.C_BRAKE;
    }

    public SummaryStyle() {
        this.a = null;
        this.b = null;
    }
}
