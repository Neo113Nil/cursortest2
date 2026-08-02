package xsna;

import com.google.android.material.tabs.TabLayout;
import com.vk.core.view.VKViewPager;
import com.vk.fave.fragments.FavesFragment;

/* compiled from: FavesFragment.kt */
/* loaded from: classes18.dex */
public final class tsq extends TabLayout.j {
    public final /* synthetic */ FavesFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsq(FavesFragment favesFragment, VKViewPager vKViewPager) {
        super(vKViewPager);
        this.c = favesFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.j, com.google.android.material.tabs.TabLayout.c
    public final void hl(TabLayout.g gVar) {
        this.c.s();
    }
}
