package xsna;

import android.widget.Button;
import com.vk.appredirects.entity.App;
import com.vk.common.view.settings.RadioButtonGroupSettingsView;

/* compiled from: AppRedirectsSettingsFragment.kt */
/* loaded from: classes15.dex */
public final class r83 implements RadioButtonGroupSettingsView.a {
    public final /* synthetic */ Button a;
    public final /* synthetic */ App b;

    public r83(Button button, App app2) {
        this.a = button;
        this.b = app2;
    }

    @Override // com.vk.common.view.settings.RadioButtonGroupSettingsView.a
    public final void a(int i) {
        Button button = this.a;
        if (button != null) {
            button.setEnabled(i != this.b.ordinal());
        }
    }
}
