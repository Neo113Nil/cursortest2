package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nba;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesPaymentSettingsResponseDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/q0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassesPaymentSettingsResponseDto {
    public static final q0 Companion = new q0();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(22))};
    public final FormattedText a;
    public final ChargersPassPaymentMethodDto b;
    public final ChargersPassRenewalDto c;
    public final List d;

    public /* synthetic */ ChargersPassesPaymentSettingsResponseDto(int i, FormattedText formattedText, ChargersPassPaymentMethodDto chargersPassPaymentMethodDto, ChargersPassRenewalDto chargersPassRenewalDto, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = new ChargersPassPaymentMethodDto(0);
        } else {
            this.b = chargersPassPaymentMethodDto;
        }
        if ((i & 4) == 0) {
            this.c = new ChargersPassRenewalDto(0);
        } else {
            this.c = chargersPassRenewalDto;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassesPaymentSettingsResponseDto)) {
            return false;
        }
        ChargersPassesPaymentSettingsResponseDto chargersPassesPaymentSettingsResponseDto = (ChargersPassesPaymentSettingsResponseDto) obj;
        return jl40.l(this.a, chargersPassesPaymentSettingsResponseDto.a) && jl40.l(this.b, chargersPassesPaymentSettingsResponseDto.b) && jl40.l(this.c, chargersPassesPaymentSettingsResponseDto.c) && jl40.l(this.d, chargersPassesPaymentSettingsResponseDto.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChargersPassesPaymentSettingsResponseDto(title=" + this.a + ", paymentMethod=" + this.b + ", renewal=" + this.c + ", buttons=" + this.d + Extension.C_BRAKE;
    }

    public ChargersPassesPaymentSettingsResponseDto() {
        FormattedText formattedText = FormattedText.c;
        ChargersPassPaymentMethodDto chargersPassPaymentMethodDto = new ChargersPassPaymentMethodDto(0);
        ChargersPassRenewalDto chargersPassRenewalDto = new ChargersPassRenewalDto(0);
        this.a = formattedText;
        this.b = chargersPassPaymentMethodDto;
        this.c = chargersPassRenewalDto;
        this.d = EmptyList.a;
    }
}
