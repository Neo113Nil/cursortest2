package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.json.expressions.Expression;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import yads.q63;

/* loaded from: classes7.dex */
public final class f281 extends y6k {
    public final rq81 a;
    public final kz71 b;
    public final bi61 c;
    public final i971 d;
    public final cf71 e;
    public final ke71 f;

    public f281(Context context, fe81 fe81Var, v981 v981Var, d881 d881Var, rq81 rq81Var, kz71 kz71Var, bi61 bi61Var) {
        i971 i971Var = new i971(9, new fp71(context, fe81Var, v981Var, q63.c));
        Context context2 = ((n291) v981Var).a;
        cf71 cf71Var = new cf71((Object) d881Var, (Object) wha1.c(context2, context2), false, 18);
        ke71 ke71Var = new ke71();
        this.a = rq81Var;
        this.b = kz71Var;
        this.c = bi61Var;
        this.d = i971Var;
        this.e = cf71Var;
        this.f = ke71Var;
    }

    public final boolean a(JSONObject jSONObject, Uri uri, fpl fplVar) {
        if (jl40.l(uri.getScheme(), "mobileads")) {
            String host = uri.getHost();
            if (host != null) {
                int hashCode = host.hashCode();
                if (hashCode != 94750088) {
                    if (hashCode != 866535483) {
                        if (hashCode != 986975867) {
                            if (hashCode == 1270469668 && host.equals("trackUrl")) {
                                LinkedHashMap a = this.f.a(fplVar.getView(), null);
                                i971 i971Var = this.d;
                                i971Var.getClass();
                                String queryParameter = uri.getQueryParameter("trackingUrl");
                                if (queryParameter != null && queryParameter.length() > 0) {
                                    ((fp71) i971Var.b).e(queryParameter, a);
                                    return true;
                                }
                                return true;
                            }
                        } else if (host.equals("trackAnalytics")) {
                            cf71 cf71Var = this.e;
                            cf71Var.getClass();
                            String queryParameter2 = uri.getQueryParameter("eventName");
                            if (queryParameter2 != null) {
                                String str = queryParameter2.length() != 0 ? queryParameter2 : null;
                                if (str != null) {
                                    ((ge71) cf71Var.c).c(new zj71(str, jSONObject != null ? new LinkedHashMap(u971.a(jSONObject)) : new HashMap(), ((d881) cf71Var.b).i));
                                }
                            }
                            return true;
                        }
                    } else if (host.equals("closeAd")) {
                        this.a.e();
                        return true;
                    }
                } else if (host.equals("click")) {
                    this.c.a(uri, fplVar.getView());
                    return true;
                }
            }
            this.b.getClass();
        }
        return false;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        Expression url;
        return super.handleAction(f9lVar, fplVar, rvoVar) || ((url = f9lVar.getUrl()) != null && a(f9lVar.getPayload(), (Uri) url.a(rvoVar), fplVar));
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        Expression expression;
        return super.handleAction(v3kVar, fplVar, rvoVar) || ((expression = v3kVar.k) != null && a(v3kVar.f, (Uri) expression.a(rvoVar), fplVar));
    }
}
