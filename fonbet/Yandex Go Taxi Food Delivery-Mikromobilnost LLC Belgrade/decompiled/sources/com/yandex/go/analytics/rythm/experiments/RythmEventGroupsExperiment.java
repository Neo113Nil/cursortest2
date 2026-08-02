package com.yandex.go.analytics.rythm.experiments;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ibl0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/rythm/experiments/RythmEventGroupsExperiment;", "Lw96;", "Companion", "Configuration", "com/yandex/go/analytics/rythm/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RythmEventGroupsExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(14))};
    public static final RythmEventGroupsExperiment e = new RythmEventGroupsExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ RythmEventGroupsExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RythmEventGroupsExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/rythm/experiments/RythmEventGroupsExperiment$Configuration;", "", "Companion", "$serializer", "com/yandex/go/analytics/rythm/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Configuration {
        public static final b Companion = new b();
        public final String a;
        public final int b;
        public final int c;

        public /* synthetic */ Configuration(int i, int i2, int i3, String str) {
            if (7 != (i & 7)) {
                qje.Z(i, 7, RythmEventGroupsExperiment$Configuration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return jl40.l(this.a, configuration.a) && this.b == configuration.b && this.c == configuration.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "Configuration(path=", this.a, ", maxBatchSize=", ", sendInterval="));
        }

        public Configuration() {
            this.a = "";
            this.b = 100;
            this.c = 20;
        }
    }

    public RythmEventGroupsExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
