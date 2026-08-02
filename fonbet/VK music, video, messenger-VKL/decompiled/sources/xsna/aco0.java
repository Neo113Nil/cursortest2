package xsna;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import com.vk.dto.stories.model.TextBackgroundInfo;

/* compiled from: TextBackgroundDrawer.kt */
/* loaded from: classes14.dex */
public final class aco0 {
    public static pjo0 a(TextBackgroundInfo textBackgroundInfo) {
        TextBackgroundInfo.Outline outline;
        if (textBackgroundInfo == null || (outline = textBackgroundInfo.a) == TextBackgroundInfo.Outline.NONE || outline != TextBackgroundInfo.Outline.LINE) {
            return null;
        }
        pjo0 pjo0Var = new pjo0();
        pjo0Var.i = textBackgroundInfo.h;
        int i = textBackgroundInfo.i;
        pjo0Var.d = i;
        Paint paint = pjo0Var.c;
        paint.setAlpha(i);
        pjo0Var.b = textBackgroundInfo.g;
        paint.setPathEffect(new CornerPathEffect(pjo0Var.b));
        paint.setColor(l8g.g(textBackgroundInfo.f, pjo0Var.d));
        int i2 = textBackgroundInfo.b;
        int i3 = textBackgroundInfo.c;
        int i4 = textBackgroundInfo.d;
        int i5 = textBackgroundInfo.e;
        pjo0Var.e = i2;
        pjo0Var.f = i3;
        pjo0Var.g = i4;
        pjo0Var.h = i5;
        return pjo0Var;
    }
}
