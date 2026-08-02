package xsna;

import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rvh implements bin0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rvh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bin0
    public final Object get() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((vvh) obj).m.c();
            case 1:
                return ((mqp) obj).b.a();
            default:
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return ((SuggestedPostsFragment) obj).getActivity();
        }
    }
}
