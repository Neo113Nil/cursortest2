package defpackage;

import android.view.View;
import android.widget.ProgressBar;

/* loaded from: classes5.dex */
public final class mgn implements zo31 {
    public final ProgressBar a;
    public final ProgressBar b;

    public mgn(ProgressBar progressBar, ProgressBar progressBar2) {
        this.a = progressBar;
        this.b = progressBar2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
