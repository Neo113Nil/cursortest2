package com.yandex.go.shortcuts.impl.experiments;

import defpackage.fs70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.n96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/shortcuts/impl/experiments/OrderNotificationsSettingsExperiment;", "Ln96;", "Companion", "com/yandex/go/shortcuts/impl/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OrderNotificationsSettingsExperiment extends n96 {
    public static final b Companion = new b();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(23))};
    public static final OrderNotificationsSettingsExperiment f = new OrderNotificationsSettingsExperiment(0);
    public final boolean b;
    public final float c;
    public final jsq0 d;

    public /* synthetic */ OrderNotificationsSettingsExperiment(int i, boolean z, float f2, jsq0 jsq0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f2;
        }
        if ((i & 4) == 0) {
            this.d = ksq0.a;
        } else {
            this.d = jsq0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public OrderNotificationsSettingsExperiment() {
        this(0);
    }

    public OrderNotificationsSettingsExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = 0.0f;
        this.d = jsq0Var;
    }
}
