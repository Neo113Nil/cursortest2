package xsna;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vkontakte.android.R;

/* compiled from: MsgPartWallPostButtonHolder.kt */
/* loaded from: classes2.dex */
public final class mu30 extends hr30<AttachWall, nu30> {
    public TextView d;
    public pk30 e;
    public nu30 f;
    public final v5t g = new v5t(R.layout.vkim_msg_part_wall_post_button);

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            mu30 mu30Var = mu30.this;
            pk30 pk30Var = mu30Var.e;
            nu30 nu30Var = mu30Var.f;
            Msg msg = nu30Var != null ? nu30Var.c : null;
            Attach attach = nu30Var != null ? nu30Var.e : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, nu30Var != null ? nu30Var.d : null);
            }
            return s3q0.a;
        }
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        Drawable background = textView.getBackground();
        if (background != null) {
            sjo.a(background, i, e3m.d(R.attr.im_msg_part_button_outline_stroke_width, textView.getContext()));
        }
    }

    @Override // xsna.hr30
    public final void p(nu30 nu30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        this.f = nu30Var;
        this.e = pk30Var;
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        TextView textView = (TextView) this.g.c(layoutInflater, viewGroup);
        this.d = textView;
        if (textView == null) {
            textView = null;
        }
        jjc.g(textView, new a());
        TextView textView2 = this.d;
        if (textView2 == null) {
            return null;
        }
        return textView2;
    }

    @Override // xsna.hr30
    public final void r() {
        this.e = null;
        this.f = null;
    }
}
