package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/GroupItemContentDto$GroupItemTextContentDto", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/n;", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GroupItemContentDto$GroupItemTextContentDto extends n {
    public static final l Companion = new l();
    public final FormattedText a;

    public GroupItemContentDto$GroupItemTextContentDto(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public GroupItemContentDto$GroupItemTextContentDto() {
        this.a = FormattedText.c;
    }
}
