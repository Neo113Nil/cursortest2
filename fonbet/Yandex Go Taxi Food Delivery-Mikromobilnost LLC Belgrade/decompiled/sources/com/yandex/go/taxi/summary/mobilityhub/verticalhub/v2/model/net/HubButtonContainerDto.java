package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.gsq0;
import defpackage.hqu;
import defpackage.i3y;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubButtonContainerDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HubButtonContainerDto {
    public static final q Companion = new q();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hqu(5)), null};
    public final FormattedText a;
    public final s0 b;
    public final HubLeadingItemKind c;
    public final FooterTrailingItemDto d;

    public /* synthetic */ HubButtonContainerDto(int i, FormattedText formattedText, s0 s0Var, HubLeadingItemKind hubLeadingItemKind, FooterTrailingItemDto footerTrailingItemDto) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = q0.INSTANCE;
        } else {
            this.b = s0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = hubLeadingItemKind;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = footerTrailingItemDto;
        }
    }

    public HubButtonContainerDto() {
        FormattedText formattedText = FormattedText.c;
        q0 q0Var = q0.INSTANCE;
        this.a = formattedText;
        this.b = q0Var;
        this.c = null;
        this.d = null;
    }
}
