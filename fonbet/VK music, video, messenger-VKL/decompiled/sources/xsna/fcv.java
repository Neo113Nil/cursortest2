package xsna;

import android.os.Bundle;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ecv;

/* compiled from: HomeTabsTitleProvider2.kt */
/* loaded from: classes4.dex */
public final class fcv implements ecv.a {
    public final ec60 a;
    public final ArrayList<DiscoverCategory> b = new ArrayList<>();

    public fcv(ec60 ec60Var) {
        this.a = ec60Var;
    }

    @Override // xsna.ecv.a
    public final String a(int i) {
        String str;
        if (i != 0) {
            DiscoverCategory discoverCategory = (DiscoverCategory) j5g.b0(i - 1, this.b);
            if (discoverCategory != null) {
                return discoverCategory.c;
            }
            Object obj = m3n.a;
            return y8g0.e(R.string.newsfeed_for_you_stub);
        }
        NewsfeedList newsfeedList = this.a.f;
        if (newsfeedList != null && (str = newsfeedList.d) != null) {
            return str;
        }
        w1n.b.getClass();
        return y8g0.e(R.string.home_tabs_feed);
    }

    public final void b(ArrayList arrayList) {
        ArrayList<DiscoverCategory> arrayList2 = this.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    @Override // xsna.ecv.a
    public final void d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle != null ? bundle.getParcelableArrayList(HintCategories.PARAM_NAME) : null;
        if (parcelableArrayList != null) {
            ArrayList<DiscoverCategory> arrayList = this.b;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
    }

    @Override // xsna.ecv.a
    public final String e(int i) {
        String str;
        DiscoverCategory discoverCategory = (DiscoverCategory) j5g.b0(i - 1, this.b);
        return (discoverCategory == null || (str = discoverCategory.b) == null) ? "" : str;
    }

    @Override // xsna.ecv.a
    public final Bundle r() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(HintCategories.PARAM_NAME, this.b);
        return bundle;
    }
}
