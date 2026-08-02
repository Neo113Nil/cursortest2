package xsna;

import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.network.proxy.verifier.VkProxyPoll;
import kotlin.Pair;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* compiled from: VkProxyVerifiers.kt */
/* loaded from: classes.dex */
public final class uwu0 implements qev0 {
    public final cj00 b;
    public final pev0 c;
    public final hju0 d;

    public uwu0(cj00 cj00Var, pev0 pev0Var) {
        this.b = cj00Var;
        this.c = pev0Var;
        this.d = new hju0(pev0Var, 2);
    }

    @Override // xsna.qev0
    public final VkProxyPoll d() {
        Pair pair;
        String str;
        VkProxyPoll d = this.d.d();
        try {
            String a = ((ny70) this.b.b).a(this.c.g);
            if (a == null) {
                pair = new Pair(Boolean.FALSE, "");
            } else {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"Result of internal.api.vk.ru | account.getGeoByIp - ".concat(a)});
                }
                JSONObject optJSONObject = new JSONObject(a).optJSONObject("response");
                int optInt = optJSONObject != null ? optJSONObject.optInt("res") : 0;
                if (optJSONObject == null || (str = optJSONObject.optString(CandidateTypeHintConfig.TYPE_HOST)) == null) {
                    str = "";
                }
                pair = new Pair(Boolean.valueOf(optInt > 0), str);
            }
        } catch (Exception unused) {
            pair = new Pair(Boolean.FALSE, "");
        }
        boolean booleanValue = ((Boolean) pair.d()).booleanValue();
        String str2 = (String) pair.g();
        pev0 pev0Var = this.c;
        synchronized (pev0Var) {
            if (!drm0.N(str2)) {
                pev0Var.f.invoke(str2);
            }
        }
        if (this.c.a.a.invoke().booleanValue() && !Preference.d("NetworkProxy", "proxy_user_state_changed", false)) {
            return VkProxyPoll.SUCCESS;
        }
        VkProxyPoll vkProxyPoll = VkProxyPoll.ERROR;
        return (d.compareTo(vkProxyPoll) >= 0 && booleanValue) ? VkProxyPoll.CANCEL : booleanValue ? VkProxyPoll.NEXT : !enj.n(this.b.a) ? VkProxyPoll.CANCEL : vkProxyPoll;
    }
}
