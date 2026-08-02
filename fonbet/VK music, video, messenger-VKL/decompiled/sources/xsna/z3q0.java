package xsna;

import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.toggle.features.SmbAdFeatures;

/* compiled from: UnitedAdStatPixelsDeduplicator.kt */
/* loaded from: classes17.dex */
public final class z3q0 implements oi0 {
    public final hqa0 a;
    public final boolean b = com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING);

    public z3q0(hqa0 hqa0Var) {
        this.a = hqa0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oi0
    public final boolean a(AdStatPixel.a aVar) {
        if (!(aVar instanceof AdStatPixel)) {
            return false;
        }
        hqa0 hqa0Var = this.a;
        return hqa0Var.c() ? hqa0Var.b().b(((AdStatPixel) aVar).Ab()) : r0m.c.contains(((AdStatPixel) aVar).Ab());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.oi0
    public final void b(AdStatPixel.a aVar) {
        if (aVar instanceof AdStatPixel) {
            if (this.b) {
                this.a.b().a(((AdStatPixel) aVar).Ab());
            } else {
                r0m.c.add(((AdStatPixel) aVar).Ab());
            }
        }
    }
}
