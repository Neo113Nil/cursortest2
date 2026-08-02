package defpackage;

import com.yandex.go.flex.common.facade.routers.views.SlideableFlexViewSheetGeometryCalculator$ContentHeightSource;

/* loaded from: classes12.dex */
public final class fos0 implements eos0 {
    public static int d(dos0 dos0Var) {
        return Math.max(dos0Var.a, Math.max(dos0Var.b, dos0Var.c));
    }

    public static i6z0 e(cos0 cos0Var) {
        dos0 dos0Var = cos0Var.a;
        int i = cos0Var.c;
        int d = d(dos0Var);
        Integer num = cos0Var.e;
        Integer num2 = null;
        Integer valueOf = num != null ? Integer.valueOf(num.intValue() + d) : null;
        if (d == 0 && !dos0Var.g) {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
            return new i6z0(i, 0, 10);
        }
        Integer num3 = cos0Var.d;
        if (num3 != null && num3.intValue() > 0) {
            num2 = num3;
        }
        boolean z = num2 == null && valueOf != null && i > valueOf.intValue() && !dos0Var.g;
        boolean z2 = num2 != null && valueOf != null && i > num2.intValue() && num2.intValue() >= valueOf.intValue() && num2.intValue() <= valueOf.intValue() + d && !dos0Var.g;
        if (!z2) {
            if (num2 != null) {
                i = num2.intValue();
            } else if (!z && valueOf != null) {
                i = valueOf.intValue();
            }
        }
        if (z2) {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource2 = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
        } else if (num2 != null) {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource3 = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
        } else if (z) {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource4 = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
        } else if (valueOf != null) {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource5 = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
        } else {
            SlideableFlexViewSheetGeometryCalculator$ContentHeightSource slideableFlexViewSheetGeometryCalculator$ContentHeightSource6 = SlideableFlexViewSheetGeometryCalculator$ContentHeightSource.CARD;
        }
        if (!z2) {
            d = (!dos0Var.g && d(dos0Var) == 0) ? dos0Var.d : 0;
        }
        return new i6z0(i + d, d, 10);
    }

    public final int a(cos0 cos0Var, boolean z) {
        int d = d(cos0Var.a);
        dos0 dos0Var = cos0Var.a;
        int i = (dos0Var.g || d != 0) ? 0 : dos0Var.d;
        i6z0 e = e(cos0Var);
        if (dos0Var.g) {
            return dos0Var.e - dos0Var.a;
        }
        int i2 = e.c;
        return i2 > 0 ? Math.max(i2, i) : (cos0Var.e == null || z) ? Math.max(d, i) : i;
    }

    public final int b(cos0 cos0Var) {
        dos0 dos0Var = cos0Var.a;
        boolean z = dos0Var.g;
        int i = dos0Var.e;
        if (!z) {
            i = Math.max(i, d(dos0Var));
        }
        int a = i - a(cos0Var, f(cos0Var));
        if (a < 0) {
            return 0;
        }
        return a;
    }

    public final int c(cos0 cos0Var) {
        int i;
        int max;
        int i2;
        Integer num = cos0Var.e;
        int i3 = cos0Var.c;
        dos0 dos0Var = cos0Var.a;
        Integer valueOf = num != null ? Integer.valueOf(d(dos0Var) + num.intValue()) : null;
        int i4 = e(cos0Var).b;
        if (f(cos0Var)) {
            i4 = Math.max(i4, i3);
        }
        int i5 = cos0Var.b - ((!dos0Var.g && d(dos0Var) == 0) ? dos0Var.d : 0);
        if (i5 < 0) {
            i5 = 0;
        }
        boolean z = cos0Var.f;
        int d = dos0Var.g ? dos0Var.e : d(dos0Var);
        if (!z || valueOf == null) {
            if (valueOf != null) {
                max = Math.max(i4, valueOf.intValue());
                i = i5 - max;
            } else {
                i = (i5 - i4) - d;
            }
        } else if (i4 > valueOf.intValue()) {
            i = Math.max(0, i5 - i4);
        } else {
            max = valueOf.intValue();
            i = i5 - max;
        }
        if (f(cos0Var) && i5 > 0) {
            int b = i5 - b(cos0Var);
            int max2 = Math.max(cos0Var.j, i3);
            if (max2 > 0 && b > 0 && (i2 = (max2 + i) - b) > 0) {
                int i6 = i - i2;
                int i7 = (int) cos0Var.h;
                if (i7 < 1) {
                    i7 = 1;
                }
                i = i6 - i7;
                if (i < 0) {
                    return 0;
                }
            }
        }
        return i;
    }

    public final boolean f(cos0 cos0Var) {
        int i;
        int i2;
        dos0 dos0Var = cos0Var.a;
        if (!dos0Var.g) {
            int max = Math.max(dos0Var.e, d(dos0Var));
            if (max > 0 && max > (i = cos0Var.a.f) && (i2 = cos0Var.b) > 0) {
                if (i < 0) {
                    i = 0;
                }
                int i3 = cos0Var.g;
                int i4 = (int) cos0Var.h;
                if (i4 < 1) {
                    i4 = 1;
                }
                if (i2 + i <= i3 + i4) {
                }
            }
            return false;
        }
        return true;
    }
}
