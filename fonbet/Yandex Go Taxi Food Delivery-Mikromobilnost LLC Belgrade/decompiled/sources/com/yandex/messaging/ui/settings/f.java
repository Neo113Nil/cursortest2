package com.yandex.messaging.ui.settings;

import android.content.SharedPreferences;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.v;
import defpackage.bvf0;
import defpackage.clb1;
import defpackage.di9;
import defpackage.ds31;
import defpackage.efr0;
import defpackage.gci0;
import defpackage.j420;
import defpackage.jn3;
import defpackage.jqr;
import defpackage.k020;
import defpackage.lqo;
import defpackage.me0;
import defpackage.me60;
import defpackage.oyh0;
import defpackage.pdr0;
import defpackage.qdr0;
import defpackage.rcy0;
import defpackage.reu;
import defpackage.rz10;
import defpackage.sb2;
import defpackage.sk7;
import defpackage.tje;
import defpackage.tz10;
import defpackage.w5t;
import defpackage.wrr;
import defpackage.x22;
import defpackage.yr31;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class f extends yr31 {
    public final com.yandex.messaging.domain.statuses.c A;
    public final me0 B;
    public final x22 C;
    public final reu D;
    public final rcy0 E;
    public final sk7 F;
    public final r0 G;
    public final gci0 H;
    public final kotlinx.coroutines.channels.a I;
    public final boolean J;
    public final SharedPreferences b;
    public final MessengerEnvironment c;
    public final lqo w;
    public final wrr x;
    public final jn3 y;
    public final v z;

    public f(SharedPreferences sharedPreferences, MessengerEnvironment messengerEnvironment, rz10 rz10Var, lqo lqoVar, j420 j420Var, wrr wrrVar, jn3 jn3Var, v vVar, w5t w5tVar, com.yandex.messaging.domain.statuses.c cVar, me0 me0Var, x22 x22Var, reu reuVar, rcy0 rcy0Var, sk7 sk7Var) {
        boolean z;
        Object value;
        Object value2;
        this.b = sharedPreferences;
        this.c = messengerEnvironment;
        this.w = lqoVar;
        this.x = wrrVar;
        this.y = jn3Var;
        this.z = vVar;
        this.A = cVar;
        this.B = me0Var;
        this.C = x22Var;
        this.D = reuVar;
        this.E = rcy0Var;
        this.F = sk7Var;
        boolean z2 = sharedPreferences.getBoolean("compact_chat_list_mode_on", false);
        boolean a = lqoVar.a(tz10.O);
        boolean booleanValue = ((Boolean) messengerEnvironment.c(new me60())).booleanValue();
        boolean z3 = false;
        boolean z4 = this.J;
        rz10Var.i.getClass();
        if (lqoVar.a(tz10.k) && lqoVar.a(tz10.A)) {
            z = false;
            z3 = true;
        } else {
            z = false;
        }
        int i = rcy0Var.w ? oyh0.unauthorized_support_button : clb1.d(messengerEnvironment) ? oyh0.profile_feedback_button_text : oyh0.profile_ask_question_button_text;
        boolean z5 = (!((k020) wrrVar.x).v() ? "4de3dd08-46fb-9d1b-6e6a-87ee9f390e3f" : null) == null ? z : true;
        boolean z6 = rcy0Var.w;
        boolean z7 = z;
        r0 c = bvf0.c(new pdr0(z2, a, booleanValue, z4, z3, i, z5, false, false, z6, z6, null, null, null, false, false));
        this.G = c;
        this.H = kotlinx.coroutines.flow.e.d(c);
        kotlinx.coroutines.channels.a a2 = sb2.a(z7 ? 1 : 0, null, null, 7);
        this.I = a2;
        new di9(a2);
        ((Boolean) j420Var.e.getValue()).getClass();
        this.J = z7;
        com.yandex.messaging.internal.suspend.a.b(jn3Var.d(new qdr0(this)), ds31.a(this));
        boolean a3 = lqoVar.a(tz10.L);
        zy11 zy11Var = zy11.a;
        if (a3) {
            kotlinx.coroutines.flow.e.H(ds31.a(this), new m0(vVar.a(zy11Var), w5tVar.a(zy11Var), new SettingsScreenViewModel$observeOrganizationRights$1(this, null)));
        } else {
            do {
                value = c.getValue();
            } while (!c.k(value, pdr0.a((pdr0) value, false, false, false, false, null, null, null, true, false, 393215)));
        }
        if (this.w.a(tz10.M)) {
            kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(this.z.a(zy11Var), new SettingsScreenViewModel$setupInviteLinkVisibility$1(this, null), 3));
        } else {
            r0 r0Var = this.G;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, pdr0.a((pdr0) value2, false, false, false, false, null, null, null, false, false, 523263)));
        }
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(this.A.a(zy11Var), new SettingsScreenViewModel$observePersonalStatus$1(this, null), 3));
        if (this.E.w) {
            kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(this.z.a(zy11Var), new SettingsScreenViewModel$observePhoneNumber$1(this, null), 3));
        }
        this.C.reportEvent("settings_open");
    }

    public static final void W(f fVar, boolean z, boolean z2) {
        r0 r0Var = fVar.G;
        while (true) {
            Object value = r0Var.getValue();
            boolean z3 = z;
            if (r0Var.k(value, pdr0.a((pdr0) value, false, !z && fVar.J, z3, false, null, null, null, false, false, 523767))) {
                break;
            } else {
                z = z3;
            }
        }
        while (true) {
            Object value2 = r0Var.getValue();
            boolean z4 = z2;
            if (r0Var.k(value2, pdr0.a((pdr0) value2, false, false, false, false, null, null, null, false, z4, 262143))) {
                return;
            } else {
                z2 = z4;
            }
        }
    }

    public final void X(efr0 efr0Var) {
        tje.N(ds31.a(this), null, null, new SettingsScreenViewModel$sendEvent$1(this, efr0Var, null), 3);
    }
}
