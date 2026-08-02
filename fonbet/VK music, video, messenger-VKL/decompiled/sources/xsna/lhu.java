package xsna;

import androidx.viewpager2.widget.ViewPager2;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;

/* compiled from: GroupCallGridViewPager.kt */
/* loaded from: classes7.dex */
public final class lhu extends ViewPager2.g {
    public final /* synthetic */ com.vk.voip.ui.groupcalls.grid.a d;

    public lhu(com.vk.voip.ui.groupcalls.grid.a aVar) {
        this.d = aVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        nlk.b.getClass();
        nlk.c();
        GroupCallViewModel groupCallViewModel = GroupCallViewModel.b;
        Integer valueOf = Integer.valueOf(i);
        groupCallViewModel.getClass();
        GroupCallViewModel.q = valueOf;
        com.vk.voip.ui.groupcalls.grid.a aVar = this.d;
        aVar.t.c.onNext(Integer.valueOf(aVar.u.getCurrentItem()));
    }
}
