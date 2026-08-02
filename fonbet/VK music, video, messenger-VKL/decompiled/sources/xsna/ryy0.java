package xsna;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.URLUtil;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.l0n;
import xsna.syy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ryy0 {
    public final xhz0 a;
    public final jkz0 b;
    public final u6z0 c;
    public String d;

    public ryy0(u6z0 u6z0Var, jkz0 jkz0Var) {
        this.b = jkz0Var;
        this.c = u6z0Var;
        this.a = new xhz0(jkz0Var);
    }

    public static String a(JSONObject jSONObject, xla xlaVar, ooy0 ooy0Var) {
        String str = null;
        if (!jSONObject.has("src") && !jSONObject.has("source")) {
            xlaVar.b(iaz0.n);
            ooy0Var.a("src").g(3006);
            ooy0Var.a("source").g(3006);
            return null;
        }
        String optString = jSONObject.optString("src", "");
        if (!TextUtils.isEmpty(optString)) {
            try {
                str = new String(Base64.decode(optString, 0));
            } catch (Throwable unused) {
            }
            if (str != null) {
                return str;
            }
        }
        String optString2 = jSONObject.optString("source", "");
        return !TextUtils.isEmpty(optString2) ? s770.b(optString2) : str;
    }

    public static g9y0 b(JSONObject jSONObject, String str, uez0 uez0Var, String str2) {
        if (jSONObject.has("bannerID")) {
            String optString = jSONObject.optString("bannerID");
            if (TextUtils.isEmpty(optString)) {
                uez0Var.b("bannerID").c(3007);
            } else {
                str2 = optString;
            }
        } else if (jSONObject.has("id")) {
            String optString2 = jSONObject.optString("id");
            if (TextUtils.isEmpty(optString2)) {
                uez0Var.b("id").c(3007);
            } else {
                str2 = optString2;
            }
        } else {
            uez0Var.b("bannerID").c(3006);
        }
        return new g9y0(str2, wn4.f(str, jSONObject), wn4.f("padId", jSONObject), wn4.f("patternId", jSONObject), wn4.c(jSONObject, "dspId"), wn4.e(jSONObject));
    }

    public static void d(JSONObject jSONObject, xey0 xey0Var) {
        if (jSONObject != null && jSONObject.optBoolean("detailedMonitoringPixelsEnabled")) {
            String str = xey0Var.T.a.a;
            HashSet hashSet = new HashSet();
            hashSet.add("show");
            hashSet.add("playbackStarted");
            hashSet.add("playheadViewabilityValue");
            Iterator it = hashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += xey0Var.a.j((String) it.next()).c.size();
            }
            synchronized (ziz0.a(str)) {
                try {
                    ConcurrentHashMap concurrentHashMap = ziz0.b;
                    if (!concurrentHashMap.containsKey(str)) {
                        ConcurrentHashMap concurrentHashMap2 = ziz0.c;
                        if (!concurrentHashMap2.containsKey(str)) {
                            concurrentHashMap.put(str, hashSet);
                            concurrentHashMap2.put(str, Integer.valueOf(i));
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(92:0|1|(1:3)(2:366|(1:368))|4|(3:6|(1:10)|11)(1:365)|12|(1:14)|15|(1:17)|18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|(1:364)(1:42)|43|(1:45)(1:363)|46|(1:48)(1:362)|49|(2:51|(1:53)(1:358))(2:359|(63:361|55|(1:59)|60|(1:62)(1:(1:357))|63|(1:65)|66|(1:68)(1:355)|69|(1:71)(8:278|(1:280)(2:348|(2:353|354)(6:352|282|(1:284)(3:294|(5:297|(1:299)(1:346)|(2:301|302)(11:304|(1:310)|311|(1:313)(2:342|(1:344)(7:345|(1:316)(6:328|(1:330)(1:341)|331|(1:333)|334|(4:340|318|(1:327)|(1:326)(2:324|325)))|317|318|(1:320)|327|(0)(0)))|314|(0)(0)|317|318|(0)|327|(0)(0))|303|295)|347)|285|286|(2:288|(2:290|(1:292)))))|281|282|(0)(0)|285|286|(0))|72|73|(8:75|(1:77)|78|(1:80)|81|(4:84|(1:90)(3:86|87|88)|89|82)|91|92)(6:254|(1:256)|257|(3:259|(1:268)|270)(2:275|(1:277))|271|(1:273)(1:274))|93|(2:95|(1:(1:98))(1:99))|100|(1:102)|103|(1:105)|106|(1:108)|109|(2:111|(1:116)(1:115))|117|(1:120)|(1:126)|127|(1:129)|(2:131|(1:133)(2:134|(1:136)))|137|(1:139)|140|(1:142)(2:242|(2:244|(1:246)(1:247))(2:248|(2:250|(1:252)(1:253))))|143|(2:145|(1:147)(2:148|(1:150)))|151|(1:153)|154|(2:156|(2:158|(1:160))(2:161|(1:163)))|164|(6:166|(2:168|(1:173)(1:172))|174|(2:176|(1:178)(1:179))|180|(1:182)(2:183|(1:188)(1:187)))|189|(1:191)|192|(2:227|(4:231|232|233|(17:239|(1:196)|197|198|199|(12:222|223|202|203|(8:218|219|206|(5:214|215|209|210|211)|208|209|210|211)|205|206|(0)|208|209|210|211)|201|202|203|(0)|205|206|(0)|208|209|210|211)))|194|(0)|197|198|199|(0)|201|202|203|(0)|205|206|(0)|208|209|210|211))|54|55|(2:57|59)|60|(0)(0)|63|(0)|66|(0)(0)|69|(0)(0)|72|73|(0)(0)|93|(0)|100|(0)|103|(0)|106|(0)|109|(0)|117|(1:120)|(3:122|124|126)|127|(0)|(0)|137|(0)|140|(0)(0)|143|(0)|151|(0)|154|(0)|164|(0)|189|(0)|192|(0)|194|(0)|197|198|199|(0)|201|202|203|(0)|205|206|(0)|208|209|210|211) */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x03ab, code lost:
    
        if (android.text.TextUtils.isEmpty(r8.c) == false) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x076f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0760 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0751 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0462  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(JSONObject jSONObject, xey0 xey0Var, ooy0 ooy0Var) {
        String str;
        wey0 wey0Var;
        int i;
        String c;
        String optString;
        String optString2;
        su9 su9Var;
        syy0 syy0Var;
        q5o q5oVar;
        e5z0 e5z0Var;
        JSONArray jSONArray;
        su9 su9Var2;
        String str2;
        int i2;
        su9 su9Var3;
        boolean z;
        String str3;
        int i3;
        kxy0 kxy0Var;
        boolean z2;
        l0n l0nVar;
        String optString3;
        String optString4;
        String optString5;
        boolean has;
        String optString6;
        String optString7;
        int i4;
        wty0 wty0Var;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        URL url;
        String host;
        boolean startsWith;
        JSONObject optJSONObject3;
        boolean optBoolean;
        boolean optBoolean2;
        boolean optBoolean3;
        ooy0 ooy0Var2 = ooy0Var;
        e5z0 e5z0Var2 = xey0Var.a;
        jkz0 jkz0Var = this.b;
        Boolean bool = jkz0Var.I;
        if (bool != null) {
            Boolean.TRUE.equals(bool);
        } else if (jSONObject.has("logErrors")) {
            Boolean.TRUE.equals(Boolean.valueOf(jSONObject.optBoolean("logErrors", true)));
        }
        String optString8 = jSONObject.optString("id");
        this.d = optString8;
        if (TextUtils.isEmpty(optString8)) {
            if (!jSONObject.has("bannerID") && ooy0Var2.c) {
                ooy0Var2.a("bannerID").b(3006);
            }
            this.d = jSONObject.optString("bannerID", xey0Var.F);
        } else {
            ooy0Var2.a("id").g(3004);
        }
        xey0Var.F = this.d;
        wey0 wey0Var2 = xey0Var.S;
        String str4 = "type";
        String optString9 = jSONObject.optString("type");
        if (!TextUtils.isEmpty(optString9)) {
            xey0Var.E = optString9;
        }
        String str5 = "width";
        xey0Var.B = jSONObject.optInt("width", xey0Var.g());
        xey0Var.C = jSONObject.optInt("height", xey0Var.q());
        xey0Var.m(jSONObject.optString("discount", xey0Var.o()));
        xey0Var.Q = jSONObject.optString("newPrice", xey0Var.Q);
        xey0Var.p(jSONObject.optString("oldPrice", xey0Var.b()));
        String optString10 = jSONObject.optString("ageRestrictions");
        if (!TextUtils.isEmpty(optString10)) {
            xey0Var.h = optString10;
        }
        String optString11 = jSONObject.optString("erid");
        if (!TextUtils.isEmpty(optString11)) {
            xey0Var.i = optString11;
        }
        String optString12 = jSONObject.optString("deeplink");
        if (!TextUtils.isEmpty(optString12)) {
            xey0Var.I = optString12;
        }
        String optString13 = jSONObject.optString("trackingLink");
        if (!TextUtils.isEmpty(optString13)) {
            xey0Var.J = optString13;
        }
        String optString14 = jSONObject.optString("ctaLink");
        if (!TextUtils.isEmpty(optString14)) {
            xey0Var.K = optString14;
        }
        String optString15 = jSONObject.optString("bundle_id");
        if (!TextUtils.isEmpty(optString15)) {
            xey0Var.H = optString15;
        }
        String optString16 = jSONObject.optString("urlscheme");
        if (!TextUtils.isEmpty(optString16)) {
            xey0Var.G = optString16;
        }
        boolean z3 = ooy0Var2.c;
        if (z3 && TextUtils.isEmpty(optString13) && TextUtils.isEmpty(optString14)) {
            str = optString14;
            ooy0Var2.a("trackingLink").g(3006);
            ooy0Var2.a("ctaLink").g(3006);
        } else {
            str = optString14;
        }
        Boolean bool2 = jkz0Var.D;
        xey0Var.w = bool2 != null ? bool2.booleanValue() : jSONObject.optBoolean("openInBrowser", xey0Var.w);
        Boolean bool3 = jkz0Var.C;
        xey0Var.x = bool3 != null ? bool3.booleanValue() : jSONObject.optBoolean("directLink", xey0Var.x);
        xey0Var.R = jSONObject.optString("paidType", xey0Var.R);
        String optString17 = jSONObject.optString("navigationType");
        if (TextUtils.isEmpty(optString17)) {
            wey0Var = wey0Var2;
            if (z3) {
                i = 3006;
                ooy0Var2.a("navigationType").g(3006);
                c = b920.c(jSONObject, "storeType");
                xey0Var.q = c;
                if (TextUtils.isEmpty(c) && X3.i.U.equals(optString17)) {
                    ooy0Var2.a("storeType").g(i);
                }
                optString = jSONObject.optString("title");
                if (TextUtils.isEmpty(optString)) {
                    xey0Var.f = optString;
                } else if (z3) {
                    ooy0Var2.a("title").g(3006);
                }
                optString2 = jSONObject.optString("description");
                if (!TextUtils.isEmpty(optString2)) {
                    xey0Var.c = optString2;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("disclaimerInfo");
                su9Var = optJSONObject4 != null ? null : new su9(optJSONObject4, ooy0Var2.a("disclaimerInfo"));
                if (su9Var != null) {
                    e5z0Var = e5z0Var2;
                    z2 = z3;
                } else {
                    syy0Var = new syy0();
                    syy0Var.a = su9Var.c("id");
                    syy0Var.d = su9Var.c("percent");
                    syy0Var.b = su9Var.d("alias");
                    syy0Var.c = su9Var.d("text");
                    ooy0 a = ((ooy0) su9Var.c).a("images");
                    JSONObject jSONObject2 = (JSONObject) su9Var.b;
                    if (jSONObject2.has("images")) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
                        if (optJSONArray == null || optJSONArray.length() == 0) {
                            a.g(3007);
                        } else {
                            q5oVar = new q5o(optJSONArray, a);
                            ArrayList arrayList = new ArrayList();
                            if (q5oVar != null) {
                                e5z0Var = e5z0Var2;
                            } else {
                                JSONArray jSONArray2 = (JSONArray) q5oVar.c;
                                e5z0Var = e5z0Var2;
                                int i5 = 0;
                                while (i5 < jSONArray2.length()) {
                                    ooy0 f = ((ooy0) q5oVar.b).f(i5);
                                    q5o q5oVar2 = q5oVar;
                                    JSONObject optJSONObject5 = jSONArray2.optJSONObject(i5);
                                    if (optJSONObject5 == null) {
                                        jSONArray = jSONArray2;
                                        f.g(3007);
                                        su9Var2 = null;
                                    } else {
                                        jSONArray = jSONArray2;
                                        su9Var2 = new su9(optJSONObject5, f);
                                    }
                                    if (su9Var2 == null) {
                                        z = z3;
                                        str2 = str4;
                                        str3 = str5;
                                        i2 = i5;
                                    } else {
                                        syy0.a aVar = new syy0.a();
                                        String d = su9Var2.d(str4);
                                        str2 = str4;
                                        ooy0 ooy0Var3 = (ooy0) su9Var2.c;
                                        aVar.a = d;
                                        i2 = i5;
                                        if (d != null && !d.equals(X3.i.D) && !d.equals(X3.i.C)) {
                                            ooy0Var3.h(3007, aVar.a);
                                            aVar.a = null;
                                        }
                                        aVar.b = su9Var2.c("minHeight");
                                        ooy0 a2 = ooy0Var3.a("image");
                                        JSONObject jSONObject3 = (JSONObject) su9Var2.b;
                                        if (jSONObject3.has("image")) {
                                            JSONObject optJSONObject6 = jSONObject3.optJSONObject("image");
                                            if (optJSONObject6 == null) {
                                                a2.g(3007);
                                            } else {
                                                su9Var3 = new su9(optJSONObject6, a2);
                                                if (su9Var3 != null) {
                                                    z = z3;
                                                    str3 = str5;
                                                } else {
                                                    ooy0 ooy0Var4 = (ooy0) su9Var3.c;
                                                    kxy0 kxy0Var2 = new kxy0();
                                                    kxy0Var2.a = su9Var3.d("url");
                                                    int c2 = su9Var3.c(str5);
                                                    kxy0Var2.b = c2;
                                                    if (c2 <= 0) {
                                                        str3 = str5;
                                                        z = z3;
                                                        i3 = 3007;
                                                        ooy0Var4.a(str5).h(3007, Integer.toString(kxy0Var2.b));
                                                    } else {
                                                        z = z3;
                                                        str3 = str5;
                                                        i3 = 3007;
                                                    }
                                                    int c3 = su9Var3.c("height");
                                                    kxy0Var2.c = c3;
                                                    if (c3 <= 0) {
                                                        ooy0Var4.a("height").h(i3, Integer.toString(kxy0Var2.c));
                                                    }
                                                    if (!TextUtils.isEmpty(kxy0Var2.a) && kxy0Var2.b > 0 && kxy0Var2.c > 0) {
                                                        kxy0Var = kxy0Var2;
                                                        aVar.c = kxy0Var;
                                                        if (aVar.a != null || aVar.b <= 0 || kxy0Var == null) {
                                                            aVar = null;
                                                        }
                                                        if (aVar != null) {
                                                            arrayList.add(aVar);
                                                        }
                                                    }
                                                }
                                                kxy0Var = null;
                                                aVar.c = kxy0Var;
                                                if (aVar.a != null) {
                                                }
                                                aVar = null;
                                                if (aVar != null) {
                                                }
                                            }
                                        } else {
                                            a2.g(3006);
                                        }
                                        su9Var3 = null;
                                        if (su9Var3 != null) {
                                        }
                                        kxy0Var = null;
                                        aVar.c = kxy0Var;
                                        if (aVar.a != null) {
                                        }
                                        aVar = null;
                                        if (aVar != null) {
                                        }
                                    }
                                    i5 = i2 + 1;
                                    q5oVar = q5oVar2;
                                    jSONArray2 = jSONArray;
                                    str4 = str2;
                                    str5 = str3;
                                    z3 = z;
                                }
                            }
                            z2 = z3;
                            syy0Var.e.addAll(arrayList);
                            if (syy0Var.a != -1) {
                                if (syy0Var.d != -1) {
                                    if (!TextUtils.isEmpty(syy0Var.b)) {
                                    }
                                }
                            }
                        }
                    } else {
                        a.g(3006);
                    }
                    q5oVar = null;
                    ArrayList arrayList2 = new ArrayList();
                    if (q5oVar != null) {
                    }
                    z2 = z3;
                    syy0Var.e.addAll(arrayList2);
                    if (syy0Var.a != -1) {
                    }
                }
                syy0Var = null;
                if (syy0Var == null) {
                    int i6 = syy0Var.a;
                    String str6 = syy0Var.c;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = syy0Var.b;
                    if (str7 == null) {
                        str7 = "";
                    }
                    l0nVar = new l0n(i6, syy0Var.d, str6, str7);
                    Iterator it = syy0Var.e.iterator();
                    while (it.hasNext()) {
                        syy0.a aVar2 = (syy0.a) it.next();
                        kxy0 kxy0Var3 = aVar2.c;
                        if (kxy0Var3 != null) {
                            l0nVar.e.put(aVar2.a, new l0n.a(aVar2.b, kxy0Var3.a, kxy0Var3.b, kxy0Var3.c));
                        }
                    }
                    xey0Var.z = l0nVar.a;
                    xey0Var.g = l0nVar.c;
                } else {
                    String optString18 = jSONObject.optString("disclaimer");
                    if (!TextUtils.isEmpty(optString18)) {
                        xey0Var.g = optString18;
                    }
                    if (jSONObject.has("disclaimer_id")) {
                        int optInt = jSONObject.optInt("disclaimer_id", -1);
                        ooy0 a3 = ooy0Var2.a("disclaimer_id");
                        if (optInt != 0 && optInt != 3 && optInt != 4 && optInt != 5 && optInt != 6) {
                            switch (optInt) {
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                    break;
                                default:
                                    a3.c(3007, Integer.toString(optInt));
                                    optInt = 0;
                                    break;
                            }
                        }
                        xey0Var.z = optInt;
                    } else if (jSONObject.has("disclaimer")) {
                        ooy0Var2.a("disclaimer_id").h(3006, "has disclaimer, but has no disclaimer_id");
                    }
                    int i7 = xey0Var.z;
                    l0nVar = i7 == 0 ? null : new l0n(i7, xey0Var.g);
                }
                xey0Var.A = l0nVar;
                if (jSONObject.has("votes")) {
                    int optInt2 = jSONObject.optInt("votes", -1);
                    if (optInt2 >= 0) {
                        xey0Var.k = Integer.valueOf(optInt2);
                    } else if (z2) {
                        ooy0Var2.a("votes").h(3007, String.valueOf(jSONObject.opt("votes")));
                    }
                }
                optString3 = jSONObject.optString("category");
                if (!TextUtils.isEmpty(optString3)) {
                    xey0Var.l = optString3;
                }
                optString4 = jSONObject.optString("subcategory");
                if (!TextUtils.isEmpty(optString4)) {
                    xey0Var.n = optString4;
                }
                optString5 = jSONObject.optString(X3.j.D);
                if (!TextUtils.isEmpty(optString5)) {
                    xey0Var.o = optString5;
                }
                xey0Var.D = (float) jSONObject.optDouble("duration", xey0Var.D);
                if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
                    float optDouble = (float) jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d);
                    double d2 = optDouble;
                    if (d2 > 5.0d || d2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        ooy0Var2.a(CampaignEx.JSON_KEY_STAR).h(3007, Float.toString(optDouble));
                    } else {
                        xey0Var.j = Float.valueOf(optDouble);
                    }
                }
                has = jSONObject.has("ctaText");
                xey0Var.d = jSONObject.optString("ctaText", xey0Var.n());
                if (!TextUtils.isEmpty(str) && !has) {
                    ooy0Var2.a("ctaText").g(3006);
                }
                if (has && TextUtils.isEmpty(str) && TextUtils.isEmpty(optString13)) {
                    ooy0Var2.a("ctaText").h(3008, "ctaText is not empty, but ctaLink and trackingLink are empty");
                }
                optString6 = jSONObject.optString("iconLink");
                int optInt3 = jSONObject.optInt("iconWidth");
                int optInt4 = jSONObject.optInt("iconHeight");
                if (!TextUtils.isEmpty(optString6)) {
                    xey0Var.u = kiw.b(optInt3, optInt4, optString6);
                }
                if (z2) {
                    if (TextUtils.isEmpty(optString6)) {
                        ooy0Var2.a("iconLink").g(3006);
                    } else if (!s770.k(optString6)) {
                        ooy0Var2.a("iconLink").h(3007, optString6);
                    }
                }
                optString7 = jSONObject.optString("imageLink");
                int optInt5 = jSONObject.optInt("imageWidth");
                int optInt6 = jSONObject.optInt("imageHeight");
                if (!TextUtils.isEmpty(optString7)) {
                    xey0Var.t = kiw.b(optInt5, optInt6, optString7);
                }
                TextUtils.isEmpty(jSONObject.optString("imageDominantColor"));
                i4 = jkz0Var.r;
                if (i4 < 0) {
                    xey0Var.v = new k6z0(i4);
                } else if (jSONObject.has("clickArea")) {
                    int optInt7 = jSONObject.optInt("clickArea");
                    if (optInt7 <= 0) {
                        ooy0Var2.a("clickArea").h(3007, Integer.toString(optInt7));
                    } else {
                        xey0Var.v = new k6z0(optInt7);
                    }
                } else if (jSONObject.has("extendedClickArea")) {
                    ooy0Var2.a("extendedClickArea").g(3004);
                    if (jSONObject.optBoolean("extendedClickArea", true)) {
                        xey0Var.v = k6z0.p;
                    } else {
                        xey0Var.v = k6z0.q;
                    }
                }
                String optString19 = jSONObject.optString("advertisingLabel", "");
                if (z2) {
                    if (!jSONObject.has("advertisingLabel")) {
                        ooy0Var2.a("advertisingLabel").g(3006);
                    } else if (TextUtils.isEmpty(optString19)) {
                        ooy0Var2.a("advertisingLabel").g(3007);
                    }
                }
                xey0Var.r = optString19;
                if (jSONObject.has("url_types")) {
                    xey0Var.s = Arrays.asList(jSONObject.optString("url_types").split(StringUtils.COMMA));
                }
                int i8 = this.c.g;
                wty0Var = jkz0Var.K;
                if (wty0Var == null) {
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("adChoices");
                    ooy0 a4 = ooy0Var2.a("adChoices");
                    if (optJSONObject7 != null) {
                        wty0Var = t4z0.b(optJSONObject7, a4);
                        if (wty0Var == null) {
                            a4.h(3007, "adChoices element is not parsed");
                        }
                    } else if (a4.c) {
                        a4.g(3006);
                    }
                }
                xey0Var.L = wty0Var;
                optJSONObject = jSONObject.optJSONObject("viewability");
                if (optJSONObject != null) {
                    ooy0 a5 = ooy0Var2.a("viewability");
                    ery0 ery0Var = xey0Var.b;
                    if (optJSONObject.has("percent")) {
                        int optInt8 = optJSONObject.optInt("percent");
                        if (optInt8 < 5 || optInt8 > 100) {
                            a5.a("percent").c(3007, Integer.toString(optInt8));
                        } else {
                            ery0Var.b = optInt8 / 100.0f;
                        }
                    }
                    if (optJSONObject.has("rate")) {
                        double optDouble2 = optJSONObject.optDouble("rate");
                        if (optDouble2 >= 0.01d) {
                            ery0Var.a = (float) optDouble2;
                        } else {
                            a5.a("rate").c(3007, Double.toString(optDouble2));
                        }
                    }
                    if (optJSONObject.has("duration")) {
                        float optDouble3 = (float) optJSONObject.optDouble("duration");
                        if (Float.isNaN(optDouble3) || optDouble3 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            a5.a("duration").h(3007, Float.toString(optDouble3));
                        } else {
                            ery0Var.c = optDouble3;
                        }
                    } else {
                        a5.a("duration").g(3006);
                    }
                }
                xey0Var.y = jSONObject.optBoolean("isAppInWhitelist", xey0Var.y);
                fwy fwyVar = jkz0Var.J;
                optJSONObject2 = jSONObject.optJSONObject("omdata");
                if (optJSONObject2 != null) {
                    fwyVar = hpt0.e(fwyVar, optJSONObject2);
                }
                xey0Var.M = fwyVar;
                if (!TextUtils.isEmpty(optString13)) {
                    String trim = optString13.trim();
                    if (!trim.isEmpty() && URLUtil.isHttpsUrl(trim)) {
                        try {
                            url = new URL(trim);
                            host = url.getHost();
                        } catch (MalformedURLException unused) {
                        }
                        if (!TextUtils.isEmpty(host) && (host.equals("mail.ru") || host.endsWith(".mail.ru"))) {
                            startsWith = url.getPath().startsWith("/redir");
                            if (!startsWith) {
                                ooy0Var2 = new ooy0(ooy0Var2.a, ooy0Var2.b, z2, false);
                            }
                            e5z0 e5z0Var3 = e5z0Var;
                            this.a.c(e5z0Var3, jSONObject, xey0Var.D, ooy0Var2);
                            optJSONObject3 = jSONObject.optJSONObject("featureFlags");
                            if (optJSONObject3 != null) {
                                try {
                                    optBoolean = optJSONObject3.optBoolean("ignoreBannerStatOnCardClick");
                                } catch (Throwable unused2) {
                                }
                                wey0 wey0Var3 = wey0Var;
                                wey0Var3.a = optBoolean;
                                if (optJSONObject3 != null) {
                                    try {
                                        optBoolean2 = optJSONObject3.optBoolean("useClickHandlerV2");
                                    } catch (Throwable unused3) {
                                    }
                                    wey0Var3.b = optBoolean2;
                                    d(optJSONObject3, xey0Var);
                                    if (optJSONObject3 != null) {
                                        try {
                                            optBoolean3 = optJSONObject3.optBoolean("playableUrlInterceptEnabled");
                                        } catch (Throwable unused4) {
                                        }
                                        wey0Var3.c = optBoolean3;
                                        h8z0.e(e5z0Var3, "load", 0, null);
                                    }
                                    optBoolean3 = false;
                                    wey0Var3.c = optBoolean3;
                                    h8z0.e(e5z0Var3, "load", 0, null);
                                }
                                optBoolean2 = false;
                                wey0Var3.b = optBoolean2;
                                d(optJSONObject3, xey0Var);
                                if (optJSONObject3 != null) {
                                }
                                optBoolean3 = false;
                                wey0Var3.c = optBoolean3;
                                h8z0.e(e5z0Var3, "load", 0, null);
                            }
                            optBoolean = false;
                            wey0 wey0Var32 = wey0Var;
                            wey0Var32.a = optBoolean;
                            if (optJSONObject3 != null) {
                            }
                            optBoolean2 = false;
                            wey0Var32.b = optBoolean2;
                            d(optJSONObject3, xey0Var);
                            if (optJSONObject3 != null) {
                            }
                            optBoolean3 = false;
                            wey0Var32.c = optBoolean3;
                            h8z0.e(e5z0Var3, "load", 0, null);
                        }
                    }
                }
                startsWith = false;
                if (!startsWith) {
                }
                e5z0 e5z0Var32 = e5z0Var;
                this.a.c(e5z0Var32, jSONObject, xey0Var.D, ooy0Var2);
                optJSONObject3 = jSONObject.optJSONObject("featureFlags");
                if (optJSONObject3 != null) {
                }
                optBoolean = false;
                wey0 wey0Var322 = wey0Var;
                wey0Var322.a = optBoolean;
                if (optJSONObject3 != null) {
                }
                optBoolean2 = false;
                wey0Var322.b = optBoolean2;
                d(optJSONObject3, xey0Var);
                if (optJSONObject3 != null) {
                }
                optBoolean3 = false;
                wey0Var322.c = optBoolean3;
                h8z0.e(e5z0Var32, "load", 0, null);
            }
        } else if ("deeplink".equals(optString17)) {
            wey0Var = wey0Var2;
            ooy0Var2.a("navigationType").h(3005, "legacy value " + optString17);
            xey0Var.p = X3.i.U;
        } else {
            wey0Var = wey0Var2;
            xey0Var.p = optString17;
        }
        i = 3006;
        c = b920.c(jSONObject, "storeType");
        xey0Var.q = c;
        if (TextUtils.isEmpty(c)) {
            ooy0Var2.a("storeType").g(i);
        }
        optString = jSONObject.optString("title");
        if (TextUtils.isEmpty(optString)) {
        }
        optString2 = jSONObject.optString("description");
        if (!TextUtils.isEmpty(optString2)) {
        }
        JSONObject optJSONObject42 = jSONObject.optJSONObject("disclaimerInfo");
        if (optJSONObject42 != null) {
        }
        if (su9Var != null) {
        }
        syy0Var = null;
        if (syy0Var == null) {
        }
        xey0Var.A = l0nVar;
        if (jSONObject.has("votes")) {
        }
        optString3 = jSONObject.optString("category");
        if (!TextUtils.isEmpty(optString3)) {
        }
        optString4 = jSONObject.optString("subcategory");
        if (!TextUtils.isEmpty(optString4)) {
        }
        optString5 = jSONObject.optString(X3.j.D);
        if (!TextUtils.isEmpty(optString5)) {
        }
        xey0Var.D = (float) jSONObject.optDouble("duration", xey0Var.D);
        if (jSONObject.has(CampaignEx.JSON_KEY_STAR)) {
        }
        has = jSONObject.has("ctaText");
        xey0Var.d = jSONObject.optString("ctaText", xey0Var.n());
        if (!TextUtils.isEmpty(str)) {
            ooy0Var2.a("ctaText").g(3006);
        }
        if (has) {
            ooy0Var2.a("ctaText").h(3008, "ctaText is not empty, but ctaLink and trackingLink are empty");
        }
        optString6 = jSONObject.optString("iconLink");
        int optInt32 = jSONObject.optInt("iconWidth");
        int optInt42 = jSONObject.optInt("iconHeight");
        if (!TextUtils.isEmpty(optString6)) {
        }
        if (z2) {
        }
        optString7 = jSONObject.optString("imageLink");
        int optInt52 = jSONObject.optInt("imageWidth");
        int optInt62 = jSONObject.optInt("imageHeight");
        if (!TextUtils.isEmpty(optString7)) {
        }
        TextUtils.isEmpty(jSONObject.optString("imageDominantColor"));
        i4 = jkz0Var.r;
        if (i4 < 0) {
        }
        String optString192 = jSONObject.optString("advertisingLabel", "");
        if (z2) {
        }
        xey0Var.r = optString192;
        if (jSONObject.has("url_types")) {
        }
        int i82 = this.c.g;
        wty0Var = jkz0Var.K;
        if (wty0Var == null) {
        }
        xey0Var.L = wty0Var;
        optJSONObject = jSONObject.optJSONObject("viewability");
        if (optJSONObject != null) {
        }
        xey0Var.y = jSONObject.optBoolean("isAppInWhitelist", xey0Var.y);
        fwy fwyVar2 = jkz0Var.J;
        optJSONObject2 = jSONObject.optJSONObject("omdata");
        if (optJSONObject2 != null) {
        }
        xey0Var.M = fwyVar2;
        if (!TextUtils.isEmpty(optString13)) {
        }
        startsWith = false;
        if (!startsWith) {
        }
        e5z0 e5z0Var322 = e5z0Var;
        this.a.c(e5z0Var322, jSONObject, xey0Var.D, ooy0Var2);
        optJSONObject3 = jSONObject.optJSONObject("featureFlags");
        if (optJSONObject3 != null) {
        }
        optBoolean = false;
        wey0 wey0Var3222 = wey0Var;
        wey0Var3222.a = optBoolean;
        if (optJSONObject3 != null) {
        }
        optBoolean2 = false;
        wey0Var3222.b = optBoolean2;
        d(optJSONObject3, xey0Var);
        if (optJSONObject3 != null) {
        }
        optBoolean3 = false;
        wey0Var3222.c = optBoolean3;
        h8z0.e(e5z0Var322, "load", 0, null);
    }
}
