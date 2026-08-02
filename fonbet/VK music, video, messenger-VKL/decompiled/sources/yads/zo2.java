package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R$drawable;

/* loaded from: classes10.dex */
public final class zo2 {
    public final pg0 a;

    public /* synthetic */ zo2() {
        this(new pg0());
    }

    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(context.getDrawable(R$drawable.monetization_ads_video_ic_replay));
        this.a.getClass();
        int a = pg0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public zo2(pg0 pg0Var) {
        this.a = pg0Var;
    }
}
