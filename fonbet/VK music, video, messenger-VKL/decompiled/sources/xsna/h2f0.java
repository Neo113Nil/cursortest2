package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ReactionVh.kt */
/* loaded from: classes3.dex */
public final class h2f0 extends RecyclerView.e0 {
    public final View l;
    public final wi3 m;
    public final AppCompatTextView n;
    public final AppCompatTextView o;
    public final LottieAnimationView p;
    public final VkImageSimple q;
    public final VKImageView r;

    public h2f0(View view, wi3 wi3Var) {
        super(view);
        this.l = view;
        this.m = wi3Var;
        this.n = (AppCompatTextView) view.findViewById(R.id.reaction_text);
        this.o = (AppCompatTextView) view.findViewById(R.id.reaction_description);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.reaction_icon);
        this.p = lottieAnimationView;
        this.q = (VkImageSimple) view.findViewById(R.id.reaction_cancel);
        this.r = (VKImageView) view.findViewById(R.id.reaction_badge);
        jjc.g(this.itemView, new k170(this, 17));
        lottieAnimationView.setOutlineProvider(new t0w0(6, cn70.b(16), false, false));
        lottieAnimationView.setClipToOutline(true);
    }
}
