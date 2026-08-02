package com.yandex.go.taxi.order.models.api.response;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jjk0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n7v;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider", "Lcom/yandex/go/taxi/order/models/api/response/a7;", "Companion", "StateInfo", "$serializer", "com/yandex/go/taxi/order/models/api/response/q5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RideCardItemDto$Slider extends a7 {
    public static final q5 Companion = new q5();
    public final String a;
    public final String b;
    public final StateInfo c;
    public final com.yandex.go.slot.dto.b2 d;

    public RideCardItemDto$Slider(int i, String str, String str2, StateInfo stateInfo, com.yandex.go.slot.dto.b2 b2Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new StateInfo(0);
        } else {
            this.c = stateInfo;
        }
        if ((i & 8) == 0) {
            this.d = com.yandex.go.slot.dto.y0.INSTANCE;
        } else {
            this.d = b2Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideCardItemDto$Slider)) {
            return false;
        }
        RideCardItemDto$Slider rideCardItemDto$Slider = (RideCardItemDto$Slider) obj;
        return jl40.l(this.a, rideCardItemDto$Slider.a) && jl40.l(this.b, rideCardItemDto$Slider.b) && jl40.l(this.c, rideCardItemDto$Slider.c) && jl40.l(this.d, rideCardItemDto$Slider.d);
    }

    @Override // com.yandex.go.taxi.order.models.api.response.a7
    /* renamed from: getId, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("Slider(id=", this.a, ", analyticsId=", this.b, ", stateInfo=");
        v.append(this.c);
        v.append(", action=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo;", "", "Companion", "State", "StateType", "$serializer", "com/yandex/go/taxi/order/models/api/response/r5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class StateInfo {
        public static final r5 Companion = new r5();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(26))};
        public final List a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo$StateType;", "", "Companion", "com/yandex/go/taxi/order/models/api/response/t5", "UNKNOWN", Card.ACTIVE, "IN_PROGRESS", "SLIDED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class StateType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ StateType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final StateType ACTIVE;
            public static final t5 Companion;
            public static final StateType IN_PROGRESS;
            public static final StateType SLIDED;
            public static final StateType UNKNOWN;

            static {
                StateType stateType = new StateType("UNKNOWN", 0);
                UNKNOWN = stateType;
                StateType stateType2 = new StateType(Card.ACTIVE, 1);
                ACTIVE = stateType2;
                StateType stateType3 = new StateType("IN_PROGRESS", 2);
                IN_PROGRESS = stateType3;
                StateType stateType4 = new StateType("SLIDED", 3);
                SLIDED = stateType4;
                StateType[] stateTypeArr = {stateType, stateType2, stateType3, stateType4};
                $VALUES = stateTypeArr;
                $ENTRIES = kotlin.enums.a.a(stateTypeArr);
                Companion = new t5();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(28));
            }

            public static StateType valueOf(String str) {
                return (StateType) Enum.valueOf(StateType.class, str);
            }

            public static StateType[] values() {
                return (StateType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ StateInfo(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateInfo) && jl40.l(this.a, ((StateInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tse0.k("StateInfo(states=", Extension.C_BRAKE, this.a);
        }

        public StateInfo(int i) {
            this.a = EmptyList.a;
        }

        public StateInfo() {
            this(0);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo$State;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/s5", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class State {
            public static final s5 Companion = new s5();
            public static final i3y[] e = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jjk0(27)), null, null, null};
            public final StateType a;
            public final FormattedText b;
            public final FormattedText c;
            public final n7v d;

            public /* synthetic */ State(int i, StateType stateType, FormattedText formattedText, FormattedText formattedText2, n7v n7vVar) {
                this.a = (i & 1) == 0 ? StateType.UNKNOWN : stateType;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = formattedText2;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = n7vVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof State)) {
                    return false;
                }
                State state = (State) obj;
                return this.a == state.a && jl40.l(this.b, state.b) && jl40.l(this.c, state.c) && jl40.l(this.d, state.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                FormattedText formattedText = this.b;
                int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
                FormattedText formattedText2 = this.c;
                int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
                n7v n7vVar = this.d;
                return hashCode3 + (n7vVar != null ? n7vVar.hashCode() : 0);
            }

            public final String toString() {
                return "State(type=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", image=" + this.d + Extension.C_BRAKE;
            }

            public State() {
                this.a = StateType.UNKNOWN;
                this.b = null;
                this.c = null;
                this.d = null;
            }
        }
    }

    public RideCardItemDto$Slider() {
        StateInfo stateInfo = new StateInfo(0);
        com.yandex.go.slot.dto.y0 y0Var = com.yandex.go.slot.dto.y0.INSTANCE;
        this.a = "";
        this.b = null;
        this.c = stateInfo;
        this.d = y0Var;
    }
}
