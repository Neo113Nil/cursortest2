package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.summary.solid.interactor.t;

/* loaded from: classes14.dex */
public final class jfv0 {
    public final zuj0 a;
    public final t b;
    public final kg00 c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public jfv0(zuj0 zuj0Var, t tVar, kg00 kg00Var) {
        this.a = zuj0Var;
        this.b = tVar;
        this.c = kg00Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: ifv0
            public final /* synthetic */ jfv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i2 = i;
                jfv0 jfv0Var = this.b;
                switch (i2) {
                    case 0:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_bottom_margin);
                        break;
                    default:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_plus_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ifv0
            public final /* synthetic */ jfv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i2;
                jfv0 jfv0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_bottom_margin);
                        break;
                    default:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_plus_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i3 = 2;
        this.f = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ifv0
            public final /* synthetic */ jfv0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i3;
                jfv0 jfv0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_top_margin);
                        break;
                    case 1:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_route_bottom_margin);
                        break;
                    default:
                        c = ((avj0) jfv0Var.a).c(rsg0.summary_plus_top_offset_padding);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
    }
}
