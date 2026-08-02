package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$ToggleItemDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/b1;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/z0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubItemDtoV2$ToggleItemDto extends b1 {
    public static final z0 Companion = new z0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final TrailingToggleItemDto d;
    public final k2 e;

    public HubItemDtoV2$ToggleItemDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, TrailingToggleItemDto trailingToggleItemDto, k2 k2Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = trailingToggleItemDto;
        }
        if ((i & 16) == 0) {
            this.e = j2.INSTANCE;
        } else {
            this.e = k2Var;
        }
    }

    public HubItemDtoV2$ToggleItemDto() {
        FormattedText formattedText = FormattedText.c;
        j2 j2Var = j2.INSTANCE;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = null;
        this.e = j2Var;
    }
}
