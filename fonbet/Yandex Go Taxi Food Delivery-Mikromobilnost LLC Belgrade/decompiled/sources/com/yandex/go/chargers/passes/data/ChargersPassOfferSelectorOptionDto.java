package com.yandex.go.chargers.passes.data;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.nba;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/passes/data/ChargersPassOfferSelectorOptionDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/passes/data/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPassOfferSelectorOptionDto {
    public static final z Companion = new z();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nba(15)), null, null, null, null};
    public final String a;
    public final ChargersPassTypeDto b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final ChargersPassButtonDto f;

    public /* synthetic */ ChargersPassOfferSelectorOptionDto(int i, String str, ChargersPassTypeDto chargersPassTypeDto, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, ChargersPassButtonDto chargersPassButtonDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ChargersPassTypeDto.UNKNOWN;
        } else {
            this.b = chargersPassTypeDto;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText3;
        }
        if ((i & 32) == 0) {
            this.f = new ChargersPassButtonDto(0);
        } else {
            this.f = chargersPassButtonDto;
        }
    }

    public ChargersPassOfferSelectorOptionDto() {
        ChargersPassTypeDto chargersPassTypeDto = ChargersPassTypeDto.UNKNOWN;
        FormattedText formattedText = FormattedText.c;
        ChargersPassButtonDto chargersPassButtonDto = new ChargersPassButtonDto(0);
        this.a = "";
        this.b = chargersPassTypeDto;
        this.c = formattedText;
        this.d = formattedText;
        this.e = null;
        this.f = chargersPassButtonDto;
    }
}
