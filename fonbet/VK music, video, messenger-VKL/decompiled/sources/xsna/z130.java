package xsna;

import android.os.Bundle;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.all.ModalPostAllReactionsFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.ModalPostRepostsTabFragment;
import java.util.List;

/* compiled from: ModalPostReactionsTabsAdapter.kt */
/* loaded from: classes4.dex */
public final class z130 extends com.vk.core.fragments.h {
    public static final int l = cn70.b(24);
    public List<y130> k;

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        y130 y130Var = this.k.get(i);
        String str = y130Var.a;
        Bundle bundle = y130Var.c;
        if (epx.f(str, "donats")) {
            return new ModalPostDonutFragment.a(ModalPostDonutFragment.class, null, bundle).f();
        }
        if (epx.f(str, "reposts")) {
            ModalPostRepostsTabFragment.a aVar = new ModalPostRepostsTabFragment.a(ModalPostRepostsTabFragment.class, null, bundle);
            bundle.putBoolean("is_reposts_tab", true);
            return aVar.f();
        }
        ModalPostAllReactionsFragment.a aVar2 = new ModalPostAllReactionsFragment.a(ModalPostAllReactionsFragment.class, null, bundle);
        bundle.putBoolean("is_reposts_tab", false);
        return aVar2.f();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.k.size();
    }
}
