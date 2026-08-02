package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.newsfeed.common.discover.media.cells.DiscoverMediaLayoutManagerImplV2;
import com.vkontakte.android.R;
import java.util.List;
import xsna.lnt0;

/* compiled from: DiscoverMediaBlockHolder.kt */
/* loaded from: classes4.dex */
public final class s2n extends qi6<DiscoverMediaBlock> implements ent0 {
    public final RecyclerView C;
    public final DiscoverMediaLayoutManagerImplV2 D;
    public final o2n E;
    public final u4 F;
    public final a G;
    public final kln0 H;
    public List<k2n> I;

    /* compiled from: DiscoverMediaBlockHolder.kt */
    public final class a implements lnt0 {
        public boolean b;

        public a() {
        }

        @Override // xsna.lnt0
        public final RecyclerView getRecyclerView() {
            return s2n.this.C;
        }

        @Override // xsna.dnt0
        public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
            return null;
        }

        @Override // xsna.dnt0
        public final boolean getVideoFocused() {
            return this.b;
        }

        @Override // xsna.lnt0
        public final xh5 i() {
            s2n s2nVar = s2n.this;
            u1c0 J0 = s2nVar.J0();
            ol60 ol60Var = J0 != null ? J0.h : null;
            t2n t2nVar = ol60Var instanceof t2n ? (t2n) ol60Var : null;
            Object findViewHolderForAdapterPosition = s2nVar.C.findViewHolderForAdapterPosition(t2nVar != null ? t2nVar.p : -1);
            ent0 ent0Var = findViewHolderForAdapterPosition instanceof ent0 ? (ent0) findViewHolderForAdapterPosition : null;
            if (ent0Var != null) {
                dnt0 q3 = ent0Var.q3();
                fh5 fh5Var = q3 instanceof fh5 ? (fh5) q3 : null;
                if (fh5Var != null) {
                    yg5 yg5Var = fh5Var.j;
                    if (yg5Var == null) {
                        yg5Var = null;
                    }
                    return new xh5(yg5Var, fh5Var.r, fh5Var.v, (RecyclerView.e0) ent0Var, null);
                }
            }
            return null;
        }

        @Override // xsna.dnt0
        public final void setVideoFocused(boolean z) {
            this.b = z;
        }

        @Override // xsna.lnt0
        public final lnt0.a y4() {
            yg5 yg5Var;
            xh5 i = i();
            if (i == null || (yg5Var = i.a) == null) {
                return null;
            }
            RecyclerView.e0 d = i.d();
            Integer valueOf = d != null ? Integer.valueOf(d.getAbsoluteAdapterPosition()) : null;
            return new lnt0.a(yg5Var, valueOf != null ? valueOf.intValue() : -1);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    public s2n(ViewGroup viewGroup, m2c0 m2c0Var, h2c0 h2c0Var, e2c0 e2c0Var, h170 h170Var) {
        super(R.layout.newsfeed_discover_media_block, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.discover_media_block);
        this.C = recyclerView;
        DiscoverMediaLayoutManagerImplV2 discoverMediaLayoutManagerImplV2 = new DiscoverMediaLayoutManagerImplV2();
        this.D = discoverMediaLayoutManagerImplV2;
        o2n o2nVar = new o2n(m2c0Var, h170Var);
        this.E = o2nVar;
        u4 u4Var = new u4();
        this.F = u4Var;
        this.G = new a();
        kln0 a2 = h2c0Var.a();
        this.H = a2;
        new Rect();
        getContext();
        this.itemView.getContext();
        int a3 = iah0.a(2);
        if (discoverMediaLayoutManagerImplV2.d != a3) {
            discoverMediaLayoutManagerImplV2.d = a3;
            discoverMediaLayoutManagerImplV2.requestLayout();
        }
        discoverMediaLayoutManagerImplV2.h = u4Var;
        recyclerView.setRecycledViewPool((rru) m2c0Var.a.getValue());
        recyclerView.setLayoutManager(discoverMediaLayoutManagerImplV2);
        recyclerView.addItemDecoration(a2);
        recyclerView.setAdapter(o2nVar);
        o2nVar.h = e2c0Var.a;
    }

    @Override // xsna.qi6
    public final /* bridge */ /* synthetic */ void E6(DiscoverMediaBlock discoverMediaBlock) {
        R6();
    }

    @Override // xsna.qi6
    public final void F6(DiscoverMediaBlock discoverMediaBlock, Object obj) {
        if (obj instanceof Iterable) {
            obj = j5g.Z((Iterable) obj);
        }
        NewsEntry newsEntry = obj instanceof ywf0 ? ((ywf0) obj).a : obj instanceof w0g0 ? ((w0g0) obj).a : null;
        if (newsEntry != null) {
            this.E.H0(new h6g(newsEntry, 11), new r2n(0, newsEntry));
        } else {
            R6();
        }
    }

    public final void R6() {
        u1c0 J0 = J0();
        Object obj = J0 != null ? J0.h : null;
        t2n t2nVar = obj instanceof t2n ? (t2n) obj : null;
        if (t2nVar == null) {
            return;
        }
        this.F.b = t2nVar;
        kln0 kln0Var = this.H;
        if (!epx.f(kln0Var.b, "decorationWithBackground")) {
            kln0Var.b = "decorationWithBackground";
            this.C.invalidateItemDecorations();
        }
        int i = t2nVar.j;
        int i2 = t2nVar.k;
        DiscoverMediaLayoutManagerImplV2 discoverMediaLayoutManagerImplV2 = this.D;
        boolean z = (discoverMediaLayoutManagerImplV2.b == i && discoverMediaLayoutManagerImplV2.c == i2) ? false : true;
        if (i < 1) {
            i = 1;
        }
        discoverMediaLayoutManagerImplV2.b = i;
        if (i2 < 1) {
            i2 = 1;
        }
        discoverMediaLayoutManagerImplV2.c = i2;
        if (z) {
            discoverMediaLayoutManagerImplV2.requestLayout();
        }
        List<k2n> list = this.I;
        o2n o2nVar = this.E;
        if (list != null) {
            o2nVar.setItems(list);
        } else {
            o2nVar.clear();
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof a160) {
            this.I = ((a160) u1c0Var).q;
        }
        super.a6(u1c0Var);
    }

    @Override // xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        if (u1c0Var instanceof a160) {
            this.I = ((a160) u1c0Var).q;
        }
        super.b6(u1c0Var, obj);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.G;
    }
}
