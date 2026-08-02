package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkImage;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import com.vkontakte.android.R;
import xsna.cq5;
import xsna.o0r0;

/* compiled from: AllReactionsViewHolder.kt */
/* loaded from: classes4.dex */
public final class su1 extends RecyclerView.e0 implements View.OnClickListener {
    public final VkCell l;
    public b.a m;

    /* compiled from: AllReactionsViewHolder.kt */
    public static final class a implements VkCell.d {
        public final FrameLayout a;
        public final VkAvatar b;
        public final VkImage c;

        public a(Context context) {
            VkAvatar vkAvatar = new VkAvatar(context, null, 6, 0);
            vkAvatar.setId(R.id.reaction_list_item_avatar_tag);
            int k = VkCell.Left.Main.Size.Small.k(context);
            vkAvatar.setLayoutParams(new FrameLayout.LayoutParams(k, k, 17));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            vkAvatar.setScaleType(scaleType);
            this.b = vkAvatar;
            VkImage vkImage = new VkImage(context, null, 6, 0);
            vkImage.setId(R.id.reaction_list_item_badge_tag);
            int b = cn70.b(20);
            vkImage.setLayoutParams(new FrameLayout.LayoutParams(b, b, 85));
            vkImage.setScaleType(scaleType);
            vkImage.setVisibility(8);
            this.c = vkImage;
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            VkAvatar vkAvatar2 = this.b;
            frameLayout.addView(vkAvatar2 == null ? null : vkAvatar2);
            VkImage vkImage2 = this.c;
            frameLayout.addView(vkImage2 != null ? vkImage2 : null);
            this.a = frameLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                kr5 kr5Var = cVar.a;
                VkAvatar vkAvatar = this.b;
                if (vkAvatar == null) {
                    vkAvatar = null;
                }
                String b = kr5Var.b(vkAvatar.getMeasuredWidth());
                Drawable drawable = kr5Var.c;
                cq5 cq5Var = kr5Var.b;
                hdu0 odu0Var = epx.f(cq5Var, cq5.h.a) ? new odu0() : epx.f(cq5Var, cq5.g.a) ? new ndu0() : null;
                VkAvatar vkAvatar2 = this.b;
                if (vkAvatar2 == null) {
                    vkAvatar2 = null;
                }
                vkAvatar2.setEmptyImagePlaceholder(drawable);
                VkAvatar vkAvatar3 = this.b;
                if (vkAvatar3 == null) {
                    vkAvatar3 = null;
                }
                vkAvatar3.o0(b, null);
                VkAvatar vkAvatar4 = this.b;
                if (vkAvatar4 == null) {
                    vkAvatar4 = null;
                }
                vkAvatar4.setBorder(odu0Var);
                String str = cVar.b;
                if (str != null) {
                    VkImage vkImage = this.c;
                    if (vkImage == null) {
                        vkImage = null;
                    }
                    vkImage.o0(str, null);
                }
                VkImage vkImage2 = this.c;
                f4m.E(vkImage2 != null ? vkImage2 : null, str != null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: AllReactionsViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: AllReactionsViewHolder.kt */
    public static final class c implements VkCell.f {
        public final kr5 a;
        public final String b;

        public c(kr5 kr5Var, String str) {
            this.a = kr5Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AvatarViewParams(avatarImageConfig=");
            sb.append(this.a);
            sb.append(", reactionUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public su1(ViewGroup viewGroup) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainAvatarController(new b());
        VkCell vkCell2 = (VkCell) this.itemView;
        vkCell2.setOnClickListener(this);
        int b2 = cn70.b(4);
        f4m.B(b2, b2, vkCell2);
        this.l = vkCell2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.a aVar;
        if (jjc.b() || (aVar = this.m) == null) {
            return;
        }
        xwk.e().m(this.itemView.getContext(), aVar.a.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
