package com.yandex.go.navigator.navigation;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/navigator/navigation/NavigatorDeeplinkInteractor$DeeplinkRouteStopDto", "", "Companion", "$serializer", "com/yandex/go/navigator/navigation/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NavigatorDeeplinkInteractor$DeeplinkRouteStopDto {
    public static final a Companion = new a();
    public final double a;
    public final double b;
    public final String c;

    public /* synthetic */ NavigatorDeeplinkInteractor$DeeplinkRouteStopDto(double d, double d2, int i, String str) {
        if ((i & 1) == 0) {
            this.a = 0.0d;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = 0.0d;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigatorDeeplinkInteractor$DeeplinkRouteStopDto)) {
            return false;
        }
        NavigatorDeeplinkInteractor$DeeplinkRouteStopDto navigatorDeeplinkInteractor$DeeplinkRouteStopDto = (NavigatorDeeplinkInteractor$DeeplinkRouteStopDto) obj;
        return Double.compare(this.a, navigatorDeeplinkInteractor$DeeplinkRouteStopDto.a) == 0 && Double.compare(this.b, navigatorDeeplinkInteractor$DeeplinkRouteStopDto.b) == 0 && jl40.l(this.c, navigatorDeeplinkInteractor$DeeplinkRouteStopDto.c);
    }

    public final int hashCode() {
        int a = unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "DeeplinkRouteStopDto(lat=", ", lon=");
        u.append(this.b);
        u.append(", addressName=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public NavigatorDeeplinkInteractor$DeeplinkRouteStopDto() {
        this.a = 0.0d;
        this.b = 0.0d;
        this.c = null;
    }
}
