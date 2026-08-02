package xsna;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import java.util.Arrays;

/* compiled from: VoipVmojiBackgroundDrawable.kt */
/* loaded from: classes7.dex */
public final class p5x0 extends ShapeDrawable {
    public p5x0(int i, float f) {
        float[] fArr = new float[8];
        Arrays.fill(fArr, 0, 8, f);
        setShape(new RoundRectShape(fArr, null, null));
        getPaint().setStyle(Paint.Style.FILL);
        getPaint().setColor(i);
    }
}
