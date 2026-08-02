package com.yandex.go.shortcuts.dto.response;

import defpackage.apk0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.yjd;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RouteEtaResponse;", "", "Companion", "Route", "$serializer", "com/yandex/go/shortcuts/dto/response/c2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RouteEtaResponse {
    public static final c2 Companion = new c2();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new apk0(14))};
    public final List a;

    public /* synthetic */ RouteEtaResponse(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public static final /* synthetic */ void b(RouteEtaResponse routeEtaResponse, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (!yjdVar.F() && jl40.l(routeEtaResponse.a, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 0, (KSerializer) b[0].getValue(), routeEtaResponse.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RouteEtaResponse) && jl40.l(this.a, ((RouteEtaResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("RouteEtaResponse(routes=", Extension.C_BRAKE, this.a);
    }

    public RouteEtaResponse() {
        this.a = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RouteEtaResponse$Route;", "", "Companion", "Eta", "$serializer", "com/yandex/go/shortcuts/dto/response/d2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Route {
        public static final d2 Companion = new d2();
        public final String a;
        public final Eta b;

        public /* synthetic */ Route(int i, String str, Eta eta) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = new Eta(0);
            } else {
                this.b = eta;
            }
        }

        public static final /* synthetic */ void a(Route route, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(route.a, "")) {
                yjdVar.o(serialDescriptor, 0, route.a);
            }
            if (!yjdVar.F() && jl40.l(route.b, new Eta(0))) {
                return;
            }
            yjdVar.e(serialDescriptor, 1, RouteEtaResponse$Route$Eta$$serializer.INSTANCE, route.b);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Route)) {
                return false;
            }
            Route route = (Route) obj;
            return jl40.l(this.a, route.a) && jl40.l(this.b, route.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Route(id=" + this.a + ", eta=" + this.b + Extension.C_BRAKE;
        }

        public Route() {
            Eta eta = new Eta(0);
            this.a = "";
            this.b = eta;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/dto/response/RouteEtaResponse$Route$Eta;", "", "Companion", "$serializer", "com/yandex/go/shortcuts/dto/response/e2", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class Eta {
            public static final e2 Companion = new e2();
            public final long a;
            public final long b;
            public final String c;

            public /* synthetic */ Eta(long j, long j2, String str, int i) {
                if ((i & 1) == 0) {
                    this.a = 0L;
                } else {
                    this.a = j;
                }
                if ((i & 2) == 0) {
                    this.b = 0L;
                } else {
                    this.b = j2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str;
                }
            }

            public static final /* synthetic */ void a(Eta eta, yjd yjdVar, SerialDescriptor serialDescriptor) {
                if (yjdVar.F() || eta.a != 0) {
                    yjdVar.s(serialDescriptor, 0, eta.a);
                }
                if (yjdVar.F() || eta.b != 0) {
                    yjdVar.s(serialDescriptor, 1, eta.b);
                }
                if (!yjdVar.F() && jl40.l(eta.c, "")) {
                    return;
                }
                yjdVar.o(serialDescriptor, 2, eta.c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Eta)) {
                    return false;
                }
                Eta eta = (Eta) obj;
                return this.a == eta.a && this.b == eta.b && jl40.l(this.c, eta.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder w = unr0.w(this.a, "Eta(distance=", ", time=");
                uw51.v(this.b, ", display=", this.c, w);
                w.append(Extension.C_BRAKE);
                return w.toString();
            }

            public Eta(int i) {
                this.a = 0L;
                this.b = 0L;
                this.c = "";
            }

            public Eta() {
                this(0);
            }
        }
    }
}
