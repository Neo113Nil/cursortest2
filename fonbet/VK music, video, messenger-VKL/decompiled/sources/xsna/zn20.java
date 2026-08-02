package xsna;

import android.content.Context;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;

/* compiled from: MilkshakeSnackbarDefaults.kt */
/* loaded from: classes17.dex */
public final class zn20 extends n7k0 {
    public static final zn20 a = new zn20();

    @Override // xsna.n7k0
    public final int a() {
        return R.attr.vk_ui_background_contrast_themed;
    }

    @Override // xsna.n7k0
    public final float b(Context context) {
        return hbh0.a(context, 8.0f);
    }

    @Override // xsna.n7k0
    public final VkButton.Size c() {
        return VkButton.Size.Small;
    }

    @Override // xsna.n7k0
    public final VkButton.Appearance d() {
        return VkButton.Appearance.Accent;
    }

    @Override // xsna.n7k0
    public final VkButton.Mode e() {
        return VkButton.Mode.Tertiary;
    }

    @Override // xsna.n7k0
    public final int f() {
        return R.drawable.vk_icon_error_circle_outline_28;
    }

    @Override // xsna.n7k0
    public final x7g g() {
        return new x7g(R.attr.vk_ui_icon_negative);
    }

    @Override // xsna.n7k0
    public final cut0 h() {
        return null;
    }

    @Override // xsna.n7k0
    public final int i(Context context) {
        return hbh0.b(56, context);
    }

    @Override // xsna.n7k0
    public final int j(Context context) {
        return e3m.g(R.attr.vk_ui_typography_subhead_normal, context);
    }

    @Override // xsna.n7k0
    public final int k() {
        return R.attr.vk_ui_text_subhead;
    }

    @Override // xsna.n7k0
    public final int l() {
        return R.drawable.vk_icon_check_circle_outline_28;
    }

    @Override // xsna.n7k0
    public final x7g m() {
        return new x7g(R.attr.vk_ui_icon_positive);
    }

    @Override // xsna.n7k0
    public final int n(Context context) {
        return e3m.g(R.attr.vk_ui_typography_paragraph_normal, context);
    }

    @Override // xsna.n7k0
    public final int o() {
        return R.attr.vk_ui_text_primary;
    }

    @Override // xsna.n7k0
    public final int p(Context context) {
        return hbh0.b(2, context);
    }
}
