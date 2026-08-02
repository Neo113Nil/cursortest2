package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.e3m;

/* compiled from: StoryStatisticsViewersAdapter.kt */
/* loaded from: classes6.dex */
public final class uhm0 extends RecyclerView.Adapter<RecyclerView.e0> implements vic {
    public final Context c;
    public final erl0 d;
    public final tql0 e;
    public final cim0 f;
    public final p00 g;
    public final boolean h;
    public final txm i = new txm();
    public List<? extends s3u0> j;
    public List<zam0> k;

    public uhm0(Context context, erl0 erl0Var, tql0 tql0Var, cim0 cim0Var, p00 p00Var, boolean z) {
        this.c = context;
        this.d = erl0Var;
        this.e = tql0Var;
        this.f = cim0Var;
        this.g = p00Var;
        this.h = z;
        EmptyList emptyList = EmptyList.b;
        this.j = emptyList;
        this.k = emptyList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        s3u0 s3u0Var = (s3u0) j5g.b0(i, this.j);
        if (s3u0Var instanceof u3u0) {
            return 1;
        }
        if (s3u0Var instanceof zem0) {
            return 2;
        }
        if (s3u0Var instanceof StoryUserViewer) {
            return 3;
        }
        throw new IllegalArgumentException("Unsupported item " + s3u0Var + " for position " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder(e0Var, i);
            return;
        }
        s3u0 s3u0Var = (s3u0) j5g.b0(i, this.j);
        if (s3u0Var == null) {
            return;
        }
        if (list.contains("payload_reactions_changed")) {
            if (e0Var instanceof z3u0) {
                z3u0 z3u0Var = (z3u0) e0Var;
                z3u0Var.q = this.k;
                z3u0Var.i6((StoryUserViewer) s3u0Var);
                return;
            }
            return;
        }
        if (e0Var instanceof arl0) {
            ((arl0) e0Var).V5(((u3u0) s3u0Var).b);
            return;
        }
        if (e0Var instanceof yem0) {
            ((yem0) e0Var).W5((zem0) s3u0Var);
        } else if (e0Var instanceof z3u0) {
            z3u0 z3u0Var2 = (z3u0) e0Var;
            z3u0Var2.q = this.k;
            z3u0Var2.i6((StoryUserViewer) s3u0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        if (i != 1) {
            if (i == 2) {
                return new yem0(composeView, null);
            }
            if (i != 3) {
                throw new IllegalArgumentException(lhg.a(i, "Unsupported viewType "));
            }
            e3m.a aVar = e3m.a;
            composeView.setBackground(m33.a(R.drawable.white_ripple, this.c));
            return new z3u0(composeView, this.h, this.f, this.g);
        }
        arl0.J = false;
        arl0 arl0Var = (arl0) this.e.b(this.c, viewGroup, MobileOfficialAppsConStoriesStat$ViewEntryPoint.REPLIES_LIST, new y4m0(false), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_FEEDBACK));
        View view = arl0Var.itemView;
        view.setPadding(view.getPaddingLeft(), -iah0.a(8), arl0Var.itemView.getPaddingRight(), arl0Var.itemView.getPaddingBottom());
        ((RecyclerView) arl0Var.itemView).addOnItemTouchListener(new thm0());
        this.d.a(arl0Var);
        return arl0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        s3u0 s3u0Var = (s3u0) j5g.b0(i, this.j);
        if (s3u0Var == null) {
            return;
        }
        if (e0Var instanceof arl0) {
            ((arl0) e0Var).V5(((u3u0) s3u0Var).b);
            return;
        }
        if (e0Var instanceof yem0) {
            ((yem0) e0Var).W5((zem0) s3u0Var);
        } else if (e0Var instanceof z3u0) {
            z3u0 z3u0Var = (z3u0) e0Var;
            z3u0Var.q = this.k;
            z3u0Var.i6((StoryUserViewer) s3u0Var);
        }
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
    }
}
