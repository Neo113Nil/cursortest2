package xsna;

import java.io.IOException;

/* compiled from: ScalingList.java */
/* loaded from: classes13.dex */
public final class e5h0 {
    public int[] a;
    public boolean b;

    public static e5h0 a(uu8 uu8Var, int i) throws IOException {
        e5h0 e5h0Var = new e5h0();
        e5h0Var.a = new int[i];
        int i2 = 8;
        int i3 = 8;
        int i4 = 0;
        while (i4 < i) {
            if (i2 != 0) {
                i2 = ((uu8Var.e("deltaScale") + i3) + 256) % 256;
                e5h0Var.b = i4 == 0 && i2 == 0;
            }
            int[] iArr = e5h0Var.a;
            if (i2 != 0) {
                i3 = i2;
            }
            iArr[i4] = i3;
            i4++;
        }
        return e5h0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScalingList{scalingList=");
        sb.append(this.a);
        sb.append(", useDefaultScalingMatrixFlag=");
        return defpackage.q0.a(sb, this.b, '}');
    }
}
