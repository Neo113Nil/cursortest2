package xsna;

import android.content.Context;
import com.vk.core.ui.themes.VKTheme;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: DisclaimerBottomDialog.kt */
/* loaded from: classes2.dex */
public final class s0n extends kq6 {
    public final Context c;
    public final int d;
    public final int e;
    public final VKTheme f;

    public s0n(Context context, int i, int i2, VKTheme vKTheme) {
        this.c = context;
        this.d = i;
        this.e = i2;
        this.f = vKTheme;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        Context context = this.c;
        return ((dw20.b) new dw20.b(context, null).u0(this.f.c).w0(context.getString(this.d)).s0(context.getString(this.e)).F(enj.e(R.drawable.vk_icon_dismiss_dark_24, R.attr.vk_ui_icon_secondary, context), null)).b0(new l2k(this, 4)).B0(Integer.valueOf(iah0.a(4))).x(0).v(0).p0(iah0.a(24)).t0(context.getColor(R.color.vk_gray_400)).h0(R.string.video_disclaimer_button_ok, new a44(13)).I0("disclaimer_dialog");
    }
}
