package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: BonusHistoryIconViewController.kt */
/* loaded from: classes5.dex */
public final class el7 implements VkCell.d {
    public final View a;
    public final VKImageView b;
    public final ImageView c;

    /* compiled from: BonusHistoryIconViewController.kt */
    public static final class a implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new el7(context);
        }
    }

    /* compiled from: BonusHistoryIconViewController.kt */
    public static final class b implements VkCell.f {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("HistoryIconParams(imageUrl="), this.a, ')');
        }
    }

    public el7(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.stickers_bonus_history_item_image, (ViewGroup) null);
        this.a = inflate;
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.icon);
        if (vKImageView != null) {
            vKImageView.setPlaceholderImage(R.drawable.shape_bonus_history_placenolder_icon);
        }
        this.b = vKImageView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon_placeholder);
        if (imageView != null) {
            omw.d(imageView, R.drawable.vk_icon_recent_outline_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
        }
        this.c = imageView;
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final void a(VkCell.f fVar) {
        b bVar = fVar instanceof b ? (b) fVar : null;
        if (bVar == null) {
            return;
        }
        String str = bVar.a;
        ImageView imageView = this.c;
        VKImageView vKImageView = this.b;
        if (str == null) {
            if (vKImageView != null) {
                vKImageView.load(null);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (vKImageView != null) {
            vKImageView.load(str);
        }
        if (imageView != null) {
            f4m.j(imageView);
        }
    }

    @Override // com.vk.core.view.components.cell.VkCell.d
    public final View getView() {
        return this.a;
    }
}
