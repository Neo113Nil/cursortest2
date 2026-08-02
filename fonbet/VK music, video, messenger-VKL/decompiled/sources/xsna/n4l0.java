package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.views.VKStickerCachedImageView;
import com.vk.stickers.views.VKStickerLoader;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.StickerAttachment;
import java.util.HashMap;
import xsna.f5h0;
import xsna.kbl0;

/* compiled from: StickerHolder.kt */
/* loaded from: classes4.dex */
public final class n4l0 extends do6 {
    public final VKStickerCachedImageView F;
    public final VKStickerLoader G;
    public final ObjectAnimator H;
    public boolean I;

    /* compiled from: StickerHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            n4l0 n4l0Var = n4l0.this;
            if (n4l0Var.I) {
                n4l0Var.H.start();
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            n4l0 n4l0Var = n4l0.this;
            if (n4l0Var.I) {
                n4l0Var.H.end();
            }
        }
    }

    public n4l0(ViewGroup viewGroup) {
        super(R.layout.attach_sticker, viewGroup);
        VKStickerCachedImageView vKStickerCachedImageView = (VKStickerCachedImageView) this.itemView.findViewById(R.id.image);
        this.F = vKStickerCachedImageView;
        VKStickerLoader vKStickerLoader = (VKStickerLoader) this.itemView.findViewById(R.id.sticker_popup_loader);
        this.G = vKStickerLoader;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.itemView, (Property<View, Float>) View.TRANSLATION_X, -3.0f, 3.0f);
        ofFloat.setDuration(125L);
        ofFloat.setRepeatCount(3);
        ofFloat.setRepeatMode(2);
        ofFloat.setStartDelay(300L);
        this.H = ofFloat;
        vKStickerCachedImageView.setPlaceholderImage(R.drawable.sticker_placeholder);
        vKStickerCachedImageView.setActualScaleType(f5h0.k.a);
        int i = h9l0.b;
        vKStickerCachedImageView.setMaxWidth(i);
        vKStickerCachedImageView.setMaxHeight(gbg0.a(this.itemView.getResources(), 8.0f) + i);
        vKStickerCachedImageView.setOnClickListener(this);
        vKStickerLoader.setOnClickListener(this);
        this.itemView.addOnAttachStateChangeListener(new a());
    }

    @Override // xsna.m56
    public final void T6(StickerAttachment stickerAttachment) {
        StickerAttachment stickerAttachment2 = stickerAttachment;
        int i = h9l0.b;
        int i2 = (int) ((i * i) / i);
        int a2 = gbg0.a(this.itemView.getResources(), 8.0f) + i;
        VKStickerCachedImageView vKStickerCachedImageView = this.F;
        vKStickerCachedImageView.H0(i2, a2);
        boolean c = dhr0.a.c(this.itemView.getContext());
        bpn0 bpn0Var = stickerAttachment2.i;
        bpn0 bpn0Var2 = stickerAttachment2.i;
        kcl0 kcl0Var = (kcl0) bpn0Var.getValue();
        StickerItem stickerItem = stickerAttachment2.f;
        String z0 = kcl0Var.z0(stickerItem, StickerAttachment.n, c);
        vKStickerCachedImageView.setOnLoadCallback(new cgr0(vKStickerCachedImageView, stickerItem.b));
        vKStickerCachedImageView.T0(z0);
        boolean z = stickerItem.k != null;
        this.I = z;
        bwt0.p0(this.G, z);
        StickerAttachment.k.getClass();
        if (StickerAttachment.m == stickerItem.b && stickerItem.z9() && ((Boolean) stickerAttachment2.j.getValue(stickerAttachment2, StickerAttachment.l[0])).booleanValue() && ((kcl0) bpn0Var2.getValue()).K0()) {
            ((kcl0) bpn0Var2.getValue()).I0().getClass();
            HashMap<UserId, kbl0> hashMap = kbl0.b;
            if (kbl0.a.b().b().Ab()) {
                StickerAttachment.m = -1;
                tdg tdgVar = this.D;
                if (tdgVar != null) {
                    tdgVar.fd(stickerAttachment2, new o4l0(this));
                }
            }
        }
    }

    @Override // xsna.do6, xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        StickerAttachment stickerAttachment = (StickerAttachment) this.C;
        if (stickerAttachment == null) {
            return;
        }
        boolean z = this.I;
        VKStickerLoader vKStickerLoader = this.G;
        if (z) {
            if (epx.f(view, vKStickerLoader)) {
                super.onClick(view);
                return;
            }
            tdg tdgVar = this.D;
            if (tdgVar != null) {
                tdgVar.fd(stickerAttachment, new o4l0(this));
                return;
            }
            return;
        }
        if (!epx.f(view, vKStickerLoader)) {
            super.onClick(view);
            return;
        }
        tdg tdgVar2 = this.D;
        if (tdgVar2 != null) {
            tdgVar2.fd(stickerAttachment, new o4l0(this));
        }
    }
}
