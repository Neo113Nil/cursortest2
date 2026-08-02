package com.yandex.plus.home.common.utils;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/home/common/utils/LinearGradientSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "", "text", "", "startColor", "endColor", "Landroid/graphics/Shader$TileMode;", "tileMode", "<init>", "(Ljava/lang/String;IILandroid/graphics/Shader$TileMode;)V", "Landroid/text/TextPaint;", "tp", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "Landroid/graphics/Shader$TileMode;", "homeless-core-android-extensions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinearGradientSpan extends CharacterStyle implements UpdateAppearance {
    private final int endColor;
    private final int startColor;
    private final String text;
    private final Shader.TileMode tileMode;

    public LinearGradientSpan(String str, int i, int i2, Shader.TileMode tileMode) {
        this.text = str;
        this.startColor = i;
        this.endColor = i2;
        this.tileMode = tileMode;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        if (tp == null) {
            return;
        }
        String str = this.text;
        tp.setShader(new LinearGradient(0.0f, 0.0f, tp.measureText(str, 0, str.length()), 0.0f, this.startColor, this.endColor, this.tileMode));
    }

    public /* synthetic */ LinearGradientSpan(String str, int i, int i2, Shader.TileMode tileMode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? Shader.TileMode.MIRROR : tileMode);
    }
}
