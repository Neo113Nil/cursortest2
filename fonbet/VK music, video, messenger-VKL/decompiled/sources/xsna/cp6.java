package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: BaseTabView.kt */
/* loaded from: classes6.dex */
public abstract class cp6 extends FrameLayout {
    public cp6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public abstract void setTabSelected(boolean z);

    public abstract void setText(CharSequence charSequence);
}
