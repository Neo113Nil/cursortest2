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
import com.vk.dto.music.MusicTrack;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: MusicTrendTemplateVideoView.kt */
/* loaded from: classes16.dex */
public final class he50 extends com.vk.catalog2.common.ui.holders.video.info_overlays.a implements w8i {
    public AppCompatTextView d;
    public AppCompatTextView e;
    public final bpn0 f = new bpn0(new v3n(this, 24));
    public io.reactivex.rxjava3.disposables.c g;

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        AppCompatTextView appCompatTextView;
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout == null || (context = aspectRatioFrameLayout.getContext()) == null || !(videoFile instanceof ClipVideoFile)) {
            return;
        }
        AppCompatTextView appCompatTextView2 = this.d;
        if (appCompatTextView2 != null) {
            awt0.v(appCompatTextView2, ((ClipVideoFile) videoFile).p0 != null);
        }
        AppCompatTextView appCompatTextView3 = this.e;
        if (appCompatTextView3 != null) {
            MusicTrack musicTrack = ((ClipVideoFile) videoFile).D1;
            awt0.v(appCompatTextView3, (musicTrack != null ? musicTrack.d : null) != null);
        }
        ClipVideoFile clipVideoFile = (ClipVideoFile) videoFile;
        if (clipVideoFile.p0 != null && (appCompatTextView = this.d) != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) clipVideoFile.p0);
            if (clipVideoFile.o0.b) {
                spannableStringBuilder.append((CharSequence) " ");
                Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, clipVideoFile.o0, context, VerifyInfoHelper.ColorTheme.white, 8);
                if (h != null) {
                    baf0 baf0Var = (baf0) h;
                    h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                    drawable = h;
                } else {
                    drawable = null;
                }
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                drawable.setBounds(0, 0, ((baf0) drawable).b.getIntrinsicWidth(), ((baf0) drawable).b.getIntrinsicHeight());
                newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) newSpannable);
            }
            appCompatTextView.setText(spannableStringBuilder);
        }
        MusicTrack musicTrack2 = clipVideoFile.D1;
        if ((musicTrack2 != null ? musicTrack2.d : null) == null) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new nxq(this, clipVideoFile, context, 1));
        asu0.a.getClass();
        this.g = s0Var.r0(asu0.i()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new lav(new owv(this, 12), 10));
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        f4m.q(cn70.b(8), linearLayout);
        bwt0.d(aspectRatioFrameLayout, cn70.b(14), true, true);
        View view = new View(linearLayout.getContext());
        view.setBackgroundResource(R.drawable.vk_gradient_bottom_72_alpha48);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, cn70.b(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE));
        layoutParams.gravity = 80;
        s3q0 s3q0Var = s3q0.a;
        aspectRatioFrameLayout.addView(view, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext());
        float f = 12;
        awt0.x(appCompatTextView, iah0.a(f), 0, iah0.a(f), iah0.a(f), 2);
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(-1);
        FontFamily fontFamily = FontFamily.MEDIUM;
        Float valueOf = Float.valueOf(14.0f);
        com.vk.typography.b.k(appCompatTextView, fontFamily, valueOf, 4);
        this.d = appCompatTextView;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        aspectRatioFrameLayout.addView(appCompatTextView, layoutParams2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext());
        awt0.x(appCompatTextView2, iah0.a(f), 0, iah0.a(f), iah0.a(36), 2);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(-1);
        com.vk.typography.b.k(appCompatTextView2, fontFamily, valueOf, 4);
        this.e = appCompatTextView2;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        aspectRatioFrameLayout.addView(appCompatTextView2, layoutParams3);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }
}
