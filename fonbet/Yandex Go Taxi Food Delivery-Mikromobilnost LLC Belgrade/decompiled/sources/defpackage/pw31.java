package defpackage;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public class pw31 {
    public final Rect a = new Rect();

    public final int a(View view) {
        if (!view.isShown()) {
            return 0;
        }
        Rect rect = this.a;
        if (!view.getGlobalVisibleRect(rect)) {
            return 0;
        }
        return ((rect.height() * rect.width()) * 100) / (view.getHeight() * view.getWidth());
    }
}
