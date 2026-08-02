package com.yandex.plus.home.common.utils;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001aR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/plus/home/common/utils/RadialGradientSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "", "text", "", "colors", "", "positions", "", "centerX", "centerY", "radiusX", "radiusY", "Landroid/graphics/Shader$TileMode;", "tileMode", "<init>", "(Ljava/lang/String;[I[FFFFFLandroid/graphics/Shader$TileMode;)V", "Landroid/text/TextPaint;", "tp", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Ljava/lang/String;", "[I", "[F", "F", "Landroid/graphics/Shader$TileMode;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RadialGradientSpan extends CharacterStyle implements UpdateAppearance {
    private final float centerX;
    private final float centerY;
    private final int[] colors;
    private final float[] positions;
    private final float radiusX;
    private final float radiusY;
    private final String text;
    private final Shader.TileMode tileMode;

    public /* synthetic */ RadialGradientSpan(String str, int[] iArr, float[] fArr, float f, float f2, float f3, float f4, Shader.TileMode tileMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, iArr, fArr, f, f2, f3, f4, (i & 128) != 0 ? Shader.TileMode.MIRROR : tileMode);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        if (tp == null) {
            return;
        }
        String str = this.text;
        float measureText = tp.measureText(str, 0, str.length());
        float textSize = tp.getTextSize();
        float f = measureText * this.centerX;
        float f2 = textSize * this.centerY;
        float f3 = measureText * this.radiusX;
        float f4 = textSize * this.radiusY;
        Matrix matrix = new Matrix();
        matrix.setScale(f3 / f4, 1.0f);
        RadialGradient radialGradient = new RadialGradient(f, f2, f4, this.colors, this.positions, this.tileMode);
        radialGradient.setLocalMatrix(matrix);
        tp.setShader(radialGradient);
    }

    public RadialGradientSpan(String str, int[] iArr, float[] fArr, float f, float f2, float f3, float f4, Shader.TileMode tileMode) {
        this.text = str;
        this.colors = iArr;
        this.positions = fArr;
        this.centerX = f;
        this.centerY = f2;
        this.radiusX = f3;
        this.radiusY = f4;
        this.tileMode = tileMode;
    }
}
