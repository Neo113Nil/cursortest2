package com.yandex.go.places.models.data.entities.network;

import defpackage.du;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OpenNavigatorActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/g", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$OpenNavigatorActionDto extends s {
    public static final g Companion = new g();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new du(3))};
    public final String a;
    public final ActionDto$OpenNavigatorActionSubtypeDto b;

    public ActionDto$OpenNavigatorActionDto(int i, String str, ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ActionDto$OpenNavigatorActionSubtypeDto.GO_TO_ACTION;
        } else {
            this.b = actionDto$OpenNavigatorActionSubtypeDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$OpenNavigatorActionDto)) {
            return false;
        }
        ActionDto$OpenNavigatorActionDto actionDto$OpenNavigatorActionDto = (ActionDto$OpenNavigatorActionDto) obj;
        return jl40.l(this.a, actionDto$OpenNavigatorActionDto.a) && this.b == actionDto$OpenNavigatorActionDto.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenNavigatorActionDto(fallbackDeeplink=" + this.a + ", actionSubtypeDto=" + this.b + Extension.C_BRAKE;
    }

    public ActionDto$OpenNavigatorActionDto() {
        ActionDto$OpenNavigatorActionSubtypeDto actionDto$OpenNavigatorActionSubtypeDto = ActionDto$OpenNavigatorActionSubtypeDto.GO_TO_ACTION;
        this.a = "";
        this.b = actionDto$OpenNavigatorActionSubtypeDto;
    }
}
