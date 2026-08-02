package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5082p4 implements ClientStorageProvider {
    public final El a;

    public C5082p4(El el) {
        this.a = el;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C4910id(str, this.a);
    }
}
