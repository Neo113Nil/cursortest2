package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import kotlin.Lazy;
import xsna.bpn0;

/* loaded from: classes8.dex */
public final class Kb implements ConfigProvider {
    public final C4927j5 a;
    public final Lazy b = new bpn0(new Jb(this));

    public Kb(C4927j5 c4927j5) {
        this.a = c4927j5;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5224uh getConfig() {
        return (C5224uh) this.b.getValue();
    }
}
