package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferBodyDto$TextBodyDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/e;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DefaultOfferBodyDto$TextBodyDto extends e {
    public static final b Companion = new b();
    public final FormattedText a;
    public final TrailingItemDto b;

    public DefaultOfferBodyDto$TextBodyDto(int i, FormattedText formattedText, TrailingItemDto trailingItemDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = trailingItemDto;
        }
    }

    public DefaultOfferBodyDto$TextBodyDto() {
        this.a = FormattedText.c;
        this.b = null;
    }
}
