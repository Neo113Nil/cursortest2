package defpackage;

import android.view.inputmethod.EditorInfo;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes10.dex */
public abstract class kon {
    public static void a(NestedScrollView nestedScrollView, float f) {
        try {
            nestedScrollView.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static void b(EditorInfo editorInfo, boolean z) {
        editorInfo.setStylusHandwritingEnabled(z);
    }
}
