package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class klt implements bin0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ FragmentImpl c;

    public /* synthetic */ klt(int i, FragmentImpl fragmentImpl) {
        this.b = i;
        this.c = fragmentImpl;
    }

    @Override // xsna.bin0
    public final Object get() {
        int i = this.b;
        FragmentImpl fragmentImpl = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return ((GeoPostsFragment) fragmentImpl).mo2getContext();
            default:
                return ((PostViewFragment) fragmentImpl).H0;
        }
    }
}
