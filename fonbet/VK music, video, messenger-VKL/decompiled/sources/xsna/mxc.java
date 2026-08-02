package xsna;

import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class mxc implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ ClipFeedListFragment c;

    public /* synthetic */ mxc(ClipFeedListFragment clipFeedListFragment, int i) {
        this.b = i;
        this.c = clipFeedListFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ClipFeedListFragment clipFeedListFragment = this.c;
        switch (i) {
            case 0:
                ClipsWrapperFragment clipsWrapperFragment = clipFeedListFragment.H1;
                return Integer.valueOf(clipsWrapperFragment != null ? clipsWrapperFragment.T3() : 0);
            default:
                int i2 = ClipFeedListFragment.a2;
                nwy nwyVar = clipFeedListFragment.qo().P;
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                qcy<Object> qcyVar = qcyVarArr[28];
                njx njxVar = (njx) nwyVar.c();
                nwy nwyVar2 = clipFeedListFragment.qo().Q;
                qcy<Object> qcyVar2 = qcyVarArr[29];
                return new fbq(njxVar, (mie) nwyVar2.c());
        }
    }
}
