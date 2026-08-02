package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/VerticalMode;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class VerticalMode {
    public static final h Companion = new h();
    public final boolean a;
    public final int b;
    public final WalkingRouteDto c;
    public final int d;
    public final boolean e;

    public /* synthetic */ VerticalMode(int i, boolean z, int i2, WalkingRouteDto walkingRouteDto, int i3, boolean z2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = walkingRouteDto;
        }
        if ((i & 8) == 0) {
            this.d = Integer.MAX_VALUE;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
    }

    public VerticalMode() {
        this.a = false;
        this.b = 0;
        this.c = null;
        this.d = Integer.MAX_VALUE;
        this.e = false;
    }
}
