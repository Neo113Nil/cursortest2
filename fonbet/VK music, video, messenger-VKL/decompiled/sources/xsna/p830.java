package xsna;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: MoodItemVh.kt */
/* loaded from: classes3.dex */
public final class p830 extends RecyclerView.e0 {
    public final View l;
    public final AppCompatTextView m;
    public final LottieAnimationView n;
    public final VKImageView o;

    public p830(View view, whe wheVar) {
        super(view);
        this.l = view;
        this.m = (AppCompatTextView) view.findViewById(R.id.mood_text);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.mood_icon);
        this.n = lottieAnimationView;
        this.o = (VKImageView) view.findViewById(R.id.mood_badge);
        this.itemView.setOnClickListener(new sch(4, this, wheVar));
        lottieAnimationView.setOutlineProvider(new t0w0(6, cn70.b(16), false, false));
        lottieAnimationView.setClipToOutline(true);
    }
}
