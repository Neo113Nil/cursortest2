package com.ybsdk.core.design.animation.ticker;

import android.graphics.Paint;
import android.text.TextPaint;
import com.ybsdk.core.design.animation.ticker.TickerView;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d {
    public final TextPaint a;
    public final HashMap b;
    public float c;
    public float d;
    public TickerView.ScrollingDirection e;

    public d(TextPaint textPaint) {
        this.a = textPaint;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        this.e = TickerView.ScrollingDirection.ANY;
        hashMap.clear();
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        this.c = f - f2;
        this.d = -f2;
    }

    public final float a(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Character valueOf = Character.valueOf(c);
        HashMap hashMap = this.b;
        Float f = (Float) hashMap.get(valueOf);
        if (f != null) {
            return f.floatValue();
        }
        float measureText = this.a.measureText(String.valueOf(c));
        hashMap.put(Character.valueOf(c), Float.valueOf(measureText));
        return measureText;
    }
}
