package xsna;

import android.content.Context;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.tabbar.core.api.domain.TabbarState;
import com.vk.tabbar.settings.impl.suggests.TabbarSuggestActivity;
import xsna.ovn0;

/* compiled from: TabbarSettingsRouterImpl.kt */
/* loaded from: classes11.dex */
public final class kwn0 implements jwn0 {
    @Override // xsna.jwn0
    public final void a(NavigationDelegateActivity navigationDelegateActivity, int i, TabbarState tabbarState) {
        int i2 = TabbarSuggestActivity.h;
        navigationDelegateActivity.startActivity(TabbarSuggestActivity.a.a(navigationDelegateActivity, i, tabbarState));
    }

    @Override // xsna.jwn0
    public final void c(Context context, String str) {
        new ovn0.a(context, str).I0(null);
    }
}
