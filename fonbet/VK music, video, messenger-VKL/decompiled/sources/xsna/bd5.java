package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: AuthorSubscriptionView.kt */
/* loaded from: classes6.dex */
public final class bd5 extends FrameLayout {
    public final VkButton b;
    public f550 c;

    public bd5(Context context) {
        super(context, null, 0);
        VkButton vkButton = new VkButton(context, null, 6, 0);
        vkButton.setText(R.string.stickers_subscribe_author);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_notification_add_outline_28));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cn70.b(44));
        layoutParams.gravity = 80;
        layoutParams.setMargins(cn70.b(16), cn70.b(12), cn70.b(16), cn70.b(12));
        vkButton.setLayoutParams(layoutParams);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setSize(VkButton.Size.Medium);
        bwt0.i0(vkButton, new po1(this, 5));
        this.b = vkButton;
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 1);
        layoutParams2.gravity = view.getTop();
        view.setLayoutParams(layoutParams2);
        view.setBackgroundColor(e3m.f(R.attr.vk_ui_separator_secondary, context));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 80;
        setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
        setLayoutParams(layoutParams3);
        addView(view);
        addView(vkButton);
    }
}
