package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5231v implements InterfaceC5256w {
    public final Context a;

    public C5231v(Context context) {
        this.a = context;
    }

    public final String a() {
        C5030n4 l = C5030n4.l();
        Context context = this.a;
        Y9 y9 = l.t;
        if (y9 == null) {
            synchronized (l) {
                try {
                    y9 = l.t;
                    if (y9 == null) {
                        y9 = new Y9(context);
                        l.t = y9;
                    }
                } finally {
                }
            }
        }
        Bundle applicationMetaData = y9.d.getApplicationMetaData(y9.a);
        if (applicationMetaData != null) {
            return applicationMetaData.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
        }
        return null;
    }
}
