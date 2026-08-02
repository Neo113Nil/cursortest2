package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

/* loaded from: classes6.dex */
public interface dbx0 {
    Drawable a();

    StateListDrawable b();

    Drawable c();

    default Drawable d() {
        return null;
    }

    Rect e();
}
