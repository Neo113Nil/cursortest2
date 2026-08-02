package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class y13 implements zf0 {
    public final w32 a;
    public final kz b;
    public final z00 c;
    public final pu d;
    public final jp2 e;
    public final jz1 f;
    public final mj g;

    public y13(w32 w32Var, kz kzVar, z00 z00Var, pu puVar, bu1 bu1Var, jz1 jz1Var, mj mjVar) {
        this.a = w32Var;
        this.b = kzVar;
        this.c = z00Var;
        this.d = puVar;
        this.e = bu1Var;
        this.f = jz1Var;
        this.g = mjVar;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            s22 a = this.g.a((ExtendedNativeAdView) viewGroup, this.f);
            w32 w32Var = this.a;
            pu puVar = this.d;
            w32Var.getClass();
            w32Var.a(a.c, w32Var.Q, new a32(a), puVar);
            s53 s53Var = new s53(this.c);
            Iterator it = this.a.i().iterator();
            while (it.hasNext()) {
                ((x12) it.next()).a(s53Var);
            }
            this.a.b(this.c);
        } catch (k12 e) {
            this.b.e();
            this.e.reportError("Failed to bind DivKit Slider Ad", e);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.a.b((z00) null);
        Iterator it = this.a.i().iterator();
        while (it.hasNext()) {
            ((x12) it.next()).a((z00) null);
        }
    }
}
