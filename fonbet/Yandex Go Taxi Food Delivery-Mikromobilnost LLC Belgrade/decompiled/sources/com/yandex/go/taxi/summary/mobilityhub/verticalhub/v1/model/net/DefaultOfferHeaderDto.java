package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferHeaderDto;", "", "Companion", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferHeaderDto {
    public static final f Companion = new f();
    public static final DefaultOfferHeaderDto j = new DefaultOfferHeaderDto(0);
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ DefaultOfferHeaderDto(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, int i2, String str, String str2, String str3, String str4) {
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
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str4;
        }
    }

    public DefaultOfferHeaderDto() {
        this(0);
    }

    public DefaultOfferHeaderDto(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = 0;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
