package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.c;
import com.vkontakte.android.R;

/* compiled from: MentionAdapter.kt */
/* loaded from: classes3.dex */
public final class p320 extends RecyclerView.e0 {
    public final fgh l;
    public final VkCell m;

    /* compiled from: MentionAdapter.kt */
    public static final class a implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: MentionAdapter.kt */
    public static final class b implements VkCell.d {
        public final VkAvatar a;

        public b(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, bwt0.t(context)));
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                this.a.setContent(new c.d(cVar.a, null));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: MentionAdapter.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
        }
    }

    public p320(ViewGroup viewGroup, fgh fghVar) {
        super(tf3.b(viewGroup, R.layout.mention_item_holder, viewGroup, false));
        this.l = fghVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.mention_vkcell);
        vkCell.setLeftMainAvatarController(new a());
        this.m = vkCell;
    }
}
