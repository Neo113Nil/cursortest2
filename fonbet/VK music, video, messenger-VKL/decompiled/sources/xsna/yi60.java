package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.tab.NewsfeedFilterListFragment2;
import java.util.ArrayList;

/* compiled from: NewsfeedFilteredSourcesPagerAdapter.kt */
/* loaded from: classes18.dex */
public final class yi60 extends com.vk.core.fragments.h {
    public final ArrayList<xer> k;

    public yi60(vbs vbsVar) {
        super(vbsVar, false);
        this.k = new ArrayList<>();
        this.d = true;
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        FilteredSourceType filteredSourceType = this.k.get(i).b;
        NewsfeedFilterListFragment2.a aVar = new NewsfeedFilterListFragment2.a(NewsfeedFilterListFragment2.class, null, null);
        aVar.j.putSerializable("type", filteredSourceType);
        return aVar.f();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.k.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.k.get(i).a;
    }
}
