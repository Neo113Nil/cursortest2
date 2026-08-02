package xsna;

import com.vk.dto.common.TimelineThumbs;
import xsna.dt1;

/* compiled from: TimelineCropper.kt */
/* loaded from: classes2.dex */
public final class nwo0 {
    public final TimelineThumbs a;
    public final int b;
    public final int c;
    public final int d;
    public final uwo0 e;

    public nwo0(TimelineThumbs timelineThumbs) {
        this.a = timelineThumbs;
        int i = timelineThumbs.d;
        i = i < 1 ? 1 : i;
        this.b = i;
        int i2 = timelineThumbs.e;
        int i3 = timelineThumbs.g;
        i3 = i3 <= 0 ? 1 : i3;
        this.c = i3;
        this.d = i3 * i2;
        this.e = new uwo0((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(i2 / (i >= 1 ? i : 1)) & 4294967295L));
    }

    public final dt1 a(int i) {
        int i2;
        int i3;
        int i4 = this.d;
        if (i4 <= 0 || (i2 = this.b) <= 0 || (i3 = this.c) <= 0) {
            dt1.a.getClass();
            return dt1.a.b;
        }
        int i5 = (i - ((i / i4) * i4)) / i3;
        return new fwo0(((i5 % i2) << 32) | ((i5 / i2) & 4294967295L));
    }

    public final String b(int i) {
        int i2;
        TimelineThumbs timelineThumbs = this.a;
        if (timelineThumbs.i.isEmpty() || (i2 = this.d) <= 0) {
            return null;
        }
        return (String) j5g.b0(swe0.g(i / i2, 0, e43.h(timelineThumbs.i)), timelineThumbs.i);
    }
}
