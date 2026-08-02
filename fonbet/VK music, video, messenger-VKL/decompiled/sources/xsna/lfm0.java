package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.stories.design.view.stats.tabs.StoryStatisticsTab;
import java.util.Iterator;
import java.util.List;
import xsna.aem0;

/* compiled from: StoryStatisticsMviView.kt */
/* loaded from: classes6.dex */
public final class lfm0 extends ViewPager2.g {
    public final /* synthetic */ ym1 d;
    public final /* synthetic */ mfm0 e;

    public lfm0(ym1 ym1Var, mfm0 mfm0Var) {
        this.d = ym1Var;
        this.e = mfm0Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        List list;
        ihm0 b;
        super.onPageSelected(i);
        this.d.invoke(new aem0.f(i));
        StoryStatisticsTab.Companion.getClass();
        list = StoryStatisticsTab.ALL_POSITIONS;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (intValue != i && (b = this.e.b(intValue)) != null) {
                b.jj();
            }
        }
    }
}
