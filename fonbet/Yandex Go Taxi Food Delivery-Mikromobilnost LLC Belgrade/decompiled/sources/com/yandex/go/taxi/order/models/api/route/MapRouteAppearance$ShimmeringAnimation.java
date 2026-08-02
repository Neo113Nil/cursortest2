package com.yandex.go.taxi.order.models.api.route;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kr00;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance$ShimmeringAnimation", "", "Companion", "ShowPolicy", "$serializer", "com/yandex/go/taxi/order/models/api/route/c", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MapRouteAppearance$ShimmeringAnimation {
    public static final c Companion = new c();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(0)), null, null, null, null};
    public final long a;
    public final long b;
    public final MapRouteAppearance$AnimationType c;
    public final String d;
    public final float e;
    public final int f;
    public final ShowPolicy g;

    public /* synthetic */ MapRouteAppearance$ShimmeringAnimation(int i, long j, long j2, MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType, String str, float f, int i2, ShowPolicy showPolicy) {
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
            this.c = MapRouteAppearance$AnimationType.UNKNOWN;
        } else {
            this.c = mapRouteAppearance$AnimationType;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = 0.0f;
        } else {
            this.e = f;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = showPolicy;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteAppearance$ShimmeringAnimation)) {
            return false;
        }
        MapRouteAppearance$ShimmeringAnimation mapRouteAppearance$ShimmeringAnimation = (MapRouteAppearance$ShimmeringAnimation) obj;
        return this.a == mapRouteAppearance$ShimmeringAnimation.a && this.b == mapRouteAppearance$ShimmeringAnimation.b && this.c == mapRouteAppearance$ShimmeringAnimation.c && jl40.l(this.d, mapRouteAppearance$ShimmeringAnimation.d) && Float.compare(this.e, mapRouteAppearance$ShimmeringAnimation.e) == 0 && this.f == mapRouteAppearance$ShimmeringAnimation.f && jl40.l(this.g, mapRouteAppearance$ShimmeringAnimation.g);
    }

    public final int hashCode() {
        int b = oyr.b(this.f, g8e.c(this.e, unr0.b((this.c.hashCode() + qv10.c(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31), 31);
        ShowPolicy showPolicy = this.g;
        return b + (showPolicy == null ? 0 : showPolicy.hashCode());
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "ShimmeringAnimation(delay=", ", duration=");
        w.append(this.b);
        w.append(", type=");
        w.append(this.c);
        w.append(", color=");
        w.append(this.d);
        w.append(", gradientLength=");
        w.append(this.e);
        w.append(", length=");
        w.append(this.f);
        w.append(", showPolicy=");
        w.append(this.g);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/route/MapRouteAppearance$ShimmeringAnimation$ShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/route/d", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class ShowPolicy {
        public static final d Companion = new d();
        public final int a;

        public /* synthetic */ ShowPolicy(int i, int i2) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPolicy) && this.a == ((ShowPolicy) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return oyr.j(this.a, "ShowPolicy(count=", Extension.C_BRAKE);
        }

        public ShowPolicy(int i) {
            this.a = i;
        }

        public ShowPolicy() {
            this(0);
        }
    }

    public MapRouteAppearance$ShimmeringAnimation(long j, long j2, MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType, String str, float f, int i, ShowPolicy showPolicy) {
        this.a = j;
        this.b = j2;
        this.c = mapRouteAppearance$AnimationType;
        this.d = str;
        this.e = f;
        this.f = i;
        this.g = showPolicy;
    }

    public MapRouteAppearance$ShimmeringAnimation() {
        this(0L, 0L, MapRouteAppearance$AnimationType.UNKNOWN, "", 0.0f, 0, null);
    }
}
