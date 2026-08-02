package xsna;

import android.graphics.Paint;
import android.graphics.Path;
import android.text.StaticLayout;
import java.util.List;

/* compiled from: TextStickerMentionDelegate.kt */
/* loaded from: classes15.dex */
public final class jmo0 {
    public final StaticLayout a;
    public final List<yhk0<p0m0>> b;
    public final Paint c;

    public jmo0(StaticLayout staticLayout) {
        this.a = staticLayout;
        nr4.a().getClass();
        o2l.a.getClass();
        if (o2l.b("__dbg_clickable_sticker_border", false)) {
            List<yhk0<p0m0>> g = q7o.g(staticLayout);
            this.b = g;
            if (g != null) {
                Paint paint = new Paint();
                paint.setColor(-16776961);
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(iah0.a(3));
                this.c = paint;
                Paint paint2 = new Paint();
                paint2.setColor(-65536);
                paint2.setStyle(style);
                paint2.setStrokeWidth(iah0.a(2));
                new Path();
            }
        }
    }
}
