package com.yandex.go.taxi.order.details.v1.elements.support.experiment;

import defpackage.bhw0;
import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xn11;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.b;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/details/v1/elements/support/experiment/SupportOnCompleteExperiment;", "Lxn11;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/details/v1/elements/support/experiment/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SupportOnCompleteExperiment implements xn11, c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(3))};
    public static final SupportOnCompleteExperiment f = new SupportOnCompleteExperiment(0);
    public final boolean b;
    public final String c;
    public final Map d;

    public /* synthetic */ SupportOnCompleteExperiment(int i, String str, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public SupportOnCompleteExperiment() {
        this(0);
    }

    public SupportOnCompleteExperiment(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = "";
        this.d = f2;
    }
}
