package defpackage;

import com.yandex.go.route.interactor.c;
import kotlin.a;

/* loaded from: classes14.dex */
public final class p6k0 {
    public final zuj0 a;
    public final wiq0 b;
    public final uze0 c;
    public final c d;
    public final i3y e;
    public final i3y f;

    public p6k0(zuj0 zuj0Var, wiq0 wiq0Var, uze0 uze0Var, c cVar) {
        this.a = zuj0Var;
        this.b = wiq0Var;
        this.c = uze0Var;
        this.d = cVar;
        final int i = 0;
        this.e = a.a(new sls(this) { // from class: o6k0
            public final /* synthetic */ p6k0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                p6k0 p6k0Var = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) p6k0Var.a).h(kyh0.summary_confirm);
                    default:
                        return ((avj0) p6k0Var.a).h(iyh0.rida_summary_set_address);
                }
            }
        });
        final int i2 = 1;
        this.f = a.a(new sls(this) { // from class: o6k0
            public final /* synthetic */ p6k0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                p6k0 p6k0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) p6k0Var.a).h(kyh0.summary_confirm);
                    default:
                        return ((avj0) p6k0Var.a).h(iyh0.rida_summary_set_address);
                }
            }
        });
    }
}
