package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.List;

/* compiled from: PrettyCardsAdapter.kt */
/* loaded from: classes4.dex */
public final class d3d0 extends RecyclerView.Adapter<b3d0> {
    public final ng30 c;
    public int d = -1;
    public List<? extends PrettyCardAttachment.Card> e;
    public s6o f;
    public Integer g;

    public d3d0(ng30 ng30Var) {
        this.c = ng30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<? extends PrettyCardAttachment.Card> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b3d0 b3d0Var, int i) {
        b3d0 b3d0Var2 = b3d0Var;
        List<? extends PrettyCardAttachment.Card> list = this.e;
        if (list != null) {
            b3d0Var2.V5(list.get(i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b3d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = b3d0.v;
        s6o s6oVar = this.f;
        int i3 = this.d;
        Integer num = this.g;
        int intValue = num != null ? num.intValue() : 0;
        return new b3d0(new lv0(viewGroup.getContext(), intValue), viewGroup, s6oVar, this.c, i3, intValue);
    }
}
