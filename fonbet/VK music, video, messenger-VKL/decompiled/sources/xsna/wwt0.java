package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class wwt0 {
    public static final void a(int i, View view) {
        if (i > 0) {
            view.setClipToOutline(true);
            view.setOutlineProvider(new s0w0(i, 6));
        } else {
            view.setClipToOutline(false);
            view.setOutlineProvider(null);
        }
    }
}
