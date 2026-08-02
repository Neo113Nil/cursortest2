package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersSubscriptionUpsaleWindowDto;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/b0", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersSubscriptionUpsaleWindowDto {
    public static final b0 Companion = new b0();
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final ScootersSubscriptionUpsaleBadgeDto d;
    public final String e;
    public final ScootersSubscriptionUpsaleButtonDto f;
    public final ScootersSubscriptionUpsaleButtonDto g;
    public final ScootersSubscriptionLegalInfoDto h;
    public final kotlinx.serialization.json.c i;

    public /* synthetic */ ScootersSubscriptionUpsaleWindowDto(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, ScootersSubscriptionUpsaleBadgeDto scootersSubscriptionUpsaleBadgeDto, String str, ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto, ScootersSubscriptionUpsaleButtonDto scootersSubscriptionUpsaleButtonDto2, ScootersSubscriptionLegalInfoDto scootersSubscriptionLegalInfoDto, kotlinx.serialization.json.c cVar) {
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
            this.d = null;
        } else {
            this.d = scootersSubscriptionUpsaleBadgeDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = scootersSubscriptionUpsaleButtonDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = scootersSubscriptionUpsaleButtonDto2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = scootersSubscriptionLegalInfoDto;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = cVar;
        }
    }

    public ScootersSubscriptionUpsaleWindowDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = formattedText;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }
}
