package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.tool.view.RatioView;
import com.vk.dto.common.VideoFile;
import com.vk.toggle.features.VideoFeatures;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.uko;

/* compiled from: InnerViewsCountView.kt */
/* loaded from: classes16.dex */
public final class e1x extends com.vk.catalog2.common.ui.holders.video.info_overlays.a implements w8i {
    public final bpn0 d = new bpn0(new k5h(this, 22));
    public AppCompatTextView e;
    public ImageView f;
    public ImageView g;

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null) {
            return;
        }
        AppCompatTextView appCompatTextView = this.e;
        if (appCompatTextView != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ylw ylwVar = new ylw(R.drawable.vk_icon_view_12);
            ylwVar.c = 3;
            ylwVar.f = iah0.a(-2);
            ylwVar.d(R.color.vk_white);
            spannableStringBuilder.append((CharSequence) ylwVar.b(context));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) xpm0.a(videoFile.L8()));
            appCompatTextView.setText(spannableStringBuilder);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            awt0.v(imageView, ((qwe) this.d.getValue()).d(videoFile));
        }
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_CLIPS_PIN_ACTION;
        videoFeatures.getClass();
        if (!com.vk.toggle.b.A.a(videoFeatures)) {
            ImageView imageView2 = this.g;
            if (imageView2 != null) {
                f4m.j(imageView2);
                return;
            }
            return;
        }
        ImageView imageView3 = this.g;
        if (imageView3 != null) {
            Boolean Q = videoFile.Q();
            awt0.v(imageView3, Q != null ? Q.booleanValue() : false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        bwt0.d(aspectRatioFrameLayout, cn70.a() * 8.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        f4m.q(cn70.b(8), linearLayout);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        float f = 8;
        awt0.x(appCompatTextView, iah0.a(f), 0, iah0.a(f), iah0.a(10), 2);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setTextSize(14.0f);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(-1);
        Drawable drawable = null;
        com.vk.typography.b.k(appCompatTextView, FontFamily.REGULAR, null, 6);
        this.e = appCompatTextView;
        RatioView ratioView = new RatioView(linearLayout.getContext(), null, 6);
        ratioView.setAlpha(0.5f);
        ratioView.setBackground(new ieh0());
        ratioView.setOrientation(0);
        ratioView.setRatio(0.85714287f);
        ImageView imageView = new ImageView(linearLayout.getContext());
        Context context = imageView.getContext();
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_lock_12, context), -1));
        this.f = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cn70.b(184));
        layoutParams.gravity = 80;
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(ratioView, layoutParams);
        View view = this.f;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388661;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, iah0.a(f), iah0.a(f), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        aspectRatioFrameLayout.addView(view, layoutParams2);
        View view2 = this.e;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        aspectRatioFrameLayout.addView(view2, layoutParams3);
        ImageView imageView2 = new ImageView(aspectRatioFrameLayout.getContext());
        Drawable a = m33.a(R.drawable.vk_icon_pin_20, imageView2.getContext());
        if (a != null) {
            ColorStateList valueOf = ColorStateList.valueOf(-1);
            uko.a aVar2 = uko.a;
            drawable = a.mutate();
            drawable.setTintList(valueOf);
        }
        imageView2.setImageDrawable(drawable);
        f4m.j(imageView2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        int b = cn70.b(8);
        layoutParams4.setMargins(b, b, b, b);
        aspectRatioFrameLayout.addView(imageView2, layoutParams4);
        this.g = imageView2;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }
}
