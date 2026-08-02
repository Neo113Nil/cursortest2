package com.yandex.go.chargers.subscription.data.model;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionButtonDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/subscription/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersSubscriptionButtonDto {
    public static final i Companion = new i();
    public final FormattedText a;
    public final h b;

    public /* synthetic */ ChargersSubscriptionButtonDto(int i, FormattedText formattedText, h hVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = hVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersSubscriptionButtonDto)) {
            return false;
        }
        ChargersSubscriptionButtonDto chargersSubscriptionButtonDto = (ChargersSubscriptionButtonDto) obj;
        return jl40.l(this.a, chargersSubscriptionButtonDto.a) && jl40.l(this.b, chargersSubscriptionButtonDto.b);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        h hVar = this.b;
        return hashCode + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "ChargersSubscriptionButtonDto(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public ChargersSubscriptionButtonDto() {
        this.a = null;
        this.b = null;
    }
}
