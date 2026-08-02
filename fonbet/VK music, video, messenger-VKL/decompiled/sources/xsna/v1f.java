package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.NoWhenBranchMatchedException;
import xsna.tps0;
import xsna.xjd;

/* compiled from: ClipsRetentionBlockItemsHolderAdapter.kt */
/* loaded from: classes4.dex */
public final class v1f extends pfe {
    public String e;
    public String f;
    public final ClipsHolderViewImpl g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final pkd k;
    public final xod l;
    public final tps0.a m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1f(ListDataSet listDataSet, ClipsHolderViewImpl clipsHolderViewImpl, boolean z, pkd pkdVar, xod xodVar, int i, int i2) {
        super(listDataSet);
        boolean z2 = (i2 & 16) == 0;
        boolean z3 = (i2 & 32) == 0;
        boolean z4 = (i2 & 64) == 0 ? z : false;
        this.e = null;
        this.f = null;
        this.g = clipsHolderViewImpl;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = pkdVar;
        this.l = xodVar;
        this.m = new tps0.a(-2, -1, Float.valueOf(0.5625f), 1, i, null, 480);
        setHasStableIds(true);
    }

    @Override // xsna.pfe
    public final String K0() {
        return this.e;
    }

    @Override // xsna.pfe
    public final String L0() {
        return this.f;
    }

    @Override // xsna.pfe
    public final void N0(String str) {
        this.e = str;
    }

    @Override // xsna.pfe
    public final void O0(String str) {
        this.f = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (((xjd) this.c.c(i)) == null) {
            return 0L;
        }
        return r3.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        xjd xjdVar = (xjd) this.c.c(i);
        if (xjdVar instanceof xjd.a) {
            return 0;
        }
        if (xjdVar instanceof xjd.b) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        xjd xjdVar = (xjd) this.c.c(i);
        if (!(xjdVar instanceof xjd.a) || !(e0Var instanceof yjd)) {
            if ((xjdVar instanceof xjd.b) && (e0Var instanceof w1f)) {
                ((w1f) e0Var).V5(xjdVar);
                return;
            }
            return;
        }
        yjd yjdVar = (yjd) e0Var;
        String str = this.e;
        yjdVar.getClass();
        VideoAttachment videoAttachment = new VideoAttachment(((xjd.a) xjdVar).a);
        videoAttachment.Lb(str, null, null);
        yjdVar.b7(videoAttachment);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new u1f(viewGroup, this.m, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        if (i != 1) {
            throw new IllegalStateException("Unsupported viewType");
        }
        w1f w1fVar = new w1f(viewGroup, R.layout.clips_retention_block_show_more_item, 0);
        w1fVar.itemView.setClipToOutline(true);
        w1fVar.itemView.setOutlineProvider(new t0w0(6, iah0.a(8), false, false));
        jjc.g(w1fVar.itemView, new lb(w1fVar, 24));
        return w1fVar;
    }
}
