package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vkontakte.android.R;
import xsna.d2l0;

/* compiled from: MsgPartStickerHolder.kt */
/* loaded from: classes2.dex */
public final class rt30 extends hr30<AttachSticker, st30> implements d2l0.a {
    public static final /* synthetic */ int l = 0;
    public final View d;
    public final Context e;
    public final ImStickerView f;
    public final TimeAndStatusView g;
    public final bpn0 h;
    public st30 i;
    public pk30 j;
    public d2l0 k;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            rt30 rt30Var = rt30.this;
            pk30 pk30Var = rt30Var.j;
            st30 st30Var = rt30Var.i;
            Msg msg = st30Var != null ? st30Var.n : null;
            Attach attach = st30Var != null ? st30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, st30Var != null ? st30Var.o : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            rt30 rt30Var = rt30.this;
            pk30 pk30Var = rt30Var.j;
            st30 st30Var = rt30Var.i;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = st30Var != null ? st30Var.n : null;
            Attach attach = st30Var != null ? st30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, st30Var != null ? st30Var.o : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public rt30(View view) {
        this.d = view;
        Context context = view.getContext();
        this.e = context;
        ImStickerView imStickerView = (ImStickerView) view.findViewById(R.id.image);
        this.f = imStickerView;
        this.g = (TimeAndStatusView) view.findViewById(R.id.timeAndStatus);
        this.h = new bpn0(new p6y(this, 6));
        imStickerView.setPlaceholder(new ek30(context, 0));
        jjc.g(imStickerView, new a());
        imStickerView.setOnLongClickListener(new b());
    }

    @Override // xsna.d2l0.a
    public final void g(StickerAnimationState stickerAnimationState) {
        this.f.setAnimationState(stickerAnimationState);
    }

    @Override // xsna.hr30
    public final void p(st30 st30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        st30 st30Var2 = st30Var;
        this.j = pk30Var;
        this.i = st30Var2;
        d2l0 d2l0Var = st30Var2.f;
        if (d2l0Var != null) {
            d2l0Var.a(this);
            this.k = d2l0Var;
        }
        ColorFilter colorFilter = (ColorFilter) this.h.getValue();
        d2l0 d2l0Var2 = this.k;
        ImStickerView imStickerView = this.f;
        rte0.y(imStickerView, colorFilter, st30Var2, d2l0Var2);
        ImStickerView.b(imStickerView, st30Var2.l, new na7(19, st30Var2, pk30Var), 2);
        ViewGroup.LayoutParams layoutParams = imStickerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = st30Var2.e ? 3 : 5;
        imStickerView.setLayoutParams(layoutParams2);
        hr30.l(this.g, st30Var2.c, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.d;
    }

    @Override // xsna.hr30
    public final void r() {
        this.j = null;
        this.i = null;
        d2l0 d2l0Var = this.k;
        if (d2l0Var != null) {
            d2l0Var.b(this);
        }
        this.k = null;
    }
}
