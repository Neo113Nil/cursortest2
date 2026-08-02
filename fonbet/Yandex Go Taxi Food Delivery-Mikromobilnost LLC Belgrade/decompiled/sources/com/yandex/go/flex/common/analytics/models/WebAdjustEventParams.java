package com.yandex.go.flex.common.analytics.models;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/analytics/models/WebAdjustEventParams;", "", "Companion", "WebAdjustEventRevenue", "$serializer", "com/yandex/go/flex/common/analytics/models/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WebAdjustEventParams {
    public static final c Companion = new c();
    public static final i3y[] f;
    public final Map a;
    public final Map b;
    public final String c;
    public final String d;
    public final WebAdjustEventRevenue e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new b931(23)), kotlin.a.b(lazyThreadSafetyMode, new b931(24)), null, null, null};
    }

    public /* synthetic */ WebAdjustEventParams(int i, Map map, Map map2, String str, String str2, WebAdjustEventRevenue webAdjustEventRevenue) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = map;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = webAdjustEventRevenue;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/analytics/models/WebAdjustEventParams$WebAdjustEventRevenue;", "", "Companion", "$serializer", "com/yandex/go/flex/common/analytics/models/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class WebAdjustEventRevenue {
        public static final d Companion = new d();
        public final double a;
        public final String b;

        public /* synthetic */ WebAdjustEventRevenue(double d, int i, String str) {
            this.a = (i & 1) == 0 ? 0.0d : d;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public WebAdjustEventRevenue() {
            this.a = 0.0d;
            this.b = "";
        }
    }

    public WebAdjustEventParams() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
