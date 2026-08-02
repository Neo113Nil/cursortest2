package com.yandex.go.benefits_center.benefits.sdk.actions;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/benefits_center/benefits/sdk/actions/ShowTicketBannerAction;", "Lcom/yandex/go/benefits_center/benefits/sdk/actions/c;", "Companion", "$serializer", "com/yandex/go/benefits_center/benefits/sdk/actions/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShowTicketBannerAction extends c {
    public static final i Companion = new i();
    public final ru.yandex.taxi.communications.api.dto.ticket.a b;
    public final String c;

    public /* synthetic */ ShowTicketBannerAction(int i, ru.yandex.taxi.communications.api.dto.ticket.a aVar, String str) {
        this.b = (i & 1) == 0 ? new ru.yandex.taxi.communications.api.dto.ticket.a(0) : aVar;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public ShowTicketBannerAction() {
        this.b = new ru.yandex.taxi.communications.api.dto.ticket.a(0);
        this.c = null;
    }
}
