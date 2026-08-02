package xsna;

import android.content.Context;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.webapp.fragments.PrivacyFragment;
import kotlin.Lazy;

/* compiled from: VkSettingsBridge.kt */
/* loaded from: classes11.dex */
public final class kjv0 implements pcw {
    public final Object a;

    public kjv0(Lazy<? extends mh70> lazy) {
        this.a = lazy;
    }

    @Override // xsna.pcw
    public final void a(String str) {
        if (str == null) {
            zqn0.a.i();
        } else {
            zqn0.a.g(str);
        }
    }

    @Override // xsna.pcw
    public final void b(Context context) {
        new AppearanceSettingsWithBackgroundsFragment.a().k(context);
    }

    @Override // xsna.pcw
    public final void c(Context context) {
        int i = PrivacyFragment.a0;
        PrivacyFragment.b.a(false, false, PrivacyFragment.PrivacySetting.CALLS.h(), null, 55).k(context);
    }
}
