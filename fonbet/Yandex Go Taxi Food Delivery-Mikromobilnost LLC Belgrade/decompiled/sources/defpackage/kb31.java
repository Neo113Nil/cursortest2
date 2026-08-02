package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;

/* loaded from: classes6.dex */
public final class kb31 {
    public final Context a;

    public kb31(Context context) {
        this.a = context;
    }

    public final wam a() {
        int i = xng0.controlMinor;
        Context context = this.a;
        int t = qje.t(i, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(qsg0.vertical_header_corner_radius);
        int u = tje.u(32, context);
        int u2 = tje.u(32, context);
        PaintDrawable paintDrawable = new PaintDrawable(t);
        paintDrawable.setCornerRadius(dimensionPixelSize);
        paintDrawable.setIntrinsicWidth(u);
        paintDrawable.setIntrinsicHeight(u2);
        return new wam(paintDrawable, new Rect(0, 0, paintDrawable.getIntrinsicWidth(), paintDrawable.getIntrinsicHeight()));
    }
}
