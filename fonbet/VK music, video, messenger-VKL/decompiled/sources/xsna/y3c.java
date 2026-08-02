package xsna;

import android.app.Activity;

/* compiled from: Effects.kt */
/* loaded from: classes18.dex */
public final class y3c implements kgn {
    public final /* synthetic */ Activity a;

    public y3c(Activity activity) {
        this.a = activity;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.getWindow().getDecorView().setOnApplyWindowInsetsListener(null);
    }
}
