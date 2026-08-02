package xsna;

import android.view.View;

/* compiled from: MyTargetSurveySnapStrategy.kt */
/* loaded from: classes3.dex */
public final class ft50 extends com.vk.core.ui.bottomsheet.internal.b {
    public static final int c = iah0.a(1);
    public final View a;
    public final int b = -1;

    public ft50(View view) {
        this.a = view;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean a() {
        return false;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final boolean b() {
        return false;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int c(int i, int i2, int i3) {
        View view = this.a;
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0) {
            view.measure(0, 0);
            measuredHeight = view.getMeasuredHeight();
        }
        int i4 = c;
        if (measuredHeight < i4) {
            measuredHeight = i4;
        } else if (measuredHeight > i2) {
            measuredHeight = i2;
        }
        int i5 = i2 - measuredHeight;
        if (i5 < 0) {
            return 0;
        }
        return i5;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.b
    public final int d(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 >= 0) {
            return i4;
        }
        if (i2 - i > i2) {
            return i2;
        }
        return 0;
    }
}
