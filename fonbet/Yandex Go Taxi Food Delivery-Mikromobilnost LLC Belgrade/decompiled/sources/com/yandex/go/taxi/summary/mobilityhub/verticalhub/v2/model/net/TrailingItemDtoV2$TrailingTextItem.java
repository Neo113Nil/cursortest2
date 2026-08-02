package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/TrailingItemDtoV2$TrailingTextItem", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/q2;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/o2", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrailingItemDtoV2$TrailingTextItem extends q2 {
    public static final o2 Companion = new o2();
    public final FormattedText a;
    public final String b;
    public final int c;

    public TrailingItemDtoV2$TrailingTextItem(int i, FormattedText formattedText, String str, int i2) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
    }

    public TrailingItemDtoV2$TrailingTextItem() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = 0;
    }
}
