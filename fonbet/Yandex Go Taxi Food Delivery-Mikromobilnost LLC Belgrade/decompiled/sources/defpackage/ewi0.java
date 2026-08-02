package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes6.dex */
public final class ewi0 {
    public final zuj0 a;
    public final i3y b;
    public final i3y c;

    public ewi0(zuj0 zuj0Var) {
        this.a = zuj0Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: dwi0
            public final /* synthetic */ ewi0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ewi0 ewi0Var = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) ewi0Var.a).h(h0i0.template_plural_one_placeholder);
                    default:
                        return ((avj0) ewi0Var.a).h(h0i0.template_plural_few_placeholder);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.c = a.b(lazyThreadSafetyMode, new sls(this) { // from class: dwi0
            public final /* synthetic */ ewi0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ewi0 ewi0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) ewi0Var.a).h(h0i0.template_plural_one_placeholder);
                    default:
                        return ((avj0) ewi0Var.a).h(h0i0.template_plural_few_placeholder);
                }
            }
        });
    }

    public final String a(cwi0 cwi0Var, int i) {
        String f = ((avj0) this.a).f(xvh0.template_local_plural_base, i);
        if (jl40.l(f, (String) this.b.getValue())) {
            return cwi0Var.a;
        }
        String str = cwi0Var.c;
        return (str == null || !jl40.l(f, (String) this.c.getValue())) ? cwi0Var.b : str;
    }
}
