package com.yandex.go.taxi.order.models.api.route;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.t5z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/taxi/order/models/api/route/MapRouteAppearance$Animation", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/route/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MapRouteAppearance$Animation {
    public static final a Companion = new a();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(18)), null};
    public final MapRouteAppearance$AnimationType a;
    public final long b;

    public /* synthetic */ MapRouteAppearance$Animation(int i, MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType, long j) {
        this.a = (i & 1) == 0 ? MapRouteAppearance$AnimationType.UNKNOWN : mapRouteAppearance$AnimationType;
        if ((i & 2) == 0) {
            this.b = 0L;
        } else {
            this.b = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteAppearance$Animation)) {
            return false;
        }
        MapRouteAppearance$Animation mapRouteAppearance$Animation = (MapRouteAppearance$Animation) obj;
        return this.a == mapRouteAppearance$Animation.a && this.b == mapRouteAppearance$Animation.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Animation(type=" + this.a + ", duration=" + this.b + Extension.C_BRAKE;
    }

    public MapRouteAppearance$Animation(MapRouteAppearance$AnimationType mapRouteAppearance$AnimationType, long j) {
        this.a = mapRouteAppearance$AnimationType;
        this.b = j;
    }

    public MapRouteAppearance$Animation() {
        this(MapRouteAppearance$AnimationType.UNKNOWN, 0L);
    }
}
