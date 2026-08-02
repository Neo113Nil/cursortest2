package xsna;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: CharSequenceExt.kt */
/* loaded from: classes17.dex */
public final class ylb {
    public static final StaticLayout a(int i, TextPaint textPaint, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).build();
    }
}
