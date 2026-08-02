package com.yandex.go.taxi.order.models.api.response.status;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.sjk0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/status/RideCardStatusProperties;", "", "Companion", "Effect", "$serializer", "com/yandex/go/taxi/order/models/api/response/status/a", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardStatusProperties {
    public static final a Companion = new a();
    public final String a;
    public final Effect b;

    public /* synthetic */ RideCardStatusProperties(int i, String str, Effect effect) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = effect;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardStatusProperties)) {
            return false;
        }
        RideCardStatusProperties rideCardStatusProperties = (RideCardStatusProperties) obj;
        return jl40.l(this.a, rideCardStatusProperties.a) && jl40.l(this.b, rideCardStatusProperties.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Effect effect = this.b;
        return hashCode + (effect != null ? effect.hashCode() : 0);
    }

    public final String toString() {
        return "RideCardStatusProperties(backgroundColor=" + this.a + ", effect=" + this.b + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/status/RideCardStatusProperties$Effect;", "", "Companion", "Type", "$serializer", "com/yandex/go/taxi/order/models/api/response/status/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Effect {
        public static final b Companion = new b();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(24))};
        public final Type a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/status/RideCardStatusProperties$Effect$Type;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/status/c", "SHIMMERING", "UNSUPPORTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final Type SHIMMERING;
            public static final Type UNSUPPORTED;

            static {
                Type type = new Type("SHIMMERING", 0);
                SHIMMERING = type;
                Type type2 = new Type("UNSUPPORTED", 1);
                UNSUPPORTED = type2;
                Type[] typeArr = {type, type2};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sjk0(25));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Effect(int i, Type type) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Effect) && this.a == ((Effect) obj).a;
        }

        public final int hashCode() {
            Type type = this.a;
            if (type == null) {
                return 0;
            }
            return type.hashCode();
        }

        public final String toString() {
            return "Effect(type=" + this.a + Extension.C_BRAKE;
        }

        public Effect() {
            this.a = null;
        }
    }

    public RideCardStatusProperties() {
        this.a = null;
        this.b = null;
    }
}
