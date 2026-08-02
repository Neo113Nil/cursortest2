package xsna;

import android.content.Context;
import android.view.View;
import kotlin.text.Regex;
import xsna.lrv0;

/* compiled from: StickerAddWordDialog.kt */
/* loaded from: classes6.dex */
public final class c2l0 implements lrv0.a {
    public final Context b;
    public final View c;
    public final k8l0 d;
    public androidx.appcompat.app.d e;

    public c2l0(Context context, View view, k8l0 k8l0Var) {
        this.b = context;
        this.c = view;
        this.d = k8l0Var;
    }

    public static String a(CharSequence charSequence) {
        return new Regex("\\s+").g(drm0.p0(charSequence), " ");
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        androidx.appcompat.app.d dVar = this.e;
        if (dVar != null) {
            dVar.dismiss();
        }
    }
}
