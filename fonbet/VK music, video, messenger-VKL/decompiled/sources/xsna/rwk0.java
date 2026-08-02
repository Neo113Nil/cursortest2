package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;

/* compiled from: StaticAdsItemViewContainer.kt */
/* loaded from: classes17.dex */
public final class rwk0 {
    public final FrameLayout a;
    public final VKImageController<ImageView> b;

    public rwk0(View view, bcr0<? extends ImageView> bcr0Var) {
        this.a = (FrameLayout) view.findViewById(R.id.fullscreen_static_ads_container);
        VKImageController create = bcr0Var.create(view.getContext());
        ((VKReplacerView) view.findViewById(R.id.fullscreen_static_ads_content)).a(((com.vk.core.ui.image.c) create).getView());
        this.b = create;
    }
}
