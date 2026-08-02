package xsna;

import android.graphics.Paint;
import android.util.Property;

/* compiled from: AnimExt.kt */
/* loaded from: classes4.dex */
public final class ye2 extends Property<Paint, Float> {
    public final /* synthetic */ wh1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye2(wh1 wh1Var) {
        super(Float.TYPE, "paint");
        this.a = wh1Var;
    }

    @Override // android.util.Property
    public final Float get(Paint paint) {
        return Float.valueOf(paint.getAlpha() / 255.0f);
    }

    @Override // android.util.Property
    public final void set(Paint paint, Float f) {
        float floatValue = f.floatValue() * 255;
        paint.setAlpha((int) floatValue);
        this.a.invoke(Float.valueOf(floatValue));
    }
}
