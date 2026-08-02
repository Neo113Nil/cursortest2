package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* renamed from: io.appmetrica.analytics.impl.on, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5075on extends Lambda implements gzs {
    public final /* synthetic */ C5101pn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5075on(C5101pn c5101pn) {
        super(0);
        this.a = c5101pn;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        HashMap hashMap = new HashMap();
        C5101pn c5101pn = this.a;
        String a = c5101pn.a.a();
        if (a != null) {
        }
        String a2 = c5101pn.b.a();
        if (a2 != null) {
            hashMap.put(AdRevenueConstants.PLUGIN_SUPPORTED_SOURCES_KEY, a2);
        }
        return hashMap;
    }
}
