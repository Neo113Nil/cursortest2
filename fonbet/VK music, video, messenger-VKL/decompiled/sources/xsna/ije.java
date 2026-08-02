package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vk.dto.common.data.LikeInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: ClipsLikesFilledFooterHolder.kt */
/* loaded from: classes4.dex */
public final class ije extends com.vk.newsfeed.common.recycler.holders.a {
    public static final /* synthetic */ int L0 = 0;
    public final View D0;
    public final View E0;
    public final PhotoStackView F0;
    public final TextView G0;
    public final View H0;
    public ArrayList<LikeInfo> I0;
    public final bpn0 J0;
    public final Object K0;

    public ije(ViewGroup viewGroup, h3f0 h3f0Var, h170 h170Var) {
        super(viewGroup, h3f0Var, R.layout.clip_view_likes, h170Var);
        this.D0 = this.itemView.findViewById(R.id.comments_wrapper);
        View findViewById = this.itemView.findViewById(R.id.wall_view_like_container);
        this.E0 = findViewById;
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.wall_view_like_photos);
        this.F0 = photoStackView;
        this.G0 = (TextView) this.itemView.findViewById(R.id.wall_view_like_label);
        this.H0 = this.itemView.findViewById(R.id.likes_panel_actions_container);
        this.J0 = new bpn0(new gu0(7));
        this.K0 = msy.a(LazyThreadSafetyMode.NONE, new pce(this, 1));
        photoStackView.setOverlapOffset(0.8f);
        photoStackView.setMarginBetweenImages(2.0f);
        photoStackView.setDrawBorder(false);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.I0 = obj instanceof ArrayList ? (ArrayList) obj : null;
        super.a6(u1c0Var);
    }

    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void d7(NewsEntry newsEntry) {
        W6(newsEntry, new p6s());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // com.vk.newsfeed.common.recycler.holders.a, android.view.View.OnClickListener
    public final void onClick(View view) {
        ?? q6;
        if (!epx.f(view, this.E0)) {
            super.onClick(view);
            return;
        }
        if (jjc.b()) {
            return;
        }
        N q62 = q6();
        c6z c6zVar = q62 instanceof c6z ? (c6z) q62 : null;
        if (c6zVar == null || c6zVar.T9() == 0 || (q6 = q6()) == 0) {
            return;
        }
        ((c1c0) this.K0.getValue()).z(this.itemView.getContext(), q6, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.common.recycler.holders.a
    public final void t7(NewsEntry newsEntry) {
        super.t7(newsEntry);
        bwt0.p0(this.D0, false);
        s1c0 s1c0Var = this.x;
        bwt0.p0(this.H0, !(s1c0Var != null && s1c0Var.d));
        List list = this.I0;
        boolean z = newsEntry instanceof c6z;
        View view = this.E0;
        if (!z) {
            bwt0.p0(view, false);
            return;
        }
        o2f0 o2f0Var = newsEntry instanceof o2f0 ? (o2f0) newsEntry : null;
        Object[] objArr = o2f0Var != null && o2f0Var.T8();
        s1c0 s1c0Var2 = this.x;
        if (!(s1c0Var2 != null ? s1c0Var2.m : true) || objArr == true) {
            bwt0.p0(view, false);
            return;
        }
        c6z c6zVar = (c6z) newsEntry;
        if (list == null) {
            list = EmptyList.b;
        }
        nbd nbdVar = (nbd) this.J0.getValue();
        int T9 = c6zVar.T9() - (c6zVar.J() ? 1 : 0);
        c6zVar.i7();
        c6zVar.x1();
        int w0 = c6zVar.w0();
        nbdVar.getClass();
        String a = nbd.a(T9, w0);
        if (a == null || a.length() == 0) {
            bwt0.p0(view, false);
            return;
        }
        TextView textView = this.G0;
        textView.setText(a);
        boolean isEmpty = list.isEmpty();
        PhotoStackView photoStackView = this.F0;
        if (isEmpty) {
            f4m.s(cn70.b(0), textView);
            bwt0.p0(photoStackView, false);
        } else {
            f4m.s(cn70.b(8), textView);
            photoStackView.setCount(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                photoStackView.h(i, ((LikeInfo) list.get(i)).c.getString("photo"));
            }
            bwt0.p0(photoStackView, true);
        }
        bwt0.p0(view, true);
    }
}
