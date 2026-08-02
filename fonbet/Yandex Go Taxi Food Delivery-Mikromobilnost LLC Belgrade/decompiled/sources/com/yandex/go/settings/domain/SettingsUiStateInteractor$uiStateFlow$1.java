package com.yandex.go.settings.domain;

import android.content.Context;
import com.yandex.go.settings.presentation.models.AppSettingsTransitionMode;
import com.yandex.go.settings.presentation.models.SettingsItemId;
import com.yandex.go.user_profile.main_menu.profile.repository.logout.presentation.MainMenuLogOutUiState;
import defpackage.a6t0;
import defpackage.as21;
import defpackage.au2;
import defpackage.avj0;
import defpackage.bms;
import defpackage.c531;
import defpackage.ceb1;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.e6b1;
import defpackage.gja1;
import defpackage.hbb1;
import defpackage.i5z;
import defpackage.iq2;
import defpackage.j5z;
import defpackage.jgb1;
import defpackage.keb1;
import defpackage.kyh0;
import defpackage.ldb1;
import defpackage.lgv;
import defpackage.lx2;
import defpackage.mdb1;
import defpackage.mx2;
import defpackage.n8z;
import defpackage.ner0;
import defpackage.nnm;
import defpackage.o8z;
import defpackage.oer0;
import defpackage.p3g0;
import defpackage.pkb1;
import defpackage.qqt0;
import defpackage.r8r0;
import defpackage.rya1;
import defpackage.s8r0;
import defpackage.scc;
import defpackage.t8r0;
import defpackage.tgb1;
import defpackage.u8r0;
import defpackage.uq90;
import defpackage.xeb1;
import defpackage.y7z;
import defpackage.yri0;
import defpackage.zuj0;
import defpackage.zwa1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class SettingsUiStateInteractor$uiStateFlow$1 extends AdaptedFunctionReference implements bms {
    /* JADX WARN: Removed duplicated region for block: B:57:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0a5b  */
    @Override // defpackage.bms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        n8z n8zVar;
        ArrayList arrayList;
        lx2 lx2Var;
        au2 au2Var;
        ArrayList arrayList2;
        List singletonList;
        List singletonList2;
        lx2 lx2Var2 = (lx2) obj;
        oer0 oer0Var = (oer0) obj2;
        AppSettingsTransitionMode appSettingsTransitionMode = (AppSettingsTransitionMode) obj3;
        b bVar = (b) this.receiver;
        as21 as21Var = bVar.f;
        qqt0 qqt0Var = bVar.g;
        zuj0 zuj0Var = bVar.c;
        ArrayList arrayList3 = new ArrayList();
        r8r0 r8r0Var = oer0Var.b;
        MainMenuLogOutUiState mainMenuLogOutUiState = oer0Var.f;
        p3g0 p3g0Var = oer0Var.d;
        ner0 ner0Var = oer0Var.i;
        if (r8r0Var.a) {
            SettingsItemId settingsItemId = SettingsItemId.THEME;
            avj0 avj0Var = (avj0) zuj0Var;
            String h = avj0Var.h(kyh0.settings_theme_switch);
            int i = oer0Var.b.b;
            String h2 = i != 0 ? avj0Var.h(i) : "";
            au2 au2Var2 = hbb1.a;
            if (au2Var2 == null) {
                lgv lgvVar = new lgv("Brush", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 e = nnm.e(18.3f, 1.03f);
                e.b(1.13f, 1.13f, false, true, 1.84f, 1.3f);
                e.h(13.48f, 14.9f);
                e.b(0.32f, 0.32f, false, true, -0.6f, -0.08f);
                e.b(3.24f, 3.24f, false, false, -3.06f, -2.53f);
                e.i(-0.76f, -0.02f);
                e.b(0.42f, 0.42f, false, true, -0.3f, -0.7f);
                e.c();
                e.j(8.0f, 14.0f);
                e.b(3.0f, 3.0f, false, true, 3.0f, 3.0f);
                e.b(5.0f, 5.0f, false, true, -5.0f, 5.0f);
                e.f(4.1f);
                e.e(-0.21f, 0.0f, -0.24f, -0.3f, -0.03f, -0.34f);
                e.b(1.0f, 1.0f, false, false, 0.83f, -0.95f);
                e.h(5.0f, 17.0f);
                e.b(3.0f, 3.0f, false, true, 3.0f, -3.0f);
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", e.a);
                au2Var2 = rya1.a(lgvVar.d(), true);
                hbb1.a = au2Var2;
            }
            arrayList3.add(new t8r0(settingsItemId, h, au2Var2, h2, 16));
        }
        SettingsItemId settingsItemId2 = SettingsItemId.LANGUAGE;
        avj0 avj0Var2 = (avj0) zuj0Var;
        String h3 = avj0Var2.h(kyh0.settings_lang);
        j5z j5zVar = bVar.d;
        i5z a = j5zVar.a.a();
        Context context = j5zVar.f;
        a.getClass();
        arrayList3.add(new t8r0(settingsItemId2, h3, pkb1.e(), context.getResources().getString(a.c), 16));
        qqt0Var.b.getClass();
        if (qqt0Var.c) {
            arrayList3.add(new u8r0(SettingsItemId.HAPTIC, avj0Var2.h(kyh0.settings_splash_haptic_option), keb1.c(), qqt0Var.a(), (String) null, 48));
        }
        if (bVar.a()) {
            arrayList3.add(new u8r0(SettingsItemId.HIDE_BALANCE, avj0Var2.h(kyh0.hide_yandex_bank_balance_title), gja1.b(), bVar.h.a(), avj0Var2.h(kyh0.hide_yandex_bank_balance_subtitle), 32));
        }
        n8z n8zVar2 = bVar.k;
        ArrayList arrayList4 = new ArrayList();
        SettingsItemId settingsItemId3 = SettingsItemId.TRAFFIC;
        String h4 = avj0Var2.h(kyh0.settings_traffic);
        au2 au2Var3 = xeb1.a;
        if (au2Var3 != null) {
            lx2Var = lx2Var2;
            n8zVar = n8zVar2;
            arrayList = arrayList3;
            au2Var = au2Var3;
        } else {
            lgv lgvVar2 = new lgv("CarGroup", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
            long j = iq2.g;
            a6t0 a6t0Var2 = new a6t0(j);
            uq90 uq90Var = new uq90();
            n8zVar = n8zVar2;
            arrayList = arrayList3;
            uq90Var.k(15.18f, 6.0f);
            uq90Var.i(0.46f, 1.42f);
            uq90Var.i(-0.62f, -0.02f);
            uq90Var.f(15.0f);
            lx2Var = lx2Var2;
            uq90Var.m(-2.15f, 0.0f, -4.26f, 0.47f);
            uq90Var.b(4.3f, 4.3f, false, false, -2.88f, 2.26f);
            uq90Var.p(0.02f);
            uq90Var.b(13.0f, 13.0f, false, false, -0.55f, 1.42f);
            uq90Var.i(-0.56f, 1.63f);
            uq90Var.f(5.5f);
            uq90Var.i(-0.7f, 1.4f);
            uq90Var.f(2.0f);
            uq90Var.o(9.95f);
            uq90Var.m(0.0f, -1.67f, 0.55f, -3.23f);
            uq90Var.e(0.39f, -1.2f, 0.94f, -2.8f, 1.09f, -3.1f);
            uq90Var.b(2.3f, 2.3f, false, true, 1.52f, -1.2f);
            uq90Var.l(7.06f, 2.02f, 9.0f, 2.0f);
            uq90Var.m(1.95f, 0.03f, 3.84f, 0.46f);
            uq90Var.b(2.2f, 2.2f, false, true, 1.52f, 1.2f);
            uq90Var.e(0.11f, 0.24f, 0.47f, 1.3f, 0.82f, 2.34f);
            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var2, null, "", uq90Var.a);
            a6t0 a6t0Var3 = new a6t0(j);
            uq90 uq90Var2 = new uq90();
            uq90Var2.k(21.48f, 14.3f);
            uq90Var2.i(-0.3f, -0.9f);
            uq90Var2.e(-0.35f, -1.04f, -0.7f, -2.1f, -0.82f, -2.34f);
            uq90Var2.b(2.2f, 2.2f, false, false, -1.52f, -1.2f);
            uq90Var2.m(-1.9f, -0.43f, -3.84f, -0.46f);
            uq90Var2.m(-1.94f, 0.0f, -3.84f, 0.43f);
            uq90Var2.b(2.3f, 2.3f, false, false, -1.52f, 1.2f);
            uq90Var2.e(-0.15f, 0.3f, -0.7f, 1.9f, -1.1f, 3.09f);
            uq90Var2.a(10.0f, 10.0f, false, false, 8.0f, 17.35f);
            uq90Var2.h(8.0f, 22.0f);
            uq90Var2.g(2.8f);
            uq90Var2.i(0.7f, -1.4f);
            uq90Var2.g(7.0f);
            uq90Var2.i(0.7f, 1.4f);
            uq90Var2.h(22.0f, 22.0f);
            uq90Var2.p(-4.58f);
            uq90Var2.m(0.0f, -1.6f, -0.52f, -3.12f);
            uq90Var2.k(-9.98f, -3.1f);
            uq90Var2.b(17.0f, 17.0f, false, true, 3.5f, -0.4f);
            uq90Var2.m(1.79f, 0.0f, 3.54f, 0.4f);
            uq90Var2.b(1.0f, 1.0f, false, true, 0.56f, 0.44f);
            uq90Var2.i(0.55f, 1.61f);
            uq90Var2.a(24.0f, 24.0f, false, false, 15.0f, 12.9f);
            uq90Var2.m(-2.35f, -0.06f, -4.67f, 0.36f);
            uq90Var2.i(0.56f, -1.6f);
            uq90Var2.b(1.0f, 1.0f, false, true, 0.61f, -0.47f);
            uq90Var2.k(7.0f, 4.5f);
            uq90Var2.b(1.4f, 1.4f, false, false, -1.4f, 1.4f);
            uq90Var2.g(3.04f);
            uq90Var2.b(4.0f, 4.0f, false, false, -0.24f, -1.4f);
            uq90Var2.c();
            uq90Var2.j(11.5f, 15.69f);
            uq90Var2.b(1.4f, 1.4f, false, true, 1.4f, 1.4f);
            uq90Var2.h(9.86f, 17.09f);
            uq90Var2.m(0.0f, -0.72f, 0.24f, -1.4f);
            uq90Var2.c();
            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var3, null, "", uq90Var2.a);
            au2 a2 = rya1.a(lgvVar2.d(), true);
            xeb1.a = a2;
            au2Var = a2;
        }
        arrayList4.add(new u8r0(settingsItemId3, h4, au2Var, as21Var.a("FIELD_TRAFFICS_ON", false), (String) null, 48));
        o8z o8zVar = (o8z) n8zVar;
        if (((y7z) o8zVar.a.b()).b) {
            arrayList4.add(new u8r0(SettingsItemId.LOCATION_DIAGNOSTIC, avj0Var2.h(kyh0.location_diagnostic_switch), yri0.d(), o8zVar.a(), (String) null, 48));
        }
        ArrayList arrayList5 = new ArrayList();
        if (ner0Var.a) {
            SettingsItemId settingsItemId4 = SettingsItemId.IN_APP_ONLY;
            String str = ner0Var.c;
            au2 au2Var4 = ldb1.a;
            if (au2Var4 != null) {
                arrayList2 = arrayList4;
            } else {
                lgv lgvVar3 = new lgv("Call", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                arrayList2 = arrayList4;
                a6t0 a6t0Var4 = new a6t0(iq2.g);
                uq90 e2 = nnm.e(2.14f, 18.0f);
                e2.e(1.0f, -1.48f, 3.5f, -2.98f, 5.7f, -3.49f);
                e2.i(2.29f, 2.05f);
                e2.b(11.0f, 11.0f, false, false, 4.33f, -2.76f);
                e2.b(11.0f, 11.0f, false, false, 2.76f, -4.3f);
                e2.i(-2.05f, -2.3f);
                e2.e(0.47f, -2.18f, 1.97f, -4.68f, 3.46f, -5.68f);
                e2.b(15.0f, 15.0f, false, true, 3.07f, 2.26f);
                e2.e(0.62f, 0.57f, 0.9f, 1.42f, 0.74f, 2.24f);
                e2.e(-0.7f, 3.79f, -2.79f, 7.4f, -5.56f, 10.23f);
                e2.b(19.4f, 19.4f, false, true, -10.25f, 5.58f);
                e2.b(2.5f, 2.5f, false, true, -2.21f, -0.74f);
                e2.a(16.0f, 16.0f, false, true, 2.14f, 18.0f);
                lgvVar3.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var4, null, "", e2.a);
                au2Var4 = rya1.a(lgvVar3.d(), true);
                ldb1.a = au2Var4;
            }
            arrayList5.add(new u8r0(settingsItemId4, str, au2Var4, ner0Var.b, (String) null, 16));
        } else {
            arrayList2 = arrayList4;
        }
        if (((cne0) bVar.e.b).f("show_sms_menu_settings")) {
            arrayList5.add(new u8r0(SettingsItemId.DONT_SMS, avj0Var2.h(kyh0.settings_sms_order_status), ceb1.c(), as21Var.a("FIELD_DONT_SMS", false), (String) null, 48));
        }
        boolean z = p3g0Var.b;
        EmptyList emptyList = EmptyList.a;
        if (!z) {
            SettingsItemId settingsItemId5 = SettingsItemId.PROMO_PUSHES;
            String h5 = avj0Var2.h(kyh0.settings_promo_pushes_title);
            String h6 = avj0Var2.h(kyh0.settings_promo_pushes_subtitle);
            au2 au2Var5 = zwa1.a;
            if (au2Var5 == null) {
                lgv lgvVar4 = new lgv("Sale", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i2 = c531.a;
                lgvVar4.a("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, emptyList);
                a6t0 a6t0Var5 = new a6t0(iq2.g);
                uq90 e3 = nnm.e(14.34f, 21.93f);
                e3.e(0.73f, -0.3f, 1.4f, -0.96f, 2.71f, -2.28f);
                e3.i(2.83f, -2.83f);
                e3.e(1.32f, -1.32f, 1.98f, -1.98f, 2.28f, -2.71f);
                e3.b(4.0f, 4.0f, false, false, 0.0f, -3.06f);
                e3.e(-0.3f, -0.74f, -0.96f, -1.4f, -2.28f, -2.71f);
                e3.i(-4.72f, -4.72f);
                e3.b(8.0f, 8.0f, false, false, -1.58f, -1.4f);
                e3.b(4.0f, 4.0f, false, false, -1.93f, -0.56f);
                e3.e(-0.5f, -0.01f, -1.03f, 0.1f, -2.08f, 0.35f);
                e3.i(-3.21f, 0.74f);
                e3.e(-0.89f, 0.2f, -1.33f, 0.3f, -1.7f, 0.51f);
                e3.a(3.0f, 3.0f, false, false, 3.5f, 4.43f);
                e3.e(-0.2f, 0.37f, -0.3f, 0.81f, -0.5f, 1.7f);
                e3.i(-0.75f, 3.2f);
                e3.b(9.0f, 9.0f, false, false, -0.35f, 2.1f);
                e3.b(4.0f, 4.0f, false, false, 0.55f, 1.92f);
                e3.e(0.26f, 0.44f, 0.64f, 0.82f, 1.4f, 1.58f);
                e3.i(4.73f, 4.72f);
                e3.e(1.31f, 1.32f, 1.97f, 1.98f, 2.7f, 2.28f);
                e3.b(4.0f, 4.0f, false, false, 3.07f, 0.0f);
                e3.j(9.27f, 6.21f);
                e3.b(2.0f, 2.0f, true, false, -2.83f, 2.83f);
                e3.b(2.0f, 2.0f, false, false, 2.83f, -2.83f);
                lgvVar4.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var5, null, "", e3.a);
                lgvVar4.e();
                au2Var5 = rya1.a(lgvVar4.d(), true);
                zwa1.a = au2Var5;
            }
            arrayList5.add(new u8r0(settingsItemId5, h5, au2Var5, as21Var.a("FIELD_DONT_SHOW_PROMO_PUSHES", false), h6, 32));
        }
        if (bVar.j.c().a) {
            arrayList5.add(new u8r0(SettingsItemId.LIVE_LOCATION, avj0Var2.h(kyh0.location_sharing_control_button), jgb1.e(), oer0Var.e, avj0Var2.h(kyh0.live_location_settings_details), true));
        }
        if (oer0Var.h) {
            SettingsItemId settingsItemId6 = SettingsItemId.DONT_CALL;
            String h7 = avj0Var2.h(kyh0.settings_dont_call);
            String h8 = avj0Var2.h(kyh0.settings_dont_call_subtitle);
            au2 au2Var6 = mdb1.a;
            if (au2Var6 == null) {
                lgv lgvVar5 = new lgv("CallOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var6 = new a6t0(iq2.g);
                uq90 uq90Var3 = new uq90();
                uq90Var3.k(16.95f, 15.8f);
                uq90Var3.i(-2.03f, -2.9f);
                uq90Var3.m(1.18f, -1.48f, 1.82f, -3.27f);
                uq90Var3.i(-2.05f, -2.29f);
                uq90Var3.e(0.47f, -2.19f, 1.97f, -4.69f, 3.45f, -5.69f);
                uq90Var3.e(0.98f, 0.5f, 2.14f, 1.38f, 3.08f, 2.26f);
                uq90Var3.e(0.61f, 0.57f, 0.9f, 1.42f, 0.74f, 2.24f);
                uq90Var3.b(20.0f, 20.0f, false, true, -5.0f, 9.64f);
                uq90Var3.k(-15.3f, 2.34f);
                uq90Var3.e(1.0f, -1.48f, 3.5f, -2.98f, 5.7f, -3.48f);
                uq90Var3.i(2.28f, 2.04f);
                uq90Var3.m(1.56f, -0.55f, 2.88f, -1.5f);
                uq90Var3.h(4.0f, 3.0f);
                uq90Var3.g(2.5f);
                uq90Var3.i(14.0f, 20.0f);
                uq90Var3.f(18.0f);
                uq90Var3.i(-3.46f, -4.95f);
                uq90Var3.b(19.0f, 19.0f, false, true, -8.39f, 3.9f);
                uq90Var3.b(2.5f, 2.5f, false, true, -2.21f, -0.74f);
                uq90Var3.b(16.0f, 16.0f, false, true, -2.28f, -3.09f);
                lgvVar5.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var6, null, "", uq90Var3.a);
                au2Var6 = rya1.a(lgvVar5.d(), true);
                mdb1.a = au2Var6;
            }
            arrayList5.add(new u8r0(settingsItemId6, h7, au2Var6, as21Var.a("FIELD_DONT_CALL", false), h8, 32));
        }
        if (p3g0Var.b) {
            if (oer0Var.j) {
                String Y = d6z.Y(p3g0Var, "app_settings_notification_title");
                if (Y.length() != 0) {
                    singletonList = Collections.singletonList(new t8r0(SettingsItemId.NOTIFICATIONS, Y, e6b1.a(), null, 24));
                }
            } else {
                String Y2 = d6z.Y(p3g0Var, "app_settings_disabled_notification_title");
                if (Y2.length() != 0) {
                    singletonList = Collections.singletonList(new t8r0(SettingsItemId.NOTIFICATIONS, Y2, e6b1.a(), d6z.Y(p3g0Var, "app_settings_disabled_notification_subtitle"), 16));
                }
            }
            if (mainMenuLogOutUiState != MainMenuLogOutUiState.NONE) {
                singletonList2 = emptyList;
            } else {
                SettingsItemId settingsItemId7 = SettingsItemId.LOGOUT;
                String h9 = avj0Var2.h(kyh0.profile_exit);
                String str2 = oer0Var.g;
                au2 au2Var7 = tgb1.a;
                if (au2Var7 == null) {
                    lgv lgvVar6 = new lgv("Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                    long j2 = iq2.g;
                    a6t0 a6t0Var7 = new a6t0(j2);
                    uq90 uq90Var4 = new uq90();
                    uq90Var4.j(5.0f, 16.0f);
                    uq90Var4.o(8.0f);
                    uq90Var4.e(0.0f, -0.96f, 0.0f, -1.58f, 0.03f, -2.05f);
                    uq90Var4.n(0.09f, -0.63f, 0.12f, -0.72f);
                    uq90Var4.b(2.0f, 2.0f, false, true, 1.08f, -1.08f);
                    uq90Var4.e(0.09f, -0.03f, 0.26f, -0.09f, 0.72f, -0.12f);
                    uq90Var4.d(7.42f, 4.0f, 8.05f, 4.0f, 9.0f, 4.0f);
                    uq90Var4.g(5.0f);
                    uq90Var4.o(2.0f);
                    uq90Var4.f(9.0f);
                    uq90Var4.e(-1.86f, 0.0f, -2.8f, 0.0f, -3.53f, 0.3f);
                    uq90Var4.a(4.0f, 4.0f, false, false, 3.3f, 4.47f);
                    uq90Var4.d(3.0f, 5.2f, 3.0f, 6.14f, 3.0f, 8.0f);
                    uq90Var4.p(8.0f);
                    uq90Var4.e(0.0f, 1.86f, 0.0f, 2.8f, 0.3f, 3.53f);
                    uq90Var4.b(4.0f, 4.0f, false, false, 2.17f, 2.17f);
                    uq90Var4.e(0.73f, 0.3f, 1.67f, 0.3f, 3.53f, 0.3f);
                    uq90Var4.g(5.0f);
                    uq90Var4.p(-2.0f);
                    uq90Var4.f(9.0f);
                    uq90Var4.e(-0.96f, 0.0f, -1.58f, 0.0f, -2.05f, -0.03f);
                    uq90Var4.b(2.0f, 2.0f, false, true, -0.72f, -0.12f);
                    uq90Var4.b(2.0f, 2.0f, false, true, -1.08f, -1.08f);
                    uq90Var4.b(2.0f, 2.0f, false, true, -0.12f, -0.72f);
                    uq90Var4.d(5.0f, 17.58f, 5.0f, 16.95f, 5.0f, 16.0f);
                    lgvVar6.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var7, null, "", uq90Var4.a);
                    a6t0 a6t0Var8 = new a6t0(j2);
                    uq90 uq90Var5 = new uq90();
                    uq90Var5.k(15.88f, 8.7f);
                    uq90Var5.i(1.41f, -1.4f);
                    uq90Var5.h(22.0f, 12.0f);
                    uq90Var5.i(-4.7f, 4.7f);
                    uq90Var5.i(-1.42f, -1.4f);
                    uq90Var5.i(2.3f, -2.3f);
                    uq90Var5.f(8.96f);
                    uq90Var5.p(-2.0f);
                    uq90Var5.g(9.2f);
                    uq90Var5.c();
                    lgvVar6.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var8, null, "", uq90Var5.a);
                    au2Var7 = rya1.a(lgvVar6.d(), true);
                    tgb1.a = au2Var7;
                }
                singletonList2 = Collections.singletonList(new s8r0(settingsItemId7, h9, au2Var7, str2, mainMenuLogOutUiState == MainMenuLogOutUiState.ENABLED));
            }
            List g = scc.g(emptyList, arrayList, arrayList2, arrayList5, singletonList, singletonList2);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : g) {
                if (!((List) obj5).isEmpty()) {
                    arrayList6.add(obj5);
                }
            }
            return new mx2(appSettingsTransitionMode, arrayList6, lx2Var);
        }
        singletonList = emptyList;
        if (mainMenuLogOutUiState != MainMenuLogOutUiState.NONE) {
        }
        List g2 = scc.g(emptyList, arrayList, arrayList2, arrayList5, singletonList, singletonList2);
        ArrayList arrayList62 = new ArrayList();
        while (r0.hasNext()) {
        }
        return new mx2(appSettingsTransitionMode, arrayList62, lx2Var);
    }
}
