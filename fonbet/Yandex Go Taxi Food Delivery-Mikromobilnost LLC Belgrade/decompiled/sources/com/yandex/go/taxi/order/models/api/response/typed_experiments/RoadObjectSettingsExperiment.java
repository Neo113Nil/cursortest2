package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.eqj0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\b\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/RoadObjectSettingsExperiment;", "Lxn11;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/i", "com/yandex/go/taxi/order/models/api/response/typed_experiments/m", "TrafficLight", "Bubble", "RoadObjectType", "com/yandex/go/taxi/order/models/api/response/typed_experiments/j", "com/yandex/go/taxi/order/models/api/response/typed_experiments/h", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoadObjectSettingsExperiment implements xn11, c6z {
    public static final h Companion = new h();
    public static final i3y[] f;
    public static final RoadObjectSettingsExperiment g;
    public final boolean b;
    public final Map c;
    public final List d;
    public final List e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/RoadObjectSettingsExperiment$RoadObjectType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/k", "UNKNOWN", "TRAFFIC_LIGHT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RoadObjectType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RoadObjectType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final k Companion;
        public static final RoadObjectType TRAFFIC_LIGHT;
        public static final RoadObjectType UNKNOWN;

        static {
            RoadObjectType roadObjectType = new RoadObjectType("UNKNOWN", 0);
            UNKNOWN = roadObjectType;
            RoadObjectType roadObjectType2 = new RoadObjectType("TRAFFIC_LIGHT", 1);
            TRAFFIC_LIGHT = roadObjectType2;
            RoadObjectType[] roadObjectTypeArr = {roadObjectType, roadObjectType2};
            $VALUES = roadObjectTypeArr;
            $ENTRIES = kotlin.enums.a.a(roadObjectTypeArr);
            Companion = new k();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(16));
        }

        public static RoadObjectType valueOf(String str) {
            return (RoadObjectType) Enum.valueOf(RoadObjectType.class, str);
        }

        public static RoadObjectType[] values() {
            return (RoadObjectType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new eqj0(12)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(13)), kotlin.a.b(lazyThreadSafetyMode, new eqj0(14))};
        g = new RoadObjectSettingsExperiment(0);
    }

    public /* synthetic */ RoadObjectSettingsExperiment(int i, List list, List list2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? kotlin.collections.b.f() : map;
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/RoadObjectSettingsExperiment$Bubble;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/typed_experiments/g", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Bubble {
        public static final g Companion = new g();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(15))};
        public final String a;
        public final int b;
        public final RoadObjectType c;

        public /* synthetic */ Bubble(int i, String str, int i2, RoadObjectType roadObjectType) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i2;
            }
            if ((i & 4) == 0) {
                this.c = RoadObjectType.UNKNOWN;
            } else {
                this.c = roadObjectType;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bubble)) {
                return false;
            }
            Bubble bubble = (Bubble) obj;
            return jl40.l(this.a, bubble.a) && this.b == bubble.b && this.c == bubble.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder u = b64.u(this.b, "Bubble(messageKey=", this.a, ", distance=", ", triggerType=");
            u.append(this.c);
            u.append(Extension.C_BRAKE);
            return u.toString();
        }

        public Bubble() {
            RoadObjectType roadObjectType = RoadObjectType.UNKNOWN;
            this.a = "";
            this.b = 0;
            this.c = roadObjectType;
        }
    }

    public RoadObjectSettingsExperiment() {
        this(0);
    }

    public RoadObjectSettingsExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/RoadObjectSettingsExperiment$TrafficLight;", "Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/i;", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/typed_experiments/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TrafficLight extends i {
        public static final l Companion = new l();
        public static final i3y[] f = {null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(17))};
        public final float a;
        public final float b;
        public final int c;
        public final String d;
        public final jsq0 e;

        public TrafficLight(int i, float f2, float f3, int i2, String str, jsq0 jsq0Var) {
            this.a = (i & 1) == 0 ? 0.0f : f2;
            if ((i & 2) == 0) {
                this.b = 30.0f;
            } else {
                this.b = f3;
            }
            if ((i & 4) == 0) {
                this.c = 0;
            } else {
                this.c = i2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str;
            }
            if ((i & 16) == 0) {
                this.e = ksq0.a;
            } else {
                this.e = jsq0Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrafficLight)) {
                return false;
            }
            TrafficLight trafficLight = (TrafficLight) obj;
            return Float.compare(this.a, trafficLight.a) == 0 && Float.compare(this.b, trafficLight.b) == 0 && this.c == trafficLight.c && jl40.l(this.d, trafficLight.d) && jl40.l(this.e, trafficLight.e);
        }

        public final int hashCode() {
            return this.e.a.hashCode() + unr0.b(oyr.b(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder k = oo31.k("TrafficLight(minZoom=", this.a, ", maxZoom=", this.b, ", maxObjects=");
            smw0.t(this.c, ", imageTag=", this.d, ", statuses=", k);
            k.append(this.e);
            k.append(Extension.C_BRAKE);
            return k.toString();
        }

        public TrafficLight() {
            jsq0 jsq0Var = ksq0.a;
            this.a = 0.0f;
            this.b = 30.0f;
            this.c = 0;
            this.d = "";
            this.e = jsq0Var;
        }
    }
}
