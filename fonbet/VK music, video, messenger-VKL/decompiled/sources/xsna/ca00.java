package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LyricsAdapter.kt */
/* loaded from: classes3.dex */
public final class ca00 extends g940<ja00, rb00<ja00>> {
    public final mb40 e;

    public ca00(mb40 mb40Var) {
        this.e = mb40Var;
    }

    public final void L0(ArrayList arrayList) {
        uuk uukVar = this.c;
        if (arrayList.equals(((ListDataSet) uukVar).d)) {
            return;
        }
        boolean z = uukVar.c(0) instanceof na00;
        boolean z2 = j5g.b0(0, arrayList) instanceof na00;
        if (z && z2) {
            clear();
            n0(arrayList);
            notifyItemChanged(0);
            notifyItemRangeInserted(1, arrayList.size() - 1);
            return;
        }
        int itemCount = getItemCount();
        clear();
        if (itemCount > 0) {
            notifyItemRangeRemoved(0, itemCount);
        }
        n0(arrayList);
        notifyItemRangeInserted(0, arrayList.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ja00 ja00Var = (ja00) this.c.c(i);
        if (ja00Var instanceof na00) {
            return 0;
        }
        if (ja00Var instanceof oa00) {
            return 1;
        }
        if (ja00Var instanceof la00) {
            return 2;
        }
        if (ja00Var instanceof pa00) {
            return 3;
        }
        if (ja00Var instanceof qa00) {
            return 4;
        }
        if (ja00Var instanceof ma00) {
            return 5;
        }
        if (ja00Var instanceof ka00) {
            return 6;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((rb00) e0Var).V5("", false, i, this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        mb40 mb40Var = this.e;
        switch (i) {
            case 0:
                return new ra00(viewGroup.getContext());
            case 1:
                return new lb00(viewGroup.getContext(), R.layout.item_lyrics_placeholder);
            case 2:
                return new ga00(viewGroup.getContext(), mb40Var);
            case 3:
                return new nb00(viewGroup.getContext(), R.layout.item_lyrics_static_line);
            case 4:
                return new qb00(viewGroup.getContext(), mb40Var);
            case 5:
                return new ia00(viewGroup.getContext(), mb40Var);
            case 6:
                return new ea00(viewGroup.getContext(), R.layout.item_lyrics_credits);
            default:
                throw new RuntimeException("viewType");
        }
    }
}
