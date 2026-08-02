package com.ybsdk.feature.kycesia.internal.screens.browser;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kycesia.internal.domain.b;
import defpackage.ak00;
import defpackage.ds31;
import defpackage.n570;
import defpackage.oi60;
import defpackage.p570;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rt1;
import defpackage.sc20;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final OpenEsiaParams B;
    public final tfl0 C;
    public final com.ybsdk.di.modules.features.kyc.a D;
    public final b E;
    public final AppAnalyticsReporter F;
    public pzt0 G;

    public a(OpenEsiaParams openEsiaParams, tfl0 tfl0Var, com.ybsdk.di.modules.features.kyc.a aVar, b bVar, AppAnalyticsReporter appAnalyticsReporter) {
        super(new oi60(29), new ak00(28));
        this.B = openEsiaParams;
        this.C = tfl0Var;
        this.D = aVar;
        this.E = bVar;
        this.F = appAnalyticsReporter;
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        if (((n570) X()).b) {
            this.C.e();
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, n570.a((n570) value, null, 1)));
        d0();
    }

    public final void c0(Uri uri) {
        this.E.a(uri, new sc20(20, this));
    }

    public final void d0() {
        OpenEsiaParams openEsiaParams = this.B;
        if (openEsiaParams.getStartUri() == null) {
            pzt0 pzt0Var = this.G;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.G = tje.N(ds31.a(this), null, null, new OpenEsiaViewModel$retry$1(this, null), 3);
            return;
        }
        Z(new p570(Uri.parse(openEsiaParams.getStartUri())));
        rt1 rt1Var = this.F.s0;
        String startUri = openEsiaParams.getStartUri();
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (startUri != null) {
            linkedHashMap.put("url", startUri);
        }
        rt1Var.a.a("esia.open_browser", linkedHashMap);
    }
}
