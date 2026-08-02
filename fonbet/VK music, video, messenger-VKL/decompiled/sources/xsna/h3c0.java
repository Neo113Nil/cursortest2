package xsna;

import android.view.View;
import com.vk.lists.AbstractPaginatedView;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;

/* compiled from: PostFragment.kt */
/* loaded from: classes4.dex */
public final class h3c0 extends AbstractPaginatedView.i {
    public final /* synthetic */ PostFragment a;
    public final /* synthetic */ View b;

    public h3c0(PostFragment postFragment, View view) {
        this.a = postFragment;
        this.b = view;
    }

    @Override // com.vk.lists.AbstractPaginatedView.i
    public final void b() {
        int i = PostFragment.S0;
        PostFragment postFragment = this.a;
        mzp0 mzp0Var = postFragment.J;
        if (mzp0Var != null) {
            mzp0Var.d(this.b);
        }
        postFragment.On().a();
    }
}
