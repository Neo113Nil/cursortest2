package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.core.preference.Preference$PreferenceUsingLogger$IOType;
import com.vk.voip.ui.VoipViewModelState;
import com.vk.voip.ui.di.VoipFirstCallCacheComponent;
import java.util.Collections;
import java.util.List;

/* compiled from: CommonVoipBridge.kt */
/* loaded from: classes11.dex */
public final class nng implements afw0 {
    public final usw0 b;
    public final ed9 c;

    @SuppressLint({"StaticFieldLeak"})
    public final gtw0 d;
    public final png e;

    public nng(vre0 vre0Var, yre0 yre0Var, int i, bpn0 bpn0Var, VoipFirstCallCacheComponent voipFirstCallCacheComponent, usw0 usw0Var) {
        xkg xkgVar = xkg.a;
        this.b = usw0Var;
        ed9 ed9Var = new ed9(yre0Var, vre0Var, i);
        this.c = ed9Var;
        Context context = e43.a;
        gtw0 gtw0Var = new gtw0(context == null ? null : context, ed9Var);
        this.d = gtw0Var;
        this.e = new png(gtw0Var, new bp9(new u1r0(), new vg20(), voipFirstCallCacheComponent.x8()), new com.vk.voip.ui.push.a(bpn0Var), new rd9());
    }

    @Override // xsna.afw0
    public final usw0 P() {
        return this.b;
    }

    @Override // xsna.afw0
    public final khw0 a() {
        return this.e;
    }

    @Override // xsna.afw0
    public final fhw0 b() {
        return this.d;
    }

    @Override // xsna.afw0
    public final void c() {
        SharedPreferences.Editor clear;
        x870 x870Var = x870.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        ca70 ca70Var = ca70.a;
        ca70.f(context).deleteNotificationChannel("caller_id_group");
        List<String> singletonList = Collections.singletonList("CALLER_ID_PREFS");
        Preference preference = Preference.a;
        for (String str : singletonList) {
            Preference preference2 = Preference.a;
            Preference$PreferenceUsingLogger$IOType preference$PreferenceUsingLogger$IOType = Preference$PreferenceUsingLogger$IOType.Write;
            preference2.getClass();
            Preference.i.getClass();
            SharedPreferences.Editor edit = Preference.f(str).edit();
            if (edit != null && (clear = edit.clear()) != null) {
                clear.commit();
            }
        }
        Preference.D(new jal(singletonList, 3), true);
    }

    @Override // xsna.afw0
    public final x9p d() {
        return new aap(0);
    }

    @Override // xsna.afw0
    public final cd9 e() {
        return this.c;
    }

    @Override // xsna.afw0
    public final boolean isCallActive() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.K0.h();
    }

    @Override // xsna.afw0
    public final boolean isHeadsetConnected() {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.a.a.getClass();
        return com.vk.voip.ui.a.e();
    }

    @Override // xsna.afw0
    public final boolean isIdle() {
        com.vk.voip.ui.c.b.getClass();
        return com.vk.voip.ui.c.K0 == VoipViewModelState.Idle;
    }
}
