package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.footer.VkFeedUserLikesInfoFooter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: LikesFilledFooterHolderV2.kt */
/* loaded from: classes4.dex */
public final class b7z extends com.vk.newsfeed.common.recycler.holders.a {
    public static final /* synthetic */ int K0 = 0;
    public final boolean D0;
    public final VkFeedUserLikesInfoFooter E0;
    public final View F0;
    public final View G0;
    public final Object H0;
    public final Object I0;
    public List<LikeInfo> J0;

    public b7z(ViewGroup viewGroup, h3f0 h3f0Var, h170 h170Var, boolean z) {
        super(viewGroup, h3f0Var, R.layout.likes_filed_footer, h170Var);
        this.D0 = z;
        VkFeedUserLikesInfoFooter vkFeedUserLikesInfoFooter = (VkFeedUserLikesInfoFooter) this.itemView.findViewById(R.id.wall_view_like_container);
        this.E0 = vkFeedUserLikesInfoFooter;
        this.F0 = this.itemView.findViewById(R.id.comments_wrapper);
        this.G0 = this.itemView.findViewById(R.id.likes_panel_actions_container);
        a7z a7zVar = a7z.b;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.H0 = msy.a(lazyThreadSafetyMode, a7zVar);
        this.I0 = msy.a(lazyThreadSafetyMode, new s1x(this, 3));
        vkFeedUserLikesInfoFooter.setOnClickListener(this);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.J0 = obj instanceof List ? (List) obj : null;
        super.a6(u1c0Var);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        Object obj2 = u1c0Var.g;
        this.J0 = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
        super.b6(u1c0Var, obj);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void d7(NewsEntry newsEntry) {
        W6(newsEntry, new p6s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // com.vk.newsfeed.common.recycler.holders.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? q6;
        if (!epx.f(view, this.E0)) {
            super.onClick(view);
            return;
        }
        if (jjc.b() || (q6 = q6()) == 0) {
            return;
        }
        N q62 = q6();
        c6z c6zVar = q62 instanceof c6z ? (c6z) q62 : null;
        if (c6zVar == null || c6zVar.T9() != 0) {
            ((c1c0) this.I0.getValue()).z(this.itemView.getContext(), q6, this.D0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void t7(NewsEntry newsEntry) {
        super.t7(newsEntry);
        f4m.j(this.F0);
        s1c0 s1c0Var = this.x;
        boolean z = false;
        boolean z2 = s1c0Var != null && s1c0Var.d;
        awt0.v(this.G0, !z2);
        Iterable iterable = this.J0;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        boolean z3 = newsEntry instanceof c6z;
        VkFeedUserLikesInfoFooter vkFeedUserLikesInfoFooter = this.E0;
        if (!z3) {
            f4m.j(vkFeedUserLikesInfoFooter);
            return;
        }
        f4m.q(iah0.a(!z2 ? 0 : 12), vkFeedUserLikesInfoFooter);
        c6z c6zVar = (c6z) newsEntry;
        s1c0 s1c0Var2 = this.x;
        boolean z4 = s1c0Var2 != null ? s1c0Var2.m : true;
        o2f0 o2f0Var = c6zVar instanceof o2f0 ? (o2f0) c6zVar : null;
        if (o2f0Var != null && o2f0Var.T8()) {
            z = true;
        }
        if (!z4 || z) {
            f4m.j(vkFeedUserLikesInfoFooter);
            return;
        }
        nbd nbdVar = (nbd) this.H0.getValue();
        int T9 = c6zVar.T9() - (c6zVar.J() ? 1 : 0);
        c6zVar.i7();
        c6zVar.x1();
        int w0 = c6zVar.w0();
        nbdVar.getClass();
        String a = nbd.a(T9, w0);
        awt0.v(vkFeedUserLikesInfoFooter, myc0.f(a));
        if (a == null || a.length() != 0) {
            vkFeedUserLikesInfoFooter.m93setLabel6Rk4EoU(a != null ? oq.d(tlo0.Companion, a) : null);
            VkUserStack.Size size = VkUserStack.Size.Small;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String string = ((LikeInfo) it.next()).c.getString("photo");
                if (string != null) {
                    arrayList.add(string);
                }
            }
            vkFeedUserLikesInfoFooter.setAvatars(new ivu0(size, arrayList));
        }
    }
}
