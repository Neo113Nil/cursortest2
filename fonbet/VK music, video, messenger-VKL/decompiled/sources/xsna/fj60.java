package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fj60 implements bin0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ FragmentImpl c;

    public /* synthetic */ fj60(int i, FragmentImpl fragmentImpl) {
        this.b = i;
        this.c = fragmentImpl;
    }

    @Override // xsna.bin0
    public final Object get() {
        int i = this.b;
        FragmentImpl fragmentImpl = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) fragmentImpl).mo2getContext();
            default:
                int i2 = PostFragment.S0;
                return ((PostFragment) fragmentImpl).zo().m;
        }
    }
}
