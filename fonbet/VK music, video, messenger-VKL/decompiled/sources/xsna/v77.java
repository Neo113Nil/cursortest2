package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.ldh;
import xsna.lze;
import xsna.mat;
import xsna.o3v;
import xsna.s7d0;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class v77 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ v77(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        kj50 aVar;
        switch (this.b) {
            case 0:
                this.c.invoke(new a.f(o3v.a.a));
                return s3q0.a;
            case 1:
                s7d0 s7d0Var = (s7d0) obj;
                if (s7d0Var instanceof s7d0.e) {
                    aVar = CommunityProfileAction.n.a.o.b;
                } else if (s7d0Var instanceof s7d0.a) {
                    aVar = CommunityProfileAction.n.a.b.b;
                } else if (s7d0Var instanceof s7d0.b) {
                    aVar = CommunityProfileAction.n.a.C1589a.b;
                } else if (s7d0Var instanceof s7d0.c) {
                    aVar = CommunityProfileAction.n.a.C1590n.b;
                } else if (s7d0Var instanceof s7d0.f) {
                    aVar = CommunityProfileAction.n.a.q.b;
                } else {
                    if (!(s7d0Var instanceof s7d0.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new CommunityProfileAction.e.g.a(null);
                }
                this.c.invoke(aVar);
                return s3q0.a;
            case 2:
                this.c.invoke(new z7k.h(((Integer) obj).intValue()));
                return s3q0.a;
            case 3:
                this.c.invoke(new mat.h((q7t) obj));
                return s3q0.a;
            case 4:
                this.c.invoke((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 5:
                this.c.invoke(new lze.l(((Float) obj).floatValue()));
                return s3q0.a;
            default:
                this.c.invoke(new tfm0((ikv0) obj, 0));
                return s3q0.a;
        }
    }

    public /* synthetic */ v77(izs izsVar, ldh.a aVar) {
        this.b = 1;
        this.c = izsVar;
    }
}
