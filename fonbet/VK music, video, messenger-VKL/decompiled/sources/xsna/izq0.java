package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import xsna.o0r0;

/* compiled from: UserRepostViewHolder.kt */
/* loaded from: classes4.dex */
public final class izq0 extends RecyclerView.e0 implements View.OnClickListener {
    public final VkCell l;
    public b.c m;

    /* compiled from: UserRepostViewHolder.kt */
    public static final class a implements VkCell.d {
        public final VKAvatarView a;

        public a(Context context) {
            VKAvatarView vKAvatarView = new VKAvatarView(context, null, 6, 0);
            int k = VkCell.Left.Main.Size.Medium.k(context);
            vKAvatarView.setLayoutParams(new ViewGroup.LayoutParams(k, k));
            vKAvatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.a = vKAvatarView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                this.a.Y0(cVar.a);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: UserRepostViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: UserRepostViewHolder.kt */
    public static final class c implements VkCell.f {
        public final kr5 a;

        public c(kr5 kr5Var) {
            this.a = kr5Var;
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
            return "AvatarViewParams(avatarImageConfig=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public izq0(ViewGroup viewGroup) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainAvatarController(new b());
        VkCell vkCell2 = (VkCell) this.itemView;
        vkCell2.setOnClickListener(this);
        this.l = vkCell2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b.c cVar;
        if (jjc.b() || (cVar = this.m) == null) {
            return;
        }
        xwk.e().m(this.itemView.getContext(), cVar.a.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
    }
}
