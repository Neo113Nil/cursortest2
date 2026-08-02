package com.yandex.go.navigator.settings;

import com.yandex.go.navigator.analitycs.NavigationAnalytics$SettingsVoiceType;
import com.yandex.go.navigator.repository.VoiceMode;
import defpackage.bf50;
import defpackage.i650;
import defpackage.jl40;
import defpackage.n;
import defpackage.p6r0;
import defpackage.tls;
import defpackage.w511;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class SettingsPresenter$updateSettings$voiceSettings$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        NavigationAnalytics$SettingsVoiceType navigationAnalytics$SettingsVoiceType;
        String str = (String) obj;
        bf50 bf50Var = (bf50) this.receiver;
        bf50Var.c.r("navigator.voice_setting_key", str);
        VoiceMode.Companion.getClass();
        VoiceMode voiceMode = jl40.l(str, "turn_off") ? VoiceMode.TURN_OFF : jl40.l(str, "accidents_only") ? VoiceMode.ACCIDENTS_ONLY : VoiceMode.ALL_SOUND;
        i650 i650Var = bf50Var.a.a;
        int i = p6r0.a[voiceMode.ordinal()];
        if (i == 1) {
            navigationAnalytics$SettingsVoiceType = NavigationAnalytics$SettingsVoiceType.TurnOffAll;
        } else if (i == 2) {
            navigationAnalytics$SettingsVoiceType = NavigationAnalytics$SettingsVoiceType.RoadEvents;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            navigationAnalytics$SettingsVoiceType = NavigationAnalytics$SettingsVoiceType.AllSounds;
        }
        HashMap u = n.u(i650Var);
        u.put("chosen_option", navigationAnalytics$SettingsVoiceType.getEventValue());
        i650Var.a.a("navigation.settings.change.voice_navigation", u, 1, new HashMap());
        r0 r0Var = bf50Var.d;
        r0Var.getClass();
        r0Var.m(null, voiceMode);
        return zy11.a;
    }
}
