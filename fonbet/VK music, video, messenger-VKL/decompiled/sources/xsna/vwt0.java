package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes6.dex */
public final class vwt0 {
    public static final hpj a(View view) {
        bdn bdnVar = bdn.a;
        hpj a = zvj.a(ie00.a.plus(whn0.a()).plus(new pwt0(view)));
        view.getViewTreeObserver().addOnWindowAttachListener(new qwt0(a, view));
        return a;
    }
}
