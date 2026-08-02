package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersAttentionDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/data/model/l", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersAttentionDto {
    public static final l Companion = new l();
    public final FormattedText a;
    public final String b;
    public final String c;
    public final e d;
    public final String e;
    public final String f;

    public /* synthetic */ ChargersAttentionDto(int i, FormattedText formattedText, String str, String str2, e eVar, String str3, String str4) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = eVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
    }

    public ChargersAttentionDto() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = "";
    }
}
