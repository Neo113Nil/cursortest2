package com.yandex.go.chargers.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/data/model/ChargersStationInfoDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/data/model/u", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationInfoDto {
    public static final u Companion = new u();
    public final String a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ ChargersStationInfoDto(int i, String str, String str2, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public ChargersStationInfoDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
