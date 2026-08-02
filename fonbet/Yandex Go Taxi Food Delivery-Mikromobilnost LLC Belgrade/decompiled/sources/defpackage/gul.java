package defpackage;

import android.net.Uri;
import com.yandex.div.json.expressions.Expression;

/* loaded from: classes7.dex */
public final class gul extends y6k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gul(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y6k
    public final boolean handleAction(v3k v3kVar, fpl fplVar, rvo rvoVar) {
        zrl zrlVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (super.handleAction(v3kVar, fplVar, rvoVar)) {
                    return true;
                }
                xk7 xk7Var = (xk7) obj;
                Boolean bool = null;
                if (((Boolean) xk7Var.a.invoke()).booleanValue() && (zrlVar = (zrl) xk7Var.b) != null) {
                    bool = Boolean.valueOf(zrlVar.handleAction(v3kVar, fplVar, rvoVar));
                }
                return jl40.l(bool, Boolean.TRUE);
            default:
                Expression expression = v3kVar.k;
                if (expression != null) {
                    Uri uri = (Uri) expression.a(rvoVar);
                    if (jl40.l(uri.getScheme(), "mobileads") && jl40.l(uri.getHost(), "closeDialog")) {
                        ((op71) obj).e();
                        return true;
                    }
                }
                return super.handleAction(v3kVar, fplVar, rvoVar);
        }
    }

    @Override // defpackage.y6k
    public boolean handleAction(f9l f9lVar, fpl fplVar, rvo rvoVar) {
        zrl zrlVar;
        switch (this.a) {
            case 0:
                if (super.handleAction(f9lVar, fplVar, rvoVar)) {
                    return true;
                }
                xk7 xk7Var = (xk7) this.b;
                Boolean bool = null;
                if (((Boolean) xk7Var.a.invoke()).booleanValue() && (zrlVar = (zrl) xk7Var.b) != null) {
                    bool = Boolean.valueOf(zrlVar.handleAction(f9lVar, fplVar, rvoVar));
                }
                return jl40.l(bool, Boolean.TRUE);
            default:
                return super.handleAction(f9lVar, fplVar, rvoVar);
        }
    }
}
