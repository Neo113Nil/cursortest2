package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.ImageViewer;
import com.vk.core.tool.view.FlowLayout;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.gfu;

/* compiled from: GridCommentHolder.kt */
/* loaded from: classes4.dex */
public final class gfu extends qi6<NewsEntry> implements w8i {
    public final ViewGroup C;
    public final kdg0 D;
    public final FlowLayout E;
    public List<? extends Attachment> F;
    public List<? extends Photo> G;
    public final zsj0 H;
    public final ArrayList<RecyclerView.e0> I;
    public ImageViewer.c<?> J;
    public izs<? super VideoAttachment, Boolean> K;
    public final bpn0 L;
    public final Object M;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gfu(ViewGroup viewGroup, kdg0 kdg0Var) {
        super(r0);
        FlowLayout flowLayout = new FlowLayout(viewGroup.getContext());
        flowLayout.setId(R.id.attach);
        this.C = viewGroup;
        this.D = kdg0Var;
        FlowLayout flowLayout2 = (FlowLayout) this.itemView.findViewById(R.id.attach);
        this.E = flowLayout2;
        this.H = new zsj0();
        this.I = new ArrayList<>(2);
        this.L = new bpn0(new mxj(this, 20));
        this.M = msy.a(LazyThreadSafetyMode.NONE, new gbj(this, 17));
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.post_side_padding);
        int a2 = gbg0.a(this.itemView.getResources(), 8.0f);
        flowLayout2.setPadding(dimensionPixelOffset, a2, dimensionPixelOffset, a2);
        flowLayout2.setClipToPadding(false);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        R6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [T extends com.vk.dto.common.Attachment, com.vk.dto.common.Attachment] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [xsna.zsj0] */
    public final void R6() {
        ?? r6;
        RecyclerView.e0 e0Var;
        izs<? super VideoAttachment, Boolean> izsVar;
        FlowLayout flowLayout = this.E;
        flowLayout.removeAllViews();
        ArrayList<RecyclerView.e0> arrayList = this.I;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (true) {
            r6 = this.H;
            if (-1 >= size) {
                break;
            }
            r6.b(arrayList.get(size));
            size--;
        }
        arrayList.clear();
        int a2 = gbg0.a(this.itemView.getResources(), 4.0f);
        int a3 = gbg0.a(this.itemView.getResources(), 120.0f);
        int a4 = gbg0.a(this.itemView.getResources(), 80.0f);
        List<? extends Attachment> list = this.F;
        if (list != null) {
            final int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Attachment attachment = (Attachment) obj;
                ?? r15 = attachment instanceof PhotoAttachment ? 0 : attachment instanceof VideoAttachment ? z : attachment instanceof DocumentAttachment ? 2 : -1;
                RecyclerView.e0 a5 = r6.a(r15);
                if (a5 == null) {
                    ViewGroup viewGroup = this.C;
                    if (r15 != 0) {
                        e0Var = r15 != z ? r15 != 2 ? null : new iun(viewGroup, z) : new zjt0(viewGroup);
                    } else {
                        e0Var = new mda0(viewGroup, this.D);
                        e0Var.itemView.setOnClickListener(new View.OnClickListener() { // from class: xsna.ffu
                            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ImageViewer.c<?> g;
                                gfu gfuVar = gfu.this;
                                List<? extends Attachment> list2 = gfuVar.F;
                                if (list2 != null && gfuVar.J == null) {
                                    List<? extends Photo> A = rli0.A(new ulp0(rli0.j(new i5g(list2), hfu.b), new j5n(9)));
                                    if (A.isEmpty()) {
                                        return;
                                    }
                                    int h = e43.h(A);
                                    int i3 = i;
                                    if (i3 <= h) {
                                        h = i3;
                                    }
                                    gfuVar.G = A;
                                    g = ((ImageViewer) gfuVar.M.getValue()).g(h, A, gfuVar.itemView.getContext(), (gfu.a) gfuVar.L.getValue(), o25.a().c());
                                    gfuVar.J = g;
                                }
                            }
                        });
                    }
                    if (e0Var != null) {
                        e0Var.itemView.setTag(R.id.view_type, Integer.valueOf((int) r15));
                    }
                } else {
                    e0Var = a5;
                }
                if (e0Var instanceof m56) {
                    arrayList.add(e0Var);
                    FlowLayout.a aVar = new FlowLayout.a(a2, a2);
                    aVar.c = a3;
                    aVar.d = a4;
                    m56 m56Var = (m56) e0Var;
                    flowLayout.addView(m56Var.itemView, aVar);
                    ?? r14 = attachment != null ? attachment : 0;
                    m56Var.C = r14;
                    if (r14 != 0) {
                        m56Var.T6(r14);
                    }
                }
                if ((e0Var instanceof zjt0) && (izsVar = this.K) != null) {
                    ((zjt0) e0Var).L = izsVar;
                }
                i = i2;
                z = true;
            }
        }
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof w84) {
            this.F = ((w84) u1c0Var).q;
        }
        super.a6(u1c0Var);
    }

    /* compiled from: GridCommentHolder.kt */
    public final class a implements ImageViewer.a {
        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            Photo photo;
            List<? extends Attachment> list;
            gfu gfuVar = gfu.this;
            List<? extends Photo> list2 = gfuVar.G;
            if (list2 != null && (photo = (Photo) j5g.b0(i, list2)) != null && (list = gfuVar.F) != null) {
                Iterator<? extends Attachment> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    Attachment next = it.next();
                    if ((next instanceof PhotoAttachment) && epx.f(((PhotoAttachment) next).l, photo)) {
                        break;
                    }
                    i2++;
                }
                if (!photo.Ib()) {
                    return gfuVar.E.getChildAt(i2);
                }
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return bwt0.F(gfu.this.E);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            gfu gfuVar = gfu.this;
            gfuVar.J = null;
            gfuVar.G = null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
