package xsna;

import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.uuf;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class irf extends FunctionReferenceImpl implements izs<uuf.h, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(uuf.h hVar) {
        q8e Bo;
        uuf.h hVar2 = hVar;
        ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
        int i = ClipsWrapperFragment.Q0;
        ClipFeedListFragment lo = clipsWrapperFragment.lo();
        if (lo != null && (Bo = lo.Bo()) != null) {
            clipsWrapperFragment.go(new nn4(hVar2, clipsWrapperFragment, Bo, 3));
        }
        return s3q0.a;
    }
}
