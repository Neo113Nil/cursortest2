package com.yandex.go.inapp_calls.experiment;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/inapp_calls/experiment/RegsConnectionRetryExperiment;", "Lw96;", "Companion", "com/yandex/go/inapp_calls/experiment/r", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RegsConnectionRetryExperiment extends w96 {
    public static final r Companion = new r();
    public static final RegsConnectionRetryExperiment f = new RegsConnectionRetryExperiment(0);
    public final boolean b;
    public final int c;
    public final long d;
    public final long e;

    public /* synthetic */ RegsConnectionRetryExperiment(int i, int i2, long j, long j2, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? 4 : i2;
        if ((i & 4) == 0) {
            this.d = 1000L;
        } else {
            this.d = j;
        }
        if ((i & 8) == 0) {
            this.e = 3000L;
        } else {
            this.e = j2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RegsConnectionRetryExperiment(int i) {
        this.b = false;
        this.c = 4;
        this.d = 1000L;
        this.e = 3000L;
    }

    public RegsConnectionRetryExperiment() {
        this(0);
    }
}
