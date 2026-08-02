package com.yandex.go.flex.common.api.actions;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.uiv0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "State", "Destination", "$serializer", "com/yandex/go/flex/common/api/actions/n0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SummaryRedirectAction extends n {
    public static final n0 Companion = new n0();
    public static final i3y[] i = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(19)), null, null, null, null};
    public final String b;
    public final String c;
    public final State d;
    public final boolean e;
    public final Destination f;
    public final kotlinx.serialization.json.b g;
    public final boolean h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction$State;", "", "Collapsed", "Expanded", "Anchored", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State Anchored;
        public static final State Collapsed;
        public static final State Expanded;

        static {
            State state = new State("Collapsed", 0);
            Collapsed = state;
            State state2 = new State("Expanded", 1);
            Expanded = state2;
            State state3 = new State("Anchored", 2);
            Anchored = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = kotlin.enums.a.a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SummaryRedirectAction(int i2, String str, String str2, State state, boolean z, Destination destination, kotlinx.serialization.json.b bVar, boolean z2) {
        if ((i2 & 1) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i2 & 2) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i2 & 4) == 0) {
            this.d = State.Collapsed;
        } else {
            this.d = state;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = destination;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = bVar;
        }
        if ((i2 & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryRedirectAction)) {
            return false;
        }
        SummaryRedirectAction summaryRedirectAction = (SummaryRedirectAction) obj;
        return jl40.l(this.b, summaryRedirectAction.b) && jl40.l(this.c, summaryRedirectAction.c) && this.d == summaryRedirectAction.d && this.e == summaryRedirectAction.e && jl40.l(this.f, summaryRedirectAction.f) && jl40.l(this.g, summaryRedirectAction.g) && this.h == summaryRedirectAction.h;
    }

    public final int hashCode() {
        int e = unr0.e((this.d.hashCode() + unr0.b(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        Destination destination = this.f;
        int hashCode = (e + (destination == null ? 0 : destination.hashCode())) * 31;
        kotlinx.serialization.json.b bVar = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SummaryRedirectAction(tariffClass=", this.b, ", vertical=", this.c, ", state=");
        v.append(this.d);
        v.append(", verticalTrap=");
        v.append(this.e);
        v.append(", destination=");
        v.append(this.f);
        v.append(", summaryContext=");
        v.append(this.g);
        v.append(", maybeWaitForRoutestats=");
        return x4e.i(v, this.h, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/SummaryRedirectAction$Destination;", "", "Companion", "$serializer", "com/yandex/go/flex/common/api/actions/o0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final /* data */ class Destination {
        public static final o0 Companion = new o0();
        public final GeoPoint a;
        public final String b;
        public final String c;

        public /* synthetic */ Destination(int i, GeoPoint geoPoint, String str, String str2) {
            this.a = (i & 1) == 0 ? new GeoPoint(0) : geoPoint;
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
        public final GeoPoint getA() {
            return this.a;
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

        public Destination() {
            this.a = new GeoPoint(0);
            this.b = "";
            this.c = "";
        }
    }

    public SummaryRedirectAction() {
        State state = State.Collapsed;
        this.b = "";
        this.c = "";
        this.d = state;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = false;
    }
}
