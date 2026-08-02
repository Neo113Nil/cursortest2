package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import defpackage.xvz;

/* loaded from: classes10.dex */
public class SidePropagation extends VisibilityPropagation {
    public final float b = 3.0f;
    public int c = 80;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r19.getLayoutDirection() == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r3 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0093, code lost:
    
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        if (r19.getLayoutDirection() == 1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0076  */
    @Override // androidx.transition.TransitionPropagation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        Integer num;
        TransitionValues transitionValues3 = transitionValues;
        if (transitionValues3 == null && transitionValues2 == null) {
            return 0L;
        }
        Transition.EpicenterCallback epicenterCallback = transition.W;
        Rect a = epicenterCallback == null ? null : epicenterCallback.a();
        if (transitionValues2 != null) {
            if (((transitionValues3 == null || (num = (Integer) transitionValues3.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                transitionValues3 = transitionValues2;
                i = 1;
                int c = VisibilityPropagation.c(transitionValues3, 0);
                int c2 = VisibilityPropagation.c(transitionValues3, 1);
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                int round = Math.round(viewGroup.getTranslationX()) + iArr[0];
                int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
                int width = viewGroup.getWidth() + round;
                int height = viewGroup.getHeight() + round2;
                if (a == null) {
                    i2 = a.centerX();
                    i3 = a.centerY();
                } else {
                    i2 = (round + width) / 2;
                    i3 = (round2 + height) / 2;
                }
                i4 = this.c;
                if (i4 == 8388611) {
                    if (i4 == 8388613) {
                    }
                }
                float abs = i4 == 3 ? i4 != 5 ? i4 != 48 ? i4 != 80 ? 0 : Math.abs(i2 - c) + (c2 - round2) : Math.abs(i2 - c) + (height - c2) : Math.abs(i3 - c2) + (c - round) : Math.abs(i3 - c2) + (width - c);
                int i5 = this.c;
                float width2 = abs / ((i5 != 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                j = transition.c;
                if (j < 0) {
                    j = 300;
                }
                return xvz.a(j * i, this.b, width2);
            }
        }
        i = -1;
        int c3 = VisibilityPropagation.c(transitionValues3, 0);
        int c22 = VisibilityPropagation.c(transitionValues3, 1);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        int round3 = Math.round(viewGroup.getTranslationX()) + iArr2[0];
        int round22 = Math.round(viewGroup.getTranslationY()) + iArr2[1];
        int width3 = viewGroup.getWidth() + round3;
        int height2 = viewGroup.getHeight() + round22;
        if (a == null) {
        }
        i4 = this.c;
        if (i4 == 8388611) {
        }
        float abs2 = i4 == 3 ? i4 != 5 ? i4 != 48 ? i4 != 80 ? 0 : Math.abs(i2 - c3) + (c22 - round22) : Math.abs(i2 - c3) + (height2 - c22) : Math.abs(i3 - c22) + (c3 - round3) : Math.abs(i3 - c22) + (width3 - c3);
        int i52 = this.c;
        float width22 = abs2 / ((i52 != 3 || i52 == 5 || i52 == 8388611 || i52 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        j = transition.c;
        if (j < 0) {
        }
        return xvz.a(j * i, this.b, width22);
    }
}
