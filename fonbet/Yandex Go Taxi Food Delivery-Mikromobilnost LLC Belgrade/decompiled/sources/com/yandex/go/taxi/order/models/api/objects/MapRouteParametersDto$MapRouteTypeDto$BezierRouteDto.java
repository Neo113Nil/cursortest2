package com.yandex.go.taxi.order.models.api.objects;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kr00;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.uw51;
import defpackage.x4e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto", "Lcom/yandex/go/taxi/order/models/api/objects/m0;", "Companion", "BezierControlPoint", "BezierAnimation", "BezierShimmeringAnimation", "BezierAnimationType", "$serializer", "com/yandex/go/taxi/order/models/api/objects/j0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto extends m0 {
    public static final j0 Companion = new j0();
    public static final i3y[] i = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(4)), null, null};
    public final String a;
    public final float b;
    public final int c;
    public final float d;
    public final float e;
    public final List f;
    public final BezierAnimation g;
    public final BezierShimmeringAnimation h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimationType;", "", "Companion", "com/yandex/go/taxi/order/models/api/objects/f0", "EASE_BOTH", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BezierAnimationType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BezierAnimationType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f0 Companion;
        public static final BezierAnimationType EASE_BOTH;
        public static final BezierAnimationType UNKNOWN;

        static {
            BezierAnimationType bezierAnimationType = new BezierAnimationType("EASE_BOTH", 0);
            EASE_BOTH = bezierAnimationType;
            BezierAnimationType bezierAnimationType2 = new BezierAnimationType("UNKNOWN", 1);
            UNKNOWN = bezierAnimationType2;
            BezierAnimationType[] bezierAnimationTypeArr = {bezierAnimationType, bezierAnimationType2};
            $VALUES = bezierAnimationTypeArr;
            $ENTRIES = kotlin.enums.a.a(bezierAnimationTypeArr);
            Companion = new f0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(6));
        }

        public static BezierAnimationType valueOf(String str) {
            return (BezierAnimationType) Enum.valueOf(BezierAnimationType.class, str);
        }

        public static BezierAnimationType[] values() {
            return (BezierAnimationType[]) $VALUES.clone();
        }
    }

    public MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto(int i2, String str, float f, int i3, float f2, float f3, List list, BezierAnimation bezierAnimation, BezierShimmeringAnimation bezierShimmeringAnimation) {
        this.a = (i2 & 1) == 0 ? "" : str;
        if ((i2 & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f;
        }
        if ((i2 & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i2 & 8) == 0) {
            this.d = 0.0f;
        } else {
            this.d = f2;
        }
        if ((i2 & 16) == 0) {
            this.e = 0.0f;
        } else {
            this.e = f3;
        }
        if ((i2 & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = bezierAnimation;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = bezierShimmeringAnimation;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto)) {
            return false;
        }
        MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto = (MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto) obj;
        return jl40.l(this.a, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.a) && Float.compare(this.b, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.b) == 0 && this.c == mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.c && Float.compare(this.d, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.d) == 0 && Float.compare(this.e, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.e) == 0 && jl40.l(this.f, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.f) && jl40.l(this.g, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.g) && jl40.l(this.h, mapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.h);
    }

    public final int hashCode() {
        int c = unr0.c(g8e.c(this.e, g8e.c(this.d, oyr.b(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
        BezierAnimation bezierAnimation = this.g;
        int hashCode = (c + (bezierAnimation == null ? 0 : bezierAnimation.hashCode())) * 31;
        BezierShimmeringAnimation bezierShimmeringAnimation = this.h;
        return hashCode + (bezierShimmeringAnimation != null ? bezierShimmeringAnimation.hashCode() : 0);
    }

    public final String toString() {
        return "BezierRouteDto(color=" + this.a + ", width=" + this.b + ", precision=" + this.c + ", turnRadius=" + this.d + ", arcApproximation=" + this.e + ", controlPoints=" + this.f + ", animation=" + this.g + ", shimmeringAnimation=" + this.h + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation;", "", "Companion", "ShimmeringShowPolicy", "$serializer", "com/yandex/go/taxi/order/models/api/objects/h0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BezierShimmeringAnimation {
        public static final h0 Companion = new h0();
        public static final i3y[] h = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(7)), null, null, null, null, null, null};
        public final BezierAnimationType a;
        public final String b;
        public final float c;
        public final int d;
        public final float e;
        public final ShimmeringShowPolicy f;
        public final float g;

        public /* synthetic */ BezierShimmeringAnimation(int i, BezierAnimationType bezierAnimationType, String str, float f, int i2, float f2, ShimmeringShowPolicy shimmeringShowPolicy, float f3) {
            this.a = (i & 1) == 0 ? BezierAnimationType.UNKNOWN : bezierAnimationType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = 0.0f;
            } else {
                this.c = f;
            }
            if ((i & 8) == 0) {
                this.d = 0;
            } else {
                this.d = i2;
            }
            if ((i & 16) == 0) {
                this.e = 0.0f;
            } else {
                this.e = f2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = shimmeringShowPolicy;
            }
            if ((i & 64) == 0) {
                this.g = 0.0f;
            } else {
                this.g = f3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BezierShimmeringAnimation)) {
                return false;
            }
            BezierShimmeringAnimation bezierShimmeringAnimation = (BezierShimmeringAnimation) obj;
            return this.a == bezierShimmeringAnimation.a && jl40.l(this.b, bezierShimmeringAnimation.b) && Float.compare(this.c, bezierShimmeringAnimation.c) == 0 && this.d == bezierShimmeringAnimation.d && Float.compare(this.e, bezierShimmeringAnimation.e) == 0 && jl40.l(this.f, bezierShimmeringAnimation.f) && Float.compare(this.g, bezierShimmeringAnimation.g) == 0;
        }

        public final int hashCode() {
            int c = g8e.c(this.e, oyr.b(this.d, g8e.c(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
            ShimmeringShowPolicy shimmeringShowPolicy = this.f;
            return Float.hashCode(this.g) + ((c + (shimmeringShowPolicy == null ? 0 : Integer.hashCode(shimmeringShowPolicy.a))) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BezierShimmeringAnimation(type=");
            sb.append(this.a);
            sb.append(", color=");
            sb.append(this.b);
            sb.append(", delay=");
            sb.append(this.c);
            sb.append(", length=");
            sb.append(this.d);
            sb.append(", duration=");
            sb.append(this.e);
            sb.append(", showPolicy=");
            sb.append(this.f);
            sb.append(", gradientLength=");
            return uw51.i(sb, this.g, Extension.C_BRAKE);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierShimmeringAnimation$ShimmeringShowPolicy;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/i0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class ShimmeringShowPolicy {
            public static final i0 Companion = new i0();
            public final int a;

            public /* synthetic */ ShimmeringShowPolicy(int i, int i2) {
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
                return (obj instanceof ShimmeringShowPolicy) && this.a == ((ShimmeringShowPolicy) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return oyr.j(this.a, "ShimmeringShowPolicy(count=", Extension.C_BRAKE);
            }

            public ShimmeringShowPolicy() {
                this.a = 0;
            }
        }

        public BezierShimmeringAnimation() {
            this.a = BezierAnimationType.UNKNOWN;
            this.b = "";
            this.c = 0.0f;
            this.d = 0;
            this.e = 0.0f;
            this.f = null;
            this.g = 0.0f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierAnimation;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/e0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BezierAnimation {
        public static final e0 Companion = new e0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kr00(5)), null};
        public final BezierAnimationType a;
        public final float b;

        public /* synthetic */ BezierAnimation(int i, BezierAnimationType bezierAnimationType, float f) {
            this.a = (i & 1) == 0 ? BezierAnimationType.UNKNOWN : bezierAnimationType;
            if ((i & 2) == 0) {
                this.b = 0.0f;
            } else {
                this.b = f;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BezierAnimation)) {
                return false;
            }
            BezierAnimation bezierAnimation = (BezierAnimation) obj;
            return this.a == bezierAnimation.a && Float.compare(this.b, bezierAnimation.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BezierAnimation(type=" + this.a + ", duration=" + this.b + Extension.C_BRAKE;
        }

        public BezierAnimation() {
            this.a = BezierAnimationType.UNKNOWN;
            this.b = 0.0f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/objects/MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierControlPoint;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/objects/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class BezierControlPoint {
        public static final g0 Companion = new g0();
        public final float a;
        public final float b;

        public /* synthetic */ BezierControlPoint(int i, float f, float f2) {
            if ((i & 1) == 0) {
                this.a = 0.0f;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = 0.0f;
            } else {
                this.b = f2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BezierControlPoint)) {
                return false;
            }
            BezierControlPoint bezierControlPoint = (BezierControlPoint) obj;
            return Float.compare(this.a, bezierControlPoint.a) == 0 && Float.compare(this.b, bezierControlPoint.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return x4e.e("BezierControlPoint(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
        }

        public BezierControlPoint() {
            this.a = 0.0f;
            this.b = 0.0f;
        }
    }

    public MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto() {
        this.a = "";
        this.b = 0.0f;
        this.c = 0;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = EmptyList.a;
        this.g = null;
        this.h = null;
    }
}
