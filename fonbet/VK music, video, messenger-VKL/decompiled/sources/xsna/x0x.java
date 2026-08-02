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
import com.vk.dto.common.VideoFile;
import com.vk.typography.FontFamily;

/* compiled from: InnerAuthorInfoView.kt */
/* loaded from: classes16.dex */
public final class x0x extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public AppCompatTextView d;

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        AppCompatTextView appCompatTextView;
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null || videoFile.P() == null || (appCompatTextView = this.d) == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) videoFile.P());
        if (videoFile.Y().b) {
            spannableStringBuilder.append((CharSequence) " ");
            Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, videoFile.Y(), context, null, 12);
            if (h != null) {
                baf0 baf0Var = (baf0) h;
                h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                drawable = h;
            } else {
                drawable = null;
            }
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
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        float f = 8;
        awt0.x(appCompatTextView, iah0.a(f), 0, iah0.a(f), iah0.a(f), 2);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(-1);
        com.vk.typography.b.k(appCompatTextView, FontFamily.REGULAR, null, 6);
        this.d = appCompatTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(appCompatTextView, layoutParams);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }
}
