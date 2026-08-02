package defpackage;

import android.view.View;

/* loaded from: classes8.dex */
public final class l8p implements ow31 {
    public final void b(View view) {
        view.animate().cancel();
        view.animate().alpha(0.0f).withEndAction(new ce0(view, 11)).start();
    }

    public final void c(sls slsVar, View view) {
        view.setVisibility(0);
        view.animate().cancel();
        view.animate().alpha(1.0f).withEndAction(new h60(26, slsVar)).start();
    }
}
