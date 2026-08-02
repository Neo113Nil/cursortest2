package com.yandex.go.chargers.network.api;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/network/api/ChargersButtonDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/network/api/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersButtonDto {
    public static final a Companion = new a();
    public final FormattedText a;
    public final String b;

    public /* synthetic */ ChargersButtonDto(int i, String str, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
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
        if (!(obj instanceof ChargersButtonDto)) {
            return false;
        }
        ChargersButtonDto chargersButtonDto = (ChargersButtonDto) obj;
        return jl40.l(this.a, chargersButtonDto.a) && jl40.l(this.b, chargersButtonDto.b);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChargersButtonDto(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }

    public ChargersButtonDto() {
        this.a = null;
        this.b = null;
    }
}
