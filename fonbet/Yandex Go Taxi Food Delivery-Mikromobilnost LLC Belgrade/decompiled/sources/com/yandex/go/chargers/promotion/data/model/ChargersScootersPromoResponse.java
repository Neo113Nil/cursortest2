package com.yandex.go.chargers.promotion.data.model;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/promotion/data/model/ChargersScootersPromoResponse;", "", "Companion", "$serializer", "com/yandex/go/chargers/promotion/data/model/c", "promotion"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersScootersPromoResponse {
    public static final c Companion = new c();
    public final String a;
    public final TitleDto b;
    public final SubtitleDto c;
    public final ActionDto d;
    public final String e;

    public /* synthetic */ ChargersScootersPromoResponse(int i, String str, TitleDto titleDto, SubtitleDto subtitleDto, ActionDto actionDto, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = titleDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = subtitleDto;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = actionDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public ChargersScootersPromoResponse() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
