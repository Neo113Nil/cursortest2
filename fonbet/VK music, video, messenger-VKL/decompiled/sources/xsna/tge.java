package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.interests.AvatarWithStepProgress;
import com.vk.clips.interests.impl.ui.FlyAnimationConsumer;
import com.vk.core.view.components.text.VkText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsInterestsItemsAdapter.kt */
/* loaded from: classes16.dex */
public final class tge extends zoj0<vka, hla> {
    public final t9 e;
    public final FlyAnimationConsumer f;
    public final pkn0 g;
    public final LinkedHashSet h;

    public tge(t9 t9Var, AvatarWithStepProgress avatarWithStepProgress, pkn0 pkn0Var) {
        super(new com.vk.lists.a(new ndx()));
        this.e = t9Var;
        this.f = avatarWithStepProgress;
        this.g = pkn0Var;
        this.h = new LinkedHashSet();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(hla hlaVar, int i, List<? extends Object> list) {
        vka vkaVar = (vka) this.c.c(i);
        Object b0 = j5g.b0(0, list);
        Boolean bool = b0 instanceof Boolean ? (Boolean) b0 : null;
        if (bool != null) {
            hlaVar.m.setSelected(bool.booleanValue());
            return;
        }
        hlaVar.V5();
        VkText vkText = hlaVar.m;
        vkText.setText(vkaVar.d);
        vkText.setOnClickListener(new gla(0, hlaVar, vkaVar));
        VkText vkText2 = hlaVar.n;
        vkText2.setText(vkaVar.c.a(vkText2.getContext()));
        vkText.setSelected(vkaVar.e);
    }

    public final void L0(List<vka> list) {
        setItems(EmptyList.b);
        RecyclerView.l itemAnimator = this.d.getItemAnimator();
        wka wkaVar = itemAnimator instanceof wka ? (wka) itemAnimator : null;
        if (wkaVar != null) {
            wkaVar.A = new vr2(3, this, list);
        }
    }

    public final void N0(List<vka> list, boolean z) {
        if (getItemCount() == 0) {
            setItems(list);
            return;
        }
        if (!z) {
            L0(list);
            return;
        }
        RecyclerView.l itemAnimator = this.d.getItemAnimator();
        wka wkaVar = itemAnimator instanceof wka ? (wka) itemAnimator : null;
        if (wkaVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = this.d;
        int i = 0;
        while (i < recyclerView.getChildCount()) {
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.e0 childViewHolder = this.d.getChildViewHolder(childAt);
            hla hlaVar = childViewHolder instanceof hla ? (hla) childViewHolder : null;
            if (hlaVar != null) {
                if (((vka) this.c.c(((RecyclerView.p) childAt.getLayoutParams()).b.getBindingAdapterPosition())).e) {
                    arrayList.add(hlaVar);
                }
            }
            i = i2;
        }
        if (arrayList.isEmpty()) {
            L0(list);
            return;
        }
        HashSet<hla> hashSet = wkaVar.y;
        hashSet.clear();
        hashSet.addAll(arrayList);
        pkn0 pkn0Var = this.g;
        pkn0Var.b();
        setItems(EmptyList.b);
        pkn0Var.execute(new i73(1, this, list));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder((hla) e0Var, i, EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        hla hlaVar = new hla(viewGroup, this.e);
        hlaVar.p.d = new sge(this, hlaVar);
        return hlaVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        ((hla) e0Var).V5();
    }
}
