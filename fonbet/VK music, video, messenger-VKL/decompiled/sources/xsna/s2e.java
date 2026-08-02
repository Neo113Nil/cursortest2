package xsna;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class s2e implements View.OnLayoutChangeListener {
    public final /* synthetic */ q2e b;
    public final /* synthetic */ zlq c;
    public final /* synthetic */ FrameLayout d;

    public s2e(q2e q2eVar, zlq zlqVar, FrameLayout frameLayout) {
        this.b = q2eVar;
        this.c = zlqVar;
        this.d = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        q2e.a(this.b, this.c, this.d);
    }
}
