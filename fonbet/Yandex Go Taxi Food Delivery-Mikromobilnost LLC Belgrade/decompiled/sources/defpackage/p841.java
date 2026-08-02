package defpackage;

import androidx.lifecycle.Lifecycle;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes8.dex */
public final class p841 extends omr {
    public boolean b = true;
    public sls c = new gs21(20);
    public final lh2 d;

    public p841() {
        final int i = 0;
        final int i2 = 1;
        this.d = new lh2(new sls(this) { // from class: o841
            public final /* synthetic */ p841 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                p841 p841Var = this.b;
                switch (i3) {
                    case 0:
                        if (!p841Var.b) {
                            break;
                        } else {
                            p841Var.b = false;
                            break;
                        }
                    default:
                        if (p841Var.c.invoke() != Lifecycle.State.STARTED) {
                            break;
                        } else {
                            break;
                        }
                }
                return NavigationDirection.BACKWARD;
            }
        }, new sls(this) { // from class: o841
            public final /* synthetic */ p841 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                p841 p841Var = this.b;
                switch (i3) {
                    case 0:
                        if (!p841Var.b) {
                            break;
                        } else {
                            p841Var.b = false;
                            break;
                        }
                    default:
                        if (p841Var.c.invoke() != Lifecycle.State.STARTED) {
                            break;
                        } else {
                            break;
                        }
                }
                return NavigationDirection.BACKWARD;
            }
        });
    }

    @Override // defpackage.rmr
    public final mh2 a() {
        return this.d;
    }
}
