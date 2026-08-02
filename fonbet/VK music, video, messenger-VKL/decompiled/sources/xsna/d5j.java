package xsna;

import android.view.View;

/* compiled from: ContentSnapStrategy.kt */
/* loaded from: classes17.dex */
public final class d5j extends com.vk.core.ui.bottomsheet.internal.b {
    public final View a;

    public d5j(View view) {
        this.a = view;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        View view = this.a;
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight();
        }
        return i2 - measuredHeight;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        return 0;
    }
}
