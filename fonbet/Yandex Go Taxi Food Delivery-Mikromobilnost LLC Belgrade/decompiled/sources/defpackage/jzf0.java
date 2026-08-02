package defpackage;

import android.graphics.PointF;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes6.dex */
public final class jzf0 {
    public static PointF a(ScreenRect screenRect) {
        float x = screenRect.getTopLeft().getX();
        float y = screenRect.getTopLeft().getY();
        return new PointF(((screenRect.getBottomRight().getX() - x) / 2.0f) + x, ((screenRect.getBottomRight().getY() - y) / 2.0f) + y);
    }
}
