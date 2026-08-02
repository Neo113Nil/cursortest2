package xsna;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.b7c0;

/* compiled from: PostSettingsMarkAdsViewHolder.kt */
/* loaded from: classes16.dex */
public final class i7c0 extends vfz<b7c0.d> {
    public final e7c0 l;
    public final TextView m;
    public final TextView n;

    public i7c0(View view, com.vk.channels.impl.post_settings.f fVar) {
        super(view);
        this.l = fVar;
        this.m = (TextView) view.findViewById(R.id.tvErid);
        this.n = (TextView) view.findViewById(R.id.tvDescription);
        bwt0.i0(view, new ie90(this, 7));
    }

    @Override // xsna.vfz
    public final void W5(b7c0.d dVar) {
        String string;
        b7c0.d dVar2 = dVar;
        String str = dVar2.e;
        boolean f = epx.f(dVar2.d, Boolean.TRUE);
        TextView textView = this.m;
        if (f) {
            if (str == null || str.length() == 0) {
                String str2 = dVar2.f;
                string = (str2 == null || str2.length() == 0) ? this.itemView.getContext().getString(R.string.vkim_channels_post_settings_mark_advertisement_no_erid) : "";
            } else {
                string = this.itemView.getContext().getString(R.string.vkim_channels_post_settings_mark_advertisement_erid, str);
            }
            textView.setText(string);
        } else {
            textView.setText(R.string.vkim_channels_post_settings_mark_advertisement_not_selected);
        }
        textView.setEnabled(!dVar2.g);
        h7c0 h7c0Var = new h7c0(this, dhr0.t.c(R.attr.vk_ui_text_accent));
        String string2 = this.itemView.getContext().getString(R.string.vkim_channels_post_settings_mark_advertisement_subtitle_hint);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.itemView.getContext().getString(R.string.vkim_channels_post_settings_mark_advertisement_subtitle, string2));
        int K = drm0.K(0, 6, spannableStringBuilder, string2, false);
        spannableStringBuilder.setSpan(h7c0Var, K, string2.length() + K, 34);
        TextView textView2 = this.n;
        textView2.setText(spannableStringBuilder);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
