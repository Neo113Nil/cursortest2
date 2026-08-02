package com.yandex.go.taxi.summary.mobilityhub.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/experiment/HubVerticalOnSummaryExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/summary/mobilityhub/experiment/f", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HubVerticalOnSummaryExperiment extends n96 implements c6z {
    public static final f Companion = new f();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(0)), null};
    public static final HubVerticalOnSummaryExperiment f = new HubVerticalOnSummaryExperiment(0);
    public final boolean b;
    public final Map c;
    public final VerticalMode d;

    public /* synthetic */ HubVerticalOnSummaryExperiment(int i, boolean z, Map map, VerticalMode verticalMode) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = verticalMode;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getD() {
        return this.c;
    }

    public HubVerticalOnSummaryExperiment() {
        this(0);
    }

    public HubVerticalOnSummaryExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
    }
}
