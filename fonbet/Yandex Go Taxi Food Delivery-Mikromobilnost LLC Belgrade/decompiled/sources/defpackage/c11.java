package defpackage;

import android.content.Context;
import com.yandex.go.address.address_map_picker.domain.c;
import com.yandex.go.address.address_map_picker.domain.h;
import com.yandex.go.address.address_map_picker.ui.state.a;

/* loaded from: classes12.dex */
public final class c11 extends pgd {
    public final Context F;
    public final w030 G;
    public final a H;
    public final com.yandex.go.address.address_map_picker.ui.actions.a I;
    public final yvf0 J;
    public final h K;
    public final yvf0 L;
    public final yvf0 M;
    public final zuj0 N;
    public final yvf0 O;
    public final c P;
    public final alm Q;
    public final g21 R;
    public final i3y S;
    public final i3y T;
    public final mu5 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(Context context, w030 w030Var, a aVar, com.yandex.go.address.address_map_picker.ui.actions.a aVar2, yvf0 yvf0Var, h hVar, yvf0 yvf0Var2, yvf0 yvf0Var3, zuj0 zuj0Var, yvf0 yvf0Var4, c cVar, alm almVar, g21 g21Var) {
        super(0);
        final int i = 0;
        this.F = context;
        this.G = w030Var;
        this.H = aVar;
        this.I = aVar2;
        this.J = yvf0Var;
        this.K = hVar;
        this.L = yvf0Var2;
        this.M = yvf0Var3;
        this.N = zuj0Var;
        this.O = yvf0Var4;
        this.P = cVar;
        this.Q = almVar;
        this.R = g21Var;
        this.S = kotlin.a.a(new sls(this) { // from class: x01
            public final /* synthetic */ c11 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                c11 c11Var = this.b;
                switch (i2) {
                    case 0:
                        return (w71) c11Var.L.get();
                    default:
                        return new b11(c11Var);
                }
            }
        });
        final int i2 = 1;
        this.T = kotlin.a.a(new sls(this) { // from class: x01
            public final /* synthetic */ c11 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                c11 c11Var = this.b;
                switch (i22) {
                    case 0:
                        return (w71) c11Var.L.get();
                    default:
                        return new b11(c11Var);
                }
            }
        });
        this.U = new mu5(new y4(20, this));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.U;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
