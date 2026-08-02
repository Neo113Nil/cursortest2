package com.yandex.go.lifecycle.experiments;

import defpackage.gsq0;
import defpackage.i22;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.unr0;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/lifecycle/experiments/AppLifecycleLcpExperiment;", "Lw96;", "Companion", "DelayScenario", "com/yandex/go/lifecycle/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AppLifecycleLcpExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(16))};
    public static final AppLifecycleLcpExperiment f = new AppLifecycleLcpExperiment(0);
    public final boolean b;
    public final Long c;
    public final List d;

    public /* synthetic */ AppLifecycleLcpExperiment(int i, boolean z, Long l, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLifecycleLcpExperiment)) {
            return false;
        }
        AppLifecycleLcpExperiment appLifecycleLcpExperiment = (AppLifecycleLcpExperiment) obj;
        return this.b == appLifecycleLcpExperiment.b && jl40.l(this.c, appLifecycleLcpExperiment.c) && jl40.l(this.d, appLifecycleLcpExperiment.d);
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Long l = this.c;
        return this.d.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppLifecycleLcpExperiment(enabled=");
        sb.append(this.b);
        sb.append(", lcpTimeoutMs=");
        sb.append(this.c);
        sb.append(", delayScenarios=");
        return ly3.s(sb, this.d, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/lifecycle/experiments/AppLifecycleLcpExperiment$DelayScenario;", "", "Companion", "Strategy", "$serializer", "com/yandex/go/lifecycle/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class DelayScenario {
        public static final b Companion = new b();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(17))};
        public final boolean a;
        public final String b;
        public final Strategy c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/lifecycle/experiments/AppLifecycleLcpExperiment$DelayScenario$Strategy;", "", "Companion", "com/yandex/go/lifecycle/experiments/c", "AFTER_FCP", "AFTER_LCP", "PRIMARY_ON_ACTIVITY", "ON_ACTIVITY", "ON_APPLICATION", "ON_CONFIGURATION", "LAUNCH", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Strategy {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Strategy[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Strategy AFTER_FCP;
            public static final Strategy AFTER_LCP;
            public static final c Companion;
            public static final Strategy LAUNCH;
            public static final Strategy ON_ACTIVITY;
            public static final Strategy ON_APPLICATION;
            public static final Strategy ON_CONFIGURATION;
            public static final Strategy PRIMARY_ON_ACTIVITY;

            static {
                Strategy strategy = new Strategy("AFTER_FCP", 0);
                AFTER_FCP = strategy;
                Strategy strategy2 = new Strategy("AFTER_LCP", 1);
                AFTER_LCP = strategy2;
                Strategy strategy3 = new Strategy("PRIMARY_ON_ACTIVITY", 2);
                PRIMARY_ON_ACTIVITY = strategy3;
                Strategy strategy4 = new Strategy("ON_ACTIVITY", 3);
                ON_ACTIVITY = strategy4;
                Strategy strategy5 = new Strategy("ON_APPLICATION", 4);
                ON_APPLICATION = strategy5;
                Strategy strategy6 = new Strategy("ON_CONFIGURATION", 5);
                ON_CONFIGURATION = strategy6;
                Strategy strategy7 = new Strategy("LAUNCH", 6);
                LAUNCH = strategy7;
                Strategy[] strategyArr = {strategy, strategy2, strategy3, strategy4, strategy5, strategy6, strategy7};
                $VALUES = strategyArr;
                $ENTRIES = kotlin.enums.a.a(strategyArr);
                Companion = new c();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i22(18));
            }

            public static Strategy valueOf(String str) {
                return (Strategy) Enum.valueOf(Strategy.class, str);
            }

            public static Strategy[] values() {
                return (Strategy[]) $VALUES.clone();
            }
        }

        public /* synthetic */ DelayScenario(int i, boolean z, String str, Strategy strategy) {
            this.a = (i & 1) == 0 ? true : z;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = Strategy.LAUNCH;
            } else {
                this.c = strategy;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DelayScenario)) {
                return false;
            }
            DelayScenario delayScenario = (DelayScenario) obj;
            return this.a == delayScenario.a && jl40.l(this.b, delayScenario.b) && this.c == delayScenario.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder v = ly3.v("DelayScenario(enabled=", ", name=", this.b, ", strategy=", this.a);
            v.append(this.c);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public DelayScenario() {
            Strategy strategy = Strategy.LAUNCH;
            this.a = true;
            this.b = "";
            this.c = strategy;
        }
    }

    public AppLifecycleLcpExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = EmptyList.a;
    }

    public AppLifecycleLcpExperiment() {
        this(0);
    }
}
