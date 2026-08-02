package com.yandex.div.core.util.text;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.UnderlineSpan;
import com.yandex.div2.DivTextAlignmentVertical;
import defpackage.agl;
import defpackage.hgl;
import io.appmetrica.analytics.impl.C0553n3;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.XAdES.XAdESParameters;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001Bq\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b0\u0010/¨\u00061"}, d2 = {"Lcom/yandex/div/core/util/text/DivBackgroundSpan;", "Landroid/text/style/UnderlineSpan;", "Lhgl;", "border", "Lagl;", C0553n3.g, "", "baselineOffset", "Lcom/yandex/div2/DivTextAlignmentVertical;", "alignmentVertical", "lineHeight", "fontSize", "topOffset", "Landroid/graphics/Typeface;", "typeface", "", "fontFeatureSettings", "fontVariationSettings", "<init>", "(Lhgl;Lagl;ILcom/yandex/div2/DivTextAlignmentVertical;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Typeface;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/text/TextPaint;", XAdESParameters.XML_SIGNATURE_PREFIX, "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lhgl;", "getBorder", "()Lhgl;", "Lagl;", "getBackground", "()Lagl;", CA20Status.STATUS_USER_I, "getBaselineOffset", "()I", "Lcom/yandex/div2/DivTextAlignmentVertical;", "getAlignmentVertical", "()Lcom/yandex/div2/DivTextAlignmentVertical;", "Ljava/lang/Integer;", "getLineHeight", "()Ljava/lang/Integer;", "getFontSize", "getTopOffset", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontVariationSettings", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DivBackgroundSpan extends UnderlineSpan {
    private final DivTextAlignmentVertical alignmentVertical;
    private final agl background;
    private final int baselineOffset;
    private final hgl border;
    private final String fontFeatureSettings;
    private final Integer fontSize;
    private final String fontVariationSettings;
    private final Integer lineHeight;
    private final Integer topOffset;
    private final Typeface typeface;

    public DivBackgroundSpan(hgl hglVar, agl aglVar, int i, DivTextAlignmentVertical divTextAlignmentVertical, Integer num, Integer num2, Integer num3, Typeface typeface, String str, String str2) {
        this.border = hglVar;
        this.background = aglVar;
        this.baselineOffset = i;
        this.alignmentVertical = divTextAlignmentVertical;
        this.lineHeight = num;
        this.fontSize = num2;
        this.topOffset = num3;
        this.typeface = typeface;
        this.fontFeatureSettings = str;
        this.fontVariationSettings = str2;
    }

    public final DivTextAlignmentVertical getAlignmentVertical() {
        return this.alignmentVertical;
    }

    public final agl getBackground() {
        return this.background;
    }

    public final int getBaselineOffset() {
        return this.baselineOffset;
    }

    public final hgl getBorder() {
        return this.border;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final String getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    public final Integer getTopOffset() {
        return this.topOffset;
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    @Override // android.text.style.UnderlineSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        ds.setUnderlineText(false);
    }
}
