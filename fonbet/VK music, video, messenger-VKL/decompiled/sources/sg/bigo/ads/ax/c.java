package sg.bigo.ads.ax;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes9.dex */
final class c {

    @Nullable
    private RoundedCorner c;

    @Nullable
    private RoundedCorner d;

    @Nullable
    private RoundedCorner e;

    @Nullable
    private RoundedCorner f;
    private int g = 0;
    private int h = 0;
    int a = 0;
    int b = 0;
    private final double i = Math.sin(Math.toRadians(45.0d));
    private final boolean[] j = {true, false, true, false};
    private final boolean[] k = {true, true, false, false};

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        r0 = r5.getRadius();
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Rect a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, int i, int i2) {
        int radius;
        Point center;
        Point center2;
        if (roundedCorner != null && Build.VERSION.SDK_INT >= 31 && radius > 0) {
            int sin = (int) (radius * Math.sin(Math.toRadians(45.0d)));
            center = roundedCorner.getCenter();
            int i3 = center.x;
            center2 = roundedCorner.getCenter();
            int i4 = center2.y;
            int max = z ? 0 : Math.max(0, i3 - sin);
            int max2 = z2 ? 0 : Math.max(0, i4 - sin);
            if (z) {
                i = Math.min(i, i3 + sin);
            }
            if (z2) {
                i2 = Math.min(i2, i4 + sin);
            }
            Rect rect = new Rect(max, max2, i, i2);
            if (!rect.isEmpty()) {
                return rect;
            }
        }
        return null;
    }

    public final void a(int i, int i2) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (i <= 0 || i2 <= 0) {
            this.h = 0;
            this.g = 0;
            this.b = 0;
            this.a = 0;
            return;
        }
        int[] iArr = {0, 0, i, i2};
        RoundedCorner[] roundedCornerArr = {this.c, this.d, this.e, this.f};
        for (int i3 = 0; i3 < 4; i3++) {
            a(roundedCornerArr[i3], this.j[i3], this.k[i3], iArr);
        }
        this.g = iArr[0];
        this.h = iArr[1];
        this.a = iArr[2];
        this.b = iArr[3];
    }

    public final void a(@NonNull Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i7 = this.a;
        if ((i7 == 0 && this.b == 0) || i7 > i || this.b > i2) {
            a(i, i2);
        }
        int i8 = this.g;
        int i9 = this.h;
        int i10 = this.a;
        int i11 = i10 > 0 ? i10 : i;
        int i12 = this.b;
        int i13 = i12 > 0 ? i12 : i2;
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        arrayList2.add(new int[]{0, 0});
        RoundedCorner[] roundedCornerArr = {this.c, this.d, this.e, this.f};
        int i15 = 0;
        while (i15 < 4) {
            int i16 = i15;
            a(roundedCornerArr[i16], this.j[i16], this.k[i16], rect, i, i2, i8, i9, i11, i13, arrayList, arrayList2);
            i15 = i16 + 1;
        }
        if (arrayList.isEmpty()) {
            Objects.toString(rect);
            return;
        }
        Iterator it = arrayList2.iterator();
        long j = Long.MAX_VALUE;
        boolean z = false;
        int i17 = 0;
        int i18 = 0;
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            int i19 = i14;
            int i20 = iArr[i19];
            int i21 = iArr[1];
            Iterator it2 = it;
            Rect rect2 = new Rect(rect);
            if (!a.a(rect2, i20, i21, i, i2) || a(rect2, arrayList)) {
                it = it2;
                i14 = i19;
                j = j;
            } else {
                long j2 = j;
                long abs = Math.abs(i21) + Math.abs(i20);
                if (!z || abs < j2) {
                    i17 = i21;
                    j = abs;
                    i18 = i20;
                    z = true;
                } else {
                    j = j2;
                }
                it = it2;
                i14 = i19;
            }
        }
        int i22 = i14;
        if (!z) {
            Iterator it3 = arrayList.iterator();
            int i23 = i22;
            int i24 = i23;
            while (it3.hasNext()) {
                Rect rect3 = (Rect) it3.next();
                if (Rect.intersects(rect, rect3)) {
                    if (rect3.left == 0 && (i6 = rect.left) < i8) {
                        i24 = Math.max(i24, i8 - i6);
                    }
                    if (rect3.right == i && (i5 = rect.right) > i11) {
                        int i25 = i11 - i5;
                        if (i24 == 0 || Math.abs(i25) < Math.abs(i24)) {
                            i24 = i25;
                        }
                    }
                    if (rect3.top == 0 && (i4 = rect.top) < i9) {
                        i23 = Math.max(i23, i9 - i4);
                    }
                    if (rect3.bottom == i2 && (i3 = rect.bottom) > i13) {
                        int i26 = i13 - i3;
                        if (i23 == 0 || Math.abs(i26) < Math.abs(i23)) {
                            i23 = i26;
                        }
                    }
                }
            }
            int i27 = -rect.left;
            int i28 = i - rect.right;
            int i29 = -rect.top;
            int i30 = i2 - rect.bottom;
            i18 = i24 < i27 ? i27 : i24 > i28 ? i28 : i24;
            i17 = i23 < i29 ? i29 : i23 > i30 ? i30 : i23;
        }
        Objects.toString(rect);
        if (i18 == 0 && i17 == 0) {
            return;
        }
        rect.offset(i18, i17);
    }

    public final void a(@NonNull Rect rect, int i, int i2, int i3) {
        int i4;
        if (i3 != 1 && i3 != 2) {
            a(rect, i, i2);
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i5 = this.a;
        if ((i5 == 0 && this.b == 0) || i5 > i || this.b > i2) {
            a(i, i2);
        }
        int i6 = this.g;
        int i7 = this.h;
        int i8 = this.a;
        if (i8 <= 0) {
            i8 = i;
        }
        int i9 = this.b;
        if (i9 <= 0) {
            i9 = i2;
        }
        int i10 = 0;
        if (i3 == 1) {
            int i11 = rect.left;
            if (i11 < i6) {
                i4 = 0;
                i10 = i6 - i11;
            } else {
                int i12 = rect.right;
                if (i12 > i8) {
                    i4 = 0;
                    i10 = i8 - i12;
                }
                i4 = 0;
            }
        } else {
            int i13 = rect.top;
            if (i13 < i7) {
                i4 = i7 - i13;
            } else {
                int i14 = rect.bottom;
                if (i14 > i9) {
                    i4 = i9 - i14;
                }
                i4 = 0;
            }
        }
        if (i10 == 0 && i4 == 0) {
            Objects.toString(rect);
            return;
        }
        boolean a = a.a(new Rect(rect), i10, i4, i, i2);
        Objects.toString(rect);
        if (a) {
            rect.offset(i10, i4);
        }
    }

    public final void a(@Nullable RoundedCorner roundedCorner, @Nullable RoundedCorner roundedCorner2, @Nullable RoundedCorner roundedCorner3, @Nullable RoundedCorner roundedCorner4) {
        this.c = roundedCorner;
        this.d = roundedCorner2;
        this.e = roundedCorner3;
        this.f = roundedCorner4;
    }

    private static void a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, @NonNull Rect rect, int i, int i2, int i3, int i4, int i5, int i6, @NonNull List<Rect> list, @NonNull List<int[]> list2) {
        Rect a;
        int i7;
        int i8;
        if (roundedCorner == null || (a = a(roundedCorner, z, z2, i, i2)) == null || !Rect.intersects(rect, a)) {
            return;
        }
        list.add(a);
        if (z) {
            int i9 = rect.left;
            if (i9 < i3) {
                i7 = i3 - i9;
            }
            i7 = 0;
        } else {
            int i10 = rect.right;
            if (i10 > i5) {
                i7 = i5 - i10;
            }
            i7 = 0;
        }
        if (z2) {
            int i11 = rect.top;
            if (i11 < i4) {
                i8 = i4 - i11;
            }
            i8 = 0;
        } else {
            int i12 = rect.bottom;
            if (i12 > i6) {
                i8 = i6 - i12;
            }
            i8 = 0;
        }
        a(list2, i7, 0);
        a(list2, 0, i8);
        a(list2, i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        r0 = r5.getRadius();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, int[] iArr) {
        int radius;
        Point center;
        Point center2;
        if (roundedCorner != null && Build.VERSION.SDK_INT >= 31 && radius > 0) {
            int i = (int) (radius * this.i);
            center = roundedCorner.getCenter();
            int i2 = center.x;
            center2 = roundedCorner.getCenter();
            int i3 = center2.y;
            if (z) {
                iArr[0] = Math.max(iArr[0], i2 - i);
            } else {
                iArr[2] = Math.min(iArr[2], i2 + i);
            }
            if (z2) {
                iArr[1] = Math.max(iArr[1], i3 - i);
            } else {
                iArr[3] = Math.min(iArr[3], i3 + i);
            }
        }
    }

    private static void a(@NonNull List<int[]> list, int i, int i2) {
        for (int[] iArr : list) {
            if (iArr[0] == i && iArr[1] == i2) {
                return;
            }
        }
        list.add(new int[]{i, i2});
    }

    private static boolean a(@NonNull Rect rect, @NonNull List<Rect> list) {
        for (Rect rect2 : list) {
            if (rect2 != null && Rect.intersects(rect, rect2)) {
                return true;
            }
        }
        return false;
    }
}
