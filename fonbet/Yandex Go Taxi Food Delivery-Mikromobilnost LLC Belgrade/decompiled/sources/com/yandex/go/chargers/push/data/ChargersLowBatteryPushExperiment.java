package com.yandex.go.chargers.push.data;

import com.adjust.sdk.Constants;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/push/data/ChargersLowBatteryPushExperiment;", "Lw96;", "Lc6z;", "Companion", "ChargersLowBatteryPushUi", "com/yandex/go/chargers/push/data/b", "$serializer", Constants.PUSH}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersLowBatteryPushExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] k = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(7)), null, null, null, null, null, null, null};
    public static final ChargersLowBatteryPushExperiment l = new ChargersLowBatteryPushExperiment(0);
    public final boolean b;
    public final Map c;
    public final long d;
    public final String e;
    public final int f;
    public final int g;
    public final ChargersLowBatteryPushUi h;
    public final String i;
    public final String j;

    public /* synthetic */ ChargersLowBatteryPushExperiment(int i, boolean z, Map map, long j, String str, int i2, int i3, ChargersLowBatteryPushUi chargersLowBatteryPushUi, String str2, String str3) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = 180L;
        } else {
            this.d = j;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 16) == 0) {
            this.f = 4320;
        } else {
            this.f = i2;
        }
        if ((i & 32) == 0) {
            this.g = 20;
        } else {
            this.g = i3;
        }
        if ((i & 64) == 0) {
            this.h = null;
        } else {
            this.h = chargersLowBatteryPushUi;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = str3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getG() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.w96
    public final boolean h() {
        ChargersLowBatteryPushUi chargersLowBatteryPushUi;
        if (!getB() || this.c.isEmpty() || (chargersLowBatteryPushUi = this.h) == null) {
            return false;
        }
        return ((chargersLowBatteryPushUi.a == null && chargersLowBatteryPushUi.b == null) || this.e == null) ? false : true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/push/data/ChargersLowBatteryPushExperiment$ChargersLowBatteryPushUi;", "", "Companion", "$serializer", "com/yandex/go/chargers/push/data/a", Constants.PUSH}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersLowBatteryPushUi {
        public static final a Companion = new a();
        public final String a;
        public final String b;

        public /* synthetic */ ChargersLowBatteryPushUi(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public ChargersLowBatteryPushUi() {
            this.a = null;
            this.b = null;
        }
    }

    public ChargersLowBatteryPushExperiment() {
        this(0);
    }

    public ChargersLowBatteryPushExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = 180L;
        this.e = null;
        this.f = 4320;
        this.g = 20;
        this.h = null;
        this.i = null;
        this.j = null;
    }
}
