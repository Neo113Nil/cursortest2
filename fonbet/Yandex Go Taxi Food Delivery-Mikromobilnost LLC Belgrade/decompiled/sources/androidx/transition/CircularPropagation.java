package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import defpackage.xvz;

/* loaded from: classes10.dex */
public class CircularPropagation extends VisibilityPropagation {
    public final float b = 3.0f;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    @Override // androidx.transition.TransitionPropagation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(ViewGroup viewGroup, Transition transition, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        Rect a;
        int round;
        int i2;
        long j;
        Integer num;
        if (transitionValues == null && transitionValues2 == null) {
            return 0L;
        }
        if (transitionValues2 != null) {
            if (((transitionValues == null || (num = (Integer) transitionValues.a.get("android:visibilityPropagation:visibility")) == null) ? 8 : num.intValue()) != 0) {
                transitionValues = transitionValues2;
                i = 1;
                int c = VisibilityPropagation.c(transitionValues, 0);
                int c2 = VisibilityPropagation.c(transitionValues, 1);
                Transition.EpicenterCallback epicenterCallback = transition.W;
                a = epicenterCallback != null ? null : epicenterCallback.a();
                if (a == null) {
                    i2 = a.centerX();
                    round = a.centerY();
                } else {
                    viewGroup.getLocationOnScreen(new int[2]);
                    int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + r6[0]);
                    round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + r6[1]);
                    i2 = round2;
                }
                float f = i2 - c;
                float f2 = round - c2;
                float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
                float width = viewGroup.getWidth() - 0.0f;
                float height = viewGroup.getHeight() - 0.0f;
                float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
                j = transition.c;
                if (j < 0) {
                    j = 300;
                }
                return xvz.a(j * i, this.b, sqrt2);
            }
        }
        i = -1;
        int c3 = VisibilityPropagation.c(transitionValues, 0);
        int c22 = VisibilityPropagation.c(transitionValues, 1);
        Transition.EpicenterCallback epicenterCallback2 = transition.W;
        if (epicenterCallback2 != null) {
        }
        if (a == null) {
        }
        float f3 = i2 - c3;
        float f22 = round - c22;
        float sqrt3 = (float) Math.sqrt((f22 * f22) + (f3 * f3));
        float width2 = viewGroup.getWidth() - 0.0f;
        float height2 = viewGroup.getHeight() - 0.0f;
        float sqrt22 = sqrt3 / ((float) Math.sqrt((height2 * height2) + (width2 * width2)));
        j = transition.c;
        if (j < 0) {
        }
        return xvz.a(j * i, this.b, sqrt22);
    }
}
