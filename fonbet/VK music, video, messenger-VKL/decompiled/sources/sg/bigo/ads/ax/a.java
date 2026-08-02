package sg.bigo.ads.ax;

import android.graphics.Rect;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class a {
    public static void a(@NonNull Rect rect, @NonNull Rect rect2, int i, int i2) {
        int abs;
        int abs2;
        int abs3;
        if (Rect.intersects(rect, rect2)) {
            int i3 = rect.left;
            int i4 = rect2.right;
            int i5 = i3 - i4;
            int i6 = rect.right - rect2.left;
            int i7 = rect.top - rect2.bottom;
            int i8 = rect.bottom - rect2.top;
            int i9 = Integer.MAX_VALUE;
            int i10 = 0;
            if (i4 <= i3 || !a(new Rect(rect2), i5, 0, i, i2) || (abs3 = Math.abs(i5)) >= Integer.MAX_VALUE) {
                i5 = 0;
            } else {
                i9 = abs3;
            }
            if (rect2.left >= rect.right || !a(new Rect(rect2), i6, 0, i, i2) || (abs2 = Math.abs(i6)) >= i9) {
                i6 = i5;
            } else {
                i9 = abs2;
            }
            if (rect2.bottom <= rect.top || !a(new Rect(rect2), 0, i7, i, i2) || (abs = Math.abs(i7)) >= i9) {
                i7 = 0;
            } else {
                i9 = abs;
                i6 = 0;
            }
            if (rect2.top >= rect.bottom || !a(new Rect(rect2), 0, i8, i, i2) || Math.abs(i8) >= i9) {
                i10 = i6;
                i8 = i7;
            }
            rect2.toString();
            rect.toString();
            rect2.offset(i10, i8);
        }
    }

    public static boolean a(@NonNull Rect rect, int i, int i2, int i3, int i4) {
        return rect.left + i >= 0 && rect.top + i2 >= 0 && rect.right + i <= i3 && rect.bottom + i2 <= i4;
    }
}
