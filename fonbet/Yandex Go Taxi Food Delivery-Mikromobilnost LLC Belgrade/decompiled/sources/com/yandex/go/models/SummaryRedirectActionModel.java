package com.yandex.go.models;

import com.yandex.go.address.models.Address;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.ynv0;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class SummaryRedirectActionModel {
    public final String a;
    public final String b;
    public final State c;
    public final boolean d;
    public final a e;
    public final kotlinx.serialization.json.b f;
    public final boolean g;
    public final ynv0 h;
    public final List i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/models/SummaryRedirectActionModel$State;", "", "COLLAPSED", "EXPANDED", "ANCHORED", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ANCHORED;
        public static final State COLLAPSED;
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
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public SummaryRedirectActionModel(String str, String str2, State state, boolean z, a aVar, kotlinx.serialization.json.b bVar, boolean z2, ynv0 ynv0Var, List list, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        state = (i & 4) != 0 ? State.COLLAPSED : state;
        z = (i & 8) != 0 ? false : z;
        aVar = (i & 16) != 0 ? null : aVar;
        bVar = (i & 32) != 0 ? null : bVar;
        z2 = (i & 64) != 0 ? false : z2;
        ynv0Var = (i & 128) != 0 ? null : ynv0Var;
        list = (i & 256) != 0 ? EmptyList.a : list;
        this.a = str;
        this.b = str2;
        this.c = state;
        this.d = z;
        this.e = aVar;
        this.f = bVar;
        this.g = z2;
        this.h = ynv0Var;
        this.i = list;
    }

    public final a a() {
        return this.e;
    }

    public final ynv0 b() {
        return this.h;
    }

    public final State c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryRedirectActionModel)) {
            return false;
        }
        SummaryRedirectActionModel summaryRedirectActionModel = (SummaryRedirectActionModel) obj;
        return jl40.l(this.a, summaryRedirectActionModel.a) && jl40.l(this.b, summaryRedirectActionModel.b) && this.c == summaryRedirectActionModel.c && this.d == summaryRedirectActionModel.d && jl40.l(this.e, summaryRedirectActionModel.e) && jl40.l(this.f, summaryRedirectActionModel.f) && this.g == summaryRedirectActionModel.g && jl40.l(this.h, summaryRedirectActionModel.h) && jl40.l(this.i, summaryRedirectActionModel.i);
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        a aVar = this.e;
        int hashCode = (e + (aVar == null ? 0 : aVar.hashCode())) * 31;
        kotlinx.serialization.json.b bVar = this.f;
        int e2 = unr0.e((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.g);
        ynv0 ynv0Var = this.h;
        return this.i.hashCode() + ((e2 + (ynv0Var != null ? ynv0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SummaryRedirectActionModel(tariffClass=", this.a, ", verticalId=", this.b, ", state=");
        v.append(this.c);
        v.append(", isVerticalTrap=");
        v.append(this.d);
        v.append(", destination=");
        v.append(this.e);
        v.append(", summaryContext=");
        v.append(this.f);
        v.append(", maybeWaitForRouteStats=");
        v.append(this.g);
        v.append(", origin=");
        v.append(this.h);
        v.append(", requirements=");
        return ly3.s(v, this.i, Extension.C_BRAKE);
    }

    public static final class a {
        public final zzs a;
        public final String b;
        public final String c;
        public final Address d;

        public /* synthetic */ a(int i, zzs zzsVar, String str, String str2) {
            this((i & 1) != 0 ? new zzs(0.0d, 0.0d, 0, null, null, 24) : zzsVar, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (Address) null);
        }

        public final String a() {
            String str = this.b;
            return str.length() == 0 ? this.c : str;
        }

        public final zzs b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            Address address = this.d;
            return b + (address == null ? 0 : address.hashCode());
        }

        public final String toString() {
            return "Destination(position=" + this.a + ", log=" + this.b + ", uri=" + this.c + ", addressCorrection=" + this.d + Extension.C_BRAKE;
        }

        public a(zzs zzsVar, String str, String str2, Address address) {
            this.a = zzsVar;
            this.b = str;
            this.c = str2;
            this.d = address;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(15, (zzs) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0));
        }
    }

    public SummaryRedirectActionModel() {
        this(null, null, null, false, null, null, false, null, null, 511);
    }
}
