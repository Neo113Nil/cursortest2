package com.yandex.go.chargers.offer.data.api;

import defpackage.fna;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.wna;
import defpackage.xna;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/offer/data/api/ChargersPromoPlateDto;", "", "Companion", "xna", "$serializer", "com/yandex/go/chargers/offer/data/api/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersPromoPlateDto {
    public static final u Companion = new u();
    public static final i3y[] h = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fna(6)), null, null};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final List e;
    public final xna f;
    public final ChargersOfferToggleDto g;

    public /* synthetic */ ChargersPromoPlateDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, List list, xna xnaVar, ChargersOfferToggleDto chargersOfferToggleDto) {
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
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = EmptyList.a;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = wna.INSTANCE;
        } else {
            this.f = xnaVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = chargersOfferToggleDto;
        }
    }

    public ChargersPromoPlateDto() {
        FormattedText formattedText = FormattedText.c;
        wna wnaVar = wna.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = EmptyList.a;
        this.f = wnaVar;
        this.g = null;
    }
}
