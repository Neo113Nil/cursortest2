package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.n4n0;

/* compiled from: SuggestedPostsFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4n0 implements iyp, g0t {
    public final /* synthetic */ y3n0 b;

    public j4n0(y3n0 y3n0Var) {
        this.b = y3n0Var;
    }

    @Override // xsna.iyp
    public final void a(pk50 pk50Var) {
        FragmentImpl fragmentImpl;
        FragmentImpl fragmentImpl2;
        RecyclerView recyclerView;
        Activity activity;
        n4n0 n4n0Var = (n4n0) pk50Var;
        boolean z = n4n0Var instanceof n4n0.a;
        y3n0 y3n0Var = this.b;
        if (z) {
            FragmentImpl fragmentImpl3 = y3n0Var.c.get();
            if (fragmentImpl3 == null || (recyclerView = y3n0Var.d.get()) == null || (activity = y3n0Var.e.get()) == null) {
                return;
            }
            ((fq60) y3n0Var.f.getValue()).b(y3n0Var.a, fragmentImpl3, activity, recyclerView, ((n4n0.a) n4n0Var).a);
            return;
        }
        y3n0Var.getClass();
        if (!(n4n0Var instanceof n4n0.c)) {
            if (!(n4n0Var instanceof n4n0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = y3n0Var.b.get();
            if (context == null || (fragmentImpl = y3n0Var.c.get()) == null) {
                return;
            }
            y3n0.a(context, context.getString(R.string.post_action_sb_report_sent), null, fragmentImpl);
            return;
        }
        Post post = ((n4n0.c) n4n0Var).a;
        Context context2 = y3n0Var.b.get();
        if (context2 == null || (fragmentImpl2 = y3n0Var.c.get()) == null) {
            return;
        }
        boolean fc = post.fc();
        Owner owner = post.o;
        y3n0.a(context2, context2.getString(fc ? R.string.comment_action_sb_added_to_blacklist : owner.l() ? R.string.comment_action_sb_removed_from_blacklist_f : R.string.comment_action_sb_removed_from_blacklist_m, owner.c), post.fc() ? new com.vk.catalog2.common.ui.holders.b(25, post, context2) : null, fragmentImpl2);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof iyp) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, y3n0.class, "handle", "handle(Lcom/vk/newsfeed/impl/presentation/suggested/presentation/feature/SuggestedPostsMviEvent;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
