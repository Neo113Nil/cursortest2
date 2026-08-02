package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.core.view.ProgressView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.views.RestrictionFrescoImageViewLegacy;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: PhotoViewHolder.kt */
/* loaded from: classes2.dex */
public final class wda0 extends wr6 {
    public final RestrictionFrescoImageViewLegacy d;
    public final r3e0 e;
    public final ek30 f;
    public pk30 g;
    public NestedMsg h;
    public Msg i;
    public AttachImage j;
    public final Drawable k;
    public final Drawable l;
    public final boolean m;

    public wda0(View view) {
        super(view, 1);
        new ImageList(null, 1, null);
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        this.k = m33.a(R.drawable.vk_icon_hide_outline_56, context);
        this.l = m33.a(R.drawable.vk_icon_hide_outline_28, view.getContext());
        ImFeatures imFeatures = ImFeatures.BLUR_POST;
        imFeatures.getClass();
        this.m = com.vk.toggle.b.A.a(imFeatures);
        Context context2 = view.getContext();
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = (RestrictionFrescoImageViewLegacy) view.findViewById(R.id.image);
        this.d = restrictionFrescoImageViewLegacy;
        ek30 ek30Var = new ek30(context2, 0);
        this.f = ek30Var;
        this.e = new r3e0((ProgressView) view.findViewById(R.id.upload), null, new xz5(this, 9));
        int d = e3m.d(R.attr.im_msg_part_corner_radius_small, context2);
        restrictionFrescoImageViewLegacy.setPlaceholder(ek30Var);
        restrictionFrescoImageViewLegacy.setCornerRadius(d);
        wng0.e(d, ek30Var);
        jjc.f(new s01(this, 8), view);
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.tda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                wda0 wda0Var = wda0.this;
                pk30 pk30Var = wda0Var.g;
                if (pk30Var == null) {
                    return true;
                }
                Msg msg = wda0Var.i;
                if (msg == null) {
                    msg = null;
                }
                NestedMsg nestedMsg = wda0Var.h;
                AttachImage attachImage = wda0Var.j;
                pk30Var.X(attachImage != null ? attachImage : null, msg, nestedMsg);
                return true;
            }
        });
    }

    @Override // xsna.wr6
    public final void b(Msg msg, NestedMsg nestedMsg, Attach attach, pk30 pk30Var) {
        boolean z;
        PostDonut postDonut;
        this.g = pk30Var;
        this.i = msg;
        this.h = nestedMsg;
        AttachImage attachImage = (AttachImage) attach;
        this.j = attachImage;
        ImageList imageList = attachImage.r;
        RestrictionFrescoImageViewLegacy restrictionFrescoImageViewLegacy = this.d;
        restrictionFrescoImageViewLegacy.setLocalImage(imageList);
        AttachImage attachImage2 = this.j;
        PostDonut.Paywall paywall = null;
        if (attachImage2 == null) {
            attachImage2 = null;
        }
        restrictionFrescoImageViewLegacy.setRemoteImage(attachImage2.q);
        AttachImage attachImage3 = this.j;
        if (attachImage3 == null) {
            attachImage3 = null;
        }
        ahn.e();
        if (ddg0.a.c(attachImage3)) {
            restrictionFrescoImageViewLegacy.setRestrictions(attachImage3.v);
        } else {
            restrictionFrescoImageViewLegacy.setRestrictions(null);
        }
        if (this.m) {
            AttachImage attachImage4 = this.j;
            if (attachImage4 == null) {
                attachImage4 = null;
            }
            restrictionFrescoImageViewLegacy.setSpoiler(hpt0.q(attachImage4));
            AttachImage attachImage5 = this.j;
            if (attachImage5 == null) {
                attachImage5 = null;
            }
            if (attachImage5.x) {
                MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
                if (msgFromChannel != null && (postDonut = msgFromChannel.I.g) != null) {
                    paywall = postDonut.g;
                }
                if (paywall != null) {
                    z = true;
                    restrictionFrescoImageViewLegacy.setDonation(z);
                }
            }
            z = false;
            restrictionFrescoImageViewLegacy.setDonation(z);
        }
        this.e.a(attach);
    }

    @Override // xsna.wr6
    public final void c(int i) {
        this.e.b(i);
    }

    @Override // xsna.wr6
    public final void d(int i) {
        this.e.c(i);
    }

    @Override // xsna.wr6
    public final void e(int i, int i2, int i3) {
        this.e.d(i, i2, i3);
    }

    @Override // xsna.wr6
    public final void f(xuj xujVar) {
        this.d.setCornerRadius(xujVar);
        this.f.d(xujVar);
    }
}
