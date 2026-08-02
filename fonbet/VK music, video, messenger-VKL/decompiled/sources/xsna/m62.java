package xsna;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes11.dex */
public final class m62 {
    public static final m62 a = new m62();

    public final void a(View view, ulb0 ulb0Var) {
        PointerIcon systemIcon;
        Context context = view.getContext();
        if (ulb0Var instanceof lb2) {
            ((lb2) ulb0Var).getClass();
            systemIcon = null;
        } else {
            systemIcon = ulb0Var instanceof mb2 ? PointerIcon.getSystemIcon(context, ((mb2) ulb0Var).b) : PointerIcon.getSystemIcon(context, 1000);
        }
        if (epx.f(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
