package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.stickers.views.sticker.StickerAnimationState;
import com.vkontakte.android.R;
import xsna.d2l0;
import xsna.g34;

/* compiled from: MsgPartPopupStickerHolder.kt */
/* loaded from: classes2.dex */
public final class bt30 extends hr30<AttachSticker, ct30> implements d2l0.a, g34.a {
    public static final /* synthetic */ int q = 0;
    public final View d;
    public final Context e;
    public final ImStickerView f;
    public final TimeAndStatusView g;
    public final ImageView h;
    public final FrameLayout i;
    public final bpn0 j;
    public pk30 k;
    public ct30 l;
    public g34 m;
    public d2l0 n;
    public final ProgressBar o;
    public final ObjectAnimator p;

    /* compiled from: MsgPartPopupStickerHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            bt30.this.p.start();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            bt30.this.p.end();
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class b implements izs<View, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            bt30 bt30Var = bt30.this;
            pk30 pk30Var = bt30Var.k;
            ct30 ct30Var = bt30Var.l;
            Msg msg = ct30Var != null ? ct30Var.p : null;
            Attach attach = ct30Var != null ? ct30Var.r : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ct30Var != null ? ct30Var.q : null);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class c implements View.OnLongClickListener {
        public c() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            bt30 bt30Var = bt30.this;
            pk30 pk30Var = bt30Var.k;
            ct30 ct30Var = bt30Var.l;
            Boolean bool = null;
            bool = null;
            bool = null;
            Msg msg = ct30Var != null ? ct30Var.p : null;
            Attach attach = ct30Var != null ? ct30Var.r : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.X(attach, msg, ct30Var != null ? ct30Var.q : null);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    public bt30(View view) {
        this.d = view;
        Context context = view.getContext();
        this.e = context;
        ImStickerView imStickerView = (ImStickerView) view.findViewById(R.id.image);
        this.f = imStickerView;
        this.g = (TimeAndStatusView) view.findViewById(R.id.timeAndStatus);
        this.h = (ImageView) view.findViewById(R.id.popupStickerIcon);
        this.i = (FrameLayout) view.findViewById(R.id.popupStickerIconContainer);
        this.j = new bpn0(new t2l(this, 22));
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.loader);
        this.o = progressBar;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -3.0f, 3.0f);
        ofFloat.setDuration(125L);
        ofFloat.setRepeatCount(3);
        ofFloat.setRepeatMode(2);
        ofFloat.setStartDelay(300L);
        this.p = ofFloat;
        imStickerView.setPlaceholder(new ek30(context, 0));
        jjc.g(imStickerView, new b());
        imStickerView.setOnLongClickListener(new c());
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // xsna.g34.a
    public final void c(int i) {
        this.h.setVisibility(0);
        f4m.j(this.o);
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
        f4m.j(this.h);
        this.o.setVisibility(0);
    }

    @Override // xsna.g34.a
    public final void f(int i) {
        this.h.setVisibility(0);
        f4m.j(this.o);
    }

    @Override // xsna.d2l0.a
    public final void g(StickerAnimationState stickerAnimationState) {
        this.f.setAnimationState(stickerAnimationState);
    }

    @Override // xsna.hr30
    public final void p(ct30 ct30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        int i;
        ct30 ct30Var2 = ct30Var;
        this.k = pk30Var;
        this.l = ct30Var2;
        g34 g34Var = ct30Var2.m;
        this.m = g34Var;
        if (g34Var != null) {
            g34Var.a(ct30Var2.n, this);
        }
        d2l0 d2l0Var = ct30Var2.f;
        if (d2l0Var != null) {
            d2l0Var.a(this);
            this.n = d2l0Var;
        }
        ColorFilter colorFilter = (ColorFilter) this.j.getValue();
        d2l0 d2l0Var2 = this.n;
        ImStickerView imStickerView = this.f;
        rte0.y(imStickerView, colorFilter, ct30Var2, d2l0Var2);
        ImStickerView.b(imStickerView, ct30Var2.l, new g1j(ct30Var2, 28), 2);
        this.h.setImageResource(R.drawable.vk_icon_sticker_smile_outline_20);
        jr30 jr30Var = ct30Var2.c;
        TimeAndStatusView timeAndStatusView = this.g;
        hr30.l(timeAndStatusView, jr30Var, true);
        boolean z = ct30Var2.e;
        int b2 = cn70.b(32);
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
        FrameLayout frameLayout = this.i;
        ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
        if (z) {
            if (timeAndStatusView.getVisibility() != 0) {
                f4m.x(cn70.b(10), frameLayout);
                f4m.w(cn70.b(2), frameLayout);
            } else {
                f4m.x(cn70.b(4), frameLayout);
                f4m.w(cn70.b(8), frameLayout);
            }
            i = 8388613;
        } else {
            f4m.x(cn70.b(8), frameLayout);
            f4m.w(cn70.b(4), frameLayout);
            i = 8388611;
        }
        layoutParams6.gravity = i | 80;
        frameLayout.setLayoutParams(layoutParams6);
        ProgressBar progressBar = this.o;
        ViewGroup.LayoutParams layoutParams7 = progressBar.getLayoutParams();
        if (layoutParams7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
        layoutParams8.gravity = (z ? 8388613 : 8388611) | 80;
        progressBar.setLayoutParams(layoutParams8);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        jjc.g(this.i, new nt10(this, 3));
        a aVar = new a();
        View view = this.d;
        view.addOnAttachStateChangeListener(aVar);
        return view;
    }

    @Override // xsna.hr30
    public final void r() {
        ct30 ct30Var = this.l;
        if (ct30Var != null) {
            int i = ct30Var.n;
            g34 g34Var = this.m;
            if (g34Var != null) {
                g34Var.a(i, null);
            }
        }
        this.m = null;
        d2l0 d2l0Var = this.n;
        if (d2l0Var != null) {
            d2l0Var.b(this);
        }
        this.n = null;
        this.k = null;
        this.l = null;
    }
}
