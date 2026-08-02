package one.video.controls.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.emq;

/* compiled from: OptimizedTimeView.kt */
/* loaded from: classes8.dex */
public class OptimizedTimeView extends AppCompatTextView {
    public int b;

    public OptimizedTimeView(Context context) {
        this(context, null, 6, 0);
    }

    public final void b(int i) {
        if (this.b != i) {
            setText(emq.a(i));
            this.b = i;
        }
    }

    public OptimizedTimeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ OptimizedTimeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }

    public OptimizedTimeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setText((String) emq.a.getValue());
    }
}
