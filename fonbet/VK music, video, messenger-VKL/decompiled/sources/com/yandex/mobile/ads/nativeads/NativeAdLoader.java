package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import java.util.Iterator;
import xsna.myc0;
import yads.d10;
import yads.g10;
import yads.g9;
import yads.mv3;
import yads.p12;
import yads.q12;
import yads.tu3;
import yads.w12;

/* loaded from: classes8.dex */
public class NativeAdLoader {
    private final g10 a;
    private final e b = new e();

    public NativeAdLoader(Context context) {
        this.a = new g10(context, new mv3(context));
    }

    public final void cancelLoading() {
        this.a.a();
    }

    public final void loadAd(NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        g9 a = this.b.a(nativeAdRequestConfiguration);
        g10 g10Var = this.a;
        myc0.h(g10Var.c, null, null, new d10(g10Var, a, null), 3);
    }

    public final void setNativeAdLoadListener(NativeAdLoadListener nativeAdLoadListener) {
        tu3 tu3Var = nativeAdLoadListener != null ? new tu3(nativeAdLoadListener) : null;
        p12 p12Var = this.a.d;
        p12Var.e.a();
        p12Var.f = tu3Var;
        Iterator it = p12Var.d.iterator();
        while (it.hasNext()) {
            w12 w12Var = ((q12) it.next()).b.x;
            w12Var.d = tu3Var;
            w12Var.c.a(tu3Var, w12Var.e, null);
        }
    }
}
