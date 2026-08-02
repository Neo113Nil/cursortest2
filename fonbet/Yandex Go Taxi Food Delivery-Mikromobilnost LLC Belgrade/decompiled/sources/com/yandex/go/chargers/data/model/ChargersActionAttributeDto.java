package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersActionAttributeDto;", "", "Companion", "com/yandex/go/chargers/data/model/j", "$serializer", "com/yandex/go/chargers/data/model/k", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersActionAttributeDto {
    public static final k Companion = new k();
    public final String a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final j e;

    public /* synthetic */ ChargersActionAttributeDto(int i, String str, FormattedText formattedText, String str2, String str3, j jVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = jVar;
        }
    }

    public ChargersActionAttributeDto() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = "";
        this.d = null;
        this.e = null;
    }
}
