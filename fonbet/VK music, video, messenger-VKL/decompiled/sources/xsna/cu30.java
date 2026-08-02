package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vkontakte.android.R;
import xsna.d2l0;

/* compiled from: MsgPartUgcStickerHolder.kt */
/* loaded from: classes2.dex */
public final class cu30 extends hr30<AttachUgcSticker, du30> implements d2l0.a {
    public static final /* synthetic */ int m = 0;
    public final View d;
    public final Context e;
    public final ImStickerView f;
    public final TimeAndStatusView g;
    public final ImageView h;
    public final bpn0 i;
    public pk30 j;
    public du30 k;
    public d2l0 l;

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            cu30 cu30Var = cu30.this;
            pk30 pk30Var = cu30Var.j;
            du30 du30Var = cu30Var.k;
            Msg msg = du30Var != null ? du30Var.n : null;
            Attach attach = du30Var != null ? du30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, du30Var != null ? du30Var.o : null);
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
            cu30 cu30Var = cu30.this;
            pk30 pk30Var = cu30Var.j;
            du30 du30Var = cu30Var.k;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = du30Var != null ? du30Var.n : null;
            Attach attach = du30Var != null ? du30Var.p : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, du30Var != null ? du30Var.o : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public cu30(View view) {
        this.d = view;
        Context context = view.getContext();
        this.e = context;
        ImStickerView imStickerView = (ImStickerView) view.findViewById(R.id.image);
        this.f = imStickerView;
        this.g = (TimeAndStatusView) view.findViewById(R.id.timeAndStatus);
        this.h = (ImageView) view.findViewById(R.id.ugcStickerIcon);
        this.i = new bpn0(new pvh(this, 20));
        imStickerView.setPlaceholder(new ek30(context, 0));
        jjc.g(imStickerView, new a());
        imStickerView.setOnLongClickListener(new b());
    }

    @Override // xsna.d2l0.a
    public final void g(StickerAnimationState stickerAnimationState) {
        this.f.setAnimationState(stickerAnimationState);
    }

    @Override // xsna.hr30
    public final void p(du30 du30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        du30 du30Var2 = du30Var;
        this.j = pk30Var;
        this.k = du30Var2;
        d2l0 d2l0Var = du30Var2.e;
        if (d2l0Var != null) {
            d2l0Var.a(this);
            this.l = d2l0Var;
        }
        ColorFilter colorFilter = (ColorFilter) this.i.getValue();
        d2l0 d2l0Var2 = this.l;
        ImStickerView imStickerView = this.f;
        rte0.y(imStickerView, colorFilter, du30Var2, d2l0Var2);
        ImStickerView.b(imStickerView, du30Var2.j, new w7u(du30Var2, 14), 2);
        ImageView imageView = this.h;
        imageView.setVisibility(0);
        boolean z = du30Var2.f;
        int b2 = cn70.b(24);
        ViewGroup.LayoutParams layoutParams = imStickerView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (z) {
            layoutParams2.setMarginEnd(b2);
            layoutParams2.setMarginStart(cn70.b(0));
        } else {
            layoutParams2.setMarginEnd(cn70.b(0));
            layoutParams2.setMarginStart(b2);
        }
        imStickerView.setLayoutParams(layoutParams2);
        TimeAndStatusView timeAndStatusView = this.g;
        ViewGroup.LayoutParams layoutParams3 = timeAndStatusView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        if (!z) {
            b2 = cn70.b(0);
        }
        layoutParams4.setMarginEnd(b2);
        timeAndStatusView.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        layoutParams6.gravity = (z ? 8388613 : 8388611) | 80;
        imageView.setLayoutParams(layoutParams6);
        hr30.l(timeAndStatusView, du30Var2.c, true);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.d;
    }

    @Override // xsna.hr30
    public final void r() {
        this.j = null;
        this.k = null;
        d2l0 d2l0Var = this.l;
        if (d2l0Var != null) {
            d2l0Var.b(this);
        }
        this.l = null;
    }
}
