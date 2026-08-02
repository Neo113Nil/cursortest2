package defpackage;

import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes14.dex */
public final class iaw0 extends omr {
    public final aaw0 b;
    public final lh2 c;

    public iaw0(aaw0 aaw0Var) {
        this.b = aaw0Var;
        final int i = 0;
        final int i2 = 1;
        this.c = new lh2(new sls(this) { // from class: haw0
            public final /* synthetic */ iaw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i;
                iaw0 iaw0Var = this.b;
                switch (i3) {
                    case 0:
                        return iaw0Var.b.c == null ? NavigationDirection.FORWARD : NavigationDirection.NO_ANIMATE;
                    default:
                        return iaw0Var.a ? NavigationDirection.NO_ANIMATE : NavigationDirection.BACKWARD;
                }
            }
        }, new sls(this) { // from class: haw0
            public final /* synthetic */ iaw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i3 = i2;
                iaw0 iaw0Var = this.b;
                switch (i3) {
                    case 0:
                        return iaw0Var.b.c == null ? NavigationDirection.FORWARD : NavigationDirection.NO_ANIMATE;
                    default:
                        return iaw0Var.a ? NavigationDirection.NO_ANIMATE : NavigationDirection.BACKWARD;
                }
            }
        });
    }

    @Override // defpackage.rmr
    public final mh2 a() {
        return this.c;
    }
}
