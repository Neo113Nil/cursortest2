package com.yandex.go.navigator.gas_stations.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.w96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/experiment/NavigatorGasStationsExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/gas_stations/experiment/d", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorGasStationsExperiment extends w96 implements c6z {
    public static final d Companion = new d();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ic50(0)), null, null, null, null};
    public static final NavigatorGasStationsExperiment i = new NavigatorGasStationsExperiment(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public /* synthetic */ NavigatorGasStationsExperiment(int i2, boolean z, Map map, String str, String str2, boolean z2, String str3) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i2 & 32) == 0) {
            this.g = "both";
        } else {
            this.g = str3;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getE() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public NavigatorGasStationsExperiment() {
        this(0);
    }

    public NavigatorGasStationsExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = false;
        this.g = "both";
    }
}
