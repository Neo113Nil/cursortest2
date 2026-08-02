package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: PostingItemNewPostAdapter.kt */
/* loaded from: classes4.dex */
public final class thc0 extends lk6<uhc0> implements jgc0 {
    public uhc0 c;
    public boolean d;
    public PostingCreationEntryPoint e;

    @Override // xsna.jgc0
    public final void M2(String str) {
        this.c.M2(str);
    }

    @Override // xsna.jgc0
    public final void Z5(boolean z) {
        this.c.Z5(z);
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ApiInvocationException.ErrorCodes.FRIENDSHIP_REQUIRED;
    }

    @Override // xsna.jgc0
    public final void oj(boolean z) {
        this.c.oj(!this.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((uhc0) e0Var).V5(s3q0.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.c = new uhc0(viewGroup);
        throw null;
    }

    @Override // xsna.jgc0
    public final void p8(boolean z) {
        this.c.p8(z);
    }

    @Override // xsna.jgc0
    public final void q8(boolean z) {
        this.c.q8(z);
    }

    @Override // xsna.jgc0
    public final void v5(boolean z) {
        this.d = z;
        uhc0 uhc0Var = this.c;
        if (uhc0Var != null) {
            uhc0Var.v5(z);
        }
    }
}
