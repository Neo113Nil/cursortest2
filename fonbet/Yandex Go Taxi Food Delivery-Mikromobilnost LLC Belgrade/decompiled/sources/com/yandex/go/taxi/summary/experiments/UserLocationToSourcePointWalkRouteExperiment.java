package com.yandex.go.taxi.summary.experiments;

import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;
import defpackage.g8e;
import defpackage.gp21;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jst;
import defpackage.n96;
import defpackage.sls;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/experiments/UserLocationToSourcePointWalkRouteExperiment;", "Ln96;", "Companion", "AvailableTariffClasses", "com/yandex/go/taxi/summary/experiments/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserLocationToSourcePointWalkRouteExperiment extends n96 {
    public static final d Companion = new d();
    public static final i3y[] k = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new gp21(0))};
    public static final UserLocationToSourcePointWalkRouteExperiment l = new UserLocationToSourcePointWalkRouteExperiment(0);
    public final boolean b;
    public final float c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    public final i3y j;

    public /* synthetic */ UserLocationToSourcePointWalkRouteExperiment(int i, boolean z, float f, int i2, int i3, int i4, int i5, int i6, List list) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f;
        }
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 16) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i & 32) == 0) {
            this.g = 0;
        } else {
            this.g = i5;
        }
        if ((i & 64) == 0) {
            this.h = 0;
        } else {
            this.h = i6;
        }
        if ((i & 128) == 0) {
            this.i = EmptyList.a;
        } else {
            this.i = list;
        }
        final int i7 = 1;
        this.j = kotlin.a.a(new sls(this) { // from class: hp21
            public final /* synthetic */ UserLocationToSourcePointWalkRouteExperiment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i8 = i7;
                UserLocationToSourcePointWalkRouteExperiment userLocationToSourcePointWalkRouteExperiment = this.b;
                switch (i8) {
                    case 0:
                        List<UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses> list2 = userLocationToSourcePointWalkRouteExperiment.i;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        for (UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses availableTariffClasses : list2) {
                            arrayList.add(new i741(availableTariffClasses.a, availableTariffClasses.b, availableTariffClasses.c));
                        }
                        return arrayList;
                    default:
                        List<UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses> list3 = userLocationToSourcePointWalkRouteExperiment.i;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                        for (UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses availableTariffClasses2 : list3) {
                            arrayList2.add(new i741(availableTariffClasses2.a, availableTariffClasses2.b, availableTariffClasses2.c));
                        }
                        return arrayList2;
                }
            }
        });
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public final float c() {
        float f = this.c;
        if (f >= 0.0f) {
            return f;
        }
        g8e.B(jst.e, "USER_LOCATION_TO_SOURCE_WALK:INVALID_EXPERIMENT_ARGUMENT", null, "invalid minZoomLevel: " + f, 2);
        return 0.0f;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/summary/experiments/UserLocationToSourcePointWalkRouteExperiment$AvailableTariffClasses;", "", "Companion", "$serializer", "com/yandex/go/taxi/summary/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes14.dex */
    public static final class AvailableTariffClasses {
        public static final c Companion = new c();
        public final String a;
        public final String b;
        public final boolean c;

        public /* synthetic */ AvailableTariffClasses(String str, int i, String str2, boolean z) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public AvailableTariffClasses() {
            this.a = "";
            this.b = null;
            this.c = false;
        }
    }

    public UserLocationToSourcePointWalkRouteExperiment(int i) {
        final int i2 = 0;
        this.b = false;
        this.c = 0.0f;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = EmptyList.a;
        this.j = kotlin.a.a(new sls(this) { // from class: hp21
            public final /* synthetic */ UserLocationToSourcePointWalkRouteExperiment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i8 = i2;
                UserLocationToSourcePointWalkRouteExperiment userLocationToSourcePointWalkRouteExperiment = this.b;
                switch (i8) {
                    case 0:
                        List<UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses> list2 = userLocationToSourcePointWalkRouteExperiment.i;
                        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                        for (UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses availableTariffClasses : list2) {
                            arrayList.add(new i741(availableTariffClasses.a, availableTariffClasses.b, availableTariffClasses.c));
                        }
                        return arrayList;
                    default:
                        List<UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses> list3 = userLocationToSourcePointWalkRouteExperiment.i;
                        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                        for (UserLocationToSourcePointWalkRouteExperiment.AvailableTariffClasses availableTariffClasses2 : list3) {
                            arrayList2.add(new i741(availableTariffClasses2.a, availableTariffClasses2.b, availableTariffClasses2.c));
                        }
                        return arrayList2;
                }
            }
        });
    }

    public UserLocationToSourcePointWalkRouteExperiment() {
        this(0);
    }
}
