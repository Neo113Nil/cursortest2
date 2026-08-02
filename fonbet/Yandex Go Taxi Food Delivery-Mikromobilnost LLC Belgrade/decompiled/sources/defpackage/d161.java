package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes12.dex */
public final class d161 implements zo31 {
    public final FrameLayout a;
    public final TextView b;

    public d161(FrameLayout frameLayout, TextView textView) {
        this.a = frameLayout;
        this.b = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
