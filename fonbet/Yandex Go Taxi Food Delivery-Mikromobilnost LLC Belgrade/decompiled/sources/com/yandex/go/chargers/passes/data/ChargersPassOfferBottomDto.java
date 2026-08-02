package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassOfferBottomDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassOfferBottomDto {
    public static final x Companion = new x();
    public final ChargersPassButtonDto a;
    public final FormattedText b;

    public /* synthetic */ ChargersPassOfferBottomDto(int i, ChargersPassButtonDto chargersPassButtonDto, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? new ChargersPassButtonDto(0) : chargersPassButtonDto;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public ChargersPassOfferBottomDto() {
        this(0);
    }

    public ChargersPassOfferBottomDto(int i) {
        ChargersPassButtonDto chargersPassButtonDto = new ChargersPassButtonDto(0);
        FormattedText formattedText = FormattedText.c;
        this.a = chargersPassButtonDto;
        this.b = formattedText;
    }
}
