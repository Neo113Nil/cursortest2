package xsna;

import android.app.Dialog;
import android.graphics.Rect;

/* compiled from: ViewUtils.kt */
/* loaded from: classes17.dex */
public final class z1u0 {
    public static final /* synthetic */ int a = 0;

    /* compiled from: ViewUtils.kt */
    public static final class a extends ThreadLocal<Rect> {
        @Override // java.lang.ThreadLocal
        public final Rect initialValue() {
            return new Rect();
        }
    }

    static {
        new a();
    }

    public static void a(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        pro0.e(new x52(dialog, 16));
    }
}
