package com.yandex.go.platform.analytics;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.k8u;
import defpackage.qke;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/platform/analytics/JsAdjustEventInfoParam;", "", "Companion", "$serializer", "com/yandex/go/platform/analytics/a", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class JsAdjustEventInfoParam {
    public static final a Companion = new a();
    public static final KSerializer[] f;
    public final Map a;
    public final Map b;
    public final JsAdjustEventRevenue c;
    public final String d;
    public final String e;

    static {
        auu0 auu0Var = auu0.a;
        f = new KSerializer[]{new k8u(qke.n(auu0Var), qke.n(auu0Var), 1), new k8u(qke.n(auu0Var), qke.n(auu0Var), 1), null, null, null};
    }

    public /* synthetic */ JsAdjustEventInfoParam(int i, Map map, Map map2, JsAdjustEventRevenue jsAdjustEventRevenue, String str, String str2) {
        this.a = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.b.f();
        } else {
            this.b = map2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = jsAdjustEventRevenue;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public JsAdjustEventInfoParam() {
        this(0);
    }

    public JsAdjustEventInfoParam(int i) {
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        this.a = f2;
        this.b = f3;
        this.c = null;
        this.d = null;
        this.e = null;
    }
}
