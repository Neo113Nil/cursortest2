package com.yandex.mobile.drive.analytics;

import defpackage.ba20;
import defpackage.bvf0;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.i5b1;
import defpackage.ike;
import defpackage.pfm;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tsr;
import defpackage.x920;
import defpackage.xjg;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class a implements tsr, ca20 {
    public static xjg c;
    public ea20 a;
    public ike b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.b = bvf0.b();
        ea20 ea20Var = new ea20(ssrVar.c, "analytics_mobile");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ike ikeVar = this.b;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        ea20 ea20Var = this.a;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        xjg xjgVar = c;
        ike ikeVar = this.b;
        if (ikeVar == null) {
            ((ba20) da20Var).error("engine_detached", null, null);
        }
        if (xjgVar == null) {
            ((ba20) da20Var).error("invalid_setup", null, null);
            return;
        }
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2104134025:
                    if (str.equals("reportAdjustEvent")) {
                        String str2 = (String) i5b1.b(x920Var, "name");
                        if (str2 == null) {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        } else {
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    }
                    break;
                case -270619340:
                    if (str.equals("reportError")) {
                        String str3 = (String) i5b1.b(x920Var, "type");
                        String str4 = (String) i5b1.b(x920Var, Constants.KEY_MESSAGE);
                        if (str3 != null && str4 != null) {
                            ((pfm) xjgVar.c).d(new Throwable(g8e.p(str3, Extension.COLON_SPACE, str4)));
                            ((ba20) da20Var).success(null);
                            break;
                        } else {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        }
                    }
                    break;
                case -156069741:
                    if (str.equals("putAdjustValue")) {
                        String str5 = (String) i5b1.b(x920Var, "key");
                        if (str5 == null) {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        } else {
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    }
                    break;
                case 519606255:
                    if (str.equals("putMetricaValue")) {
                        String str6 = (String) i5b1.b(x920Var, "key");
                        if (str6 == null) {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        } else {
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    }
                    break;
                case 704644396:
                    if (str.equals("adIdentifier")) {
                        tje.N(ikeVar, null, null, new SdkAnalyticsMobilePlugin$onMethodCall$2(xjgVar, da20Var, null), 3);
                        break;
                    }
                    break;
                case 711590845:
                    if (str.equals("reportMetricaEvent")) {
                        String str7 = (String) i5b1.b(x920Var, "name");
                        Map map = (Map) i5b1.b(x920Var, "params");
                        if (str7 == null) {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        } else {
                            xjgVar.k(str7, map);
                            ((ba20) da20Var).success(null);
                            break;
                        }
                    }
                    break;
                case 1368189162:
                    if (str.equals("identifiers")) {
                        tje.N(ikeVar, null, null, new SdkAnalyticsMobilePlugin$onMethodCall$1(xjgVar, da20Var, null), 3);
                        break;
                    }
                    break;
            }
        }
    }
}
