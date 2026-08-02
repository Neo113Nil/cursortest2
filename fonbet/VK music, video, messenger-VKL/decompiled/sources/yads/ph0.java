package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.apn;
import xsna.epx;
import xsna.jgp;

/* loaded from: classes10.dex */
public final class ph0 extends DivActionHandler {
    public final kz a;
    public final qh0 b;
    public final ai0 c;
    public final ri0 d;
    public final qi0 e;

    public /* synthetic */ ph0(Context context, d4 d4Var, ov2 ov2Var, v9 v9Var, kz kzVar, qh0 qh0Var, ai0 ai0Var) {
        this(kzVar, qh0Var, ai0Var, new ri0(new ee2(context, d4Var, ov2Var, o93.d)), new qi0(v9Var, ((mv3) ov2Var).a()));
    }

    public final boolean a(JSONObject jSONObject, Uri uri, DivViewFacade divViewFacade) {
        Map hashMap;
        if (!epx.f(uri.getScheme(), "mobileads")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != 94750088) {
                if (hashCode != 866535483) {
                    if (hashCode != 986975867) {
                        if (hashCode == 1270469668 && host.equals("trackUrl")) {
                            ri0 ri0Var = this.d;
                            ri0Var.getClass();
                            String queryParameter = uri.getQueryParameter("trackingUrl");
                            if (queryParameter != null && queryParameter.length() > 0) {
                                ri0Var.a.a(queryParameter, jgp.b);
                            }
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        qi0 qi0Var = this.e;
                        qi0Var.getClass();
                        String queryParameter2 = uri.getQueryParameter(X3.i.j0);
                        if (queryParameter2 != null) {
                            if (queryParameter2.length() == 0) {
                                queryParameter2 = null;
                            }
                            if (queryParameter2 != null) {
                                if (jSONObject != null) {
                                    qi0Var.c.getClass();
                                    hashMap = new LinkedHashMap(he1.a(jSONObject));
                                } else {
                                    hashMap = new HashMap();
                                }
                                qi0Var.b.a(new fp2(queryParameter2, hashMap, qi0Var.a.i));
                            }
                        }
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.a.e();
                    return true;
                }
            } else if (host.equals("click")) {
                this.c.a(uri, divViewFacade.getView());
                return true;
            }
        }
        return this.b.a(uri);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression<Uri> expression;
        return super.handleAction(divAction, divViewFacade, expressionResolver) || ((expression = divAction.k) != null && a(divAction.f, expression.evaluate(expressionResolver), divViewFacade));
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(apn apnVar, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression<Uri> url;
        return super.handleAction(apnVar, divViewFacade, expressionResolver) || ((url = apnVar.getUrl()) != null && a(apnVar.getPayload(), url.evaluate(expressionResolver), divViewFacade));
    }

    public ph0(kz kzVar, qh0 qh0Var, ai0 ai0Var, ri0 ri0Var, qi0 qi0Var) {
        this.a = kzVar;
        this.b = qh0Var;
        this.c = ai0Var;
        this.d = ri0Var;
        this.e = qi0Var;
    }
}
