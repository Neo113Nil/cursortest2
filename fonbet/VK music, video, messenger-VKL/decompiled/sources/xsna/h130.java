package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.impl.postmodal.reactions.donut.ModalPostDonutFragment;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ModalPostDonutUserViewHolder.kt */
/* loaded from: classes4.dex */
public final class h130 extends vif0<z030> {
    public final a130 n;
    public final VkCell o;

    /* compiled from: ModalPostDonutUserViewHolder.kt */
    public static final class a implements VkCell.d {
        public final VkAvatar a;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            int k = VkCell.Left.Main.Size.Small.k(context);
            vkAvatar.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            vkAvatar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vkAvatar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                String str = cVar.a;
                VkAvatar vkAvatar = this.a;
                vkAvatar.setBorder(null);
                vkAvatar.o0(str, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: ModalPostDonutUserViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: ModalPostDonutUserViewHolder.kt */
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
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUrl="), this.a, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h130(ViewGroup viewGroup, ModalPostDonutFragment.b bVar) {
        super(r1, viewGroup);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainAvatarController(new b());
        this.n = bVar;
        VkCell vkCell2 = (VkCell) this.itemView;
        int b2 = cn70.b(4);
        f4m.B(b2, b2, vkCell2);
        this.o = vkCell2;
    }

    @Override // xsna.vif0
    public final void i6(z030 z030Var) {
        String str;
        UserId userId;
        z030 z030Var2 = z030Var;
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Small;
        UserProfile userProfile = z030Var2.b;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(userProfile != null ? userProfile.u(size.k(this.itemView.getContext())) : null), size));
        VkCell vkCell = this.o;
        vkCell.setLeft(a2);
        if (userProfile == null || (str = userProfile.e) == null) {
            str = "";
        }
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        VkCell.Right.c cVar = VkCell.Right.Companion;
        tlo0.h hVar = new tlo0.h(this.itemView.getContext().getString(R.string.modal_post_donut_user, z030Var2.c));
        vkCell.setRight(VkCell.Right.c.a(cVar, new VkCell.Right.a.e(hVar, hVar), null, null, null, 30));
        if (userProfile == null || (userId = userProfile.c) == null) {
            return;
        }
        this.itemView.setOnClickListener(new dh0(3, this, userId));
    }
}
