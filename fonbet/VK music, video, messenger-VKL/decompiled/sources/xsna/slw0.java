package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.im.ImageList;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cq5;
import xsna.imw0;
import xsna.tlo0;

/* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
/* loaded from: classes7.dex */
public final class slw0 extends vfz<imw0.a.d> {
    public static final int n = cn70.b(4);
    public final hmw0<gmw0> l;
    public final VkCell m;

    /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
    public static final class a implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new b(context);
        }
    }

    /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
    public static final class b implements VkCell.d {
        public final VKAvatarView a;

        /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
        public interface a {

            /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
            /* renamed from: xsna.slw0$b$a$a, reason: collision with other inner class name */
            public static final class C3676a implements a {
                public final LayerDrawable a;

                public C3676a(LayerDrawable layerDrawable) {
                    this.a = layerDrawable;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3676a) && this.a.equals(((C3676a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Anonym(avatar=" + this.a + ')';
                }
            }

            /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
            /* renamed from: xsna.slw0$b$a$b, reason: collision with other inner class name */
            public static final class C3677b implements a {
                public final ImageList a;
                public final boolean b;

                public C3677b(ImageList imageList, boolean z) {
                    this.a = imageList;
                    this.b = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3677b)) {
                        return false;
                    }
                    C3677b c3677b = (C3677b) obj;
                    return epx.f(this.a, c3677b.a) && this.b == c3677b.b;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.b) + (this.a.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Group(avatar=");
                    sb.append(this.a);
                    sb.append(", imageIsNft=");
                    return defpackage.q0.a(sb, this.b, ')');
                }
            }

            /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
            public static final class c implements a {
                public final ImageList a;
                public final boolean b;
                public final com.vk.im.ui.views.avatars.a c;

                public c(ImageList imageList, boolean z, com.vk.im.ui.views.avatars.a aVar) {
                    this.a = imageList;
                    this.b = z;
                    this.c = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c.equals(cVar.c);
                }

                public final int hashCode() {
                    return this.c.hashCode() + qoy.b(this.a.b.hashCode() * 31, 31, this.b);
                }

                public final String toString() {
                    return "User(avatar=" + this.a + ", imageIsNft=" + this.b + ", placeHolder=" + this.c + ')';
                }
            }
        }

        public b(Context context) {
            this.a = new VKAvatarView(context, null, 6, 0);
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                a aVar = cVar.a;
                boolean z = aVar instanceof a.c;
                VKAvatarView vKAvatarView = this.a;
                if (z) {
                    vKAvatarView.setPadding(0, 0, 0, 0);
                    a.c cVar2 = (a.c) aVar;
                    AvatarBorderType avatarBorderType = cVar2.b ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
                    com.vk.im.ui.views.avatars.a aVar2 = cVar2.c;
                    cq5.b bVar = cq5.b.a;
                    far0 far0Var = vKAvatarView.m;
                    zjt<?> zjtVar = far0Var.a;
                    ear0.d(far0Var, avatarBorderType, bVar, 4);
                    zjtVar.setPlaceholderImage(aVar2);
                    zjtVar.load(((a.c) aVar).a.Hb(far0Var.i.b));
                    return;
                }
                if (!(aVar instanceof a.C3677b)) {
                    if (!(aVar instanceof a.C3676a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i = slw0.n;
                    vKAvatarView.setPadding(i, i, i, i);
                    vKAvatarView.setImageDrawable(((a.C3676a) aVar).a);
                    return;
                }
                vKAvatarView.setPadding(0, 0, 0, 0);
                AvatarBorderType avatarBorderType2 = ((a.C3677b) aVar).b ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
                cq5.b bVar2 = cq5.b.a;
                far0 far0Var2 = vKAvatarView.m;
                zjt<?> zjtVar2 = far0Var2.a;
                ear0.d(far0Var2, avatarBorderType2, bVar2, 4);
                zjtVar2.load(((a.C3677b) aVar).a.Hb(far0Var2.i.b));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: VoipChangeCurrentUserItemViewHolder.kt */
    public static final class c implements VkCell.f {
        public final b.a a;

        public c(b.a aVar) {
            this.a = aVar;
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
            return "AvatarViewParams(avatar=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public slw0(ViewGroup viewGroup, hmw0<? super gmw0> hmw0Var) {
        super(r0);
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkCell.setLeftMainViewController(new a());
        vkCell.setId(R.id.voip_change_current_user_item);
        this.l = hmw0Var;
        this.m = (VkCell) this.itemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(imw0.a.d dVar) {
        b.a c3676a;
        String string;
        int i;
        imw0.a.d dVar2 = dVar;
        VkCell.Left.a aVar = VkCell.Left.Companion;
        boolean z = dVar2 instanceof imw0.a.d.b;
        if (z) {
            imw0.a.d.b bVar = (imw0.a.d.b) dVar2;
            c3676a = new b.a.c(bVar.d, bVar.e, new com.vk.im.ui.views.avatars.a(this.itemView.getContext(), bVar.c, 2));
        } else if (dVar2 instanceof imw0.a.d.c) {
            imw0.a.d.c cVar = (imw0.a.d.c) dVar2;
            c3676a = new b.a.C3677b(cVar.d, cVar.e);
        } else {
            if (!(dVar2 instanceof imw0.a.d.C3066a)) {
                throw new NoWhenBranchMatchedException();
            }
            Drawable a2 = m33.a(R.drawable.bg_anonym_avatar, this.itemView.getContext());
            LayerDrawable layerDrawable = (LayerDrawable) (a2 != null ? a2.mutate() : null);
            layerDrawable.findDrawableByLayerId(R.id.voip_anonym_icon_incognito_layer).setTint(this.itemView.getContext().getColor(R.color.vk_steel_gray_150));
            c3676a = new b.a.C3676a(layerDrawable);
        }
        c cVar2 = new c(c3676a);
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        int k = size.k(this.itemView.getContext());
        int i2 = n;
        VkCell.Left.b a3 = VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(cVar2, new Size(k + i2, size.k(this.itemView.getContext()) + i2)));
        VkCell vkCell = this.m;
        vkCell.setLeft(a3);
        if (z) {
            string = ((imw0.a.d.b) dVar2).f;
        } else if (dVar2 instanceof imw0.a.d.c) {
            string = ((imw0.a.d.c) dVar2).f;
        } else {
            if (!(dVar2 instanceof imw0.a.d.C3066a)) {
                throw new NoWhenBranchMatchedException();
            }
            string = b6().getString(R.string.voip_change_name_anonym_title);
        }
        if (z) {
            i = R.string.voip_change_name_profile_description;
        } else if (dVar2 instanceof imw0.a.d.c) {
            i = R.string.voip_change_name_group_desription;
        } else {
            if (!(dVar2 instanceof imw0.a.d.C3066a)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.voip_change_name_anonym_description;
        }
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, string), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(i), (gzs) (0 == true ? 1 : 0), 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
        vkCell.setRight(dVar2.p() ? VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_check_circle_on_28), (k1u0) null, (Size) null, (tlo0) null, false, (gzs) null, 62), null, null, 29) : null);
        jjc.g(this.itemView, new qum0(5, this, dVar2));
    }
}
