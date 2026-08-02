package com.yandex.go.navigator.settings;

import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsSoundType;
import com.yandex.go.navigator.repository.SoundMode;
import defpackage.bf50;
import defpackage.i650;
import defpackage.n;
import defpackage.p6r0;
import defpackage.q9t0;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SettingsPresenter$updateSettings$soundSettings$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        NavigationAnalytics$SettingsSoundType navigationAnalytics$SettingsSoundType;
        String str = (String) obj;
        bf50 bf50Var = (bf50) this.receiver;
        bf50Var.c.r("navigator.sound_setting_key", str);
        SoundMode.Companion.getClass();
        SoundMode a = q9t0.a(str);
        i650 i650Var = bf50Var.a.a;
        int i = p6r0.b[a.ordinal()];
        if (i == 1) {
            navigationAnalytics$SettingsSoundType = NavigationAnalytics$SettingsSoundType.Low;
        } else if (i == 2) {
            navigationAnalytics$SettingsSoundType = NavigationAnalytics$SettingsSoundType.Medium;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            navigationAnalytics$SettingsSoundType = NavigationAnalytics$SettingsSoundType.High;
        }
        HashMap u = n.u(i650Var);
        u.put("chosen_option", navigationAnalytics$SettingsSoundType.getEventValue());
        i650Var.a.a("navigation.settings.change.sound_settings", u, 1, new HashMap());
        bf50Var.e.l(q9t0.a(str));
        return zy11.a;
    }
}
