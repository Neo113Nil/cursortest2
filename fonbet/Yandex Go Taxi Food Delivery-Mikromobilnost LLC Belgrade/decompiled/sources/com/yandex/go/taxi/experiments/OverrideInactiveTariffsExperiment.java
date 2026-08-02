package com.yandex.go.taxi.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kz60;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/experiments/OverrideInactiveTariffsExperiment;", "Ln96;", "Companion", "com/yandex/go/taxi/experiments/j", "$serializer", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OverrideInactiveTariffsExperiment extends n96 {
    public static final j Companion = new j();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new kz60(26))};
    public static final OverrideInactiveTariffsExperiment e = new OverrideInactiveTariffsExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ OverrideInactiveTariffsExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverrideInactiveTariffsExperiment)) {
            return false;
        }
        OverrideInactiveTariffsExperiment overrideInactiveTariffsExperiment = (OverrideInactiveTariffsExperiment) obj;
        return this.b == overrideInactiveTariffsExperiment.b && jl40.l(this.c, overrideInactiveTariffsExperiment.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OverrideInactiveTariffsExperiment(enabled=" + this.b + ", overrideMap=" + this.c + Extension.C_BRAKE;
    }

    public OverrideInactiveTariffsExperiment() {
        this(0);
    }

    public OverrideInactiveTariffsExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
