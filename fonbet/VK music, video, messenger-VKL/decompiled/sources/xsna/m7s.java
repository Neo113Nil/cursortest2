package xsna;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.annotation.NonNull;

/* compiled from: ForegroundDynamicColorSpan.kt */
/* loaded from: classes17.dex */
public final class m7s extends CharacterStyle implements UpdateAppearance {
    public final apo b;

    public m7s(int i) {
        this.b = new apo(i);
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setColor(this.b.a());
    }
}
