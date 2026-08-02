package xsna;

import android.os.Looper;
import android.util.Log;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.hil0;
import xsna.rvn;
import xsna.uvn;
import xsna.v390;

/* compiled from: OverrideDomainRepository.kt */
/* loaded from: classes.dex */
public final class y390 {
    public static final dsw<UserId, v390> a = new dsw<>();
    public static final long b;

    /* compiled from: OverrideDomainRepository.kt */
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:51:0x032f, code lost:
        
            if (((int) (r3 + (r6 & (((r3 ^ r6) & ((-r3) | r3)) >> 63)))) < r1) goto L111;
         */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0340 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02d6  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0058  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static v390 a() {
            v390 v390Var;
            String str;
            Object failure;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            v390 v390Var2;
            JSONObject jSONObject;
            JSONObject optJSONObject;
            Set set;
            int i;
            UserId userId;
            if (BuildInfo.h()) {
                String string = Preference.j().getString("forceOverrideDomain", "");
                String str7 = string != null ? string : "";
                if (str7.length() > 0) {
                    rvn rvnVar = new rvn(pn00.k(new Pair("vk.com", str7), new Pair("vk.ru", str7)));
                    uvn uvnVar = new uvn(rl3.y0(new String[]{"vk.com", "vk.ru"}));
                    v390Var = new v390(rvnVar, rvnVar, rvnVar, rvnVar, rvnVar, rvnVar, rvnVar, rvnVar, uvnVar, uvnVar, 4);
                    if (v390Var == null) {
                        return v390Var;
                    }
                    w390.a.getClass();
                    UserId a = w390.a();
                    dsw<UserId, v390> dswVar = y390.a;
                    v390 v390Var3 = epx.f(dswVar.b, a) ? dswVar.a : null;
                    if (v390Var3 == null) {
                        String a2 = usm0.a();
                        if (a2 == null) {
                            str2 = "override_web_wiki_domain";
                            str5 = "override_no_web_ssl";
                            str3 = "override_domain_for_anon";
                            str4 = "override_web_core_domain";
                            v390Var2 = null;
                            str6 = "override_web_domain";
                        } else {
                            L l = L.a;
                            l.getClass();
                            if (L.m(LoggerOutputTarget.NONE)) {
                                str = "override_no_web_ssl";
                            } else {
                                str = "override_no_web_ssl";
                                L.u(l, L.LogType.d, new Object[]{"Override domain source: Studilka"});
                            }
                            v390.p.getClass();
                            try {
                                try {
                                    failure = new JSONObject(a2);
                                } catch (Throwable th) {
                                    failure = new Result.Failure(th);
                                }
                                if (failure instanceof Result.Failure) {
                                    failure = null;
                                }
                                jSONObject = (JSONObject) failure;
                            } catch (Exception e) {
                                e = e;
                                str2 = "override_web_wiki_domain";
                                str3 = "override_domain_for_anon";
                                str4 = "override_web_core_domain";
                                str5 = str;
                                str6 = "override_web_domain";
                                L.j(e, "OverrideDomainConfig");
                                v390Var2 = null;
                                if (v390Var2 != null) {
                                }
                                long j = v390Var3.n;
                                if (v390Var3.a()) {
                                }
                                userId = a;
                                v390.p.getClass();
                                v390Var3 = v390.q;
                                dsw<UserId, v390> dswVar2 = y390.a;
                                dswVar2.b = userId;
                                dswVar2.a = v390Var3;
                                return v390Var3;
                            }
                            if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("override_domain")) == null) {
                                str2 = "override_web_wiki_domain";
                                str3 = "override_domain_for_anon";
                                str4 = "override_web_core_domain";
                                str5 = str;
                                str6 = "override_web_domain";
                                v390Var2 = null;
                            } else {
                                JSONArray optJSONArray = optJSONObject.optJSONArray("override_domains_restrict_to_stores");
                                if (optJSONArray == null) {
                                    optJSONArray = optJSONObject.optJSONArray("restrict_to_stores");
                                }
                                if (optJSONArray != null) {
                                    k9x q = swe0.q(0, optJSONArray.length());
                                    set = new LinkedHashSet();
                                    j9x it = q.iterator();
                                    while (it.hasNext()) {
                                        j9x j9xVar = it;
                                        hil0 a3 = hil0.a.a(optJSONArray.getString(j9xVar.nextInt()));
                                        if (a3 != null) {
                                            set.add(a3);
                                        }
                                        it = j9xVar;
                                    }
                                } else {
                                    set = EmptySet.b;
                                }
                                Set set2 = set;
                                int i2 = rvn.c;
                                rvn a4 = rvn.a.a(optJSONObject.optString("override_api_domain"));
                                rvn a5 = rvn.a.a(optJSONObject.optString("override_web_domain"));
                                str4 = "override_web_core_domain";
                                try {
                                    rvn a6 = rvn.a.a(optJSONObject.optString(str4));
                                    rvn a7 = rvn.a.a(optJSONObject.optString("override_web_wiki_domain"));
                                    rvn a8 = rvn.a.a(optJSONObject.optString("override_web_sdk_auth_domain"));
                                    rvn a9 = rvn.a.a(optJSONObject.optString("override_web_validation_domain"));
                                    rvn a10 = rvn.a.a(optJSONObject.optString("override_web_payments_domain"));
                                    rvn a11 = rvn.a.a(optJSONObject.optString("override_web_away_domain"));
                                    uvn uvnVar2 = uvn.b;
                                    str5 = str;
                                    try {
                                        str6 = "override_web_domain";
                                        str2 = "override_web_wiki_domain";
                                        try {
                                            str3 = "override_domain_for_anon";
                                        } catch (Exception e2) {
                                            e = e2;
                                            str3 = "override_domain_for_anon";
                                            L.j(e, "OverrideDomainConfig");
                                            v390Var2 = null;
                                            if (v390Var2 != null) {
                                            }
                                            long j2 = v390Var3.n;
                                            if (v390Var3.a()) {
                                            }
                                            userId = a;
                                            v390.p.getClass();
                                            v390Var3 = v390.q;
                                            dsw<UserId, v390> dswVar22 = y390.a;
                                            dswVar22.b = userId;
                                            dswVar22.a = v390Var3;
                                            return v390Var3;
                                        }
                                        try {
                                            v390Var2 = new v390(a4, a5, set2, a6, a7, a8, a9, a10, a11, uvn.a.a(optJSONObject.optString("override_away_skip_domain")), v390.a.a(optJSONObject.optString("override_web_ssl_skip_domain"), rvn.a.a(optJSONObject.optString("override_ssl_skip_domain"))), optJSONObject.optBoolean("override_no_away"), optJSONObject.optBoolean(str5), optJSONObject.optLong("override_domain_part", 100L), optJSONObject.optBoolean(str3, true));
                                        } catch (Exception e3) {
                                            e = e3;
                                            L.j(e, "OverrideDomainConfig");
                                            v390Var2 = null;
                                            if (v390Var2 != null) {
                                            }
                                            long j22 = v390Var3.n;
                                            if (v390Var3.a()) {
                                            }
                                            userId = a;
                                            v390.p.getClass();
                                            v390Var3 = v390.q;
                                            dsw<UserId, v390> dswVar222 = y390.a;
                                            dswVar222.b = userId;
                                            dswVar222.a = v390Var3;
                                            return v390Var3;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str2 = "override_web_wiki_domain";
                                        str6 = "override_web_domain";
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str2 = "override_web_wiki_domain";
                                    str6 = "override_web_domain";
                                    str3 = "override_domain_for_anon";
                                    str5 = str;
                                }
                            }
                        }
                        if (v390Var2 != null) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l2, L.LogType.d, new Object[]{"Override domain source: FB"});
                            }
                            v390.p.getClass();
                            if (!epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                                Log.e("OverrideDomainConfig", "Metric prefs are to be initialized from a non-main thread.");
                            }
                            fjr.a.getClass();
                            i = 0;
                            List c0 = drm0.c0(fjr.d("override_domains_restrict_to_stores"), new String[]{StringUtils.COMMA}, 0, 6);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it2 = c0.iterator();
                            while (it2.hasNext()) {
                                hil0 a12 = hil0.a.a((String) it2.next());
                                if (a12 != null) {
                                    linkedHashSet.add(a12);
                                }
                            }
                            int i3 = rvn.c;
                            fjr fjrVar = fjr.a;
                            fjrVar.getClass();
                            rvn a13 = rvn.a.a(fjr.d("override_api_domain"));
                            rvn a14 = rvn.a.a(fjr.d(str6));
                            rvn a15 = rvn.a.a(fjr.d(str4));
                            rvn a16 = rvn.a.a(fjr.d(str2));
                            rvn a17 = rvn.a.a(fjr.d("override_web_sdk_auth_domain"));
                            rvn a18 = rvn.a.a(fjr.d("override_web_validation_domain"));
                            rvn a19 = rvn.a.a(fjr.d("override_web_payments_domain"));
                            rvn a20 = rvn.a.a(fjr.d("override_web_away_domain"));
                            uvn uvnVar3 = uvn.b;
                            v390Var3 = new v390(a13, a14, linkedHashSet, a15, a16, a17, a18, a19, a20, uvn.a.a(fjr.d("override_away_skip_domain")), v390.a.a(fjr.d("override_web_ssl_skip_domain"), rvn.a.a(fjr.d("override_ssl_skip_domain"))), fjr.b(fjrVar, "override_no_away"), fjr.b(fjrVar, str5), fjr.c(), fjr.a(str3, true));
                        } else {
                            i = 0;
                            v390Var3 = v390Var2;
                        }
                        long j222 = v390Var3.n;
                        if (v390Var3.a()) {
                            if ((!v390Var3.o || fkq0.c(a)) && j222 < 100) {
                                long j3 = 0;
                                if (j222 != 0) {
                                    userId = a;
                                    while (i < String.valueOf(userId.b).length()) {
                                        j3 = (j3 * 31) + r6.charAt(i);
                                        i++;
                                    }
                                    long j4 = (j3 ^ y390.b) % 100;
                                }
                            } else {
                                userId = a;
                            }
                            dsw<UserId, v390> dswVar2222 = y390.a;
                            dswVar2222.b = userId;
                            dswVar2222.a = v390Var3;
                        }
                        userId = a;
                        v390.p.getClass();
                        v390Var3 = v390.q;
                        dsw<UserId, v390> dswVar22222 = y390.a;
                        dswVar22222.b = userId;
                        dswVar22222.a = v390Var3;
                    }
                    return v390Var3;
                }
            }
            v390Var = null;
            if (v390Var == null) {
            }
        }
    }

    static {
        long j = 0;
        for (int i = 0; i < 18; i++) {
            j = (j * 31) + "override_domain_v1".charAt(i);
        }
        b = j;
    }
}
