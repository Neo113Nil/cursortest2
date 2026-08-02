package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes13.dex */
public final class lh80 implements zo31 {
    public final GoFrameLayout a;
    public final ViewPager2 b;

    public lh80(GoFrameLayout goFrameLayout, ViewPager2 viewPager2) {
        this.a = goFrameLayout;
        this.b = viewPager2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
