package sg.bigo.ads.ba;

import java.text.DecimalFormat;
import xsna.fo8;

/* loaded from: classes9.dex */
final class j {
    public static String a(float f) {
        String str;
        if (f >= 1048576.0f) {
            f = (f / 1024.0f) / 1024.0f;
            str = "mb/s";
        } else if (f >= 1024.0f) {
            f /= 1024.0f;
            str = "kb/s";
        } else {
            str = "b/s";
        }
        return fo8.a(new DecimalFormat("0.00").format(f), str);
    }
}
