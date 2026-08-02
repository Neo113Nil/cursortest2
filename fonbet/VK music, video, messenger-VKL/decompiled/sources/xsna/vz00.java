package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import xsna.f5h0;

/* compiled from: MarketHolder.kt */
/* loaded from: classes4.dex */
public final class vz00 extends m34<MarketAttachment> implements f530 {
    public static final int X = iah0.a(112);
    public final q530 R;
    public final VkImage S;
    public final SpannableStringBuilder T;
    public e6o U;
    public e6o V;
    public final p530 W;

    public vz00(ViewGroup viewGroup, q530 q530Var, h170 h170Var) {
        super(viewGroup);
        this.R = q530Var;
        VkImage vkImage = new VkImage(this.itemView.getContext(), null, 6, 0);
        float f = 28;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams.gravity = 17;
        vkImage.setLayoutParams(layoutParams);
        abg0 abg0Var = dhr0.t;
        vkImage.setImageDrawable(new baf0(abg0Var.a(R.drawable.vk_icon_hide_outline_28), abg0Var.c(R.attr.vk_ui_icon_tertiary)));
        bwt0.p0(vkImage, false);
        this.S = vkImage;
        this.T = new SpannableStringBuilder();
        VkCard vkCard = this.D;
        this.W = new p530(vkCard, this.F, this.J, this.K, (TextView) null, this.L);
        vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_content);
        this.E.addView(vkImage);
        this.M.setText(R.string.vkim_msg_list_market_button);
        this.F.Q0(new baf0(abg0Var.a(R.drawable.vk_icon_market_outline_36), abg0Var.c(R.attr.vk_ui_icon_tertiary)), f5h0.e.a);
        int i = dek0.a;
        dek0.b(this.F, null, null, 6);
        X6();
    }

    @Override // xsna.m34, xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.U = s6oVar.a(this, baVar);
        this.V = s6oVar.a(new bg0(this, 5), baVar);
        X6();
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        MarketAttachment marketAttachment = (MarketAttachment) attachment;
        this.C = marketAttachment;
        Good good = marketAttachment.f;
        q530 q530Var = this.R;
        if (q530Var != null) {
            q530Var.c(e530.b(good, null), this, new zqh(this, 29));
        } else {
            o1(null);
        }
        dz5.J(good, this.J);
        mt00.d(Long.valueOf(good.b), Long.valueOf(good.c.b), null, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, null, null, null, null, 32756);
    }

    @Override // xsna.m34
    public final void X6() {
        View.OnClickListener onClickListener = this.U;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.M.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.V;
        if (onClickListener2 == null) {
            onClickListener2 = this;
        }
        this.L.setOnClickListener(onClickListener2);
    }

    public final void c7() {
        MarketAttachment marketAttachment = (MarketAttachment) this.C;
        if (marketAttachment == null) {
            return;
        }
        gd60.X0(hd60.a(), this.itemView.getContext(), ao8.s(marketAttachment.f), new pqq(null, null, null, null, 15), new ht7(this, 7), new w7u(this, 9), 32);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.W;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good;
        ImageSize Cb;
        String str;
        MarketAttachment marketAttachment = (MarketAttachment) this.C;
        if (marketAttachment == null || (good = marketAttachment.f) == null) {
            return;
        }
        this.J.setText(good.d);
        bwt0.p0(this.M, true);
        Price price = good.h;
        String str2 = price.e;
        String str3 = price.f;
        boolean z = str2.length() > 0;
        VkText vkText = this.K;
        bwt0.p0(vkText, z);
        if (str3 == null || str3.length() == 0) {
            vkText.setText(str2);
        } else {
            SpannableStringBuilder spannableStringBuilder = this.T;
            spannableStringBuilder.clear();
            Context context = this.itemView.getContext();
            FontFamily fontFamily = FontFamily.MEDIUM;
            float textSize = vkText.getTextSize();
            TextSizeUnit textSizeUnit = TextSizeUnit.PX;
            SpannableStringBuilder append = spannableStringBuilder.append(str2, new qup0(a.C1933a.a(context, fontFamily, textSize, textSizeUnit).a), 33).append((CharSequence) rik0.b(7.0f)).append(str3, new StrikethroughSpan(), 33);
            append.setSpan(new qup0(a.C1933a.a(this.itemView.getContext(), FontFamily.REGULAR, vkText.getTextSize(), textSizeUnit).a), append.length() - str3.length(), append.length(), 33);
            append.setSpan(new m7s(R.attr.vk_ui_text_secondary), append.length() - str3.length(), append.length(), 33);
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            vkText.setText(new SpannableString(append));
        }
        VKEnhancedImageView vKEnhancedImageView = this.F;
        vKEnhancedImageView.setOverlayImage(null);
        vKEnhancedImageView.setVisible(true);
        bwt0.p0(this.S, false);
        Image image = good.n;
        if (image != null && (Cb = image.Cb(X, false, false)) != null && (str = Cb.d.d) != null) {
            if (this.t) {
                vKEnhancedImageView.v0(str);
            } else {
                vKEnhancedImageView.o0(str, null);
            }
        }
        p5();
        b7(good.J);
        View.OnClickListener onClickListener = this.U;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.equals(this.itemView) || view.equals(this.M)) {
            W6(view);
        } else if (view.equals(this.L)) {
            c7();
        }
    }

    @Override // xsna.m34, xsna.blc0
    public final void p5() {
        bwt0.p0(this.L, false);
    }
}
