package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;

/* compiled from: ClipFixedWidthOverlayDelegate.kt */
/* loaded from: classes4.dex */
public final class hzc extends q8d {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.q8d
    public final void a(VideoFile videoFile) {
        Drawable drawable;
        ActionLinkSnippet actionLinkSnippet;
        if (videoFile == null || !g620.f().d(videoFile)) {
            if (this.c.isInitialized()) {
                bwt0.p0(b(), false);
                return;
            }
            return;
        }
        bwt0.p0(b(), true);
        Context context = b().getContext();
        int a = context != null ? e3m.a(R.dimen.clip_fixed_width_overlay_margin, context) : iah0.a(8);
        TextView textView = (TextView) this.i.getValue();
        if (textView != null) {
            f4m.j(textView);
        }
        ViewGroup viewGroup = (ViewGroup) this.h.getValue();
        if (viewGroup != null) {
            f4m.j(viewGroup);
        }
        TextViewEllipsizeEnd textViewEllipsizeEnd = (TextViewEllipsizeEnd) this.f.getValue();
        if (textViewEllipsizeEnd != null) {
            f4m.j(textViewEllipsizeEnd);
        }
        TextView textView2 = (TextView) this.k.getValue();
        if (textView2 != null) {
            bwt0.p0(textView2, videoFile.m1() != null);
            ActionLink m1 = videoFile.m1();
            textView2.setText((m1 == null || (actionLinkSnippet = m1.f) == null) ? null : actionLinkSnippet.b);
            bwt0.f0(textView2, a, 0, 0, 0, 14);
        }
        VkButton vkButton = (VkButton) this.j.getValue();
        if (vkButton != null) {
            bwt0.p0(vkButton, videoFile.m1() != null);
            bwt0.i0(vkButton, new gzc(0, videoFile));
            bwt0.f0(vkButton, a, 0, a, 0, 10);
        }
        TextView textView3 = (TextView) this.e.getValue();
        if (textView3 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String P = videoFile.P();
            if (P != null) {
                spannableStringBuilder.append((CharSequence) P);
            }
            if (di60.A(videoFile.Y())) {
                Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, videoFile.Y(), textView3.getContext(), VerifyInfoHelper.ColorTheme.white, 8);
                if (h != null) {
                    baf0 baf0Var = (baf0) h;
                    h.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                    drawable = h;
                } else {
                    drawable = null;
                }
                int a2 = iah0.a(4);
                textView3.getContext();
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                drawable.setBounds(0, 0, ((baf0) drawable).b.getIntrinsicWidth(), ((baf0) drawable).b.getIntrinsicHeight());
                newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, a2, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) newSpannable);
            }
            textView3.setText(spannableStringBuilder);
            textView3.setTextSize(14.0f);
            bwt0.f0(textView3, a, 0, a, 0, 10);
        }
        ImageView imageView = (ImageView) this.o.getValue();
        if (imageView != null) {
            bwt0.i0(imageView, new yf1(imageView, videoFile, this, 2));
        }
        c(videoFile);
        View view = (View) this.l.getValue();
        if (view != null) {
            bwt0.c0(a, view);
        }
        View view2 = (View) this.d.getValue();
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(VideoFile videoFile) {
        ImageView imageView = (ImageView) this.o.getValue();
        if (imageView != null) {
            if (videoFile.O9()) {
                omw.a(imageView, R.color.vk_red_nice);
                imageView.setImageResource(R.drawable.vk_icon_like_24);
            } else {
                omw.a(imageView, R.color.vk_white);
                imageView.setImageResource(R.drawable.vk_icon_like_outline_24);
            }
        }
    }
}
