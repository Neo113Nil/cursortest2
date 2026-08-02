package com.yandex.messaging.profile;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.kse;
import defpackage.lff0;
import defpackage.m120;
import defpackage.n8g;
import defpackage.nff0;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.w511;
import defpackage.ydf0;
import defpackage.zdf0;
import defpackage.zff0;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptySet;

/* loaded from: classes8.dex */
public final class c {
    public final ydf0 a;
    public final n8g b;
    public final zff0 c;
    public final nff0 d;
    public final lff0 e;
    public final m120 f;
    public final ike g;

    public c(ydf0 ydf0Var, n8g n8gVar, kse kseVar, zff0 zff0Var, nff0 nff0Var, lff0 lff0Var, m120 m120Var) {
        this.a = ydf0Var;
        this.b = n8gVar;
        this.c = zff0Var;
        this.d = nff0Var;
        this.e = lff0Var;
        this.f = m120Var;
        this.g = bvf0.a(kseVar.c.plus(jl40.a()));
    }

    public final qoh a(ProfileCreator$IdCreationType profileCreator$IdCreationType) {
        String string;
        tje.e();
        int i = zdf0.a[profileCreator$IdCreationType.ordinal()];
        if (i == 1) {
            string = this.d.a.getString("profile_default_id", null);
            if (string == null) {
                string = b();
            }
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            string = b();
        }
        ike ikeVar = this.g;
        kotlinx.coroutines.a.g(ikeVar.a, null);
        return tje.h(ikeVar, null, null, new ProfileCreator$createComponentAsync$1(this, string, null), 3);
    }

    public final String b() {
        Set<String> set;
        nff0 nff0Var = this.d;
        SharedPreferences sharedPreferences = nff0Var.a;
        SharedPreferences sharedPreferences2 = nff0Var.a;
        String string = sharedPreferences.getString("profile_default_id", null);
        if (string != null) {
            Set<String> stringSet = sharedPreferences2.getStringSet("prev_profile_ids", null);
            if (stringSet == null) {
                stringSet = EmptySet.a;
            }
            set = kotlin.collections.a.M0(stringSet);
            set.add(string);
        } else {
            set = null;
        }
        this.a.getClass();
        String uuid = UUID.randomUUID().toString();
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        edit.putString("profile_default_id", uuid);
        edit.apply();
        if (set != null) {
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            edit2.putStringSet("prev_profile_ids", set);
            edit2.apply();
        }
        MessengerEnvironment a = this.f.a();
        Context context = this.c.a;
        Locale locale = Locale.US;
        SharedPreferences sharedPreferences3 = context.getSharedPreferences("messenger_ui_".concat(uuid), 0);
        if (sharedPreferences3.contains(WebViewActivity.KEY_ENVIRONMENT)) {
            ny61.g("Profile with the given id is already exists, modification is forbidden.");
            return null;
        }
        SharedPreferences.Editor edit3 = sharedPreferences3.edit();
        edit3.putInt(WebViewActivity.KEY_ENVIRONMENT, a.ordinal());
        edit3.apply();
        return uuid;
    }
}
