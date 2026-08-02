package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: GroupItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class hlu extends vfz<glu> {
    public static final int q = iah0.a(16);
    public static final int r = iah0.a(296);
    public static final int s = iah0.a(8);
    public static final int t = iah0.a(40);
    public final izs<UserId, s3q0> l;
    public final VkAvatar m;
    public final TextView n;
    public final ImageView o;
    public glu p;

    public hlu(ViewGroup viewGroup, c2u c2uVar) {
        super(R.layout.products_multipicker_item_groups_tab, viewGroup);
        this.l = c2uVar;
        VkAvatar vkAvatar = (VkAvatar) this.itemView.findViewById(R.id.group_image);
        this.m = vkAvatar;
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (ImageView) this.itemView.findViewById(R.id.is_selected_icon);
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = r;
        view.setLayoutParams(layoutParams);
        View view2 = this.itemView;
        int i = q;
        view2.setPadding(i, 0, i, 0);
        f4m.t(s, this.itemView);
        ViewGroup.LayoutParams layoutParams2 = vkAvatar.getLayoutParams();
        int i2 = t;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        vkAvatar.setLayoutParams(layoutParams2);
        f4m.s(0, vkAvatar);
        this.itemView.setBackgroundResource(R.drawable.highlight_radius_4);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(glu gluVar) {
        glu gluVar2 = gluVar;
        this.p = gluVar2;
        ArrayList arrayList = gluVar2.c.b;
        int i = t;
        ImageSize imageSize = (ImageSize) ixj0.c(arrayList, i, i);
        String str = imageSize != null ? imageSize.d.d : null;
        if (str == null) {
            str = "";
        }
        c.d dVar = new c.d(str, null);
        VkAvatar vkAvatar = this.m;
        vkAvatar.setContent(dVar);
        vkAvatar.setPlaceholderColor(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext()));
        this.o.setVisibility(gluVar2.e ? 0 : 8);
        this.n.setText(gluVar2.d);
        jjc.g(this.itemView, new cvh(this, 14));
        if (getAbsoluteAdapterPosition() == (getBindingAdapter() != null ? r4.getItemCount() - 1 : -1)) {
            f4m.v(s, this.itemView);
        }
    }
}
