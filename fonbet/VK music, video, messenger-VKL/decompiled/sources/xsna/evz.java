package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.fvz;

/* compiled from: LocalMediaListAdapter.kt */
/* loaded from: classes4.dex */
public final class evz extends androidx.recyclerview.widget.x<fvz, RecyclerView.e0> {
    public static final a f = new a();
    public final u3k c;
    public final it7 d;
    public final zqh e;

    /* compiled from: LocalMediaListAdapter.kt */
    public static final class a extends m.e<fvz> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(fvz fvzVar, fvz fvzVar2) {
            return fvzVar.equals(fvzVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(fvz fvzVar, fvz fvzVar2) {
            fvz fvzVar3 = fvzVar;
            fvz fvzVar4 = fvzVar2;
            return ((fvzVar3 instanceof fvz.a) && (fvzVar4 instanceof fvz.a)) ? ((fvz.a) fvzVar3).b.ba().getId() == ((fvz.a) fvzVar4).b.ba().getId() : (fvzVar3 instanceof fvz.b) && (fvzVar4 instanceof fvz.b);
        }
    }

    public evz(u3k u3kVar, it7 it7Var, zqh zqhVar) {
        super(f);
        this.c = u3kVar;
        this.d = it7Var;
        this.e = zqhVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        fvz item = getItem(i);
        if (item instanceof fvz.a) {
            return ((fvz.a) item).a;
        }
        if (item instanceof fvz.b) {
            return Long.MIN_VALUE;
        }
        if (item instanceof fvz.c) {
            return i + C.TIME_UNSET;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        fvz item = getItem(i);
        if (item instanceof fvz.a) {
            return 1;
        }
        if (item instanceof fvz.b) {
            return 2;
        }
        if (item instanceof fvz.c) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        fvz item = getItem(i);
        if (!(item instanceof fvz.a)) {
            if (!(item instanceof fvz.c) && !(item instanceof fvz.b)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            lvz lvzVar = e0Var instanceof lvz ? (lvz) e0Var : null;
            if (lvzVar != null) {
                lvzVar.V5(item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new lvz(viewGroup, this.d, this.e);
        }
        if (i == 2) {
            cq80 cq80Var = new cq80(tf3.b(viewGroup, R.layout.media_picker_camera_item, viewGroup, false));
            cq80Var.itemView.setOnClickListener(new bq80(0, this.c));
            return cq80Var;
        }
        if (i != 3) {
            throw new IllegalArgumentException(tgw.b(i, "viewType = ", " is not supported"));
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(viewGroup.getContext(), null, 6);
        bwt0.Z(R.attr.vk_ui_background_secondary, aspectRatioFrameLayout);
        return new jvz(aspectRatioFrameLayout);
    }

    public final void x0() {
        ArrayList arrayList = new ArrayList(20);
        for (int i = 0; i < 20; i++) {
            arrayList.add(fvz.c.a);
        }
        super.submitList(arrayList);
    }
}
