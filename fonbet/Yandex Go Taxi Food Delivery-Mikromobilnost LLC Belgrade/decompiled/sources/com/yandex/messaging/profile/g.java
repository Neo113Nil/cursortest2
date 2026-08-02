package com.yandex.messaging.profile;

import android.content.SharedPreferences;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.am2;
import defpackage.i3y;
import defpackage.m120;
import defpackage.tje;
import defpackage.wl3;

/* loaded from: classes8.dex */
public final class g {
    public final e a;
    public final am2 b;

    public g(e eVar, am2 am2Var) {
        this.a = eVar;
        this.b = am2Var;
    }

    public final void a(wl3 wl3Var) {
        if (wl3Var == null) {
            ((SharedPreferences) ((i3y) this.b.c).getValue()).edit().putBoolean("auto_login_enabled", false).apply();
        }
        e eVar = this.a;
        eVar.getClass();
        tje.e();
        m120 m120Var = eVar.d;
        MessengerEnvironment a = m120Var.a.a();
        m120Var.c = a;
        SharedPreferences.Editor edit = m120Var.b.a.edit();
        edit.putInt("MESSENGER_ENVIRONMENT", a != null ? a.ordinal() : -1);
        edit.apply();
        eVar.a(eVar.b.a(ProfileCreator$IdCreationType.REGENERATE));
        tje.N(eVar.h, null, null, new ProfileManager$createNewProfile$1(eVar, wl3Var, null), 3);
    }
}
