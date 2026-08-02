package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.zez;

/* compiled from: ClipsListHashtagViewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class yez extends RecyclerView.Adapter<vif0<?>> {
    public final dfe c;
    public Object d = EmptyList.b;

    public yez(dfe dfeVar) {
        this.c = dfeVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        zez zezVar = (zez) this.d.get(i);
        if (zezVar instanceof zez.a) {
            return 0;
        }
        if (zezVar instanceof zez.b) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(vif0<?> vif0Var, int i) {
        vif0<?> vif0Var2 = vif0Var;
        zez zezVar = (zez) this.d.get(i);
        if (vif0Var2 instanceof afz) {
            zez.a aVar = zezVar instanceof zez.a ? (zez.a) zezVar : null;
            if (aVar != null) {
                ((afz) vif0Var2).V5(aVar);
                return;
            }
            return;
        }
        if (vif0Var2 instanceof nki0) {
            return;
        }
        com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Can't bind hashtag holder " + vif0Var2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final vif0<?> onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 0 ? new afz(viewGroup, this.c) : new nki0(viewGroup, R.layout.clips_hashtags_separator, 0);
    }
}
