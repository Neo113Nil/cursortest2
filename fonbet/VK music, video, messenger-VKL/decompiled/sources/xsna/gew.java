package xsna;

import android.os.Looper;

/* compiled from: ImUnstableConnectionModalHelper.kt */
/* loaded from: classes2.dex */
public final class gew extends m180 {
    @Override // xsna.m180
    public final void handleOnBackPressed() {
        hew.b.getClass();
        few fewVar = new few(0);
        if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            fewVar.run();
        } else {
            hew.g.post(fewVar);
        }
        setEnabled(false);
    }
}
