package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$SectionHeaderDtoV2", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/b1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDtoV2$SectionHeaderDtoV2 extends b1 {
    public static final y0 Companion = new y0();
    public final FormattedText a;
    public final String b;
    public final String c;

    public HubItemDtoV2$SectionHeaderDtoV2(int i, String str, String str2, FormattedText formattedText) {
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
    }

    public HubItemDtoV2$SectionHeaderDtoV2() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = null;
    }
}
