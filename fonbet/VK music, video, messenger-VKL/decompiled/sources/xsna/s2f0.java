package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.dto.music.reactions.Reaction;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes3.dex */
public final class s2f0 extends RecyclerView.Adapter<h2f0> {
    public final List<Reaction> c;
    public final String d;
    public final nq1 e;

    public s2f0(List list, String str, nq1 nq1Var) {
        this.c = list;
        this.d = str;
        this.e = nq1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(h2f0 h2f0Var, int i) {
        h2f0 h2f0Var2 = h2f0Var;
        Reaction reaction = this.c.get(i);
        boolean f = epx.f(this.d, reaction.b);
        VKImageView vKImageView = h2f0Var2.r;
        h2f0Var2.n.setText(reaction.c);
        h2f0Var2.o.setText(reaction.d);
        String str = reaction.f;
        if (str == null || str.length() == 0) {
            bwt0.p0(vKImageView, false);
            vKImageView.clear();
        } else {
            vKImageView.s0(str);
            bwt0.p0(vKImageView, true);
        }
        LottieAnimationView lottieAnimationView = h2f0Var2.p;
        lottieAnimationView.setFailureListener(new g2f0());
        lottieAnimationView.setAnimationFromUrl(reaction.e);
        lottieAnimationView.f.a(new udy("**"), t800.j, new g700());
        bwt0.p0(h2f0Var2.q, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final h2f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new h2f0(tf3.b(viewGroup, R.layout.item_reaction, viewGroup, false), new wi3(1, this, s2f0.class, "clickItem", "clickItem(I)V", 0, 12));
    }
}
