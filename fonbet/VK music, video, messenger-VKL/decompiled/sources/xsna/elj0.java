package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;

/* compiled from: SidePropagation.java */
/* loaded from: classes12.dex */
public final class elj0 extends z4u0 {
    public final float b = 3.0f;
    public int c = 80;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r20.getLayoutDirection() == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        r15 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008d, code lost:
    
        r15 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r20.getLayoutDirection() == 1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    @Override // xsna.bnp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(ViewGroup viewGroup, vlp0 vlp0Var, gnp0 gnp0Var, gnp0 gnp0Var2) {
        int i;
        int i2;
        int i3;
        int i4;
        long duration;
        Integer num;
        gnp0 gnp0Var3 = gnp0Var;
        if (gnp0Var3 == null && gnp0Var2 == null) {
            return 0L;
        }
        Rect epicenter = vlp0Var.getEpicenter();
        if (gnp0Var2 != null) {
            if (((gnp0Var3 == null || (num = (Integer) gnp0Var3.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                gnp0Var3 = gnp0Var2;
                i = 1;
                int c = z4u0.c(gnp0Var3, 0);
                int c2 = z4u0.c(gnp0Var3, 1);
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                int round = Math.round(viewGroup.getTranslationX()) + iArr[0];
                int round2 = Math.round(viewGroup.getTranslationY()) + iArr[1];
                int width = viewGroup.getWidth() + round;
                int height = viewGroup.getHeight() + round2;
                if (epicenter == null) {
                    i2 = epicenter.centerX();
                    i3 = epicenter.centerY();
                } else {
                    i2 = (round + width) / 2;
                    i3 = (round2 + height) / 2;
                }
                i4 = this.c;
                if (i4 == 8388611) {
                    if (i4 == 8388613) {
                    }
                }
                float abs = i4 == 3 ? i4 != 5 ? i4 != 48 ? i4 != 80 ? 0 : (c2 - round2) + Math.abs(i2 - c) : Math.abs(i2 - c) + (height - c2) : Math.abs(i3 - c2) + (c - round) : Math.abs(i3 - c2) + (width - c);
                int i5 = this.c;
                float width2 = abs / ((i5 != 3 || i5 == 5 || i5 == 8388611 || i5 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
                duration = vlp0Var.getDuration();
                if (duration < 0) {
                    duration = 300;
                }
                return Math.round(((duration * i) / this.b) * width2);
            }
        }
        i = -1;
        int c3 = z4u0.c(gnp0Var3, 0);
        int c22 = z4u0.c(gnp0Var3, 1);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        int round3 = Math.round(viewGroup.getTranslationX()) + iArr2[0];
        int round22 = Math.round(viewGroup.getTranslationY()) + iArr2[1];
        int width3 = viewGroup.getWidth() + round3;
        int height2 = viewGroup.getHeight() + round22;
        if (epicenter == null) {
        }
        i4 = this.c;
        if (i4 == 8388611) {
        }
        float abs2 = i4 == 3 ? i4 != 5 ? i4 != 48 ? i4 != 80 ? 0 : (c22 - round22) + Math.abs(i2 - c3) : Math.abs(i2 - c3) + (height2 - c22) : Math.abs(i3 - c22) + (c3 - round3) : Math.abs(i3 - c22) + (width3 - c3);
        int i52 = this.c;
        float width22 = abs2 / ((i52 != 3 || i52 == 5 || i52 == 8388611 || i52 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight());
        duration = vlp0Var.getDuration();
        if (duration < 0) {
        }
        return Math.round(((duration * i) / this.b) * width22);
    }
}
