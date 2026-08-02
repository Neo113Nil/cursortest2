package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5330yn {
    public final An a;
    public final An b;

    public C5330yn(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new X2(new C5303xl(context));
            this.b = new X2(new Xc(context));
        } else {
            this.a = new C4956k8();
            this.b = new C4956k8();
        }
    }
}
