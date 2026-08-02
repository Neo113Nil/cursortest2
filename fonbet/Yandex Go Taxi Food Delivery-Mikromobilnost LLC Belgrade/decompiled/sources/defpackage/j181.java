package defpackage;

import android.content.Context;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult$WaitingForVerification;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import yads.gz;
import yads.n7;

/* loaded from: classes7.dex */
public final class j181 {
    public final Context a;
    public final s421 b;
    public final AdQualityVerificationResult$WaitingForVerification c;
    public final i3y d;

    public j181(Context context, fe81 fe81Var, v981 v981Var) {
        s421 s421Var = new s421(fe81Var, v981Var);
        this.a = context;
        this.b = s421Var;
        this.c = AdQualityVerificationResult$WaitingForVerification.INSTANCE;
        this.d = a.a(new n7(this));
    }

    public final void a() {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(this.a);
        jl61 jl61Var = a != null ? a.y0 : null;
        if (jl61Var == null || !jl61Var.a) {
            return;
        }
        AdQualityVerificationResult$WaitingForVerification adQualityVerificationResult$WaitingForVerification = this.c;
        if (adQualityVerificationResult$WaitingForVerification == null) {
            s421 s421Var = this.b;
            Context context = this.a;
            s421Var.getClass();
            x781 x781Var = (x781) s421Var.w;
            fe81 fe81Var = (fe81) s421Var.b;
            x781Var.getClass();
            gz.b.getClass();
            hn71 a2 = x781Var.a.a(fe81Var, null);
            ((jc71) s421Var.x).getClass();
            Map f = b.f();
            if (!ym11.h(f)) {
                f = null;
            }
            if (f == null) {
                f = new LinkedHashMap();
            }
            if (adQualityVerificationResult$WaitingForVerification == null) {
                w511.b();
                return;
            }
            f.put("verification_status", "Verification not started");
            f.put("verification_flow", StringUtils.UNDEFINED);
            f.put(ACSPConstants.STATUS, "error");
            no61 no61Var = (no61) a2.c;
            if (no61Var == null) {
                no61Var = null;
            }
            LinkedHashMap n = b.n((Map) a2.b, f);
            LinkedHashMap linkedHashMap = ym11.h(n) ? n : null;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            zj71 zj71Var = new zj71("ad_verification_result", new LinkedHashMap(linkedHashMap), no61Var);
            ((v981) s421Var.c).getClass();
            wfa1.b(context, new m771(((n291) ((v981) s421Var.c)).a)).c(zj71Var);
        }
        ((eo81) this.d.getValue()).onInvalidated();
    }
}
