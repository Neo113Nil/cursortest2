package com.yandex.go.chargers.promotion.data;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/promotion/data/ChargersPromotionInScootersExperiment;", "Lw96;", "Lc6z;", "Companion", "ChargersLowBatteryPromotionUi", "com/yandex/go/chargers/promotion/data/b", "$serializer", "promotion"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersPromotionInScootersExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] h;
    public final boolean b;
    public final Map c;
    public final String d;
    public final int e;
    public final ChargersLowBatteryPromotionUi f;
    public final List g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new y99(9)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new y99(10))};
        new ChargersPromotionInScootersExperiment(0);
    }

    public /* synthetic */ ChargersPromotionInScootersExperiment(int i, boolean z, Map map, String str, int i2, ChargersLowBatteryPromotionUi chargersLowBatteryPromotionUi, List list) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = 20;
        } else {
            this.e = i2;
        }
        if ((i & 16) == 0) {
            this.f = new ChargersLowBatteryPromotionUi(0);
        } else {
            this.f = chargersLowBatteryPromotionUi;
        }
        if ((i & 32) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        return getB() && !this.c.isEmpty() && this.f.a.length() > 0 && this.d.length() > 0;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/promotion/data/ChargersPromotionInScootersExperiment$ChargersLowBatteryPromotionUi;", "", "Companion", "$serializer", "com/yandex/go/chargers/promotion/data/a", "promotion"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersLowBatteryPromotionUi {
        public static final a Companion = new a();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ ChargersLowBatteryPromotionUi(int i, String str, String str2, String str3) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public ChargersLowBatteryPromotionUi(int i) {
            this.a = "";
            this.b = null;
            this.c = null;
        }

        public ChargersLowBatteryPromotionUi() {
            this(0);
        }
    }

    public ChargersPromotionInScootersExperiment() {
        this(0);
    }

    public ChargersPromotionInScootersExperiment(int i) {
        Map f = kotlin.collections.b.f();
        ChargersLowBatteryPromotionUi chargersLowBatteryPromotionUi = new ChargersLowBatteryPromotionUi(0);
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = 20;
        this.f = chargersLowBatteryPromotionUi;
        this.g = EmptyList.a;
    }
}
