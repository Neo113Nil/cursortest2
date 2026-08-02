package androidx.compose.ui.platform;

import android.view.View;
import defpackage.a82;

/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(a82.j(AndroidComposeViewTranslationCallback.INSTANCE));
    }
}
