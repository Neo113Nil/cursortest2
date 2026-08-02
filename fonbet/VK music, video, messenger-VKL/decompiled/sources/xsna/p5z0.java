package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class p5z0 implements gjx {
    public final ocz0 a;
    public final egz0 b;
    public final itz0 c;
    public final wjz0 d;

    public p5z0(ocz0 ocz0Var) {
        this.a = ocz0Var;
        wty0 wty0Var = ocz0Var.L;
        if (wty0Var != null) {
            this.b = new egz0(wty0Var);
        } else {
            this.b = null;
        }
        if (ocz0Var.f.isEmpty() && ocz0Var.o.isEmpty()) {
            this.d = null;
        } else {
            this.d = new wjz0(ocz0Var);
        }
        this.c = new itz0(ocz0Var.v);
    }

    @Override // xsna.gjx
    public final long a() {
        return this.a.m;
    }

    @Override // xsna.gjx
    public final itz0 b() {
        return this.c;
    }

    @Override // xsna.gjx
    public final egz0 c() {
        return this.b;
    }

    @Override // xsna.gjx
    public final wjz0 getContent() {
        return this.d;
    }

    @Override // xsna.gjx
    public final int getContentType() {
        ocz0 ocz0Var = this.a;
        boolean z = "post_vk".equals(ocz0Var.E) || "vk_post".equals(ocz0Var.E) || "vk_clip".equals(ocz0Var.E);
        wjz0 wjz0Var = this.d;
        if (wjz0Var != null) {
            return wjz0Var.b;
        }
        if (z) {
            return 4;
        }
        return IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE;
    }

    @Override // xsna.gjx
    public final String getId() {
        return this.a.F;
    }
}
