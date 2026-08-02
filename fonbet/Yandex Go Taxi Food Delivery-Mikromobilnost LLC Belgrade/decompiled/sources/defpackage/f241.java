package defpackage;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.go.walking.navigation.impl.location_mock.settings.interactor.a;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import java.util.Map;

/* loaded from: classes14.dex */
public final class f241 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public f241(jcg jcgVar, t4v0 t4v0Var, n3w n3wVar, ubq0 ubq0Var) {
        this.a = 0;
        this.d = jcgVar;
        this.b = t4v0Var;
        this.e = n3wVar;
        this.c = ubq0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.d;
        switch (i) {
            case 0:
                return new xus((Activity) ((jcg) xvf0Var4).get(), xvf0Var3, (c241) ((n3w) xvf0Var).a, (i541) xvf0Var2.get());
            case 1:
                return new n341((b) ((pcg) xvf0Var4).get(), (k) xvf0Var3.get(), (b741) xvf0Var2.get(), (w041) xvf0Var.get());
            case 2:
                return new x341((a) ((mg11) xvf0Var4).get(), (a441) ((mg11) xvf0Var3).get(), (Context) ((jcg) xvf0Var2).get(), (w030) ((pcg) xvf0Var).get());
            case 3:
                return new g641((gzx) xvf0Var3.get(), (h641) xvf0Var2.get(), (ah00) xvf0Var4.get(), (qcg) xvf0Var);
            case 4:
                return new com.ybsdk.feature.webview.internal.domain.b((awa0) ((rbg) xvf0Var4).get(), (Map) xvf0Var3.get(), (AppAnalyticsReporter) ((rbg) xvf0Var2).get(), (um41) ((rbg) xvf0Var).get());
            default:
                return new cz41((com.yandex.go.where_you_are.impl.router.a) ((eqh) xvf0Var4).get(), (szb) ((c1g) xvf0Var3).get(), (ucg) xvf0Var2, (oep0) ((ucg) xvf0Var).get());
        }
    }

    public /* synthetic */ f241(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.e = xvf0Var4;
    }

    public f241(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, qcg qcgVar) {
        this.a = 3;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = qcgVar;
    }
}
