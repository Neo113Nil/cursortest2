package com.yandex.go.dto.response;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jn;
import defpackage.k4o;
import defpackage.lq;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/dto/response/Action$SummaryRedirect", "Lcom/yandex/go/dto/response/q1;", "Companion", "State", "Destination", "$serializer", "com/yandex/go/dto/response/e1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$SummaryRedirect extends q1 {
    public static final e1 Companion = new e1();
    public static final i3y[] h = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(29)), null, null, null, null};
    public final String a;
    public final String b;
    public final State c;
    public final boolean d;
    public final Destination e;
    public final kotlinx.serialization.json.b f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/dto/response/Action$SummaryRedirect$State;", "", "Companion", "com/yandex/go/dto/response/g1", "COLLAPSED", "EXPANDED", "ANCHORED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final State ANCHORED;
        public static final State COLLAPSED;
        public static final g1 Companion;
        public static final State EXPANDED;

        static {
            State state = new State("COLLAPSED", 0);
            COLLAPSED = state;
            State state2 = new State("EXPANDED", 1);
            EXPANDED = state2;
            State state3 = new State("ANCHORED", 2);
            ANCHORED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
            Companion = new g1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(6));
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Action$SummaryRedirect(int i, String str, String str2, State state, boolean z, Destination destination, kotlinx.serialization.json.b bVar, boolean z2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = State.COLLAPSED;
        } else {
            this.c = state;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = destination;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bVar;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.TAXI_SUMMARY_REDIRECT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$SummaryRedirect)) {
            return false;
        }
        Action$SummaryRedirect action$SummaryRedirect = (Action$SummaryRedirect) obj;
        return jl40.l(this.a, action$SummaryRedirect.a) && jl40.l(this.b, action$SummaryRedirect.b) && this.c == action$SummaryRedirect.c && this.d == action$SummaryRedirect.d && jl40.l(this.e, action$SummaryRedirect.e) && jl40.l(this.f, action$SummaryRedirect.f) && this.g == action$SummaryRedirect.g;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Destination destination = this.e;
        int hashCode = (e + (destination == null ? 0 : destination.hashCode())) * 31;
        kotlinx.serialization.json.b bVar = this.f;
        return Boolean.hashCode(this.g) + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SummaryRedirect(tariffClass=", this.a, ", verticalId=", this.b, ", state=");
        v.append(this.c);
        v.append(", isVerticalTrap=");
        v.append(this.d);
        v.append(", destination=");
        v.append(this.e);
        v.append(", summaryContext=");
        v.append(this.f);
        v.append(", maybeWaitForRouteStats=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/dto/response/Action$SummaryRedirect$Destination;", "", "Companion", "$serializer", "com/yandex/go/dto/response/f1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class Destination {
        public static final f1 Companion = new f1();
        public final zzs a;
        public final String b;
        public final String c;

        public /* synthetic */ Destination(int i, zzs zzsVar, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = new zzs(0.0d, 0.0d, 0, null, null, 24);
            } else {
                this.a = zzsVar;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final zzs getA() {
            return this.a;
        }

        /* renamed from: c, reason: from getter */
        public final String getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Destination)) {
                return false;
            }
            Destination destination = (Destination) obj;
            return jl40.l(this.a, destination.a) && jl40.l(this.b, destination.b) && jl40.l(this.c, destination.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Destination(position=");
            sb.append(this.a);
            sb.append(", log=");
            sb.append(this.b);
            sb.append(", uri=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public Destination(zzs zzsVar, String str, String str2) {
            this.a = zzsVar;
            this.b = str;
            this.c = str2;
        }

        public Destination() {
            this(new zzs(0.0d, 0.0d, 0, null, null, 24), "", "");
        }
    }

    public Action$SummaryRedirect(String str, String str2, State state, boolean z, Destination destination, kotlinx.serialization.json.b bVar, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = state;
        this.d = z;
        this.e = destination;
        this.f = bVar;
        this.g = z2;
    }

    public Action$SummaryRedirect() {
        this("", "", State.COLLAPSED, false, null, null, false);
    }
}
