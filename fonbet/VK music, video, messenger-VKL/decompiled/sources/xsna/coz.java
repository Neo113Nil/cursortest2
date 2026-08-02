package xsna;

import android.view.View;

/* compiled from: LivesHelper.kt */
/* loaded from: classes16.dex */
public final class coz {
    public static void a(zd9 zd9Var, View view) {
        if (zd9Var == null || view == null) {
            return;
        }
        view.setLayoutParams(zd9Var.getLayoutParams());
        view.setOutlineProvider(zd9Var.getOutlineProvider());
        view.setClipToOutline(true);
        view.setTranslationY(zd9Var.getTranslationY());
        view.setTranslationX(zd9Var.getTranslationX());
    }
}
