package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassCancelInstructionItemDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersPassCancelInstructionItemDto {
    public static final m Companion = new m();
    public final String a;
    public final FormattedText b;

    public /* synthetic */ ChargersPassCancelInstructionItemDto(int i, String str, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersPassCancelInstructionItemDto)) {
            return false;
        }
        ChargersPassCancelInstructionItemDto chargersPassCancelInstructionItemDto = (ChargersPassCancelInstructionItemDto) obj;
        return jl40.l(this.a, chargersPassCancelInstructionItemDto.a) && jl40.l(this.b, chargersPassCancelInstructionItemDto.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersPassCancelInstructionItemDto(imageTag=" + this.a + ", body=" + this.b + Extension.C_BRAKE;
    }

    public ChargersPassCancelInstructionItemDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
    }
}
