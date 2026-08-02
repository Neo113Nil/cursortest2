package xsna;

import android.content.Intent;
import com.vk.newsfeed.api.posting.attachments.AttachType;
import com.vk.newsfeed.impl.posting.PostingFragment;
import xsna.ify;

/* compiled from: PostingPresenter.kt */
/* loaded from: classes4.dex */
public final class jkc0 implements ify.a {
    public final /* synthetic */ ikc0 b;
    public final /* synthetic */ Intent c;
    public final /* synthetic */ AttachType d;

    public jkc0(ikc0 ikc0Var, Intent intent, AttachType attachType) {
        this.b = ikc0Var;
        this.c = intent;
        this.d = attachType;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        int i = ify.a;
        ify.g(this);
        ikc0 ikc0Var = this.b;
        PostingFragment postingFragment = ikc0Var.c;
        if (!postingFragment.isAdded() || postingFragment.isDetached()) {
            return;
        }
        postingFragment.startActivityForResult(this.c, 32);
        ikc0Var.Y7(this.d);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
    }
}
