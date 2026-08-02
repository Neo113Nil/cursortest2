package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;

/* compiled from: LifecycleFrameLayout.kt */
/* loaded from: classes4.dex */
public class u4z extends FrameLayout implements f5z {
    public final androidx.lifecycle.m b;

    public u4z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // xsna.f5z
    public Lifecycle getLifecycle() {
        return this.b;
    }

    public u4z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.b = new androidx.lifecycle.m(this, true);
    }
}
