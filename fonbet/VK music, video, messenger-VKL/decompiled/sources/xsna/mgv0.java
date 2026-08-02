package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vkontakte.android.R;

/* compiled from: VkRestoreSearchAdapter.kt */
/* loaded from: classes5.dex */
public final class mgv0 extends RecyclerView.e0 {
    public final TextView l;
    public final TextView m;
    public final VKImageController<View> n;
    public final int o;
    public final VKImageController.b p;
    public WebUserShortInfo q;

    public mgv0(ViewGroup viewGroup, o99 o99Var) {
        super(tf3.b(viewGroup, R.layout.vk_restore_search_user_item_sdk, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.title);
        this.m = (TextView) this.itemView.findViewById(R.id.subtitle);
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
        this.n = create;
        this.o = e3m.a(R.dimen.vk_small_photo_size, this.itemView.getContext());
        this.p = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, R.drawable.vk_user_placeholder_icon_64, null, Integer.valueOf(e3m.f(R.attr.vk_ui_image_placeholder, this.itemView.getContext())), null, null, iah0.a(0.5f), e3m.f(R.attr.vk_ui_image_border_alpha, this.itemView.getContext()), null, null, null, 63915);
        f4m.j(this.itemView.findViewById(R.id.online));
        f4m.j(this.itemView.findViewById(R.id.verified));
        ((VKReplacerView) this.itemView.findViewById(R.id.photo)).a(((com.vk.core.ui.image.c) create).getView());
        this.itemView.setOnClickListener(new l38(2, this, o99Var));
    }
}
