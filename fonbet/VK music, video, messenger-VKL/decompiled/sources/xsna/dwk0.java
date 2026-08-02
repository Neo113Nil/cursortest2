package xsna;

import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.vf00;

/* compiled from: StaticAdsItemOverlayDefaultRenderer.kt */
/* loaded from: classes17.dex */
public final class dwk0 implements iwk0 {
    public final Object a;
    public final l340 b;
    public final cjh0 c;
    public final hlh0 d;
    public final Object e;
    public final Object f;

    public dwk0(Lazy lazy, l340 l340Var, cjh0 cjh0Var, kaf kafVar) {
        this.a = lazy;
        this.b = l340Var;
        this.c = cjh0Var;
        this.d = kafVar;
        re40 re40Var = new re40(this, 25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, re40Var);
        this.f = msy.a(lazyThreadSafetyMode, new avj0(this, 1));
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
        ((gz0) this.e.getValue()).a(j390Var.a);
        qvk0 qvk0Var = (qvk0) this.f.getValue();
        vf00 vf00Var = j390Var.b;
        hf00 hf00Var = qvk0Var.c;
        if (!(vf00Var instanceof vf00.c)) {
            qvk0Var.b = vf00Var;
            return;
        }
        vf00.c cVar = (vf00.c) vf00Var;
        lw lwVar = cVar.b;
        String str = cVar.a;
        DescriptionViewState descriptionViewState = cVar.c;
        vf00 vf00Var2 = qvk0Var.b;
        hf00Var.getClass();
        hx0 hx0Var = hf00Var.a;
        boolean z = vf00Var2 instanceof vf00.c;
        if (!epx.f(str, vf00Var2 != null ? vf00Var2.F() : null) || !z) {
            zmp0.b(hx0Var.b);
        } else if (z) {
            vf00.c cVar2 = (vf00.c) vf00Var2;
            boolean f = epx.f(descriptionViewState, cVar2.c);
            boolean f2 = epx.f(lwVar, cVar2.b);
            if (!f || !f2) {
                zmp0.b(hx0Var.b);
                zmp0.a(hx0Var.b, hf00Var.b);
            }
        }
        vf00 vf00Var3 = qvk0Var.b;
        boolean z2 = epx.f(str, vf00Var3 != null ? vf00Var3.F() : null) && (vf00Var3 instanceof vf00.c);
        qvk0Var.e.b(lwVar, z2);
        qvk0Var.d.a(descriptionViewState);
        qvk0Var.f.a(cVar.f, null);
        vf00.b bVar = cVar.g;
        qvk0Var.g.a(bVar.a);
        qvk0Var.a.h.setVisibility(bVar.b ? 0 : 8);
        qvk0Var.h.a(cVar.d, z2);
        qvk0Var.i.a(cVar.e);
        qvk0Var.b = vf00Var;
    }
}
