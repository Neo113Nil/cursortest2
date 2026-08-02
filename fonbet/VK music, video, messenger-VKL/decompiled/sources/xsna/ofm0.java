package xsna;

import android.content.Context;

/* compiled from: StoryStatisticsPeekHeightSnapStrategy.kt */
/* loaded from: classes6.dex */
public final class ofm0 extends com.vk.core.ui.bottomsheet.internal.b {
    public final Context a;
    public final float b;

    public ofm0(Context context, float f) {
        this.a = context;
        this.b = f;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        Context context = this.a;
        if (iah0.o(context)) {
            return -1;
        }
        return fnj.a(context);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int a = iah0.a(16) + ((int) (this.b * i2));
        return Math.max(a, a > 0 ? a : 0);
    }
}
