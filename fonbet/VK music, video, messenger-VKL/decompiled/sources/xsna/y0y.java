package xsna;

import com.facebook.common.internal.ImmutableList;
import java.util.Collections;

/* compiled from: JpegTranscoderUtils.kt */
/* loaded from: classes12.dex */
public final class y0y {
    public static final ImmutableList<Integer> a;

    static {
        ImmutableList<Integer> immutableList = new ImmutableList<>(4);
        Collections.addAll(immutableList, 2, 7, 4, 5);
        a = immutableList;
    }

    public static final int a(eng0 eng0Var, rip ripVar) {
        ripVar.y();
        Integer valueOf = Integer.valueOf(ripVar.e);
        ImmutableList<Integer> immutableList = a;
        int indexOf = immutableList.indexOf(valueOf);
        if (indexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        int i = eng0Var.a;
        if (i == -1) {
            i = 0;
        } else if (i == -1) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return immutableList.get(((i / 90) + indexOf) % immutableList.size()).intValue();
    }

    public static final int b(eng0 eng0Var, rip ripVar) {
        int i = 0;
        if (eng0Var.a == -2) {
            return 0;
        }
        ripVar.y();
        int i2 = ripVar.d;
        if (i2 == 90 || i2 == 180 || i2 == 270) {
            ripVar.y();
            i = ripVar.d;
        }
        int i3 = eng0Var.a;
        if (i3 == -1) {
            return i;
        }
        if (i3 != -1) {
            return (i3 + i) % 360;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public static final int c(eng0 eng0Var, x9g0 x9g0Var, rip ripVar, boolean z) {
        int i;
        int i2;
        if (z && x9g0Var != null) {
            int b = b(eng0Var, ripVar);
            ripVar.y();
            int a2 = a.contains(Integer.valueOf(ripVar.e)) ? a(eng0Var, ripVar) : 0;
            boolean z2 = b == 90 || b == 270 || a2 == 5 || a2 == 7;
            if (z2) {
                ripVar.y();
                i = ripVar.g;
            } else {
                ripVar.y();
                i = ripVar.f;
            }
            if (z2) {
                ripVar.y();
                i2 = ripVar.f;
            } else {
                ripVar.y();
                i2 = ripVar.g;
            }
            float f = i;
            float f2 = i2;
            float max = Math.max(x9g0Var.a / f, x9g0Var.b / f2);
            float f3 = f * max;
            float f4 = x9g0Var.c;
            if (f3 > f4) {
                max = f4 / f;
            }
            if (f2 * max > f4) {
                max = f4 / f2;
            }
            int i3 = (int) ((max * 8) + x9g0Var.d);
            if (i3 <= 8) {
                if (i3 < 1) {
                    return 1;
                }
                return i3;
            }
        }
        return 8;
    }
}
