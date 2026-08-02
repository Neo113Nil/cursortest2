package yads;

import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* loaded from: classes10.dex */
public final class ej0 {
    public final String a;

    public ej0(String str) {
        this.a = str;
    }

    public static ej0 a(kc2 kc2Var) {
        String str;
        kc2Var.e(kc2Var.b + 2);
        int m = kc2Var.m();
        int i = m >> 1;
        int m2 = ((kc2Var.m() >> 3) & 31) | ((m & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = VisualSampleEntry.TYPE7;
        } else {
            if (i != 9) {
                return null;
            }
            str = VisualSampleEntry.TYPE4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        return new ej0(xsna.z23.b(m2, m2 >= 10 ? "." : ".0", sb));
    }
}
