package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ClipsGridChallengeRuleViewHolder.kt */
/* loaded from: classes17.dex */
public final class ice extends RecyclerView.e0 {
    public final VkCell l;

    /* compiled from: ClipsGridChallengeRuleViewHolder.kt */
    public static final class a implements VkCell.d {
        public final VKImageView a;

        public a(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setPadding(cn70.b(6), cn70.b(6), cn70.b(6), cn70.b(6));
            omw.b(vKImageView, R.attr.vk_ui_icon_accent);
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if (fVar instanceof b) {
                this.a.o0(((b) fVar).a, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ClipsGridChallengeRuleViewHolder.kt */
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
            return ho8.a(new StringBuilder("ChallengeRuleIconViewParams(iconUrl="), this.a, ')');
        }
    }

    /* compiled from: ClipsGridChallengeRuleViewHolder.kt */
    public static final class c implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    public ice(ViewGroup viewGroup) {
        super(new VkCell(viewGroup.getContext(), null, 6, 0));
        VkCell vkCell = (VkCell) this.itemView;
        vkCell.setLeftMainPictureController(new c());
        this.l = vkCell;
    }
}
