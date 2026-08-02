package yads;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.jgp;
import xsna.pn00;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class t8 {
    public final d4 a;
    public final Context b;
    public final j8 c;
    public v9 d;
    public AdQualityVerificationResult e;
    public String f;
    public final Lazy g;

    public t8(d4 d4Var, Context context, j8 j8Var) {
        this.a = d4Var;
        this.b = context;
        this.c = j8Var;
        this.e = AdQualityVerificationResult.WaitingForVerification.INSTANCE;
        this.g = new bpn0(new r8(this));
    }

    public final void a() {
        gp2 a;
        if (b()) {
            AdQualityVerificationResult adQualityVerificationResult = this.e;
            if (!(adQualityVerificationResult instanceof AdQualityVerificationResult.WaitingForVerification) || this.d != null) {
                j8 j8Var = this.c;
                Context context = this.b;
                v9 v9Var = this.d;
                String str = this.f;
                j8Var.getClass();
                v7 v7Var = j8Var.c;
                d4 d4Var = j8Var.a;
                v7Var.getClass();
                if ((v9Var != null ? v9Var.m : null) == sz.b) {
                    Object obj = v9Var.t;
                    a = v7Var.b.a(v9Var, d4Var, obj instanceof e22 ? (e22) obj : null);
                } else {
                    a = v7Var.a.a(v9Var, d4Var);
                }
                a.a(str, "verification_network");
                j8Var.d.getClass();
                Map map = jgp.b;
                if (!ttp0.g(map)) {
                    map = null;
                }
                if (map == null) {
                    map = new LinkedHashMap();
                }
                String a2 = l8.a(adQualityVerificationResult);
                if (a2 == null) {
                    map.put("verification_status", StringUtils.UNDEFINED);
                } else {
                    map.put("verification_status", a2);
                }
                boolean z = adQualityVerificationResult instanceof AdQualityVerificationResult.Verified;
                if (z) {
                    ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd();
                    throw null;
                }
                map.put("verification_flow", StringUtils.UNDEFINED);
                if (z) {
                    ((AdQualityVerificationResult.Verified) adQualityVerificationResult).getVerifiedAd();
                    throw null;
                }
                if (adQualityVerificationResult instanceof AdQualityVerificationResult.NotVerified) {
                    ((AdQualityVerificationResult.NotVerified) adQualityVerificationResult).getReason();
                }
                map.put("status", "error");
                c cVar = a.b;
                if (cVar == null) {
                    cVar = null;
                }
                LinkedHashMap n = pn00.n(a.a, map);
                LinkedHashMap linkedHashMap = ttp0.g(n) ? n : null;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                dp2 dp2Var = dp2.c;
                fp2 fp2Var = new fp2("ad_verification_result", new LinkedHashMap(linkedHashMap), cVar);
                ((mv3) j8Var.b).getClass();
                tv3 tv3Var = tv3.a;
                cf.a(context, new gr3(((mv3) j8Var.b).a)).a(fp2Var);
            }
            ((a9) this.g.getValue()).onInvalidated();
        }
    }

    public final boolean b() {
        qu2 a = gx2.a().a(this.b);
        f8 f8Var = a != null ? a.y0 : null;
        return f8Var != null && f8Var.a;
    }

    public /* synthetic */ t8(d4 d4Var, ov2 ov2Var, Context context) {
        this(d4Var, context, new j8(d4Var, ov2Var));
    }
}
