package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OpenWebViewAuthActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/l", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$OpenWebViewAuthActionDto extends s {
    public static final l Companion = new l();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(6))};
    public final String a;
    public final ActionDto$WebAuthType b;

    public ActionDto$OpenWebViewAuthActionDto(int i, String str, ActionDto$WebAuthType actionDto$WebAuthType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ActionDto$WebAuthType.NO_AUTH;
        } else {
            this.b = actionDto$WebAuthType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$OpenWebViewAuthActionDto)) {
            return false;
        }
        ActionDto$OpenWebViewAuthActionDto actionDto$OpenWebViewAuthActionDto = (ActionDto$OpenWebViewAuthActionDto) obj;
        return jl40.l(this.a, actionDto$OpenWebViewAuthActionDto.a) && this.b == actionDto$OpenWebViewAuthActionDto.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenWebViewAuthActionDto(url=" + this.a + ", authType=" + this.b + Extension.C_BRAKE;
    }

    public ActionDto$OpenWebViewAuthActionDto() {
        ActionDto$WebAuthType actionDto$WebAuthType = ActionDto$WebAuthType.NO_AUTH;
        this.a = "";
        this.b = actionDto$WebAuthType;
    }
}
