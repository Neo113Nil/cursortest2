package com.yandex.go.analytics.realtime.experiments;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.w96;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment;", "Lw96;", "Companion", "Configuration", "com/yandex/go/analytics/realtime/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppRealtimeAnalyticsExperiment extends w96 {
    public static final a Companion = new a();
    public static final InAppRealtimeAnalyticsExperiment d = new InAppRealtimeAnalyticsExperiment(0);
    public final boolean b;
    public final Configuration c;

    public /* synthetic */ InAppRealtimeAnalyticsExperiment(int i, boolean z, Configuration configuration) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = configuration;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public InAppRealtimeAnalyticsExperiment(int i) {
        this.b = false;
        this.c = null;
    }

    public InAppRealtimeAnalyticsExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment$Configuration;", "", "Companion", "$serializer", "com/yandex/go/analytics/realtime/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class Configuration {
        public static final b Companion = new b();
        public final int a;
        public final String b;
        public final int c;
        public final boolean d;
        public final float e;
        public final int f;

        public /* synthetic */ Configuration(int i, int i2, String str, int i3, boolean z, float f, int i4) {
            if (63 != (i & 63)) {
                qje.Z(i, 63, InAppRealtimeAnalyticsExperiment$Configuration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = i2;
            this.b = str;
            this.c = i3;
            this.d = z;
            this.e = f;
            this.f = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return this.a == configuration.a && jl40.l(this.b, configuration.b) && this.c == configuration.c && this.d == configuration.d && Float.compare(this.e, configuration.e) == 0 && this.f == configuration.f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f) + g8e.c(this.e, unr0.e(oyr.b(this.c, unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder v = unr0.v(this.a, "Configuration(bufferSize=", ", appmetricaApiKey=", this.b, ", bufferLifetimeMs=");
            tse0.z(v, this.c, ", duplicateAsPlainEvents=", this.d, ", viewVisibilityThreshold=");
            v.append(this.e);
            v.append(", viewVisibilityTimeoutMs=");
            v.append(this.f);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        public Configuration() {
            this.a = 20;
            this.b = "API key was not provided";
            this.c = 500;
            this.d = false;
            this.e = 0.5f;
            this.f = 500;
        }
    }
}
