package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.components.tabs.VkSecondaryTabLayout;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vkontakte.android.R;
import java.util.WeakHashMap;

/* compiled from: StoryStatisticsMviView.kt */
/* loaded from: classes6.dex */
public final class mfm0 implements gm50 {
    public final Context b;
    public final hem0 c;
    public final hem0 d;
    public final pfm0 e;
    public final VkSecondaryTabLayout f;
    public final ViewPager2 g;
    public final com.vk.stories.design.view.stats.tabs.a h;
    public final com.google.android.material.tabs.c i;
    public StoryEntry j;

    public mfm0(View view, Context context, hem0 hem0Var, hem0 hem0Var2, pfm0 pfm0Var, StoryEntry storyEntry, StoryOwner storyOwner, int i, ym1 ym1Var) {
        this.b = context;
        this.c = hem0Var;
        this.d = hem0Var2;
        this.e = pfm0Var;
        VkSecondaryTabLayout vkSecondaryTabLayout = (VkSecondaryTabLayout) LayoutInflater.from(context).inflate(R.layout.story_statistics_tabs, (ViewGroup) null, false);
        this.f = vkSecondaryTabLayout;
        ViewPager2 viewPager2 = (ViewPager2) view.findViewById(R.id.statistics_viewpager);
        this.g = viewPager2;
        lfm0 lfm0Var = new lfm0(ym1Var, this);
        this.j = storyEntry;
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
        }
        if (!iah0.o(context)) {
            f4m.v(fnj.a(context), viewPager2);
        }
        com.vk.stories.design.view.stats.tabs.a aVar = new com.vk.stories.design.view.stats.tabs.a(hem0Var, this.j, storyOwner);
        this.h = aVar;
        viewPager2.setAdapter(aVar);
        if (i != viewPager2.getCurrentItem()) {
            viewPager2.e(i, false);
        }
        viewPager2.b(lfm0Var);
        com.google.android.material.tabs.c cVar = new com.google.android.material.tabs.c(vkSecondaryTabLayout, viewPager2, new l960(this, 9));
        this.i = cVar;
        cVar.a();
        a(vkSecondaryTabLayout);
    }

    public static void a(ViewGroup viewGroup) {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        boolean z = viewGroup.getLayoutDirection() == 1;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TabLayout.i) {
                TabLayout.i iVar = (TabLayout.i) childAt;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iVar.getLayoutParams();
                if (z) {
                    marginLayoutParams.setMarginStart(cn70.b(6));
                    marginLayoutParams.setMarginEnd(cn70.b(0));
                } else {
                    marginLayoutParams.setMarginEnd(cn70.b(6));
                    marginLayoutParams.setMarginStart(cn70.b(0));
                }
                iVar.setLayoutParams(marginLayoutParams);
            } else if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt);
            }
        }
    }

    public final ihm0 b(int i) {
        z1h0 H = this.c.getChildFragmentManager().H(InneractiveMediationDefs.GENDER_FEMALE + i);
        if (H instanceof ihm0) {
            return (ihm0) H;
        }
        return null;
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
