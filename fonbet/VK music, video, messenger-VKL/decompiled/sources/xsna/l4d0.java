package xsna;

import com.vk.dto.common.TimelineThumbs;
import kotlin.Pair;

/* compiled from: PreviewImageSize.kt */
/* loaded from: classes3.dex */
public final class l4d0 {
    public final int a;
    public final int b = iah0.a(135);
    public final Pair<Integer, Integer> c;
    public final Pair<Integer, Integer> d;

    public l4d0() {
        float f = 160;
        this.a = iah0.a(f);
        this.c = new Pair<>(Integer.valueOf(iah0.a(f)), Integer.valueOf(iah0.a(90)));
        float f2 = 120;
        this.d = new Pair<>(Integer.valueOf(iah0.a(f2)), Integer.valueOf(iah0.a(f2)));
    }

    public final Pair<Integer, Integer> a(TimelineThumbs timelineThumbs, boolean z, boolean z2, Integer num) {
        Pair<Integer, Integer> pair;
        int i = (z && z2) ? 2 : 1;
        Pair<Integer, Integer> pair2 = this.c;
        if (timelineThumbs == null) {
            Integer valueOf = Integer.valueOf(pair2.i().intValue() * i);
            Integer valueOf2 = Integer.valueOf(pair2.j().intValue() * i);
            pair2.getClass();
            return new Pair<>(valueOf, valueOf2);
        }
        float f = timelineThumbs.b / timelineThumbs.c;
        if (num != null) {
            pair2 = new Pair<>(Integer.valueOf((int) (num.intValue() * f)), num);
        } else {
            double d = f;
            if (0.9d > d || d > 1.1d) {
                if (d < 0.9d) {
                    int i2 = this.b;
                    pair = new Pair<>(Integer.valueOf((int) (i2 * f)), Integer.valueOf(i2));
                } else if (1.1d <= d && d <= 1.6d) {
                    int i3 = this.a;
                    pair = new Pair<>(Integer.valueOf(i3), Integer.valueOf((int) (i3 / f)));
                }
                pair2 = pair;
            } else {
                pair2 = this.d;
            }
        }
        return new Pair<>(Integer.valueOf(pair2.i().intValue() * i), Integer.valueOf(pair2.j().intValue() * i));
    }
}
