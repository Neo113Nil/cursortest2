package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.common.PostActions;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.bwy;

/* compiled from: SkeletonWithRetryFooterHolder.kt */
/* loaded from: classes4.dex */
public final class czj0 extends rp6<dzj0, Digest> implements View.OnClickListener {
    public final ShimmerFrameLayout E;
    public final View F;

    public czj0(ViewGroup viewGroup) {
        super(R.layout.skeleton_with_retry_footer_holder, viewGroup);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.skeleton);
        this.E = shimmerFrameLayout;
        View findViewById = this.itemView.findViewById(R.id.digest_button);
        this.F = findViewById;
        TextView textView = (TextView) this.itemView.findViewById(R.id.digest_text);
        shimmerFrameLayout.b(((Shimmer.a) ((Shimmer.a) new Shimmer.a().i()).d()).c(false).g(0.08f).a());
        findViewById.setOnClickListener(this);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(16.0f), 4);
        jno0.c(textView, R.attr.digest_footer_button_text_color);
        textView.setText(R.string.skeleton_block_retry);
    }

    @Override // xsna.rp6
    public final void R6(dzj0 dzj0Var) {
        boolean f = epx.f(dzj0Var.i, bwy.c.a);
        View view = this.F;
        ShimmerFrameLayout shimmerFrameLayout = this.E;
        if (f) {
            bwt0.d0(view, true);
            bwt0.p0(shimmerFrameLayout, true);
            shimmerFrameLayout.c();
        } else {
            bwt0.d0(shimmerFrameLayout, true);
            bwt0.p0(view, true);
            shimmerFrameLayout.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s980 s980Var;
        if (jjc.b()) {
            return;
        }
        Digest digest = (Digest) q6();
        if (digest != null && (s980Var = this.y) != null) {
            NewsEntry t6 = t6();
            int h = PostActions.ACTION_LAZY_LOAD_RETRY.h();
            u1c0 J0 = J0();
            s980Var.d9(digest, t6, h, J0 != null ? J0.k : 0);
        }
        bwt0.d0(this.F, true);
        ShimmerFrameLayout shimmerFrameLayout = this.E;
        bwt0.p0(shimmerFrameLayout, true);
        shimmerFrameLayout.c();
    }
}
