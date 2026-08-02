package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.attachments.PollAttachment;

/* compiled from: PollViewerAdapter.kt */
/* loaded from: classes4.dex */
public final class etb0 extends zoj0<PollAttachment, ftb0> {
    public final String e;

    public etb0(String str) {
        this.e = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((ftb0) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ftb0 ftb0Var = new ftb0(viewGroup);
        ftb0Var.n.setRef(this.e);
        return ftb0Var;
    }
}
