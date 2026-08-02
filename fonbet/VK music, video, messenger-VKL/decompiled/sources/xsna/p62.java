package xsna;

import android.view.ViewConfiguration;
import java.util.List;

/* compiled from: AndroidScrollable.android.kt */
/* loaded from: classes11.dex */
public final class p62 implements afh0 {
    public final ViewConfiguration a;

    public p62(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // xsna.afh0
    public final long a(plb0 plb0Var) {
        ViewConfiguration viewConfiguration = this.a;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List<xlb0> list = plb0Var.a;
        ov70 ov70Var = new ov70(0L);
        int size = list.size();
        int i = 0;
        while (true) {
            long j = ov70Var.a;
            if (i >= size) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f2;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
                return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            }
            ov70Var = new ov70(ov70.f(j, list.get(i).j));
            i++;
        }
    }
}
