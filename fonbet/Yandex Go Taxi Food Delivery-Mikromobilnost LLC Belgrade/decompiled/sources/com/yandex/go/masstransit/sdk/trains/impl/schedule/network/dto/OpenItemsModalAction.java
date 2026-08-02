package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.y570;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/OpenItemsModalAction;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/l;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OpenItemsModalAction extends l {
    public static final x Companion = new x();
    public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y570(2))};
    public final FormattedText a;
    public final FormattedText b;
    public final List c;

    public /* synthetic */ OpenItemsModalAction(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public OpenItemsModalAction() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
    }
}
