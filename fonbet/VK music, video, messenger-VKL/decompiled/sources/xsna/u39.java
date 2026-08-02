package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;
import xsna.cq5;

/* compiled from: CallFromUserViewTypeDelegate.kt */
/* loaded from: classes7.dex */
public final class u39 extends p1u0<t39> {
    public final y89 a;

    /* compiled from: CallFromUserViewTypeDelegate.kt */
    public static final class a extends nfz<t39> {
        public final VoipAvatarViewContainer m;
        public final AppCompatTextView n;
        public final ImageView o;

        public a(y89 y89Var, ViewGroup viewGroup) {
            super(R.layout.voip_item_user_selectable, viewGroup);
            this.m = (VoipAvatarViewContainer) this.itemView.findViewById(R.id.voip_caller_image);
            this.n = (AppCompatTextView) this.itemView.findViewById(R.id.voip_username);
            this.o = (ImageView) this.itemView.findViewById(R.id.voip_icon_selected);
            jjc.g(this.itemView, new ku1(4, y89Var, this));
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(hfz hfzVar) {
            t39 t39Var = (t39) hfzVar;
            this.l = t39Var;
            this.m.a(t39Var.d, t39Var.e ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE, cq5.b.a);
            this.n.setText(t39Var.c);
            this.o.setVisibility(t39Var.g ? 0 : 8);
        }
    }

    public u39(y89 y89Var) {
        this.a = y89Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends t39> b(ViewGroup viewGroup) {
        return new a(this.a, viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof t39;
    }
}
