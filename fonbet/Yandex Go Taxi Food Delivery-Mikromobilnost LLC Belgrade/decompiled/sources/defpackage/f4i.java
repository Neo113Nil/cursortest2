package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class f4i implements zo31 {
    public final ViewGroup a;
    public final FrameLayout b;

    public f4i(ViewGroup viewGroup, FrameLayout frameLayout) {
        this.a = viewGroup;
        this.b = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
