package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.f;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.a6t0;
import defpackage.bgr0;
import defpackage.cjs0;
import defpackage.eb2;
import defpackage.i3r;
import defpackage.jl40;
import defpackage.jvu0;
import defpackage.ka90;
import defpackage.ldc;
import defpackage.llb1;
import defpackage.m3u0;
import defpackage.ml6;
import defpackage.ram;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.uc2;
import defpackage.w511;
import defpackage.xva1;
import defpackage.zfr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001f\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0010\u0010+\u0012\u0004\b/\u0010\n\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\u0012R\u0018\u00100\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R*\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u00102\u0012\u0004\b7\u0010\n\u001a\u0004\b3\u00104\"\u0004\b5\u00106R2\u0010;\u001a\u0012\u0012\f\u0012\n\u0018\u000109j\u0004\u0018\u0001`:\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010\n\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010HR\u0014\u0010K\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR$\u0010Q\u001a\u00020(2\u0006\u0010L\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006R"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Lzy11;", "clearShader", "()V", "Lrly0;", "textDecoration", "setTextDecoration", "(Lrly0;)V", "Lbgr0;", "shadow", "setShadow", "(Lbgr0;)V", "Lldc;", "color", "setColor-8_81llA", "(J)V", "setColor", "Lml6;", "brush", "Lcjs0;", "size", CaretView.ALPHA_PROPERTY, "setBrush-12SF9DM", "(Lml6;JF)V", "setBrush", "Lram;", "drawStyle", "setDrawStyle", "(Lram;)V", "Lka90;", "backingComposePaint", "Lka90;", "Lrly0;", "Luh6;", "backingBlendMode", CA20Status.STATUS_USER_I, "Lbgr0;", "getShadow$ui_text", "()Lbgr0;", "setShadow$ui_text", "getShadow$ui_text$annotations", "lastColor", "Lldc;", "Lml6;", "getBrush$ui_text", "()Lml6;", "setBrush$ui_text", "(Lml6;)V", "getBrush$ui_text$annotations", "Lm3u0;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shaderState", "Lm3u0;", "getShaderState$ui_text", "()Lm3u0;", "setShaderState$ui_text", "(Lm3u0;)V", "brushSize", "Lcjs0;", "getBrushSize-VsRJwc0$ui_text", "()Lcjs0;", "setBrushSize-iaC8Vc4$ui_text", "(Lcjs0;)V", "getBrushSize-VsRJwc0$ui_text$annotations", "Lram;", "getComposePaint", "()Lka90;", "composePaint", "value", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private ka90 backingComposePaint;
    private ml6 brush;
    private cjs0 brushSize;
    private ram drawStyle;
    private ldc lastColor;
    private m3u0 shaderState;
    private bgr0 shadow;
    private rly0 textDecoration;

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = rly0.b;
        this.backingBlendMode = 3;
        this.shadow = bgr0.d;
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    public static /* synthetic */ void getBrush$ui_text$annotations() {
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text$annotations, reason: not valid java name */
    public static /* synthetic */ void m86getBrushSizeVsRJwc0$ui_text$annotations() {
    }

    private final ka90 getComposePaint() {
        ka90 ka90Var = this.backingComposePaint;
        if (ka90Var != null) {
            return ka90Var;
        }
        eb2 eb2Var = new eb2(this);
        this.backingComposePaint = eb2Var;
        return eb2Var;
    }

    public static /* synthetic */ void getShadow$ui_text$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m87setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, ml6 ml6Var, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m91setBrush12SF9DM(ml6Var, j, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader setBrush_12SF9DM$lambda$0(ml6 ml6Var, long j) {
        return ((zfr0) ml6Var).b(j);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    /* renamed from: getBrush$ui_text, reason: from getter */
    public final ml6 getBrush() {
        return this.brush;
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text, reason: not valid java name and from getter */
    public final cjs0 getBrushSize() {
        return this.brushSize;
    }

    /* renamed from: getShaderState$ui_text, reason: from getter */
    public final m3u0 getShaderState() {
        return this.shaderState;
    }

    /* renamed from: getShadow$ui_text, reason: from getter */
    public final bgr0 getShadow() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m90setBlendModes9anfk8(int i) {
        if (i == this.backingBlendMode) {
            return;
        }
        ((eb2) getComposePaint()).e(i);
        this.backingBlendMode = i;
    }

    public final void setBrush$ui_text(ml6 ml6Var) {
        this.brush = ml6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r0 == null ? false : defpackage.cjs0.a(r0.a, r6)) == false) goto L18;
     */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m91setBrush12SF9DM(ml6 brush, long size, float alpha) {
        if (brush == null) {
            clearShader();
            return;
        }
        if (brush instanceof a6t0) {
            m93setColor8_81llA(llb1.d(alpha, ((a6t0) brush).a));
            return;
        }
        if (!(brush instanceof zfr0)) {
            w511.b();
            return;
        }
        int i = 0;
        if (jl40.l(this.brush, brush)) {
            cjs0 cjs0Var = this.brushSize;
        }
        if (size != 9205357640488583168L) {
            this.brush = brush;
            this.brushSize = new cjs0(size);
            this.shaderState = f.d(new uc2(brush, size, i));
        }
        ka90 composePaint = getComposePaint();
        m3u0 m3u0Var = this.shaderState;
        ((eb2) composePaint).j(m3u0Var != null ? (Shader) m3u0Var.getValue() : null);
        this.lastColor = null;
        xva1.a(this, alpha);
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text, reason: not valid java name */
    public final void m92setBrushSizeiaC8Vc4$ui_text(cjs0 cjs0Var) {
        this.brushSize = cjs0Var;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m93setColor8_81llA(long color) {
        ldc ldcVar = this.lastColor;
        if ((ldcVar == null ? false : ldc.c(ldcVar.a, color)) || color == 16) {
            return;
        }
        this.lastColor = new ldc(color);
        setColor(rzo.X(color));
        clearShader();
    }

    public final void setDrawStyle(ram drawStyle) {
        if (drawStyle == null || jl40.l(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (drawStyle.equals(i3r.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof jvu0)) {
            w511.b();
            return;
        }
        ((eb2) getComposePaint()).n(1);
        jvu0 jvu0Var = (jvu0) drawStyle;
        ((eb2) getComposePaint()).m(jvu0Var.a);
        ka90 composePaint = getComposePaint();
        ((eb2) composePaint).a.setStrokeMiter(jvu0Var.b);
        ((eb2) getComposePaint()).l(jvu0Var.d);
        ((eb2) getComposePaint()).k(jvu0Var.c);
        ((eb2) getComposePaint()).i(null);
    }

    public final void setShaderState$ui_text(m3u0 m3u0Var) {
        this.shaderState = m3u0Var;
    }

    public final void setShadow(bgr0 shadow) {
        if (shadow == null || jl40.l(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (shadow.equals(bgr0.d)) {
            clearShadowLayer();
            return;
        }
        bgr0 bgr0Var = this.shadow;
        float f = bgr0Var.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (bgr0Var.b >> 32)), Float.intBitsToFloat((int) (this.shadow.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), rzo.X(this.shadow.a));
    }

    public final void setShadow$ui_text(bgr0 bgr0Var) {
        this.shadow = bgr0Var;
    }

    public final void setTextDecoration(rly0 textDecoration) {
        if (textDecoration == null || jl40.l(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        int i = textDecoration.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.textDecoration.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
