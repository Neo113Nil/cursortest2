package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class gpl {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r11 == Integer.MAX_VALUE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(int i, int i2, int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i) - i2;
        int i6 = 0;
        int max = Math.max(0, size);
        if (mode == Integer.MIN_VALUE) {
            if (i3 < 0 || i3 > Integer.MAX_VALUE) {
                if (i3 == -1) {
                    i3 = Math.min(Math.max(max, i4), i5);
                } else if (i3 != -2) {
                    if (i3 == -3) {
                        i3 = Math.min(Math.max(max, i4), i5);
                    }
                    i3 = 0;
                }
                i6 = Integer.MIN_VALUE;
            }
            i6 = 1073741824;
        } else if (mode != 0) {
            if (mode == 1073741824) {
                if (i3 < 0 || i3 > Integer.MAX_VALUE) {
                    if (i3 == -1) {
                        i3 = Math.min(Math.max(max, i4), i5);
                    } else if (i3 != -2) {
                        if (i3 == -3) {
                            i3 = Math.min(Math.max(max, i4), i5);
                            i6 = Integer.MIN_VALUE;
                        }
                    }
                }
                i6 = 1073741824;
            }
            i3 = 0;
        } else {
            if (i3 < 0) {
            }
            i6 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i3, i6);
    }
}
