package com.yandex.go.shortcuts.dto.request;

import com.yandex.go.shortcuts.models.RouteType;
import com.yandex.go.shortcuts.models.RouteUserContext;
import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/RouteEtaParam;", "", "Companion", "Route", "$serializer", "com/yandex/go/shortcuts/dto/request/o", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RouteEtaParam {
    public static final o Companion = new o();
    public static final i3y[] c;
    public final RouteUserContext a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new apk0(10)), kotlin.a.b(lazyThreadSafetyMode, new apk0(11))};
    }

    public /* synthetic */ RouteEtaParam(int i, RouteUserContext routeUserContext, List list) {
        this.a = (i & 1) == 0 ? RouteUserContext.Shortcuts : routeUserContext;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteEtaParam)) {
            return false;
        }
        RouteEtaParam routeEtaParam = (RouteEtaParam) obj;
        return this.a == routeEtaParam.a && jl40.l(this.b, routeEtaParam.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteEtaParam(context=" + this.a + ", routes=" + this.b + Extension.C_BRAKE;
    }

    public RouteEtaParam(RouteUserContext routeUserContext, List list) {
        this.a = routeUserContext;
        this.b = list;
    }

    public RouteEtaParam() {
        this(RouteUserContext.Shortcuts, EmptyList.a);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/RouteEtaParam$Route;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/request/p", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final /* data */ class Route {
        public static final p Companion = new p();
        public static final i3y[] d;
        public final List a;
        public final String b;
        public final RouteType c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new apk0(12)), null, kotlin.a.b(lazyThreadSafetyMode, new apk0(13))};
        }

        public /* synthetic */ Route(int i, List list, String str, RouteType routeType) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = RouteType.Auto;
            } else {
                this.c = routeType;
            }
        }

        public static final /* synthetic */ void b(Route route, yjd yjdVar, SerialDescriptor serialDescriptor) {
            boolean F = yjdVar.F();
            i3y[] i3yVarArr = d;
            if (F || !jl40.l(route.a, EmptyList.a)) {
                yjdVar.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), route.a);
            }
            if (yjdVar.F() || !jl40.l(route.b, "")) {
                yjdVar.o(serialDescriptor, 1, route.b);
            }
            if (!yjdVar.F() && route.c == RouteType.Auto) {
                return;
            }
            yjdVar.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), route.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Route)) {
                return false;
            }
            Route route = (Route) obj;
            return jl40.l(this.a, route.a) && jl40.l(this.b, route.b) && this.c == route.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder s = xvz.s("Route(route=", this.a, ", id=", this.b, ", type=");
            s.append(this.c);
            s.append(Extension.C_BRAKE);
            return s.toString();
        }

        public Route() {
            this(null, null, 7);
        }

        public Route(List list, String str, int i) {
            list = (i & 1) != 0 ? EmptyList.a : list;
            str = (i & 2) != 0 ? "" : str;
            RouteType routeType = RouteType.Auto;
            this.a = list;
            this.b = str;
            this.c = routeType;
        }
    }
}
