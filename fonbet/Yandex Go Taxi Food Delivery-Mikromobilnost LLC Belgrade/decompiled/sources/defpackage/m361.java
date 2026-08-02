package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class m361 implements zo31 {
    public final FrameLayout a;
    public final TextView b;
    public final FrameLayout c;
    public final TextView d;

    public m361(FrameLayout frameLayout, TextView textView, FrameLayout frameLayout2, TextView textView2) {
        this.a = frameLayout;
        this.b = textView;
        this.c = frameLayout2;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
