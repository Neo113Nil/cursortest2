package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: CommunityPodcastItemView.kt */
/* loaded from: classes17.dex */
public final class vch extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final VkImage b;
    public final VkText c;
    public final VkText d;

    public vch(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.community_podcast_item, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setBackground(e3m.e(R.attr.selectableItemBackground, context));
        int a = iah0.a(16);
        f4m.l(a, a, this);
        int a2 = iah0.a(8);
        f4m.B(a2, a2, this);
        VkImage vkImage = (VkImage) findViewById(R.id.audio_custom_image);
        vkImage.setEmptyImagePlaceholder(context.getDrawable(R.drawable.vk_icon_podcast_24));
        vkImage.setPlaceholderColor(e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, context));
        this.b = vkImage;
        this.c = (VkText) findViewById(R.id.audio_title);
        this.d = (VkText) findViewById(R.id.audio_duration);
    }

    public final VkText getDurationView() {
        return this.d;
    }

    public final VkImage getThumbs() {
        return this.b;
    }

    public final VkText getTitle() {
        return this.c;
    }
}
