package defpackage;

import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes10.dex */
public final class nds implements q {
    public final /* synthetic */ ies a;
    public final /* synthetic */ yds b;

    public nds(yds ydsVar, ies iesVar) {
        this.b = ydsVar;
        this.a = iesVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        yds ydsVar = this.b;
        if (ydsVar.b.S()) {
            return;
        }
        peyVar.getLifecycle().d(this);
        ies iesVar = this.a;
        if (((FrameLayout) iesVar.a).isAttachedToWindow()) {
            ydsVar.j(iesVar);
        }
    }
}
