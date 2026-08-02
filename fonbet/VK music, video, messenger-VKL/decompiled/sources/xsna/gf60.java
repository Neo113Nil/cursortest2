package xsna;

import com.vk.core.fragments.FragmentImpl;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.feed.settings.impl.presentation.filtered.a;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import xsna.pf60;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gf60 implements xa80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentImpl b;

    public /* synthetic */ gf60(int i, FragmentImpl fragmentImpl) {
        this.a = i;
        this.b = fragmentImpl;
    }

    @Override // xsna.xa80
    public final void b() {
        int i = this.a;
        FragmentImpl fragmentImpl = this.b;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                ((te60) ((NewsfeedCustomFragment2) fragmentImpl).V.getValue()).a(new pf60.d(xn60.d.a.b));
                break;
            default:
                int i2 = NewsfeedFilteredSourcesFragment.a0;
                ((NewsfeedFilteredSourcesFragment) fragmentImpl).getFeature().C(a.C1057a.b);
                break;
        }
    }
}
