package defpackage;

import android.net.Uri;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes5.dex */
public final class oei {
    public final c a;
    public final t5i b;
    public final yvf0 c;
    public final k d;
    public final yvf0 e;
    public final qsi f;

    public oei(c cVar, t5i t5iVar, yvf0 yvf0Var, k kVar, yvf0 yvf0Var2, qsi qsiVar) {
        this.a = cVar;
        this.b = t5iVar;
        this.c = yvf0Var;
        this.d = kVar;
        this.e = yvf0Var2;
        this.f = qsiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r5 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(oep0 oep0Var, Uri uri, String str) {
        String queryParameter = uri.getQueryParameter("tariffClass");
        k kVar = this.d;
        String str2 = null;
        if (queryParameter != null) {
            if (!kVar.f(queryParameter)) {
                queryParameter = null;
            }
        }
        if (str != null) {
            if (!kVar.f(str)) {
                str = null;
            }
            str2 = str;
        }
        queryParameter = str2 == null ? "" : str2;
        if (evu0.J(queryParameter)) {
            jst.e.j(new IllegalArgumentException("The Ndd tariff is empty"));
            return;
        }
        if (!((Boolean) this.b.b.a.getValue()).booleanValue()) {
            c cVar = this.a;
            if (cVar.e() || cVar.b() == Screen.ORDERS_LIST) {
                b(oep0Var, queryParameter, true);
                return;
            }
        }
        b(oep0Var, queryParameter, false);
    }

    public final void b(oep0 oep0Var, String str, boolean z) {
        ((pep0) oep0Var).f((m950) this.e.get(), new xh50(false, (ji50) new gi50(str), new bhh(17, this), new rx3(z, oep0Var, this, 4), 4), hxx.a);
    }
}
