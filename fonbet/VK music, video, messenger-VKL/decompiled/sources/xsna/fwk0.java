package xsna;

import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.vf00;

/* compiled from: StaticAdsItemOverlayRedesignRenderer.kt */
/* loaded from: classes17.dex */
public final class fwk0 implements iwk0 {
    public final Object a;
    public final l340 b;
    public final cjh0 c;
    public final hlh0 d;
    public final Object e;
    public final Object f;

    public fwk0(Lazy lazy, l340 l340Var, cjh0 cjh0Var, kaf kafVar) {
        this.a = lazy;
        this.b = l340Var;
        this.c = cjh0Var;
        this.d = kafVar;
        dck0 dck0Var = new dck0(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, dck0Var);
        this.f = msy.a(lazyThreadSafetyMode, new mqe0(this, 13));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.iwk0
    public final void a(jwk0 jwk0Var) {
        j390 j390Var = jwk0Var instanceof j390 ? (j390) jwk0Var : null;
        if (j390Var == null) {
            this.d.b(new IllegalStateException("viewState in renderer should match viewState produced by renderFactory"));
            return;
        }
        ((az0) this.e.getValue()).a(j390Var.a);
        pvk0 pvk0Var = (pvk0) this.f.getValue();
        vf00 vf00Var = j390Var.b;
        qf00 qf00Var = pvk0Var.c;
        if (!(vf00Var instanceof vf00.c)) {
            pvk0Var.b = vf00Var;
            return;
        }
        vf00.c cVar = (vf00.c) vf00Var;
        lw lwVar = cVar.b;
        String str = cVar.a;
        DescriptionViewState descriptionViewState = cVar.c;
        vf00 vf00Var2 = pvk0Var.b;
        qf00Var.getClass();
        nx0 nx0Var = qf00Var.a;
        boolean z = vf00Var2 instanceof vf00.c;
        if (!epx.f(str, vf00Var2 != null ? vf00Var2.F() : null) || !z) {
            zmp0.b(nx0Var.b);
        } else if (z) {
            vf00.c cVar2 = (vf00.c) vf00Var2;
            boolean f = epx.f(descriptionViewState, cVar2.c);
            boolean f2 = epx.f(lwVar, cVar2.b);
            if (!f || !f2) {
                zmp0.b(nx0Var.b);
                zmp0.a(nx0Var.b, qf00Var.b);
            }
        }
        vf00 vf00Var3 = pvk0Var.b;
        boolean z2 = epx.f(str, vf00Var3 != null ? vf00Var3.F() : null) && (vf00Var3 instanceof vf00.c);
        pvk0Var.e.b(lwVar, z2);
        pvk0Var.d.a(descriptionViewState);
        pvk0Var.f.a(cVar.f, null);
        vf00.b bVar = cVar.g;
        pvk0Var.g.a(bVar.a);
        pvk0Var.a.h.setVisibility(bVar.b ? 0 : 8);
        pvk0Var.h.a(cVar.d, z2);
        pvk0Var.i.a(cVar.e);
        pvk0Var.b = vf00Var;
    }
}
