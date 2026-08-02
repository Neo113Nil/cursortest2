package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes10.dex */
public final class kw00 implements jt31 {
    public final /* synthetic */ int a;
    public final int b;

    public kw00(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = i;
                return;
            default:
                if (i >= 0) {
                    this.b = i;
                    return;
                } else {
                    ny61.g("Margin must be non-negative");
                    throw null;
                }
        }
    }

    @Override // defpackage.jt31
    public final void c(float f, View view) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                ViewParent parent = view.getParent();
                ViewParent parent2 = parent.getParent();
                if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
                    ny61.r("Expected the page view to be managed by a ViewPager2 instance.");
                    break;
                } else {
                    ViewPager2 viewPager2 = (ViewPager2) parent2;
                    float f2 = i2 * f;
                    if (viewPager2.getOrientation() != 0) {
                        view.setTranslationY(f2);
                        break;
                    } else {
                        if (viewPager2.isRtl()) {
                            f2 = -f2;
                        }
                        view.setTranslationX(f2);
                        break;
                    }
                }
                break;
            default:
                view.setTranslationY(f * (-i2));
                break;
        }
    }
}
