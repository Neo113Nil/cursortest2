package xsna;

import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import xsna.jc80;

/* compiled from: CommunityLiveCoverPagerHolder.kt */
/* loaded from: classes5.dex */
public final class y8h implements jc80.b {
    public final /* synthetic */ w8h a;
    public final /* synthetic */ ViewPager2 b;

    public y8h(w8h w8hVar, ViewPager2 viewPager2) {
        this.a = w8hVar;
        this.b = viewPager2;
    }

    @Override // xsna.jc80.b
    public final void d(int i, int i2) {
        gzs<s3q0> gzsVar = this.a.b;
        if (gzsVar != null) {
            gzsVar.invoke();
        } else {
            this.b.performClick();
        }
    }

    @Override // xsna.jc80.b
    public final void b() {
    }

    @Override // xsna.jc80.b
    public final void c() {
    }

    @Override // xsna.jc80.b
    public final void a(int i) {
    }

    @Override // xsna.jc80.b
    public final void onTouch(View view, MotionEvent motionEvent) {
    }
}
