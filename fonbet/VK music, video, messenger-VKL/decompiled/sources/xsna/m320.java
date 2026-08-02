package xsna;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: MentionContentSnapStrategy.kt */
/* loaded from: classes4.dex */
public final class m320 extends com.vk.core.ui.bottomsheet.internal.b {
    public final ViewGroup a;
    public int b = 0;

    public m320(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return true;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        ViewGroup viewGroup = this.a;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec2);
        return i2 - viewGroup.getMeasuredHeight();
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int measuredHeight = this.a.getMeasuredHeight();
        int i4 = this.b;
        return measuredHeight > i4 ? i4 : measuredHeight;
    }
}
