package com.ybsdk.feature.card.internal.presentation.carddetails;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import defpackage.i73;
import defpackage.ixn;
import defpackage.nyl0;
import defpackage.oyl0;
import defpackage.rza;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u0002\r1B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010!\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b!\u0010\"JY\u0010)\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/carddetails/SameWidthCharacterSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "", "char", "", "needToMeasureAsWidest", "(C)Z", "Landroid/graphics/Paint;", "paint", "", "string", "Loyl0;", "findWidestCharacterData", "(Landroid/graphics/Paint;Ljava/lang/String;)Loyl0;", "character", "", "characterBoundsWidth", "(Landroid/graphics/Paint;C)I", "boundsWidth", "", "characterAdvance", "(Landroid/graphics/Paint;CI)F", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Lzy11;", "setDefaultHeight", "(Landroid/graphics/Paint;Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", "start", "end", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "widestCharacterData", "Loyl0;", "Landroid/graphics/Rect;", "tempRect", "Landroid/graphics/Rect;", "Companion", "nyl0", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SameWidthCharacterSpan extends ReplacementSpan {
    public static final nyl0 Companion = new nyl0();
    private static final String DIGITS = "1234567890";
    private static final float ONE_SYMBOL_MARGIN_MODIFIER = 0.66f;
    private oyl0 widestCharacterData = new oyl0(0.0f, 0.0f);
    private final Rect tempRect = new Rect();

    private final float characterAdvance(Paint paint, char character, int boundsWidth) {
        return (paint.measureText(String.valueOf(character)) - boundsWidth) / 2.0f;
    }

    private final int characterBoundsWidth(Paint paint, char character) {
        paint.getTextBounds(String.valueOf(character), 0, 1, this.tempRect);
        return this.tempRect.width();
    }

    private final oyl0 findWidestCharacterData(Paint paint, String string) {
        Pair findWidestCharacterData$lambda$0;
        Iterator it = (string.length() == 0 ? ixn.a : new i73(6, string)).iterator();
        if (it.hasNext()) {
            findWidestCharacterData$lambda$0 = findWidestCharacterData$lambda$0(this, paint, ((Character) it.next()).charValue());
            if (it.hasNext()) {
                int intValue = ((Number) findWidestCharacterData$lambda$0.f()).intValue();
                do {
                    Pair findWidestCharacterData$lambda$02 = findWidestCharacterData$lambda$0(this, paint, ((Character) it.next()).charValue());
                    int intValue2 = ((Number) findWidestCharacterData$lambda$02.f()).intValue();
                    if (intValue < intValue2) {
                        findWidestCharacterData$lambda$0 = findWidestCharacterData$lambda$02;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            findWidestCharacterData$lambda$0 = null;
        }
        if (findWidestCharacterData$lambda$0 == null) {
            return null;
        }
        char charValue = ((Character) findWidestCharacterData$lambda$0.getFirst()).charValue();
        int intValue3 = ((Number) findWidestCharacterData$lambda$0.getSecond()).intValue();
        return new oyl0(intValue3, characterAdvance(paint, charValue, intValue3));
    }

    private static final Pair findWidestCharacterData$lambda$0(SameWidthCharacterSpan sameWidthCharacterSpan, Paint paint, char c) {
        return new Pair(Character.valueOf(c), Integer.valueOf(sameWidthCharacterSpan.characterBoundsWidth(paint, c)));
    }

    private final boolean needToMeasureAsWidest(char r1) {
        return !rza.b(r1);
    }

    private final void setDefaultHeight(Paint paint, Paint.FontMetricsInt fm) {
        paint.getFontMetricsInt(fm);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float f;
        if (text == null) {
            return;
        }
        while (start < end) {
            char charAt = text.charAt(start);
            int characterBoundsWidth = characterBoundsWidth(paint, charAt);
            if (needToMeasureAsWidest(charAt)) {
                float f2 = characterBoundsWidth;
                oyl0 oyl0Var = this.widestCharacterData;
                if (f2 <= oyl0Var.a) {
                    float f3 = (oyl0Var.c - f2) / 2.0f;
                    if (charAt == '1') {
                        f3 *= ONE_SYMBOL_MARGIN_MODIFIER;
                    }
                    canvas.drawText(String.valueOf(charAt), (f3 + x) - this.widestCharacterData.b, y, paint);
                    f = this.widestCharacterData.c;
                    x += f;
                    start++;
                }
            }
            float characterAdvance = characterAdvance(paint, charAt, characterBoundsWidth);
            canvas.drawText(String.valueOf(charAt), x + characterAdvance, y, paint);
            f = characterBoundsWidth + (characterAdvance * 2.0f);
            x += f;
            start++;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        float characterAdvance;
        if (text == null) {
            return 0;
        }
        if (fm != null && fm.top == 0) {
            setDefaultHeight(paint, fm);
        }
        oyl0 findWidestCharacterData = findWidestCharacterData(paint, DIGITS);
        if (findWidestCharacterData == null) {
            return 0;
        }
        this.widestCharacterData = findWidestCharacterData;
        CharSequence subSequence = text.subSequence(start, end);
        float f = 0.0f;
        for (int i = 0; i < subSequence.length(); i++) {
            char charAt = subSequence.charAt(i);
            if (needToMeasureAsWidest(charAt)) {
                characterAdvance = this.widestCharacterData.c;
            } else {
                int characterBoundsWidth = characterBoundsWidth(paint, charAt);
                characterAdvance = characterAdvance(paint, charAt, characterBoundsWidth) + characterBoundsWidth;
            }
            f += characterAdvance;
        }
        return (int) f;
    }
}
