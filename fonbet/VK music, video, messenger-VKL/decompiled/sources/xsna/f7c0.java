package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vkontakte.android.R;
import xsna.b7c0;

/* compiled from: PostSettingsItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class f7c0 extends vfz<b7c0.e> {
    public final View l;
    public final e7c0 m;
    public b7c0.e n;
    public final TextView o;
    public final VkOnboardingHighlighter p;
    public final TextView q;
    public final SwitchCompat r;

    public f7c0(View view, com.vk.channels.impl.post_settings.f fVar) {
        super(view);
        this.l = view;
        this.m = fVar;
        this.o = (TextView) view.findViewById(R.id.tv_title);
        this.p = (VkOnboardingHighlighter) view.findViewById(R.id.sc_title_highlighter);
        this.q = (TextView) view.findViewById(R.id.tv_subtitle);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.sc_switch);
        this.r = switchCompat;
        switchCompat.setClickable(false);
        switchCompat.setFocusable(false);
        bwt0.i0(view, new nl30(this, 15));
    }

    @Override // xsna.vfz
    public final void W5(b7c0.e eVar) {
        b7c0.e eVar2 = eVar;
        this.n = eVar2;
        boolean e = eVar2.e();
        SwitchCompat switchCompat = this.r;
        bwt0.p0(switchCompat, e);
        switchCompat.setTag(eVar2.b.name());
        this.l.setEnabled(eVar2.c());
        int i = eVar2.c;
        String a = eVar2.a();
        Integer num = eVar2.e;
        boolean b = eVar2.b();
        boolean z = eVar2.h;
        boolean d = eVar2.d();
        switchCompat.setChecked(b);
        b7c0.e eVar3 = this.n;
        if (eVar3 == null) {
            eVar3 = null;
        }
        switchCompat.setEnabled(eVar3.c());
        if (a == null) {
            a = num != null ? this.itemView.getContext().getString(num.intValue()) : null;
        }
        TextView textView = this.q;
        if (a == null || a.length() == 0) {
            bwt0.p0(textView, false);
        } else {
            bwt0.p0(textView, true);
            textView.setText(a);
        }
        textView.setTextColor(dhr0.t.c(z ? R.attr.vk_ui_text_accent : R.attr.vk_ui_text_secondary));
        TextView textView2 = this.o;
        if (!d) {
            this.p.c(true);
            textView2.setText(i);
        } else {
            String string = textView2.getContext().getString(i);
            textView2.setText(textView2.getContext().getString(R.string.onboarding_higlighted_text, string));
            textView2.post(new yy4(7, this, string));
        }
    }
}
