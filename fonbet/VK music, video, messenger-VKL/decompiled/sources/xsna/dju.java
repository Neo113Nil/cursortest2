package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: GroupCardWithBottomBtnVcImpl.kt */
/* loaded from: classes5.dex */
public final class dju {
    public static final int i = cn70.b(160);
    public final View a;
    public final VKImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final VkSimpleButton f;
    public final PhotoStackView g;
    public final ImageView h;

    public dju(View view) {
        this.a = view;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
        vKImageView.setClipToOutline(true);
        vKImageView.setOutlineProvider(new s0w0(cn70.a() * 12.0f, 6));
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        this.b = vKImageView;
        this.c = (TextView) view.findViewById(R.id.title);
        this.d = (TextView) view.findViewById(R.id.subtitle);
        this.e = (TextView) view.findViewById(R.id.text);
        this.f = (VkSimpleButton) view.findViewById(R.id.button);
        PhotoStackView photoStackView = (PhotoStackView) view.findViewById(R.id.photo_stack);
        photoStackView.setOverlapOffset(0.8f);
        photoStackView.setMarginBetweenImages(cn70.a() * 0.5f);
        this.g = photoStackView;
        this.h = (ImageView) view.findViewById(R.id.icon);
    }
}
