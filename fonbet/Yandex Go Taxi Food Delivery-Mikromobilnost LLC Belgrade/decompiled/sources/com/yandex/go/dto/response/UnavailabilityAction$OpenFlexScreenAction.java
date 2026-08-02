package com.yandex.go.dto.response;

import defpackage.gn11;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/UnavailabilityAction$OpenFlexScreenAction", "Lcom/yandex/go/dto/response/d2;", "Companion", "$serializer", "com/yandex/go/dto/response/y1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnavailabilityAction$OpenFlexScreenAction extends d2 {
    public static final y1 Companion = new y1();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gn11(10))};
    public final String a;
    public final FlexScreenType b;

    public UnavailabilityAction$OpenFlexScreenAction(int i, String str, FlexScreenType flexScreenType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = flexScreenType;
        }
    }

    @Override // com.yandex.go.dto.response.d2
    public final UnavailabilityActionType a() {
        return UnavailabilityActionType.OPEN_FLEX_SCREEN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnavailabilityAction$OpenFlexScreenAction)) {
            return false;
        }
        UnavailabilityAction$OpenFlexScreenAction unavailabilityAction$OpenFlexScreenAction = (UnavailabilityAction$OpenFlexScreenAction) obj;
        return jl40.l(this.a, unavailabilityAction$OpenFlexScreenAction.a) && this.b == unavailabilityAction$OpenFlexScreenAction.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        FlexScreenType flexScreenType = this.b;
        return hashCode + (flexScreenType == null ? 0 : flexScreenType.hashCode());
    }

    public final String toString() {
        return "OpenFlexScreenAction(endpointPath=" + this.a + ", flexScreenType=" + this.b + Extension.C_BRAKE;
    }

    public UnavailabilityAction$OpenFlexScreenAction() {
        this.a = "";
        this.b = null;
    }
}
