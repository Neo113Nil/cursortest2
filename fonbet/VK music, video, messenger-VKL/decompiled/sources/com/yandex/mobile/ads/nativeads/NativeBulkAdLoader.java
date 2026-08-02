package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import java.util.Iterator;
import xsna.myc0;
import yads.e10;
import yads.g10;
import yads.g9;
import yads.mv3;
import yads.p12;
import yads.q12;
import yads.w12;
import yads.zu3;

/* loaded from: classes8.dex */
public final class NativeBulkAdLoader {
    private final g10 a;
    private final e b = new e();

    public NativeBulkAdLoader(Context context) {
        this.a = new g10(context, new mv3(context));
    }

    public final void cancelLoading() {
        this.a.a();
    }

    public final void loadAds(NativeAdRequestConfiguration nativeAdRequestConfiguration, int i) {
        g9 a = this.b.a(nativeAdRequestConfiguration);
        g10 g10Var = this.a;
        myc0.h(g10Var.c, null, null, new e10(g10Var, a, i, null), 3);
    }

    public final void setNativeBulkAdLoadListener(NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        zu3 zu3Var = nativeBulkAdLoadListener != null ? new zu3(nativeBulkAdLoadListener) : null;
        p12 p12Var = this.a.d;
        p12Var.e.a();
        p12Var.g = zu3Var;
        Iterator it = p12Var.d.iterator();
        while (it.hasNext()) {
            w12 w12Var = ((q12) it.next()).b.x;
            w12Var.e = zu3Var;
            w12Var.c.a(w12Var.d, zu3Var, null);
        }
    }
}
