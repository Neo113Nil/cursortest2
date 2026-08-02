package com.yandex.go.chargers.feedback.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/chargers/feedback/data/ChargersFeedbackScreenBannerActionDto$Deeplink", "Lcom/yandex/go/chargers/feedback/data/j;", "Companion", "$serializer", "com/yandex/go/chargers/feedback/data/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersFeedbackScreenBannerActionDto$Deeplink extends j {
    public static final f Companion = new f();
    public final String a;

    public ChargersFeedbackScreenBannerActionDto$Deeplink(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargersFeedbackScreenBannerActionDto$Deeplink) && jl40.l(this.a, ((ChargersFeedbackScreenBannerActionDto$Deeplink) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(url=", this.a, Extension.C_BRAKE);
    }

    public ChargersFeedbackScreenBannerActionDto$Deeplink() {
        this.a = "";
    }
}
