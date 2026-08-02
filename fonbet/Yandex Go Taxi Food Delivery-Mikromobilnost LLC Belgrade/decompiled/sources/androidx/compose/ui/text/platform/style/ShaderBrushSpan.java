package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.f;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.b7p0;
import defpackage.cjs0;
import defpackage.m3u0;
import defpackage.oz40;
import defpackage.xva1;
import defpackage.zfr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lzfr0;", "shaderBrush", "", CaretView.ALPHA_PROPERTY, "<init>", "(Lzfr0;F)V", "Landroid/text/TextPaint;", "textPaint", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lzfr0;", "getShaderBrush", "()Lzfr0;", "F", "getAlpha", "()F", "Lcjs0;", "<set-?>", "size$delegate", "Loz40;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "size", "Lm3u0;", "Landroid/graphics/Shader;", "shaderState", "Lm3u0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final zfr0 shaderBrush;

    /* renamed from: size$delegate, reason: from kotlin metadata */
    private final oz40 size = f.j(new cjs0(9205357640488583168L));
    private final m3u0 shaderState = f.d(new b7p0(20, this));

    public ShaderBrushSpan(zfr0 zfr0Var, float f) {
        this.shaderBrush = zfr0Var;
        this.alpha = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader shaderState$lambda$0(ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m94getSizeNHjbRc() == 9205357640488583168L || cjs0.e(shaderBrushSpan.m94getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.b(shaderBrushSpan.m94getSizeNHjbRc());
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final zfr0 getShaderBrush() {
        return this.shaderBrush;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m94getSizeNHjbRc() {
        return ((cjs0) this.size.getValue()).a;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m95setSizeuvyYCjk(long j) {
        this.size.setValue(new cjs0(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        xva1.a(textPaint, this.alpha);
        textPaint.setShader((Shader) this.shaderState.getValue());
    }
}
