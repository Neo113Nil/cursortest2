package defpackage;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivVisibilityAction;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import com.ybsdk.feature.divkit.internal.domain.a;

/* loaded from: classes3.dex */
public final class pr51 extends y6k {
    public final sls a;
    public a b;
    public tls c;

    public pr51(sls slsVar) {
        this.a = slsVar;
    }

    public static boolean a(pr51 pr51Var, DivVisibilityAction divVisibilityAction, fpl fplVar, rvo rvoVar) {
        return super.handleAction(divVisibilityAction, fplVar, rvoVar);
    }

    public static boolean b(pr51 pr51Var, v3k v3kVar, fpl fplVar, rvo rvoVar) {
        return super.handleAction(v3kVar, fplVar, rvoVar);
    }

    public static boolean c(pr51 pr51Var, f9l f9lVar, fpl fplVar, rvo rvoVar) {
        return super.handleAction(f9lVar, fplVar, rvoVar);
    }

    public static boolean d(pr51 pr51Var, nnk nnkVar, fpl fplVar, rvo rvoVar) {
        return super.handleAction(nnkVar, fplVar, rvoVar);
    }

    public final boolean e(Uri uri) {
        String authority;
        if (this.b == null) {
            x4c.g("Attempt to handle action in DivView before onAttachedToWindow", new IllegalStateException(""), unr0.n(uri, "Uri: "), null, 8);
            return false;
        }
        if (uri != null && (authority = uri.getAuthority()) != null) {
            String scheme = uri.getScheme();
            if (authority.equals("download") && jl40.l(scheme, "div-action")) {
                if (sd90.l(uri, "url") != null) {
                    return true;
                }
                x4c.g("for div-download url param is required", null, unr0.n(uri, "full uri: "), null, 10);
                return false;
            }
        }
        return false;
    }

    public final boolean f(Expression expression, rvo rvoVar, String str, sls slsVar) {
        Uri uri;
        tls tlsVar = this.c;
        boolean z = false;
        if (tlsVar == null) {
            x4c.g("YbDivView.actionHandler is null, while DivAction is handling on screen", null, (String) this.a.invoke(), null, 10);
        } else if (expression != null && (uri = (Uri) expression.a(rvoVar)) != null) {
            Uri uri2 = jl40.l(uri.getScheme(), "div-action") ? null : uri;
            if (uri2 != null) {
                z = ((Boolean) tlsVar.invoke(sd90.k(sd90.k(uri2, "call_source", DeeplinkSource.DIVKIT), "div_log_id", str))).booleanValue();
            }
        }
        if (z) {
            return true;
        }
        return ((Boolean) slsVar.invoke()).booleanValue();
    }

    @Override // defpackage.y6k
    public final boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        Uri uri;
        Expression url = f9lVar.getUrl();
        Div2View div2View = (Div2View) fplVar;
        if (!e(url != null ? (Uri) url.a(rvoVar) : null)) {
            return f(f9lVar.getUrl(), rvoVar, div2View.getLogId(), new r8c0(this, f9lVar, fplVar, rvoVar, 20));
        }
        a aVar = this.b;
        a aVar2 = aVar != null ? aVar : null;
        aVar2.getClass();
        Expression url2 = f9lVar.getUrl();
        if (url2 == null || (uri = (Uri) url2.a(div2View.getExpressionResolver())) == null) {
            return true;
        }
        aVar2.a(uri, f9lVar.a(), a.b(f9lVar.getPayload(), div2View), div2View);
        return true;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(nnk nnkVar, fpl fplVar, rvo rvoVar) {
        return f(nnkVar.j, rvoVar, ((Div2View) fplVar).getLogId(), new r8c0(this, nnkVar, fplVar, rvoVar, 21));
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        Uri uri;
        Expression expression = v3kVar.k;
        Div2View div2View = (Div2View) fplVar;
        if (e(expression != null ? (Uri) expression.a(rvoVar) : null)) {
            a aVar = this.b;
            a aVar2 = aVar != null ? aVar : null;
            aVar2.getClass();
            if (expression == null || (uri = (Uri) expression.a(div2View.getExpressionResolver())) == null) {
                return true;
            }
            aVar2.a(uri, v3kVar.a, a.b(v3kVar.f, div2View), div2View);
            return true;
        }
        return f(expression, rvoVar, div2View.getLogId(), new r8c0(this, v3kVar, fplVar, rvoVar, 19));
    }

    @Override // defpackage.y6k
    public final boolean handleAction(DivVisibilityAction divVisibilityAction, fpl fplVar, rvo rvoVar) {
        return f(divVisibilityAction.i, rvoVar, ((Div2View) fplVar).getLogId(), new r8c0(this, divVisibilityAction, fplVar, rvoVar, 22));
    }
}
