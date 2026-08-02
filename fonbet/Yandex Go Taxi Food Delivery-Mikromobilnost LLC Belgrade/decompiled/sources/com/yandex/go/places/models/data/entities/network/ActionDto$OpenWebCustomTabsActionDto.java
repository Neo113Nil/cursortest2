package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/places/models/data/entities/network/ActionDto$OpenWebCustomTabsActionDto", "Lcom/yandex/go/places/models/data/entities/network/s;", "Companion", "$serializer", "com/yandex/go/places/models/data/entities/network/j", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActionDto$OpenWebCustomTabsActionDto extends s {
    public static final j Companion = new j();
    public final String a;
    public final boolean b;

    public ActionDto$OpenWebCustomTabsActionDto(int i, String str, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionDto$OpenWebCustomTabsActionDto)) {
            return false;
        }
        ActionDto$OpenWebCustomTabsActionDto actionDto$OpenWebCustomTabsActionDto = (ActionDto$OpenWebCustomTabsActionDto) obj;
        return jl40.l(this.a, actionDto$OpenWebCustomTabsActionDto.a) && this.b == actionDto$OpenWebCustomTabsActionDto.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OpenWebCustomTabsActionDto(url=", this.a, ", wrapAuthUrl=", this.b, Extension.C_BRAKE);
    }

    public ActionDto$OpenWebCustomTabsActionDto() {
        this.a = "";
        this.b = false;
    }
}
