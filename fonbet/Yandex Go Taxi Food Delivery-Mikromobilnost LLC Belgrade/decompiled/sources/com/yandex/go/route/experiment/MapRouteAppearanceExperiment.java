package com.yandex.go.route.experiment;

import com.yandex.go.taxi.order.models.api.route.e;
import com.yandex.go.taxi.order.models.api.route.g;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.t5z;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment;", "Ln96;", "Companion", "TariffData", "com/yandex/go/route/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapRouteAppearanceExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(23))};
    public static final MapRouteAppearanceExperiment e = new MapRouteAppearanceExperiment(0);
    public final boolean b;
    public final List c;

    public /* synthetic */ MapRouteAppearanceExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return getB() && !this.c.isEmpty();
    }

    public MapRouteAppearanceExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public MapRouteAppearanceExperiment() {
        this(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/route/experiment/MapRouteAppearanceExperiment$TariffData;", "", "Companion", "$serializer", "com/yandex/go/route/experiment/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class TariffData {
        public static final b Companion = new b();
        public static final i3y[] e;
        public final g a;
        public final List b;
        public final List c;
        public final boolean d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new t5z(24)), kotlin.a.b(lazyThreadSafetyMode, new t5z(25)), null};
        }

        public /* synthetic */ TariffData(int i, g gVar, List list, List list2, boolean z) {
            this.a = (i & 1) == 0 ? e.INSTANCE : gVar;
            int i2 = i & 2;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.b = emptyList;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = emptyList;
            } else {
                this.c = list2;
            }
            if ((i & 8) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
        }

        public TariffData() {
            this.a = e.INSTANCE;
            EmptyList emptyList = EmptyList.a;
            this.b = emptyList;
            this.c = emptyList;
            this.d = false;
        }
    }
}
