package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import xsna.yrn;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3c0 implements yrn.a {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.yrn.a
    public final boolean Z(RecyclerView.e0 e0Var) {
        int i = PostFragment.S0;
        int itemViewType = e0Var.getItemViewType();
        dsx0 dsx0Var = e0Var instanceof dsx0 ? (dsx0) e0Var : null;
        return (dsx0Var != null ? dsx0Var.a3() : 0) > 1 && ogg.b.contains(Integer.valueOf(itemViewType));
    }
}
