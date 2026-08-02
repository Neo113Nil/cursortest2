package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/dto/response/UnavailabilityAction$Deeplink", "Lcom/yandex/go/dto/response/d2;", "Companion", "$serializer", "com/yandex/go/dto/response/w1", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UnavailabilityAction$Deeplink extends d2 {
    public static final w1 Companion = new w1();
    public final String a;

    public UnavailabilityAction$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // com.yandex.go.dto.response.d2
    public final UnavailabilityActionType a() {
        return UnavailabilityActionType.DEEPLINK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnavailabilityAction$Deeplink) && jl40.l(this.a, ((UnavailabilityAction$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }

    public UnavailabilityAction$Deeplink() {
        this.a = "";
    }
}
