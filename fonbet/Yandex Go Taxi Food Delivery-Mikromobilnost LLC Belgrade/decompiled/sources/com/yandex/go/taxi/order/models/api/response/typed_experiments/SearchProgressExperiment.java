package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.wrp0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/SearchProgressExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/models/api/response/typed_experiments/o", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SearchProgressExperiment extends n96 implements c6z {
    public static final o Companion = new o();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(2))};
    public static final SearchProgressExperiment e = new SearchProgressExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ SearchProgressExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public SearchProgressExperiment() {
        this(0);
    }

    public SearchProgressExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
