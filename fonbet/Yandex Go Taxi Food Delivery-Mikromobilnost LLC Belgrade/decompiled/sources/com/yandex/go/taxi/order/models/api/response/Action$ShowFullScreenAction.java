package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/response/Action$ShowFullScreenAction", "Lcom/yandex/go/taxi/order/models/api/response/d;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Action$ShowFullScreenAction extends d {
    public static final a Companion = new a();
    public final Fullscreen a;

    public Action$ShowFullScreenAction(int i, Fullscreen fullscreen) {
        if ((i & 1) == 0) {
            this.a = new Fullscreen(0);
        } else {
            this.a = fullscreen;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$ShowFullScreenAction) && jl40.l(this.a, ((Action$ShowFullScreenAction) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "ShowFullScreenAction(fullscreen=" + this.a + Extension.C_BRAKE;
    }

    public Action$ShowFullScreenAction() {
        this.a = new Fullscreen(0);
    }
}
