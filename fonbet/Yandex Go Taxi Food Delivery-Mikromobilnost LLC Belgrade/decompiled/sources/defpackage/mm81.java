package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes7.dex */
public final class mm81 {
    public static gj81 a(View view) {
        int i;
        RectF rectF = null;
        if (vs71.a(view)) {
            i = sj71.b(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            if (rect != null) {
                float b = m810.b(rect.left / context.getResources().getDisplayMetrics().density);
                float b2 = m810.b(rect.top / context.getResources().getDisplayMetrics().density);
                float b3 = m810.b(rect.right / context.getResources().getDisplayMetrics().density);
                float b4 = m810.b(rect.bottom / context.getResources().getDisplayMetrics().density);
                float f = b4 - b2;
                if (b3 - b > 0.0f && f > 0.0f) {
                    rectF = new RectF(b, b2, b3, b4);
                }
            }
        } else {
            i = 0;
        }
        return new gj81(rectF, i);
    }
}
