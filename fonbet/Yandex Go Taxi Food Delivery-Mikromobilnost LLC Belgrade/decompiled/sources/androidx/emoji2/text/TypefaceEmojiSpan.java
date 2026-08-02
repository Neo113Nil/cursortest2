package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import defpackage.ftn;
import defpackage.jp11;
import defpackage.wjm;

/* loaded from: classes10.dex */
public final class TypefaceEmojiSpan extends EmojiSpan {
    private static Paint sDebugPaint;
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(jp11 jp11Var) {
        super(jp11Var);
    }

    private TextPaint applyCharacterSpanStyles(CharSequence charSequence, int i, int i2, Paint paint) {
        if (!(charSequence instanceof Spanned)) {
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
        if (characterStyleArr.length != 0) {
            if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                TextPaint textPaint = this.mWorkingPaint;
                if (textPaint == null) {
                    textPaint = new TextPaint();
                    this.mWorkingPaint = textPaint;
                }
                textPaint.set(paint);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof MetricAffectingSpan)) {
                        characterStyle.updateDrawState(textPaint);
                    }
                }
                return textPaint;
            }
        }
        if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        }
        return null;
    }

    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            TextPaint textPaint = new TextPaint();
            sDebugPaint = textPaint;
            textPaint.setColor(ftn.a().j);
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float f2;
        TextPaint applyCharacterSpanStyles = applyCharacterSpanStyles(charSequence, i, i2, paint);
        if (applyCharacterSpanStyles == null || applyCharacterSpanStyles.bgColor == 0) {
            f2 = f;
        } else {
            f2 = f;
            drawBackground(canvas, applyCharacterSpanStyles, f2, f + getWidth(), i3, i5);
        }
        ftn.a().getClass();
        jp11 typefaceRasterizer = getTypefaceRasterizer();
        float f3 = i4;
        Paint paint2 = applyCharacterSpanStyles != null ? applyCharacterSpanStyles : paint;
        wjm wjmVar = typefaceRasterizer.b;
        Typeface typeface = (Typeface) wjmVar.x;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) wjmVar.c, typefaceRasterizer.a * 2, 2, f2, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    public void drawBackground(Canvas canvas, TextPaint textPaint, float f, float f2, float f3, float f4) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f, f3, f2, f4, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }
}
