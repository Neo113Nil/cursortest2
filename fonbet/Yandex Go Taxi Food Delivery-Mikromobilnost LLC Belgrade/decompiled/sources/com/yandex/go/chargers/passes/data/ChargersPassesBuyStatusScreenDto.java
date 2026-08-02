package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassesBuyStatusScreenDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassesBuyStatusScreenDto {
    public static final k0 Companion = new k0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final ChargersPassButtonDto d;

    public /* synthetic */ ChargersPassesBuyStatusScreenDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, ChargersPassButtonDto chargersPassButtonDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = new ChargersPassButtonDto(0);
        } else {
            this.d = chargersPassButtonDto;
        }
    }

    public ChargersPassesBuyStatusScreenDto() {
        this(0);
    }

    public ChargersPassesBuyStatusScreenDto(int i) {
        FormattedText formattedText = FormattedText.c;
        ChargersPassButtonDto chargersPassButtonDto = new ChargersPassButtonDto(0);
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = chargersPassButtonDto;
    }
}
