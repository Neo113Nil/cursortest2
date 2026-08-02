package com.yandex.go.taxi.order.models.api.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.n7v;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Lcom/yandex/go/taxi/order/models/api/response/n5;", "Companion", "RatingItemDecorationState", "DecorationStateType", "$serializer", "com/yandex/go/taxi/order/models/api/response/o4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$CoherentRatingSelector extends a7 implements n5 {
    public static final o4 Companion = new o4();
    public static final i3y[] h;
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final com.yandex.go.slot.dto.b2 e;
    public final n7v f;
    public final List g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector$DecorationStateType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/p4", "UNKNOWN", "SELECTED", "UNSELECTED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DecorationStateType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DecorationStateType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final p4 Companion;
        public static final DecorationStateType SELECTED;
        public static final DecorationStateType UNKNOWN;
        public static final DecorationStateType UNSELECTED;

        static {
            DecorationStateType decorationStateType = new DecorationStateType("UNKNOWN", 0);
            UNKNOWN = decorationStateType;
            DecorationStateType decorationStateType2 = new DecorationStateType("SELECTED", 1);
            SELECTED = decorationStateType2;
            DecorationStateType decorationStateType3 = new DecorationStateType("UNSELECTED", 2);
            UNSELECTED = decorationStateType3;
            DecorationStateType[] decorationStateTypeArr = {decorationStateType, decorationStateType2, decorationStateType3};
            $VALUES = decorationStateTypeArr;
            $ENTRIES = kotlin.enums.a.a(decorationStateTypeArr);
            Companion = new p4();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(15));
        }

        public static DecorationStateType valueOf(String str) {
            return (DecorationStateType) Enum.valueOf(DecorationStateType.class, str);
        }

        public static DecorationStateType[] values() {
            return (DecorationStateType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(12)), kotlin.a.b(lazyThreadSafetyMode, new jjk0(13)), null, null, kotlin.a.b(lazyThreadSafetyMode, new jjk0(14))};
    }

    public RideCardItemDto$CoherentRatingSelector(int i, String str, String str2, List list, List list2, com.yandex.go.slot.dto.b2 b2Var, n7v n7vVar, List list3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = com.yandex.go.slot.dto.m0.INSTANCE;
        } else {
            this.e = b2Var;
        }
        if ((i & 32) == 0) {
            this.f = n7v.f;
        } else {
            this.f = n7vVar;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list3;
        }
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: c, reason: from getter */
    public final n7v getF() {
        return this.f;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: e, reason: from getter */
    public final List getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$CoherentRatingSelector)) {
            return false;
        }
        RideCardItemDto$CoherentRatingSelector rideCardItemDto$CoherentRatingSelector = (RideCardItemDto$CoherentRatingSelector) obj;
        return jl40.l(this.a, rideCardItemDto$CoherentRatingSelector.a) && jl40.l(this.b, rideCardItemDto$CoherentRatingSelector.b) && jl40.l(this.c, rideCardItemDto$CoherentRatingSelector.c) && jl40.l(this.d, rideCardItemDto$CoherentRatingSelector.d) && jl40.l(this.e, rideCardItemDto$CoherentRatingSelector.e) && jl40.l(this.f, rideCardItemDto$CoherentRatingSelector.f) && jl40.l(this.g, rideCardItemDto$CoherentRatingSelector.g);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.n5
    /* renamed from: getAction, reason: from getter */
    public final com.yandex.go.slot.dto.b2 getE() {
        return this.e;
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.c(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CoherentRatingSelector(id=", this.a, ", analyticsId=", this.b, ", titles=");
        nnm.w(v, this.c, ", subtitles=", this.d, ", action=");
        v.append(this.e);
        v.append(", backgroundGlowImage=");
        v.append(this.f);
        v.append(", ratingItemsDecorationStates=");
        return ly3.s(v, this.g, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/q4", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class RatingItemDecorationState {
        public static final q4 Companion = new q4();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(16)), null, null};
        public final DecorationStateType a;
        public final n7v b;
        public final String c;

        public /* synthetic */ RatingItemDecorationState(int i, DecorationStateType decorationStateType, n7v n7vVar, String str) {
            this.a = (i & 1) == 0 ? DecorationStateType.UNKNOWN : decorationStateType;
            if ((i & 2) == 0) {
                this.b = n7v.f;
            } else {
                this.b = n7vVar;
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
            if (!(obj instanceof RatingItemDecorationState)) {
                return false;
            }
            RatingItemDecorationState ratingItemDecorationState = (RatingItemDecorationState) obj;
            return this.a == ratingItemDecorationState.a && jl40.l(this.b, ratingItemDecorationState.b) && jl40.l(this.c, ratingItemDecorationState.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RatingItemDecorationState(type=");
            sb.append(this.a);
            sb.append(", image=");
            sb.append(this.b);
            sb.append(", mainColor=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public RatingItemDecorationState() {
            DecorationStateType decorationStateType = DecorationStateType.UNKNOWN;
            n7v n7vVar = n7v.f;
            this.a = decorationStateType;
            this.b = n7vVar;
            this.c = null;
        }
    }

    public RideCardItemDto$CoherentRatingSelector() {
        com.yandex.go.slot.dto.m0 m0Var = com.yandex.go.slot.dto.m0.INSTANCE;
        n7v n7vVar = n7v.f;
        this.a = "";
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = m0Var;
        this.f = n7vVar;
        this.g = emptyList;
    }
}
