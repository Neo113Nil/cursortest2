package xsna;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: CyclicAnimationCallback.kt */
/* loaded from: classes2.dex */
public final class cqk extends lf2 {
    public static final cqk b = new cqk();
    public static final Handler c = new Handler(Looper.getMainLooper());

    @Override // xsna.lf2
    public final void a(Drawable drawable) {
        if (drawable instanceof Animatable) {
            c.post(new o4(drawable, 9));
        }
    }
}
