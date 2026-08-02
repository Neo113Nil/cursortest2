package com.yandex.go.dto.response;

import defpackage.ar;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.zzs;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/dto/response/Action$TaxiExpectedDestination", "Lcom/yandex/go/dto/response/q1;", "Companion", "Prefetch", "$serializer", "com/yandex/go/dto/response/j1", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$TaxiExpectedDestination extends q1 {
    public static final j1 Companion = new j1();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(1))};
    public final zzs a;
    public final String b;
    public final String c;
    public final Prefetch d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/dto/response/Action$TaxiExpectedDestination$Prefetch;", "", "Companion", "com/yandex/go/dto/response/k1", "ROUTE_ETA", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Prefetch {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Prefetch[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final k1 Companion;
        public static final Prefetch NONE;
        public static final Prefetch ROUTE_ETA;

        static {
            Prefetch prefetch = new Prefetch("ROUTE_ETA", 0);
            ROUTE_ETA = prefetch;
            Prefetch prefetch2 = new Prefetch(JCP.RAW_PREFIX, 1);
            NONE = prefetch2;
            Prefetch[] prefetchArr = {prefetch, prefetch2};
            $VALUES = prefetchArr;
            $ENTRIES = kotlin.enums.a.a(prefetchArr);
            Companion = new k1();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ar(2));
        }

        public static Prefetch valueOf(String str) {
            return (Prefetch) Enum.valueOf(Prefetch.class, str);
        }

        public static Prefetch[] values() {
            return (Prefetch[]) $VALUES.clone();
        }
    }

    public Action$TaxiExpectedDestination(int i, zzs zzsVar, String str, String str2, Prefetch prefetch) {
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
        if ((i & 8) == 0) {
            this.d = Prefetch.NONE;
        } else {
            this.d = prefetch;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.EXPECTED_DESTINATION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$TaxiExpectedDestination)) {
            return false;
        }
        Action$TaxiExpectedDestination action$TaxiExpectedDestination = (Action$TaxiExpectedDestination) obj;
        return jl40.l(this.a, action$TaxiExpectedDestination.a) && jl40.l(this.b, action$TaxiExpectedDestination.b) && jl40.l(this.c, action$TaxiExpectedDestination.c) && this.d == action$TaxiExpectedDestination.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "TaxiExpectedDestination(position=" + this.a + ", log=" + this.b + ", uri=" + this.c + ", prefetch=" + this.d + Extension.C_BRAKE;
    }

    public Action$TaxiExpectedDestination(zzs zzsVar, String str, String str2, Prefetch prefetch) {
        this.a = zzsVar;
        this.b = str;
        this.c = str2;
        this.d = prefetch;
    }

    public Action$TaxiExpectedDestination() {
        this(new zzs(0.0d, 0.0d, 0, null, null, 24), "", "", Prefetch.NONE);
    }
}
