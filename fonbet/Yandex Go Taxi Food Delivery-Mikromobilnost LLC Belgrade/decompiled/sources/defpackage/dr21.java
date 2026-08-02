package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes14.dex */
public final class dr21 implements zo31 {
    public final FrameLayout a;
    public final qzm b;
    public final nzm c;
    public final win d;

    public dr21(FrameLayout frameLayout, qzm qzmVar, nzm nzmVar, win winVar) {
        this.a = frameLayout;
        this.b = qzmVar;
        this.c = nzmVar;
        this.d = winVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
