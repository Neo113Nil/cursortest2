package com.yandex.go.user_profile.ui.am;

import android.app.Activity;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import defpackage.a60;
import defpackage.as21;
import defpackage.bgc;
import defpackage.el90;
import defpackage.g191;
import defpackage.hr21;
import defpackage.hxx;
import defpackage.idr0;
import defpackage.kff0;
import defpackage.m950;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.um3;
import defpackage.v770;
import defpackage.vul0;
import defpackage.w030;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;

/* loaded from: classes14.dex */
public final class p implements kff0 {
    public pzt0 a;
    public final /* synthetic */ s b;

    public p(s sVar) {
        this.b = sVar;
    }

    @Override // defpackage.kff0
    public final void a() {
        s sVar = this.b;
        el90 el90Var = sVar.L;
        Activity activity = sVar.G;
        w030 w030Var = sVar.F;
        if (el90Var.f) {
            return;
        }
        PassengerNameEditorModalView passengerNameEditorModalView = new PassengerNameEditorModalView(activity, el90Var.a, el90Var.d);
        passengerNameEditorModalView.setOnAppearingListener(el90Var.e);
        w030Var.s(passengerNameEditorModalView, true);
    }

    @Override // defpackage.kff0
    public final void b() {
        this.b.K.a(new um3(Events$Zalogin$LoginContext.PROFILE, null, false, false, 30), false);
    }

    @Override // defpackage.kff0
    public final void c() {
        s sVar = this.b;
        sVar.L.a(sVar.G, ProfileAnalyticsReporter$PreviousScreenIdentifier.PROFILE_FRAGMENT, sVar.F);
    }

    @Override // defpackage.kff0
    public final void close() {
        this.b.r(new qu(9));
    }

    @Override // defpackage.kff0
    public final void d() {
        this.b.N.a();
    }

    @Override // defpackage.kff0
    public final void e() {
        s sVar = this.b;
        el90 el90Var = sVar.L;
        Activity activity = sVar.G;
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = ProfileAnalyticsReporter$PreviousScreenIdentifier.PROFILE_FRAGMENT;
        w030 w030Var = sVar.F;
        as21 as21Var = el90Var.b;
        if (as21Var.a("DID_SHOW_NAME_INPUT_ONCE", false)) {
            return;
        }
        as21Var.e("DID_SHOW_NAME_INPUT_ONCE", true);
        el90Var.a(activity, profileAnalyticsReporter$PreviousScreenIdentifier, w030Var);
    }

    @Override // defpackage.kff0
    public final void f() {
        s sVar = this.b;
        sVar.L.a.E = new g191(sVar);
    }

    @Override // defpackage.kff0
    public final void g() {
        s sVar = this.b;
        sVar.A(sVar.M, new hr21(UserPhotoUploadingEntryPoint.PROFILE, false, 6), new vul0(new bgc(12), 1));
    }

    @Override // defpackage.kff0
    public final void h() {
        pzt0 pzt0Var = this.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        s sVar = this.b;
        this.a = com.yandex.go.coroutines.b.g(sVar.o(), null, null, new AmProfileRouter$InnerNavigator$showLogoutDialog$1(sVar, null), 3);
    }

    @Override // defpackage.kff0
    public final void i() {
        s sVar = this.b;
        sVar.E((m950) sVar.I.get(), idr0.a, sy60.Q2, hxx.a);
    }

    @Override // defpackage.kff0
    public final void openUrl(String str) {
        ((a60) this.b.H).c(str, v770.z);
    }
}
