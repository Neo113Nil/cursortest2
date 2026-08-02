package xsna;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.newsfeed.api.data.WallNegativeRepliesPlaceholder;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: WallCommentsNegativeRepliesPlaceholderHolder.kt */
/* loaded from: classes4.dex */
public final class g9x0 extends aa implements View.OnClickListener, vj2 {
    public ud60 o;
    public final FeedAnimatedView p;
    public final View q;
    public final TextView r;
    public final TextView s;
    public final ProgressBar t;
    public boolean u;

    public g9x0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.wall_comments_negative_replies_placeholder, 0);
        FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.itemView.findViewById(R.id.wall_comments_toxic_placeholder_icon);
        this.p = feedAnimatedView;
        this.q = this.itemView.findViewById(R.id.wall_comments_toxic_placeholder_icon_background);
        TextView textView = (TextView) this.itemView.findViewById(R.id.wall_comments_toxic_placeholder_title);
        this.r = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.wall_comments_toxic_placeholder_subtitle);
        this.s = textView2;
        this.t = (ProgressBar) this.itemView.findViewById(R.id.wall_comments_toxic_placeholder_progress);
        this.itemView.setOnClickListener(this);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        com.vk.typography.b.k(textView2, FontFamily.REGULAR, Float.valueOf(13.0f), 4);
        feedAnimatedView.setAnimationSize(cn70.b(28));
        feedAnimatedView.setSafeZoneSize(0);
        feedAnimatedView.setColorFilter(new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_secondary), PorterDuff.Mode.SRC_ATOP));
        feedAnimatedView.setPlayCount(1);
    }

    @Override // xsna.vif0
    public final void i6(iag iagVar) {
        String str;
        v6(this.u);
        cbg cbgVar = this.n;
        WallNegativeRepliesPlaceholder wallNegativeRepliesPlaceholder = cbgVar instanceof s060 ? ((s060) cbgVar).f : null;
        xo9.A(this.r, wallNegativeRepliesPlaceholder != null ? wallNegativeRepliesPlaceholder.b : null);
        xo9.A(this.s, wallNegativeRepliesPlaceholder != null ? wallNegativeRepliesPlaceholder.c : null);
        if (wallNegativeRepliesPlaceholder == null || (str = wallNegativeRepliesPlaceholder.d) == null) {
            return;
        }
        FeedAnimatedView feedAnimatedView = this.p;
        if (epx.f(feedAnimatedView.j, str)) {
            return;
        }
        feedAnimatedView.k.set(0);
        feedAnimatedView.c(str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        v6(true);
        ud60 ud60Var = this.o;
        if (ud60Var != null) {
            ud60Var.Vj();
        }
    }

    @Override // xsna.aa
    public final void q6(cbg cbgVar) {
        this.u = Boolean.TRUE.equals(cbgVar.d);
        super.q6(cbgVar);
    }

    @Override // xsna.vj2
    public final void u2() {
        this.p.setAnimating(true);
    }

    public final void v6(boolean z) {
        this.u = true;
        bwt0.p0(this.t, z);
        bwt0.d0(this.p, z);
        bwt0.d0(this.q, z);
        bwt0.d0(this.r, z);
        bwt0.d0(this.s, z);
    }

    @Override // xsna.aa
    public final void s6() {
    }
}
