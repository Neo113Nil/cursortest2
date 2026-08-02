package xsna;

import android.content.Intent;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import xsna.ify;

/* compiled from: NewsfeedRouterImpl.kt */
/* loaded from: classes4.dex */
public final class pw60 implements ify.a {
    public final /* synthetic */ PostingFragment b;
    public final /* synthetic */ Intent c;

    public pw60(PostingFragment postingFragment, Intent intent) {
        this.b = postingFragment;
        this.c = intent;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        int i = ify.a;
        ify.g(this);
        PostingFragment postingFragment = this.b;
        if (!postingFragment.isAdded() || postingFragment.isDetached()) {
            return;
        }
        postingFragment.startActivityForResult(this.c, 12);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
