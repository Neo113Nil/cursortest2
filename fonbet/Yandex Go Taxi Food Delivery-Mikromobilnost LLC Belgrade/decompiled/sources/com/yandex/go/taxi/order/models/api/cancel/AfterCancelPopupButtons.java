package com.yandex.go.taxi.order.models.api.cancel;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pn0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.Orientation;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/cancel/AfterCancelPopupButtons;", "", "Companion", "com/yandex/go/taxi/order/models/api/cancel/v", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AfterCancelPopupButtons {
    public static final v Companion = new v();
    public static final i3y[] c;
    public static final AfterCancelPopupButtons d;
    public final Orientation a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new pn0(22)), kotlin.a.b(lazyThreadSafetyMode, new pn0(23))};
        d = new AfterCancelPopupButtons(0);
    }

    public /* synthetic */ AfterCancelPopupButtons(int i, Orientation orientation, List list) {
        this.a = (i & 1) == 0 ? Orientation.VERTICAL : orientation;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public AfterCancelPopupButtons() {
        this(0);
    }

    public AfterCancelPopupButtons(int i) {
        this.a = Orientation.VERTICAL;
        this.b = EmptyList.a;
    }
}
