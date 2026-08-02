package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$DefaultOfferHeaderDtoV2", "", "Companion", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/v0", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDtoV2$DefaultOfferHeaderDtoV2 {
    public static final v0 Companion = new v0();
    public static final HubItemDtoV2$DefaultOfferHeaderDtoV2 l = new HubItemDtoV2$DefaultOfferHeaderDtoV2(0);
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final FormattedText f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ HubItemDtoV2$DefaultOfferHeaderDtoV2(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6, int i2, String str, String str2, String str3, String str4) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText4;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText5;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText6;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str4;
        }
    }

    public HubItemDtoV2$DefaultOfferHeaderDtoV2() {
        this(0);
    }

    public HubItemDtoV2$DefaultOfferHeaderDtoV2(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = formattedText;
        this.f = formattedText;
        this.g = 0;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
    }
}
