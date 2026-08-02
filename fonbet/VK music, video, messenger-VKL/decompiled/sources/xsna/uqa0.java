package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: PlacePickerAdapter.kt */
/* loaded from: classes4.dex */
public final class uqa0 extends androidx.recyclerview.widget.x<yqa0, RecyclerView.e0> {
    public final com.vk.newsfeed.posting.geo_picker.presentation.e c;
    public final hra0<yqa0> d;
    public kra0 e;

    /* compiled from: PlacePickerAdapter.kt */
    public static final class a extends m.e<yqa0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(yqa0 yqa0Var, yqa0 yqa0Var2) {
            yqa0 yqa0Var3 = yqa0Var;
            yqa0 yqa0Var4 = yqa0Var2;
            if ((yqa0Var3 instanceof gra0) && (yqa0Var4 instanceof gra0)) {
                return ((gra0) yqa0Var3).a.b == ((gra0) yqa0Var4).a.b;
            }
            if ((yqa0Var3 instanceof lra0) && (yqa0Var4 instanceof lra0)) {
                return true;
            }
            if ((yqa0Var3 instanceof ira0) && (yqa0Var4 instanceof ira0)) {
                return true;
            }
            return (yqa0Var3 instanceof ara0) && (yqa0Var4 instanceof ara0);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(yqa0 yqa0Var, yqa0 yqa0Var2) {
            yqa0 yqa0Var3 = yqa0Var;
            yqa0 yqa0Var4 = yqa0Var2;
            if ((yqa0Var3 instanceof gra0) && (yqa0Var4 instanceof gra0)) {
                return ((gra0) yqa0Var3).a.b == ((gra0) yqa0Var4).a.b;
            }
            if ((yqa0Var3 instanceof lra0) && (yqa0Var4 instanceof lra0)) {
                return true;
            }
            if ((yqa0Var3 instanceof ira0) && (yqa0Var4 instanceof ira0)) {
                return true;
            }
            return (yqa0Var3 instanceof ara0) && (yqa0Var4 instanceof ara0);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ Object getChangePayload(yqa0 yqa0Var, yqa0 yqa0Var2) {
            return null;
        }
    }

    public uqa0(androidx.recyclerview.widget.c cVar, com.vk.newsfeed.posting.geo_picker.presentation.e eVar) {
        super(cVar);
        this.c = eVar;
        this.d = new hra0<>(cVar.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        yqa0 item = getItem(i);
        if (item instanceof gra0) {
            return 3;
        }
        if (item instanceof lra0) {
            return 1;
        }
        if (item instanceof ira0) {
            return 2;
        }
        return item instanceof ara0 ? 4 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        VkCell.Middle.d dVar;
        yqa0 item = getItem(i);
        this.d.d(e0Var, item);
        if (e0Var instanceof fra0) {
            fra0 fra0Var = (fra0) e0Var;
            gra0 gra0Var = (gra0) item;
            fra0Var.n = gra0Var;
            fra0Var.getBindingAdapterPosition();
            VkCell vkCell = fra0Var.m;
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, gra0Var.a.c), 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            String str = gra0Var.b;
            if (str.length() > 0) {
                dVar = new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 54);
            } else {
                dVar = null;
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, eVar, dVar, null, 12));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.vk.newsfeed.posting.geo_picker.presentation.e eVar = this.c;
        if (i == 1) {
            kra0 kra0Var = new kra0(viewGroup, eVar);
            this.e = kra0Var;
            return kra0Var;
        }
        if (i == 2) {
            return new era0(viewGroup, eVar);
        }
        if (i == 3) {
            return new fra0(viewGroup, eVar);
        }
        if (i == 4) {
            return new zqa0(tf3.b(viewGroup, R.layout.posting_default_list_loading, viewGroup, false));
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported viewType in StoryArchiveAdapter = "));
    }
}
