package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import defpackage.i3r;
import defpackage.jl40;
import defpackage.jvu0;
import defpackage.ram;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/style/DrawStyleSpan;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lram;", "drawStyle", "<init>", "(Lram;)V", "Landroid/text/TextPaint;", "textPaint", "Lzy11;", "updateDrawState", "(Landroid/text/TextPaint;)V", "Lram;", "getDrawStyle", "()Lram;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DrawStyleSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final ram drawStyle;

    public DrawStyleSpan(ram ramVar) {
        this.drawStyle = ramVar;
    }

    public final ram getDrawStyle() {
        return this.drawStyle;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            ram ramVar = this.drawStyle;
            if (jl40.l(ramVar, i3r.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(ramVar instanceof jvu0)) {
                w511.b();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((jvu0) this.drawStyle).a);
            textPaint.setStrokeMiter(((jvu0) this.drawStyle).b);
            int i = ((jvu0) this.drawStyle).d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ((jvu0) this.drawStyle).c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            ((jvu0) this.drawStyle).getClass();
            textPaint.setPathEffect(null);
        }
    }
}
