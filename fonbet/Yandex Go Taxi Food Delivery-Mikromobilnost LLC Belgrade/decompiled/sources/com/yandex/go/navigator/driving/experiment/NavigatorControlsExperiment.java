package com.yandex.go.navigator.driving.experiment;

import defpackage.c6z;
import defpackage.d540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/driving/experiment/NavigatorControlsExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/driving/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorControlsExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] f;
    public static final NavigatorControlsExperiment g;
    public final boolean b;
    public final List c;
    public final List d;
    public final Map e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new d540(26)), kotlin.a.b(lazyThreadSafetyMode, new d540(27)), kotlin.a.b(lazyThreadSafetyMode, new d540(28))};
        g = new NavigatorControlsExperiment(0);
    }

    public /* synthetic */ NavigatorControlsExperiment(int i, List list, List list2, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        int i2 = i & 2;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 4) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.e;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NavigatorControlsExperiment() {
        this(0);
    }

    public NavigatorControlsExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = f2;
    }
}
