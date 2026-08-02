package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.RatingView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Price;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;

/* compiled from: MarketHolderOld.kt */
/* loaded from: classes4.dex */
public final class wz00 extends m56<MarketAttachment> implements View.OnClickListener, blc0, f530 {
    public static final int S = iah0.a(12);
    public static final int T = iah0.a(8);
    public static final float U = iah0.b(8.0f);
    public static final int V = iah0.a(96);
    public static final int W = iah0.a(112);
    public final q530 D;
    public final View E;
    public final VKImageView F;
    public final ViewGroup G;
    public final ViewGroup H;
    public final TextView I;
    public final TextView J;
    public final VkButton K;
    public final ImageView L;
    public final View M;
    public final View N;
    public final SpannableStringBuilder O;
    public e6o P;
    public e6o Q;
    public final p530 R;

    public wz00(ViewGroup viewGroup, q530 q530Var) {
        super(R.layout.market_holder_layout, viewGroup);
        this.D = q530Var;
        View findViewById = this.itemView.findViewById(R.id.attachment_market_container);
        this.E = findViewById;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.snippet_image);
        this.F = vKImageView;
        this.G = (ViewGroup) this.itemView.findViewById(R.id.info);
        this.H = (ViewGroup) this.itemView.findViewById(R.id.image);
        TextView textView = (TextView) this.itemView.findViewById(R.id.attach_title);
        this.I = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.attach_subtitle);
        this.J = textView2;
        RatingView ratingView = (RatingView) this.itemView.findViewById(R.id.attach_rating);
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.attach_review_count);
        VkButton vkButton = (VkButton) this.itemView.findViewById(R.id.attach_button);
        this.K = vkButton;
        this.L = (ImageView) this.itemView.findViewById(R.id.attach_snippet_remove_button);
        View findViewById2 = this.itemView.findViewById(R.id.snippet_toggle_fave);
        this.M = findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.snippet_actions);
        this.N = findViewById3;
        this.O = new SpannableStringBuilder();
        this.R = new p530(findViewById, vKImageView, textView, textView2, (TextView) null, findViewById2);
        ratingView.setVisibility(8);
        textView3.setVisibility(8);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
        float f = U;
        vKImageView.z0(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        dek0.b(vKImageView, null, null, 6);
        View.OnClickListener onClickListener = this.P;
        vkButton.setOnClickListener(onClickListener == null ? this : onClickListener);
        View.OnClickListener onClickListener2 = this.Q;
        onClickListener2 = onClickListener2 == null ? this : onClickListener2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(onClickListener2);
        }
        int a = iah0.a(8);
        f4m.l(a, a, findViewById);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.L, z);
        View view = this.E;
        if (z) {
            int a = iah0.a(16);
            f4m.l(a, a, view);
        } else {
            int a2 = iah0.a(8);
            f4m.l(a2, a2, view);
        }
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.P = s6oVar.a(this, baVar);
        this.Q = s6oVar.a(new ybq(this, 2), baVar);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.K.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.Q;
        if (onClickListener2 == null) {
            onClickListener2 = this;
        }
        View view = this.M;
        if (view != null) {
            view.setOnClickListener(onClickListener2);
        }
    }

    @Override // xsna.m56
    public final void T6(MarketAttachment marketAttachment) {
        MarketAttachment marketAttachment2 = marketAttachment;
        this.C = marketAttachment2;
        Good good = marketAttachment2.f;
        q530 q530Var = this.D;
        if (q530Var != null) {
            q530Var.c(e530.b(good, null), this, new com.vk.im.engine.commands.messages.a(27, this, good));
        } else {
            o1(null);
        }
        dz5.J(good, this.I);
        mt00.d(Long.valueOf(good.b), Long.valueOf(good.c.b), null, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, null, null, null, null, 32756);
        b7();
    }

    public final String X6(Good good) {
        ImageSize Cb;
        Image image = good.n;
        int i = W;
        String str = (image == null || (Cb = image.Cb(i, false, false)) == null) ? null : Cb.d.d;
        ViewGroup viewGroup = this.G;
        ViewGroup viewGroup2 = this.H;
        if (str == null || str.length() == 0) {
            f4m.j(viewGroup2);
            f4m.x(T, viewGroup);
            viewGroup.setBackgroundResource(R.drawable.market_holder_bg);
            f4m.s(0, viewGroup);
            viewGroup.setMinimumHeight(0);
            return null;
        }
        viewGroup2.setVisibility(0);
        f4m.x(S, viewGroup);
        viewGroup.setBackgroundResource(R.drawable.market_holder_bg_right);
        f4m.s(i, viewGroup);
        viewGroup.setMinimumHeight(V);
        return str;
    }

    public final void Y6() {
        View view = this.M;
        if (view != null) {
            view.setContentDescription((view == null || !view.isActivated()) ? v6(R.string.fave_accessibility_add_to_favorite) : v6(R.string.fave_accessibility_remove_from_favorite));
        }
    }

    public final void b7() {
        View view;
        View view2 = this.M;
        f4m.r(((view2 == null || !bwt0.K(view2)) && ((view = this.N) == null || !bwt0.K(view))) ? 0 : iah0.a(35), this.I);
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.L.setOnClickListener(onClickListener);
    }

    @Override // xsna.f530
    public final p530 k1(Integer num) {
        return this.R;
    }

    @Override // xsna.f530
    public final void o1(Integer num) {
        Good good;
        MarketAttachment marketAttachment = (MarketAttachment) this.C;
        if (marketAttachment == null || (good = marketAttachment.f) == null) {
            return;
        }
        this.I.setText(good.d);
        Price price = good.h;
        String str = price.e;
        String str2 = price.f;
        boolean z = str.length() > 0;
        TextView textView = this.J;
        bwt0.p0(textView, z);
        if (str2 == null || str2.length() == 0) {
            textView.setText(str);
        } else {
            SpannableStringBuilder spannableStringBuilder = this.O;
            spannableStringBuilder.clear();
            Context context = this.itemView.getContext();
            FontFamily fontFamily = FontFamily.MEDIUM;
            float textSize = textView.getTextSize();
            TextSizeUnit textSizeUnit = TextSizeUnit.PX;
            SpannableStringBuilder append = spannableStringBuilder.append(str, new qup0(a.C1933a.a(context, fontFamily, textSize, textSizeUnit).a), 33).append((CharSequence) rik0.b(7.0f)).append(str2, new StrikethroughSpan(), 33);
            append.setSpan(new qup0(a.C1933a.a(this.itemView.getContext(), FontFamily.REGULAR, textView.getTextSize(), textSizeUnit).a), append.length() - str2.length(), append.length(), 33);
            append.setSpan(new m7s(R.attr.vk_ui_text_secondary), append.length() - str2.length(), append.length(), 33);
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            textView.setText(new SpannableString(append));
        }
        String X6 = X6(good);
        if (X6 != null) {
            boolean z2 = this.t;
            VKImageView vKImageView = this.F;
            if (z2) {
                vKImageView.v0(X6);
            } else {
                vKImageView.load(X6);
            }
        }
        View view = this.M;
        if (view != null) {
            view.setActivated(good.J);
        }
        if (view != null) {
            bwt0.p0(view, true);
        }
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        Y6();
    }

    @Override // xsna.blc0
    public final void p5() {
        View view = this.M;
        if (view != null) {
            bwt0.p0(view, false);
        }
        b7();
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
