package com.yandex.go.user_session.data.model;

import defpackage.e3n;
import defpackage.gsq0;
import defpackage.kp50;
import defpackage.o430;
import defpackage.w96;
import kotlin.Metadata;
import kotlin.time.DurationUnit;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/user_session/data/model/SuperappSessionTtlSettingsExperiment;", "Lw96;", "Companion", "com/yandex/go/user_session/data/model/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappSessionTtlSettingsExperiment extends w96 {
    public static final b Companion = new b();
    public static final long e;
    public static final long f;
    public static final SuperappSessionTtlSettingsExperiment g;
    public final boolean b;
    public final long c;
    public final long d;

    static {
        o430 o430Var = e3n.b;
        long U = kp50.U(2, DurationUnit.HOURS);
        DurationUnit durationUnit = DurationUnit.SECONDS;
        e = e3n.o(U, durationUnit);
        f = e3n.o(kp50.U(30, DurationUnit.MINUTES), durationUnit);
        g = new SuperappSessionTtlSettingsExperiment(0);
    }

    public /* synthetic */ SuperappSessionTtlSettingsExperiment(int i, long j, long j2, boolean z) {
        this.b = (i & 1) == 0 ? true : z;
        this.c = (i & 2) == 0 ? e : j;
        if ((i & 4) == 0) {
            this.d = f;
        } else {
            this.d = j2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SuperappSessionTtlSettingsExperiment(int i) {
        this.b = true;
        this.c = e;
        this.d = f;
    }

    public SuperappSessionTtlSettingsExperiment() {
        this(0);
    }
}
