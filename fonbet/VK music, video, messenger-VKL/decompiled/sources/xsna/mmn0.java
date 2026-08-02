package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vkontakte.android.R;

/* compiled from: SwipeToolTip.kt */
/* loaded from: classes3.dex */
public final class mmn0 extends FrameLayout {
    public final VKAnimationView b;
    public final VkText c;

    public mmn0(Context context) {
        super(context, null, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.live_swipe_tooltip, (ViewGroup) this, true);
        this.b = (VKAnimationView) findViewById(R.id.swipe_tooltip_animated);
        this.c = (VkText) findViewById(R.id.swipe_tooltip_text);
    }
}
