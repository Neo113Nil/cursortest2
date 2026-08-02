package com.yandex.go.taxi.summary.map.clarify_source_point.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.y99;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/map/clarify_source_point/experiments/ClarifyPointsOnMapExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/summary/map/clarify_source_point/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClarifyPointsOnMapExperiment extends n96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] j;
    public final boolean b;
    public final Map c;
    public final Float d;
    public final PointsVisiblePriorityDto e;
    public final PinStateDto f;
    public final PinStateDto g;
    public final List h;
    public final List i;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        j = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y99(17)), null, kotlin.a.b(lazyThreadSafetyMode, new y99(18)), null, null, kotlin.a.b(lazyThreadSafetyMode, new y99(19)), kotlin.a.b(lazyThreadSafetyMode, new y99(20))};
    }

    public /* synthetic */ ClarifyPointsOnMapExperiment(int i, boolean z, Map map, Float f, PointsVisiblePriorityDto pointsVisiblePriorityDto, PinStateDto pinStateDto, PinStateDto pinStateDto2, List list, List list2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
        if ((i & 8) == 0) {
            this.e = PointsVisiblePriorityDto.UNKNOWN;
        } else {
            this.e = pointsVisiblePriorityDto;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = pinStateDto;
        }
        if ((i & 32) == 0) {
            this.g = null;
        } else {
            this.g = pinStateDto2;
        }
        int i2 = i & 64;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.h = emptyList;
        } else {
            this.h = list;
        }
        if ((i & 128) == 0) {
            this.i = emptyList;
        } else {
            this.i = list2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public ClarifyPointsOnMapExperiment() {
        this(255);
    }

    public ClarifyPointsOnMapExperiment(int i) {
        Map f = kotlin.collections.b.f();
        PointsVisiblePriorityDto pointsVisiblePriorityDto = PointsVisiblePriorityDto.UNKNOWN;
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = pointsVisiblePriorityDto;
        this.f = null;
        this.g = null;
        EmptyList emptyList = EmptyList.a;
        this.h = emptyList;
        this.i = emptyList;
    }
}
