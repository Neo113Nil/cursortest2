package com.yandex.go.taxi.order.multi.feed.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.mpx0;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w96;
import defpackage.x4e;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment;", "Lw96;", "Companion", "StateDto", "com/yandex/go/taxi/order/multi/feed/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TaxiOrderFeedStateSettingsExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(18))};
    public static final TaxiOrderFeedStateSettingsExperiment e = new TaxiOrderFeedStateSettingsExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ TaxiOrderFeedStateSettingsExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxiOrderFeedStateSettingsExperiment)) {
            return false;
        }
        TaxiOrderFeedStateSettingsExperiment taxiOrderFeedStateSettingsExperiment = (TaxiOrderFeedStateSettingsExperiment) obj;
        return this.b == taxiOrderFeedStateSettingsExperiment.b && jl40.l(this.c, taxiOrderFeedStateSettingsExperiment.c);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "TaxiOrderFeedStateSettingsExperiment(enabled=" + this.b + ", states=" + this.c + Extension.C_BRAKE;
    }

    public TaxiOrderFeedStateSettingsExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public TaxiOrderFeedStateSettingsExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment$StateDto;", "", "Companion", "State", "$serializer", "com/yandex/go/taxi/order/multi/feed/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final /* data */ class StateDto {
        public static final b Companion = new b();
        public static final i3y[] h;
        public final DriveState a;
        public final List b;
        public final State c;
        public final boolean d;
        public final int e;
        public final boolean f;
        public final boolean g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/order/multi/feed/experiments/TaxiOrderFeedStateSettingsExperiment$StateDto$State;", "", "Companion", "com/yandex/go/taxi/order/multi/feed/experiments/c", "MINIMIZED", "EXPANDED", "RAISED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class State {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ State[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final c Companion;
            public static final State EXPANDED;
            public static final State MINIMIZED;
            public static final State RAISED;

            static {
                State state = new State("MINIMIZED", 0);
                MINIMIZED = state;
                State state2 = new State("EXPANDED", 1);
                EXPANDED = state2;
                State state3 = new State("RAISED", 2);
                RAISED = state3;
                State[] stateArr = {state, state2, state3};
                $VALUES = stateArr;
                $ENTRIES = kotlin.enums.a.a(stateArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new mpx0(22));
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            h = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new mpx0(19)), kotlin.a.b(lazyThreadSafetyMode, new mpx0(20)), kotlin.a.b(lazyThreadSafetyMode, new mpx0(21)), null, null, null, null};
        }

        public /* synthetic */ StateDto(int i, DriveState driveState, List list, State state, boolean z, int i2, boolean z2, boolean z3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = driveState;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = State.EXPANDED;
            } else {
                this.c = state;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 16) == 0) {
                this.e = 0;
            } else {
                this.e = i2;
            }
            if ((i & 32) == 0) {
                this.f = true;
            } else {
                this.f = z2;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateDto)) {
                return false;
            }
            StateDto stateDto = (StateDto) obj;
            return this.a == stateDto.a && jl40.l(this.b, stateDto.b) && this.c == stateDto.c && this.d == stateDto.d && this.e == stateDto.e && this.f == stateDto.f && this.g == stateDto.g;
        }

        public final int hashCode() {
            DriveState driveState = this.a;
            int hashCode = (driveState == null ? 0 : driveState.hashCode()) * 31;
            List list = this.b;
            return Boolean.hashCode(this.g) + unr0.e(oyr.b(this.e, unr0.e((this.c.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31, 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StateDto(status=");
            sb.append(this.a);
            sb.append(", tariffs=");
            sb.append(this.b);
            sb.append(", feedState=");
            sb.append(this.c);
            sb.append(", hapticEnabled=");
            sb.append(this.d);
            sb.append(", openDelayInSeconds=");
            tse0.z(sb, this.e, ", isScrollEnabled=", this.f, ", isMultipleHeightChangeEnabled=");
            return x4e.i(sb, this.g, Extension.C_BRAKE);
        }

        public StateDto() {
            State state = State.EXPANDED;
            this.a = null;
            this.b = null;
            this.c = state;
            this.d = false;
            this.e = 0;
            this.f = true;
            this.g = false;
        }
    }
}
