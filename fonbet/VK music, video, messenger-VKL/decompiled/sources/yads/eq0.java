package yads;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class eq0 implements ge1 {
    public final int b;
    public final RectF c;

    public eq0(int i, RectF rectF) {
        this.b = i;
        this.c = rectF;
    }

    @Override // yads.ge1
    public final String a() {
        Integer valueOf = Integer.valueOf(this.b);
        RectF rectF = this.c;
        return String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{valueOf, rectF != null ? String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4)) : null}, 2));
    }
}
