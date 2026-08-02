package defpackage;

import android.view.View;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes.dex */
public final class lbw0 {
    public final View a;
    public final zbw0 b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public lbw0(final boolean z, View view, zbw0 zbw0Var) {
        this.a = view;
        this.b = zbw0Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: jbw0
            public final /* synthetic */ lbw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                lbw0 lbw0Var = this.b;
                switch (i2) {
                    case 0:
                        View view2 = lbw0Var.a;
                        bau bauVar = new bau();
                        bauVar.a = view2;
                        return bauVar;
                    case 1:
                        View view3 = lbw0Var.a;
                        ubu ubuVar = new ubu();
                        ubuVar.a = view3;
                        return ubuVar;
                    default:
                        return new n9u(lbw0Var.a);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = a.b(lazyThreadSafetyMode, slsVar);
        this.d = a.b(lazyThreadSafetyMode, new sls() { // from class: kbw0
            @Override // defpackage.sls
            public final Object invoke() {
                return new scu(lbw0.this.a, z);
            }
        });
        final int i2 = 1;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: jbw0
            public final /* synthetic */ lbw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                lbw0 lbw0Var = this.b;
                switch (i22) {
                    case 0:
                        View view2 = lbw0Var.a;
                        bau bauVar = new bau();
                        bauVar.a = view2;
                        return bauVar;
                    case 1:
                        View view3 = lbw0Var.a;
                        ubu ubuVar = new ubu();
                        ubuVar.a = view3;
                        return ubuVar;
                    default:
                        return new n9u(lbw0Var.a);
                }
            }
        });
        final int i3 = 2;
        this.f = a.b(lazyThreadSafetyMode, new sls(this) { // from class: jbw0
            public final /* synthetic */ lbw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                lbw0 lbw0Var = this.b;
                switch (i22) {
                    case 0:
                        View view2 = lbw0Var.a;
                        bau bauVar = new bau();
                        bauVar.a = view2;
                        return bauVar;
                    case 1:
                        View view3 = lbw0Var.a;
                        ubu ubuVar = new ubu();
                        ubuVar.a = view3;
                        return ubuVar;
                    default:
                        return new n9u(lbw0Var.a);
                }
            }
        });
    }
}
