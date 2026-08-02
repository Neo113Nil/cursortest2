package defpackage;

import android.content.Context;
import com.yandex.go.order.bundle.map.impl.data.repository.g;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.superapp.api.repository.SuperAppRecenterPointRepository$Type;
import com.yandex.go.superapp.order_tracking.eats.presentation.ui.overlay.a;
import defpackage.lfn;
import defpackage.tfn;
import defpackage.tpr;
import defpackage.vfn;
import defpackage.w4r;
import defpackage.wfn;
import defpackage.x4r;
import defpackage.yaf0;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class lfn extends h55 implements m950 {
    public final i6r D;
    public final g E;
    public final h F;
    public final n6w0 G;
    public a H;

    public lfn(i6r i6rVar, g gVar, h hVar, n6w0 n6w0Var) {
        super(null);
        this.D = i6rVar;
        this.E = gVar;
        this.F = hVar;
        this.G = n6w0Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        sfn sfnVar;
        wfn wfnVar = (wfn) obj;
        if (wfnVar instanceof ufn) {
            sfnVar = new e90(27, this, (ufn) wfnVar);
        } else if (wfnVar instanceof tfn) {
            final tfn tfnVar = (tfn) wfnVar;
            final int i = 1;
            sfnVar = new sfn(this) { // from class: com.yandex.go.superapp.order_tracking.eats.presentation.navigation.h
                public final /* synthetic */ lfn b;

                {
                    this.b = this;
                }

                @Override // defpackage.sfn
                public final tpr b() {
                    int i2 = i;
                    wfn wfnVar2 = tfnVar;
                    lfn lfnVar = this.b;
                    switch (i2) {
                        case 0:
                            com.yandex.go.order.bundle.map.impl.data.repository.g gVar = lfnVar.E;
                            yaf0 yaf0Var = ((vfn) wfnVar2).a;
                            r0 r0Var = gVar.d;
                            x4r x4rVar = new x4r(yaf0Var);
                            r0Var.getClass();
                            r0Var.m(null, x4rVar);
                            return gVar.a(lfnVar.F.v, EatsOrderOverlayRouterImpl$createOrdersOverlayForScreenType$1$1.b);
                        default:
                            lfnVar.G.d(Collections.singletonList(SuperAppRecenterPointRepository$Type.EATS));
                            com.yandex.go.order.bundle.map.impl.data.repository.g gVar2 = lfnVar.E;
                            String str = ((tfn) wfnVar2).a;
                            r0 r0Var2 = gVar2.d;
                            w4r w4rVar = new w4r(str);
                            r0Var2.getClass();
                            r0Var2.m(null, w4rVar);
                            return gVar2.a(lfnVar.F.v, EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForBundledOrder$1$1.b);
                    }
                }
            };
        } else if (!(wfnVar instanceof vfn)) {
            w511.b();
            return;
        } else {
            final vfn vfnVar = (vfn) wfnVar;
            final int i2 = 0;
            sfnVar = new sfn(this) { // from class: com.yandex.go.superapp.order_tracking.eats.presentation.navigation.h
                public final /* synthetic */ lfn b;

                {
                    this.b = this;
                }

                @Override // defpackage.sfn
                public final tpr b() {
                    int i22 = i2;
                    wfn wfnVar2 = vfnVar;
                    lfn lfnVar = this.b;
                    switch (i22) {
                        case 0:
                            com.yandex.go.order.bundle.map.impl.data.repository.g gVar = lfnVar.E;
                            yaf0 yaf0Var = ((vfn) wfnVar2).a;
                            r0 r0Var = gVar.d;
                            x4r x4rVar = new x4r(yaf0Var);
                            r0Var.getClass();
                            r0Var.m(null, x4rVar);
                            return gVar.a(lfnVar.F.v, EatsOrderOverlayRouterImpl$createOrdersOverlayForScreenType$1$1.b);
                        default:
                            lfnVar.G.d(Collections.singletonList(SuperAppRecenterPointRepository$Type.EATS));
                            com.yandex.go.order.bundle.map.impl.data.repository.g gVar2 = lfnVar.E;
                            String str = ((tfn) wfnVar2).a;
                            r0 r0Var2 = gVar2.d;
                            w4r w4rVar = new w4r(str);
                            r0Var2.getClass();
                            r0Var2.m(null, w4rVar);
                            return gVar2.a(lfnVar.F.v, EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForBundledOrder$1$1.b);
                    }
                }
            };
        }
        i6r i6rVar = this.D;
        i6rVar.getClass();
        xvf0 b = i5m.b(e2f.a);
        c0g c0gVar = (c0g) i6rVar;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        ah00 z2 = c0gVar.z2();
        q5z.h(z2);
        xm00 xm00Var = (xm00) b.get();
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        k7x0 Z2 = c0gVar.Z2();
        q5z.h(Z2);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        h2f h2fVar = new h2f(Z1, sfnVar);
        n6w0 n6w0Var = (n6w0) c0gVar.Jf.get();
        q5z.h(n6w0Var);
        a aVar = new a(e2, z2, xm00Var, w2, Z2, h2fVar, n6w0Var);
        this.H = aVar;
        aVar.attach();
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        a aVar = this.H;
        if (aVar != null) {
            xm00 xm00Var = aVar.z;
            xm00Var.d();
            xm00Var.m();
            aVar.x.Cg();
            aVar.C.clear();
            aVar.E.clear();
            aVar.D.clear();
            xm00Var.m();
            aVar.B.clear();
            bu0 bu0Var = aVar.A;
            bu0Var.b = null;
            bu0Var.c = null;
            bu0Var.d = null;
            bu0Var.e = null;
            bu0Var.f = null;
            bu0Var.g = null;
        }
        this.H = null;
        SuperAppRecenterPointRepository$Type superAppRecenterPointRepository$Type = SuperAppRecenterPointRepository$Type.EATS;
        n6w0 n6w0Var = this.G;
        n6w0Var.a.remove(superAppRecenterPointRepository$Type);
        n6w0Var.b.g(superAppRecenterPointRepository$Type);
    }
}
