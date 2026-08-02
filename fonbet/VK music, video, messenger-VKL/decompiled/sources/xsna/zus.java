package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;

/* compiled from: FullInnerInfoView.kt */
/* loaded from: classes16.dex */
public final class zus extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public final boolean d;
    public final int e = 4;
    public final int f = 4;
    public TextView g;
    public TextView h;
    public TextView i;
    public TextView j;

    public zus(boolean z) {
        this.d = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        Drawable drawable;
        TextView textView = this.g;
        if (textView == null || (context = textView.getContext()) == null) {
            return;
        }
        String j1 = videoFile.j1();
        if (j1 == null || j1.length() == 0) {
            TextView textView2 = this.h;
            if (textView2 != null) {
                f4m.j(textView2);
            }
        } else {
            TextView textView3 = this.h;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = this.h;
            if (textView4 != null) {
                textView4.setText(videoFile.j1());
            }
        }
        TextView textView5 = this.j;
        if (textView5 != null) {
            textView5.setText(pvo0.i(false, videoFile.b0(), false, false));
        }
        int L8 = videoFile.L8();
        String h = this.d ? uqm0.h(L8) : uqm0.g(L8) ? uqm0.f(L8) : String.valueOf(L8);
        Drawable a = m33.a(R.drawable.vk_icon_view_12, context);
        TextView textView6 = this.i;
        if (textView6 != null) {
            textView6.setCompoundDrawablesWithIntrinsicBounds(a, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        TextView textView7 = this.i;
        if (textView7 != null) {
            textView7.setText(h);
        }
        String P = videoFile.P();
        if (P == null || P.length() == 0) {
            TextView textView8 = this.g;
            if (textView8 != null) {
                textView8.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView9 = this.g;
        if (textView9 != null) {
            textView9.setVisibility(0);
        }
        TextView textView10 = this.g;
        if (textView10 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) videoFile.P());
            if (videoFile.Y().b) {
                spannableStringBuilder.append((CharSequence) " ");
                Drawable h2 = VerifyInfoHelper.h(VerifyInfoHelper.a, videoFile.Y(), context, null, 12);
                if (h2 != null) {
                    baf0 baf0Var = (baf0) h2;
                    h2.setBounds(0, 0, baf0Var.b.getIntrinsicWidth(), baf0Var.b.getIntrinsicHeight());
                    drawable = h2;
                } else {
                    drawable = null;
                }
                Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                drawable.setBounds(0, 0, ((baf0) drawable).b.getIntrinsicWidth(), ((baf0) drawable).b.getIntrinsicHeight());
                newSpannable.setSpan(new tzx0(drawable, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) newSpannable);
            }
            textView10.setText(spannableStringBuilder);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.catalog_video_full_inner_info, (ViewGroup) aspectRatioFrameLayout, true);
        this.g = (TextView) viewGroup.findViewById(R.id.video_owner_title);
        this.h = (TextView) viewGroup.findViewById(R.id.video_description);
        this.i = (TextView) viewGroup.findViewById(R.id.video_views);
        this.j = (TextView) viewGroup.findViewById(R.id.video_time);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final int c() {
        return this.e;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final int e() {
        return this.f;
    }
}
