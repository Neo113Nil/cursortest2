package xsna;

import android.content.Context;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.core.view.PhotoStripView;
import com.vkontakte.android.R;

/* compiled from: CompleteCardView.kt */
/* loaded from: classes13.dex */
public final class y7i extends au9 implements pmv {
    public final LottieAnimationView e;
    public final TextView f;
    public final TextView g;
    public final PhotoStripView h;
    public final TextView i;
    public final StringBuilder j;

    public y7i(Context context) {
        super(context, R.layout.item_complete_discover_card);
        this.j = new StringBuilder();
        setClickable(true);
        setBackgroundResource(R.drawable.bg_user_discover_card_rounded_tint);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.user_discover_done);
        this.e = lottieAnimationView;
        lottieAnimationView.V(new udy("**"), t800.I, new a900(new upj0(context.getColor(R.color.vk_green))));
        this.f = (TextView) findViewById(R.id.user_discover_title);
        this.g = (TextView) findViewById(R.id.user_discover_subtitle);
        PhotoStripView photoStripView = (PhotoStripView) findViewById(R.id.user_discover_photos);
        this.h = photoStripView;
        photoStripView.setOverlapOffset(0.9f);
        photoStripView.setReverseStack(true);
        photoStripView.setPadding(gbg0.a(context.getResources(), 1.0f));
        this.i = (TextView) findViewById(R.id.user_discover_photos_description);
    }

    @Override // xsna.pmv
    public final void a() {
        LottieAnimationView lottieAnimationView = this.e;
        if (lottieAnimationView.f.m()) {
            return;
        }
        lottieAnimationView.m0();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
