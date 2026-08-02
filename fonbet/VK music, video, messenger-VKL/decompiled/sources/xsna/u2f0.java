package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.rlottie.RLottieDrawable;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ReactionsAdapter.kt */
/* loaded from: classes16.dex */
public final class u2f0 extends androidx.recyclerview.widget.x<vze0, n2f0> {
    public final Context c;
    public final b3m0 d;

    public u2f0(Context context, b3m0 b3m0Var) {
        super(new lxm());
        this.c = context;
        this.d = b3m0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((n2f0) e0Var).V5(getItem(i), EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = this.c;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(cn70.b(38), cn70.b(38)));
        imageView.setPadding(cn70.b(3), cn70.b(3), cn70.b(3), cn70.b(3));
        f4m.m(17, imageView);
        frameLayout.addView(imageView);
        return new n2f0(frameLayout, imageView, new bk30(this, 25));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        n2f0 n2f0Var = (n2f0) e0Var;
        ImageView imageView = n2f0Var.l;
        Drawable drawable = imageView.getDrawable();
        RLottieDrawable rLottieDrawable = drawable instanceof RLottieDrawable ? (RLottieDrawable) drawable : null;
        if (rLottieDrawable != null) {
            rLottieDrawable.k();
        }
        imageView.setImageDrawable(null);
        super.onViewRecycled(n2f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((n2f0) e0Var).V5(getItem(i), list);
    }
}
