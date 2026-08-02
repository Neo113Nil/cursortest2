package xsna;

import android.graphics.Paint;
import xsna.y8g;

/* compiled from: PaintExt.kt */
/* loaded from: classes4.dex */
public final class ig90 {
    public static final void a(Paint paint, y8g y8gVar) {
        if (y8gVar instanceof y8g.c) {
            paint.setColor(((y8g.c) y8gVar).a);
        } else {
            if (y8gVar instanceof y8g.b) {
                throw null;
            }
            paint.setColor(0);
            paint.setShader(null);
        }
    }
}
