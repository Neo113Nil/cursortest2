package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.controls.view.ErrorView;

/* compiled from: OneVideoErrorViewBinding.java */
/* loaded from: classes8.dex */
public final class pk80 implements xtt0 {

    @NonNull
    public final ErrorView a;

    @NonNull
    public final AppCompatTextView b;

    public pk80(@NonNull ErrorView errorView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.a = errorView;
        this.b = appCompatTextView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
