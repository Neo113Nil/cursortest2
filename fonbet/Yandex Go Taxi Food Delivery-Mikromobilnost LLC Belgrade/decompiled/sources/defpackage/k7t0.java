package defpackage;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.preorder.summary.solid.l;

/* loaded from: classes6.dex */
public final /* synthetic */ class k7t0 implements n070, jms {
    public final /* synthetic */ l a;

    public k7t0(l lVar) {
        this.a = lVar;
    }

    @Override // defpackage.n070
    public final void a(String str) {
        Object obj;
        l lVar = this.a;
        ck31 ck31Var = lVar.B;
        biv0 biv0Var = lVar.v3;
        rft0 rft0Var = lVar.V2;
        jsa1 a = lVar.J0.a(str);
        if (a instanceof ey1) {
            k kVar = (k) ck31Var;
            lVar.F0.a(new qq30(kVar.h()));
            ((qht0) rft0Var).d(new ey1(null, str), biv0Var.a(), kVar.h(), null);
            return;
        }
        if (a instanceof dy1) {
            ((qht0) rft0Var).d(a, biv0Var.a(), ((k) ck31Var).h(), null);
            return;
        }
        if (a instanceof by1) {
            ((qht0) rft0Var).d(a, biv0Var.a(), ((k) ck31Var).h(), null);
            return;
        }
        if (!(a instanceof cy1)) {
            if (a == null) {
                return;
            }
            w511.b();
            return;
        }
        k kVar2 = (k) ck31Var;
        String h = kVar2.h();
        Iterator it = kVar2.j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((za31) obj).d, h)) {
                    break;
                }
            }
        }
        lVar.C3.getClass();
        MobilityHubSourceAction a2 = jk20.a((za31) obj);
        lVar.H3.getClass();
        MobilityHubSourceType a3 = gg31.a(str);
        ((qht0) rft0Var).d(a, biv0Var.a(), kVar2.h(), (a2 == null && a3 == null) ? null : new a2v(a2, a3));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof n070) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, l.class, "onSelectVertical", "onSelectVertical(Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
