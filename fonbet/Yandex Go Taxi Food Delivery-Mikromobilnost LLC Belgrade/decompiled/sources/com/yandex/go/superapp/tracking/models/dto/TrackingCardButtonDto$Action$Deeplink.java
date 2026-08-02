package com.yandex.go.superapp.tracking.models.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.l301;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/tracking/models/dto/TrackingCardButtonDto$Action$Deeplink", "Ll301;", "Companion", "$serializer", "com/yandex/go/superapp/tracking/models/dto/f", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TrackingCardButtonDto$Action$Deeplink implements l301 {
    public static final f Companion = new f();
    public final String a;

    public /* synthetic */ TrackingCardButtonDto$Action$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingCardButtonDto$Action$Deeplink) && jl40.l(this.a, ((TrackingCardButtonDto$Action$Deeplink) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }

    public TrackingCardButtonDto$Action$Deeplink() {
        this.a = null;
    }
}
