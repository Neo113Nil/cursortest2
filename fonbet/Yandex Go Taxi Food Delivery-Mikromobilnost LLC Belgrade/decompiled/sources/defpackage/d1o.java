package defpackage;

import com.yandex.messaging.ChatRequest;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class d1o extends xx4 {
    public static final /* synthetic */ int A = 0;
    public final ChatRequest w;
    public final at2 x;
    public final k020 y;
    public x08 z;

    public d1o(ChatRequest chatRequest, at2 at2Var, k020 k020Var) {
        this.w = chatRequest;
        this.x = at2Var;
        this.y = k020Var;
    }

    @Override // defpackage.xx4, defpackage.hr
    public final void b() {
        i(null);
        x08 x08Var = this.z;
        if (x08Var != null) {
            x08Var.cancel();
            this.z = null;
        }
    }

    @Override // defpackage.hr
    public final boolean f(hr hrVar) {
        if (hrVar instanceof d1o) {
            return ((d1o) hrVar).w.equals(this.w);
        }
        return false;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        x08 x08Var = (x08) this.w.handle(new jdj(this, (aj20) ((d9g) cl21Var).T.get(), cl21Var, false, 14));
        this.z = x08Var;
        if (x08Var == null) {
            h();
        }
    }

    public final x08 l(String str, aj20 aj20Var) {
        if (str != null && this.x.a().a(str) == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            aj20Var.a(arrayList);
            return new bn2(1, aj20Var);
        }
        return new b1o();
    }
}
