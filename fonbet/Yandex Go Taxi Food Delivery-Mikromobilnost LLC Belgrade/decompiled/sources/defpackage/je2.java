package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class je2 {
    public static final ViewGroup.MarginLayoutParams b;
    public final LinearLayoutManager a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public je2(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public static boolean a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        r0 = r11.d0();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r3 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
    
        if (a(r11.c0(r3)) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (r4[r0 - 1][1] >= r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r11.d0() <= 1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        int top;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.a;
        int d0 = linearLayoutManager.d0();
        if (d0 != 0) {
            boolean z = linearLayoutManager.J == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, d0, 2);
            for (int i3 = 0; i3 < d0; i3++) {
                View c0 = linearLayoutManager.c0(i3);
                if (c0 == null) {
                    ny61.r("null view contained in the view hierarchy");
                    return false;
                }
                ViewGroup.LayoutParams layoutParams = c0.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : b;
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = c0.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = c0.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = c0.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = c0.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new rvr(6));
            int i4 = 1;
            while (true) {
                if (i4 >= d0) {
                    int[] iArr4 = iArr[0];
                    int i5 = iArr4[1];
                    int i6 = iArr4[0];
                    int i7 = i5 - i6;
                    if (i6 <= 0) {
                    }
                } else {
                    if (iArr[i4 - 1][1] != iArr[i4][0]) {
                        break;
                    }
                    i4++;
                }
            }
        }
    }
}
