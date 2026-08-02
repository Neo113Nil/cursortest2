package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gu1;

/* compiled from: AllHighlightsAdapter.kt */
/* loaded from: classes3.dex */
public final class yt1 extends RecyclerView.Adapter<RecyclerView.e0> implements vic {
    public final zt1 c;
    public final AllHighlightsFragment.a d;
    public final String e;
    public final j6v f;
    public List<? extends gu1> g = EmptyList.b;
    public boolean h;

    /* compiled from: AllHighlightsAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((zt1) this.receiver).u2();
            return s3q0.a;
        }
    }

    public yt1(zt1 zt1Var, AllHighlightsFragment.a aVar, String str, j6v j6vVar) {
        this.c = zt1Var;
        this.d = aVar;
        this.e = str;
        this.f = j6vVar;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        int size = this.g.size();
        EmptyList emptyList = EmptyList.b;
        List<? extends gu1> list = this.g;
        this.g = emptyList;
        androidx.recyclerview.widget.m.a(new xt1(list, emptyList), true).b(this);
        notifyItemRangeRemoved(0, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.g.get(i).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof v7k) {
            ((v7k) e0Var).V5(Boolean.valueOf(this.h));
            return;
        }
        if (e0Var instanceof m5v) {
            ((m5v) e0Var).V5(new gu1.b(((gu1.b) this.g.get(i)).b, this.h));
        } else if (e0Var instanceof l6v) {
            ((l6v) e0Var).V5((gu1.c) this.g.get(i));
        } else {
            throw new IllegalStateException(("Unknown holder: " + e0Var).toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new v7k(viewGroup, new a(0, this.c, zt1.class, "createHighlight", "createHighlight()V", 0), this.e, this.f);
        }
        if (i != 1) {
            if (i == 2) {
                return new l6v(viewGroup);
            }
            throw new IllegalStateException(("Unknown viewType: " + i).toString());
        }
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new m5v(this.c, this.d, this.e, this.f, composeView);
    }
}
