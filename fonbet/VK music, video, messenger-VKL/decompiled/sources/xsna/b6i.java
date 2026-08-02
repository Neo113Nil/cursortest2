package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.EntryTitle;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.attachment.CompactAttachmentStyle;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import xsna.f5h0;

/* compiled from: CompactMarketAttachmentHolder.kt */
/* loaded from: classes4.dex */
public final class b6i extends tb6 implements View.OnClickListener, i7o, too0, f530 {
    public final q530 E;
    public final VKImageView F;
    public final TextView G;
    public final TextView H;
    public final View I;
    public final int J;
    public final float K;
    public qog0 L;
    public e6o M;
    public final p530 N;

    public b6i(ViewGroup viewGroup, q530 q530Var) {
        super(R.layout.attach_compact_market_v2, viewGroup);
        this.E = q530Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.attach_compact_photo);
        this.F = vKImageView;
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_compact_title);
        this.G = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.attach_compact_subtitle);
        this.H = textView2;
        this.I = this.itemView.findViewById(R.id.attach_compact_chevron);
        this.J = cn70.b(36);
        float a = cn70.a() * 6.0f;
        this.K = a;
        this.L = new qog0(a, dhr0.t.c(R.attr.vk_ui_background_secondary));
        this.N = new p530(this.itemView, vKImageView, textView, textView2, (TextView) null, 48);
        njt hierarchy = vKImageView.getHierarchy();
        if (hierarchy != null) {
            hierarchy.u(RoundingParams.b(a));
        }
        vKImageView.y0(iah0.b(0.5f), dhr0.Y(R.attr.vk_ui_image_border_alpha, this.itemView.getContext()));
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setPlaceholderImage(this.L);
        vKImageView.setBackgroundImage(this.L);
        this.itemView.setPaddingRelative(cn70.b(14), cn70.b(2), cn70.b(16), cn70.b(1));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.L = new qog0(this.K, dhr0.t.c(R.attr.vk_ui_background_secondary));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        e6o a = s6oVar.a(this, s6oVar.e);
        this.M = a;
        this.itemView.setOnClickListener(a);
    }

    @Override // xsna.tb6
    public final void T6(Attachment attachment, CompactAttachmentStyle compactAttachmentStyle) {
        if (attachment instanceof MarketAttachment) {
            Good good = ((MarketAttachment) attachment).f;
            q530 q530Var = this.E;
            if (q530Var != null) {
                q530Var.c(e530.b(good, null), this, new dwg(this, 4));
            } else {
                o1(null);
            }
        }
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.N;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good;
        Image image;
        ImageSize Cb;
        Description description;
        Text text;
        EntryTitle entryTitle;
        Text text2;
        Attachment attachment = this.D;
        String str = null;
        MarketAttachment marketAttachment = attachment instanceof MarketAttachment ? (MarketAttachment) attachment : null;
        if (marketAttachment == null || (good = marketAttachment.f) == null) {
            return;
        }
        bwt0.p0(this.I, true);
        CompactAttachmentStyle compactAttachmentStyle = this.C;
        String str2 = (compactAttachmentStyle == null || (entryTitle = compactAttachmentStyle.g) == null || (text2 = entryTitle.b) == null) ? null : text2.b;
        TextView textView = this.G;
        xo9.A(textView, str2);
        CompactAttachmentStyle compactAttachmentStyle2 = this.C;
        String str3 = (compactAttachmentStyle2 == null || (description = compactAttachmentStyle2.h) == null || (text = description.b) == null) ? null : text.b;
        TextView textView2 = this.H;
        xo9.A(textView2, str3);
        int i = bwt0.K(textView) ? 1 : 2;
        if (i != textView2.getMaxLines()) {
            textView2.setMaxLines(i);
        }
        dz5.J(good, textView);
        CompactAttachmentStyle compactAttachmentStyle3 = this.C;
        if (compactAttachmentStyle3 != null && (image = (Image) j5g.a0(compactAttachmentStyle3.d)) != null && (Cb = image.Cb(this.J, true, false)) != null) {
            str = Cb.d.d;
        }
        if (str != null && str.length() != 0) {
            this.F.load(str);
        }
        View.OnClickListener onClickListener = this.M;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        W6(view);
    }
}
