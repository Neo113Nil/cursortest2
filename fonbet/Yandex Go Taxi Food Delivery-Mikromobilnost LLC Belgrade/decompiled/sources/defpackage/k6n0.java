package defpackage;

import android.view.View;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes13.dex */
public final class k6n0 implements zo31 {
    public final NestedScrollView a;
    public final NestedScrollView b;

    public k6n0(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2) {
        this.a = nestedScrollView;
        this.b = nestedScrollView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
