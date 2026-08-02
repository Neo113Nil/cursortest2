package com.yandex.go.experiments.zoneinfo;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/experiments/zoneinfo/ZoneAnticrisisRequestHeadersExperiment;", "Lw96;", "Companion", "com/yandex/go/experiments/zoneinfo/b", "$serializer", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ZoneAnticrisisRequestHeadersExperiment extends w96 {
    public static final b Companion = new b();
    public static final ZoneAnticrisisRequestHeadersExperiment e = new ZoneAnticrisisRequestHeadersExperiment(0);
    public final boolean b;
    public final int c;
    public final boolean d;

    public /* synthetic */ ZoneAnticrisisRequestHeadersExperiment(int i, int i2, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ZoneAnticrisisRequestHeadersExperiment(int i) {
        this.b = false;
        this.c = 0;
        this.d = false;
    }

    public ZoneAnticrisisRequestHeadersExperiment() {
        this(0);
    }
}
