package defpackage;

import com.yandex.alicekit.core.widget.YandexCoreIndicatorTabLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class nl51 implements ct31 {
    public final WeakReference a;
    public int b;
    public int c;

    public nl51(YandexCoreIndicatorTabLayout yandexCoreIndicatorTabLayout) {
        this.a = new WeakReference(yandexCoreIndicatorTabLayout);
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        this.b = this.c;
        this.c = i;
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        YandexCoreIndicatorTabLayout yandexCoreIndicatorTabLayout = (YandexCoreIndicatorTabLayout) this.a.get();
        if (yandexCoreIndicatorTabLayout != null) {
            if (this.c != 2 || this.b == 1) {
                yandexCoreIndicatorTabLayout.setScrollPosition(i, f, true, true);
            }
        }
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        YandexCoreIndicatorTabLayout yandexCoreIndicatorTabLayout = (YandexCoreIndicatorTabLayout) this.a.get();
        if (yandexCoreIndicatorTabLayout == null || yandexCoreIndicatorTabLayout.getSelectedTabPosition() == i) {
            return;
        }
        int i2 = this.c;
        yandexCoreIndicatorTabLayout.selectTab(yandexCoreIndicatorTabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
