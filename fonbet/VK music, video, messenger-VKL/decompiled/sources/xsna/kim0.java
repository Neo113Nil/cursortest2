package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stories.design.view.stickerbutton.ReactionStickerButton;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import xsna.n2l0;
import xsna.x2m0;

/* compiled from: StoryStickerAdapter.kt */
/* loaded from: classes15.dex */
public final class kim0 extends qm6<njc, RecyclerView.e0> {
    public final gzs<Set<WebStickerType>> c;
    public final x2m0 d;
    public final uei0 e;
    public final SelectionStickerView.OpenFrom f;

    /* JADX WARN: Multi-variable type inference failed */
    public kim0(gzs<? extends Set<? extends WebStickerType>> gzsVar, x2m0 x2m0Var, uei0 uei0Var, SelectionStickerView.OpenFrom openFrom) {
        super(lim0.a);
        this.c = gzsVar;
        this.d = x2m0Var;
        this.e = uei0Var;
        this.f = openFrom;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        njc njcVar = getCurrentList().get(i);
        if (njcVar instanceof ig10) {
            return 100;
        }
        if (njcVar instanceof swu) {
            return 101;
        }
        if (njcVar instanceof pzo0) {
            return 102;
        }
        throw new IllegalStateException("Can't calculate item view for " + njcVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        njc njcVar = getCurrentList().get(i);
        if (e0Var instanceof kzo0) {
            ((kzo0) e0Var).l.setText(y8g0.e(((pzo0) njcVar).a));
            return;
        }
        if (e0Var instanceof q4l0) {
            ((q4l0) e0Var).V5(((ig10) njcVar).a);
            return;
        }
        if ((e0Var instanceof n2l0) && (njcVar instanceof swu)) {
            n2l0 n2l0Var = (n2l0) e0Var;
            swu swuVar = (swu) njcVar;
            Set<WebStickerType> invoke = this.c.invoke();
            ArrayList arrayList = new ArrayList();
            for (WebStickerType webStickerType : invoke) {
                Object obj = n2l0.o;
                StickerButtonType a = n2l0.a.a(webStickerType);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            Set S0 = j5g.S0(arrayList);
            for (Map.Entry entry : n2l0.o.entrySet()) {
                StickerButtonType stickerButtonType = (StickerButtonType) entry.getKey();
                View findViewById = n2l0Var.itemView.findViewById(((Number) entry.getValue()).intValue());
                if (findViewById != null) {
                    findViewById.setEnabled(S0.contains(stickerButtonType));
                    findViewById.setOnClickListener(new c6u(3, n2l0Var, stickerButtonType));
                    if (stickerButtonType == StickerButtonType.REACTION) {
                        ReactionStickerButton reactionStickerButton = findViewById instanceof ReactionStickerButton ? (ReactionStickerButton) findViewById : null;
                        if (reactionStickerButton != null) {
                            reactionStickerButton.setupHighlight(n2l0Var.n);
                        }
                    }
                }
            }
            x2m0.b bVar = n2l0Var.l;
            boolean z = swuVar.a;
            m2l0 m2l0Var = bVar.a;
            if (m2l0Var != null) {
                m2l0Var.invoke(Boolean.valueOf(z));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 100:
                return new q4l0(viewGroup.getContext(), this.e, null, null);
            case 101:
                return new n2l0(viewGroup, this.e, this.c.invoke(), this.d, this.f);
            case 102:
                return new kzo0(viewGroup);
            default:
                throw new IllegalStateException(lhg.a(i, "You can't bind holder with viewType: "));
        }
    }
}
