package com.yandex.go.navigator.rate_route.experiement;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ic50;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/navigator/rate_route/experiement/NavigatorRateScreenExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/navigator/rate_route/experiement/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NavigatorRateScreenExperiment extends w96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] i;
    public static final NavigatorRateScreenExperiment j;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new ic50(6)), null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new ic50(7))};
        j = new NavigatorRateScreenExperiment(0);
    }

    public /* synthetic */ NavigatorRateScreenExperiment(int i2, boolean z, Map map, String str, String str2, String str3, boolean z2, List list) {
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
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
        if ((i2 & 64) == 0) {
            this.h = EmptyList.a;
        } else {
            this.h = list;
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

    public NavigatorRateScreenExperiment() {
        this(0);
    }

    public NavigatorRateScreenExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = false;
        this.h = EmptyList.a;
    }
}
