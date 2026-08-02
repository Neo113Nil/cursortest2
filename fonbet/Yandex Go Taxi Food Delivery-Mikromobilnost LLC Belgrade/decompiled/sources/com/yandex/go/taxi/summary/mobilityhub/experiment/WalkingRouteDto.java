package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/WalkingRouteDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/mobilityhub/experiment/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WalkingRouteDto {
    public static final i Companion = new i();
    public final boolean a;
    public final int b;

    public /* synthetic */ WalkingRouteDto(int i, boolean z, int i2) {
        this.a = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.b = Integer.MAX_VALUE;
        } else {
            this.b = i2;
        }
    }

    public WalkingRouteDto() {
        this.a = false;
        this.b = Integer.MAX_VALUE;
    }
}
