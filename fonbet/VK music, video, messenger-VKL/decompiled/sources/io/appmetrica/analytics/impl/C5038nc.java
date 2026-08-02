package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* renamed from: io.appmetrica.analytics.impl.nc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5038nc extends Lambda implements gzs {
    public final /* synthetic */ C5064oc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5038nc(C5064oc c5064oc) {
        super(0);
        this.a = c5064oc;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Gc ve;
        C5064oc c5064oc = this.a;
        Hc hc = c5064oc.f;
        D9 d9 = c5064oc.b;
        C4707ah c4707ah = c5064oc.a;
        A4 a4 = c5064oc.c;
        C4860gf c4860gf = c5064oc.d;
        hc.getClass();
        if (FrameworkDetector.isNative()) {
            Y9 i = C5342za.I.i();
            Bundle applicationMetaData = i.d.getApplicationMetaData(i.a);
            if (TextUtils.isEmpty(applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null)) {
                ve = new C4730be();
                return ve.a();
            }
        }
        ve = new Ve(d9, c4707ah, a4, c4860gf);
        return ve.a();
    }
}
