package defpackage;

import android.widget.OverScroller;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class mn50 implements jjj {
    public final /* synthetic */ NestedScrollView a;

    public mn50(NestedScrollView nestedScrollView) {
        this.a = nestedScrollView;
    }

    @Override // defpackage.jjj
    public final float a() {
        return -this.a.getVerticalScrollFactorCompat();
    }

    @Override // defpackage.jjj
    public final boolean b(float f) {
        if (f == 0.0f) {
            return false;
        }
        c();
        this.a.fling((int) f);
        return true;
    }

    @Override // defpackage.jjj
    public final void c() {
        OverScroller overScroller;
        overScroller = this.a.mScroller;
        overScroller.abortAnimation();
    }
}
