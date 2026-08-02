package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;

/* compiled from: MusicTemplateVideoView.kt */
/* loaded from: classes16.dex */
public final class ba50 extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public AppCompatTextView d;

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        AppCompatTextView appCompatTextView;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null || videoFile.P() == null || !(videoFile instanceof ClipVideoFile) || (appCompatTextView = this.d) == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
        spannableStringBuilder.append((CharSequence) clipVideoFile.p0);
        if (clipVideoFile.o0.b) {
            spannableStringBuilder.append((CharSequence) " ");
            Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, clipVideoFile.o0, context, VerifyInfoHelper.ColorTheme.white, 8);
            if (h != null) {
                baf0 baf0Var = (baf0) h;
                h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
            } else {
                h = null;
            }
            Drawable drawable = h;
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) newSpannable);
        }
        appCompatTextView.setText(spannableStringBuilder);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        View view = new View(linearLayout.getContext());
        view.setBackgroundResource(R.drawable.vk_gradient_bottom_72_alpha48);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cn70.b(128));
        layoutParams.gravity = 80;
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(view, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        float f = 12;
        awt0.x(appCompatTextView, iah0.a(f), 0, iah0.a(f), iah0.a(8), 2);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(-1);
        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
        this.d = appCompatTextView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        aspectRatioFrameLayout.addView(appCompatTextView, layoutParams2);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }
}
