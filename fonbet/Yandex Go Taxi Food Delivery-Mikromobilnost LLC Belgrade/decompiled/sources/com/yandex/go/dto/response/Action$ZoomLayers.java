package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/Action$ZoomLayers", "Lcom/yandex/go/dto/response/q1;", "Companion", "$serializer", "com/yandex/go/dto/response/p1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$ZoomLayers extends q1 {
    public static final p1 Companion = new p1();
    public final Action$Payload a;

    public Action$ZoomLayers(int i, Action$Payload action$Payload) {
        if ((i & 1) == 0) {
            this.a = new Action$Payload(0);
        } else {
            this.a = action$Payload;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.ZOOM_LAYERS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Action$ZoomLayers) && jl40.l(this.a, ((Action$ZoomLayers) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ZoomLayers(payload=" + this.a + Extension.C_BRAKE;
    }

    public Action$ZoomLayers() {
        this.a = new Action$Payload(0);
    }
}
