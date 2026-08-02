package xsna;

import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.dr00;
import xsna.uf00;

/* compiled from: MarketAdsItemOverlayDefaultRenderer.kt */
/* loaded from: classes17.dex */
public final class gq00 implements lq00 {
    public final Object a;
    public final dg1 b;
    public final cjh0 c;
    public final hlh0 d;
    public final yof e;
    public final Object f;
    public final Object g;

    public gq00(Lazy lazy, dg1 dg1Var, cjh0 cjh0Var, kaf kafVar, yof yofVar) {
        this.a = lazy;
        this.b = dg1Var;
        this.c = cjh0Var;
        this.d = kafVar;
        this.e = yofVar;
        k7y k7yVar = new k7y(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, k7yVar);
        this.g = msy.a(lazyThreadSafetyMode, new ubw(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.lq00
    public final void a(mq00 mq00Var) {
        dr00.d dVar = mq00Var instanceof dr00.d ? (dr00.d) mq00Var : null;
        if (dVar == null) {
            this.d.b(new IllegalStateException("viewState in renderer should match viewState produced by renderFactory"));
            return;
        }
        ((gz0) this.f.getValue()).a(dVar.a);
        op00 op00Var = (op00) this.g.getValue();
        uf00 uf00Var = dVar.b;
        gf00 gf00Var = op00Var.b;
        if (!(uf00Var instanceof uf00.b)) {
            op00Var.a = uf00Var;
            return;
        }
        uf00.b bVar = (uf00.b) uf00Var;
        lw lwVar = bVar.b;
        String str = bVar.a;
        DescriptionViewState descriptionViewState = bVar.c;
        uf00 uf00Var2 = op00Var.a;
        gf00Var.getClass();
        hx0 hx0Var = gf00Var.a;
        boolean z = uf00Var2 instanceof uf00.b;
        if (!epx.f(str, uf00Var2 != null ? uf00Var2.F() : null) || !z) {
            zmp0.b(hx0Var.b);
        } else if (z) {
            uf00.b bVar2 = (uf00.b) uf00Var2;
            boolean f = epx.f(descriptionViewState, bVar2.c);
            boolean f2 = epx.f(lwVar, bVar2.b);
            if (!f || !f2) {
                zmp0.b(hx0Var.b);
                zmp0.a(hx0Var.b, gf00Var.b);
            }
        }
        uf00 uf00Var3 = op00Var.a;
        boolean z2 = epx.f(str, uf00Var3 != null ? uf00Var3.F() : null) && (uf00Var3 instanceof uf00.b);
        op00Var.d.b(lwVar, z2);
        op00Var.c.a(descriptionViewState);
        op00Var.e.a(bVar.g, null);
        op00Var.f.a(bVar.d, z2);
        op00Var.g.a(bVar.e);
        op00Var.h.a(bVar.f);
        op00Var.a = uf00Var;
    }
}
