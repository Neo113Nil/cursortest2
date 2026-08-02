package com.yandex.go.flex.common.analytics.models;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/analytics/models/Revenue;", "", "Companion", "$serializer", "com/yandex/go/flex/common/analytics/models/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Revenue {
    public static final b Companion = new b();
    public final double a;
    public final String b;

    public /* synthetic */ Revenue(double d, int i, String str) {
        this.a = (i & 1) == 0 ? 0.0d : d;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public Revenue() {
        this.a = 0.0d;
        this.b = "";
    }
}
