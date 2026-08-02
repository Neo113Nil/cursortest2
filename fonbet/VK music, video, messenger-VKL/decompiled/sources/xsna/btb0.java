package xsna;

import android.R;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: PollViewExt.kt */
/* loaded from: classes6.dex */
public final class btb0 {
    public static final void a(AppCompatTextView appCompatTextView) {
        TypedValue typedValue = new TypedValue();
        appCompatTextView.getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        appCompatTextView.setForeground(e3m.e(typedValue.resourceId, appCompatTextView.getContext()));
    }
}
