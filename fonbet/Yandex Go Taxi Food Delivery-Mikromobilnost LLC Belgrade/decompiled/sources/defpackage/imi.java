package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes12.dex */
public final class imi implements zo31 {
    public final ViewGroup a;
    public final FrameLayout b;

    public imi(ViewGroup viewGroup, FrameLayout frameLayout) {
        this.a = viewGroup;
        this.b = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
