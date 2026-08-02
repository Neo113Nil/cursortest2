package xsna;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: ShaderBrushSpan.android.kt */
/* loaded from: classes11.dex */
public final class o4j0 extends CharacterStyle implements UpdateAppearance {
    public final n4j0 b;
    public final float c;
    public final wh50 d = androidx.compose.runtime.k.b(new mxj0(9205357640488583168L));
    public final f1m e = bbk0.b(new hj60(this, 26));

    public o4j0(n4j0 n4j0Var, float f) {
        this.b = n4j0Var;
        this.c = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        egi.p(textPaint, this.c);
        textPaint.setShader((Shader) this.e.getValue());
    }
}
