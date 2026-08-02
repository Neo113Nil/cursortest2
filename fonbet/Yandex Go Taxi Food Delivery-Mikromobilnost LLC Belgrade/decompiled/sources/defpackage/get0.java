package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import com.yandex.go.pin.api.v2.PinV2Component;
import kotlin.a;

/* loaded from: classes13.dex */
public final class get0 {
    public final i3y a = a.a(new fet0(0));
    public final i3y b = a.a(new fet0(1));
    public final i3y c = a.a(new fet0(2));
    public final i3y d = a.a(new fet0(3));
    public final i3y e = a.a(new fet0(4));

    public static PointF a(Rect rect, PointF pointF, Rect rect2) {
        return new PointF(((rect.width() * pointF.x) - rect2.left) / rect2.width(), (rect.height() - rect2.top) / rect2.height());
    }

    public static Rect b(PinV2Component pinV2Component, int i) {
        View findViewById = pinV2Component.findViewById(i);
        if (findViewById == null) {
            return null;
        }
        Rect rect = new Rect();
        pinV2Component.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        findViewById.getGlobalVisibleRect(rect2, new Point(rect.left, rect.top));
        return rect2;
    }
}
