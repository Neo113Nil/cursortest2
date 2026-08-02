package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes14.dex */
public final class d361 implements zo31 {
    public final TextView a;
    public final TextView b;

    public d361(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
