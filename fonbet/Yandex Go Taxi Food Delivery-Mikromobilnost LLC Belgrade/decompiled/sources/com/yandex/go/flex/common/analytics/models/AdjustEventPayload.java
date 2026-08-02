package com.yandex.go.flex.common.analytics.models;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.pn0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/flex/common/analytics/models/AdjustEventPayload;", "", "Companion", "$serializer", "com/yandex/go/flex/common/analytics/models/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdjustEventPayload {
    public static final a Companion = new a();
    public static final i3y[] g;
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;
    public final String e;
    public final Revenue f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new pn0(16)), kotlin.a.b(lazyThreadSafetyMode, new pn0(17)), null, null, null};
    }

    public /* synthetic */ AdjustEventPayload(int i, String str, Map map, Map map2, String str2, String str3, Revenue revenue) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = revenue;
        }
    }

    public AdjustEventPayload() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
