package xsna;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.ui.RotationLayout;

/* compiled from: IconGenerator.java */
/* loaded from: classes13.dex */
public final class gqv {
    public ViewGroup a;
    public RotationLayout b;
    public TextView c;

    public final void a(Drawable drawable) {
        ViewGroup viewGroup = this.a;
        viewGroup.setBackgroundDrawable(drawable);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        viewGroup.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
