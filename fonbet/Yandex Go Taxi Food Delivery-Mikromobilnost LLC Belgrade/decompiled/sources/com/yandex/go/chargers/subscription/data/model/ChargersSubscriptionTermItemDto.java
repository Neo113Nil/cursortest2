package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionTermItemDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersSubscriptionTermItemDto {
    public static final w Companion = new w();
    public final FormattedText a;
    public final String b;

    public /* synthetic */ ChargersSubscriptionTermItemDto(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersSubscriptionTermItemDto)) {
            return false;
        }
        ChargersSubscriptionTermItemDto chargersSubscriptionTermItemDto = (ChargersSubscriptionTermItemDto) obj;
        return jl40.l(this.a, chargersSubscriptionTermItemDto.a) && jl40.l(this.b, chargersSubscriptionTermItemDto.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ChargersSubscriptionTermItemDto(title=" + this.a + ", leadIconTag=" + this.b + Extension.C_BRAKE;
    }

    public ChargersSubscriptionTermItemDto() {
        this.a = FormattedText.c;
        this.b = null;
    }
}
