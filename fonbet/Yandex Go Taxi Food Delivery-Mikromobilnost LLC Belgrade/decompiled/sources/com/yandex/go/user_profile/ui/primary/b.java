package com.yandex.go.user_profile.ui.primary;

import android.app.Activity;
import com.yandex.go.navigation.UserPhotoUploadingEntryPoint;
import defpackage.a60;
import defpackage.as21;
import defpackage.bgc;
import defpackage.el90;
import defpackage.hr21;
import defpackage.hxx;
import defpackage.idr0;
import defpackage.kff0;
import defpackage.m950;
import defpackage.pzt0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tje;
import defpackage.um3;
import defpackage.v5c0;
import defpackage.v770;
import defpackage.vul0;
import defpackage.w030;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.settings.profile.ProfileAnalyticsReporter$PreviousScreenIdentifier;
import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;

/* loaded from: classes14.dex */
public final class b implements kff0 {
    public pzt0 a;
    public final /* synthetic */ c b;

    public b(c cVar) {
        this.b = cVar;
    }

    @Override // defpackage.kff0
    public final void a() {
        c cVar = this.b;
        el90 el90Var = cVar.L;
        Activity activity = cVar.F;
        w030 w030Var = cVar.E;
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
        c cVar = this.b;
        cVar.L.a(cVar.F, ProfileAnalyticsReporter$PreviousScreenIdentifier.PROFILE_FRAGMENT, cVar.E);
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
        c cVar = this.b;
        el90 el90Var = cVar.L;
        Activity activity = cVar.F;
        ProfileAnalyticsReporter$PreviousScreenIdentifier profileAnalyticsReporter$PreviousScreenIdentifier = ProfileAnalyticsReporter$PreviousScreenIdentifier.PROFILE_FRAGMENT;
        w030 w030Var = cVar.E;
        as21 as21Var = el90Var.b;
        if (as21Var.a("DID_SHOW_NAME_INPUT_ONCE", false)) {
            return;
        }
        as21Var.e("DID_SHOW_NAME_INPUT_ONCE", true);
        el90Var.a(activity, profileAnalyticsReporter$PreviousScreenIdentifier, w030Var);
    }

    @Override // defpackage.kff0
    public final void f() {
        c cVar = this.b;
        cVar.L.a.E = new v5c0(12, cVar);
    }

    @Override // defpackage.kff0
    public final void g() {
        c cVar = this.b;
        cVar.A(cVar.M, new hr21(UserPhotoUploadingEntryPoint.PROFILE, false, 6), new vul0(new bgc(12), 1));
    }

    @Override // defpackage.kff0
    public final void h() {
        pzt0 pzt0Var = this.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c cVar = this.b;
        this.a = tje.N(cVar.o(), null, null, new ProfileRouter$InnerNavigator$showLogoutDialog$1(cVar, null), 3);
    }

    @Override // defpackage.kff0
    public final void i() {
        c cVar = this.b;
        cVar.E((m950) cVar.I.get(), idr0.a, sy60.Q2, hxx.a);
    }

    @Override // defpackage.kff0
    public final void openUrl(String str) {
        ((a60) this.b.G).c(str, v770.z);
    }
}
