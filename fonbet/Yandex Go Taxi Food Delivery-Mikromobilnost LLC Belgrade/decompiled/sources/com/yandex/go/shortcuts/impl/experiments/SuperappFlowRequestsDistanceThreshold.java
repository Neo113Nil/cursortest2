package com.yandex.go.shortcuts.impl.experiments;

import defpackage.gsq0;
import defpackage.w96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/SuperappFlowRequestsDistanceThreshold;", "Lw96;", "Companion", "com/yandex/go/shortcuts/impl/experiments/e", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappFlowRequestsDistanceThreshold extends w96 {
    public static final e Companion = new e();
    public static final SuperappFlowRequestsDistanceThreshold e = new SuperappFlowRequestsDistanceThreshold(0);
    public final boolean b;
    public final int c;
    public final int d;

    public /* synthetic */ SuperappFlowRequestsDistanceThreshold(int i, int i2, int i3, boolean z) {
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
            this.d = 0;
        } else {
            this.d = i3;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public SuperappFlowRequestsDistanceThreshold(int i) {
        this.b = false;
        this.c = 0;
        this.d = 0;
    }

    public SuperappFlowRequestsDistanceThreshold() {
        this(0);
    }
}
