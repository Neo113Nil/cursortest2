package com.yandex.go.tariffcard.experiment;

import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.scc;
import defpackage.vn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/MulticlassTariffsHeaderRedesignExperiment;", "Lvn11;", "Companion", "Configuration", "com/yandex/go/tariffcard/experiment/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MulticlassTariffsHeaderRedesignExperiment implements vn11 {
    public static final i Companion = new i();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new d540(7)), null};
    public static final Configuration e;
    public static final MulticlassTariffsHeaderRedesignExperiment f;
    public final Map b;
    public final Configuration c;

    static {
        List g = scc.g("comfortplus", "vip", "econom", "comfortplus", "vip", "econom");
        e = new Configuration(g, 2);
        f = new MulticlassTariffsHeaderRedesignExperiment(new Configuration(g, 2), 1);
    }

    public /* synthetic */ MulticlassTariffsHeaderRedesignExperiment(int i, Map map, Configuration configuration) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = e;
        } else {
            this.c = configuration;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MulticlassTariffsHeaderRedesignExperiment)) {
            return false;
        }
        MulticlassTariffsHeaderRedesignExperiment multiclassTariffsHeaderRedesignExperiment = (MulticlassTariffsHeaderRedesignExperiment) obj;
        return jl40.l(this.b, multiclassTariffsHeaderRedesignExperiment.b) && jl40.l(this.c, multiclassTariffsHeaderRedesignExperiment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MulticlassTariffsHeaderRedesignExperiment(availableTariffClassesByVertical=" + this.b + ", configuration=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/tariffcard/experiment/MulticlassTariffsHeaderRedesignExperiment$Configuration;", "", "Companion", "$serializer", "com/yandex/go/tariffcard/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Configuration {
        public static final j Companion = new j();
        public static final i3y[] c;
        public final List a;
        public final Map b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new d540(8)), kotlin.a.b(lazyThreadSafetyMode, new d540(9))};
        }

        public /* synthetic */ Configuration(int i, List list, Map map) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = kotlin.collections.b.f();
            } else {
                this.b = map;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return jl40.l(this.a, configuration.a) && jl40.l(this.b, configuration.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Configuration(fallback=" + this.a + ", verticals=" + this.b + Extension.C_BRAKE;
        }

        public Configuration() {
            this(null, 3);
        }

        public Configuration(List list, int i) {
            list = (i & 1) != 0 ? EmptyList.a : list;
            Map f = kotlin.collections.b.f();
            this.a = list;
            this.b = f;
        }
    }

    public MulticlassTariffsHeaderRedesignExperiment() {
        this(null, 3);
    }

    public MulticlassTariffsHeaderRedesignExperiment(Configuration configuration, int i) {
        Map f2 = kotlin.collections.b.f();
        configuration = (i & 2) != 0 ? e : configuration;
        this.b = f2;
        this.c = configuration;
    }
}
