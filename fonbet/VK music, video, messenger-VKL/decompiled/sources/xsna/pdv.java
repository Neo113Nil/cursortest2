package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.api.autotest.attachment.AutoTestAttachmentUsage;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import kotlin.LazyThreadSafetyMode;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: HorizontalGalleryAdapter.kt */
/* loaded from: classes4.dex */
public final class pdv extends zoj0<u1c0, qi6<?>> implements w8i {
    public final h170 e;
    public d5r h;
    public anw j;
    public s980 k;
    public s6o m;
    public FeedGoodsPhotoHolder.a n;
    public final t2r f = new t2r(true, new h170());
    public final bpn0 g = new bpn0(new z3i(this, 19));
    public final Object i = msy.a(LazyThreadSafetyMode.NONE, new tju(this, 1));
    public hi60 l = t980.a;

    public pdv(h170 h170Var) {
        this.e = h170Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(qi6<?> qi6Var, int i) {
        if (qi6Var instanceof bnw) {
            ((bnw) qi6Var).b5(this.j);
        }
        h170 h170Var = this.e;
        if (h170Var == null || !((Boolean) h170Var.w.getValue()).booleanValue()) {
            qi6Var.O6(this.k);
            s980 s980Var = this.k;
            if (s980Var != null) {
                qi6Var.M6(s980Var);
            }
        } else {
            qi6Var.M6(this.l);
        }
        s6o s6oVar = this.m;
        if (s6oVar != null) {
            qi6Var.Q6(s6oVar);
        }
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            qi6Var.a6(u1c0Var);
        }
        if (u1c0Var instanceof r74) {
            r74 r74Var = (r74) u1c0Var;
            mnh0.u(qi6Var.itemView, AutoTestAttachmentUsage.CAROUSEL, r74Var.q, r74Var.c, qi6Var.t6());
        }
        FeedGoodsPhotoHolder.a aVar = this.n;
        if (aVar != null) {
            FeedGoodsPhotoHolder feedGoodsPhotoHolder = qi6Var instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) qi6Var : null;
            if (feedGoodsPhotoHolder != null) {
                feedGoodsPhotoHolder.u5(aVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        u1c0 u1c0Var = (u1c0) this.c.c(i);
        if (u1c0Var != null) {
            return u1c0Var.c;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        cr4 cr4Var = (cr4) this.g.getValue();
        d5r d5rVar = this.h;
        if (d5rVar == null) {
            d5rVar = null;
        }
        return this.f.a(viewGroup, i, cr4Var, d5rVar, (kdg0) this.i.getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(RecyclerView.e0 e0Var) {
        UsableRecyclerView.j jVar = (qi6) e0Var;
        if (jVar instanceof bnw) {
            ((bnw) jVar).b5(this.j);
        }
        return super.onFailedToRecycleView(jVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        UsableRecyclerView.j jVar = (qi6) e0Var;
        if (jVar instanceof bnw) {
            ((bnw) jVar).b5(this.j);
        }
    }
}
