package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.AnimatedBlockEntry;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.newsfeed.common.PostActions;
import com.vk.rlottie.RLottieDrawable;
import com.vkontakte.android.R;

/* compiled from: AnimatedBlockV2Holder.kt */
/* loaded from: classes4.dex */
public final class og2 extends rp6<mg2, AnimatedBlockEntry> implements View.OnClickListener {
    public final FeedAnimatedView E;
    public final TextView F;
    public final TextView G;
    public final VkSimpleButton H;
    public final ImageView I;

    public og2(ViewGroup viewGroup) {
        super(R.layout.news_item_animated_block_v2, viewGroup);
        FeedAnimatedView feedAnimatedView = (FeedAnimatedView) this.itemView.findViewById(R.id.lottie);
        this.E = feedAnimatedView;
        this.F = (TextView) this.itemView.findViewById(R.id.text);
        this.G = (TextView) this.itemView.findViewById(R.id.subtitle);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.button);
        this.H = vkSimpleButton;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.hide);
        this.I = imageView;
        a aVar = new a();
        imageView.setOnClickListener(this);
        vkSimpleButton.setOnClickListener(this);
        feedAnimatedView.setAnimationWidth(cn70.b(56));
        feedAnimatedView.setAnimationHeight(cn70.b(56));
        feedAnimatedView.setSafeZoneSize(0);
        feedAnimatedView.setAnimationListener(aVar);
    }

    @Override // xsna.rp6
    public final void R6(mg2 mg2Var) {
        mg2 mg2Var2 = mg2Var;
        this.itemView.setBackground(mg2Var2.o);
        CharSequence charSequence = mg2Var2.h;
        TextView textView = this.F;
        textView.setText(charSequence);
        bwt0.p0(textView, mg2Var2.i);
        CharSequence charSequence2 = mg2Var2.j;
        TextView textView2 = this.G;
        textView2.setText(charSequence2);
        bwt0.p0(textView2, mg2Var2.k);
        CharSequence charSequence3 = mg2Var2.l;
        VkSimpleButton vkSimpleButton = this.H;
        vkSimpleButton.setText(charSequence3);
        bwt0.p0(vkSimpleButton, mg2Var2.m);
        bwt0.p0(this.I, mg2Var2.n);
        int i = mg2Var2.q;
        FeedAnimatedView feedAnimatedView = this.E;
        feedAnimatedView.setAnimationWidth(i);
        int i2 = mg2Var2.r;
        feedAnimatedView.setAnimationHeight(i2);
        bwt0.m0(i, i2, feedAnimatedView);
        feedAnimatedView.setPlayCount(mg2Var2.s);
        feedAnimatedView.e(mg2Var2.p, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AnimatedBlockEntry animatedBlockEntry;
        LinkButton linkButton;
        Action action;
        s980 s980Var;
        if (jjc.b()) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.hide) {
            u1c0 J0 = J0();
            int i = J0 != null ? J0.k : 0;
            AnimatedBlockEntry animatedBlockEntry2 = (AnimatedBlockEntry) q6();
            if (animatedBlockEntry2 == null || (s980Var = this.y) == null) {
                return;
            }
            s980Var.d9(animatedBlockEntry2, t6(), PostActions.ACTION_IGNORE.h(), i);
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.button || (animatedBlockEntry = (AnimatedBlockEntry) q6()) == null || (linkButton = animatedBlockEntry.p) == null || (action = linkButton.c) == null) {
            return;
        }
        di60.w(action, this.itemView.getContext(), null, null, null, null, 62);
    }

    /* compiled from: AnimatedBlockV2Holder.kt */
    public static final class a implements RLottieDrawable.a {
        public a() {
        }

        @Override // com.vk.rlottie.RLottieDrawable.a
        public final void b() {
            FeedAnimatedView feedAnimatedView = og2.this.E;
            RLottieDrawable rLottieDrawable = feedAnimatedView.c;
            if (rLottieDrawable == null) {
                return;
            }
            int i = rLottieDrawable.k.b[1] - 1;
            if (i < 0) {
                i = 0;
            }
            rLottieDrawable.n(i);
            feedAnimatedView.invalidate();
        }

        @Override // com.vk.rlottie.RLottieDrawable.a
        public final void a() {
        }
    }
}
