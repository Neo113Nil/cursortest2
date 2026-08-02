package xsna;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.List;
import java.util.Locale;

/* compiled from: VkAuthMiuiWorkaroundEditText.kt */
/* loaded from: classes.dex */
public class jcu0 extends AppCompatEditText {
    public final List<String> b;

    public jcu0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int i2 = gz80.a;
        if ((i2 == 29 || i2 == 30) && (getInputType() == 33 || getInputType() == 209)) {
            if (this.b.contains(Build.BRAND.toLowerCase(Locale.ROOT))) {
                setCursorVisible(false);
            }
        }
        super.onFocusChanged(z, i, rect);
    }

    public jcu0(Context context, AttributeSet attributeSet, int i) {
        super(hnj.a(context), attributeSet, R.attr.editTextStyle);
        this.b = e43.l("redmi", "xiaomi", "poco", "pocophone");
    }
}
