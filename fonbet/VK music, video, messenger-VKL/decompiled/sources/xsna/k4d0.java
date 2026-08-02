package xsna;

import kotlin.Pair;

/* compiled from: PreviewImageSize.kt */
@ozl
/* loaded from: classes8.dex */
public final class k4d0 {
    public final int a;
    public final int b = (int) x5r0.a(135, 1);
    public final Pair<Integer, Integer> c;
    public final Pair<Integer, Integer> d;

    public k4d0() {
        float f = 160;
        this.a = (int) x5r0.a(f, 1);
        this.c = new Pair<>(Integer.valueOf((int) x5r0.a(f, 1)), Integer.valueOf((int) x5r0.a(90, 1)));
        float f2 = 120;
        this.d = new Pair<>(Integer.valueOf((int) x5r0.a(f2, 1)), Integer.valueOf((int) x5r0.a(f2, 1)));
    }

    public final Pair<Integer, Integer> a(zwo0 zwo0Var, boolean z, boolean z2) {
        Pair<Integer, Integer> pair;
        int i = (z && z2) ? 2 : 1;
        Pair<Integer, Integer> pair2 = this.c;
        if (zwo0Var == null) {
            return new Pair<>(Integer.valueOf(pair2.i().intValue() * i), Integer.valueOf(pair2.j().intValue() * i));
        }
        float b = zwo0Var.b() / zwo0Var.h();
        double d = b;
        if (0.9d > d || d > 1.1d) {
            if (d < 0.9d) {
                int i2 = this.b;
                pair = new Pair<>(Integer.valueOf((int) (i2 * b)), Integer.valueOf(i2));
            } else if (1.1d <= d && d <= 1.6d) {
                int i3 = this.a;
                pair = new Pair<>(Integer.valueOf(i3), Integer.valueOf((int) (i3 / b)));
            }
            pair2 = pair;
        } else {
            pair2 = this.d;
        }
        return new Pair<>(Integer.valueOf(pair2.i().intValue() * i), Integer.valueOf(pair2.j().intValue() * i));
    }
}
