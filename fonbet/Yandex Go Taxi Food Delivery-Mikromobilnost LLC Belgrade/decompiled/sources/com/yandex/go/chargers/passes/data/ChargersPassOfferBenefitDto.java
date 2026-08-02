package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassOfferBenefitDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassOfferBenefitDto {
    public static final w Companion = new w();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ ChargersPassOfferBenefitDto(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    public ChargersPassOfferBenefitDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = "";
    }
}
