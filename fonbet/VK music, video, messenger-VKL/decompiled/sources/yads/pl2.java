package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class pl2 implements jk1 {
    public final float a;
    public final ik1 b;
    public final mi c;

    public pl2(float f) {
        this(f, new ik1());
    }

    @Override // yads.jk1
    public final ik1 a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            int round = Math.round(size / this.c.a);
            if (mode2 == Integer.MIN_VALUE) {
                round = (int) Math.min(size2, round);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
        } else if (mode2 == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0)) {
            int round2 = Math.round(size2 * this.c.a);
            if (mode == Integer.MIN_VALUE) {
                round2 = (int) Math.min(size, round2);
            }
            i = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
        } else if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            float f = size;
            float f2 = size2;
            if (f / f2 > this.a) {
                i = View.MeasureSpec.makeMeasureSpec(Math.round(f2 * this.c.a), 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int round3 = Math.round(f / this.c.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(round3, 1073741824);
                i = makeMeasureSpec;
            }
        }
        ik1 ik1Var = this.b;
        ik1Var.a = i;
        ik1Var.b = i2;
        return ik1Var;
    }

    public /* synthetic */ pl2(float f, ik1 ik1Var) {
        this(f, ik1Var, new mi(f));
    }

    public pl2(float f, ik1 ik1Var, mi miVar) {
        this.a = f;
        this.b = ik1Var;
        this.c = miVar;
    }
}
