package xsna;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: OneVideoDialogQualityTopItemViewBinding.java */
/* loaded from: classes8.dex */
public final class nk80 implements xtt0 {

    @NonNull
    public final LinearLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final TextView c;

    public nk80(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
