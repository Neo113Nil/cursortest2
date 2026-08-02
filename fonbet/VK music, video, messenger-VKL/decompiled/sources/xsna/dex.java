package xsna;

import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: InterestingStoriesBlockItemHolderView.kt */
/* loaded from: classes4.dex */
public final class dex {
    public static final void a(ImageView imageView, boolean z) {
        if (z) {
            omw.a(imageView, R.color.vk_red_nice);
            imageView.setImageResource(R.drawable.vk_icon_like_24);
            imageView.setContentDescription(imageView.getContext().getString(R.string.discover_newsfeed_remove_like_description));
        } else {
            omw.a(imageView, R.color.vk_white);
            imageView.setImageResource(R.drawable.vk_icon_like_outline_24);
            imageView.setContentDescription(imageView.getContext().getString(R.string.discover_newsfeed_like_description));
        }
    }
}
