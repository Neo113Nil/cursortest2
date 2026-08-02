package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: MessageViewsUserItemDelegate.kt */
/* loaded from: classes2.dex */
public final class ad20 extends p1u0<yc20> {
    public final cd20 a;

    /* compiled from: MessageViewsUserItemDelegate.kt */
    public static final class a extends vfz<yc20> {
        public final View l;
        public final b m;
        public final AvatarView n;
        public final TextView o;

        public a(View view, cd20 cd20Var) {
            super(view);
            this.l = view;
            this.m = cd20Var;
            this.n = (AvatarView) view.findViewById(R.id.im_avatar);
            this.o = (TextView) view.findViewById(R.id.im_name);
        }

        @Override // xsna.vfz
        public final void W5(yc20 yc20Var) {
            yc20 yc20Var2 = yc20Var;
            qtd0 qtd0Var = yc20Var2.b;
            this.n.Y0(qtd0Var);
            this.o.setText(qtd0Var.name());
            this.l.setOnClickListener(new zc20(this, yc20Var2, 0));
        }
    }

    /* compiled from: MessageViewsUserItemDelegate.kt */
    public interface b {
        void A(qtd0 qtd0Var);
    }

    public ad20(cd20 cd20Var) {
        this.a = cd20Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends yc20> b(ViewGroup viewGroup) {
        return new a(tf3.b(viewGroup, R.layout.im_message_views_user_item, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof yc20;
    }
}
