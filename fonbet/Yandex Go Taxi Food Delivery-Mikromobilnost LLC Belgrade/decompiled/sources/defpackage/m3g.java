package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.descriptors.action.GoReloadLabeledSectionsActionDescriptorFactoryImpl;
import com.yandex.go.flex.common.descriptors.action.d;
import com.yandex.go.flex.common.utils.a;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes12.dex */
public final class m3g implements xvf0 {
    public final /* synthetic */ int a;
    public final i6r b;

    public /* synthetic */ m3g(i6r i6rVar, int i) {
        this.a = i;
        this.b = i6rVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        i6r i6rVar = this.b;
        switch (i) {
            case 0:
                return ((c0g) i6rVar).D6();
            case 1:
                return ((c0g) i6rVar).g3();
            case 2:
                return new ag31((pho) ((c0g) i6rVar).A.a.a.d0.get());
            case 3:
                ck31 d1 = ((c0g) i6rVar).d1();
                q5z.h(d1);
                return d1;
            case 4:
                return ((c0g) i6rVar).h3();
            case 5:
                return new l141((rqo) ((c0g) i6rVar).z.C.get());
            case 6:
                Context W1 = ((c0g) i6rVar).W1();
                q5z.h(W1);
                return W1;
            case 7:
                Lifecycle lifecycle = (Lifecycle) ((c0g) i6rVar).P.get();
                q5z.h(lifecycle);
                return lifecycle;
            case 8:
                return ((c0g) i6rVar).z.a;
            case 9:
                tt2 Z1 = ((c0g) i6rVar).Z1();
                q5z.h(Z1);
                return Z1;
            case 10:
                jj3 jj3Var = (jj3) ((c0g) i6rVar).T7.get();
                q5z.h(jj3Var);
                return jj3Var;
            case 11:
                amc amcVar = (amc) ((c0g) i6rVar).z.Vi.get();
                q5z.h(amcVar);
                return amcVar;
            case 12:
                axm axmVar = (axm) ((c0g) i6rVar).z.Vj.get();
                q5z.h(axmVar);
                return axmVar;
            case 13:
                return ((c0g) i6rVar).U1();
            case 14:
                return ((c0g) i6rVar).z.o();
            case 15:
                ((c0g) i6rVar).getClass();
                return new qgr();
            case 16:
                return (pys) ((c0g) i6rVar).Ir.get();
            case 17:
                y1s y1sVar = (y1s) ((c0g) i6rVar).z.Zm.get();
                q5z.h(y1sVar);
                return y1sVar;
            case 18:
                hit hitVar = (hit) ((c0g) i6rVar).z.z.get();
                q5z.h(hitVar);
                return hitVar;
            case 19:
                wnt v2 = ((c0g) i6rVar).v2();
                q5z.h(v2);
                return v2;
            case 20:
                ((c0g) i6rVar).getClass();
                return new d();
            case 21:
                ((c0g) i6rVar).getClass();
                return new GoReloadLabeledSectionsActionDescriptorFactoryImpl();
            case 22:
                return new a((tt2) ((c0g) i6rVar).A.a.a.n.get());
            case 23:
                n nVar = (n) ((c0g) i6rVar).z.Q2.get();
                q5z.h(nVar);
                return nVar;
            case 24:
                d0g d0gVar = ((c0g) i6rVar).A.a;
                return new p370(1, (oep0) d0gVar.b.T.get(), d0gVar.s3, new xl10(new e6x()));
            case 25:
                ((c0g) i6rVar).getClass();
                return new sfa0();
            case 26:
                dqe0 I2 = ((c0g) i6rVar).I2();
                q5z.h(I2);
                return I2;
            case 27:
                b g = ((c0g) i6rVar).g();
                q5z.h(g);
                return g;
            case 28:
                return ((c0g) i6rVar).A.a.L();
            default:
                return (kpi0) ((c0g) i6rVar).z.Xj.get();
        }
    }
}
