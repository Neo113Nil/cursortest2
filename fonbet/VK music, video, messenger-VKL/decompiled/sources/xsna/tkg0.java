package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;

/* compiled from: VideoAuthorView.kt */
/* loaded from: classes3.dex */
public final class tkg0 implements VkCell.d {
    public final View a;
    public final VkButton b;
    public final VkSimpleButton c;
    public final VkSimpleButton d;
    public final View e;
    public final ImageView f;
    public final ImageView g;

    public tkg0(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.video_author_right, (ViewGroup) null);
        this.a = inflate;
        this.b = (VkButton) inflate.findViewById(R.id.video_author_donut_button);
        this.c = (VkSimpleButton) inflate.findViewById(R.id.video_author_subscribe_button);
        this.d = (VkSimpleButton) inflate.findViewById(R.id.video_author_analytics_button);
        this.e = inflate.findViewById(R.id.video_author_notification_button);
        this.f = (ImageView) inflate.findViewById(R.id.video_author_notification_icon);
        this.g = (ImageView) inflate.findViewById(R.id.video_author_notification_chevron_icon);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            layoutParams.height = -2;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
