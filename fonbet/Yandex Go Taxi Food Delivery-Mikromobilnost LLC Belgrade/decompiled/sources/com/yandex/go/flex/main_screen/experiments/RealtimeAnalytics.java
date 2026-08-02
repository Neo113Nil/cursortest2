package com.yandex.go.flex.main_screen.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/main_screen/experiments/RealtimeAnalytics;", "", "Companion", "$serializer", "com/yandex/go/flex/main_screen/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RealtimeAnalytics {
    public static final c Companion = new c();
    public final boolean a;
    public final long b;
    public final int c;

    public /* synthetic */ RealtimeAnalytics(int i, int i2, long j, boolean z) {
        this.a = (i & 1) == 0 ? true : z;
        this.b = (i & 2) == 0 ? 2L : j;
        if ((i & 4) == 0) {
            this.c = 100;
        } else {
            this.c = i2;
        }
    }

    public RealtimeAnalytics(int i) {
        this.a = true;
        this.b = 2L;
        this.c = 100;
    }

    public RealtimeAnalytics() {
        this(0);
    }
}
