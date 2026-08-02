package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class krc0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ LinearLayoutManager e;
    public final /* synthetic */ sq60 f;
    public final /* synthetic */ FragmentImpl g;

    public /* synthetic */ krc0(Integer num, Integer num2, LinearLayoutManager linearLayoutManager, FragmentImpl fragmentImpl, sq60 sq60Var, int i) {
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = linearLayoutManager;
        this.g = fragmentImpl;
        this.f = sq60Var;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        int i = this.b;
        sq60 sq60Var = this.f;
        FragmentImpl fragmentImpl = this.g;
        LinearLayoutManager linearLayoutManager2 = this.e;
        Integer num = this.d;
        Integer num2 = this.c;
        switch (i) {
            case 0:
                PostponedPostsFragment postponedPostsFragment = (PostponedPostsFragment) fragmentImpl;
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                if (num2 != null && num != null && linearLayoutManager2 != null) {
                    linearLayoutManager2.K(num2.intValue(), num.intValue());
                }
                if (sq60Var.d) {
                    RecyclerView recyclerView = postponedPostsFragment.Z;
                    Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                    linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.K(0, 0);
                    }
                }
                ((o170) postponedPostsFragment.eo().a.V.getValue()).b(postponedPostsFragment.Z);
                postponedPostsFragment.eo().b().a(sq60Var.a);
                ehv ehvVar = (ehv) postponedPostsFragment.eo().e.b;
                if (ehvVar != null) {
                    ehvVar.r();
                    break;
                }
                break;
            default:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) fragmentImpl;
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                if (num2 != null && num != null && linearLayoutManager2 != null) {
                    linearLayoutManager2.K(num2.intValue(), num.intValue());
                }
                if (sq60Var.d) {
                    RecyclerView recyclerView2 = reactionsFeedFragment.Z;
                    Object layoutManager2 = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                    linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                    if (linearLayoutManager != null) {
                        linearLayoutManager.K(0, 0);
                    }
                }
                ((o170) reactionsFeedFragment.eo().a.V.getValue()).b(reactionsFeedFragment.Z);
                reactionsFeedFragment.eo().b().a(sq60Var.a);
                ehv ehvVar2 = (ehv) reactionsFeedFragment.eo().e.b;
                if (ehvVar2 != null) {
                    ehvVar2.r();
                    break;
                }
                break;
        }
    }
}
