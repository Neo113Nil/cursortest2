package defpackage;

import com.yandex.go.taxi.summary.routestops.e;
import kotlin.a;

/* loaded from: classes13.dex */
public final class ffl0 {
    public final zuj0 a;
    public final e b;
    public final w810 c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public ffl0(zuj0 zuj0Var, e eVar, w810 w810Var) {
        this.a = zuj0Var;
        this.b = eVar;
        this.c = w810Var;
        final int i = 0;
        this.d = a.a(new sls(this) { // from class: efl0
            public final /* synthetic */ ffl0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                ffl0 ffl0Var = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) ffl0Var.a).h(kyh0.add_route_stop);
                    case 1:
                        zuj0 zuj0Var2 = ffl0Var.a;
                        avj0 avj0Var = (avj0) zuj0Var2;
                        avj0 avj0Var2 = (avj0) zuj0Var2;
                        return new mzi0(avj0Var.h(kyh0.reorder_action_set_first), avj0Var2.h(kyh0.reorder_action_move_above), avj0Var2.h(kyh0.reorder_action_move_below), avj0Var2.h(kyh0.reorder_action_set_last));
                    default:
                        return ((avj0) ffl0Var.a).h(kyh0.remove_stop_content_description);
                }
            }
        });
        final int i2 = 1;
        this.e = a.a(new sls(this) { // from class: efl0
            public final /* synthetic */ ffl0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                ffl0 ffl0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) ffl0Var.a).h(kyh0.add_route_stop);
                    case 1:
                        zuj0 zuj0Var2 = ffl0Var.a;
                        avj0 avj0Var = (avj0) zuj0Var2;
                        avj0 avj0Var2 = (avj0) zuj0Var2;
                        return new mzi0(avj0Var.h(kyh0.reorder_action_set_first), avj0Var2.h(kyh0.reorder_action_move_above), avj0Var2.h(kyh0.reorder_action_move_below), avj0Var2.h(kyh0.reorder_action_set_last));
                    default:
                        return ((avj0) ffl0Var.a).h(kyh0.remove_stop_content_description);
                }
            }
        });
        final int i3 = 2;
        this.f = a.a(new sls(this) { // from class: efl0
            public final /* synthetic */ ffl0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                ffl0 ffl0Var = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) ffl0Var.a).h(kyh0.add_route_stop);
                    case 1:
                        zuj0 zuj0Var2 = ffl0Var.a;
                        avj0 avj0Var = (avj0) zuj0Var2;
                        avj0 avj0Var2 = (avj0) zuj0Var2;
                        return new mzi0(avj0Var.h(kyh0.reorder_action_set_first), avj0Var2.h(kyh0.reorder_action_move_above), avj0Var2.h(kyh0.reorder_action_move_below), avj0Var2.h(kyh0.reorder_action_set_last));
                    default:
                        return ((avj0) ffl0Var.a).h(kyh0.remove_stop_content_description);
                }
            }
        });
    }

    public static afl0 a(x81 x81Var, boolean z, String str, int i) {
        zzs B = x81Var.a.B();
        return new afl0(B, x81Var.b, z, str, x81Var.d, i, x81Var.c, str + B);
    }
}
