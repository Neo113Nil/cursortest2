package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;

/* compiled from: IntervalDelegate.kt */
/* loaded from: classes14.dex */
public final class kox {
    public final etn a;
    public final xqt0 b;
    public final zqt0 c;
    public jox d;

    public kox(etn etnVar, xqt0 xqt0Var, zqt0 zqt0Var) {
        TextView textView = xqt0Var.s;
        this.a = etnVar;
        this.b = xqt0Var;
        this.c = zqt0Var;
        if (zqt0Var.a() || etnVar.a || etnVar.f) {
            textView.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
            textView.setCompoundDrawablePadding(iah0.a(4));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, new InsetDrawable(enj.e(R.drawable.vk_icon_chevron_16, R.attr.vk_ui_icon_contrast, textView.getContext()), 0, iah0.a(1), 0, 0), (Drawable) null);
        }
    }

    public final void a(VideoFile videoFile, boolean z, boolean z2) {
        boolean e = this.a.e(Boolean.valueOf(videoFile.T1()));
        zqt0 zqt0Var = this.c;
        if ((e || zqt0Var.a()) && !videoFile.Y3().isEmpty()) {
            boolean z3 = (z || zqt0Var.a()) && !z2;
            xqt0 xqt0Var = this.b;
            xqt0Var.s.setVisibility(z3 ? 0 : 8);
            xqt0Var.t.setVisibility(8);
            TextView textView = xqt0Var.D;
            if (textView != null) {
                f4m.q(iah0.a(8), textView);
            }
            if (z) {
                f4m.q(iah0.a(28) + iah0.a(4), xqt0Var.u);
            }
        }
    }
}
