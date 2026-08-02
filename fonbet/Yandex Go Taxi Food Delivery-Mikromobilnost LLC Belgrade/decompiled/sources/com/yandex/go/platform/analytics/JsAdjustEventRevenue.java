package com.yandex.go.platform.analytics;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/analytics/JsAdjustEventRevenue;", "", "Companion", "$serializer", "com/yandex/go/platform/analytics/b", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsAdjustEventRevenue {
    public static final b Companion = new b();
    public final Double a;
    public final String b;

    public /* synthetic */ JsAdjustEventRevenue(int i, Double d, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public JsAdjustEventRevenue() {
        this.a = null;
        this.b = null;
    }
}
